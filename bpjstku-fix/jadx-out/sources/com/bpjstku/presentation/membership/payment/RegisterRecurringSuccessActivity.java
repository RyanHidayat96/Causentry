package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityRegisterRecurringSuccessBinding;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_face.zznv;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.TargetAspectRatio;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onBackPressedDispatcher_delegatelambda010;
import defpackage.onScroll;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\rR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0012\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterRecurringSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegisterRecurringSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "(Ljava/lang/String;)V", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LListPopupWindow2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterRecurringSuccessActivity extends BindingBaseActivity<ActivityRegisterRecurringSuccessBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] b;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: hasVoiceSearch
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            return (CustomerObject) RegisterRecurringSuccessActivity.TuitionPaymentFragmentbindingInflater1(zznv.b(), 62461826, zznv.b(), zznv.b(), -62461824, zznv.b(), objArr);
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -1, 15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 163;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5 | i);
        int i9 = (~((~i) | i5)) | (~(i5 | i2));
        int i10 = i5 + i2 + i4 + (32217706 * i3) + (238734613 * i6);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i5) - 528416768) + (677943110 * i2) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i3) + ((-131989504) * i6) + ((-1876361216) * i11);
        int i13 = ((i5 * 1127137324) - 440746823) + (i2 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i4 * 1127136485) + (i3 * 976419026) + (i6 * 1106960329) + (i11 * 279773184);
        int i14 = i12 + (i13 * i13 * (-1943076864));
        if (i14 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i14 != 2) {
            return b(objArr);
        }
        RegisterRecurringSuccessActivity registerRecurringSuccessActivity = (RegisterRecurringSuccessActivity) objArr[0];
        int i15 = 2 % 2;
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        g = i16 % 128;
        int i17 = i16 % 2;
        Parcelable parcelableExtra = registerRecurringSuccessActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i18 = g + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
        int i19 = i18 % 2;
        return customerObject;
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = 98 - (s2 * 14);
        int i3 = 145 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4 + i3;
            i3++;
            i2 = i6 - 11;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + bArr[i3]) - 11;
            i5 = i7;
        }
    }

    public RegisterRecurringSuccessActivity() {
        final RegisterRecurringSuccessActivity registerRecurringSuccessActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = registerRecurringSuccessActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterRecurringSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegisterRecurringSuccessActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        RegisterRecurringSuccessActivity$bindingInflater$1 registerRecurringSuccessActivity$bindingInflater$1 = RegisterRecurringSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = g + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return registerRecurringSuccessActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityRegisterRecurringSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnRegRecurringSuccess;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getDecoratedHint
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegisterRecurringSuccessActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).onTransact.observe(this, new Observer() { // from class: getPreferredHeight
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        CustomerObject customerObject;
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        g = i2 % 128;
        int i3 = i2 % 2;
        CustomerObject customerObject2 = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        String str3 = null;
        if (Intrinsics.areEqual(customerObject2 != null ? customerObject2.cancelAll : null, "MANDIRI")) {
            TextView textView = ((ActivityRegisterRecurringSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvInfoRecurringMonthly;
            customerObject = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (customerObject != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                g = i4 % 128;
                int i5 = i4 % 2;
                str3 = customerObject.cancelAll;
            }
            StringBuilder sb = new StringBuilder("Pembayaran Tagihan Iuran Jamian Sosial Ketenagakerjaan akan dibayarkan secara auto debit setiap bulannya sesuai dengan kartu debit ");
            sb.append(str3);
            sb.append(" yang telah didaftarkan");
            textView.setText(sb.toString());
        } else {
            CustomerObject customerObject3 = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (customerObject3 != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                g = i6 % 128;
                if (i6 % 2 == 0) {
                    String str4 = customerObject3.cancelAll;
                    throw null;
                }
                str = customerObject3.cancelAll;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "BRI")) {
                TextView textView2 = ((ActivityRegisterRecurringSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvInfoRecurringMonthly;
                customerObject = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (customerObject != null) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                    g = i7 % 128;
                    int i8 = i7 % 2;
                    str3 = customerObject.cancelAll;
                }
                StringBuilder sb2 = new StringBuilder("Pembayaran Tagihan Iuran Jamian Sosial Ketenagakerjaan akan dibayarkan secara auto debit setiap bulannya sesuai dengan kartu debit ");
                sb2.append(str3);
                sb2.append(" yang telah didaftarkan");
                textView2.setText(sb2.toString());
            } else {
                CustomerObject customerObject4 = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (customerObject4 != null) {
                    int i9 = g + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    str2 = customerObject4.cancelAll;
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(str2, "BNI")) {
                    TextView textView3 = ((ActivityRegisterRecurringSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvInfoRecurringMonthly;
                    customerObject = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if (customerObject != null) {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                        g = i11 % 128;
                        int i12 = i11 % 2;
                        str3 = customerObject.cancelAll;
                    }
                    StringBuilder sb3 = new StringBuilder("Pembayaran Tagihan Iuran Jamian Sosial Ketenagakerjaan akan dibayarkan secara auto debit setiap bulannya sesuai dengan kartu debit ");
                    sb3.append(str3);
                    sb3.append(" yang telah didaftarkan");
                    textView3.setText(sb3.toString());
                } else {
                    TextView textView4 = ((ActivityRegisterRecurringSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvInfoRecurringMonthly;
                    CustomerObject customerObject5 = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if (customerObject5 != null) {
                        int i13 = g + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                        if (i13 % 2 != 0) {
                            String str5 = customerObject5.cancelAll;
                            throw null;
                        }
                        str3 = customerObject5.cancelAll;
                    }
                    StringBuilder sb4 = new StringBuilder("Pembayaran Tagihan Iuran Jamian Sosial Ketenagakerjaan akan dibayarkan secara auto debit setiap bulannya sesuai dengan ewallet ");
                    sb4.append(str3);
                    sb4.append(" yang telah didaftarkan");
                    textView4.setText(sb4.toString());
                }
            }
        }
        CustomerObject customerObject6 = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (customerObject6 != null) {
            int i14 = g + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 86 / 0;
                if (Intrinsics.areEqual(customerObject6.setInternalConnectionCallback, Boolean.TRUE)) {
                    int i16 = g + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                    int i17 = i16 % 2;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_auto_debit_sertakan_deeplink");
                }
            } else if (Intrinsics.areEqual(customerObject6.setInternalConnectionCallback, Boolean.TRUE)) {
                int i18 = g + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                int i19 = i18 % 2;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_auto_debit_sertakan_deeplink");
            }
            if (!Intrinsics.areEqual(customerObject6.onConnectionSuspended, Boolean.TRUE)) {
                return;
            }
            int i20 = g + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_auto_debit_bpu_deeplink");
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            g = i22 % 128;
            int i23 = i22 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 com.bpjstku.presentation.tuition.model.CustomerObject) = 
  (r1v6 com.bpjstku.presentation.tuition.model.CustomerObject)
  (r1v19 com.bpjstku.presentation.tuition.model.CustomerObject)
 binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        CustomerObject customerObject;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        String str = null;
        if (i3 % 2 != 0) {
            customerObject = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            int i4 = 40 / 0;
            if (customerObject != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                g = i % 128;
                if (i % 2 != 0) {
                    String str2 = customerObject.a;
                    throw null;
                }
                str = customerObject.a;
                int i5 = g + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            customerObject = (CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (customerObject != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                g = i % 128;
                if (i % 2 != 0) {
                    String str3 = customerObject.a;
                    throw null;
                }
                str = customerObject.a;
                int i7 = g + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        String strValueOf = String.valueOf(str);
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("user_id", strValueOf));
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, mapMutableMapOf);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((short) 141, bArr[7], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, i4, iArgb, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 11, 2}, true, null, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int iRgb = Color.rgb(0, 0, 0) + 16778247;
            int iGreen = 15 - Color.green(0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((short) 89, bArr2[7], bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, iRgb, iGreen, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int mirror = AndroidCharacter.getMirror('0') - '!';
                Object[] objArr6 = new Object[1];
                c((short) 37, (byte) 52, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, pressedStateDuration, mirror, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp) | 166426048);
            int i8 = ((((155713600 | i7) * (-374)) - 1359863831) + ((i7 | 10712448) * 374)) - 182711476;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
            int i11 = g + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 43, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 115, 15}, true, new byte[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1963577823};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46086 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1134, TextUtils.indexOf("", "", 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -182711476, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int size = 1031 - View.MeasureSpec.getSize(0);
                    int i13 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((short) 141, bArr3[7], bArr3[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, size, i13, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.indexOf("", "")), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                    Object[] objArr13 = new Object[1];
                    c((short) 37, (byte) 52, $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, touchSlop, edgeSlop, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{0, 22, 11, 2}, true, null, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
                        int i14 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((short) 89, bArr4[7], bArr4[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, deadChar, i14, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cGreen = (char) Color.green(0);
                        int i15 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int pressedStateDuration2 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((short) 141, bArr5[7], bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen, i15, pressedStateDuration2, 1357589585, false, (String) objArr17[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i22 = i18 + (((~((-694903574) | i21)) * 521) - 691143828) + (((~((~i21) | (-694903574))) | (-1006368704)) * 521);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i25 = 0;
                while (i25 < strArr3.length) {
                    int i26 = g + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                    if (i26 % 2 != 0) {
                        arrayList.add(strArr3[i25]);
                        i25 += 21;
                    } else {
                        arrayList.add(strArr3[i25]);
                        i25++;
                    }
                }
            }
            int[] iArr = new int[i17];
            int i27 = i17 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i27) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i32 = i28 + (((~((-674103809) | i31)) * 521) - 793990036) + (((~((~i31) | (-674103809))) | (-968884139)) * 521);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr19[2])[0] = i34 ^ (i34 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
            byte[] bArr6 = $$a;
            Object[] objArr20 = new Object[1];
            c((short) 37, bArr6[3], bArr6[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, packedPositionType, iKeyCodeFromString, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i35 = g + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
            int i36 = i35 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                byte[] bArr7 = $$a;
                Object[] objArr21 = new Object[1];
                c((short) 89, bArr7[7], bArr7[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionGroup, minimumFlingVelocity, jumpTapTimeout, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i38 = (-1661391868) + (((~((~i37) | 90358531)) | (-393139008)) * (-245));
            int i39 = ~(i37 | 90358531);
            int i40 = i38 + (i39 * (-245)) + ((i39 | 302960957) * 245) + 1955841150;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{37, 16, 43, 0}, true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{53, 16, 115, 15}, true, new byte[]{1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1963577823};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42049), KeyEvent.getDeadChar(0, 0) + 1726, 29 - View.combineMeasuredStates(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1955841150, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                int mirror2 = 1803 - AndroidCharacter.getMirror('0');
                int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr8 = $$a;
                Object[] objArr26 = new Object[1];
                c((short) 89, bArr8[7], bArr8[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMakeMeasureSpec, mirror2, absoluteGravity, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{0, 22, 11, 2}, true, null, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                    int iRgb2 = Color.rgb(0, 0, 0) + 16778971;
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 23;
                    byte[] bArr9 = $$a;
                    short s = bArr9[7];
                    Object[] objArr29 = new Object[1];
                    c(s, (byte) s, bArr9[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mode, iRgb2, deadChar2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                    int iResolveSize = View.resolveSize(0, 0) + 1755;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 37, bArr10[3], bArr10[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode, iResolveSize, iMakeMeasureSpec, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i43 = g + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43 % 128;
                int i44 = i43 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$7879113[0])[0] != ((int[]) objArrB$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$7879113[4];
            if (strArr5 == null) {
                throw null;
            }
            int i45 = g + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
            int i46 = i45 % 2;
            for (String str : strArr5) {
                arrayList2.add(str);
            }
            throw null;
        }
        int i47 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i48 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i49 = (~((-97863158) | i48)) | 81018948;
        int i50 = ~i48;
        int i51 = i47 + 859711227 + ((i49 | (~(131583477 | i50))) * 886) + (((~(i50 | 97863157)) | 114739268) * (-1772)) + ((~(i50 | 114739268)) * 886);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr31[3])[0] = i53 ^ (i53 << 5);
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int iResolveOpacity = 1270 - Drawable.resolveOpacity(i2, i2);
                        int bitsPerPixel = 17 - ImageFormat.getBitsPerPixel(i2);
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveOpacity, bitsPerPixel, 407021364, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    int i9 = $10 + 25;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 / 2;
                    }
                    i2 = 0;
                    i4 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i11 = $10 + 117;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 3225 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0) + 13, 2133916302, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 387247676, false, $$i(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 41241), 1705 - ((Process.getThreadPriority(0) + 20) >> 6), 21 - (Process.myTid() >> 22), -1434471773, false, $$i(b8, (byte) (b8 | 6), b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
            int i16 = $11 + 39;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            int i18 = 0;
            while (true) {
                setvideostabilizationmode.b = i18;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i19 = $10 + 47;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i18 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i21 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i21;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i22 = $11 + 67;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] * iArr[4]);
                        setvideostabilizationmode.b %= 0;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i21 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -542677684
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.g
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r11)
            int r5 = ~r4
            r6 = -204179033(0xfffffffff3d479a7, float:-3.366804E31)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 203423752(0xc200008, float:1.2325961E-31)
            r6 = r6 | r7
            r7 = 1034921855(0x3dafa77f, float:0.08576869)
            r4 = r4 | r7
            int r4 = ~r4
            r6 = r6 | r4
            int r6 = r6 * (-713)
            r7 = 1642135280(0x61e0fef0, float:5.188051E20)
            int r7 = r7 + r6
            int r4 = r4 * 1426
            int r7 = r7 + r4
            r4 = 1034166575(0x3da4212f, float:0.08014142)
            r4 = r4 | r5
            int r4 = ~r4
            int r4 = r4 * 713
            int r7 = r7 + r4
            r4 = -1
            r5 = 1
            if (r1 == r7) goto L61
            int r1 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.g
            int r1 = r1 + 97
            int r6 = r1 % 128
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r1 = r1 % r0
            r1 = -542677684(0xffffffffdfa7654c, float:-2.4124261E19)
            int[] r1 = new int[r1]
            r6 = -542677685(0xffffffffdfa7654b, float:-2.412426E19)
            r1[r6] = r5
            r6 = -644503228(0xffffffffd995a944, float:-5.265735E15)
            int r6 = r6 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        L61:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r11)
            int r6 = ~r2
            r7 = -760052277(0xffffffffd2b285cb, float:-3.8337443E11)
            r8 = r7 | r6
            int r8 = ~r8
            r9 = -1819003689(0xffffffff939434d7, float:-3.7412557E-27)
            r9 = r9 | r2
            int r9 = ~r9
            r8 = r8 | r9
            int r8 = r8 * 1150
            r10 = 1385593784(0x52967bb8, float:3.2316038E11)
            int r10 = r10 + r8
            r8 = 1819003688(0x6c6bcb28, float:1.1402278E27)
            r8 = r8 | r6
            int r8 = ~r8
            r8 = r8 | r9
            int r8 = r8 * (-575)
            int r10 = r10 + r8
            r2 = r2 | r7
            int r2 = ~r2
            r7 = 760052276(0x2d4d7a34, float:1.1680035E-11)
            r6 = r6 | r7
            int r6 = ~r6
            r2 = r2 | r6
            int r2 = r2 * 575
            int r10 = r10 + r2
            if (r1 == r10) goto Lb8
            r1 = 636223216(0x25ebfef0, float:4.0938754E-16)
            int[] r1 = new int[r1]
            r2 = 636223215(0x25ebfeef, float:4.0938751E-16)
            r1[r2] = r5
            r2 = 1150624272(0x44952210, float:1193.0645)
            int r2 = r2 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            int r1 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.g = r2
            int r1 = r1 % r0
        Lb8:
            super.onResume()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iNextInt = new Random().nextInt(1946944864);
        int i3 = ~iNextInt;
        if (i2 != 1433931772 + (((~(1786289373 | i3)) | (~((-956301831) | iNextInt))) * 210) + (((~(iNextInt | 2071502559)) | (~(i3 | (-671088645)))) * 210)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            g = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[1169872050];
            iArr[1169872049] = 1;
            int i6 = 1906603794 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            g = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i10 = ~((-33704038) | iMyUid);
        int i11 = ~iMyUid;
        if (i9 != 669516476 + ((i10 | (~(i11 | 1783328623))) * 920) + (((~((-33713256) | i11)) | 33704037) * 920) + (((~(iMyUid | 1783328623)) | (~((-33704038) | i11)) | (~((-9219) | iMyUid))) * 920)) {
            throw null;
        }
        super.onStart();
        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        g = i12 % 128;
        int i13 = i12 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        RegisterRecurringSuccessActivity registerRecurringSuccessActivity = (RegisterRecurringSuccessActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = g + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iNextInt = new Random().nextInt(1350460081);
        int i5 = ~(1259143377 | iNextInt);
        int i6 = ~iNextInt;
        int i7 = i5 | (~(429155834 | i6));
        int i8 = ~((-1259143378) | i6);
        if (i4 != (-114019848) + ((i7 | i8) * (-516)) + (((~(iNextInt | (-277898539))) | (~((-151257297) | i6))) * 516) + ((151257296 | i8) * 516)) {
            throw null;
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt2 = new Random().nextInt();
        int i10 = ~iNextInt2;
        if (i9 != 1503197106 + (((~((-874305210) | i10)) | (-1704750756)) * (-865)) + ((~(iNextInt2 | 874305209)) * 865) + (((~((-1704750756) | i10)) | (~(i10 | 874305209))) * 865)) {
            int i11 = 979567246 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i12 = g + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(RegisterRecurringSuccessActivity registerRecurringSuccessActivity, View view) {
        String str;
        int i = 2 % 2;
        int i2 = g + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        CustomerObject customerObject = (CustomerObject) registerRecurringSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (customerObject != null) {
            int i4 = g + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            str = customerObject.write;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "unregistered_member")) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerRecurringSuccessActivity, null, true, 74);
            } else {
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerRecurringSuccessActivity, null, false, 6);
            }
        } else {
            MainActivity.Companion companion3 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(registerRecurringSuccessActivity, null, null, 6);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = g + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterRecurringSuccessActivity registerRecurringSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registerRecurringSuccessActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerRecurringSuccessActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerRecurringSuccessActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getPreferredWidth
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegisterRecurringSuccessActivity.g();
                }
            });
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            g = i2 % 128;
            int i3 = i2 % 2;
            registerRecurringSuccessActivity.IconCompatParcelizer();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            g = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegisterRecurringSuccessActivity registerRecurringSuccessActivity) {
        int iB = zznv.b();
        int iB2 = zznv.b();
        return (CustomerObject) TuitionPaymentFragmentbindingInflater1(iB, 62461826, zznv.b(), iB2, -62461824, zznv.b(), new Object[]{registerRecurringSuccessActivity});
    }

    static {
        d = 0;
        d();
        INSTANCE = new Companion(null);
        int i = asBinder + 81;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegisterRecurringSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int iB = zznv.b();
        int iB2 = zznv.b();
        return (Function1) TuitionPaymentFragmentbindingInflater1(iB, -766007656, 1647507919 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9), iB2, 766007656, onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1(), new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 123;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = i3 + 85;
        g = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_register_recurring_success;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_not_straight).substring(0, 31).codePointAt(7) - 1746492183, 1554255156, zznv.b(), zznv.b(), -1554255155, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1882016300, new Object[]{this, bundle});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void d() {
        b = new char[]{59762, 59751, 59773, 59749, 59761, 59772, 59717, 59763, 59771, 59764, 59765, 59791, 59733, 59698, 59765, 59761, 59698, 59748, 59775, 59761, 59766, 59748, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59719, 59807, 59804, 59797, 59818, 59802, 59744, 59774, 59806, 59801, 59802, 59763, 59769, 59805, 59805, 59803, 59744, 59863, 59847, 59843, 59883, 59862, 59852, 59864, 59874, 59882, 59882, 59887, 59863, 59868, 59858, 59857};
    }

    private static String $$i(short s, short s2, short s3) {
        int i = (s * 4) + 4;
        int i2 = s2 + 99;
        byte[] bArr = $$c;
        int i3 = s3 * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i++;
            i2 = i + i3;
        }
        while (true) {
            int i5 = i2;
            int i6 = i;
            i4++;
            bArr2[i4] = (byte) i5;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i = i6 + 1;
            i2 = i5 + bArr[i6];
        }
    }
}
