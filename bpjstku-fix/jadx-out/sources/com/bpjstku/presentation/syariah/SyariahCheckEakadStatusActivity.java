package com.bpjstku.presentation.syariah;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.syariah.model.request.SyariahMembershipCheckRequest;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem;
import com.bpjstku.databinding.ActivitySyariahCheckEakadStatusBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzbla;
import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createCaptureSession;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import id.vida.liveness.R0$$ExternalSyntheticLambda0;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0015\u0010\u0007\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0015\u0010\u0011\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\n\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahCheckEakadStatusActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySyariahCheckEakadStatusBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LcreateCaptureSession;", "", "TuitionPaymentFragmentbindingInflater1", "", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahCheckEakadStatusActivity extends BindingBaseActivity<ActivitySyariahCheckEakadStatusBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] d;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {55, -47, -47, 67};
    private static final int $$f = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 201;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f640a = 0;
    private static int g = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: lambdaonSurfacePrepared6androidxcameracamera2internalcompatCameraCaptureSessionCompatStateCallbackExecutorWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return (String) SyariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1(832829722, objArr, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -832829721);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i5 | i);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i)) | (~(i7 | i9)) | (~(i9 | i));
        int i14 = i + i6 + i4 + (669352129 * i3) + (266941808 * i2);
        int i15 = i14 * i14;
        int i16 = (720661947 * i) + 1572077568 + ((-1243901369) * i6) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i4) + ((-1100480512) * i3) + ((-1249902592) * i2) + ((-491520000) * i15);
        int i17 = (i * 1617402437) + 56426783 + (i6 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i4 * 1617401855) + (i3 * 1244927807) + (i2 * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        if (i18 != 1) {
            return i18 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return b(objArr);
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
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 145 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity.$$a
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
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity.c(int, byte, short, java.lang.Object[]):void");
    }

    public SyariahCheckEakadStatusActivity() {
        final SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = syariahCheckEakadStatusActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity2 = this;
        this.b = LazyKt.lazy(new Function0<createCaptureSession>() { // from class: com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, createCaptureSession] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ createCaptureSession invoke() {
                LifecycleOwner lifecycleOwner = syariahCheckEakadStatusActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(createCaptureSession.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahCheckEakadStatusActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SyariahCheckEakadStatusActivity.class, new Pair[]{TuplesKt.to("worker_code", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySyariahCheckEakadStatusBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 45;
        f640a = i2 % 128;
        if (i2 % 2 != 0) {
            SyariahCheckEakadStatusActivity$bindingInflater$1 syariahCheckEakadStatusActivity$bindingInflater$1 = SyariahCheckEakadStatusActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SyariahCheckEakadStatusActivity$bindingInflater$1 syariahCheckEakadStatusActivity$bindingInflater$2 = SyariahCheckEakadStatusActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = f640a + 79;
        g = i3 % 128;
        int i4 = i3 % 2;
        return syariahCheckEakadStatusActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((createCaptureSession) this.b.getValue()).b.observe(this, new Observer() { // from class: lambdaonClosed5androidxcameracamera2internalcompatCameraCaptureSessionCompatStateCallbackExecutorWrapper
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SyariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f640a + 85;
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
        String str;
        int i = 2 % 2;
        int i2 = f640a + 55;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        final createCaptureSession createcapturesession = (createCaptureSession) this.b.getValue();
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (user != null) {
            int i3 = f640a + 3;
            g = i3 % 128;
            int i4 = i3 % 2;
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        SyariahMembershipCheckRequest syariahMembershipCheckRequest = new SyariahMembershipCheckRequest(String.valueOf(str), ((String) this.TuitionPaymentFragmentbindingInflater1.getValue()).toString());
        Intrinsics.checkNotNullParameter(syariahMembershipCheckRequest, "");
        MutableLiveData<VirtualCameraAdapter1<SyariahMembershipCheckItem>> mutableLiveData = createcapturesession.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(syariahMembershipCheckRequest)));
        final Function1 function1 = new Function1() { // from class: CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return createCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createcapturesession, (SyariahMembershipCheckItem) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda0
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: toCameraDevice
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return createCaptureSession.b(createcapturesession, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: lambdaonError2androidxcameracamera2internalcompatCameraDeviceCompatStateCallbackExecutorWrapper
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        createcapturesession.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i5 = g + 13;
        f640a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, (short) (b2 | 141), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, longPressTimeout, scrollBarFadeDuration, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{1488170560, 1648958201, 683758253, 622048037, -1519672247, -1615904999, 853095412, -557241983, 1670981794, 1136503293, -584415567, 1950693151, -454291712, -1092336066}, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1797148182, 538403859, 1545097842, -1650686613, -1624379045, -2006183007, 802681909, -185642581, 1369522233, 34581301}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b3, b4, (short) (b4 | 89), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, capsMode, i2, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = g + 103;
            f640a = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int mirror = 1079 - AndroidCharacter.getMirror('0');
                int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                byte b5 = $$a[5];
                Object[] objArr6 = new Object[1];
                c((byte) 52, b5, (short) (b5 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, mirror, i5, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyTid = Process.myTid();
            int i8 = ~iMyTid;
            int i9 = 1056437361 + (((~((-252706821) | i8)) | (~((-546102747) | iMyTid))) * 520);
            int i10 = ~(546102746 | i8);
            int i11 = ~(iMyTid | 790382916);
            int i12 = i9 + ((i10 | i11) * (-1040)) + ((i11 | (~(i8 | (-790382917))) | (-798809567)) * 520) + 1086685940;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{1889441432, -687331504, -1690747544, 665131395, -579473340, 720890305, -2003180051, 555481631, -77004756, 1061055409}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_time_save_credit).substring(12, 14).length() + 14, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{1064189707, -1823957265, 952363507, 1583244684, -1091010055, -1944815814, 1888766449, 1231392374, 407821058, -189526567}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1673038229};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46038), KeyEvent.getDeadChar(0, 0) + 1134, 18 - Color.argb(0, 0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1086685940, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr12 = new Object[1];
                    c(b6, b7, (short) (b7 | 141), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, modifierMetaStateMask, iArgb, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1118, (ViewConfiguration.getJumpTapTimeout() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iBlue = 1031 - Color.blue(0);
                    int size = 15 - View.MeasureSpec.getSize(0);
                    byte b8 = $$a[5];
                    Object[] objArr13 = new Object[1];
                    c((byte) 52, b8, (short) (b8 | 36), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iBlue, size, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{1488170560, 1648958201, 683758253, 622048037, -1519672247, -1615904999, 853095412, -557241983, 1670981794, 1136503293, -584415567, 1950693151, -454291712, -1092336066}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_network_error).substring(0, 13).length() + 9, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{-1797148182, 538403859, 1545097842, -1650686613, -1624379045, -2006183007, 802681909, -185642581, 1369522233, 34581301}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama1).substring(30, 31).length() + 14, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                        int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                        int mirror2 = AndroidCharacter.getMirror('0') - '!';
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, (short) (b10 | 89), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState2, scrollBarFadeDuration2, mirror2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i15 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr17 = new Object[1];
                        c(b11, b12, (short) (b12 | 141), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(pressedStateDuration, i15, iResolveSizeAndState, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i16 = f640a + 97;
                g = i16 % 128;
                for (int i17 = i16 % 2 != 0 ? 0 : 1; i17 < strArr2.length; i17++) {
                    arrayList.add(strArr2[i17]);
                }
            }
            throw null;
        }
        int i18 = g + 43;
        f640a = i18 % 128;
        int i19 = i18 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[3])[0];
        int i22 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iNextInt = new Random().nextInt(27132062);
        int i23 = ~iNextInt;
        int i24 = i20 + 274312101 + (((~((-34668695) | i23)) | 278948864) * 220) + (((~(i23 | (-639308736))) | 883588905) * (-440)) + ((iNextInt | (-34668695)) * 220);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr18[2])[0] = i26 ^ (i26 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
            int gidForName = 22 - Process.getGidForName("");
            byte b13 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((byte) 15, b13, (short) (b13 | 37), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, maximumFlingVelocity, gidForName, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                int iResolveSize = 1755 - View.resolveSize(0, 0);
                int iGreen = 23 - Color.green(0);
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr20 = new Object[1];
                c(b14, b15, (short) (b15 | 89), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSizeAndState, iResolveSize, iGreen, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i27 = ~iElapsedRealtime;
            int i28 = ((((~(267739119 | i27)) | (~((-26477643) | iElapsedRealtime))) * 988) - 1927131791) + (((~(iElapsedRealtime | 28659051)) | 239080068 | (~(i27 | (-26477643)))) * 988) + 1644467109;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new int[]{1889441432, -687331504, -1690747544, 665131395, -579473340, 720890305, -2003180051, 555481631, -77004756, 1061055409}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_phone_number).substring(13, 14).length() + 15, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new int[]{1064189707, -1823957265, 952363507, 1583244684, -1091010055, -1944815814, 1888766449, 1231392374, 407821058, -189526567}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1673038229};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 42049), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1725, 29 - Drawable.resolveOpacity(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1644467109, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                int i31 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                int iAxisFromString = 22 - MotionEvent.axisFromString("");
                byte b16 = $$a[7];
                byte b17 = b16;
                Object[] objArr25 = new Object[1];
                c(b16, b17, (short) (b17 | 89), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetBefore, i31, iAxisFromString, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new int[]{1488170560, 1648958201, 683758253, 622048037, -1519672247, -1615904999, 853095412, -557241983, 1670981794, 1136503293, -584415567, 1950693151, -454291712, -1092336066}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.valid_date).substring(0, 24).length() - 2, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new int[]{-1797148182, 538403859, 1545097842, -1650686613, -1624379045, -2006183007, 802681909, -185642581, 1369522233, 34581301}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).codePointAt(38) - 93, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cGreen2 = (char) (29944 - Color.green(0));
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1755;
                    int modifierMetaStateMask2 = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b18 = $$a[7];
                    byte b19 = b18;
                    Object[] objArr28 = new Object[1];
                    c(b18, b19, b19, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen2, iIndexOf, modifierMetaStateMask2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                    int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iAlpha = Color.alpha(0) + 23;
                    byte b20 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 15, b20, (short) (b20 | 37), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, windowTouchSlop2, iAlpha, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        if (i33 != i32) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr4 != null) {
                int i34 = g + 111;
                f640a = i34 % 128;
                int i35 = i34 % 2;
                for (String str : strArr4) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i33));
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
        Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
        int i37 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard | (-705041728));
        int i38 = i36 + (((-1052129152) | i37) * (-196)) + 844060473 + ((i37 | 347087424) * 196);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr30[3])[0] = i40 ^ (i40 << 5);
        int i41 = f640a + 77;
        g = i41 % 128;
        if (i41 % 2 == 0) {
            throw null;
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = d;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.combineMeasuredStates(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3291, 31 - Drawable.resolveOpacity(0, 0), 1948206109, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
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
        int[] iArr6 = d;
        char c = '0';
        if (iArr6 != null) {
            int i8 = $10;
            int i9 = i8 + 41;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = i8 + 15;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr6[i12]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int maximumFlingVelocity = 3291 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf = 30 - TextUtils.indexOf("", c);
                    byte b3 = (byte) i6;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, maximumFlingVelocity, iIndexOf, 1948206109, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i12++;
                iArr6 = iArr6;
                c = '0';
                i5 = 1;
                i6 = 0;
            }
            i2 = i6;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        int i13 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 109;
            $11 = i14 % 128;
            int i15 = i14 % i13;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "") + 2559, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, 683220507, false, $$i(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - Color.red(0)), Color.blue(0) + 348, (KeyEvent.getMaxKeyCode() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i20 = $11 + 71;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            i13 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f640a + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != ((2106080584 + (((~(1262924503 | iIdentityHashCode)) | (-432936961)) * (-948))) + ((~((~iIdentityHashCode) | (-277350401))) * (-948))) - 108272596) {
            int[] iArr = new int[1404094480];
            iArr[1404094479] = 1;
            int i5 = (-1096271632) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i6 = g + 99;
            f640a = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ~((~((int) Process.getStartUptimeMillis())) | (-2124118955));
        if (i8 != ((((-2128608176) | i9) * (-970)) - 646149750) + ((i9 | 4489221) * 970)) {
            int i10 = 1105713676 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i2 != (-2014913844) + (((~((~iIdentityHashCode) | (-20972547))) | (~((-939596649) | iIdentityHashCode))) * (-302)) + ((~((-20972547) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-960569195))) | (-1070178300)) * 302)) {
            int i3 = 1732482874 % 2;
            throw new ArithmeticException();
        }
        int i4 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int i6 = ~i5;
        if (i4 != (((-947944364) + (((~(2134438972 | i6)) | (~((-418527642) | i5))) * (-370))) + ((((~(i5 | 2134438972)) | (~(i6 | (-418527642)))) | 1728627748) * (-370))) - 357860344) {
            int i7 = f640a + 71;
            g = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[2017558699];
            iArr[2017558698] = 1;
            int i9 = 1866461582 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = g + 3;
            f640a = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 % 3;
            }
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 55;
        f640a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ~((~System.identityHashCode(this)) | (-1373937077));
        if (i4 != ((((-1911332862) | i5) * (-970)) - 979860446) + ((i5 | 537395785) * 970)) {
            int i6 = (-550588458) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i8 = (-250884648) + ((1143388506 | iNextInt) * 614);
        int i9 = ~iNextInt;
        if (i7 != i8 + (((~((-787076628) | i9)) | 69242898 | (~(1791979337 | i9))) * (-1228)) + (((~(i9 | 1861222235)) | (~((-717833730) | i9))) * 614)) {
            throw new RuntimeException("915997145");
        }
        super.onCreate(bundle);
        int i10 = g + 29;
        f640a = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity = (SyariahCheckEakadStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f640a + 49;
        g = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = syariahCheckEakadStatusActivity.getIntent().getStringExtra("worker_code");
        Intrinsics.checkNotNull(stringExtra);
        int i4 = g + 3;
        f640a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return stringExtra;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = g + 9;
            f640a = i2 % 128;
            int i3 = i2 % 2;
            syariahCheckEakadStatusActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                syariahCheckEakadStatusActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahCheckEakadStatusActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return (Unit) SyariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1(923058303, objArr, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -923058303);
                    }
                });
                int i4 = g + 37;
                f640a = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        syariahCheckEakadStatusActivity.IconCompatParcelizer();
        Boolean status = ((SyariahMembershipCheckItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus();
        Intrinsics.checkNotNull(status);
        boolean zBooleanValue = status.booleanValue();
        syariahCheckEakadStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = zBooleanValue;
        if (!zBooleanValue) {
            SyariahActivationActivity.Companion companion = SyariahActivationActivity.INSTANCE;
            SyariahActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahCheckEakadStatusActivity, (String) syariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            syariahCheckEakadStatusActivity.d_();
            return;
        }
        int i6 = f640a + 93;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            SyariahPrintEakadActivity.Companion companion2 = SyariahPrintEakadActivity.INSTANCE;
            SyariahPrintEakadActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahCheckEakadStatusActivity, (String) syariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            syariahCheckEakadStatusActivity.d_();
        } else {
            SyariahPrintEakadActivity.Companion companion3 = SyariahPrintEakadActivity.INSTANCE;
            SyariahPrintEakadActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahCheckEakadStatusActivity, (String) syariahCheckEakadStatusActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            syariahCheckEakadStatusActivity.d_();
            throw null;
        }
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity) {
        int i = 2 % 2;
        int i2 = f640a + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) syariahCheckEakadStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = g + 123;
        f640a = i4 % 128;
        if (i4 % 2 == 0) {
            return userAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity = (SyariahCheckEakadStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 3;
        f640a = i2 % 128;
        if (i2 % 2 == 0) {
            syariahCheckEakadStatusActivity.d_();
            return Unit.INSTANCE;
        }
        syariahCheckEakadStatusActivity.d_();
        int i3 = 63 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (String) TuitionPaymentFragmentbindingInflater1(832829722, new Object[]{syariahCheckEakadStatusActivity}, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -832829721);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahCheckEakadStatusActivity syariahCheckEakadStatusActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentbindingInflater1(923058303, new Object[]{syariahCheckEakadStatusActivity}, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -923058303);
    }

    static {
        onTransact = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 11;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 9;
        f640a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        f640a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return R.layout.activity_syariah_check_eakad_status;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 95;
        f640a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 69;
        f640a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentbindingInflater1 = WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(1540475427, new Object[]{this}, WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(), WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentbindingInflater1, -1540475425);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f640a + 77;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = f640a + 71;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        d = new int[]{-1652576462, -1546503326, 1842004847, 858286958, -2131869674, -1474131566, -1811417810, -2119111795, 1737874153, 1183507736, 752227964, -329524731, -142823712, 1907267768, -1318790415, 2057513305, -2139037356, -1962247651};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 75;
        f640a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, int r8, byte r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity.$$c
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 * 56
            int r9 = 122 - r9
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity.$$i(short, int, byte):java.lang.String");
    }
}
