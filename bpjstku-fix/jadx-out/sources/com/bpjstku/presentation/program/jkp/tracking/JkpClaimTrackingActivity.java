package com.bpjstku.presentation.program.jkp.tracking;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.jkp.model.request.JkpClaimTrackRequest;
import com.bpjstku.databinding.ActivityJkpClaimTrackingBinding;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.domain.jkp.model.JkpTrackClaim;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.BufferProviderState;
import defpackage.Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.deriveCodec;
import defpackage.getCameraState;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.hasCameraTransform;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onBackCompletedFallback;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.unregisterLifecycle;
import defpackage.updateSessionConfigSynchronous;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
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
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u001b\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/tracking/JkpClaimTrackingActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityJkpClaimTrackingBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/jht/model/Kpj;", "Lcom/bpjstku/domain/jht/model/Kpj;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCamera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpClaimTrackingActivity extends BindingReactiveFormActivity<ActivityJkpClaimTrackingBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int b = R.layout.activity_jkp_claim_tracking;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {38, 31, -70, -1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 209;
    private static int asInterface = 0;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f606a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i8 | i)) | i7;
        int i10 = ~i;
        int i11 = ~(i8 | i10 | i6);
        int i12 = (~(i | i7)) | i8 | (~(i10 | i6));
        int i13 = i6 + i3 + i5 + (325770565 * i2) + ((-1284996642) * i4);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i6) - 1205338112) + ((-1364710777) * i3) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i5) + ((-667418624) * i2) + ((-145752064) * i4) + (1116340224 * i14);
        int i16 = (i6 * (-1991011123)) + 595473426 + (i3 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * TypedValues.Custom.TYPE_REFERENCE) + (i5 * (-1991010217)) + (i2 * (-1223611789)) + (i4 * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return b(objArr);
    }

    private static void c(short s, short s2, short s3, Object[] objArr) {
        int i = 98 - (s2 * 14);
        int i2 = 197 - s3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - s];
        int i3 = 52 - s;
        int i4 = -1;
        if (bArr == null) {
            i = (i3 + (-i2)) - 11;
            i2++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i = (i + (-bArr[i2])) - 11;
            i2 = i6 + 1;
            i4 = i5;
        }
    }

    public JkpClaimTrackingActivity() {
        final JkpClaimTrackingActivity jkpClaimTrackingActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8>() { // from class: com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 invoke() {
                LifecycleOwner lifecycleOwner = jkpClaimTrackingActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/tracking/JkpClaimTrackingActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JkpClaimTrackingActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        JkpClaimTrackingActivity jkpClaimTrackingActivity = (JkpClaimTrackingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f606a;
        int i3 = i2 + 117;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = jkpClaimTrackingActivity.b;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 49;
        d = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityJkpClaimTrackingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 91;
        f606a = i2 % 128;
        int i3 = i2 % 2;
        JkpClaimTrackingActivity$bindingInflater$1 jkpClaimTrackingActivity$bindingInflater$1 = JkpClaimTrackingActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = d + 53;
        f606a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return jkpClaimTrackingActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 123;
        f606a = i2 % 128;
        if (i2 % 2 == 0) {
            INotificationSideChannelStub().tilChooseKpj.getEditText();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityJkpClaimTrackingBinding activityJkpClaimTrackingBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityJkpClaimTrackingBindingINotificationSideChannelStub.tilChooseKpj.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: getSuggestedStreamSpecs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JkpClaimTrackingActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        MaterialButton materialButton = activityJkpClaimTrackingBindingINotificationSideChannelStub.btnCheck;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: transformSurfaceConfig
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (View) obj2};
                return (Unit) JkpClaimTrackingActivity.TuitionPaymentFragmentbindingInflater1(onBackCompletedFallback.b(), onBackCompletedFallback.b(), 1002505590, onBackCompletedFallback.b(), onBackCompletedFallback.b(), -1002505589, objArr);
            }
        }));
        int i3 = f606a + 13;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 107;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64839), 1356 - Color.blue(0), 38 - ExpandableListView.getPackedPositionType(0L), 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47772), 468 - (Process.myTid() >> 22), Color.rgb(0, 0, 0) + 16777229, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 67;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $10 + 25;
        $11 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new Observer() { // from class: Camera2DeviceSurfaceManager
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JkpClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f606a + 39;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JkpClaimTrackingActivity jkpClaimTrackingActivity = this;
        Intrinsics.checkNotNullParameter(jkpClaimTrackingActivity, "");
        jkpClaimTrackingActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_eclaim));
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i2 = d + 71;
            f606a = i2 % 128;
            Kpj kpj = null;
            if (i2 % 2 == 0) {
                TextInputEditText textInputEditText = INotificationSideChannelStub().edtChooseKpj;
                kpj.hashCode();
                throw null;
            }
            TextInputEditText textInputEditText2 = INotificationSideChannelStub().edtChooseKpj;
            Kpj kpj2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (kpj2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                kpj = kpj2;
            }
            textInputEditText2.setText(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        int i3 = d + 93;
        f606a = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        JkpClaimTrackingActivity jkpClaimTrackingActivity = (JkpClaimTrackingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f606a + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = jkpClaimTrackingActivity.INotificationSideChannelStub().btnCheck;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = d + 115;
        f606a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = d + 71;
        f606a = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnCheck;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = d + 85;
        f606a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilChooseKpj;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = d + 91;
        f606a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = f606a + 17;
                d = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = f606a + 17;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = f606a + 77;
            d = i6 % 128;
            int i7 = i6 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:17:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:19:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:22:0x0221 A[Catch: all -> 0x0a29, TryCatch #1 {all -> 0x0a29, blocks: (B:20:0x020d, B:22:0x0221, B:23:0x0252, B:59:0x074f, B:61:0x0763, B:62:0x0795, B:64:0x07c7, B:65:0x083d), top: B:99:0x020d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x026c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0340  */
    /* JADX WARN: Code duplicated, block: B:34:0x0393  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrB$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = f606a + 101;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
                int iAlpha = Color.alpha(0) + 23;
                byte b = $$a[5];
                Object[] objArr2 = new Object[1];
                c((byte) 15, b, (short) (b | 192), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, packedPositionGroup, iAlpha, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i3 = 48 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                    int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i4 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr = $$a;
                    Object[] objArr3 = new Object[1];
                    c(bArr[7], bArr[5], (short) 156, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, windowTouchSlop, i4, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrB$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step1).substring(1, 2).codePointAt(0) - 953687190;
                int i5 = ~iCodePointAt;
                int i6 = ((((-1357726143) + (((~((-158048433) | i5)) | 237728) * (-108))) + (((~(i5 | 370650858)) | ((~((-370650859) | iCodePointAt)) | (-528461563))) * 54)) + ((iCodePointAt | (-528461563)) * 54)) - 1263519306;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArrB$7879113[3])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{52505, 60169, 52595, 44395, 20810, 39314, 54587, 46442, 31049, 56634, 19450, 41345, 64870, 40252, 24951, 18850, 34126, 25946, 2421, 20922}, -Process.getGidForName(""), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{50014, 51785, 49975, 35886, 39750, 56120, 56102, 37935, 45891, 5925, 2399, 58163, 62222, 48179, 43848, 2838, 35641, 17409, 50027, 4887}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {968342459};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42049), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1726, TextUtils.indexOf("", "", 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -1263519306, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                        int i9 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr2 = $$a;
                        Object[] objArr8 = new Object[1];
                        c(bArr2[7], bArr2[5], (short) 156, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, keyRepeatDelay, i9, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{54037, 65323, 54132, 47430, 53868, 22970, 52086, 41293, 64120, 24078, 35777, 25082, 58210, 35139, 57918, 35251, 39752, 29055, 35408, 37257, 45896, 22875, 45652, 47511, 43850, 16767}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{1327, 1435, 1354, 17396, 13392, 16776, 7504, 23537, 7233, 47159, 37873, 31158, 13650, 29665, 1093, 37284, 19810, 35793, 27768}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).length() - 5, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char gidForName = (char) (29943 - Process.getGidForName(""));
                            int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                            int i10 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte[] bArr3 = $$a;
                            Object[] objArr11 = new Object[1];
                            c(bArr3[7], bArr3[5], (short) ($$b >>> 1), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, iNormalizeMetaState, i10, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                            int iMyPid = 23 - (Process.myPid() >> 22);
                            byte b2 = $$a[5];
                            Object[] objArr12 = new Object[1];
                            c((byte) 15, b2, (short) (b2 | 192), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, edgeSlop, iMyPid, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                byte b3 = $$a[5];
                Object[] objArr13 = new Object[1];
                c((byte) 15, b3, (short) (b3 | 192), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity, i11, iResolveSizeAndState, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity2 = (char) (29944 - Drawable.resolveOpacity(0, 0));
                    int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i12 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr4[7], bArr4[5], (short) 156, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, windowTouchSlop2, i12, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrB$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step1).substring(1, 2).codePointAt(0) - 953687190;
                int i13 = ~iCodePointAt2;
                int i14 = ((((-1357726143) + (((~((-158048433) | i13)) | 237728) * (-108))) + (((~(i13 | 370650858)) | ((~((-370650859) | iCodePointAt2)) | (-528461563))) * 54)) + ((iCodePointAt2 | (-528461563)) * 54)) - 1263519306;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArrB$7879113[3])[0] = i16 ^ (i16 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{52505, 60169, 52595, 44395, 20810, 39314, 54587, 46442, 31049, 56634, 19450, 41345, 64870, 40252, 24951, 18850, 34126, 25946, 2421, 20922}, -Process.getGidForName(""), objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{50014, 51785, 49975, 35886, 39750, 56120, 56102, 37935, 45891, 5925, 2399, 58163, 62222, 48179, 43848, 2838, 35641, 17409, 50027, 4887}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {968342459};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42049), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1726, TextUtils.indexOf("", "", 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -1263519306, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mirror2 = (char) (AndroidCharacter.getMirror('0') + 29896);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                    int i17 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr5 = $$a;
                    Object[] objArr19 = new Object[1];
                    c(bArr5[7], bArr5[5], (short) 156, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror2, keyRepeatDelay2, i17, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$7879113);
                Object[] objArr20 = new Object[1];
                e(new char[]{54037, 65323, 54132, 47430, 53868, 22970, 52086, 41293, 64120, 24078, 35777, 25082, 58210, 35139, 57918, 35251, 39752, 29055, 35408, 37257, 45896, 22875, 45652, 47511, 43850, 16767}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{1327, 1435, 1354, 17396, 13392, 16776, 7504, 23537, 7233, 47159, 37873, 31158, 13650, 29665, 1093, 37284, 19810, 35793, 27768}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).length() - 5, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName2 = (char) (29943 - Process.getGidForName(""));
                    int iNormalizeMetaState2 = 1755 - KeyEvent.normalizeMetaState(0);
                    int i18 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr6 = $$a;
                    Object[] objArr111 = new Object[1];
                    c(bArr6[7], bArr6[5], (short) ($$b >>> 1), objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName2, iNormalizeMetaState2, i18, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char jumpTapTimeout2 = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                    int iMyPid2 = 23 - (Process.myPid() >> 22);
                    byte b4 = $$a[5];
                    Object[] objArr112 = new Object[1];
                    c((byte) 15, b4, (short) (b4 | 192), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout2, edgeSlop2, iMyPid2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i19 = ((int[]) objArrB$7879113[1])[0];
        int i20 = ((int[]) objArrB$7879113[0])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i23 = ~i22;
            int i24 = i21 + (-144688828) + (((~((-504828599) | i23)) | (~(292226172 | i23))) * (-867)) + (((~((-504828599) | i22)) | 236196482 | (~(292226172 | i22))) * (-1734)) + (((~(i22 | 528422654)) | (~(i23 | (-236196483))) | (~((-268632117) | i22))) * 867);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr21[3])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i27 = d + 17;
                f606a = i27 % 128;
                int i28 = 2;
                int i29 = i27 % 2;
                int i30 = 0;
                while (i30 < strArr.length) {
                    int i31 = d + 37;
                    f606a = i31 % 128;
                    int i32 = i31 % i28;
                    arrayList.add(strArr[i30]);
                    i30++;
                    i28 = 2;
                }
            }
            int[] iArr = new int[i20];
            int i33 = i20 - 1;
            iArr[i33] = 1;
            Toast.makeText((Context) null, iArr[((i20 * i33) % 2) - 1], 1).show();
            int i34 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iMyPid3 = Process.myPid();
            int i35 = ~iMyPid3;
            int i36 = i34 + (-985824095) + (((~(768286436 | i35)) | (-1073692671)) * 98) + (((~(i35 | (-980888863))) | 768286436 | (~(980888862 | iMyPid3))) * (-49)) + (((~(iMyPid3 | 768286436)) | 92803808) * 49);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr22[3])[0] = i38 ^ (i38 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iBlue = Color.blue(0) + 1031;
            int keyRepeatDelay3 = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr7 = $$a;
            Object[] objArr23 = new Object[1];
            c(bArr7[7], bArr7[5], (short) ($$b >>> 2), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iBlue, keyRepeatDelay3, 1357589585, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(new char[]{54037, 65323, 54132, 47430, 53868, 22970, 52086, 41293, 64120, 24078, 35777, 25082, 58210, 35139, 57918, 35251, 39752, 29055, 35408, 37257, 45896, 22875, 45652, 47511, 43850, 16767}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(new char[]{1327, 1435, 1354, 17396, 13392, 16776, 7504, 23537, 7233, 47159, 37873, 31158, 13650, 29665, 1093, 37284, 19810, 35793, 27768}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iMyPid4 = (Process.myPid() >> 22) + 1031;
            int iAlpha2 = Color.alpha(0) + 15;
            byte[] bArr8 = $$a;
            Object[] objArr26 = new Object[1];
            c(bArr8[7], bArr8[5], (short) 156, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSizeAndState, iMyPid4, iAlpha2, 1344079056, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i39 = d + 119;
            f606a = i39 % 128;
            int i40 = i39 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                int iRgb = (-16777201) - Color.rgb(0, 0, 0);
                byte b5 = (byte) ($$b >>> 2);
                byte b6 = $$a[7];
                Object[] objArr27 = new Object[1];
                c(b5, b6, b6, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, offsetAfter, iRgb, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i41 = ((int[]) objArr28[3])[0];
            int i42 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i43 = 619471748 + (((~((~iMaxMemory) | 78875280)) | (-234613466)) * 529) + (((~(iMaxMemory | 78875280)) | (-165404890)) * 529) + 85159309;
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr[2])[0] = i45 ^ (i45 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            e(new char[]{52505, 60169, 52595, 44395, 20810, 39314, 54587, 46442, 31049, 56634, 19450, 41345, 64870, 40252, 24951, 18850, 34126, 25946, 2421, 20922}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(new char[]{50014, 51785, 49975, 35886, 39750, 56120, 56102, 37935, 45891, 5925, 2399, 58163, 62222, 48179, 43848, 2838, 35641, 17409, 50027, 4887}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {968342459};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - Color.green(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, 85159309, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                byte[] bArr9 = $$a;
                Object[] objArr33 = new Object[1];
                c(bArr9[7], bArr9[5], (short) ($$b >>> 2), objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop3, packedPositionType, modifierMetaStateMask, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTouchSlop() >> 8) + 45993), View.combineMeasuredStates(0, 0) + 1117, TextUtils.indexOf((CharSequence) "", '0') + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                int keyRepeatDelay4 = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b7 = (byte) ($$b >>> 2);
                byte b8 = $$a[7];
                Object[] objArr34 = new Object[1];
                c(b7, b8, b8, objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(tapTimeout, scrollBarFadeDuration, keyRepeatDelay4, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(new char[]{54037, 65323, 54132, 47430, 53868, 22970, 52086, 41293, 64120, 24078, 35777, 25082, 58210, 35139, 57918, 35251, 39752, 29055, 35408, 37257, 45896, 22875, 45652, 47511, 43850, 16767}, -TextUtils.lastIndexOf("", '0', 0), objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(new char[]{1327, 1435, 1354, 17396, 13392, 16776, 7504, 23537, 7233, 47159, 37873, 31158, 13650, 29665, 1093, 37284, 19810, 35793, 27768}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int iMyPid5 = 1031 - (Process.myPid() >> 22);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr37 = new Object[1];
                    c(bArr10[7], bArr10[5], (short) 156, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild, iMyPid5, keyRepeatTimeout, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                    int iMyTid = 15 - (Process.myTid() >> 22);
                    byte[] bArr11 = $$a;
                    Object[] objArr38 = new Object[1];
                    c(bArr11[7], bArr11[5], (short) ($$b >>> 2), objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveSize, tapTimeout2, iMyTid, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i46 = ((int[]) objArr[2])[0];
            int i47 = ((int[]) objArr[3])[0];
            int i48 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i49 = i46 + 1972551637 + ((~((~iIdentityHashCode) | (-336660641))) * (-116)) + ((585430543 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 341150373)) | 580940810) * 116);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr39[2])[0] = i51 ^ (i51 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        for (String str : strArr4) {
            int i52 = f606a + 39;
            d = i52 % 128;
            int i53 = i52 % 2;
            arrayList2.add(str);
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f606a + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-1827100284) + (((~(1587270695 | iIdentityHashCode)) | (-757283153)) * (-964)) + (((~((~iIdentityHashCode) | 1587270695)) | (-2143026552)) * (-964))) {
            int[] iArr = new int[1697981712];
            iArr[1697981711] = 1;
            int i5 = (-1731691536) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode2;
        int i8 = (~((-804906533) | i7)) | 104898564;
        int i9 = ~(iIdentityHashCode2 | (-1074141465));
        if (i6 != (-1296364376) + ((i8 | i9) * (-713)) + (i9 * 1426) + ((~((-1774149433) | i7)) * 713)) {
            throw null;
        }
        super.onResume();
        int i10 = f606a + 123;
        d = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 91;
        f606a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != ((((~(1645070951 | iIdentityHashCode)) | (-1385752056)) * 262) - 336090264) + (((~((~iIdentityHashCode) | 1645070951)) | (-1385752056)) * 262)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_error_empty_number).substring(3, 4).codePointAt(0) - 1613083147;
            if (i4 != 959287048 + ((~((~iCodePointAt) | (-1367387401))) * (-116)) + ((607867447 | iCodePointAt) * 116) + (((~(iCodePointAt | 1437854990)) | 537399857) * 116)) {
                throw null;
            }
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ~System.identityHashCode(this);
        if (i5 != (-856319252) + (((~(i6 | 2042084091)) | 536971873) * (-828)) + ((i6 | 2042084091) * (-828)) + 1371486448) {
            throw new RuntimeException("2097473060");
        }
        super.onStart();
        int i7 = d + 115;
        f606a = i7 % 128;
        int i8 = i7 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -48790679
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void b(final JkpClaimTrackingActivity jkpClaimTrackingActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            updateSessionConfigSynchronous.Companion companion = updateSessionConfigSynchronous.INSTANCE;
            updateSessionConfigSynchronous updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1 = updateSessionConfigSynchronous.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: Camera2CaptureRequestBuilderApi23Impl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return JkpClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Kpj) obj);
                }
            }, null);
            FragmentManager supportFragmentManager = jkpClaimTrackingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = d + 91;
                f606a = i2 % 128;
                int i3 = i2 % 2;
                updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = f606a + 39;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    private static /* synthetic */ Object b(Object[] objArr) {
        final Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8;
        Kpj kpj;
        String str;
        User userAsBinder;
        String str2;
        String str3;
        JkpClaimTrackingActivity jkpClaimTrackingActivity = (JkpClaimTrackingActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = d + 33;
        f606a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            int i4 = 63 / 0;
            if (jkpClaimTrackingActivity.RemoteActionCompatParcelizer()) {
                camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 = (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8) jkpClaimTrackingActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                kpj = jkpClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (kpj == null) {
                    int i5 = f606a + 91;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = f606a + 9;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                    kpj = null;
                }
                str = kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Intrinsics.checkNotNullParameter(str, "");
                MutableLiveData<VirtualCameraAdapter1<JkpTrackClaim>> mutableLiveData = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                userAsBinder = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentbindingInflater1.asBinder();
                if (userAsBinder != null) {
                    str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str3 = userAsBinder.b;
                    if (str3 != null) {
                        int i9 = f606a;
                        int i10 = i9 + 115;
                        d = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = i9 + 47;
                        d = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        str3 = "";
                    }
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new JkpClaimTrackRequest(str2, str, str3))));
                    final Function1 function1 = new Function1() { // from class: lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineTorchTask
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, (JkpTrackClaim) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: lambdapreCapture1androidxcameracamera2internalCamera2CapturePipelineTorchTask
                        public static int TuitionPaymentFragmentbindingInflater1 = 1838856203;

                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: lambdapreCapture3androidxcameracamera2internalCamera2CapturePipelineTorchTask
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Camera2CapturePipelineTorchTaskExternalSyntheticLambda0
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } else if (jkpClaimTrackingActivity.RemoteActionCompatParcelizer()) {
            camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 = (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8) jkpClaimTrackingActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            kpj = jkpClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (kpj == null) {
                int i14 = f606a + 91;
                d = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i16 = f606a + 9;
                d = i16 % 128;
                int i17 = i16 % 2;
                kpj = null;
            }
            str = kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullParameter(str, "");
            MutableLiveData<VirtualCameraAdapter1<JkpTrackClaim>> mutableLiveData2 = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            userAsBinder = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentbindingInflater1.asBinder();
            if (userAsBinder != null) {
                str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str2 == null) {
                    str2 = "";
                }
                str3 = userAsBinder.b;
                if (str3 != null) {
                    int i18 = f606a;
                    int i19 = i18 + 115;
                    d = i19 % 128;
                    int i110 = i19 % 2;
                    int i111 = i18 + 47;
                    d = i111 % 128;
                    int i112 = i111 % 2;
                } else {
                    str3 = "";
                }
                deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new JkpClaimTrackRequest(str2, str, str3))));
                final Function1 function3 = new Function1() { // from class: lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineTorchTask
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, (JkpTrackClaim) obj);
                    }
                };
                logToString logtostring2 = new logToString() { // from class: lambdapreCapture1androidxcameracamera2internalCamera2CapturePipelineTorchTask
                    public static int TuitionPaymentFragmentbindingInflater1 = 1838856203;

                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function3.invoke(obj);
                    }
                };
                final Function1 function4 = new Function1() { // from class: lambdapreCapture3androidxcameracamera2internalCamera2CapturePipelineTorchTask
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: Camera2CapturePipelineTorchTaskExternalSyntheticLambda0
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function4.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(JkpClaimTrackingActivity jkpClaimTrackingActivity, Kpj kpj) {
        int i = 2 % 2;
        int i2 = d + 73;
        f606a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kpj, "");
        jkpClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = kpj;
        jkpClaimTrackingActivity.INotificationSideChannelStub().edtChooseKpj.setText(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i4 = d + 105;
        f606a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkpClaimTrackingActivity jkpClaimTrackingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            jkpClaimTrackingActivity.MediaBrowserCompat();
            str = "loading_track_claim_jkp";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = d + 61;
            f606a = i2 % 128;
            int i3 = i2 % 2;
            jkpClaimTrackingActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            Kpj kpj = null;
            if (Intrinsics.areEqual(((JkpTrackClaim) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, "JKP01")) {
                JkpClaimTrackingTimelineActivity.Companion companion = JkpClaimTrackingTimelineActivity.INSTANCE;
                JkpClaimTrackingActivity jkpClaimTrackingActivity2 = jkpClaimTrackingActivity;
                JkpTrackClaim jkpTrackClaim = (JkpTrackClaim) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Kpj kpj2 = jkpClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (kpj2 == null) {
                    int i4 = f606a + 59;
                    d = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i5 = 58 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                } else {
                    kpj = kpj2;
                }
                JkpClaimTrackingTimelineActivity.Companion.TuitionPaymentFragmentbindingInflater1(jkpClaimTrackingActivity2, jkpTrackClaim, kpj);
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkpClaimTrackingActivity, "Data Tidak Tersedia.", null);
            }
            str = "success_track_claim_jkp";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            String strConcat = "failure_track_claim_jkp_+".concat(String.valueOf(virtualCameraAdapter1));
            jkpClaimTrackingActivity.IconCompatParcelizer();
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = jkpClaimTrackingActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_alert_red, "", strValueOf, string);
            FragmentManager supportFragmentManager = jkpClaimTrackingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = strConcat;
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_tracking_jkp_result", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(JkpClaimTrackingActivity jkpClaimTrackingActivity, View view) {
        int iB = onBackCompletedFallback.b();
        int iB2 = onBackCompletedFallback.b();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iB, onBackCompletedFallback.b(), 1002505590, onBackCompletedFallback.b(), iB2, -1002505589, new Object[]{jkpClaimTrackingActivity, view});
    }

    static {
        g = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 43;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iB = onBackCompletedFallback.b();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 557669835;
        return ((Integer) TuitionPaymentFragmentbindingInflater1(iB, onBackCompletedFallback.b(), -793571032, onBackCompletedFallback.b(), length, 793571032, new Object[]{this})).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f606a + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 51;
        f606a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 252705695, hasCameraTransform.AnonymousClass3.TuitionPaymentFragmentbindingInflater1(), -1709655784, hasCameraTransform.AnonymousClass3.TuitionPaymentFragmentbindingInflater1(), hasCameraTransform.AnonymousClass3.TuitionPaymentFragmentbindingInflater1(), 1709655786, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 7;
        f606a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 37;
        f606a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -5529562158680396699L;
    }

    private static String $$i(short s, int i, int i2) {
        int i3 = 3 - (i2 * 2);
        int i4 = (s * 4) + 107;
        int i5 = i * 2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i4 += bArr[i3];
        }
    }
}
