package com.bpjstku.presentation.program.jkp.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.jkp.model.request.CheckSubmissionJkpRequest;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivityJkpEligibilityBinding;
import com.bpjstku.domain.jkp.model.SubmissionJkpCheckItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.analytics.connector.internal.zzg;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8;
import defpackage.IntegerRes;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMaxImages;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
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
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u00020\u001a8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0015\u0010\u001c\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0017\u0010\b\u001a\u0004\u0018\u00010\"8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/claim/JkpEligibilityActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkpEligibilityBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LIntegerRes;", "LCamera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetStringOrNull;", "g", "LgetStringOrNull;", "", "Ljava/lang/String;", "Lcom/bpjstku/domain/user/model/User;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpEligibilityActivity extends BindingBaseActivity<ActivityJkpEligibilityBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final String asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int b = R.layout.activity_jkp_eligibility;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private getStringOrNull g;
    private static final byte[] $$c = {115, 25, -47, -94};
    private static final int $$f = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {36, -74, -79, -21, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 236;
    private static int notify = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f605a = 0;
    private static int INotificationSideChannel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = i5 | i2;
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~(i2 | i8)) | (~(i9 | i5));
        int i12 = i5 + i + i6 + (1389894630 * i3) + ((-1243605516) * i4);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i5) + 1335230464 + (862422157 * i) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i6) + (1607991296 * i3) + ((-548405248) * i4) + ((-1553596416) * i13);
        int i15 = ((i5 * (-88671125)) - 261777699) + ((-88671149) * i) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i6 * (-88671137)) + (i3 * (-349388198)) + (i4 * (-147040884)) + (i13 * 182059008);
        if (i14 + (i15 * i15 * (-132513792)) != 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        JkpEligibilityActivity jkpEligibilityActivity = (JkpEligibilityActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = INotificationSideChannel + 103;
        f605a = i17 % 128;
        int i18 = i17 % 2;
        if (((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null) != (-1530675584) + (((~(1799257216 | i8)) | 969269673) * 226) + (((~((-969269674) | i)) | 688152704 | (~(2080374185 | i8))) * (-113)) + ((~(1799257216 | i)) * 113)) {
            int i19 = INotificationSideChannel + 53;
            f605a = i19 % 128;
            int i20 = i19 % 2;
            int[] iArr = new int[1743042566];
            iArr[1743042565] = 1;
            int i21 = (-1156323298) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i22 = INotificationSideChannel + 41;
            f605a = i22 % 128;
            int i23 = i22 % 2;
        }
        if (((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) != (((-947944364) + (((~(2052640338 | i8)) | (~((-336729008) | i))) * (-370))) + ((((~(i | 2052640338)) | (~((-336729008) | i8))) | 1783155792) * (-370))) - 1657320544) {
            throw null;
        }
        super.onResume();
        int i24 = INotificationSideChannel + 33;
        f605a = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r6 = 144 - r6
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
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.c(short, int, byte, java.lang.Object[]):void");
    }

    public JkpEligibilityActivity() {
        final JkpEligibilityActivity jkpEligibilityActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new JkpEligibilityActivity$special$$inlined$viewModel$default$1(jkpEligibilityActivity));
        final JkpEligibilityActivity jkpEligibilityActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = jkpEligibilityActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8>() { // from class: com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 invoke() {
                LifecycleOwner lifecycleOwner = jkpEligibilityActivity;
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
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        this.asBinder = getMaxImages.MediaBrowserCompatMediaBrowserImplApi213();
        this.a = LazyKt.lazy(new Function0() { // from class: getConfiguredSurfaces
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JkpEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/claim/JkpEligibilityActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JkpEligibilityActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f605a;
        int i3 = i2 + 97;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.b;
        int i6 = i2 + 13;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkpEligibilityBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 99;
        f605a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            JkpEligibilityActivity$bindingInflater$1 jkpEligibilityActivity$bindingInflater$1 = JkpEligibilityActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            obj.hashCode();
            throw null;
        }
        JkpEligibilityActivity$bindingInflater$1 jkpEligibilityActivity$bindingInflater$2 = JkpEligibilityActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = INotificationSideChannel + 113;
        f605a = i3 % 128;
        if (i3 % 2 == 0) {
            return jkpEligibilityActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new Observer() { // from class: createReprocessCaptureRequest
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JkpEligibilityActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = INotificationSideChannel + 9;
        f605a = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JkpEligibilityActivity.this.d_();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        JkpEligibilityActivity jkpEligibilityActivity = (JkpEligibilityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 1;
        f605a = i2 % 128;
        int i3 = i2 % 2;
        final Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 = (Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8) jkpEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        MutableLiveData<VirtualCameraAdapter1<SubmissionJkpCheckItem>> mutableLiveData = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentbindingInflater1.asBinder();
        if (userAsBinder != null) {
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CheckSubmissionJkpRequest(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1), String.valueOf(userAsBinder.b), String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(userAsBinder.asInterface)))));
            final Function1 function1 = new Function1() { // from class: lambdapreCapture4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.b(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, (SubmissionJkpCheckItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: Camera2CaptureRequestBuilder
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: Camera2CapturePipelineTorchTaskExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault2(camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Camera2CapturePipelineTorchTaskExternalSyntheticLambda1
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        int i4 = f605a + 125;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f605a + 95;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        JkpEligibilityActivity jkpEligibilityActivity = this;
        Intrinsics.checkNotNullParameter(jkpEligibilityActivity, "");
        jkpEligibilityActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJkpEligibilityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJkpEligibilityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("Pengajuan Klaim JKP");
        int i4 = f605a + 3;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(d)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3291, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 651 - Color.green(0), 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -450685997, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 53;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i10 = $10 + 81;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 651 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, -450685997, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            int i12 = $11 + 43;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JkpEligibilityActivity jkpEligibilityActivity = JkpEligibilityActivity.this;
            jkpEligibilityActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(jkpEligibilityActivity.asBinder)), "Open With"));
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JkpEligibilityActivity.this.d_();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f605a + 117;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = INotificationSideChannel + 9;
                f605a = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = INotificationSideChannel + 77;
            f605a = i6 % 128;
            int i7 = i6 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            Object[] objArr3 = new Object[1];
            c((short) 141, (byte) 52, $$a[132], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iIndexOf, i2, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.next).substring(1, 2).length() + 186, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlTrustedSiteSectionTitle).substring(0, 27).codePointAt(14) - 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 3, new char[]{'\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(true, 191 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step2).substring(4, 5).codePointAt(0) - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 105, new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) Color.blue(0);
            int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            Object[] objArr6 = new Object[1];
            c((short) 89, (byte) 52, $$a[132], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, maximumFlingVelocity, iArgb, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue2 = (char) Color.blue(0);
                int mirror = AndroidCharacter.getMirror('0') + 983;
                int i3 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                short s = (short) (bArr[0] + 1);
                byte b = bArr[7];
                Object[] objArr7 = new Object[1];
                c(s, b, b, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue2, mirror, i3, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr8[3])[0];
            int i5 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i6 = (-1138410580) + (((~(startUptimeMillis | (-555347260))) | (-799627430)) * (-465)) + (((-555347260) | (~((-799627430) | startUptimeMillis))) * 930) + ((startUptimeMillis | (-554256418)) * 465) + 529549175;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 150, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step1).substring(25, 35).length() - 3, new char[]{65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f'}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 189, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {1470931620};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46038), 1134 - View.resolveSize(0, 0), 17 - TextUtils.lastIndexOf("", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 529549175, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i9 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
                    Object[] objArr13 = new Object[1];
                    c((short) 141, (byte) 52, $$a[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i9, packedPositionChild, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16823209), 1117 - View.MeasureSpec.getMode(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
                    byte[] bArr2 = $$a;
                    short s2 = (short) (bArr2[0] + 1);
                    byte b2 = bArr2[7];
                    Object[] objArr14 = new Object[1];
                    c(s2, b2, b2, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, threadPriority, iLastIndexOf, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(false, TextUtils.getCapsMode("", 0, 0) + 187, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).codePointAt(0) - 88, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima3).substring(12, 18).length() + 8, new char[]{'\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + ModuleDescriptor.MODULE_VERSION, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.thank_you).substring(0, 1).codePointAt(0) - 69, (ViewConfiguration.getLongPressTimeout() >> 16) + 10, new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                        Object[] objArr17 = new Object[1];
                        c((short) 89, (byte) 52, $$a[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, edgeSlop, maximumFlingVelocity2, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int threadPriority2 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                        Object[] objArr18 = new Object[1];
                        c((short) 141, (byte) 52, $$a[132], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, threadPriority2, tapTimeout, 1357589585, false, (String) objArr18[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            int i12 = INotificationSideChannel + 113;
            f605a = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i17 = i14 + (((~((~iFreeMemory) | 1073217471)) * 130) - 679656873) + (((~(iFreeMemory | 1073217471)) | 23101961) * 130);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[2])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i20 = INotificationSideChannel + 29;
                f605a = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (i22 < strArr3.length) {
                    arrayList.add(strArr3[i22]);
                    i22++;
                    int i23 = f605a + 99;
                    INotificationSideChannel = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            int[] iArr = new int[i11];
            int i25 = i11 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i25) % 2) - 1], 1).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i29 = ~iUptimeMillis;
            int i30 = (-2105246249) + (((~((-399293778) | i29)) | 105654289) * (-1188));
            int i31 = (~(iUptimeMillis | 399293777)) | 105654289;
            int i32 = ~(643573947 | i29);
            int i33 = i26 + i30 + ((i31 | i32) * 594) + (((~(399293777 | i29)) | (-937213436) | i32) * 594);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr20[2])[0] = i35 ^ (i35 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
            int i36 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
            byte[] bArr3 = $$a;
            short s3 = (short) (bArr3[0] + 1);
            Object[] objArr21 = new Object[1];
            c(s3, (byte) s3, bArr3[132], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout2, i36, iLastIndexOf2, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i37 = INotificationSideChannel + 101;
            f605a = i37 % 128;
            int i38 = i37 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                int iAxisFromString = MotionEvent.axisFromString("") + 24;
                Object[] objArr22 = new Object[1];
                c((short) 89, (byte) 52, $$a[132], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(absoluteGravity, threadPriority3, iAxisFromString, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i39 = ~((~Process.myTid()) | (-805903391));
            int i40 = ((((-1019035231) | i39) * (-970)) - 988548157) + ((i39 | 213131840) * 970) + 206071872;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr2[3])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(true, 186 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 91, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new char[]{65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f'}, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 92, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_license_key_not_found).substring(0, 21).length() - 5, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 103, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {1470931620};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (KeyEvent.getMaxKeyCode() >> 16)), 1725 - ExpandableListView.getPackedPositionChild(0L), (Process.myPid() >> 22) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 206071872, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumFlingVelocity3 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                int iIndexOf2 = 23 - TextUtils.indexOf("", "");
                Object[] objArr27 = new Object[1];
                c((short) 89, (byte) 52, $$a[132], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumFlingVelocity3, longPressTimeout, iIndexOf2, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr28 = new Object[1];
                e(false, TextUtils.lastIndexOf("", '0') + 188, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step5).substring(28, 29).codePointAt(0) - 32, new char[]{'\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama1).substring(30, 31).codePointAt(0) + 76, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_6).substring(0, 1).codePointAt(0) - 65, 9 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                    int i43 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte[] bArr4 = $$a;
                    short s4 = bArr4[7];
                    Object[] objArr30 = new Object[1];
                    c(s4, (byte) (s4 | 52), bArr4[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, tapTimeout3, i43, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int mode = 1755 - View.MeasureSpec.getMode(0);
                    int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr5 = $$a;
                    short s5 = (short) (bArr5[0] + 1);
                    Object[] objArr31 = new Object[1];
                    c(s5, (byte) s5, bArr5[132], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, mode, scrollBarSize, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[4];
            if (strArr5 != null) {
                int i44 = f605a + 73;
                INotificationSideChannel = i44 % 128;
                int i45 = i44 % 2;
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i46 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i47 = ~elapsedCpuTime;
        int i48 = ~((-1009275672) | i47);
        int i49 = ~(796673245 | elapsedCpuTime);
        int i50 = i46 + (-1774707662) + ((i48 | i49) * 1150) + (((~((-796673246) | i47)) | i49) * (-575)) + (((~(elapsedCpuTime | (-1009275672))) | (~(i47 | 1009275671))) * 575);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[3])[0] = i52 ^ (i52 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f605a + 15;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ~((~((int) Runtime.getRuntime().maxMemory())) | (-1782099951));
        if (i4 != (((-2063122432) | i5) * (-970)) + 1682113726 + ((i5 | 281022481) * 970)) {
            int i6 = f605a + 123;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[2084580116];
            iArr[2084580115] = 1;
            int i8 = 1962905212 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i10 = ~layoutDirection;
        int i11 = (~((-1594246901) | i10)) | 436356704;
        int i12 = ~(layoutDirection | 2142699260);
        if (i9 != ((i11 | i12) * (-252)) + 871795676 + ((i12 | (~(i10 | (-1157890197)))) * 252)) {
            int i13 = INotificationSideChannel + 13;
            f605a = i13 % 128;
            int i14 = i13 % 2;
            int[] iArr2 = new int[1759424873];
            iArr2[1759424872] = 1;
            int i15 = 338668456 % 2;
            Toast.makeText((Context) null, iArr2[-1], 1).show();
            int i16 = INotificationSideChannel + 77;
            f605a = i16 % 128;
            int i17 = i16 % 2;
        }
        super.onStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a2, code lost:
    
        if (r1 != ((((-947944364) + (((~((-1622052411) | r4)) | (~((-957003555) | r2))) * (-370))) + ((((~(r2 | (-1622052411))) | (~(r4 | (-957003555)))) | (-2041495355)) * (-370))) + 560962746)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a4, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.INotificationSideChannel + 65;
        com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.f605a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if ((r11 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b2, code lost:
    
        r11 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        throw new java.lang.RuntimeException("-1226019155");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        r11 = (-1248944062) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        if (r1 == ((((~((~r4) | 1610278783)) * 130) + 839641096) + (((~(r4 | 1610278783)) | 275907088) * 130))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r1 == (((1986192094 + ((~((-1073790977) | r4)) * (-301))) + (((~(1095227460 | r4)) | (~((~r4) | 265239917))) * (-301))) + (((~(r4 | (-265239918))) | 1095227460) * 301))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = new java.util.Random().nextInt();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.INotificationSideChannel
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.f605a = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L37
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r4 = 1
            r1 = r1[r4]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r10)
            int r5 = ~r4
            r6 = 1610278783(0x5ffae77f, float:3.6159118E19)
            r5 = r5 | r6
            int r5 = ~r5
            int r5 = r5 * 130
            r7 = 839641096(0x320be808, float:8.143623E-9)
            int r5 = r5 + r7
            r4 = r4 | r6
            int r4 = ~r4
            r6 = 275907088(0x10720210, float:4.7727674E-29)
            r4 = r4 | r6
            int r4 = r4 * 130
            int r5 = r5 + r4
            if (r1 != r5) goto Lbe
            goto L6b
        L37:
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r10)
            r5 = -1073790977(0xffffffffbfff3fff, float:-1.9941405)
            r5 = r5 | r4
            int r5 = ~r5
            int r5 = r5 * (-301)
            r6 = 1986192094(0x7662e2de, float:1.1504497E33)
            int r6 = r6 + r5
            r5 = 1095227460(0x4147d844, float:12.490299)
            r7 = r5 | r4
            int r7 = ~r7
            int r8 = ~r4
            r9 = 265239917(0xfcf3d6d, float:2.0435436E-29)
            r8 = r8 | r9
            int r8 = ~r8
            r7 = r7 | r8
            int r7 = r7 * (-301)
            int r6 = r6 + r7
            r7 = -265239918(0xfffffffff030c292, float:-2.1881833E29)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 301
            int r6 = r6 + r4
            if (r1 != r6) goto Lbe
        L6b:
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int r2 = r2.nextInt()
            int r4 = ~r2
            r5 = -1622052411(0xffffffff9f5171c5, float:-4.435158E-20)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = -957003555(0xffffffffc6f548dd, float:-31396.432)
            r8 = r7 | r2
            int r8 = ~r8
            r6 = r6 | r8
            int r6 = r6 * (-370)
            r8 = -947944364(0xffffffffc77f8454, float:-65412.33)
            int r8 = r8 + r6
            r4 = r4 | r7
            int r4 = ~r4
            r2 = r2 | r5
            int r2 = ~r2
            r2 = r2 | r4
            r4 = -2041495355(0xffffffff865140c5, float:-3.9356116E-35)
            r2 = r2 | r4
            int r2 = r2 * (-370)
            int r8 = r8 + r2
            r2 = 560962746(0x216f9cba, float:8.1183776E-19)
            int r8 = r8 + r2
            if (r1 != r8) goto Lb6
            super.onCreate(r11)
            int r11 = com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.INotificationSideChannel
            int r11 = r11 + 65
            int r1 = r11 % 128
            com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.f605a = r1
            int r11 = r11 % r0
            if (r11 == 0) goto Lb5
            r11 = 81
            int r11 = r11 / r3
        Lb5:
            return
        Lb6:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "-1226019155"
            r11.<init>(r0)
            throw r11
        Lbe:
            r11 = -1248944062(0xffffffffb58ea042, float:-1.0626466E-6)
            int r11 = r11 % r0
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0095 A[PHI: r0
  0x0095: PHI (r0v11 androidx.fragment.app.FragmentManager) = (r0v10 androidx.fragment.app.FragmentManager), (r0v12 androidx.fragment.app.FragmentManager) binds: [B:19:0x0093, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(JkpEligibilityActivity jkpEligibilityActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        FragmentManager supportFragmentManager;
        int i = 2 % 2;
        int i2 = f605a + 73;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            jkpEligibilityActivity.MediaBrowserCompat();
            str = "loading_check_eligibility_jkp_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            jkpEligibilityActivity.IconCompatParcelizer();
            SubmissionJkpCheckItem submissionJkpCheckItem = (SubmissionJkpCheckItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(submissionJkpCheckItem, "");
            if (Intrinsics.areEqual(submissionJkpCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Y")) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = jkpEligibilityActivity.getString(R.string.label_eligible_for_loss_job_security);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jkpEligibilityActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_document_success, string, "Anda berhak untuk mengajukan klaim manfaat Jaminan Kehilangan Pekerjaan (JKP), proses klaim akan dilanjutkan melalui Aplikasi SIAP KERJA.", string2, null, 112);
                jkpEligibilityActivity.g = getstringornullB;
                if (getstringornullB != null) {
                    int i4 = f605a + 111;
                    INotificationSideChannel = i4 % 128;
                    if (i4 % 2 == 0) {
                        supportFragmentManager = jkpEligibilityActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        int i5 = 42 / 0;
                        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        supportFragmentManager = jkpEligibilityActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                }
                getStringOrNull getstringornull = jkpEligibilityActivity.g;
                if (getstringornull != null) {
                    getstringornull.INotificationSideChannel = jkpEligibilityActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            } else {
                getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                String string3 = jkpEligibilityActivity.getString(R.string.message_sorry);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = jkpEligibilityActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_failed, string3, "Maaf, saat ini anda belum berhak mengajukan klaim manfaat Jaminan Kehilangan Pekerjaan (JKP)", string4, null, 112);
                jkpEligibilityActivity.g = getstringornullB2;
                if (getstringornullB2 != null) {
                    FragmentManager supportFragmentManager2 = jkpEligibilityActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB2.show(supportFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                getStringOrNull getstringornull2 = jkpEligibilityActivity.g;
                if (getstringornull2 != null) {
                    getstringornull2.INotificationSideChannel = jkpEligibilityActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
            str = "success_check_eligibility_jkp_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = i3 + 109;
            f605a = i6 % 128;
            int i7 = i6 % 2;
            jkpEligibilityActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
            String string5 = jkpEligibilityActivity.getString(R.string.message_sorry);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string6 = jkpEligibilityActivity.getString(R.string.action_back);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            getStringOrNull getstringornullB3 = getStringOrNull.Companion.b(R.drawable.ic_failed, string5, strValueOf, string6, null, 112);
            jkpEligibilityActivity.g = getstringornullB3;
            if (getstringornullB3 != null) {
                FragmentManager supportFragmentManager3 = jkpEligibilityActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
                if (supportFragmentManager3.findFragmentByTag(getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB3.show(supportFragmentManager3, getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            getStringOrNull getstringornull3 = jkpEligibilityActivity.g;
            if (getstringornull3 != null) {
                getstringornull3.INotificationSideChannel = jkpEligibilityActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            str = "failure_check_eligibility_jkp_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_eligibility_jkp", str));
        Intrinsics.checkNotNullParameter(jkpEligibilityActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault2(JkpEligibilityActivity jkpEligibilityActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 19;
        f605a = i2 % 128;
        if (i2 % 2 == 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) jkpEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) jkpEligibilityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        cancel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 87;
        cancel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f605a + 121;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 79;
        f605a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zzg.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(2097077992, iTuitionPaymentFragmentbindingInflater1, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2097077992, iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zzg.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1788369038, iTuitionPaymentFragmentbindingInflater1, zzg.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1788369037, iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 111;
        f605a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        int i5 = INotificationSideChannel + 91;
        f605a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void g() {
        d = -83722438;
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
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = 120 - r7
            byte[] r0 = com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.$$c
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + 1
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.claim.JkpEligibilityActivity.$$i(byte, byte, int):java.lang.String");
    }
}
