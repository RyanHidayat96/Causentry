package com.bpjstku.presentation.membership.devicebinding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityDeviceUnlinkingSuccessBinding;
import com.bpjstku.domain.programinfo.model.BenefitItem;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.AppCompatSpinnerDropDownAdapter;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi33Impl;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getServiceInfo;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onRestoreInstanceState;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u000e\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDeviceUnlinkingSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;Ljava/lang/String;)V", "LAppCompatSpinnerDropDownAdapter;", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUnlinkingSuccessActivity extends BindingBaseActivity<ActivityDeviceUnlinkingSuccessBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: AppCompatSpinnerDialogPopup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private static final byte[] $$c = {90, 46, 113, 8};
    private static final int $$f = 188;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, 31, 20, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 147;
    private static int asBinder = 1;
    private static int b = 0;
    private static int asInterface = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00f5  */
    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i4;
        int i8 = i7 | i6;
        int i9 = (~i8) | (~(i7 | i));
        int i10 = i7 | (~i6);
        int i11 = ~i;
        int i12 = (~(i10 | i11)) | (~(i4 | i6));
        int i13 = i4 + i6 + i5 + ((-540997959) * i3) + (162607451 * i2);
        int i14 = i13 * i13;
        int i15 = ((-612843245) * i4) + 1723858944 + (1667710703 * i6) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i12) + ((-1620049920) * i5) + ((-672137216) * i3) + (483393536 * i2) + (377683968 * i14);
        int i16 = (i4 * 228155117) + 240245784 + (i6 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i12 * 274) + (i5 * 228155391) + (i3 * (-329950905)) + (i2 * (-2026639707)) + (i14 * 159186944);
        int i17 = i15 + (i16 * i16 * (-1451425792));
        if (i17 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity = (DeviceUnlinkingSuccessActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = asInterface + 17;
        b = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i21 = ~((-691412051) | iMaxMemory);
            int i22 = (-274002696) + ((136713216 | i21) * (-280)) + ((i21 | (~(1521399593 | iMaxMemory))) * 140);
            int i23 = ~((-554698835) | iMaxMemory);
            int i24 = ~iMaxMemory;
            if (i20 != i22 + (((~(i24 | 2076098427)) | i23 | (~((-136713217) | i24))) * 140)) {
                int[] iArr = new int[2101010524];
                iArr[2101010523] = 1;
                int i25 = (-921288524) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i26 = asInterface + 85;
                b = i26 % 128;
                int i27 = i26 % 2;
            }
        } else if (((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null) != (((~((-369499022) | i)) | 101061124) * (-283)) + 2000506772 + ((~(i | (-268437898))) * 283)) {
            int[] iArr2 = new int[2101010524];
            iArr2[2101010523] = 1;
            int i28 = (-921288524) % 2;
            Toast.makeText((Context) null, iArr2[-1], 1).show();
            int i29 = asInterface + 85;
            b = i29 % 128;
            int i210 = i29 % 2;
        }
        int i30 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i31 = ~(534215164 | i11);
        if (i30 != (((102117532 | i31) * (-374)) - 574417148) + ((i31 | 432097632) * 374)) {
            throw new RuntimeException("-1474892299");
        }
        super.onStart();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 196 - r7
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2e
        L12:
            r3 = r2
        L13:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    public DeviceUnlinkingSuccessActivity() {
        final DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<AppCompatSpinnerDropDownAdapter>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [AppCompatSpinnerDropDownAdapter, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ AppCompatSpinnerDropDownAdapter invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingSuccessActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingSuccessActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) DeviceUnlinkingSuccessActivity.class);
            intent.putExtra("key_transaction_id", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDeviceUnlinkingSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        b = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingSuccessActivity$bindingInflater$1 deviceUnlinkingSuccessActivity$bindingInflater$1 = DeviceUnlinkingSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return deviceUnlinkingSuccessActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityDeviceUnlinkingSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnContinue;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatSpinner1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingSuccessActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = asInterface + 29;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((AppCompatSpinnerDropDownAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setPrompt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingSuccessActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = b + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = b + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity = this;
        Intrinsics.checkNotNullParameter(deviceUnlinkingSuccessActivity, "");
        deviceUnlinkingSuccessActivity.getWindow().addFlags(8192);
        int i4 = asInterface + 23;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, String p1) {
        int i = 2 % 2;
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.ic_login_failed, p0, p1, string, (128 & 16) != 0 ? null : new Function0() { // from class: AppCompatSpinner2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingSuccessActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : true);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = b + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = b + 23;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b2, (short) (b2 | 193), (byte) 37, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, iLastIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = b + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                byte b3 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(b3, (short) (b3 | 156), (byte) 52, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, trimmedLength, i4, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ((((-423213295) + (((~(90270233 | iElapsedRealtime)) | 302780482) * 104)) + ((~((~iElapsedRealtime) | (-90178057))) * (-104))) + ((iElapsedRealtime | 302872659) * 104)) - 553857226;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{0, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{16, 16, 197, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {349658669};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 1726, Drawable.resolveOpacity(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -553857226);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                    byte b4 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b4, (short) (b4 | 156), (byte) 52, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, packedPositionType, iResolveOpacity, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{32, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{54, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                        int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b5 = $$a[7];
                        short s = (short) (b5 | 104);
                        Object[] objArr11 = new Object[1];
                        c(b5, s, (byte) (s >>> 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, bitsPerPixel, keyRepeatDelay, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iResolveOpacity2 = 1755 - Drawable.resolveOpacity(0, 0);
                        int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                        byte b6 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c(b6, (short) (b6 | 193), (byte) 37, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, iResolveOpacity2, i8, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iMyUid = Process.myUid();
            int i12 = ~iMyUid;
            int i13 = (~((-897772608) | i12)) | 545442821;
            int i14 = ~(iMyUid | 1037499967);
            int i15 = i11 + (-725587866) + ((i13 | i14) * (-713)) + (i14 * 1426) + ((~(685170181 | i12)) * 713);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i20 = ~i19;
            int i21 = i18 + 66556625 + ((i19 | (-31045923)) * 140) + (((~((-31045923) | i20)) | 8487168) * (-280)) + (((~(i19 | (-8487169))) | (~(243648348 | i20)) | (-266207103)) * 140);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int i24 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
            int i25 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte b7 = $$a[7];
            short s2 = (short) (b7 | 52);
            Object[] objArr15 = new Object[1];
            c(b7, s2, (byte) s2, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(fadingEdgeLength, i24, i25, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{32, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{54, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iGreen = 1031 - Color.green(0);
            int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b8 = $$a[7];
            Object[] objArr18 = new Object[1];
            c(b8, (short) (b8 | 156), (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSizeAndState, iGreen, maxKeyCode, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i26 = b + 91;
            asInterface = i26 % 128;
            int i27 = i26 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                int i28 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b9 = bArr[3];
                short s3 = bArr[7];
                Object[] objArr19 = new Object[1];
                c(b9, s3, (byte) s3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionGroup, maxKeyCode2, i28, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr20[3])[0];
            int i30 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i31 = ~System.identityHashCode(this);
            int i32 = ((644797189 + (((~((-36766233) | i31)) | 281046402) * (-828))) + ((i31 | (-36766233)) * (-828))) - 1946307124;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[2])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{0, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{16, 16, 197, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {349658669};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46038), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 18 - TextUtils.indexOf("", "", 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 1970991148, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
                int iBlue = 15 - Color.blue(0);
                byte b10 = $$a[7];
                short s4 = (short) (b10 | 52);
                Object[] objArr25 = new Object[1];
                c(b10, s4, (byte) s4, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates, deadChar, iBlue, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter("", 0) + 1117, KeyEvent.normalizeMetaState(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int mode = 1031 - View.MeasureSpec.getMode(0);
                int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr2 = $$a;
                byte b11 = bArr2[3];
                short s5 = bArr2[7];
                Object[] objArr26 = new Object[1];
                c(b11, s5, (byte) s5, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, mode, iMakeMeasureSpec, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{32, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{54, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i35 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    byte b12 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(b12, (short) (b12 | 156), (byte) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maxKeyCode3, tapTimeout, i35, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iMyPid = 1031 - (Process.myPid() >> 22);
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                    byte b13 = $$a[7];
                    short s6 = (short) (b13 | 52);
                    Object[] objArr30 = new Object[1];
                    c(b13, s6, (byte) s6, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumDrawingCacheSize2, iMyPid, pressedStateDuration2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr[1])[0];
        int i37 = ((int[]) objArr[3])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i38 = ((int[]) objArr[2])[0];
        int i39 = ((int[]) objArr[3])[0];
        int i40 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i41 = ~((-536865648) | iUptimeMillis);
        int i42 = 403320677 + ((292585477 | i41) * (-280)) + ((i41 | (~(292585477 | iUptimeMillis))) * 140);
        int i43 = ~((-244280171) | iUptimeMillis);
        int i44 = ~iUptimeMillis;
        int i45 = i38 + i42 + (((~(i44 | 536865647)) | i43 | (~((-292585478) | i44))) * 140);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr31[2])[0] = i47 ^ (i47 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[PHI: r8
  0x00c5: PHI (r8v5 char) = (r8v4 char), (r8v28 char) binds: [B:27:0x00c3, B:23:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4 A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:7:0x0024, B:9:0x0035, B:10:0x006c, B:36:0x013c, B:38:0x0155, B:39:0x0199, B:29:0x00cc, B:31:0x00e4, B:33:0x0125), top: B:79:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0123  */
    /* JADX WARN: Code duplicated, block: B:38:0x0155 A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:7:0x0024, B:9:0x0035, B:10:0x006c, B:36:0x013c, B:38:0x0155, B:39:0x0199, B:29:0x00cc, B:31:0x00e4, B:33:0x0125), top: B:79:0x0024 }] */
    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c2 = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c3 = '0';
        int i7 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i3];
                    objArr2[c2] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iMyPid = (Process.myPid() >> 22) + 1270;
                        int iIndexOf = TextUtils.indexOf("", c3) + 19;
                        byte b2 = (byte) i7;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, iMyPid, iIndexOf, 407021364, false, $$i(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                    i8++;
                    c2 = 0;
                    i3 = 1;
                    c3 = '0';
                    i7 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i2, cArr4, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 39;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr5 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c4 = 0;
            while (setvideostabilizationmode.b < i4) {
                int i11 = $10 + 31;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = setvideostabilizationmode.b;
                        char c5 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = Integer.valueOf(c4);
                        objArr3[0] = Integer.valueOf(c5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3224 - TextUtils.indexOf((CharSequence) "", '0', 0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), 2133916302, false, $$i(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                    } else {
                        int i13 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c4)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b6 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, 387247676, false, $$i(b6, (byte) (b6 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                    }
                } else {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i14 = setvideostabilizationmode.b;
                        char c6 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr5 = new Object[2];
                        objArr5[c] = Integer.valueOf(c4);
                        objArr5[0] = Integer.valueOf(c6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b7 = (byte) (-1);
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3224 - TextUtils.indexOf((CharSequence) "", '0', 0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0), 2133916302, false, $$i(b7, b8, (byte) (b8 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                    } else {
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr6 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c4)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b9 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, 387247676, false, $$i(b9, (byte) (b9 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                    }
                }
                c4 = cArr5[setvideostabilizationmode.b];
                try {
                    Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41240 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1705 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 21, -1434471773, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i16, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $10 + 9;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                int i18 = $11 + 83;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity = (DeviceUnlinkingSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = b + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i5 = ~iMyPid;
        if (i4 != (((~(1747198605 | i5)) | (~((-917211063) | iMyPid)) | (~(i5 | 917211062))) * 959) + 1507816089 + (((~(iMyPid | 917211062)) | (~(i5 | (-917211063))) | (~(1747198605 | iMyPid))) * 959)) {
            throw new RuntimeException("-1324893717");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt(230776008);
        int i7 = ~iNextInt;
        int i8 = (-1616274142) + (((~(1949037499 | i7)) | 25427968) * (-1188));
        int i9 = (~(iNextInt | (-1949037500))) | 25427968;
        int i10 = ~(630018465 | i7);
        if (i6 != i8 + ((i9 | i10) * 594) + (((~((-1949037500) | i7)) | 1344447002 | i10) * 594)) {
            throw new RuntimeException("1990326827");
        }
        super.onResume();
        int i11 = asInterface + 79;
        b = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 183490024 + (((~((-885189444) | i5)) | 281045313 | (~(1715176986 | i5))) * (-1136)) + (((~((-885189444) | iIdentityHashCode)) | (~(1715176986 | iIdentityHashCode)) | (~((-1111032857) | i5))) * (-568)) + (((~(iIdentityHashCode | (-281045314))) | (~(i5 | (-1715176987))) | (~(885189443 | i5))) * 568)) {
            int i6 = (-662753646) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.appli).substring(0, 5).codePointAt(0) + 1682828270) | 207759285);
        if (i7 != ((((-2127218158) | i8) * (-658)) - 330247556) + ((i8 | (-2129324030)) * 658)) {
            int i9 = (-1924647000) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = b + 87;
        asInterface = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.String] */
    public static /* synthetic */ Unit b(DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String str = (String) deviceUnlinkingSuccessActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        if (str != null) {
            int i4 = b + 7;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                str.length();
                throw null;
            }
            if (str.length() != 0) {
                final AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) deviceUnlinkingSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                final String str2 = (String) deviceUnlinkingSuccessActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Intrinsics.checkNotNull(str2);
                String string = Settings.Secure.getString(deviceUnlinkingSuccessActivity.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(string, "");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = appCompatSpinnerDropDownAdapter.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (((CharSequence) objectRef.element).length() == 0) {
                    Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: autoSizeText
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) throws Throwable {
                            AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objectRef, appCompatSpinnerDropDownAdapter, str2, task);
                        }
                    }));
                } else {
                    appCompatSpinnerDropDownAdapter.b((String) objectRef.element, str2);
                }
                Unit unit = Unit.INSTANCE;
                int i5 = asInterface + 47;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
                return unit;
            }
        }
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Transaction ID tidak ditemukan", 0).show();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 71;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingSuccessActivity.MediaBrowserCompat();
        } else {
            String str = "Gagal menyelesaikan proses device binding, silakan login kembali";
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                deviceUnlinkingSuccessActivity.IconCompatParcelizer();
                onRestoreInstanceState onrestoreinstancestate = (onRestoreInstanceState) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Ganti perangkat berhasil", 0).show();
                    Intent intent = new Intent(deviceUnlinkingSuccessActivity, (Class<?>) LoginActivity.class);
                    intent.setFlags(268468224);
                    deviceUnlinkingSuccessActivity.startActivity(intent);
                    deviceUnlinkingSuccessActivity.finishAffinity();
                } else {
                    String string = onrestoreinstancestate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (string == null) {
                        string = deviceUnlinkingSuccessActivity.getString(R.string.error_login_tittle);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                    }
                    String str2 = onrestoreinstancestate.TuitionPaymentFragmentbindingInflater1;
                    if (str2 != null) {
                        int i5 = asInterface + 15;
                        int i6 = i5 % 128;
                        b = i6;
                        int i7 = i5 % 2;
                        int i8 = i6 + 17;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        str = str2;
                    }
                    deviceUnlinkingSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string, str);
                }
            } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                int i10 = i2 + 93;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                deviceUnlinkingSuccessActivity.IconCompatParcelizer();
                String string2 = deviceUnlinkingSuccessActivity.getString(R.string.error_login_tittle);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String str3 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str3 != null) {
                    int i12 = asInterface + 55;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    str = str3;
                }
                deviceUnlinkingSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string2, str);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity) {
        int i = 2 % 2;
        Intent intent = new Intent(deviceUnlinkingSuccessActivity, (Class<?>) LoginActivity.class);
        intent.setFlags(268468224);
        deviceUnlinkingSuccessActivity.startActivity(intent);
        deviceUnlinkingSuccessActivity.finishAffinity();
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 121;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity) {
        int i = 2 % 2;
        int i2 = b + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceUnlinkingSuccessActivity.getIntent().getStringExtra("key_transaction_id");
        }
        deviceUnlinkingSuccessActivity.getIntent().getStringExtra("key_transaction_id");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        d = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 107;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = b + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_device_unlinking_success;
        }
        int i3 = 97 / 0;
        return R.layout.activity_device_unlinking_success;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = b + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iB = BenefitItem.b.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(iB, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 934602697, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -934602697);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = BenefitItem.b.b();
        int iB2 = BenefitItem.b.b();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, BenefitItem.b.b(), new Object[]{this}, iB2, -669821340, iB, 669821342);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        int iB = BenefitItem.b.b();
        int iB2 = BenefitItem.b.b();
        int iB3 = BenefitItem.b.b();
        TuitionPaymentFragmentbindingInflater1(iB, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iB3, 2139309738, iB2, -2139309737);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59806, 59426, 59429, 59413, 59409, 59449, 59428, 59410, 59438, 59440, 59448, 59448, 59453, 59429, 59426, 59424, 59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        DeviceUnlinkingSuccessActivity deviceUnlinkingSuccessActivity = (DeviceUnlinkingSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = b + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 13;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, byte r8) {
        /*
            int r8 = 105 - r8
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity.$$c
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingSuccessActivity.$$i(int, byte, byte):java.lang.String");
    }
}
