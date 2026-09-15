package com.bpjstku.presentation.treatment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityTreatmentNotificationBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.treatment.TreatmentNotificationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzbrl;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapper;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TwilightManager;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.checkShowingFlags;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.dumpAudioCapabilities;
import defpackage.getCameraState;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.registerAvailabilityCallback;
import defpackage.setQuickZoomEnabled;
import defpackage.setSurfaceOccupancyPriority;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004R\u0015\u0010\u0007\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0015\u0010\u0018\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0015\u0010\r\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0017\u0010\u001e\u001a\u0004\u0018\u00010%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0015\u0010#\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0017\u0010\u001b\u001a\u0004\u0018\u00010!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010\u0015R\u0017\u0010&\u001a\u0004\u0018\u00010!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u000b\u001a\u00020)8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010*R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00020+8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010-"}, d2 = {"Lcom/bpjstku/presentation/treatment/TreatmentNotificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTreatmentNotificationBinding;", "<init>", "()V", "", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lid/vida/liveness/dto/VidaLivenessResponse;", "p0", "(Lid/vida/liveness/dto/VidaLivenessResponse;)V", "cancelAll", "asInterface", "b", "a", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LcheckShowingFlags;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "LacquireBuffer;", "LgetCameraState;", "cancel", "LgetCameraState;", "LgetStringOrNull;", "d", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Ljava/lang/String;", "onTransact", "g", "Lcom/bpjstku/domain/user/model/User;", "INotificationSideChannel", "LoutputFormatToAudioProfile;", "notify", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TreatmentNotificationActivity extends BindingBaseActivity<ActivityTreatmentNotificationBinding> {
    private static char INotificationSideChannelDefault;
    private static int IconCompatParcelizer;
    private static char RemoteActionCompatParcelizer;
    private static char cancelAll;
    private static char getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private getCameraState TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String a;
    private static final byte[] $$c = {87, 51, -85, 78};
    private static final int $$f = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {92, 126, -38, -95, -12, 2, 63, -51, -15, 0, -3, 13, -6, -13, 20, -13, 68, -59, -5, -6, 15, -13, 4, 13, -11, 62, -19, -5, -30, 51, -68, 34, 15, -7, 39, -18, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 66};
    private static final int $$k = 43;
    private static final byte[] $$a = {115, 98, 19, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 56;
    private static int MediaBrowserCompat = 0;
    private static int INotificationSideChannelStub = 0;
    private static int connect = 1;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: lambdaonCameraUnavailable2androidxcameracamera2internalcompatCameraManagerCompatAvailabilityCallbackExecutorWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
            return (User) TreatmentNotificationActivity.b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 721425500, objArr, -721425497, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy onTransact = LazyKt.lazy(new Function0() { // from class: lambdaonCameraAvailable1androidxcameracamera2internalcompatCameraManagerCompatAvailabilityCallbackExecutorWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TreatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: unregisterAvailabilityCallback
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            return (String) TreatmentNotificationActivity.b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1257514428, objArr, -1257514424, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel = LazyKt.lazy(new CameraManagerCompatAvailabilityCallbackExecutorWrapper(this));

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i3 | i2));
        int i12 = i8 | i3;
        int i13 = (~(i | i3)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i3 + i2 + i6 + ((-1468046718) * i4) + (327422179 * i5);
        int i16 = i15 * i15;
        int i17 = (677926197 * i3) + 1810235392 + (1154460365 * i2) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i6) + (1933049856 * i4) + (743702528 * i5) + (286654464 * i16);
        int i18 = (i3 * (-645773371)) + 280972133 + (i2 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i6 * (-645772719)) + (i4 * 1523302178) + (i5 * 1475409363) + (i16 * (-1007288320));
        int i19 = i17 + (i18 * i18 * (-492175360));
        if (i19 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i19 == 2) {
            return b(objArr);
        }
        if (i19 != 3) {
            return i19 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2 = s + 84;
        int i3 = 159 - (i * 52);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - b];
        int i4 = 52 - b;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 11;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i7])) - 11;
            i3 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r7 = r7 * 32
            int r7 = 36 - r7
            byte[] r0 = com.bpjstku.presentation.treatment.TreatmentNotificationActivity.$$j
            int r6 = r6 * 20
            int r1 = r6 + 33
            byte[] r1 = new byte[r1]
            int r6 = r6 + 32
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.treatment.TreatmentNotificationActivity.f(short, short, short, java.lang.Object[]):void");
    }

    public TreatmentNotificationActivity() {
        final TreatmentNotificationActivity treatmentNotificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.treatment.TreatmentNotificationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = treatmentNotificationActivity;
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<checkShowingFlags>() { // from class: com.bpjstku.presentation.treatment.TreatmentNotificationActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, checkShowingFlags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ checkShowingFlags invoke() {
                LifecycleOwner lifecycleOwner = treatmentNotificationActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(checkShowingFlags.class);
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
        final TreatmentNotificationActivity treatmentNotificationActivity2 = this;
        this.b = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.treatment.TreatmentNotificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = treatmentNotificationActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 29;
        connect = i2 % 128;
        int i3 = i2 % 2;
        TreatmentNotificationActivity$bindingInflater$1 treatmentNotificationActivity$bindingInflater$1 = TreatmentNotificationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = connect + 113;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 == 0) {
            return treatmentNotificationActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TreatmentNotificationActivity treatmentNotificationActivity = this;
        String str = "";
        Intrinsics.checkNotNullParameter(treatmentNotificationActivity, "");
        treatmentNotificationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityTreatmentNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityTreatmentNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setTitle(getString(R.string.title_treatment_verification));
        TextView textView = ((ActivityTreatmentNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvUserName;
        String str2 = (String) this.cancel.getValue();
        if (str2 == null) {
            int i2 = INotificationSideChannelStub + 101;
            connect = i2 % 128;
            int i3 = i2 % 2;
            str2 = "";
        }
        textView.setText(str2);
        TextView textView2 = ((ActivityTreatmentNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvHospitalName;
        String str3 = (String) this.INotificationSideChannel.getValue();
        if (str3 == null) {
            int i4 = connect + 73;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = str3;
        }
        textView2.setText(str);
        ((ActivityTreatmentNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvMessage.setText(getString(R.string.message_treatment_verification_info));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityTreatmentNotificationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnVerification;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getConcurrentCameraIds
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        int i2 = connect + 121;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $11 + 11;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) INotificationSideChannelDefault) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(RemoteActionCompatParcelizer);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char minimumFlingVelocity = (char) (47773 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i10 = 468 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, i10, i11, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) cancelAll) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getInterfaceDescriptor)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 47773), (KeyEvent.getMaxKeyCode() >> 16) + 468, View.MeasureSpec.makeMeasureSpec(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i12 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), 16779539 + Color.rgb(0, 0, 0), Color.green(0) + 44, -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i13 = $10 + 99;
            $11 = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VidaLivenessResponse p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 69;
        connect = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            IconCompatParcelizer();
            str.hashCode();
            throw null;
        }
        IconCompatParcelizer();
        if (p0 != null) {
            byte[] imageBytes = p0.getImageBytes();
            if (imageBytes != null) {
                int i3 = connect + 55;
                INotificationSideChannelStub = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(imageBytes, "");
                String strEncodeToString = Base64.encodeToString(imageBytes, 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                str = strEncodeToString;
            } else {
                int i5 = INotificationSideChannelStub + 93;
                connect = i5 % 128;
                int i6 = i5 % 2;
            }
            this.asInterface = str;
            this.a = p0.getTransactionId();
            this.g = String.valueOf(p0.getLivenessScore());
            this.asBinder = String.valueOf(p0.getManipulationScore());
            cancelAll();
            int i7 = INotificationSideChannelStub + 45;
            connect = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 2;
            }
        }
    }

    private final void cancelAll() {
        int i = 2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.title_verification_success);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.message_treatment_verification_success);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, new Function0() { // from class: getCameraIdList
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TreatmentNotificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }, 96);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullB;
        if (getstringornullB != null) {
            int i2 = INotificationSideChannelStub + 39;
            connect = i2 % 128;
            int i3 = i2 % 2;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = INotificationSideChannelStub + 23;
                connect = i4 % 128;
                if (i4 % 2 == 0) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        int i5 = connect + 73;
        INotificationSideChannelStub = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        VideoRecordEventStart<TwilightManager> videoRecordEventStartHide = ((checkShowingFlags) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.hide();
        Intrinsics.checkNotNullExpressionValue(videoRecordEventStartHide, "");
        VideoRecordEventStart<TwilightManager> videoRecordEventStartObserveOn = videoRecordEventStartHide.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: lambdaonCameraAccessPrioritiesChanged0androidxcameracamera2internalcompatCameraManagerCompatAvailabilityCallbackExecutorWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (TwilightManager) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: openCamera
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                TreatmentNotificationActivity.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        int i2 = INotificationSideChannelStub + 63;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[Catch: all -> 0x05aa, TryCatch #2 {all -> 0x05aa, blocks: (B:5:0x001d, B:12:0x003d, B:14:0x004a, B:15:0x0081, B:17:0x0115, B:18:0x0152, B:20:0x0166, B:22:0x016f, B:23:0x01ad, B:58:0x0516, B:61:0x052f, B:63:0x0597, B:64:0x05a0, B:25:0x0225, B:27:0x022b, B:30:0x029e, B:32:0x02a2, B:36:0x02ae, B:37:0x02b2, B:42:0x03b9, B:44:0x03c0, B:45:0x03ff, B:47:0x0407, B:48:0x0462, B:50:0x046f, B:51:0x04ae, B:53:0x04c4, B:54:0x0506, B:55:0x050d, B:56:0x0512, B:66:0x05a2, B:68:0x05a8, B:69:0x05a9, B:11:0x0036, B:9:0x002d, B:39:0x035c), top: B:77:0x0018, inners: #0, #1 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = connect + 77;
        INotificationSideChannelStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 95 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                int i4 = $$b;
                Object[] objArr2 = new Object[1];
                c((byte) (i4 >>> 2), (byte) (-$$a[14]), (byte) (i4 - 4), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, packedPositionChild, offsetAfter, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{63797, 19537, 47326, 23008, 764, 21603, 52766, 39878, 2146, 51778, 4493, 21617, 37575, 64863, 62066, 24452, 65420, 56665, 55666, 4530, 27103, 32225, 50334, 36890}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 77, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{20906, 43099, 29145, 58109, 10527, 15369, 5583, 8176, 57315, 44035, 5395, 54328, 54204, 33773, 16973, 65202, 186, 17136}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step5).substring(3, 4).codePointAt(0) - 102, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) Color.blue(0);
                int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr5 = new Object[1];
                c(b, (byte) (-bArr[14]), b, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, scrollBarSize, minimumFlingVelocity, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iRgb = Color.rgb(0, 0, 0) + 16778092;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    c(bArr2[2], bArr2[40], (byte) ($$b - 4), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iRgb, iIndexOf, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ~iIdentityHashCode;
                int i6 = (-1147207212) + ((787218175 | iIdentityHashCode) * (-676)) + (((~(686394474 | i5)) | (-787218176)) * 676) + (((~(iIdentityHashCode | (-100823702))) | (~(i5 | 646084245)) | 141133930) * 676) + 1185056678;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            } else {
                Context baseContext = getBaseContext();
                if (baseContext == null) {
                    Object[] objArr8 = new Object[1];
                    e(new char[]{140, 59421, 24295, 12244, 31464, 38870, 50816, 9177, 51069, 48945, 11716, 24595, 59045, 3928, 34152, 27719, 5747, 46116, 2705, 63082, 59075, 51626, 31861, 35165, 31519, 18237, 2937, 44502}, 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    e(new char[]{6192, 16620, 53205, 33374, 52372, 2700, 32707, 12822, 10189, 48370, 47968, 27942, 43575, 37319, 36716, 1811, 20762, 51482, 63155, 40836}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).length() + 1, objArr9);
                    baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                }
                if (baseContext != null) {
                    int i9 = INotificationSideChannelStub + 89;
                    connect = i9 % 128;
                    int i10 = i9 % 2;
                    baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{20360, 47267, 34363, 47372, 39259, 58022, 36449, 33131, 30398, 1850, 44436, 37744, 13275, 39546, 63868, 64994, 7293, 1674}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klik_bca_continue).substring(39, 48).codePointAt(5) - 50, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{6858, 19047, 45065, 47503, 36782, 6129, 45382, 21447, 53378, 19860, 26996, 52987, 33253, 57144, 59905, 23120, 32867, 61996}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_paid_orderid).substring(0, 9).codePointAt(2) - 84, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i11 = connect + 47;
                INotificationSideChannelStub = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 1185056678};
                    byte[] bArr3 = $$j;
                    byte b2 = bArr3[9];
                    Object[] objArr13 = new Object[1];
                    f(b2, bArr3[41], b2, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b3 = bArr3[41];
                    Object[] objArr14 = new Object[1];
                    f(b3, bArr3[9], b3, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (baseContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                            int i13 = 876 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr4 = $$a;
                            Object[] objArr16 = new Object[1];
                            c(bArr4[2], bArr4[40], (byte) ($$b - 4), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i13, edgeSlop, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(new char[]{63797, 19537, 47326, 23008, 764, 21603, 52766, 39878, 2146, 51778, 4493, 21617, 37575, 64863, 62066, 24452, 65420, 56665, 55666, 4530, 27103, 32225, 50334, 36890}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(new char[]{20906, 43099, 29145, 58109, 10527, 15369, 5583, 8176, 57315, 44035, 5395, 54328, 54204, 33773, 16973, 65202, 186, 17136}, 15 - Color.argb(0, 0, 0, 0), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char gidForName = (char) ((-1) - Process.getGidForName(""));
                                int minimumFlingVelocity2 = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                                byte[] bArr5 = $$a;
                                byte b4 = bArr5[7];
                                Object[] objArr19 = new Object[1];
                                c(b4, (byte) (-bArr5[14]), b4, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, minimumFlingVelocity2, maximumDrawingCacheSize, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                int i14 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int i15 = $$b;
                                Object[] objArr20 = new Object[1];
                                c((byte) (i15 >>> 2), (byte) (-$$a[14]), (byte) (i15 - 4), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, i14, threadPriority, 252381699, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            if (i17 != i16) {
                throw new RuntimeException(String.valueOf(i17));
            }
            int i18 = connect + 79;
            INotificationSideChannelStub = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = i20 + (-1079544353) + (((~(iIdentityHashCode2 | (-275104060))) | 315414288) * 191) + (((~((~iIdentityHashCode2) | (-275104060))) | 272941328) * 191);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[1])[0] = i23 ^ (i23 << 5);
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = connect + 107;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        ((acquireBuffer) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = connect + 49;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2 = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int iBlue = 1031 - Color.blue(0);
            int iRgb = (-16777201) - Color.rgb(0, 0, 0);
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b, bArr[40], b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iBlue, iRgb, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{63797, 19537, 47326, 23008, 764, 21603, 52766, 39878, 2146, 51778, 4493, 21617, 37575, 64863, 62066, 24452, 65420, 56665, 55666, 4530, 27103, 32225, 50334, 36890}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step5).substring(8, 9).length() + 21, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{20906, 43099, 29145, 58109, 10527, 15369, 5583, 8176, 57315, 44035, 5395, 54328, 54204, 33773, 16973, 65202, 186, 17136}, View.resolveSize(0, 0) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
            int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b2, bArr2[5], b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, longPressTimeout, keyRepeatDelay, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                int i4 = $$b;
                Object[] objArr7 = new Object[1];
                c((byte) (i4 >>> 2), (byte) (-$$a[14]), (byte) (i4 - 4), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iCombineMeasuredStates, iMakeMeasureSpec, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr8[3])[0];
            int i6 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i7 = ((((-1210876524) + (((-6819913) | iUptimeMillis) * (-627))) + (((~(300568926 | iUptimeMillis)) | 544849096) * (-627))) + (((~(iUptimeMillis | 544849096)) | (~((~iUptimeMillis) | (-300568927)))) * 627)) - 1259729040;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{20360, 47267, 34363, 47372, 39259, 58022, 36449, 33131, 30398, 1850, 44436, 37744, 13275, 39546, 63868, 64994, 7293, 1674}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{6858, 19047, 45065, 47503, 36782, 6129, 45382, 21447, 53378, 19860, 26996, 52987, 33253, 57144, 59905, 23120, 32867, 61996}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {418738284};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46038), 1134 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1259729040, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr13 = new Object[1];
                    c(b3, bArr3[40], b3, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, bitsPerPixel, iNormalizeMetaState, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45993), 1117 - (ViewConfiguration.getTouchSlop() >> 8), (Process.myTid() >> 22) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int iRgb2 = (-16777201) - Color.rgb(0, 0, 0);
                    int i10 = $$b;
                    Object[] objArr14 = new Object[1];
                    c((byte) (i10 >>> 2), (byte) (-$$a[14]), (byte) (i10 - 4), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, maximumFlingVelocity2, iRgb2, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{63797, 19537, 47326, 23008, 764, 21603, 52766, 39878, 2146, 51778, 4493, 21617, 37575, 64863, 62066, 24452, 65420, 56665, 55666, 4530, 27103, 32225, 50334, 36890}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{20906, 43099, 29145, 58109, 10527, 15369, 5583, 8176, 57315, 44035, 5395, 54328, 54204, 33773, 16973, 65202, 186, 17136}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).length() - 50, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "") + 15;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        c(b4, bArr4[5], b4, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyPid, minimumFlingVelocity, iIndexOf, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cGreen = (char) Color.green(0);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        c(b5, bArr5[40], b5, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen, fadingEdgeLength, minimumFlingVelocity2, 1357589585, false, (String) objArr18[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_payment).substring(1, 3).length() - 845230838;
            int i16 = i13 + ((((-95960500) + (((-235348034) | length) * (-381))) + (((~((~length) | (-532133468))) | 837851038) * 381)) - 526712643);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr19[2])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i19 = INotificationSideChannelStub;
                int i20 = i19 + 71;
                connect = i20 % 128;
                i = 2;
                int i21 = i20 % 2;
                int i22 = i19 + 93;
                connect = i22 % 128;
                int i23 = i22 % 2;
                int i24 = 0;
                while (i24 < strArr3.length) {
                    int i25 = connect + 85;
                    INotificationSideChannelStub = i25 % 128;
                    if (i25 % i != 0) {
                        arrayList.add(strArr3[i24]);
                        i24 += 57;
                    } else {
                        arrayList.add(strArr3[i24]);
                        i24++;
                    }
                    int i26 = INotificationSideChannelStub + 67;
                    connect = i26 % 128;
                    i = 2;
                    int i27 = i26 % 2;
                }
            } else {
                i = 2;
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % i), 0).show();
            Object[] objArr20 = new Object[4];
            objArr20[1] = new int[]{i};
            objArr20[i] = new int[1];
            objArr20[3] = new int[]{i};
            int i28 = ((int[]) objArr[i])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            objArr20[0] = (String[]) objArr[0];
            int i31 = (int) Runtime.getRuntime().totalMemory();
            int i32 = i28 + 1972551637 + ((~((~i31) | (-302060825))) * (-116)) + ((747817159 | i31) * 116) + (((~(i31 | 503536989)) | 546340994) * 116);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr20[2])[0] = i34 ^ (i34 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
            int iBlue2 = Color.blue(0) + 1755;
            int i35 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
            byte b6 = $$a[7];
            byte b7 = b6;
            Object[] objArr21 = new Object[1];
            c(b6, b7, (byte) (b7 | 15), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(pressedStateDuration, iBlue2, i35, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char bitsPerPixel2 = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                int i36 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                byte[] bArr6 = $$a;
                byte b8 = bArr6[7];
                Object[] objArr22 = new Object[1];
                c(b8, bArr6[5], b8, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(bitsPerPixel2, i36, maximumDrawingCacheSize, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i37 = ((int[]) objArr23[0])[0];
            objArr2 = new Object[]{new int[]{i37}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i39 = ~i38;
            int i40 = (-448372719) + (((~((-349179995) | i39)) | (~((-724419366) | i38))) * 520);
            int i41 = ~(724419365 | i39);
            int i42 = ~(i38 | 937021791);
            int i43 = i40 + ((i41 | i42) * (-1040)) + ((i42 | (~(i39 | (-937021792))) | (-1073599360)) * 520) + 1900355537;
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr2[3])[0] = i45 ^ (i45 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new char[]{20360, 47267, 34363, 47372, 39259, 58022, 36449, 33131, 30398, 1850, 44436, 37744, 13275, 39546, 63868, 64994, 7293, 1674}, 16 - View.resolveSize(0, 0), objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new char[]{6858, 19047, 45065, 47503, 36782, 6129, 45382, 21447, 53378, 19860, 26996, 52987, 33253, 57144, 59905, 23120, 32867, 61996}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {418738284};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.getDefaultSize(0, 0) + 42049), ImageFormat.getBitsPerPixel(0) + 1727, Color.rgb(0, 0, 0) + 16777245, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 1900355537, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                int i46 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                byte[] bArr7 = $$a;
                byte b9 = bArr7[7];
                Object[] objArr27 = new Object[1];
                c(b9, bArr7[5], b9, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, i46, packedPositionType, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{63797, 19537, 47326, 23008, 764, 21603, 52766, 39878, 2146, 51778, 4493, 21617, 37575, 64863, 62066, 24452, 65420, 56665, 55666, 4530, 27103, 32225, 50334, 36890}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{20906, 43099, 29145, 58109, 10527, 15369, 5583, 8176, 57315, 44035, 5395, 54328, 54204, 33773, 16973, 65202, 186, 17136}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1060).substring(0, 31).length() - 16, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                    int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr8 = $$a;
                    byte b10 = bArr8[7];
                    Object[] objArr30 = new Object[1];
                    c(b10, (byte) (-bArr8[14]), b10, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(defaultSize, iLastIndexOf, scrollBarSize, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                    int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                    int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b11 = $$a[7];
                    byte b12 = b11;
                    Object[] objArr31 = new Object[1];
                    c(b11, b12, (byte) (b12 | 15), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, packedPositionGroup, threadPriority, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] == ((int[]) objArr2[1])[0]) {
            int i47 = ((int[]) objArr2[3])[0];
            int i48 = ((int[]) objArr2[0])[0];
            Object[] objArr32 = {new int[]{i48}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
            int i49 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i50 = ~i49;
            int i51 = i47 + (-1144866607) + (((~(262600783 | i50)) | 273745536) * 168) + ((~((-273745537) | i49)) * 168) + (((~(i49 | 536346319)) | (~(i50 | (-475203210))) | 201457673) * 168);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr32[3])[0] = i53 ^ (i53 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[4];
        if (strArr4 == null) {
            throw null;
        }
        int i54 = INotificationSideChannelStub + 83;
        connect = i54 % 128;
        while (true) {
            int i55 = i54 % 2;
            if (i3 >= strArr4.length) {
                throw null;
            }
            int i56 = connect + 95;
            INotificationSideChannelStub = i56 % 128;
            int i57 = i56 % 2;
            arrayList2.add(strArr4[i3]);
            i3++;
            i54 = connect + 25;
            INotificationSideChannelStub = i54 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cf, code lost:
    
        if (r1 == (((255937124 + (((~((-473515363) | r2)) | (~(2105540602 | r2))) * 69)) + (((~(r2 | 2084435962)) | ((~((-494620003) | r2)) | 21104640)) * (-69))) - 515628296)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d1, code lost:
    
        r1 = com.bpjstku.presentation.treatment.TreatmentNotificationActivity.connect + 57;
        com.bpjstku.presentation.treatment.TreatmentNotificationActivity.INotificationSideChannelStub = r1 % 128;
        r1 = r1 % 2;
        r1 = new int[1238228767];
        r1[1238228766(0x49cddf1e, float:1686499.8)] = 1;
        r2 = 2119116450 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f3, code lost:
    
        super.onResume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fe, code lost:
    
        throw new java.lang.RuntimeException("-1124345082");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (r1 == (((2047873600 + (((~((-91827855) | r4)) | 17311370) * 345)) + (((~((-91827855) | (~r4))) | (-939126768)) * 345)) + ((~(r4 | (-17311371))) * 345))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
    
        if (r1 == (((132285976 + (((~(1013645207 | r5)) | (-1056636888)) * 98)) + ((((~(r5 | (-183657665))) | 1013645207) | (~(183657664 | r4))) * (-49))) + (((~(r4 | 1013645207)) | 872979223) * 49))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) android.os.Process.getStartUptimeMillis();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.treatment.TreatmentNotificationActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 51;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels | (-1793926994));
        if (i4 != 747381632 + (((-963939451) | i5) * (-220)) + ((i5 | 1116283649) * 220) + 335049496) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i7 = ~(162201161 | iMyTid);
        if (i6 != (-491276173) + (((-1878785774) | i7) * (-814)) + ((i7 | (~((~iMyTid) | 1878112492)) | 161527880) * 407) + (((~(iMyTid | (-1878112493))) | (~((-162201162) | iMyTid)) | 161527880) * 407)) {
            throw null;
        }
        super.onStart();
        int i8 = INotificationSideChannelStub + 51;
        connect = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 11;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~(2011787131 | startElapsedRealtime);
        if (i4 != (-148794512) + ((543164418 | i5) * (-476)) + (i5 * 952) + ((~((~startElapsedRealtime) | 2011787131)) * 476)) {
            int i6 = 410266256 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i9 = ~i8;
        if (i7 != 211902280 + ((i8 | 1795897649) * 140) + (((~(1795897649 | i9)) | 77857802) * (-280)) + (((~(i8 | (-77857803))) | (~(783158315 | i9)) | 1090597136) * 140)) {
            throw new RuntimeException("-1469118703");
        }
        super.onCreate(bundle);
        int i10 = INotificationSideChannelStub + 77;
        connect = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        TreatmentNotificationActivity treatmentNotificationActivity = (TreatmentNotificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = connect + 83;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            treatmentNotificationActivity.getIntent().getStringExtra("extra_hospital_name");
            throw null;
        }
        String stringExtra = treatmentNotificationActivity.getIntent().getStringExtra("extra_hospital_name");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i3 = INotificationSideChannelStub + 101;
        connect = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return "RS JAKARTA";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TreatmentNotificationActivity treatmentNotificationActivity, TwilightManager twilightManager) {
        TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        getCameraState getcamerastateB;
        FragmentManager supportFragmentManager;
        int i;
        int i2 = 2 % 2;
        int i3 = connect;
        int i4 = i3 + 47;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
            if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes() != null) {
                    treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                }
            } else {
                if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = i3 + 1;
                INotificationSideChannelStub = i6 % 128;
                int i7 = i6 % 2;
                treatmentNotificationActivity.IconCompatParcelizer();
                tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
                if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null) {
                    i = connect + 27;
                    INotificationSideChannelStub = i % 128;
                    if (i % 2 == 0) {
                        treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.b);
                        throw null;
                    }
                    treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.b);
                } else {
                    int i8 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append(": ");
                    sb.append(str);
                    String string = sb.toString();
                    getCameraState.Companion bVar = getCameraState.INSTANCE;
                    String string2 = treatmentNotificationActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    getcamerastateB = getCameraState.Companion.b(R.drawable.ic_warning_blue, "", string, string2);
                    treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcamerastateB;
                    supportFragmentManager = treatmentNotificationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            }
        } else if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes() != null) {
                treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
            }
        } else {
            if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = i3 + 1;
            INotificationSideChannelStub = i9 % 128;
            int i10 = i9 % 2;
            treatmentNotificationActivity.IconCompatParcelizer();
            tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null) {
                i = connect + 27;
                INotificationSideChannelStub = i % 128;
                if (i % 2 == 0) {
                    treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.b);
                    throw null;
                }
                treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1.b);
            } else {
                int i11 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                sb2.append(": ");
                sb2.append(str2);
                String string3 = sb2.toString();
                getCameraState.Companion bVar2 = getCameraState.INSTANCE;
                String string4 = treatmentNotificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                getcamerastateB = getCameraState.Companion.b(R.drawable.ic_warning_blue, "", string3, string4);
                treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcamerastateB;
                supportFragmentManager = treatmentNotificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = connect + 35;
        INotificationSideChannelStub = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        function1.invoke(obj);
        int i3 = INotificationSideChannelStub + 33;
        connect = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final TreatmentNotificationActivity treatmentNotificationActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) treatmentNotificationActivity.onTransact.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        BufferProviderState bufferProviderStateSubscribe = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length))).subscribe(new registerAvailabilityCallback(new Function1() { // from class: unpackSurfaces
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TreatmentNotificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) treatmentNotificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        Unit unit = Unit.INSTANCE;
        int i2 = connect + 81;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(TreatmentNotificationActivity treatmentNotificationActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(treatmentNotificationActivity);
        int i2 = INotificationSideChannelStub + 55;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return outputformattoaudioprofile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final TreatmentNotificationActivity treatmentNotificationActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = treatmentNotificationActivity.getString(R.string.title_biometric_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = treatmentNotificationActivity.getString(R.string.message_biometric_confirmation_treatment);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = treatmentNotificationActivity.getString(R.string.label_continue_dialog);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, string2, string3, new Function0() { // from class: CameraManagerCompat
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TreatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }, 96);
        FragmentManager supportFragmentManager = treatmentNotificationActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = connect + 53;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = connect + 79;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        TreatmentNotificationActivity treatmentNotificationActivity = (TreatmentNotificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 27;
        connect = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = treatmentNotificationActivity.getIntent().getStringExtra("extra_user_name");
        if (stringExtra != null) {
            return stringExtra;
        }
        User user = (User) treatmentNotificationActivity.d.getValue();
        if (user != null) {
            int i4 = INotificationSideChannelStub + 109;
            connect = i4 % 128;
            int i5 = i4 % 2;
            return user.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i6 = INotificationSideChannelStub + 69;
        connect = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = connect + 87;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannelStub + 39;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TreatmentNotificationActivity treatmentNotificationActivity, Boolean bool) {
        int i;
        int i2 = 2 % 2;
        if (!(!bool.booleanValue())) {
            treatmentNotificationActivity.MediaBrowserCompat();
            ((checkShowingFlags) treatmentNotificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(treatmentNotificationActivity);
            i = INotificationSideChannelStub + 25;
            connect = i % 128;
        } else {
            TreatmentNotificationActivity treatmentNotificationActivity2 = treatmentNotificationActivity;
            String string = treatmentNotificationActivity.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(treatmentNotificationActivity2, string);
            i = connect + 75;
            INotificationSideChannelStub = i % 128;
        }
        int i3 = i % 2;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TreatmentNotificationActivity treatmentNotificationActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 11;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            treatmentNotificationActivity.d_();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        treatmentNotificationActivity.d_();
        Unit unit2 = Unit.INSTANCE;
        int i3 = connect + 33;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        TreatmentNotificationActivity treatmentNotificationActivity = (TreatmentNotificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = connect + 59;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) treatmentNotificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = INotificationSideChannelStub + 121;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return userAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ String b(TreatmentNotificationActivity treatmentNotificationActivity) {
        return (String) b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1597410899, new Object[]{treatmentNotificationActivity}, -1597410899, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(TreatmentNotificationActivity treatmentNotificationActivity) {
        return (String) b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1257514428, new Object[]{treatmentNotificationActivity}, -1257514424, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ User asBinder(TreatmentNotificationActivity treatmentNotificationActivity) {
        return (User) b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 721425500, new Object[]{treatmentNotificationActivity}, -721425497, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static {
        IconCompatParcelizer = 1;
        g();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompat + 113;
        IconCompatParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTreatmentNotificationBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) b(zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -60722975, new Object[]{this}, 60722976, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = connect + 109;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_treatment_notification;
        }
        int i3 = 88 / 0;
        return R.layout.activity_treatment_notification;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 49;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 121;
        connect = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 121024266, new Object[]{this}, -121024264, zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void g() {
        cancelAll = (char) 30148;
        getInterfaceDescriptor = (char) 2446;
        INotificationSideChannelDefault = (char) 33596;
        RemoteActionCompatParcelizer = (char) 44298;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        TreatmentNotificationActivity treatmentNotificationActivity = (TreatmentNotificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 9;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = connect + 75;
        INotificationSideChannelStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
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
    private static java.lang.String $$i(int r7, byte r8, int r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 108
            byte[] r0 = com.bpjstku.presentation.treatment.TreatmentNotificationActivity.$$c
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.treatment.TreatmentNotificationActivity.$$i(int, byte, int):java.lang.String");
    }
}
