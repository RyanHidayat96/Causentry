package com.bpjstku.presentation.vocational;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.vocation.model.request.VocationEligibilityRequest;
import com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding;
import com.bpjstku.databinding.LayoutVocationalEligibilityErrorBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2;
import com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRedmiNote9ProExcludedSizes;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0012\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalCheckEligibilityActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalCheckEligibilityBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutVocationalEligibilityErrorBinding;", "Lcom/bpjstku/databinding/LayoutVocationalEligibilityErrorBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalCheckEligibilityActivity extends BindingBaseActivity<ActivityVocationalCheckEligibilityBinding> {
    private static int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f654a;
    private static int asInterface;
    private static int b;
    private static byte[] g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private LayoutVocationalEligibilityErrorBinding b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {123, -2, -101, -104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 151;
    private static int cancelAll = 0;
    private static int asBinder = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~i;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i));
        int i11 = ~(i7 | i9);
        int i12 = i3 | i11;
        int i13 = (~(i | i5)) | i11 | (~(i8 | i5));
        int i14 = i5 + i3 + i6 + (296844165 * i2) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i5 * 599922083) - 580124672) + (599922083 * i3) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i6) + ((-279707648) * i2) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i5 * (-1181628991)) + 1322814002 + (i3 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i6 * (-1181629109)) + (i2 * (-698251017)) + (i4 * 1773125444) + (i15 * 938541056);
        int i18 = i16 + (i17 * i17 * (-109772800));
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 != 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity = (VocationalCheckEligibilityActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = asBinder + 89;
        d = i20 % 128;
        int i21 = i20 % 2;
        vocationalCheckEligibilityActivity.b = LayoutVocationalEligibilityErrorBinding.bind(((ActivityVocationalCheckEligibilityBinding) ((ViewBinding) vocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity2 = vocationalCheckEligibilityActivity;
        Intrinsics.checkNotNullParameter(vocationalCheckEligibilityActivity2, "");
        vocationalCheckEligibilityActivity2.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityVocationalCheckEligibilityBinding) ((ViewBinding) vocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = vocationalCheckEligibilityActivity.getString(R.string.title_vocational_program);
        Intrinsics.checkNotNullExpressionValue(string, "");
        vocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        ((ActivityVocationalCheckEligibilityBinding) ((ViewBinding) vocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(vocationalCheckEligibilityActivity.getString(R.string.title_vocational_program));
        int i22 = d + 117;
        asBinder = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.$$a
            int r1 = r5 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = 145 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r6]
            int r3 = r3 + 1
        L24:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    public VocationalCheckEligibilityActivity() {
        final VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalCheckEligibilityActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalCheckEligibilityActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VocationalCheckEligibilityActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        VocationalCheckEligibilityActivity$bindingInflater$1 vocationalCheckEligibilityActivity$bindingInflater$1 = VocationalCheckEligibilityActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = d + 45;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return vocationalCheckEligibilityActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity = (VocationalCheckEligibilityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        LayoutVocationalEligibilityErrorBinding layoutVocationalEligibilityErrorBinding = vocationalCheckEligibilityActivity.b;
        if (layoutVocationalEligibilityErrorBinding == null) {
            int i5 = i3 + 121;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 20 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            layoutVocationalEligibilityErrorBinding = null;
        }
        Button button = layoutVocationalEligibilityErrorBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isSamsungJ7PrimeApi27Above
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        Button button2 = ((ActivityVocationalCheckEligibilityBinding) ((ViewBinding) vocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        button2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isRedmiNote9Pro
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) vocationalCheckEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(vocationalCheckEligibilityActivity, new getRedmiNote9ProExcludedSizes(vocationalCheckEligibilityActivity));
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk;
        User user;
        int i = 2 % 2;
        int i2 = asBinder + 93;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            user = (User) previewDelayWhenVideoCaptureIsBoundQuirk.cancel.getValue();
            int i3 = 94 / 0;
            if (user == null) {
                return;
            }
        } else {
            previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            user = (User) previewDelayWhenVideoCaptureIsBoundQuirk.cancel.getValue();
            if (user == null) {
                return;
            }
        }
        String str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null) {
            int i4 = asBinder + 25;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str = "";
        }
        String str2 = user.b;
        if (str2 == null) {
            str2 = "";
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.b(new VocationEligibilityRequest(str, str2))));
        final Function1 function1 = new Function1() { // from class: YuvImageOnePixelShiftQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewDelayWhenVideoCaptureIsBoundQuirk, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: isSamsungSMG532F
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isSamsungSMJ415F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.cancel(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isSamsungSMJ700F
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new getRedmiNote9ProExcludedSizes(this));
        int i2 = d + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = d + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = d + 53;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267, (ViewConfiguration.getLongPressTimeout() >> 16) + 33, 1387473586, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $10 + 81;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                byte[] bArr2 = g;
                if (bArr2 != null) {
                    int i11 = i9 + 71;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $11 + 83;
                        $10 = i13 % 128;
                        if (i13 % i5 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int packedPositionGroup = 3358 - ExpandableListView.getPackedPositionGroup(j2);
                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18;
                                    byte length2 = (byte) $$c.length;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, packedPositionGroup, scrollDefaultDelay, -1054011043, false, $$i((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE});
                                }
                                bArr[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i12 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i12])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cBlue = (char) Color.blue(0);
                                int mode = 3358 - View.MeasureSpec.getMode(0);
                                int iNormalizeMetaState = 18 - KeyEvent.normalizeMetaState(0);
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, mode, iNormalizeMetaState, -1054011043, false, $$i((byte) 0, length3, (byte) (length3 - 5)), new Class[]{Integer.TYPE});
                            }
                            bArr[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i12++;
                        }
                        i5 = 2;
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i14 = $10 + 95;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        byte[] bArr3 = g;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 32 - ExpandableListView.getPackedPositionChild(0L), 1387473586, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) / 3046761265686732006L)) / ((int) (((long) b) & 3046761265686732006L));
                    } else {
                        byte[] bArr4 = g;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266, KeyEvent.getDeadChar(0, 0) + 33, 1387473586, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i4;
                    int i15 = $10 + 55;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) f654a[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i7;
                Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (55903 - TextUtils.lastIndexOf("", '0', 0, 0)), 2855 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-16777203) - Color.rgb(0, 0, 0), -1529949196, false, $$i(b9, b10, (byte) (-b10)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = g;
                if (bArr5 != null) {
                    int i17 = $10 + 37;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    int length4 = bArr5.length;
                    byte[] bArr6 = new byte[length4];
                    int i19 = 0;
                    while (i19 < length4) {
                        int i20 = $11 + 37;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            bArr6[i19] = (byte) (((long) bArr5[i19]) % 3046761265686732006L);
                        } else {
                            bArr6[i19] = (byte) (((long) bArr5[i19]) ^ 3046761265686732006L);
                            i19++;
                        }
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i21 = $10 + 31;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr7 = g;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = f654a;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        int i2 = d + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
            int i4 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 141, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetBefore, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.seconds).substring(1, 2).codePointAt(0) + 527427832, (-21) - View.MeasureSpec.getSize(0), (short) (View.resolveSizeAndState(0, 0, 0) - 106), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay).substring(0, 16).codePointAt(11) - 99), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gb_t_ev_connector_type).substring(0, 4).codePointAt(3) + 1304381183, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Process.getThreadPriority(0) + 20) >> 6) + 527427937, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).codePointAt(0) - 118, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_detected).substring(0, 43).length() - 120), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_with).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1304381180, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iAlpha = 1031 - Color.alpha(0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
            Object[] objArr5 = new Object[1];
            c((byte) 52, (short) 89, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, iAlpha, maximumFlingVelocity, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int i5 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b2, (short) (b2 | 37), bArr[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, i5, capsMode, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (-1936555177) + (((-311471531) | iIdentityHashCode) * 614);
            int i9 = ~iIdentityHashCode;
            int i10 = i8 + (((~((-431644364) | i9)) | 153768513 | (~((-187364194) | i9))) * (-1228)) + (((~(i9 | (-33595681))) | (~((-277875851) | i9))) * 614) + 1956155328;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_card_number).substring(19, 20).length() + 527427941, (-21) - Gravity.getAbsoluteGravity(0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step5).substring(15, 16).length() + 1304381303, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(527427941 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redirecting_to_gopay).substring(1, 2).length() - 22, (short) ((-99) - TextUtils.getOffsetBefore("", 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_not_enabled_message).substring(5, 6).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_full_name_empty).substring(19, 20).codePointAt(0) + 1304381223, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1397814324};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.red(0) + 46038), 1135 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 18 - TextUtils.indexOf("", "", 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1956155328, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 1031;
                    int iBlue = Color.blue(0) + 15;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, (short) 141, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, iMyTid, iBlue, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 45993), (Process.myPid() >> 22) + 1117, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i13 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int offsetBefore2 = 15 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(b3, (short) (b3 | 37), bArr2[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i13, offsetBefore2, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with).substring(1, 3).codePointAt(0) + 527427836, (-22) - Process.getGidForName(""), (short) ((-106) - View.combineMeasuredStates(0, 0)), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1304381231, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).codePointAt(3) + 527427837, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bbm_money).substring(0, 9).length() - 30, (short) ((-77) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_cannot_proccessed).substring(0, 6).codePointAt(1) + 1304381175, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, keyRepeatTimeout, pressedStateDuration, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                        int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, (short) 141, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(trimmedLength, packedPositionChild, iIndexOf, 1357589585, false, (String) objArr17[0], null);
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
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode2;
            int i20 = ~((-809079200) | i19);
            int i21 = ~(564799029 | iIdentityHashCode2);
            int i22 = i16 + 1517103762 + ((i20 | i21) * 1150) + (((~((-564799030) | i19)) | i21) * (-575)) + (((~(iIdentityHashCode2 | (-809079200))) | (~(i19 | 809079199))) * 575);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
            int i25 = d + 67;
            asBinder = i25 % 128;
            int i26 = i25 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i27 = 0;
                while (i27 < strArr3.length) {
                    int i28 = d + 73;
                    asBinder = i28 % 128;
                    if (i28 % 2 != 0) {
                        arrayList.add(strArr3[i27]);
                        i27 += 40;
                    } else {
                        arrayList.add(strArr3[i27]);
                        i27++;
                    }
                }
            }
            int[] iArr = new int[i15];
            int i29 = i15 - 1;
            iArr[i29] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i29) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[3])[0];
            int i32 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i34 = i30 + (-90422027) + (((~((-167269117) | i33)) | (-77011054)) * (-948)) + ((~((~i33) | (-9441389))) * (-948)) + 703168268;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr19[2])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
            byte b4 = (byte) ($$b >>> 2);
            Object[] objArr20 = new Object[1];
            c(b4, b4, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, packedPositionGroup, touchSlop, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cAlpha = (char) (Color.alpha(0) + 29944);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                Object[] objArr21 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cAlpha, fadingEdgeLength, iKeyCodeFromString, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i37 = ~System.identityHashCode(this);
            int i38 = (((((~((-359697554) | i37)) | 355500160) * (-241)) + 855175185) + (((~(i37 | (-4197394))) | (-502595288)) * 241)) - 2024612374;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_due_amount).substring(8, 9).codePointAt(0) + 527427873, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 120, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_deeplink).substring(1, 2).length() + 16), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1304381304, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 527427930, (ViewConfiguration.getWindowTouchSlop() >> 8) - 21, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0) - 214), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), 1304381320 - View.combineMeasuredStates(0, 0), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1397814324};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - TextUtils.indexOf("", "")), 1725 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -2024612374);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                int i41 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i42 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                Object[] objArr26 = new Object[1];
                c((byte) 52, (short) 89, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb, i41, i42, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 527427897, (-21) - View.MeasureSpec.getMode(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 117), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1304381267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step1).substring(30, 32).length() + 527427935, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 67, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 113), (byte) KeyEvent.normalizeMetaState(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1304381253, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 29944);
                    int size = View.MeasureSpec.getSize(0) + 1755;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                    short s = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, s, (byte) s, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength2, size, iResolveOpacity, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int iMyTid2 = 1755 - (Process.myTid() >> 22);
                    int iRed = 23 - Color.red(0);
                    byte b5 = (byte) ($$b >>> 2);
                    Object[] objArr30 = new Object[1];
                    c(b5, b5, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollDefaultDelay2, iMyTid2, iRed, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i43 = asBinder + 55;
                d = i43 % 128;
                int i44 = i43 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i46 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i46 == i45) {
            int i47 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int i48 = (int) Runtime.getRuntime().totalMemory();
            int i49 = ~i48;
            int i50 = i47 + (-442589046) + ((i48 | 505916798) * (-859)) + (((~(i48 | (-235151419))) | (~(505916798 | i49))) * 859) + (((~(293314372 | i49)) | (-528465791)) * 859);
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr31[3])[0] = i52 ^ (i52 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
        if (strArr5 != null) {
            int i53 = d + 41;
            asBinder = i53 % 128;
            int i54 = i53 % 2;
            for (String str : strArr5) {
                arrayList2.add(str);
            }
        }
        int[] iArr2 = new int[i46];
        int i55 = i46 - 1;
        iArr2[i55] = 1;
        Toast.makeText((Context) null, iArr2[((i46 * i55) % 2) - 1], 1).show();
        int i56 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int i57 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i58 = i56 + 1203717843 + (((~i57) | 238323258) * 1324) + (((~(i57 | (-298547334))) | (~(511149759 | i57))) * (-1324)) + 1296470894;
        int i59 = (i58 << 13) ^ i58;
        int i60 = i59 ^ (i59 >>> 17);
        ((int[]) objArr32[3])[0] = i60 ^ (i60 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~((int) Runtime.getRuntime().maxMemory());
        if (i4 != ((((~((-858008179) | i5)) | 320875058) * (-241)) - 2001956362) + (((~(i5 | (-537133121))) | (-2008870780)) * 241)) {
            throw new RuntimeException("-1323750576");
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i7 = ~iNextInt;
        if (i6 != (-266234664) + (((~(1646101014 | i7)) | 360857920) * (-108)) + (((~(i7 | 932954950)) | (~((-932954951) | iNextInt)) | 1074003984) * 54) + ((iNextInt | 1074003984) * 54)) {
            int i8 = 1750802652 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i9 = d + 35;
        asBinder = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -931427197
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
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = ~startUptimeMillis;
        if (i4 != 67015125 + (((~((-8945986) | i5)) | (~((-140534311) | startUptimeMillis)) | (~(988413823 | startUptimeMillis))) * 765) + (((~((-149480296) | i5)) | 8945985) * 1530) + (((~(startUptimeMillis | (-149480296))) | (~(i5 | 988413823))) * 765)) {
            throw null;
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i6 != 1646594212 + ((~(2008480763 | i7)) * 52) + (((~(637729761 | i7)) | (~((-1941326204) | i7)) | 1370751002) * (-52)) + (((~(i7 | (-637729762))) | 67154560) * 52)) {
            throw new RuntimeException("-195811281");
        }
        super.onCreate(bundle);
        int i8 = d + 47;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        VocationalRegistrationActivity.Companion companion = VocationalRegistrationActivity.INSTANCE;
        VocationalRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(vocationalCheckEligibilityActivity);
        vocationalCheckEligibilityActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 97;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r1 = ((com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) ((androidx.viewbinding.ViewBinding) r5.INotificationSideChannelStubProxy.getValue())).msvEligibility;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        defpackage.getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(r1, null, null, null, null);
        r5 = ((com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) ((androidx.viewbinding.ViewBinding) r5.INotificationSideChannelStubProxy.getValue())).tvEligibilityResult;
        r6 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r6 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r5.setText(r3);
        r5 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder + 17;
        com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.asBinder) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        r1 = r1 + 93;
        com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r1 % 128;
        r1 = r1 % 2;
        r5 = ((com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) ((androidx.viewbinding.ViewBinding) r5.INotificationSideChannelStubProxy.getValue())).msvEligibility;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r5.setViewState(com.kennyc.view.MultiStateView.ViewState.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r5 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder + 31;
        com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if ((r5 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((!(r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5 = ((com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) ((androidx.viewbinding.ViewBinding) r5.INotificationSideChannelStubProxy.getValue())).msvEligibility;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r5.setViewState(com.kennyc.view.MultiStateView.ViewState.TuitionPaymentFragmentbindingInflater1);
        r5 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d + 99;
        com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity r5, defpackage.VirtualCameraAdapter1 r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder
            int r2 = r1 + 21
            int r3 = r2 % 128
            com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r3
            int r2 = r2 % r0
            java.lang.String r3 = ""
            if (r2 != 0) goto L1b
            boolean r2 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r4 = 78
            int r4 = r4 / 0
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == r4) goto L3d
            goto L1f
        L1b:
            boolean r2 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r2 == 0) goto L3d
        L1f:
            kotlin.Lazy r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r5 = r5.getValue()
            androidx.viewbinding.ViewBinding r5 = (androidx.viewbinding.ViewBinding) r5
            com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding r5 = (com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) r5
            com.kennyc.view.MultiStateView r5 = r5.msvEligibility
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            com.kennyc.view.MultiStateView$ViewState r6 = com.kennyc.view.MultiStateView.ViewState.LOADING
            r5.setViewState(r6)
            int r5 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d
            int r5 = r5 + 99
            int r6 = r5 % 128
            com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder = r6
            int r5 = r5 % r0
            return
        L3d:
            boolean r2 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r4 = 0
            if (r2 == 0) goto L77
            kotlin.Lazy r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r1 = r1.getValue()
            androidx.viewbinding.ViewBinding r1 = (androidx.viewbinding.ViewBinding) r1
            com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding r1 = (com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) r1
            com.kennyc.view.MultiStateView r1 = r1.msvEligibility
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            defpackage.getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(r1, r4, r4, r4, r4)
            kotlin.Lazy r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r5 = r5.getValue()
            androidx.viewbinding.ViewBinding r5 = (androidx.viewbinding.ViewBinding) r5
            com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding r5 = (com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) r5
            android.widget.TextView r5 = r5.tvEligibilityResult
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r6 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6
            java.lang.String r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r6 != 0) goto L67
            goto L68
        L67:
            r3 = r6
        L68:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5.setText(r3)
            int r5 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder
            int r5 = r5 + 17
            int r6 = r5 % 128
            com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r6
            int r5 = r5 % r0
            return
        L77:
            boolean r6 = r6 instanceof VirtualCameraAdapter1.asBinder
            if (r6 == 0) goto L96
            int r1 = r1 + 93
            int r6 = r1 % 128
            com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r6
            int r1 = r1 % r0
            kotlin.Lazy r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r5 = r5.getValue()
            androidx.viewbinding.ViewBinding r5 = (androidx.viewbinding.ViewBinding) r5
            com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding r5 = (com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding) r5
            com.kennyc.view.MultiStateView r5 = r5.msvEligibility
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            com.kennyc.view.MultiStateView$ViewState r6 = com.kennyc.view.MultiStateView.ViewState.CONTENT
            r5.setViewState(r6)
        L96:
            int r5 = com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.asBinder
            int r5 = r5 + 31
            int r6 = r5 % 128
            com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.d = r6
            int r5 = r5 % r0
            if (r5 == 0) goto La2
            return
        La2:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity.TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        vocationalCheckEligibilityActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = d + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static {
        notify = 1;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 93;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalCheckEligibilityBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, -1612562721, 1224839309 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_invalid_merchant_url).substring(0, 13).codePointAt(7), 1612562722, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return R.layout.activity_vocational_check_eligibility;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 341523936, new Object[]{this}, 725380876, RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -725380876, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iCodePointAt = (-1503258217) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.offer_not_applied).substring(8, 9).codePointAt(0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 1119895786, new Object[]{this}, 201680345, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -201680343, iCodePointAt);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 125;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = 1055777867;
        b = -1934795534;
        asInterface = 1815956450;
        g = new byte[]{-28, -108, -72, -117, 117, -90, -108, -67, -115, -126, 118, 105, -61, -120, 77, -46, -125, -126, -127, -98, -122, -111, 29, -93, -73, -92, -77, -66, -81, -122, -35, -86, -39, -74, -70, -92, -78, 26, 17, 6, 22, 15, -13, -14, 80, 14, 26, 2, -53, 90, 60, -30, 0, 26, -126, -66, 105, -40, -66, -109, -102, -44, -114, -120, -66, -113, -118, -126, -72};
    }

    private static String $$i(int i, byte b2, int i2) {
        int i3 = b2 + 117;
        int i4 = i * 3;
        byte[] bArr = $$c;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += i5;
            i5 = i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i3 = bArr[i8] + i3;
            i5 = i8;
            i6 = i7;
        }
    }
}
