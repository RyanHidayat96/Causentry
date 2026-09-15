package com.bpjstku.presentation.vocational;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.vocation.model.request.VocationPhoneVerificationRequest;
import com.bpjstku.databinding.ActivityVocationalTrainingDetilInformationBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.vocation.model.Training;
import com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.identity.zzp;
import com.google.android.libraries.places.internal.zzbla;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.PickVisualMediaRequestdefault;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isAffectedOppoDevices;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionStateCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0015\u0010\t\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u001a8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001eR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\""}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalTrainingDetailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalTrainingDetilInformationBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LisAffectedOppoDevices;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "d", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "onTransact", "()LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "Lcom/bpjstku/domain/vocation/model/Training;", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "", "()I", "g", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalTrainingDetailActivity extends BindingBaseActivity<ActivityVocationalTrainingDetilInformationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f659a;
    private static int notify;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {82, Base64.padSymbol, -66, -42};
    private static final int $$f = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {29, -5, -24, -13, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -4, 4};
    private static final int $$k = 62;
    private static final byte[] $$a = {83, -44, 103, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 252;
    private static int cancelAll = 1;
    private static int g = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: isTd1aBuild
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalTrainingDetailActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: isAffectedPixelDevices
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalTrainingDetailActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: isAffectedXiaomiDevices
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalTrainingDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: isAffectedPixelModel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalTrainingDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i7 | i4)) | (~(i8 | i4));
        int i10 = ~(i2 | i7);
        int i11 = i4 | i10 | (~(i8 | i));
        int i12 = i4 + i + i5 + (1997535707 * i6) + (1930545336 * i3);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i4) + 1468203008 + ((-417352845) * i) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i5) + ((-1408630784) * i6) + ((-2070937600) * i3) + (392888320 * i13);
        int i15 = (i4 * (-2054695253)) + 138751921 + (i * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i5 * (-2054694363)) + (i6 * 1502648999) + (i3 * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        int i17 = 2 % 2;
        int i18 = g + 15;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
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
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.$$a
            int r7 = 103 - r7
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 49
            int r5 = 52 - r5
            int r7 = r7 * 49
            int r0 = 50 - r7
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.$$j
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = 49 - r7
            r2 = -1
            if (r1 != 0) goto L16
            r6 = r5
            r3 = r7
            goto L2d
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
        L2d:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + 3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.f(byte, int, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        VocationalTrainingDetailActivity vocationalTrainingDetailActivity = (VocationalTrainingDetailActivity) objArr[0];
        int i = 2 % 2;
        User userAsBinder = vocationalTrainingDetailActivity.onTransact().TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        if (userAsBinder != null) {
            int i2 = g + 97;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                String str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw null;
            }
            PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) vocationalTrainingDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str3 = "";
            if (str2 == null) {
                int i3 = asInterface + 113;
                g = i3 % 128;
                int i4 = i3 % 2;
                str2 = "";
            }
            String str4 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str4 != null) {
                int i5 = g + 35;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                str3 = str4;
            }
            previewDelayWhenVideoCaptureIsBoundQuirk.b(new VocationPhoneVerificationRequest(str2, str3));
        }
        return null;
    }

    public VocationalTrainingDetailActivity() {
        final VocationalTrainingDetailActivity vocationalTrainingDetailActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalTrainingDetailActivity;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = vocationalTrainingDetailActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalTrainingDetailActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/vocation/model/Training;", "p1", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/domain/vocation/model/Training;Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, Training p1, VocationalRegistration p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VocationalTrainingDetailActivity.class, new Pair[]{TuplesKt.to("training", p1), TuplesKt.to("vocation_registration_data", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        String str = "";
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f659a;
        int i4 = -1870535734;
        long j = 0;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 119;
            int i8 = i7 % 128;
            $10 = i8;
            int i9 = i7 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i10 = i8 + 85;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int i13 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 3290;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 31;
                        byte b = (byte) i6;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, i13, packedPositionGroup, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i12++;
                    i4 = -1870535734;
                    j = 0;
                    i6 = 0;
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
        int[] iArr6 = f659a;
        char c = '0';
        if (iArr6 != null) {
            int i14 = $11 + 75;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr6[i2]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) TextUtils.indexOf(str, str, 0);
                    int iMyTid = (Process.myTid() >> 22) + 3291;
                    int iLastIndexOf = TextUtils.lastIndexOf(str, c, 0, 0) + 32;
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMyTid, iLastIndexOf, 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i2++;
                str = str;
                c = '0';
                i5 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        int i15 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i16 = $10 + 57;
            $11 = i16 % 128;
            int i17 = i16 % i15;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i18 = 17;
            for (int i19 = 1; i18 > i19; i19 = 1) {
                int i20 = $10 + 35;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i18];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2559 - View.getDefaultSize(0, 0), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 683220507, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i18 += 119;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i18];
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') + 2511, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, 683220507, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i18--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28880), 347 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollBarSize() >> 8) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i15 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final ActivityResultContractsPickVisualMediaMediaCapabilities onTransact() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) Color.blue(0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
            int i2 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            short s = bArr[5];
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b + 5), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iMakeMeasureSpec, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-2106150538, 1752018305, 1936732191, -1568822357, -993438488, -1253950075, -507642993, 981682076, -910138204, -1937907856, 721780652, 1604054087, -1766776790, 1834254138}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 77, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1545874615, 736230759, -1836740173, 553090686, 1698179894, -1030187714, 2092732206, 5323774, -505718402, -1572091802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_city).substring(0, 1).length() + 14, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int i3 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
            byte[] bArr2 = $$a;
            short s2 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(s2, (byte) (s2 & 52), bArr2[54], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, iLastIndexOf, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte b2 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((short) 51, b2, b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, packedPositionChild, iLastIndexOf2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i4 = ~new Random().nextInt(1957268705);
            int i5 = ~(614039454 | i4);
            int i6 = 1499946764 + ((i5 | (-573729226)) * 764) + (((~(i4 | (-573729226))) | 537946504) * (-1528)) + (((-111875672) | i5) * 764) + 190196557;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            int i9 = asInterface + 49;
            g = i9 % 128;
            int i10 = i9 % 2;
            c = 2;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i11 = asInterface + 37;
                g = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr8 = new Object[1];
                e(new int[]{62183956, 805080600, 1897205886, -1050898574, 32836166, 1807763819, 1668369798, -616267489, -1006707905, 539604106, 74248695, -185751440, 862276774, -790006410, 847444761, -1411753441}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{556123023, 1127912713, 1028854834, -2033457138, 1535164380, 1027298178, -1434609742, -863716070, -2117360128, -837515284, 1592428979, 1441366865}, Gravity.getAbsoluteGravity(0, 0) + 18, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{-1779171091, 121890861, -275730394, -1331398885, -620254180, 1186283700, 491537660, 963348239, -62772152, -915138494}, 16 - Gravity.getAbsoluteGravity(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{-1461486610, 530181465, -87513115, -2134992355, -1707325776, -480173895, -1273618171, -454117969, -542557396, 1476382932}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 95, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = asInterface + 5;
            g = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 190196557};
                byte[] bArr3 = $$j;
                byte b3 = bArr3[35];
                byte b4 = (byte) (b3 - 1);
                Object[] objArr13 = new Object[1];
                f(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[35];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int gidForName = 9 - Process.getGidForName("");
                        byte b8 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 51, b8, b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, scrollBarFadeDuration, gidForName, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new int[]{-2106150538, 1752018305, 1936732191, -1568822357, -993438488, -1253950075, -507642993, 981682076, -910138204, -1937907856, 721780652, 1604054087, -1766776790, 1834254138}, 22 - (Process.myPid() >> 22), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new int[]{-1545874615, 736230759, -1836740173, 553090686, 1698179894, -1030187714, 2092732206, 5323774, -505718402, -1572091802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
                            byte[] bArr4 = $$a;
                            short s3 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            c(s3, (byte) (s3 & 52), bArr4[54], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, absoluteGravity, packedPositionType, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cGreen = (char) Color.green(0);
                            int i15 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            short s4 = bArr5[5];
                            byte b9 = bArr5[7];
                            Object[] objArr20 = new Object[1];
                            c(s4, b9, (byte) (b9 + 5), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, i15, fadingEdgeLength, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            throw null;
        }
        int i16 = asInterface + 93;
        g = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i19 = ~(((int) Process.getStartUptimeMillis()) | 916446289);
        int i20 = i18 + ((((-44505646) | i19) * (-658)) - 368071820) + ((i19 | (-918543998)) * 658);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
        return (ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalTrainingDetilInformationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 83;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            VocationalTrainingDetailActivity$bindingInflater$1 vocationalTrainingDetailActivity$bindingInflater$1 = VocationalTrainingDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VocationalTrainingDetailActivity$bindingInflater$1 vocationalTrainingDetailActivity$bindingInflater$2 = VocationalTrainingDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = g + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return vocationalTrainingDetailActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws ParseException {
        int i = 2 % 2;
        int i2 = g + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        VocationalTrainingDetailActivity vocationalTrainingDetailActivity = this;
        Intrinsics.checkNotNullParameter(vocationalTrainingDetailActivity, "");
        vocationalTrainingDetailActivity.getWindow().addFlags(8192);
        ActivityVocationalTrainingDetilInformationBinding activityVocationalTrainingDetilInformationBinding = (ActivityVocationalTrainingDetilInformationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        Training training = (Training) this.b.getValue();
        if (training != null) {
            int i4 = asInterface + 77;
            g = i4 % 128;
            int i5 = i4 % 2;
            TuitionPaymentFragmentbindingInflater1(((ActivityVocationalTrainingDetilInformationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbar, true);
            activityVocationalTrainingDetilInformationBinding.tvToolbarTitle.setText(training.cancel);
            TextView textView = activityVocationalTrainingDetilInformationBinding.tvRating;
            String str = training.INotificationSideChannelStub;
            if (str.length() == 0) {
                int i6 = asInterface + 97;
                g = i6 % 128;
                if (i6 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str = "0.0";
            }
            textView.setText(str);
            activityVocationalTrainingDetilInformationBinding.tvLpkname.setText(training.INotificationSideChannel);
            TextView textView2 = activityVocationalTrainingDetilInformationBinding.tvTrainingDuration;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(training.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "dd-MM-yyyy", "dd MMM yyyy");
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(training.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "dd-MM-yyyy", "dd MMM yyyy");
            StringBuilder sb = new StringBuilder();
            sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(" - ");
            sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            textView2.setText(sb.toString());
            activityVocationalTrainingDetilInformationBinding.tvTrainingParticipants.setText(getString(R.string.label_number_of_participants, training.INotificationSideChannelStubProxy));
            activityVocationalTrainingDetilInformationBinding.tvTrainingModule.setText(training.asBinder);
            activityVocationalTrainingDetilInformationBinding.tvTrainingDescription.setText(training.TuitionPaymentFragmentbindingInflater1);
            activityVocationalTrainingDetilInformationBinding.tvTrainingLocation.setText(getString(R.string.sample_dash));
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityVocationalTrainingDetilInformationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnApplyNow;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isTkq1Build
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (View) obj};
                return (Unit) VocationalTrainingDetailActivity.b(-1012794891, zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, 1012794891, zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }));
        a();
        int i2 = asInterface + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        VocationalTrainingDetailActivity vocationalTrainingDetailActivity = this;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.observe(vocationalTrainingDetailActivity, new Observer() { // from class: JpegCaptureDownsizingQuirk
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VocationalTrainingDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel.observe(vocationalTrainingDetailActivity, new Observer() { // from class: isTp1aBuild
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VocationalTrainingDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asInterface + 61;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 com.bpjstku.domain.vocation.model.Training) = (r1v6 com.bpjstku.domain.vocation.model.Training), (r1v14 com.bpjstku.domain.vocation.model.Training) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        Training training;
        int i = 2 % 2;
        int i2 = asInterface + 57;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            training = (Training) this.b.getValue();
            int i3 = 51 / 0;
            if (training != null) {
                ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1(training.g);
            }
        } else {
            training = (Training) this.b.getValue();
            if (training != null) {
                ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1(training.g);
            }
        }
        int i4 = g + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        g = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = asInterface + 63;
            g = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
            int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
            short s = (short) 51;
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s + 1), $$a[54], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, absoluteGravity, i2, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-2106150538, 1752018305, 1936732191, -1568822357, -993438488, -1253950075, -507642993, 981682076, -910138204, -1937907856, 721780652, 1604054087, -1766776790, 1834254138}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).length() + 5, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1545874615, 736230759, -1836740173, 553090686, 1698179894, -1030187714, 2092732206, 5323774, -505718402, -1572091802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int iGreen = 15 - Color.green(0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[2], (byte) ($$b & 55), bArr[54], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, iLastIndexOf, iGreen, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asInterface + 101;
            g = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                byte[] bArr2 = $$a;
                short s2 = bArr2[5];
                byte b = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(s2, b, (byte) (b + 5), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iLastIndexOf2, iCombineMeasuredStates, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~new Random().nextInt();
            int i8 = ((1630611160 + (((~((-610842871) | i7)) | 366562700) * (-933))) + (((~(i7 | 366562700)) | (-905575935)) * 933)) - 1480527827;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{-1779171091, 121890861, -275730394, -1331398885, -620254180, 1186283700, 491537660, 963348239, -62772152, -915138494}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{-1461486610, 530181465, -87513115, -2134992355, -1707325776, -480173895, -1273618171, -454117969, -542557396, 1476382932}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unable_to_parse_information).substring(0, 31).length() - 15, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1993943926};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1134 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1588569595, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int iIndexOf = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    short s3 = (short) 51;
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 + 1), $$a[54], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iIndexOf, packedPositionGroup2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45992), (ViewConfiguration.getEdgeSlop() >> 16) + 1117, ((Process.getThreadPriority(0) + 20) >> 6) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                    int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr3 = $$a;
                    short s4 = bArr3[5];
                    byte b2 = bArr3[7];
                    Object[] objArr13 = new Object[1];
                    c(s4, b2, (byte) (b2 + 5), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, capsMode, i11, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{-2106150538, 1752018305, 1936732191, -1568822357, -993438488, -1253950075, -507642993, 981682076, -910138204, -1937907856, 721780652, 1604054087, -1766776790, 1834254138}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{-1545874615, 736230759, -1836740173, 553090686, 1698179894, -1030187714, 2092732206, 5323774, -505718402, -1572091802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step2).substring(13, 14).length() + 14, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int capsMode2 = 1031 - TextUtils.getCapsMode("", 0, 0);
                        int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr4[2], (byte) ($$b & 55), bArr4[54], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, capsMode2, scrollDefaultDelay, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                        short s5 = (short) 51;
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 + 1), $$a[54], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode3, keyRepeatTimeout, iIndexOf2, 1357589585, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i17 = ~new Random().nextInt(704422037);
            int i18 = i14 + ((((-1753597967) + (((~(i17 | 1031139327)) | (~((-738492938) | i17))) * (-184))) + (((268463280 | (~((-1006956218) | i17))) | (~(762676047 | i17))) * 184)) - 154725128);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[3])[0];
            int i23 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iMyPid = Process.myPid();
            int i24 = i21 + ((((-32342713) + (((~iMyPid) | 311467162) * 1444)) + (((~(iMyPid | (-779016926))) | ((~(1023297095 | iMyPid)) | 33593496)) * (-1444))) - 1540992294);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr19[2])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 1755;
            int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
            Object[] objArr20 = new Object[1];
            c((short) ModuleDescriptor.MODULE_VERSION, (byte) 37, $$a[54], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(minimumFlingVelocity, iCombineMeasuredStates2, deadChar, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                int iCombineMeasuredStates3 = 1755 - View.combineMeasuredStates(0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16777239;
                byte[] bArr5 = $$a;
                Object[] objArr21 = new Object[1];
                c(bArr5[2], (byte) ($$b & 55), bArr5[54], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf2, iCombineMeasuredStates3, iRgb, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode;
            int i28 = ~((-330350411) | i27);
            int i29 = ~(117747984 | iIdentityHashCode);
            int i30 = (-1774707662) + ((i28 | i29) * 1150) + (((~((-117747985) | i27)) | i29) * (-575)) + (((~(iIdentityHashCode | (-330350411))) | (~(i27 | 330350410))) * 575) + 1668848560;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{-1779171091, 121890861, -275730394, -1331398885, -620254180, 1186283700, 491537660, 963348239, -62772152, -915138494}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobweb).substring(0, 11).codePointAt(7) - 16, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{-1461486610, 530181465, -87513115, -2134992355, -1707325776, -480173895, -1273618171, -454117969, -542557396, 1476382932}, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1993943926};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - Gravity.getAbsoluteGravity(0, 0)), View.MeasureSpec.getMode(0) + 1726, 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1668848560, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                int size = View.MeasureSpec.getSize(0) + 23;
                byte[] bArr6 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr6[2], (byte) ($$b & 55), bArr6[54], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout, fadingEdgeLength, size, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-2106150538, 1752018305, 1936732191, -1568822357, -993438488, -1253950075, -507642993, 981682076, -910138204, -1937907856, 721780652, 1604054087, -1766776790, 1834254138}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-1545874615, 736230759, -1836740173, 553090686, 1698179894, -1030187714, 2092732206, 5323774, -505718402, -1572091802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf3 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                    int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                    byte[] bArr7 = $$a;
                    short s6 = bArr7[5];
                    Object[] objArr29 = new Object[1];
                    c(s6, (byte) (s6 & 52), bArr7[54], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, windowTouchSlop, iLastIndexOf3, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
                    int i33 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int packedPositionGroup3 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr30 = new Object[1];
                    c((short) ModuleDescriptor.MODULE_VERSION, (byte) 37, $$a[54], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode, i33, packedPositionGroup3, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i34 = asInterface + 65;
                g = i34 % 128;
                int i35 = i34 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        if (i37 == i36) {
            int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode2;
            int i40 = i38 + ((((~(519937918 | i39)) | (~((-2097667) | iIdentityHashCode2))) * 988) - 932629227) + (((~(iIdentityHashCode2 | 305237826)) | 214700092 | (~(i39 | (-2097667)))) * 988);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr31[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
        if (strArr5 != null) {
            for (String str2 : strArr5) {
                int i43 = g + 99;
                asInterface = i43 % 128;
                int i44 = i43 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
        int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i47 = ~i46;
        int i48 = i45 + 306542414 + (((~((-729498168) | i47)) | 516895741) * (-865)) + ((~(i46 | 729498167)) * 865) + (((~(516895741 | i47)) | (~(i47 | 729498167))) * 865);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr32[3])[0] = i50 ^ (i50 << 5);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws IllegalAccessException {
        VocationalTrainingDetailActivity vocationalTrainingDetailActivity = (VocationalTrainingDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = ~iFreeMemory;
        if (i4 != 2142254032 + (((-1150852137) | i5) * (-369)) + (((~((-992166360) | i5)) | (-1822153903)) * (-369)) + (((~(iFreeMemory | 992166359)) | (-2143018496) | (~(i5 | (-671301767)))) * 369)) {
            throw new RuntimeException("795800193");
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ~((int) Runtime.getRuntime().freeMemory());
        if (i6 != (-856319252) + (((~(i7 | 1970791739)) | 608264225) * (-828)) + ((i7 | 1970791739) * (-828)) + 272011760) {
            throw null;
        }
        super.onResume();
        int i8 = g + 63;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cd, code lost:
    
        if (r1 == (((1385593784 + ((r7 | r8) * 1150)) + (((~(2037682055 | r3)) | r8) * (-575))) + (((~(r2 | (-541373910))) | (~(r3 | 541373909))) * 575))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cf, code lost:
    
        r1 = com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.g + 23;
        com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.asInterface = r1 % 128;
        r1 = r1 % 2;
        r1 = new int[1846362687];
        r1[1846362686(0x6e0d423e, float:1.0929367E28)] = 1;
        r2 = (-2122495678) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f0, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.g + 111;
        com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fc, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fe, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ff, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0102, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
    
        throw new java.lang.RuntimeException("1975313058");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (r1 == ((((~((-19202183) | r7)) * 521) - 961281486) + (((~((~r7) | (-19202183))) | (-1403891648)) * 521))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007d, code lost:
    
        if (r1 == (((609852012 + (((-281274334) | r7) * (-220))) + ((r7 | 1111228448) * 220)) + 1447193716)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007f, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        r3 = ~r2;
        r7 = ~((-541373910) | r3);
        r8 = ~((-2037682056) | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalTrainingDetailActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iNextInt = new Random().nextInt(1230783560);
        int i5 = ~iNextInt;
        if (i4 != 436818192 + (((~((-115485206) | i5)) | (-945472749)) * 519) + (((~(i5 | (-4325381))) | (~((-941147369) | iNextInt))) * (-519)) + (((~(iNextInt | (-945472749))) | 115485205) * 519)) {
            int i6 = asInterface + 57;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                int[] iArr = new int[1029380761];
                iArr[1029380760] = 0;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1029380761];
                iArr2[1029380760] = 1;
                int i7 = (-1741794088) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        int i10 = (~((-1688427861) | i9)) | 604063744;
        int i11 = ~(iIdentityHashCode | 1974992220);
        if (i8 != ((i10 | i11) * (-252)) + 184296796 + ((i11 | (~(i9 | (-1084364117)))) * 252)) {
            int i12 = (-418456128) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i13 = asInterface + 91;
        g = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(VocationalTrainingDetailActivity vocationalTrainingDetailActivity) {
        int i = 2 % 2;
        int i2 = g + 23;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            vocationalTrainingDetailActivity.onTransact().TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = vocationalTrainingDetailActivity.onTransact().TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = asInterface + 93;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return userAsBinder;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalTrainingDetailActivity vocationalTrainingDetailActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            vocationalTrainingDetailActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i5 = i2 + 101;
                g = i5 % 128;
                int i6 = i5 % 2;
                vocationalTrainingDetailActivity.IconCompatParcelizer();
                ((ActivityVocationalTrainingDetilInformationBinding) ((ViewBinding) vocationalTrainingDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvTrainingLocation.setText(((PickVisualMediaRequestdefault) CollectionsKt.first((List) ((Pair) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getFirst())).b);
                return;
            }
            return;
        }
        vocationalTrainingDetailActivity.IconCompatParcelizer();
        String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str == null) {
            int i7 = asInterface + 53;
            int i8 = i7 % 128;
            g = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 95;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            str = "";
        }
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str, 0).show();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalTrainingDetailActivity vocationalTrainingDetailActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asInterface + 117;
            g = i2 % 128;
            int i3 = i2 % 2;
            vocationalTrainingDetailActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = asInterface + 105;
            g = i4 % 128;
            int i5 = i4 % 2;
            vocationalTrainingDetailActivity.IconCompatParcelizer();
            String str2 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str2 != null ? str2 : "", 0).show();
            return;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            vocationalTrainingDetailActivity.IconCompatParcelizer();
            VocationalVerifyPhoneOtpActivity.Companion companion = VocationalVerifyPhoneOtpActivity.INSTANCE;
            VocationalTrainingDetailActivity vocationalTrainingDetailActivity2 = vocationalTrainingDetailActivity;
            Verification verification = (Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            VocationalRegistration vocationalRegistration = (VocationalRegistration) vocationalTrainingDetailActivity.asInterface.getValue();
            if (vocationalRegistration != null) {
                Training training = (Training) vocationalTrainingDetailActivity.b.getValue();
                String str3 = null;
                if (training != null) {
                    int i6 = asInterface + 17;
                    g = i6 % 128;
                    if (i6 % 2 != 0) {
                        String str4 = training.a;
                        str3.hashCode();
                        throw null;
                    }
                    str = training.a;
                } else {
                    str = null;
                }
                if (str == null) {
                    int i7 = g + 11;
                    asInterface = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 68 / 0;
                    }
                    str = "";
                }
                Intrinsics.checkNotNullParameter(str, "");
                vocationalRegistration.read = str;
                Training training2 = (Training) vocationalTrainingDetailActivity.b.getValue();
                str3 = training2 != null ? training2.d : null;
                if (str3 == null) {
                    int i9 = g + 103;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    str3 = "";
                }
                Intrinsics.checkNotNullParameter(str3, "");
                vocationalRegistration.write = str3;
            } else {
                vocationalRegistration = new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
            }
            VocationalVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalTrainingDetailActivity2, verification, vocationalRegistration);
        }
    }

    public static /* synthetic */ VocationalRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalTrainingDetailActivity vocationalTrainingDetailActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            vocationalTrainingDetailActivity.getIntent();
            throw null;
        }
        Intent intent = vocationalTrainingDetailActivity.getIntent();
        if (intent != null) {
            return (VocationalRegistration) intent.getParcelableExtra("vocation_registration_data");
        }
        int i3 = g + 101;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ isAffectedOppoDevices b(VocationalTrainingDetailActivity vocationalTrainingDetailActivity) {
        int i = 2 % 2;
        isAffectedOppoDevices isaffectedoppodevices = new isAffectedOppoDevices(new VocationalTrainingDetailActivity$vocationalRegistrationVerificationDialogFragment$2$1(vocationalTrainingDetailActivity), null, 2, 0 == true ? 1 : 0);
        int i2 = g + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return isaffectedoppodevices;
        }
        throw null;
    }

    public static /* synthetic */ Training TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationalTrainingDetailActivity vocationalTrainingDetailActivity) {
        int i = 2 % 2;
        int i2 = g + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = vocationalTrainingDetailActivity.getIntent();
        Object obj = null;
        if (intent == null) {
            return null;
        }
        int i4 = asInterface + 15;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return (Training) intent.getParcelableExtra("training");
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        VocationalTrainingDetailActivity vocationalTrainingDetailActivity = (VocationalTrainingDetailActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        isAffectedOppoDevices isaffectedoppodevices = (isAffectedOppoDevices) vocationalTrainingDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        FragmentManager supportFragmentManager = vocationalTrainingDetailActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(isaffectedoppodevices.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = g + 95;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            isaffectedoppodevices.show(supportFragmentManager, isaffectedoppodevices.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = g + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalTrainingDetailActivity vocationalTrainingDetailActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) b(-1012794891, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{vocationalTrainingDetailActivity, view}, 1012794891, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        notify = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 77;
        notify = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalTrainingDetailActivity vocationalTrainingDetailActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-632673830, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{vocationalTrainingDetailActivity}, 632673831, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_vocational_training_detil_information;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_network_msg).substring(33, 36).codePointAt(2) + 416759751;
        b(1289643622, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, -1289643620, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iCodePointAt);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(-547762096, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, TelemetryUsageEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 547762099, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 65;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        f659a = new int[]{-59644664, -1043812601, -294737867, -1702160746, 1646508709, -2077419920, -1747102372, 1563669922, -617283310, -1796828465, 945628949, 2113383764, -1531364328, 1757059830, 792309778, 451042090, 1709562794, -413661555};
    }

    private static String $$i(byte b, byte b2, int i) {
        int i2 = (b2 * 56) + 66;
        int i3 = i * 2;
        byte[] bArr = $$c;
        int i4 = 3 - (b * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i2;
            i4 = i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i6 = i4 + 1;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i6];
            i4 = i6;
        }
    }
}
