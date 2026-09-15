package com.bpjstku.presentation.tuition;

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
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.databinding.FragmentTuitionPaymentBinding;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.tuition.TuitionPaymentActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraUseCaseAdapter;
import defpackage.InputConfigurationCompat;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.ensureLogoView;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRequiredMaxBitDepth;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isBound;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setQuickZoomEnabled;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0015\u0010\u0006\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0015\u0010\u0010\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u000e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\""}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionPaymentActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/FragmentTuitionPaymentBinding;", "<init>", "()V", "", "b", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "", "p0", "TuitionPaymentFragmentbindingInflater1", "(I)I", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LInputConfigurationCompat;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/user/model/User;", "g", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionPaymentActivity extends BindingReactiveFormActivity<FragmentTuitionPaymentBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f645a;
    private static boolean asBinder;
    private static int asInterface;
    private static boolean d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final Lazy b;
    private static final byte[] $$c = {49, 84, -120, 101};
    private static final int $$f = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, 40, 23, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 60;
    private static int cancel = 1;
    private static int cancelAll = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: isDndRuntimeException
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TuitionPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: toStreamConfigurationMapCompat
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_tuition_payment;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i5) | i2);
        int i8 = ~i6;
        int i9 = i7 | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i5);
        int i13 = (~(i8 | i5)) | i11 | i12;
        int i14 = (~(i6 | i10)) | i12;
        int i15 = i5 + i2 + i4 + (1039959776 * i3) + ((-2046201414) * i);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i5) - 8388608) + ((-1785926397) * i2) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i4) + ((-201326592) * i3) + ((-406847488) * i) + (529399808 * i16);
        int i18 = ((i5 * 868240256) - 1765242424) + (i2 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i4 * 868239597) + (i3 * 817356128) + (i * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 == 1) {
            return b(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentActivity tuitionPaymentActivity, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = cancelAll + 45;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.tuition.TuitionPaymentActivity.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r8 = 197 - r8
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            int r7 = r7 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    public TuitionPaymentActivity() {
        final TuitionPaymentActivity tuitionPaymentActivity = this;
        this.b = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = tuitionPaymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = tuitionPaymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.tuition.TuitionPaymentActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionPaymentActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, TuitionPaymentActivity.class, new Pair[]{TuplesKt.to("tuition_identity_number", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 99;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = i2 + 99;
        cancelAll = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, FragmentTuitionPaymentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 3;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TuitionPaymentActivity$bindingInflater$1 tuitionPaymentActivity$bindingInflater$1 = TuitionPaymentActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            obj.hashCode();
            throw null;
        }
        TuitionPaymentActivity$bindingInflater$1 tuitionPaymentActivity$bindingInflater$2 = TuitionPaymentActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = cancelAll + 59;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            return tuitionPaymentActivity$bindingInflater$2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentActivity tuitionPaymentActivity = this;
        Intrinsics.checkNotNullParameter(tuitionPaymentActivity, "");
        tuitionPaymentActivity.getWindow().addFlags(8192);
        EditText editText = INotificationSideChannelStub().tilIdNumber.getEditText();
        Object obj = null;
        if (editText != null) {
            int i2 = cancelAll + 55;
            notify = i2 % 128;
            if (i2 % 2 == 0) {
                editText.setText((String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
                obj.hashCode();
                throw null;
            }
            editText.setText((String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        }
        int i3 = cancelAll + 91;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = cancelAll + 31;
        notify = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = cancelAll + 71;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        TuitionPaymentActivity tuitionPaymentActivity = (TuitionPaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 29;
        notify = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = tuitionPaymentActivity.INotificationSideChannelStub().btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = cancelAll + 71;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        int i2 = notify + 117;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: throwDndException
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (Unit) TuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -1771456570, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1771456570, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }));
        INotificationSideChannelStub().rgPaymentPeriod.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: CameraManagerCompatApi28Impl
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                TuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, radioGroup, i2);
            }
        });
        int i2 = cancelAll + 55;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((InputConfigurationCompat) this.b.getValue()).asInterface.observe(this, new Observer() { // from class: CameraManagerCompatApi29Impl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancelAll + 11;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = notify + 41;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = cancelAll + 49;
                notify = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 23 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = f645a;
        long j = 0;
        int i3 = -1;
        if (cArr4 != null) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31338), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 2993, ((byte) KeyEvent.getModifierMetaStateMask()) + 18, 1182129903, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                    i3 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 253, 21 - TextUtils.lastIndexOf("", '0', 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (asBinder) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33603), 3085 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, -2146875848, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!d) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    int i6 = $11 + 63;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i8 = $10 + 123;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i9 = $10 + 27;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] >> iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33602), 3086 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf("", c, 0, 0) + 27, -2146875848, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } else {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", c)), 3085 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 26, -2146875848, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                c = '0';
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:19:0x0197  */
    /* JADX WARN: Code duplicated, block: B:22:0x022d A[Catch: all -> 0x09e9, TryCatch #0 {all -> 0x09e9, blocks: (B:20:0x0219, B:22:0x022d, B:23:0x025e, B:51:0x0690, B:53:0x06a4, B:54:0x06d1, B:56:0x0703, B:57:0x0770), top: B:101:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0278  */
    /* JADX WARN: Code duplicated, block: B:31:0x032e  */
    /* JADX WARN: Code duplicated, block: B:34:0x037c  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char size = (char) (29944 - View.MeasureSpec.getSize(0));
                int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                byte b = (byte) ($$b >>> 2);
                byte b2 = $$a[7];
                Object[] objArr2 = new Object[1];
                c(b, b2, (short) (b2 | 193), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, deadChar, iResolveOpacity, 986134021, false, (String) objArr2[0], null);
            }
            int i3 = 40 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                    int iMyTid = 1755 - (Process.myTid() >> 22);
                    int iResolveSize = View.resolveSize(0, 0) + 23;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr3 = new Object[1];
                    c(b3, b4, (short) (b4 | 156), objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iMyTid, iResolveSize, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 462606350;
                int i4 = ~iCodePointAt;
                int i5 = (-1585532531) + (((~(iCodePointAt | (-669993254))) | (~((-269489755) | i4)) | 56887328) * (-68)) + ((~((-613105926) | i4)) * (-68)) + (((~(669993253 | i4)) | (-882595680)) * 68) + 2108576380;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_invalid_input_telkomsel).substring(0, 6).length() + 121, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-100616455};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - View.getDefaultSize(0, 0)), 1726 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 2108576380, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr8 = new Object[1];
                        c(b5, b6, (short) (b6 | 156), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, jumpTapTimeout, threadPriority, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gci).substring(1, 3).length() + 125, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
                            int i8 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr11 = new Object[1];
                            c(b7, b8, (short) (b8 | 104), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iIndexOf, i8, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                            int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                            byte b9 = (byte) ($$b >>> 2);
                            byte b10 = $$a[7];
                            Object[] objArr12 = new Object[1];
                            c(b9, b10, (short) (b10 | 193), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, iIndexOf2, keyRepeatDelay, 986134021, false, (String) objArr12[0], null);
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
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                byte b11 = (byte) ($$b >>> 2);
                byte b12 = $$a[7];
                Object[] objArr13 = new Object[1];
                c(b11, b12, (short) (b12 | 193), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, mirror, iIndexOf3, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                    int iMyTid2 = 1755 - (Process.myTid() >> 22);
                    int iResolveSize2 = View.resolveSize(0, 0) + 23;
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr14 = new Object[1];
                    c(b13, b14, (short) (b14 | 156), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout2, iMyTid2, iResolveSize2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 462606350;
                int i9 = ~iCodePointAt2;
                int i10 = (-1585532531) + (((~(iCodePointAt2 | (-669993254))) | (~((-269489755) | i9)) | 56887328) * (-68)) + ((~((-613105926) | i9)) * (-68)) + (((~(669993253 | i9)) | (-882595680)) * 68) + 2108576380;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i12 ^ (i12 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_invalid_input_telkomsel).substring(0, 6).length() + 121, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-100616455};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - View.getDefaultSize(0, 0)), 1726 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 2108576380, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char edgeSlop2 = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int jumpTapTimeout2 = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int threadPriority2 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr19 = new Object[1];
                    c(b15, b16, (short) (b16 | 156), objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop2, jumpTapTimeout2, threadPriority2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                Object[] objArr20 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gci).substring(1, 3).length() + 125, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionChild2 = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                    int iIndexOf4 = TextUtils.indexOf("", "", 0) + 1755;
                    int i13 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr111 = new Object[1];
                    c(b17, b18, (short) (b18 | 104), objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild2, iIndexOf4, i13, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maxKeyCode2 = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iIndexOf5 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte b19 = (byte) ($$b >>> 2);
                    byte b110 = $$a[7];
                    Object[] objArr112 = new Object[1];
                    c(b19, b110, (short) (b110 | 193), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode2, iIndexOf5, keyRepeatDelay2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i14 = notify + 1;
        cancelAll = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int i17 = ~(Process.myPid() | (-702140358));
        int i18 = i16 + (((-1071505408) | i17) * (-196)) + 1269834193 + ((i17 | 369365050) * 196);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            byte b20 = $$a[7];
            byte b21 = b20;
            Object[] objArr22 = new Object[1];
            c(b20, b21, (short) (b21 | 52), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, bitsPerPixel, touchSlop, 1357589585, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 18, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
            int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
            int longPressTimeout3 = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b22 = $$a[7];
            byte b23 = b22;
            Object[] objArr25 = new Object[1];
            c(b22, b23, (short) (b23 | 156), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(capsMode2, offsetBefore, longPressTimeout3, 1344079056, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                int i21 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                byte b24 = (byte) ($$b & 247);
                byte[] bArr = $$a;
                Object[] objArr26 = new Object[1];
                c(b24, bArr[5], bArr[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, maximumFlingVelocity, i21, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr27[3])[0];
            int i23 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int i24 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i25 = (-1122664917) + (((-219086886) | i24) * 494) + (((~(i24 | 14695106)) | (-223283814)) * 494) + 668450812;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_null_json_response_from_server).substring(0, 40).codePointAt(27) + 16, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {-100616455};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46037 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1134, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, 668450812, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                int iGreen = 15 - Color.green(0);
                byte b25 = $$a[7];
                byte b26 = b25;
                Object[] objArr32 = new Object[1];
                c(b25, b26, (short) (b26 | 52), objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cArgb, maxKeyCode3, iGreen, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 45994), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                int i28 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b27 = (byte) ($$b & 247);
                byte[] bArr2 = $$a;
                Object[] objArr33 = new Object[1];
                c(b27, bArr2[5], bArr2[7], objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSizeAndState, iIndexOf6, i28, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                e(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                e(null, null, (-16777089) - Color.rgb(0, 0, 0), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int defaultSize = 1031 - View.getDefaultSize(0, 0);
                    int packedPositionChild3 = 14 - ExpandableListView.getPackedPositionChild(0L);
                    byte b28 = $$a[7];
                    byte b29 = b28;
                    Object[] objArr36 = new Object[1];
                    c(b28, b29, (short) (b29 | 156), objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c, defaultSize, packedPositionChild3, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int iIndexOf7 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int iAxisFromString = 14 - MotionEvent.axisFromString("");
                    byte b30 = $$a[7];
                    byte b31 = b30;
                    Object[] objArr37 = new Object[1];
                    c(b30, b31, (short) (b31 | 52), objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveOpacity, iIndexOf7, iAxisFromString, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 == i29) {
            Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i34 = i31 + (-1410750159) + ((311489914 | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 905130615)) | 33604872) * (-376)) + (((~(iIdentityHashCode | (-905130616))) | (-660850446)) * 376);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr38[2])[0] = i36 ^ (i36 << 5);
            int i37 = notify + 71;
            cancelAll = i37 % 128;
            if (i37 % 2 != 0) {
                throw null;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i38 = cancelAll + 73;
                notify = i38 % 128;
                int i39 = i38 % 2;
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i30];
        int i40 = i30 - 1;
        iArr[i40] = 1;
        Toast.makeText((Context) null, iArr[((i30 * i40) % 2) - 1], 1).show();
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i44 = i41 + 619471748 + (((~((~iIdentityHashCode2) | 210825888)) | (-234814186)) * 529) + (((~(iIdentityHashCode2 | 210825888)) | (-33454282)) * 529);
        int i45 = i44 ^ (i44 << 13);
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr39[2])[0] = i46 ^ (i46 << 5);
        int i47 = notify + 1;
        cancelAll = i47 % 128;
        int i48 = i47 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        TuitionPaymentActivity tuitionPaymentActivity = (TuitionPaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int i6 = ~((-263078347) | i5);
        int i7 = 51644472 + ((19284096 | i6) * (-280)) + ((i6 | (~(1093065889 | i5))) * 140);
        int i8 = ~((-243794251) | i5);
        int i9 = ~i5;
        if (i4 != i7 + (((~(i9 | 1336860139)) | i8 | (~((-19284097) | i9))) * 140)) {
            int i10 = 2067988626 % 2;
            throw new ArithmeticException();
        }
        int i11 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i11 != (-1914595180) + (((~(2011168443 | iMaxMemory)) | 567887521) * (-756)) + (((~iMaxMemory) | 2011168443) * 756)) {
            int[] iArr = new int[488815053];
            iArr[488815052] = 1;
            int i12 = 908801116 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onResume();
        int i13 = cancelAll + 91;
        notify = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 5 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:
    
        if (r1 != ((((-1251905188) + ((20979968 | r5) * (-476))) + (r5 * 952)) + ((~((~r2) | 1811672063)) * 476))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.tuition.TuitionPaymentActivity.cancelAll + 119;
        com.bpjstku.presentation.tuition.TuitionPaymentActivity.notify = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ac, code lost:
    
        throw new java.lang.RuntimeException("-2063827810");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1 == (((((~(r5 | (-1054616480))) | ((~((-224628937) | r5)) | 205521032)) * (-397)) + 236830600) + ((r4 | (-868203352)) * 397))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r1 == (((-1806733070) + (((~((~r4) | 734400711)) | 1412999960) * 529)) + (((~(r4 | 734400711)) | 1564388254) * 529))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r5 = ~(1811672063 | r2);
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
            int r1 = com.bpjstku.presentation.tuition.TuitionPaymentActivity.cancelAll
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.bpjstku.presentation.tuition.TuitionPaymentActivity.notify = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L40
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r4 = 1
            r1 = r1[r4]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            long r4 = android.os.Process.getElapsedCpuTime()
            int r4 = (int) r4
            int r5 = ~r4
            r6 = -224628937(0xfffffffff29c6f37, float:-6.1970063E30)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 205521032(0xc400088, float:1.4791302E-31)
            r6 = r6 | r7
            r7 = -1054616480(0xffffffffc123d460, float:-10.239349)
            r5 = r5 | r7
            int r5 = ~r5
            r5 = r5 | r6
            int r5 = r5 * (-397)
            r6 = 236830600(0xe1dbf88, float:1.9443963E-30)
            int r5 = r5 + r6
            r6 = -868203352(0xffffffffcc4044a8, float:-5.040195E7)
            r4 = r4 | r6
            int r4 = r4 * 397
            int r5 = r5 + r4
            if (r1 != r5) goto La5
            goto L69
        L40:
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r8)
            int r5 = ~r4
            r6 = 734400711(0x2bc610c7, float:1.4073403E-12)
            r5 = r5 | r6
            int r5 = ~r5
            r7 = 1412999960(0x5438ab18, float:3.1725778E12)
            r5 = r5 | r7
            int r5 = r5 * 529
            r7 = -1806733070(0xffffffff944f70f2, float:-1.0473104E-26)
            int r7 = r7 + r5
            r4 = r4 | r6
            int r4 = ~r4
            r5 = 1564388254(0x5d3eab9e, float:8.5870305E17)
            r4 = r4 | r5
            int r4 = r4 * 529
            int r7 = r7 + r4
            if (r1 != r7) goto La5
        L69:
            java.lang.reflect.Member[] r1 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r4 = r2.maxMemory()
            int r2 = (int) r4
            r4 = 1811672063(0x6bfbebff, float:6.0910968E26)
            r5 = r4 | r2
            int r5 = ~r5
            r6 = 20979968(0x1402100, float:3.5288507E-38)
            r6 = r6 | r5
            int r6 = r6 * (-476)
            r7 = -1251905188(0xffffffffb561715c, float:-8.398399E-7)
            int r7 = r7 + r6
            int r5 = r5 * 952
            int r7 = r7 + r5
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = ~r2
            int r2 = r2 * 476
            int r7 = r7 + r2
            if (r1 != r7) goto La4
            super.onStart()
            int r1 = com.bpjstku.presentation.tuition.TuitionPaymentActivity.cancelAll
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.bpjstku.presentation.tuition.TuitionPaymentActivity.notify = r2
            int r1 = r1 % r0
            return
        La4:
            throw r3
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-2063827810"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 39;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            if (i3 != (((-1118308936) + (((~(988261201 | startElapsedRealtime)) | (-158273659)) * (-948))) + ((~((~startElapsedRealtime) | (-17305643))) * (-948))) - 205372548) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iNextInt = new Random().nextInt();
            int i5 = ~(842830162 | iNextInt);
            int i6 = ~iNextInt;
            int i7 = i5 | (~(12842619 | i6));
            int i8 = ~((-842830163) | i6);
            if (i4 != 24488432 + ((i7 | i8) * (-516)) + (((~(iNextInt | (-12805674))) | (~((-36947) | i6))) * 516) + ((36946 | i8) * 516)) {
                throw null;
            }
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i9 != ((1372170604 + (((~((-1968474873) | iIdentityHashCode)) | (-610581093)) * (-948))) + ((~((~iIdentityHashCode) | (-608471649))) * (-948))) - 792868500) {
            int i10 = 897700212 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i11 = cancelAll + 81;
        notify = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentActivity tuitionPaymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentActivity.MediaBrowserCompat();
            str = "loading_get_tuition_payment_detail";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            tuitionPaymentActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: isDndFailCase
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    return (Unit) TuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[0], -1284782268, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1284782271, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
            int i2 = notify + 103;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            str = "failure_get_tuition_payment_detail";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = notify + 105;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            TuitionPaymentDetailActivity.Companion companion = TuitionPaymentDetailActivity.INSTANCE;
            TuitionPaymentDetailActivity.Companion.b(tuitionPaymentActivity, (BpuCheckPaymentItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentbindingInflater1(tuitionPaymentActivity.INotificationSideChannelStub().rgPaymentPeriod.getCheckedRadioButtonId()));
            tuitionPaymentActivity.IconCompatParcelizer();
            int i6 = notify + 49;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
            str = "success_get_tuition_payment_detail";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter(tuitionPaymentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(TuitionPaymentActivity tuitionPaymentActivity) {
        int i = 2 % 2;
        int i2 = notify + 71;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = tuitionPaymentActivity.getIntent().getStringExtra("tuition_identity_number");
        int i4 = cancelAll + 31;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 99;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = notify + 29;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentActivity tuitionPaymentActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 55;
        notify = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) tuitionPaymentActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = notify + 79;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        TuitionPaymentActivity tuitionPaymentActivity = (TuitionPaymentActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = cancelAll + 85;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            throw null;
        }
        User user = (User) tuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (user != null) {
            ((InputConfigurationCompat) tuitionPaymentActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentRequest(String.valueOf(user.TuitionPaymentFragmentspecialinlinedviewModeldefault1), String.valueOf(TuitionPaymentFragmentbindingInflater1(tuitionPaymentActivity.INotificationSideChannelStub().rgPaymentPeriod.getCheckedRadioButtonId())), "", String.valueOf((String) tuitionPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue())));
            int i4 = notify + 75;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[0], -1284782268, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1284782271, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentActivity tuitionPaymentActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{tuitionPaymentActivity, view}, -1771456570, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1771456570, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        INotificationSideChannel = 0;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = cancel + 51;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static int TuitionPaymentFragmentbindingInflater1(int p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        if (p0 == R.id.rbOneMonthPeriod) {
            return 1;
        }
        if (p0 == R.id.rbSixMonthPeriod) {
            return 6;
        }
        int i5 = i3 + 63;
        int i6 = i5 % 128;
        cancelAll = i6;
        int i7 = i5 % 2;
        switch (p0) {
            case R.id.rbThreeMonthPeriod /* 2131429155 */:
                return 3;
            case R.id.rbTwelveMonthPeriod /* 2131429156 */:
                int i8 = i6 + 73;
                notify = i8 % 128;
                int i9 = i8 % 2;
                return 12;
            case R.id.rbTwoMonthPeriod /* 2131429157 */:
                return 2;
            default:
                return 1;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 13;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = notify + 61;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ensureLogoView.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, -931917695, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentbindingInflater2, 931917696, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ensureLogoView.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 2004737662, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2004737660, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 27;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = notify + 97;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    static void cancelAll() {
        f645a = new char[]{47503, 47512, 47491, 47435, 47501, 47499, 47506, 47462, 47488, 47494, 47493, 47508, 47500, 47504, 47509, 47473, 47505, 47478, 47498, 47495, 47510, 47502, 47497, 47463};
        asInterface = 2047719737;
        d = true;
        asBinder = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, int r8, byte r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.tuition.TuitionPaymentActivity.$$c
            int r9 = r9 + 67
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
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
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentActivity.$$i(byte, int, byte):java.lang.String");
    }
}
