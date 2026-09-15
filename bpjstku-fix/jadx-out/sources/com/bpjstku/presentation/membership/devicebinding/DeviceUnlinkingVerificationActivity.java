package com.bpjstku.presentation.membership.devicebinding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.OtpData;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivityDeviceUnlinkingVerificationBinding;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import defpackage.AppCompatSpinnerDropDownAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getHorizontalOffset;
import defpackage.getInputChannelCountRanges;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.layoutHorizontal;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\r\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013R\u0015\u0010\u0007\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0017\u0010\n\u001a\u0004\u0018\u00010\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0017\u0010\t\u001a\u0004\u0018\u00010\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDeviceUnlinkingVerificationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LAppCompatSpinnerDropDownAdapter;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUnlinkingVerificationActivity extends BindingBaseActivity<ActivityDeviceUnlinkingVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] g;
    private static int onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {15, -9, 64, -81};
    private static final int $$f = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 17;
    private static int cancelAll = 1;
    private static int d = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new getHorizontalOffset(this));

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: getHorizontalOriginalOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return (String) DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentbindingInflater1(getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -472229346, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 472229348, objArr);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: getVerticalOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.b};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return (String) DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentbindingInflater1(getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -843688870, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 843688871, objArr);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: getBackground
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: getHintText
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = i8 | i6;
        int i11 = (~((~i6) | i2)) | (~i10);
        int i12 = (~(i3 | i7 | i6)) | (~(i10 | i2));
        int i13 = i6 + i2 + i + (528639218 * i5) + ((-532493036) * i4);
        int i14 = i13 * i13;
        int i15 = ((i6 * 873666089) - 1460666368) + (873666089 * i2) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i) + (1819279360 * i5) + ((-1621098496) * i4) + (586088448 * i14);
        int i16 = (i6 * (-1573143961)) + 2078511484 + (i2 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i * (-1573143025)) + (i5 * 123045422) + (i4 * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        if (i17 == 1) {
            return b(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    private static void c(int i, int i2, short s, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = 98 - (s * 14);
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i3 + i4) - 11;
            i3 = i3;
        }
        while (true) {
            i6++;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i7]) - 11;
                i3 = i7;
            }
        }
    }

    public DeviceUnlinkingVerificationActivity() {
        final DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<AppCompatSpinnerDropDownAdapter>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [AppCompatSpinnerDropDownAdapter, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ AppCompatSpinnerDropDownAdapter invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingVerificationActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppCompatSpinnerDropDownAdapter.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, String p1, String p2, String p3, String p4, String p5) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) DeviceUnlinkingVerificationActivity.class);
            intent.putExtra("email", p1);
            intent.putExtra("key_jenis_form", p2);
            intent.putExtra("key_transaction_id", p3);
            intent.putExtra("key_title_message", p4);
            intent.putExtra("key_message", p5);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDeviceUnlinkingVerificationBinding> TuitionPaymentFragmentbindingInflater1() {
        DeviceUnlinkingVerificationActivity$bindingInflater$1 deviceUnlinkingVerificationActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = d + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            deviceUnlinkingVerificationActivity$bindingInflater$1 = DeviceUnlinkingVerificationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 57 / 0;
        } else {
            deviceUnlinkingVerificationActivity$bindingInflater$1 = DeviceUnlinkingVerificationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i4 = d + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return deviceUnlinkingVerificationActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity = (DeviceUnlinkingVerificationActivity) objArr[0];
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnContinue;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setPromptText
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
        int i2 = asBinder + 73;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity = this;
        ((AppCompatSpinnerDropDownAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(deviceUnlinkingVerificationActivity, new b(new Function1() { // from class: setDropDownViewTheme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((AppCompatSpinnerDropDownAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.observe(deviceUnlinkingVerificationActivity, new b(new Function1() { // from class: AppCompatSpinnerApi23Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asBinder + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity = this;
        Intrinsics.checkNotNullParameter(deviceUnlinkingVerificationActivity, "");
        deviceUnlinkingVerificationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtEmail.setText((String) this.b.getValue());
        if (Intrinsics.areEqual((String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue(), "PASPOR_OTP")) {
            ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.setHint("Nomor Identitas");
            ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setVisibility(8);
            return;
        }
        ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.setHint(getString(R.string.label_nik));
        ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setVisibility(8);
        int i4 = d + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = g;
        if (cArr != null) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 123;
                $10 = i11 % 128;
                int i12 = i11 % i;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cGreen = (char) Color.green(i3);
                        int defaultSize = 1270 - View.getDefaultSize(i3, i3);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18;
                        byte b2 = (byte) ($$f & 21);
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, defaultSize, maximumFlingVelocity, 407021364, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i10++;
                    i = 2;
                    i3 = 0;
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
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i13 = $11 + 105;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i15 = $10 + 39;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i17 = $11 + 21;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    int i19 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3225, View.MeasureSpec.getMode(0) + 13, 2133916302, false, $$i((byte) ($$f & 22), b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i20 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                        int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                        byte length2 = (byte) $$c.length;
                        byte b5 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, packedPositionGroup, deadChar, 387247676, false, $$i(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 41241), 1705 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 21, -1434471773, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i21 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i21, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i21);
            int i22 = $10 + 9;
            $11 = i22 % 128;
            int i23 = i22 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            int i24 = 0;
            while (true) {
                setvideostabilizationmode.b = i24;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i25 = $10 + 81;
                $11 = i25 % 128;
                int i26 = i25 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i24 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            setvideostabilizationmode.b = 0;
            int i27 = $10 + 25;
            $11 = i27 % 128;
            int i28 = i27 % 2;
            while (setvideostabilizationmode.b < i5) {
                int i29 = $11 + 23;
                $10 = i29 % 128;
                int i30 = i29 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
            int iMyPid = (Process.myPid() >> 22) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[7], bArr[3], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, deadChar, iMyPid, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 106, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
            int iAlpha = 15 - Color.alpha(0);
            short s = (short) ($$b | 34);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(s, bArr2[7], bArr2[3], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i3, iAlpha, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int iAlpha2 = 1031 - Color.alpha(0);
                int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr6 = new Object[1];
                c((short) 103, (byte) 52, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iAlpha2, keyRepeatDelay, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i6 = ~iElapsedRealtime;
            int i7 = 950084276 + (((~((-2195633) | i6)) | (~((-100690433) | iElapsedRealtime)) | (~((-139198474) | iElapsedRealtime))) * 765) + (((~((-102886065) | i6)) | 2195632) * 1530) + (((~(iElapsedRealtime | (-102886065))) | (~(i6 | (-139198474)))) * 765) + 1409390133;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 64, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {168834317};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46037), 1134 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1409390133, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 16;
                    byte[] bArr3 = $$a;
                    Object[] objArr12 = new Object[1];
                    c(bArr3[5], bArr3[7], bArr3[3], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, doubleTapTimeout, iIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ImageFormat.getBitsPerPixel(0)), 1117 - View.combineMeasuredStates(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
                }
                Object[] objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                    Object[] objArr14 = new Object[1];
                    c((short) 103, (byte) 52, $$a[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, pressedStateDuration, iMakeMeasureSpec, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new int[]{0, 22, 106, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new int[]{22, 15, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i10 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                        short s2 = (short) ($$b | 34);
                        byte[] bArr4 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(s2, bArr4[7], bArr4[3], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumDrawingCacheSize, i10, absoluteGravity, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cBlue = (char) Color.blue(0);
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                        int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[5], bArr5[7], bArr5[3], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, i11, iIndexOf2, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i14 = d + 95;
                asBinder = i14 % 128;
                int i15 = i14 % 2;
                while (i2 < strArr2.length) {
                    int i16 = asBinder + 77;
                    d = i16 % 128;
                    if (i16 % 2 != 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 15;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i17 = d + 105;
        asBinder = i17 % 128;
        int i18 = i17 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = i19 + (-2077208466) + ((~((-135268422) | iIdentityHashCode)) * 623) + (((~iIdentityHashCode) | 90178064) * (-623)) + (((~(iIdentityHashCode | 99594906)) | (~((-144685264) | iIdentityHashCode)) | 135268421) * 623);
        int i23 = i22 ^ (i22 << 13);
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr19[2])[0] = i24 ^ (i24 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char pressedStateDuration2 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int iAxisFromString = 1754 - MotionEvent.axisFromString("");
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
            byte[] bArr6 = $$a;
            Object[] objArr20 = new Object[1];
            c((short) 103, (byte) (-bArr6[1]), bArr6[3], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(pressedStateDuration2, iAxisFromString, longPressTimeout, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i25 = d + 85;
            asBinder = i25 % 128;
            int i26 = i25 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cGreen = (char) (Color.green(0) + 29944);
                int mode = View.MeasureSpec.getMode(0) + 1755;
                int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                short s3 = (short) ($$b | 34);
                byte[] bArr7 = $$a;
                Object[] objArr21 = new Object[1];
                c(s3, bArr7[7], bArr7[3], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cGreen, mode, iResolveSizeAndState, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i27 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i27}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i29 = ~i28;
            int i30 = (-1917404935) + ((675479552 | i29) * (-192)) + (((~(751505888 | i29)) | 288628762) * (-384)) + (((~(i28 | (-76026337))) | (~(i29 | 1040134650)) | (~((-288628763) | i28))) * DerHeader.TAG_CLASS_PRIVATE) + 1909471184;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{37, 16, 64, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{53, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {168834317};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 42050), 1725 - ImageFormat.getBitsPerPixel(0), View.resolveSizeAndState(0, 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1909471184, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumDrawingCacheSize2 = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i33 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iArgb = Color.argb(0, 0, 0, 0) + 23;
                short s4 = (short) ($$b | 34);
                byte[] bArr8 = $$a;
                Object[] objArr26 = new Object[1];
                c(s4, bArr8[7], bArr8[3], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize2, i33, iArgb, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{0, 22, 106, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{22, 15, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i34 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                    int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) 140, bArr9[7], bArr9[3], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(minimumFlingVelocity, i34, maximumDrawingCacheSize3, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                    int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 103, (byte) (-bArr10[1]), bArr10[3], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb, iCombineMeasuredStates, offsetBefore, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                int i35 = d + 5;
                asBinder = i35 % 128;
                int i36 = i35 % 2;
                arrayList2.add(strArr4[i2]);
                i2++;
            }
            throw null;
        }
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        Object[] objArr31 = {new int[]{i38}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i40 = ~i39;
        int i41 = i37 + (-509270647) + (((~((-110261525) | i40)) | 34734340) * (-108)) + (((~(i40 | 322863950)) | (~((-322863951) | i39)) | (-398391135)) * 54) + ((i39 | (-398391135)) * 54);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c8, code lost:
    
        if (r0 == ((r6 + ((r4 | r2) * (-880))) + (r2 * 880))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ca, code lost:
    
        r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.d + 123;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.asBinder = r0 % 128;
        r0 = r0 % 2;
        r0 = new int[334029825];
        r0[334029824(0x13e8e400, float:5.878986E-27)] = 1;
        r4 = 519627776 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r0[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00eb, code lost:
    
        super.onResume();
        r9 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.asBinder + 1;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.d = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f6, code lost:
    
        if ((r9 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fa, code lost:
    
        r9 = 1973189112 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0103, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        if (r2 == ((r7 + ((r6 | (~((-1115753225) | r4))) * (-754))) + ((r4 | (-825028662)) * 754))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008d, code lost:
    
        if (r2 == ((((-582753536) + ((r5 | (~((-1116293898) | r6))) * (-406))) + ((~(2144993275 | r6)) * (-406))) + (((~(r4 | (-1028699379))) | (~((-1858686922) | r6))) * 406))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) android.os.Process.getElapsedCpuTime();
        r6 = 110604700 + ((((~((-64397512) | r2)) | 29532293) | (~(1780308842 | r2))) * (-880));
        r4 = (~((-64397512) | (~r2))) | (-1780308843);
        r2 = ~(r2 | 64397511);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[] r9) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[]):java.lang.Object");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -226624044
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cb, code lost:
    
        if (r1 != ((((-1098352676) + (((~(r4 | 299759186)) | ((~(2015670517 | r4)) | (-2046686968))) * 464)) + (((-31016451) | r2) * (-464))) + (((~(r2 | 299759186)) | (-2046686968)) * 464))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cd, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.d + 105;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.asBinder = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00db, code lost:
    
        r11 = 1599821976 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == ((((-1541134816) + (((-673190913) | r4) * (-627))) + (((~(1814648600 | r4)) | 984661057) * (-627))) + (((~(r4 | 984661057)) | (~((~r4) | (-1814648601)))) * 627))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
    
        if (r1 == (((1168966376 + (((~(1718656363 | r4)) | 277349012) * 336)) + (((~(r4 | 888668820)) | 1107336555) * (-168))) + (((~((~r4) | 888668820)) | 1718656363) * 168))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        OtpData data;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingVerificationActivity.MediaBrowserCompat();
        } else {
            String str = "Gagal mengirim OTP";
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = asBinder + 3;
                d = i2 % 128;
                int i3 = i2 % 2;
                deviceUnlinkingVerificationActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                SendEmailOtpResponse sendEmailOtpResponse = (SendEmailOtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String str2 = null;
                if (sendEmailOtpResponse != null) {
                    int i4 = d + 39;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        data = sendEmailOtpResponse.getData();
                        int i5 = 60 / 0;
                    } else {
                        data = sendEmailOtpResponse.getData();
                    }
                } else {
                    data = null;
                }
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "OTP berhasil dikirim ke email: ".concat(String.valueOf((String) deviceUnlinkingVerificationActivity.b.getValue())), 0).show();
                if (((SendEmailOtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getIsSuccessful()) {
                    DeviceUnlinkingOtpActivity.Companion bVar = DeviceUnlinkingOtpActivity.INSTANCE;
                    DeviceUnlinkingOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(deviceUnlinkingVerificationActivity, (String) deviceUnlinkingVerificationActivity.b.getValue(), (String) deviceUnlinkingVerificationActivity.d.getValue(), data != null ? data.getChecksum() : null);
                } else {
                    SendEmailOtpResponse sendEmailOtpResponse2 = (SendEmailOtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (sendEmailOtpResponse2 != null) {
                        int i6 = d + 91;
                        asBinder = i6 % 128;
                        if (i6 % 2 == 0) {
                            sendEmailOtpResponse2.getMessage();
                            str2.hashCode();
                            throw null;
                        }
                        String message = sendEmailOtpResponse2.getMessage();
                        if (message != null) {
                            str = message;
                        }
                    }
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str, 0).show();
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                deviceUnlinkingVerificationActivity.IconCompatParcelizer();
                String str3 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str3 != null) {
                    int i7 = d + 19;
                    asBinder = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 34 / 0;
                    }
                    str = str3;
                }
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str, 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity) {
        int i = 2 % 2;
        int i2 = d + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceUnlinkingVerificationActivity.getIntent().getStringExtra("key_message");
        }
        deviceUnlinkingVerificationActivity.getIntent().getStringExtra("key_message");
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        d = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingVerificationActivity.getIntent().getStringExtra("key_title_message");
        int i4 = d + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e9  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String message;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i2 + 11;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                deviceUnlinkingVerificationActivity.MediaBrowserCompat();
                obj.hashCode();
                throw null;
            }
            deviceUnlinkingVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceUnlinkingVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List listSplit$default = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new char[]{'#'}, false, 0, 6, (Object) null);
            StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getHaveMembership(), new char[]{'#'}, false, 0, 6, (Object) null);
            StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getHavePengajuan(), new char[]{'#'}, false, 0, 6, (Object) null);
            StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new char[]{'#'}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(listSplit$default.get(0), "true")) {
                String str = (String) deviceUnlinkingVerificationActivity.d.getValue();
                if (str != null) {
                    int i6 = d + 93;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        str.length();
                        throw null;
                    }
                    if (str.length() != 0) {
                        AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        String str2 = (String) deviceUnlinkingVerificationActivity.d.getValue();
                        Intrinsics.checkNotNull(str2);
                        AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1549146552, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{appCompatSpinnerDropDownAdapter, str2}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1549146551, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                    }
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                }
            } else {
                CheckMembershipResponse checkMembershipResponse = (CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (checkMembershipResponse == null || (message = checkMembershipResponse.getMessage()) == null) {
                    message = "Peserta tidak terdaftar atau data tidak valid";
                }
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), message, 0).show();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            deviceUnlinkingVerificationActivity.IconCompatParcelizer();
            String str3 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3 == null) {
                str3 = "Gagal memverifikasi kepesertaan";
            }
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str3, 0).show();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity = (DeviceUnlinkingVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 33;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceUnlinkingVerificationActivity.getIntent().getStringExtra("key_jenis_form");
        }
        deviceUnlinkingVerificationActivity.getIntent().getStringExtra("key_jenis_form");
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity = (DeviceUnlinkingVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingVerificationActivity.getIntent().getStringExtra("key_transaction_id");
        int i4 = asBinder + 123;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return stringExtra;
    }

    public static /* synthetic */ String b(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            String stringExtra = deviceUnlinkingVerificationActivity.getIntent().getStringExtra("email");
            int i3 = 66 / 0;
            if (stringExtra != null) {
                return stringExtra;
            }
        } else {
            String stringExtra2 = deviceUnlinkingVerificationActivity.getIntent().getStringExtra("email");
            if (stringExtra2 != null) {
                return stringExtra2;
            }
        }
        int i4 = asBinder + 85;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0121  */
    /* JADX WARN: Code duplicated, block: B:26:0x015a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0185  */
    /* JADX WARN: Code duplicated, block: B:32:0x01c8  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity, View view) {
        String str;
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String string = StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNik.getText())).toString();
        if (string.length() == 0) {
            ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.setError("Nomor Identitas tidak boleh kosong");
        } else {
            if (string.length() >= 6 || string.length() <= 20) {
                ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.setError(null);
                if (((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.getVisibility() == 0) {
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNomorPeserta.getText())).toString();
                    if (string2.length() == 0) {
                        ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setError("Nomor KPJ tidak boleh kosong");
                    } else if (string2.length() != 11) {
                        ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setError("Nomor KPJ harus 11 digit");
                    } else {
                        ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setError(null);
                        int i4 = d + 65;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        String string3 = StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNik.getText())).toString();
                        String string4 = ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.getVisibility() == 0 ? StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNomorPeserta.getText())).toString() : null;
                        str = (String) deviceUnlinkingVerificationActivity.d.getValue();
                        if (str != null || str.length() == 0) {
                            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                        } else {
                            AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            String str2 = (String) deviceUnlinkingVerificationActivity.d.getValue();
                            Intrinsics.checkNotNull(str2);
                            AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(597578040, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{appCompatSpinnerDropDownAdapter, str2, new CheckMembershipRequest(string3, "", string4, "", "")}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -597578038, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        }
                    }
                } else {
                    int i6 = d + 65;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    String string5 = StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNik.getText())).toString();
                    String string6 = ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.getVisibility() == 0 ? StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNomorPeserta.getText())).toString() : null;
                    str = (String) deviceUnlinkingVerificationActivity.d.getValue();
                    if (str != null) {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                    }
                }
            } else {
                int i8 = d + 87;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.setError("6 - 20 digit");
                    z = true;
                } else {
                    ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.setError("6 - 20 digit");
                    z = false;
                }
                if (z) {
                    int i9 = d + 65;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    String string7 = StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNik.getText())).toString();
                    String string8 = ((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.getVisibility() == 0 ? StringsKt.trim((CharSequence) String.valueOf(((ActivityDeviceUnlinkingVerificationBinding) ((ViewBinding) deviceUnlinkingVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etNomorPeserta.getText())).toString() : null;
                    str = (String) deviceUnlinkingVerificationActivity.d.getValue();
                    if (str != null) {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i11 = d + 73;
        asBinder = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 49 / 0;
        }
        return unit;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (String) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -472229346, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault5, 472229348, new Object[]{deviceUnlinkingVerificationActivity});
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (String) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -843688870, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault5, 843688871, new Object[]{deviceUnlinkingVerificationActivity});
    }

    static {
        onTransact = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancelAll + 5;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_device_unlinking_verification;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -667952602, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault5, 667952605, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1101308740;
        TuitionPaymentFragmentbindingInflater1(layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -906179008, iCodePointAt, layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 906179008, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 19;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        g = new char[]{59745, 59866, 59864, 59868, 59850, 59849, 59864, 59869, 59862, 59883, 59867, 59809, 59825, 59856, 59827, 59832, 59867, 59869, 59857, 59870, 59864, 59866, 59682, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59758, 59746, 59744, 59749, 59771, 59757, 59752, 59742, 59822, 59808, 59808, 59788, 59782, 59821, 59820, 59809, 59777, 59787, 59821, 59837, 59832, 59815, 59810, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, byte r6, int r7) {
        /*
            int r5 = 105 - r5
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity.$$i(byte, byte, int):java.lang.String");
    }
}
