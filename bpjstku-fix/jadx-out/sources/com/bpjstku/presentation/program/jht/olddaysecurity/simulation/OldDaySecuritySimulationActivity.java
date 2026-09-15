package com.bpjstku.presentation.program.jht.olddaysecurity.simulation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
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
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.simulation.model.request.JhtSimulationRequest;
import com.bpjstku.databinding.ActivityOldDaySecuritySimulationBinding;
import com.bpjstku.domain.simulation.model.JhtSimulation;
import com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.mlkit_common.zzbb;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.BufferProviderState;
import defpackage.Camera2CapturePipelineResultListenerExternalSyntheticLambda0;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.TemplateParamsOverride;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.accessconfigureInstanceInternal;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.hasProfile;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.requestClose;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0015\u0010\u0015\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/simulation/OldDaySecuritySimulationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityOldDaySecuritySimulationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "asBinder", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "LhasProfile;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OldDaySecuritySimulationActivity extends BindingReactiveFormActivity<ActivityOldDaySecuritySimulationBinding> {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_old_day_security_simulation;
    private static final byte[] $$c = {6, 51, 46, 31};
    private static final int $$f = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -1, 37, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 200;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f596a = 1;

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -988062741
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object b(int r5, int r6, int r7, java.lang.Object[] r8, int r9, int r10, int r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity.b(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
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
    private static void c(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity.$$a
            int r7 = 145 - r7
            int r8 = 53 - r8
            int r9 = r9 * 14
            int r9 = 98 - r9
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
            int r7 = -r7
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity.c(int, byte, byte, java.lang.Object[]):void");
    }

    public OldDaySecuritySimulationActivity() {
        final OldDaySecuritySimulationActivity oldDaySecuritySimulationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<hasProfile>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [hasProfile, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final hasProfile invoke() {
                ComponentCallbacks componentCallbacks = oldDaySecuritySimulationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(hasProfile.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/simulation/OldDaySecuritySimulationActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, OldDaySecuritySimulationActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f596a + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityOldDaySecuritySimulationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f596a + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        OldDaySecuritySimulationActivity$bindingInflater$1 oldDaySecuritySimulationActivity$bindingInflater$1 = OldDaySecuritySimulationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = f596a + 7;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return oldDaySecuritySimulationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.btnCalculateSimulation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdapreCapture0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OldDaySecuritySimulationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityOldDaySecuritySimulationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        f596a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
    }

    private static final Unit TuitionPaymentFragmentbindingInflater1(OldDaySecuritySimulationActivity oldDaySecuritySimulationActivity, ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBinding, View view) {
        Editable text;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_jht_simulation_result", "calculate_jht_simulation"));
        Intrinsics.checkNotNullParameter(oldDaySecuritySimulationActivity, "");
        Intrinsics.checkNotNullParameter("calculate_jht_simulation", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("calculate_jht_simulation", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("calculate_jht_simulation", mapMutableMapOf);
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, oldDaySecuritySimulationActivity);
        try {
            final hasProfile hasprofile = (hasProfile) oldDaySecuritySimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            EditText editText = activityOldDaySecuritySimulationBinding.tilTotalYear.getEditText();
            if (editText != null) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
                f596a = i2 % 128;
                int i3 = i2 % 2;
                text = editText.getText();
            } else {
                text = null;
            }
            int i4 = Integer.parseInt(StringsKt.trim((CharSequence) String.valueOf(text)).toString());
            long j = Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) String.valueOf(activityOldDaySecuritySimulationBinding.edtWageAmount.getText())).toString(), ".", "", false, 4, (Object) null)).toString());
            long j2 = Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) String.valueOf(activityOldDaySecuritySimulationBinding.edtBeginingBalance.getText())).toString(), ".", "", false, 4, (Object) null)).toString());
            MutableLiveData<VirtualCameraAdapter1<JhtSimulation>> mutableLiveData = hasprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(hasprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new JhtSimulationRequest(String.valueOf(i4), String.valueOf(j2), String.valueOf(j)))));
            final Function1 function1 = new Function1() { // from class: getAwbState
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hasProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(hasprofile, (JhtSimulation) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: getAfMode
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: getAwbMode
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hasProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(hasprofile, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getAeState
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            hasprofile.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } catch (NumberFormatException unused) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Input tidak sesuai", 0).show();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = f596a + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return unit;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        int i3 = 4;
        abortcapture.b = 4;
        int i4 = $10 + 91;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (abortcapture.b < cArrB.length) {
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
            int i6 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - KeyEvent.keyCodeFromString("")), 1357 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 38 - TextUtils.getTrimmedLength(""), 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), 467 - ExpandableListView.getPackedPositionChild(0L), 13 - ((Process.getThreadPriority(0) + 20) >> 6), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $10 + 17;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i9 = $11 + 65;
        $10 = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((hasProfile) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new Observer() { // from class: Camera2CapturePipelineResultListener
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                OldDaySecuritySimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f596a + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        OldDaySecuritySimulationActivity oldDaySecuritySimulationActivity = this;
        Intrinsics.checkNotNullParameter(oldDaySecuritySimulationActivity, "");
        oldDaySecuritySimulationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_simulation_benefits_old_day_security));
        TextInputEditText textInputEditText = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.edtWageAmount;
        TextInputEditText textInputEditText2 = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.edtWageAmount;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        textInputEditText.addTextChangedListener(new TemplateParamsOverride(textInputEditText2, "", new Locale("id", "ID")));
        TextInputEditText textInputEditText3 = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.edtBeginingBalance;
        TextInputEditText textInputEditText4 = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.edtBeginingBalance;
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "");
        textInputEditText3.addTextChangedListener(new TemplateParamsOverride(textInputEditText4, "", new Locale("id", "ID")));
        int i2 = f596a + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
                f596a = i2 % 128;
                int i3 = i2 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = f596a + 97;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        f596a = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnCalculateSimulation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 75;
        f596a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        f596a = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnCalculateSimulation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 77;
        f596a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputEditText textInputEditText = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.edtWageAmount;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.tilTotalYear;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputEditText textInputEditText2 = activityOldDaySecuritySimulationBindingINotificationSideChannelStub.edtBeginingBalance;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputEditText2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        int i2 = f596a + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int size = 1031 - View.MeasureSpec.getSize(0);
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c((short) 141, b, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, size, i3, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{15501, 42657, 15596, 27091, 27758, 62002, 43581, 50971, 146, 44356, 10494, 983, 17410, 57646, 58628, 19546, 35236, 8894, 41422, 35068, 52512, 26174, 32166, 62790, 4830, 23430}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{22860, 19003, 22825, 34123, 47827, 9354, 15675, 20511, 25935, 16850, 65094, 38061, 8649, 3494, 13310, 56187, 60533, 52794, 30567}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
            int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((short) 89, bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength2, longPressTimeout, iResolveSizeAndState, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) Color.red(0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                int iMyTid = 15 - (Process.myTid() >> 22);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[2], (byte) 52, bArr3[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, touchSlop, iMyTid, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i7 = ~i6;
            int i8 = ~(374824030 | i7);
            int i9 = 1199594641 + (((-400030975) | i8) * (-712)) + (((~(i6 | (-25206945))) | (~(i7 | 400030974))) * (-712)) + ((130543860 | i8) * 712) + 789105534;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{27478, 19923, 27452, 33454, 51522, 22284, 14347, 21822, 22280, 17971, 36293, 37281, 5073, 2561, 16455, 56902, 56949, 51659, 1249, 6850}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{3235, 60917, 3274, 8845, 58542, 31475, 33184, 60570, 12455, 58896, 41007, 10269, 29707, 43624, 28056, 26620, 47536, 27126, 10527, 41825}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_bni).substring(14, 15).length() - 1, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1210552330};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1134 - TextUtils.getOffsetAfter("", 0), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 789105534, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                    int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr4 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((short) 141, bArr4[7], bArr4[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, edgeSlop, fadingEdgeLength, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    byte[] bArr5 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr5[2], (byte) 52, bArr5[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout2, iMakeMeasureSpec, jumpTapTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{15501, 42657, 15596, 27091, 27758, 62002, 43581, 50971, 146, 44356, 10494, 983, 17410, 57646, 58628, 19546, 35236, 8894, 41422, 35068, 52512, 26174, 32166, 62790, 4830, 23430}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{22860, 19003, 22825, 34123, 47827, 9354, 15675, 20511, 25935, 16850, 65094, 38061, 8649, 3494, 13310, 56187, 60533, 52794, 30567}, Drawable.resolveOpacity(0, 0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
                        int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                        int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr6 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((short) 89, bArr6[7], bArr6[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength3, i12, tapTimeout, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i13 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        byte[] bArr7 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((short) 141, bArr7[7], bArr7[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, i13, iResolveSize, 1357589585, false, (String) objArr17[0], null);
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
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i16 = TuitionPaymentFragmentbindingInflater1 + 95;
                    f596a = i16 % 128;
                    if (i16 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 86;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1251550976;
        int i20 = i17 + 1148845047 + (((~(length | 197125993)) | (-47154177)) * (-465)) + ((197125993 | (~((-47154177) | length))) * 930) + ((length | (-4194305)) * 465);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
            int i23 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iAxisFromString = MotionEvent.axisFromString("") + 24;
            byte[] bArr8 = $$a;
            Object[] objArr19 = new Object[1];
            c(bArr8[2], (byte) 15, bArr8[5], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(edgeSlop2, i23, iAxisFromString, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i24 = f596a + 71;
            TuitionPaymentFragmentbindingInflater1 = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr9 = $$a;
                Object[] objArr20 = new Object[1];
                c((short) 89, bArr9[7], bArr9[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, iMakeMeasureSpec2, maximumDrawingCacheSize, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i26 = ((((-1358441949) + (((~((~startElapsedRealtime) | (-201851013))) | (~((-59012105) | startElapsedRealtime))) * (-302))) + ((~((-201851013) | startElapsedRealtime)) * (-604))) + (((~(startElapsedRealtime | (-260863117))) | (-532477647)) * 302)) - 582145071;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{27478, 19923, 27452, 33454, 51522, 22284, 14347, 21822, 22280, 17971, 36293, 37281, 5073, 2561, 16455, 56902, 56949, 51659, 1249, 6850}, 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{3235, 60917, 3274, 8845, 58542, 31475, 33184, 60570, 12455, 58896, 41007, 10269, 29707, 43624, 28056, 26620, 47536, 27126, 10527, 41825}, View.getDefaultSize(0, 0), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1210552330};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 42049), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1725, 29 - ExpandableListView.getPackedPositionGroup(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -582145071, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                int i29 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int gidForName = Process.getGidForName("") + 24;
                byte[] bArr10 = $$a;
                Object[] objArr25 = new Object[1];
                c((short) 89, bArr10[7], bArr10[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb, i29, gidForName, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{15501, 42657, 15596, 27091, 27758, 62002, 43581, 50971, 146, 44356, 10494, 983, 17410, 57646, 58628, 19546, 35236, 8894, 41422, 35068, 52512, 26174, 32166, 62790, 4830, 23430}, TextUtils.lastIndexOf("", '0', 0) + 1, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{22860, 19003, 22825, 34123, 47827, 9354, 15675, 20511, 25935, 16850, 65094, 38061, 8649, 3494, 13310, 56187, 60533, 52794, 30567}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int edgeSlop3 = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iBlue = Color.blue(0) + 23;
                    byte[] bArr11 = $$a;
                    short s = bArr11[7];
                    Object[] objArr28 = new Object[1];
                    c(s, (byte) s, bArr11[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, edgeSlop3, iBlue, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                    int iMyPid = (Process.myPid() >> 22) + 1755;
                    int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr12 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr12[2], (byte) 15, bArr12[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionType, iMyPid, maxKeyCode, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i31 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i31 == i30) {
            int i32 = f596a + 15;
            TuitionPaymentFragmentbindingInflater1 = i32 % 128;
            int i33 = i32 % 2;
            int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iMyUid = Process.myUid();
            int i35 = ~iMyUid;
            int i36 = i34 + (-427850339) + (((~(iMyUid | (-425860488))) | (~((-638329409) | i35)) | 425726982) * (-68)) + ((~((-133506) | i35)) * (-68)) + (((~(425860487 | i35)) | (-638462914)) * 68);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr30[3])[0] = i38 ^ (i38 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr4 != null) {
            int i39 = f596a + 39;
            TuitionPaymentFragmentbindingInflater1 = i39 % 128;
            int i40 = i39 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i31 / (((i31 - 1) * i31) % 2), 0).show();
        int i41 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i42 = ~((int) Runtime.getRuntime().maxMemory());
        int i43 = i41 + ((((-251538111) + (((~(i42 | (-136446386))) | (~((-67231753) | i42))) * (-184))) + (((4462144 | (~((-71693897) | i42))) | (~((-140908530) | i42))) * 184)) - 356893960);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr31[3])[0] = i45 ^ (i45 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f596a + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = (-2133875284) + ((startUptimeMillis | 216212445) * (-50));
        int i6 = ~((-10486090) | startUptimeMillis);
        int i7 = ~startUptimeMillis;
        if (i4 != i5 + ((i6 | (~(1056686077 | i7))) * 50) + (((~(i7 | 216212445)) | (~(1046199988 | i7)) | (-1056686078)) * 50)) {
            throw null;
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != 1619841215 + (((~(iIdentityHashCode | (-1736472655))) | (-20561324)) * (-465)) + (((-1736472655) | (~((-20561324) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-16791563)) * 465)) {
            int i9 = (-1519125712) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = TuitionPaymentFragmentbindingInflater1 + 69;
        f596a = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 87 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        f596a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        if (i4 != ((((~(1943004663 | i5)) | 541589504) * 449) - 1315324640) + (((~((~i5) | 1943004663)) | 541589504) * 449)) {
            throw new RuntimeException("-1277616995");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i6 != (((~((-1953865636) | iMyTid)) | 1362508314) * 262) + 1135318366 + (((~((~iMyTid) | (-1953865636))) | 1362508314) * 262)) {
            throw null;
        }
        super.onCreate(bundle);
        int i7 = f596a + 107;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 12 / 0;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        OldDaySecuritySimulationActivity oldDaySecuritySimulationActivity = (OldDaySecuritySimulationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            oldDaySecuritySimulationActivity.MediaBrowserCompat();
            str = "loading_jht_simulation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            oldDaySecuritySimulationActivity.IconCompatParcelizer();
            Camera2CapturePipelineResultListenerExternalSyntheticLambda0.Companion companion = Camera2CapturePipelineResultListenerExternalSyntheticLambda0.INSTANCE;
            Camera2CapturePipelineResultListenerExternalSyntheticLambda0 camera2CapturePipelineResultListenerExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CapturePipelineResultListenerExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3((JhtSimulation) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            FragmentManager supportFragmentManager = oldDaySecuritySimulationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(camera2CapturePipelineResultListenerExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                camera2CapturePipelineResultListenerExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, camera2CapturePipelineResultListenerExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
                f596a = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = f596a + 77;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            str = "success_jht_simulation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = f596a + 53;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                oldDaySecuritySimulationActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 1).show();
            } else {
                oldDaySecuritySimulationActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
            str = "failure_jht_simulation_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_jht_simulation_result", str));
        Intrinsics.checkNotNullParameter(oldDaySecuritySimulationActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return null;
    }

    public static /* synthetic */ Unit b(OldDaySecuritySimulationActivity oldDaySecuritySimulationActivity, ActivityOldDaySecuritySimulationBinding activityOldDaySecuritySimulationBinding, View view) {
        int i = 2 % 2;
        int i2 = f596a + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(oldDaySecuritySimulationActivity, activityOldDaySecuritySimulationBinding, view);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 113;
        f596a = i4 % 128;
        if (i4 % 2 != 0) {
            return unitTuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(OldDaySecuritySimulationActivity oldDaySecuritySimulationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1531457356, new Object[]{oldDaySecuritySimulationActivity, virtualCameraAdapter1}, -1531457356, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static {
        asBinder = 0;
        g();
        INSTANCE = new Companion(null);
        int i = g + 23;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 918766158, new Object[]{this}, -918766156, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        f596a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int length = 84884143 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        b(zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -339072265, new Object[]{this}, 339072266, length, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 432263694);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f596a + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = f596a + 87;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 9098905723086579066L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = 107 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity.$$i(int, short, short):java.lang.String");
    }
}
