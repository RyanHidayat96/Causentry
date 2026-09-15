package com.bpjstku.presentation.vocational;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.data.vocation.model.request.VocationRegisterRequest;
import com.bpjstku.databinding.ActivityVocationalRegistrationResultBinding;
import com.bpjstku.databinding.LayoutVocationCheckElegibilityLoadingBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.kennyc.view.MultiStateView;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isAffectedOnePlusModel;
import defpackage.isQuickZoomEnabled;
import defpackage.isVivoY17;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.setMinimumLoggingLevel;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
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
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004R\u0015\u0010\u0007\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\u0004\u0018\u00010\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRegistrationResultActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalRegistrationResultBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "INotificationSideChannel", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutVocationCheckElegibilityLoadingBinding;", "Lcom/bpjstku/databinding/LayoutVocationCheckElegibilityLoadingBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalRegistrationResultActivity extends BindingBaseActivity<ActivityVocationalRegistrationResultBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static char[] b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private LayoutVocationCheckElegibilityLoadingBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: isAffectedOppoModel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalRegistrationResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {51, -99, -8, -59, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 175;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f658a = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9;
        int i11 = (~((~i) | i7 | i4)) | (~(i8 | i6));
        int i12 = i6 + i4 + i5 + (531708263 * i2) + ((-608630064) * i3);
        int i13 = i12 * i12;
        int i14 = (i6 * (-228234701)) + 730857472 + ((-228234701) * i4) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i5) + ((-45088768) * i2) + ((-419430400) * i3) + ((-1471938560) * i13);
        int i15 = ((i6 * (-1679524527)) - 150938974) + (i4 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i5 * (-1679524245)) + (i2 * (-166744051)) + (i3 * 2062148848) + (i13 * (-865337344));
        int i16 = i14 + (i15 * i15 * (-1617166336));
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 197 - r7
            int r8 = 53 - r8
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r0 = com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r9 + 1
            int r9 = r3 + (-11)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    public VocationalRegistrationResultActivity() {
        final VocationalRegistrationResultActivity vocationalRegistrationResultActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalRegistrationResultActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRegistrationResultActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, VocationalRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VocationalRegistrationResultActivity.class, new Pair[]{TuplesKt.to("vocation_registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalRegistrationResultBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f658a + 7;
        d = i2 % 128;
        int i3 = i2 % 2;
        VocationalRegistrationResultActivity$bindingInflater$1 vocationalRegistrationResultActivity$bindingInflater$1 = VocationalRegistrationResultActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            return vocationalRegistrationResultActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f658a + 47;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutVocationCheckElegibilityLoadingBinding.bind(((ActivityVocationalRegistrationResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        VocationalRegistrationResultActivity vocationalRegistrationResultActivity = this;
        Intrinsics.checkNotNullParameter(vocationalRegistrationResultActivity, "");
        vocationalRegistrationResultActivity.getWindow().addFlags(8192);
        INotificationSideChannel();
        int i4 = d + 13;
        f658a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll.observe(this, new isAffectedOnePlusModel(this));
        Button button = ((ActivityVocationalRegistrationResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBack;
        Intrinsics.checkNotNullExpressionValue(button, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button, new Function0() { // from class: isAffectedOnePlusDevices
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VocationalRegistrationResultActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        int i2 = f658a + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll.observe(this, new isAffectedOnePlusModel(this));
        int i2 = d + 27;
        f658a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = d + 89;
        f658a = i2 % 128;
        int i3 = i2 % 2;
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (vocationalRegistration != null) {
            int i4 = f658a + 101;
            d = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                String str2 = vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Bank bank = vocationalRegistration.notify;
                obj.hashCode();
                throw null;
            }
            String str3 = vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Bank bank2 = vocationalRegistration.notify;
            if (bank2 != null) {
                int i5 = f658a + 95;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    String str4 = bank2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    obj.hashCode();
                    throw null;
                }
                str = bank2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                int i6 = f658a + 57;
                d = i6 % 128;
                int i7 = i6 % 2;
                str = null;
            }
            if (str == null) {
                int i8 = f658a + 75;
                d = i8 % 128;
                int i9 = i8 % 2;
                str = "";
            }
            VocationRegisterRequest vocationRegisterRequest = new VocationRegisterRequest(str3, str, vocationalRegistration.RemoteActionCompatParcelizer, vocationalRegistration.INotificationSideChannelDefault, vocationalRegistration.read, vocationalRegistration.write, vocationalRegistration.IconCompatParcelizer, vocationalRegistration.b, vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3, vocationalRegistration.cancelAll, vocationalRegistration.onTransact, vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1, vocationalRegistration.INotificationSideChannelStubProxy, vocationalRegistration.INotificationSideChannel, vocationalRegistration.g, vocationalRegistration.a, "", vocationalRegistration.asBinder, vocationalRegistration.cancel);
            final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            Intrinsics.checkNotNullParameter(vocationRegisterRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.cancelAll;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.b(vocationRegisterRequest)));
            final Function1 function1 = new Function1() { // from class: isSamsungJ3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewDelayWhenVideoCaptureIsBoundQuirk, (BaseModel) obj2);
                }
            };
            logToString logtostring = new logToString() { // from class: StillCaptureFlashStopRepeatingQuirk
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function1.invoke(obj2);
                }
            };
            final Function1 function2 = new Function1() { // from class: isHuaweiMate9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PreviewDelayWhenVideoCaptureIsBoundQuirk.cancelAll(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj2);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getDisplaySize
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function2.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    private final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = d + 77;
        f658a = i2 % 128;
        int i3 = i2 % 2;
        MultiStateView multiStateView = ((ActivityVocationalRegistrationResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvVocationResult;
        Intrinsics.checkNotNullExpressionValue(multiStateView, "");
        multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        LayoutVocationCheckElegibilityLoadingBinding layoutVocationCheckElegibilityLoadingBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (layoutVocationCheckElegibilityLoadingBinding == null) {
            int i4 = d + 63;
            f658a = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            layoutVocationCheckElegibilityLoadingBinding = null;
        }
        TextView textView = layoutVocationCheckElegibilityLoadingBinding.tvCheckEligibilitasLabel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr2;
        VocationalRegistrationResultActivity vocationalRegistrationResultActivity = (VocationalRegistrationResultActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
            int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
            Object[] objArr3 = new Object[1];
            c((short) 193, (byte) ($$b & 31), $$a[28], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, pressedStateDuration, i2, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                byte[] bArr = $$a;
                Object[] objArr4 = new Object[1];
                c((short) 156, bArr[7], bArr[28], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, packedPositionType, offsetBefore, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i3 = 631833220 + (((~(iElapsedRealtime | 1034913098)) | 29200) * 305) + (((~((~iElapsedRealtime) | 1034913098)) | 822310672) * 305) + 775751075;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i5 ^ (i5 << 5);
            int i6 = f658a + 39;
            d = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr6 = new Object[1];
            e(new int[]{0, 16, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new int[]{16, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, vocationalRegistrationResultActivity)).intValue();
            try {
                Object[] objArr8 = {-1135121761};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42049), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1726, View.combineMeasuredStates(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 775751075, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror2 = (char) (29992 - AndroidCharacter.getMirror('0'));
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 1755;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    byte[] bArr2 = $$a;
                    Object[] objArr9 = new Object[1];
                    c((short) 156, bArr2[7], bArr2[28], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror2, offsetBefore2, maximumDrawingCacheSize, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new int[]{32, 22, 148, 16}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new int[]{54, 15, 101, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                        int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                        byte[] bArr3 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((short) 104, bArr3[7], bArr3[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, packedPositionChild, i8, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                        int iGreen = 1755 - Color.green(0);
                        int mirror3 = 'G' - AndroidCharacter.getMirror('0');
                        Object[] objArr13 = new Object[1];
                        c((short) 193, (byte) ($$b & 31), $$a[28], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iGreen, mirror3, 986134021, false, (String) objArr13[0], null);
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
        int i9 = ((int[]) objArrB$7879113[1])[0];
        int i10 = ((int[]) objArrB$7879113[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i12 = ~((-506740160) | iFreeMemory);
            int i13 = ~iFreeMemory;
            int i14 = i11 + (-1643255327) + ((i12 | (~((-294137734) | i13))) * (-1808)) + (((~((-238293051) | iFreeMemory)) | (~(i13 | (-25690625)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iFreeMemory | 294137733)) | 268447109 | (~(506740159 | i13))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr14[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i17 = f658a + 43;
                d = i17 % 128;
                int i18 = i17 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i19 = i10 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i21 = (-480047119) + ((~(startUptimeMillis | 114639911)) * 216);
            int i22 = ~startUptimeMillis;
            int i23 = i20 + i21 + (((-16943633) | i22) * (-216)) + (((~(i22 | 114639911)) | 97962514) * 216);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr15[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
            int iMyTid = (Process.myTid() >> 22) + 15;
            byte[] bArr4 = $$a;
            Object[] objArr16 = new Object[1];
            c((short) (bArr4[0] + 1), bArr4[7], bArr4[28], objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, deadChar, iMyTid, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new int[]{32, 22, 148, 16}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new int[]{54, 15, 101, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int iIndexOf = TextUtils.indexOf("", "") + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
            byte[] bArr5 = $$a;
            Object[] objArr19 = new Object[1];
            c((short) 156, bArr5[7], bArr5[28], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode, iIndexOf, iLastIndexOf, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i26 = f658a + 31;
            d = i26 % 128;
            int i27 = i26 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int i28 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                byte b2 = $$a[7];
                short s = b2;
                Object[] objArr20 = new Object[1];
                c(s, (byte) (s | 52), b2, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(modifierMetaStateMask, i28, maximumFlingVelocity, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr21[3])[0];
            int i30 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i31 = ((1229186809 + (((~((-346947232) | iUptimeMillis)) | 279014538) * 1504)) + ((~(iUptimeMillis | (-67932694))) * (-1504))) - 1897139581;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr2[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new int[]{0, 16, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new int[]{16, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, vocationalRegistrationResultActivity)).intValue();
            Object[] objArr24 = {-1135121761};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46038), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, ((byte) KeyEvent.getModifierMetaStateMask()) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 2113804499, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i34 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr6 = $$a;
                Object[] objArr26 = new Object[1];
                c((short) (bArr6[0] + 1), bArr6[7], bArr6[28], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollDefaultDelay, i34, scrollBarSize, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45992), 1117 - Drawable.resolveOpacity(0, 0), 17 - (Process.myTid() >> 22)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int maximumDrawingCacheSize2 = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 15;
                byte b3 = $$a[7];
                short s2 = b3;
                Object[] objArr27 = new Object[1];
                c(s2, (byte) (s2 | 52), b3, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(edgeSlop, maximumDrawingCacheSize2, packedPositionType2, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(new int[]{32, 22, 148, 16}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new int[]{54, 15, 101, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i35 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr7 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 156, bArr7[7], bArr7[28], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(threadPriority, i35, doubleTapTimeout, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int i36 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iNormalizeMetaState = 15 + KeyEvent.normalizeMetaState(0);
                    byte[] bArr8 = $$a;
                    Object[] objArr31 = new Object[1];
                    c((short) (bArr8[0] + 1), bArr8[7], bArr8[28], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(deadChar2, i36, iNormalizeMetaState, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArr2[1])[0];
        int i38 = ((int[]) objArr2[3])[0];
        if (i38 == i37) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr2[2])[0];
            int i40 = ((int[]) objArr2[3])[0];
            int i41 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i42 = ~iMaxMemory;
            int i43 = i39 + (-1924506432) + (((~((-517828329) | i42)) | (~(273548158 | iMaxMemory))) * 217) + (((~(iMaxMemory | (-517828329))) | 244411520) * 217) + (((~(273548158 | i42)) | 517828328) * 217);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr32[2])[0] = i45 ^ (i45 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i46 = f658a + 111;
            d = i46 % 128;
            int i47 = 2;
            int i48 = i46 % 2;
            int i49 = 0;
            while (i49 < strArr4.length) {
                int i50 = f658a + 97;
                d = i50 % 128;
                if (i50 % i47 == 0) {
                    arrayList2.add(strArr4[i49]);
                    i49 += 68;
                } else {
                    arrayList2.add(strArr4[i49]);
                    i49++;
                }
                i47 = 2;
            }
        }
        Toast.makeText((Context) null, i38 / (((i38 - 1) * i38) % 2), 0).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i51 = ((int[]) objArr2[2])[0];
        int i52 = ((int[]) objArr2[3])[0];
        int i53 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int i54 = ~new Random().nextInt(1199548350);
        int i55 = i51 + (-1273338773) + (((-268435522) | i54) * 494) + (((~(i54 | (-269551210))) | 246511546) * 494);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr33[2])[0] = i57 ^ (i57 << 5);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0285  */
    /* JADX WARN: Code duplicated, block: B:65:0x0286  */
    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        Throwable cause;
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = b;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 51;
                $10 = i10 % 128;
                int i11 = i10 % i;
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr2[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Color.blue(i3) + 1270, TextUtils.getCapsMode("", i3, i3) + 18, 407021364, false, $$i(b2, (byte) (b2 + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr2 = cArr2;
                    i = 2;
                    i3 = 0;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr != null) {
            int i12 = $11 + 117;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 1;
            } else {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = $10 + 33;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3225, 13 - TextUtils.indexOf("", "", 0), 2133916302, false, $$i(b3, (byte) (b3 | 6), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i15 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3225 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 13 - KeyEvent.keyCodeFromString(""), 2133916302, false, $$i(b4, (byte) (b4 | 6), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                int i16 = setvideostabilizationmode.b;
                Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) (29944 - View.MeasureSpec.getSize(0));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                    int i17 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte length2 = (byte) $$c.length;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, iResolveSizeAndState, i17, 387247676, false, $$i((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 41241), 1705 - (Process.myPid() >> 22), TextUtils.getCapsMode("", 0, 0) + 21, -1434471773, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i18 = $10 + 7;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 2 / 4;
                }
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr4, 0, cArr5, 0, i6);
            int i20 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr4, i20, i8);
            System.arraycopy(cArr5, i8, cArr4, 0, i20);
        }
        if (z) {
            int i21 = $11 + 105;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            char[] cArr6 = new char[i6];
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                i23 = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i7 > 0) {
            int i24 = 0;
            while (true) {
                setvideostabilizationmode.b = i24;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i24 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2006133055
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
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f658a + 125;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        if (i4 != (-1794545432) + (((~(858134285 | i5)) | 1150853344 | (~((-1688121829) | i5))) * (-744)) + (((~i5) | 320865801) * 744) + ((i5 | (-1150853345)) * 744)) {
            int i6 = (-1273427378) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = ~iIdentityHashCode;
        if (i7 != (-1091459136) + (((~(1770800489 | i8)) | 54889158) * 226) + (((~(i8 | 1808650223)) | (~((-54889159) | iIdentityHashCode)) | R.string.config_defaultAutomotiveNavigation) * (-113)) + ((~(iIdentityHashCode | 1770800489)) * 113)) {
            int i9 = d + 1;
            f658a = i9 % 128;
            if (i9 % 2 != 0) {
                int[] iArr = new int[1501165523];
                iArr[1501165522] = 1;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1501165523];
                iArr2[1501165522] = 1;
                int i10 = (-1847271402) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00df, code lost:
    
        if (r1 != ((((~(r3 | 2089560048)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 336463040) + (((~((~r3) | 2089560048)) | 470549856) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e1, code lost:
    
        super.onCreate(r14);
        r14 = com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.f658a + 13;
        com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.d = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ed, code lost:
    
        r14 = (-791812220) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f7, code lost:
    
        r14 = (-1479495038) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0100, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006a, code lost:
    
        if (r1 == (((-1806733070) + (((~((~r7) | 865365349)) | 1141440536) * 529)) + (((~(r7 | 865365349)) | 1695352892) * 529))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a0, code lost:
    
        if (r1 == ((((-792878226) + ((~((-838926553) | r7)) * (-301))) + (((~(978557404 | r7)) | (~((~r7) | 148569861))) * (-301))) + (((~(r7 | (-148569862))) | 978557404) * 301))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a2, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r3 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ VocationalRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalRegistrationResultActivity vocationalRegistrationResultActivity) {
        int i = 2 % 2;
        int i2 = d + 33;
        f658a = i2 % 128;
        int i3 = i2 % 2;
        VocationalRegistration vocationalRegistration = (VocationalRegistration) vocationalRegistrationResultActivity.getIntent().getParcelableExtra("vocation_registration_data");
        int i4 = f658a + 47;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return vocationalRegistration;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(VocationalRegistrationResultActivity vocationalRegistrationResultActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = d + 91;
        f658a = i2 % 128;
        if (i2 % 2 != 0) {
            vocationalRegistrationResultActivity.finishAffinity();
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalRegistrationResultActivity, null, null, 93);
            unit = Unit.INSTANCE;
        } else {
            vocationalRegistrationResultActivity.finishAffinity();
            MainActivity.Companion companion2 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalRegistrationResultActivity, null, null, 6);
            unit = Unit.INSTANCE;
        }
        int i3 = f658a + 61;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.asBinder) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r4 = r4 + 87;
        com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.f658a = r4 % 128;
        r4 = r4 % 2;
        r7 = (com.bpjstku.databinding.ActivityVocationalRegistrationResultBinding) ((androidx.viewbinding.ViewBinding) r1.INotificationSideChannelStubProxy.getValue());
        r0 = r7.msvVocationResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0.setViewState(com.kennyc.view.MultiStateView.ViewState.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        r7.imgVocationalRegistrationResult.setImageResource(com.bpjstku.R.drawable.ic_success);
        r7.tvVocationalRegistrationResult.setText(r1.getString(com.bpjstku.R.string.label_success_exclamation));
        r7.tvRegistrationResultDescription.setText(r1.getString(com.bpjstku.R.string.label_vocational_registation_result_description));
        r7.tvRegistrationResultInformation.setText(r1.getString(com.bpjstku.R.string.vocational_registration_information));
        r7 = com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.d + 119;
        com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.f658a = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if ((r7 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r7 = (com.bpjstku.databinding.ActivityVocationalRegistrationResultBinding) ((androidx.viewbinding.ViewBinding) r1.INotificationSideChannelStubProxy.getValue());
        r0 = r7.msvVocationResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0.setViewState(com.kennyc.view.MultiStateView.ViewState.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        r7.imgVocationalRegistrationResult.setImageResource(com.bpjstku.R.drawable.ic_failed);
        r7.tvVocationalRegistrationResult.setText(r1.getString(com.bpjstku.R.string.label_failed));
        r7.tvRegistrationResultDescription.setText(r1.getString(com.bpjstku.R.string.message_vocation_registration_failed));
        r7.tvRegistrationResultInformation.setText("");
        r7 = com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.f658a + 37;
        com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.d = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1.INotificationSideChannel();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r7) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalRegistrationResultActivity vocationalRegistrationResultActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1509459387, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{vocationalRegistrationResultActivity, virtualCameraAdapter1}, -1509459386);
    }

    static {
        asBinder = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 47;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f658a;
        int i3 = i2 + 13;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 87;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return com.bpjstku.R.layout.activity_vocational_registration_result;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -994978602, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 994978602);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 111;
        f658a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 71;
        f658a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 115;
        f658a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentbindingInflater1 = setMinimumLoggingLevel.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater1, 1007398716 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), setMinimumLoggingLevel.b.TuitionPaymentFragmentbindingInflater1(), 632403518, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this, context}, -632403516);
    }

    static void g() {
        b = new char[]{59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59767, 59862, 59881, 59406, 59887, 59871, 59889, 59393, 59404, 59403, 59894, 59879, 59872, 59402, 59894, 59888, 59889, 59888, 59894, 59892, 59407, 59403, 59758, 59846, 59840, 59846, 59869, 59866, 59842, 59851, 59851, 59843, 59840, 59870, 59864, 59867, 59845};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 109;
        f658a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 + 4
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.$$c
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationResultActivity.$$i(int, short, int):java.lang.String");
    }
}
