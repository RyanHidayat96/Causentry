package com.bpjstku.presentation.program.jht.olddaysecurity.tracking;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.JhtClaimTrackRequest;
import com.bpjstku.databinding.ActivityClaimTrackingBinding;
import com.bpjstku.domain.jht.model.JhtClaimTrack;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.domain.programinfo.model.BenefitItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.accessconfigureInstanceInternal;
import defpackage.deriveCodec;
import defpackage.getCameraState;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getServiceInfo;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
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
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00168\u0015X\u0094D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u001c\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/tracking/ClaimTrackingActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityClaimTrackingBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "a", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Lcom/bpjstku/domain/jht/model/Kpj;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/jht/model/Kpj;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LCamera2CameraControlImplExternalSyntheticLambda4;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimTrackingActivity extends BindingReactiveFormActivity<ActivityClaimTrackingBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long b;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_claim_tracking;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {114, -59, 10, 31};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {57, -50, -56, -93, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 118;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f597a = 0;
    private static int asInterface = 0;
    private static int asBinder = 1;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = (~(i7 | (~i5) | i3)) | (~(i8 | i7 | i5));
        int i11 = (~(i5 | i3)) | (~(i6 | i3));
        int i12 = i6 + i3 + i2 + ((-1520811122) * i) + (1880343047 * i4);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i6) - 1254686720) + (875799021 * i3) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i2) + ((-206831616) * i) + (408289280 * i4) + ((-683737088) * i13);
        int i15 = ((i6 * (-660833811)) - 1995073173) + (i3 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i2 * (-660833671)) + (i * 644061726) + (i4 * (-2012083377)) + (i13 * (-1027145728));
        int i16 = i14 + (i15 * i15 * 814809088);
        if (i16 == 1) {
            return b(objArr);
        }
        if (i16 == 2) {
            int i17 = 2 % 2;
            int i18 = asBinder + 9;
            asInterface = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        ClaimTrackingActivity claimTrackingActivity = (ClaimTrackingActivity) objArr[0];
        int i20 = 2 % 2;
        TextInputLayout textInputLayout = claimTrackingActivity.INotificationSideChannelStub().tilChooseKpj;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = claimTrackingActivity.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        claimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i21 = asBinder + 75;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.$$a
            int r8 = r8 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r6 = r6 + r3
            int r8 = r8 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.c(short, short, int, java.lang.Object[]):void");
    }

    public ClaimTrackingActivity() {
        final ClaimTrackingActivity claimTrackingActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = claimTrackingActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/tracking/ClaimTrackingActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ClaimTrackingActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            int i5 = 74 / 0;
        }
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityClaimTrackingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ClaimTrackingActivity$bindingInflater$1 claimTrackingActivity$bindingInflater$1 = ClaimTrackingActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = asInterface + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return claimTrackingActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ActivityClaimTrackingBinding activityClaimTrackingBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityClaimTrackingBindingINotificationSideChannelStub.tilChooseKpj.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: Camera2CapturePipelineScreenFlashTask
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
        }
        MaterialButton materialButton = activityClaimTrackingBindingINotificationSideChannelStub.btnCheck;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CapturePipelineResultListenerChecker
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimTrackingActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
        int i4 = asBinder + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 107;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - Drawable.resolveOpacity(0, 0)), Color.rgb(0, 0, 0) + 16778572, 38 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 894276454, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16824989), ExpandableListView.getPackedPositionChild(0L) + 469, Color.red(0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentbindingInflater1.getValue()).read.observe(this, new b(new Function1() { // from class: lambdapreCapture11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ClaimTrackingActivity claimTrackingActivity = this;
        Intrinsics.checkNotNullParameter(claimTrackingActivity, "");
        claimTrackingActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_eclaim_jkk));
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i4 = asInterface + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            TextInputEditText textInputEditText = INotificationSideChannelStub().edtChooseKpj;
            Kpj kpj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (kpj != null) {
                str = kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i6 = asBinder + 91;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str = null;
            }
            textInputEditText.setText(str);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = asInterface + 103;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 49 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnCheck;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnCheck;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnCheck;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnCheck;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(true);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 14), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iIndexOf, pressedStateDuration, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
                int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[28];
                byte b4 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b3, b4, (short) (b4 | 37), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iIndexOf2, i3, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i4 = (-1896815975) + (((~(937473219 | layoutDirection)) | (-724870794)) * 672);
            int i5 = ~layoutDirection;
            int i6 = ((i4 + (((~(layoutDirection | (-724870794))) | (~((-937473220) | i5))) * (-672))) + (((~(724870793 | i5)) | (-1073002188)) * 672)) - 929557129;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
            int i9 = asBinder + 45;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{15370, 13295, 31650, 1988, 15456, 43057, 19626, 54424, 21208, 14648, 56761, 17811, 57749, 19062, 28295, 46728, 28813, 56104, 65461, 10136}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{44989, 20594, 1769, 20780, 45012, 52137, 12786, 33407, 49461, 23200, 41191, 4972, 29197, 10660, 5100, 57457, 58122, 47278, 33535, 29048}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1253143863};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0)), AndroidCharacter.getMirror('0') + 1678, 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -929557129, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (29944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int iRed = Color.red(0) + 1755;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[28];
                    byte b6 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b5, b6, (short) (b6 | 37), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iRed, fadingEdgeLength, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{4953, 48256, 56405, 64179, 4920, 10065, 60239, 10748, 32202, 46674, 31307, 47268, 52942, 50500, 51469, 19413, 24532, 21568, 22611, 56039, 43204, 60268, 12119, 30193, 14806, 31296}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).length(), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{40263, 40684, 48577, 59866, 40226, 1343, 35550, 14999, 62408, 37938, 7135, 43953, 16602, 59194, 43227, 22683, 53722, 30258, 14806}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1755;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[28];
                        byte b8 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (short) (b8 | 89), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, iIndexOf3, packedPositionType, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[28];
                        Object[] objArr12 = new Object[1];
                        c(b9, (byte) (b9 | 14), bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength2, modifierMetaStateMask, capsMode, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = asInterface + 39;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i17 = i15 + (((~((-63196139) | i16)) | 186878373) * 398) + 957153825 + (((~((~i16) | (-63196139))) | 186878373) * 398);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_8).substring(21, 22).codePointAt(0) - 1645235664;
            int i21 = i20 + ((((-976619885) + (((-38805569) | (~iCodePointAt)) * (-490))) + (((~(iCodePointAt | (-173254001))) | 134448432) * 490)) - 2100859556);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr6 = $$a;
            byte b10 = bArr6[28];
            byte b11 = bArr6[7];
            Object[] objArr15 = new Object[1];
            c(b10, b11, (short) (b11 | 141), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iLastIndexOf, iResolveSizeAndState, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{4953, 48256, 56405, 64179, 4920, 10065, 60239, 10748, 32202, 46674, 31307, 47268, 52942, 50500, 51469, 19413, 24532, 21568, 22611, 56039, 43204, 60268, 12119, 30193, 14806, 31296}, 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{40263, 40684, 48577, 59866, 40226, 1343, 35550, 14999, 62408, 37938, 7135, 43953, 16602, 59194, 43227, 22683, 53722, 30258, 14806}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_atm_bersama).substring(1, 2).length(), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
            int i24 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr7 = $$a;
            byte b12 = bArr7[28];
            byte b13 = bArr7[7];
            Object[] objArr18 = new Object[1];
            c(b12, b13, (short) (b13 | 37), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, bitsPerPixel, i24, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                byte b14 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b14, (byte) (b14 | 52), (short) 193, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(size, maximumDrawingCacheSize, iNormalizeMetaState, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iMyTid = Process.myTid();
            int i27 = (-1450419275) + (((~(iMyTid | 45695499)) | (-198584671)) * (-465)) + ((45695499 | (~((-198584671) | iMyTid))) * 930) + ((iMyTid | (-155593045)) * 465) + 1309309609;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{15370, 13295, 31650, 1988, 15456, 43057, 19626, 54424, 21208, 14648, 56761, 17811, 57749, 19062, 28295, 46728, 28813, 56104, 65461, 10136}, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{44989, 20594, 1769, 20780, 45012, 52137, 12786, 33407, 49461, 23200, 41191, 4972, 29197, 10660, 5100, 57457, 58122, 47278, 33535, 29048}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1253143863};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1135 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.alpha(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 1309309609, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                int iArgb = Color.argb(0, 0, 0, 0) + 15;
                byte[] bArr8 = $$a;
                byte b15 = bArr8[28];
                byte b16 = bArr8[7];
                Object[] objArr25 = new Object[1];
                c(b15, b16, (short) (b16 | 141), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c3, maximumFlingVelocity, iArgb, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 45993), TextUtils.getCapsMode("", 0, 0) + 1117, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int iMyTid2 = (Process.myTid() >> 22) + 1031;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                byte b17 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b17, (byte) (b17 | 52), (short) 193, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(pressedStateDuration2, iMyTid2, iResolveOpacity, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{4953, 48256, 56405, 64179, 4920, 10065, 60239, 10748, 32202, 46674, 31307, 47268, 52942, 50500, 51469, 19413, 24532, 21568, 22611, 56039, 43204, 60268, 12119, 30193, 14806, 31296}, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{40263, 40684, 48577, 59866, 40226, 1343, 35550, 14999, 62408, 37938, 7135, 43953, 16602, 59194, 43227, 22683, 53722, 30258, 14806}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iMyTid3 = 1031 - (Process.myTid() >> 22);
                    int iNormalizeMetaState2 = 15 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr9 = $$a;
                    byte b18 = bArr9[28];
                    byte b19 = bArr9[7];
                    Object[] objArr29 = new Object[1];
                    c(b18, b19, (short) (b19 | 37), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration3, iMyTid3, iNormalizeMetaState2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int i30 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr10 = $$a;
                    byte b20 = bArr10[28];
                    byte b21 = bArr10[7];
                    Object[] objArr30 = new Object[1];
                    c(b20, b21, (short) (b21 | 141), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, doubleTapTimeout2, i30, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i37 = i33 + (-1111539135) + (((~(970024641 | i36)) | 33593622 | (~((-725744472) | i36))) * (-744)) + (((~i36) | 277873792) * 744) + ((i36 | (-33593623)) * 744);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i40 = asBinder + 115;
            asInterface = i40 % 128;
            int i41 = i40 % 2;
            while (i2 < strArr4.length) {
                int i42 = asBinder + 57;
                asInterface = i42 % 128;
                if (i42 % 2 != 0) {
                    arrayList2.add(strArr4[i2]);
                    i2 += 56;
                } else {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i32));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0096, code lost:
    
        if (r1 != ((461366644 + (((-11534401) | r2) * 494)) + (((~(r2 | 1862713111)) | (-1169439059)) * 494))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0098, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder + 111;
        com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        throw new java.lang.RuntimeException("-1756551188");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        if (r1 == (((1312266488 + (((~(1317007271 | r5)) | (~((-487019729) | r4))) * (-370))) + ((((~(r4 | 1317007271)) | (~(r5 | (-487019729)))) | 1115204391) * (-370))) + 308764254)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r1 == (((((~((-939103662) | r4)) | 378111273) * (-241)) - 2114729585) + (((~(r4 | (-560992389))) | (-2147202478)) * 241))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = ~java.lang.System.identityHashCode(r10);
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L45
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r10)
            int r5 = ~r4
            r6 = 1317007271(0x4e7fefa7, float:1.073474E9)
            r7 = r6 | r5
            int r7 = ~r7
            r8 = -487019729(0xffffffffe2f8ab2f, float:-2.2935638E21)
            r9 = r8 | r4
            int r9 = ~r9
            r7 = r7 | r9
            int r7 = r7 * (-370)
            r9 = 1312266488(0x4e3798f8, float:7.700639E8)
            int r9 = r9 + r7
            r5 = r5 | r8
            int r5 = ~r5
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            r5 = 1115204391(0x4278ab27, float:62.16714)
            r4 = r4 | r5
            int r4 = r4 * (-370)
            int r9 = r9 + r4
            r4 = 308764254(0x12675e5e, float:7.3007064E-28)
            int r9 = r9 + r4
            if (r1 != r9) goto La6
            goto L71
        L45:
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r10)
            int r4 = ~r4
            r5 = -939103662(0xffffffffc8066a52, float:-137641.28)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = 378111273(0x16898529, float:2.221758E-25)
            r5 = r5 | r6
            int r5 = r5 * (-241)
            r6 = -2114729585(0xffffffff81f3c98f, float:-8.9553325E-38)
            int r5 = r5 + r6
            r6 = -560992389(0xffffffffde8fef7b, float:-5.185822E18)
            r4 = r4 | r6
            int r4 = ~r4
            r6 = -2147202478(0xffffffff80044a52, float:-3.94003E-40)
            r4 = r4 | r6
            int r4 = r4 * 241
            int r5 = r5 + r4
            if (r1 != r5) goto La6
        L71:
            java.lang.reflect.Member[] r1 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r10)
            int r2 = ~r2
            r4 = -11534401(0xffffffffff4fffbf, float:-2.764781E38)
            r4 = r4 | r2
            int r4 = r4 * 494
            r5 = 461366644(0x1b7fe574, float:2.1167246E-22)
            int r5 = r5 + r4
            r4 = 1862713111(0x6f06bf17, float:4.1702005E28)
            r2 = r2 | r4
            int r2 = ~r2
            r4 = -1169439059(0xffffffffba4bc6ad, float:-7.7734404E-4)
            r2 = r2 | r4
            int r2 = r2 * 494
            int r5 = r5 + r2
            if (r1 != r5) goto La5
            super.onResume()
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface = r2
            int r1 = r1 % r0
            return
        La5:
            throw r3
        La6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-1756551188"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
    
        if (r1 != (((-405293164) + (((~(2137996635 | r4)) | 441059329) * (-756))) + (((~r4) | 2137996635) * 756))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0096, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder + 9;
        com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a2, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        r0 = 8 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        r1 = 1223764008 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (r1 == (((1994258202 + ((r6 | r4) * (-713))) + (r4 * 1426)) + ((~(1829554716 | r5)) * 713))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r1 == ((((-864906616) + (((~(r4 | (-1102617609))) | 272630065) * (-828))) + ((r4 | (-1102617609)) * (-828))) - 1860654624)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = java.lang.System.identityHashCode(r8);
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L43
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r4 = 1
            r1 = r1[r4]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r8)
            int r5 = ~r4
            r6 = -999567174(0xffffffffc46bd0ba, float:-943.26135)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 688130564(0x29040a04, float:2.9318575E-14)
            r6 = r6 | r7
            r7 = 2140991325(0x7f9cef5d, float:NaN)
            r4 = r4 | r7
            int r4 = ~r4
            r6 = r6 | r4
            int r6 = r6 * (-713)
            r7 = 1994258202(0x76ddf71a, float:2.250995E33)
            int r7 = r7 + r6
            int r4 = r4 * 1426
            int r7 = r7 + r4
            r4 = 1829554716(0x6d0cca1c, float:2.7232648E27)
            r4 = r4 | r5
            int r4 = ~r4
            int r4 = r4 * 713
            int r7 = r7 + r4
            if (r1 != r7) goto La9
            goto L71
        L43:
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r4 = r4.maxMemory()
            int r4 = (int) r4
            int r4 = ~r4
            r5 = -1102617609(0xffffffffbe4763f7, float:-0.19471727)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = 272630065(0x10400131, float:3.786624E-29)
            r6 = r6 | r7
            int r6 = r6 * (-828)
            r7 = -864906616(0xffffffffcc729288, float:-6.3588896E7)
            int r7 = r7 + r6
            r4 = r4 | r5
            int r4 = r4 * (-828)
            int r7 = r7 + r4
            r4 = -1860654624(0xffffffff9118a9e0, float:-1.2043033E-28)
            int r7 = r7 + r4
            if (r1 != r7) goto La9
        L71:
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r8)
            r5 = 2137996635(0x7f6f3d5b, float:3.1800407E38)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = 441059329(0x1a4a0801, float:4.1779086E-23)
            r6 = r6 | r7
            int r6 = r6 * (-756)
            r7 = -405293164(0xffffffffe7d7b794, float:-2.0373904E24)
            int r7 = r7 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 756
            int r7 = r7 + r4
            if (r1 != r7) goto La8
            super.onStart()
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder
            int r1 = r1 + 9
            int r3 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface = r3
            int r1 = r1 % r0
            if (r1 == 0) goto La7
            r0 = 8
            int r0 = r0 / r2
        La7:
            return
        La8:
            throw r3
        La9:
            r1 = 1223764008(0x48f12828, float:493889.25)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ab, code lost:
    
        if (r1 != ((((-1495565058) + (((-67657) | r2) * (-381))) + (((~((~r2) | (-1753860461))) | 1791674277) * 381)) + 25776936)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ad, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asBinder + 23;
        com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.asInterface = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        r10 = (-2138313140) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c3, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r10 = (-785531040) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cd, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r1 == ((r7 + ((r5 | r4) * (-880))) + (r4 * 880))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        if (r1 == ((r7 + (((~(r4 | (-1247452587))) | (~((-417465044) | r5))) * (-672))) + (((~(1247452586 | r5)) | (-1526374396)) * 672))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0082, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimTrackingActivity claimTrackingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String strConcat;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            claimTrackingActivity.MediaBrowserCompat();
            strConcat = "loading_track_claim";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = asBinder + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            claimTrackingActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (Intrinsics.areEqual(((JhtClaimTrack) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, "JHT01")) {
                Kpj kpj = claimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (kpj != null) {
                    int i4 = asInterface + 15;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        ClaimTrackingTimelineActivity.Companion companion = ClaimTrackingTimelineActivity.INSTANCE;
                        ClaimTrackingTimelineActivity.Companion.b(claimTrackingActivity, (JhtClaimTrack) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, kpj);
                        int i5 = 89 / 0;
                    } else {
                        ClaimTrackingTimelineActivity.Companion companion2 = ClaimTrackingTimelineActivity.INSTANCE;
                        ClaimTrackingTimelineActivity.Companion.b(claimTrackingActivity, (JhtClaimTrack) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, kpj);
                    }
                }
            } else {
                String string = claimTrackingActivity.getString(R.string.label_data_not_found);
                Intrinsics.checkNotNullExpressionValue(string, "");
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimTrackingActivity, string, null);
            }
            strConcat = "success_track_claim";
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i6 = asInterface + 5;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            claimTrackingActivity.IconCompatParcelizer();
            getCameraState.Companion companion3 = getCameraState.INSTANCE;
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string2 = claimTrackingActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_alert_red, "", strValueOf, string2);
            FragmentManager supportFragmentManager = claimTrackingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            strConcat = "failure_track_claim_+".concat(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        } else {
            strConcat = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_tracking_result", strConcat));
        Intrinsics.checkNotNullParameter(claimTrackingActivity, "");
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(strConcat, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ClaimTrackingActivity claimTrackingActivity, View view) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (claimTrackingActivity.RemoteActionCompatParcelizer()) {
            int i4 = asInterface + 21;
            int i5 = i4 % 128;
            asBinder = i5;
            Object obj = null;
            if (i4 % 2 == 0) {
                Kpj kpj = claimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                throw null;
            }
            if (claimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                int i6 = i5 + 109;
                int i7 = i6 % 128;
                asInterface = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 31;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) claimTrackingActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Kpj kpj2 = claimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (kpj2 != null) {
                    int i11 = asInterface + 107;
                    asBinder = i11 % 128;
                    if (i11 % 2 == 0) {
                        String str3 = kpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        obj.hashCode();
                        throw null;
                    }
                    str = kpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str = null;
                }
                String strValueOf = String.valueOf(str);
                Intrinsics.checkNotNullParameter(strValueOf, "");
                MutableLiveData<VirtualCameraAdapter1<JhtClaimTrack>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.read;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                User userAsBinder = camera2CameraControlImplExternalSyntheticLambda4.IconCompatParcelizer.asBinder();
                if (userAsBinder != null) {
                    int i12 = asInterface + 87;
                    asBinder = i12 % 128;
                    if (i12 % 2 == 0) {
                        str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i13 = 77 / 0;
                        if (str2 == null) {
                            str2 = "";
                        }
                    } else {
                        str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    String str4 = userAsBinder.b;
                    if (str4 != null) {
                        int i14 = asInterface + 99;
                        asBinder = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        str4 = "";
                    }
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new JhtClaimTrackRequest(str2, strValueOf, str4))));
                    final Function1 function1 = new Function1() { // from class: configAndClose
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CameraControlImplExternalSyntheticLambda4, (JhtClaimTrack) obj2);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: addMeteringRepeating
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function1.invoke(obj2);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: addOrRemoveMeteringRepeatingUseCase
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: closeInternal
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function2.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimTrackingActivity claimTrackingActivity, Kpj kpj) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kpj, "");
        claimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = kpj;
        claimTrackingActivity.INotificationSideChannelStub().edtChooseKpj.setText(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ClaimTrackingActivity claimTrackingActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            updateSessionConfigSynchronous.Companion companion = updateSessionConfigSynchronous.INSTANCE;
            updateSessionConfigSynchronous updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1 = updateSessionConfigSynchronous.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: lambdanew0androidxcameracamera2internalCamera2CapturePipelineResultListener
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ClaimTrackingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Kpj) obj);
                }
            }, null);
            FragmentManager supportFragmentManager = claimTrackingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = asInterface + 97;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i4 = asBinder + 71;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 89 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f597a + 61;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iCodePointAt = 898570457 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3);
        int length = (-1977176451) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful_msg).substring(0, 21).length();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(BenefitItem.b.b(), length, -1458596761, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iCodePointAt, 1458596762);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iB = BenefitItem.b.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bri).substring(1, 3).length() - 617890457, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 649167210, BenefitItem.b.b(), new Object[]{this}, iB, -649167208);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int iB = BenefitItem.b.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_phone_no_invalid).substring(28, 30).codePointAt(0) - 1860913789, -2056533845, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 944233773, new Object[]{this}, iB, 2056533845);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 11;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    static void g() {
        b = 6738580198775288281L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = r8 + 107
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity.$$i(int, byte, short):java.lang.String");
    }
}
