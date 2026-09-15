package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.user.model.response.Kpj;
import com.bpjstku.data.user.model.response.KpjItem;
import com.bpjstku.databinding.ActivityCheckEligibilityOldDaySecurityBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.libraries.places.internal.zzrf;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.CaptureSession1;
import defpackage.DelegatingImageCapturedCallback;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deInitSession;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;
import defpackage.lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setPictureInPictureParams;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00168\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0014\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0015\u0010\u001b\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010\u0007\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0017\u001a\u00020!8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b\u0014\u0010#R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&R\u0015\u0010\u0012\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/CheckEligibilityOldDaySecurityActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityCheckEligibilityOldDaySecurityBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "LCamera2CameraControlImplExternalSyntheticLambda4;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "", "g", "Ljava/lang/String;", "LIntegerRes;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "LgetStringOrNull;", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LsetPictureInPictureParams;", "LsetPictureInPictureParams;", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LlambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckEligibilityOldDaySecurityActivity extends BindingReactiveFormActivity<ActivityCheckEligibilityOldDaySecurityBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] cancel;
    private static char cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private setPictureInPictureParams asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$f = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -1, 15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 76;
    private static int INotificationSideChannelDefault = 1;
    private static int onTransact = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int g = R.layout.activity_check_eligibility_old_day_security;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: lambdaisMeteringRepeatingAttached13androidxcameracamera2internalCamera2CameraImpl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CheckEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = ~(i2 | i | i3);
        int i8 = ~i;
        int i9 = (~(i8 | i3)) | (~((~i3) | i2));
        int i10 = (~(i3 | (~i2))) | i8;
        int i11 = i2 + i + i5 + ((-2044576983) * i4) + (1743660113 * i6);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i2) - 713031680) + (164951516 * i) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i5) + (689963008 * i4) + ((-299892736) * i6) + ((-1081737216) * i12);
        int i14 = ((i2 * 2048727874) - 782056376) + (2048728756 * i) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i5 * 2048728315) + (i4 * 2142076211) + (i6 * (-1448904853)) + (i12 * 1885470720);
        int i15 = i13 + (i14 * i14 * (-1618345984));
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 != 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity = (CheckEligibilityOldDaySecurityActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = notify + 7;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
        if (((Field) cacheInteropConfig.b[0]).getInt(null) != (-1835766104) + (((~((-1701548612) | i8)) | 560108096) * 184) + (((-2013001584) | i) * (-184)) + ((~((-871561069) | i8)) * 184)) {
            throw null;
        }
        if (((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null) != 511566132 + (((~(i8 | (-1780266458))) | 1745355977 | (~((-29444647) | i))) * 717) + (((~(i | (-1780266458))) | (~((-29444647) | i8)) | 1745355977) * 717)) {
            int i19 = (-1988041738) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i20 = onTransact + 87;
        notify = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 196 - r6
            int r0 = 53 - r7
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
        L2c:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/CheckEligibilityOldDaySecurityActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) CheckEligibilityOldDaySecurityActivity.class);
            intent.putExtra("key_eligible_reactivation_bpu", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CheckEligibilityOldDaySecurityActivity() {
        final CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity = this;
        this.b = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = checkEligibilityOldDaySecurityActivity;
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
        final CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = checkEligibilityOldDaySecurityActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = checkEligibilityOldDaySecurityActivity;
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

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = this.g;
        int i6 = i3 + 67;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityCheckEligibilityOldDaySecurityBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CheckEligibilityOldDaySecurityActivity$bindingInflater$1 checkEligibilityOldDaySecurityActivity$bindingInflater$1 = CheckEligibilityOldDaySecurityActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = onTransact + 121;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return checkEligibilityOldDaySecurityActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        notify = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("key_eligible_reactivation_bpu");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.asBinder = stringExtra;
        int i4 = onTransact + 51;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity = this;
        Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
        checkEligibilityOldDaySecurityActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_claim_old_day_security));
        RecyclerView recyclerView = INotificationSideChannelStub().rvClaimType;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl) this.d.getValue());
        int i2 = onTransact + 21;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdaisMeteringRepeatingAttached14androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = onTransact + 123;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity = (CheckEligibilityOldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 45;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            ((IntegerRes) checkEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            ((Camera2CameraControlImplExternalSyntheticLambda4) checkEligibilityOldDaySecurityActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1();
            return null;
        }
        ((IntegerRes) checkEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ((Camera2CameraControlImplExternalSyntheticLambda4) checkEligibilityOldDaySecurityActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1();
        int i3 = 15 / 0;
        return null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            CheckEligibilityOldDaySecurityActivity.this.d_();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity = this;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(checkEligibilityOldDaySecurityActivity, new b(new Function1() { // from class: lambdagetOrCreateUserReleaseFuture6androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.b.getValue()).notify.observe(checkEligibilityOldDaySecurityActivity, new b(new Function1() { // from class: lambdaaddOrRemoveMeteringRepeatingUseCase17androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibilityOldDaySecurityActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(checkEligibilityOldDaySecurityActivity, new b(new Function1() { // from class: lambdaattachUseCases15androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibilityOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = notify + 9;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = cancel;
        int i5 = 1770390596;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 55;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), TextUtils.getOffsetAfter("", 0) + 2267, 33 - KeyEvent.keyCodeFromString(""), -1927765101, false, $$i(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                        i6--;
                        i3 = 2;
                        i5 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 33 - Color.red(0), -1927765101, false, $$i(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 1770390596;
                    obj = null;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = (byte) (b7 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 33 - KeyEvent.keyCodeFromString(""), -1927765101, false, $$i(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        char c2 = 5;
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
            int i8 = $11 + 5;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i10 = $10 + 31;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    c = c2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = deinitsession;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = deinitsession;
                    objArr5[9] = deinitsession;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = deinitsession;
                    objArr5[6] = deinitsession;
                    objArr5[c2] = Integer.valueOf(cCharValue);
                    objArr5[4] = deinitsession;
                    objArr5[3] = deinitsession;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = deinitsession;
                    objArr5[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.resolveSize(0, 0) + 3261, 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -127612708, false, $$i(b9, b10, (byte) (b10 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        int i12 = $11 + 119;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            c = 5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - KeyEvent.keyCodeFromString("")), Gravity.getAbsoluteGravity(0, 0) + 594, 17 - (ViewConfiguration.getTouchSlop() >> 8), 1570859318, false, $$i(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = 5;
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        c = 5;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                c2 = c;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = null;
            if (p0.getItemId() == 16908332) {
                int i2 = notify + 123;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = notify + 37;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:18:0x00da  */
    /* JADX WARN: Code duplicated, block: B:23:0x024a A[Catch: all -> 0x0b46, TryCatch #1 {all -> 0x0b46, blocks: (B:21:0x0236, B:23:0x024a, B:24:0x027d, B:52:0x0790, B:54:0x07a4, B:55:0x07d5, B:57:0x0807, B:58:0x0884), top: B:100:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0293  */
    /* JADX WARN: Code duplicated, block: B:32:0x0354  */
    /* JADX WARN: Code duplicated, block: B:35:0x03a9  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = notify + 11;
        onTransact = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cGreen = (char) (Color.green(0) + 29944);
                int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
                int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((short) 193, bArr[3], bArr[28], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, threadPriority, i4, 986134021, false, (String) objArr2[0], null);
            }
            int i5 = 3 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                    int i6 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr3 = new Object[1];
                    c((short) 156, bArr2[7], bArr2[28], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, i6, keyRepeatTimeout, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i7 = ((int[]) objArr4[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i7}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
                int i8 = ~layoutDirection;
                int i9 = (-245518534) + (((~(178238211 | i8)) | (~((-143929859) | layoutDirection))) * (-831)) + ((~(534770495 | layoutDirection)) * (-1662)) + (((~(layoutDirection | (-178238212))) | (~(i8 | (-390840638))) | (~(390840637 | layoutDirection))) * 831) + 676257657;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{6, 1, 11, 1, 3, 4, 22, 21, 22, 7, 17, 15, '\f', 2, 6, 14}, (byte) (71 - ExpandableListView.getPackedPositionType(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).length() + 11, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{14, 3, 5, 24, 23, '\f', 24, 17, 6, 23, 5, 2, '\r', 19, '\t', 14}, (byte) (TextUtils.getCapsMode("", 0, 0) + 66), 16 - View.resolveSize(0, 0), objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {1892225837};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1726 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 676257657);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cBlue = (char) (29944 - Color.blue(0));
                        int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte[] bArr3 = $$a;
                        Object[] objArr8 = new Object[1];
                        c((short) 156, bArr3[7], bArr3[28], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, minimumFlingVelocity, iLastIndexOf, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{22, 21, 0, 19, 23, 18, 0, 3, 17, '\b', 1, 17, 17, '\t', 24, 7, '\f', '\n', '\b', 23, 20, 24}, (byte) (53 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.getMode(0) + 22, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{'\b', 4, 20, 11, '\b', 5, 0, '\t', 6, 24, 2, 23, 14, '\f', 13845}, (byte) (21 - ((byte) KeyEvent.getModifierMetaStateMask())), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                            int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr4 = $$a;
                            Object[] objArr11 = new Object[1];
                            c((short) 104, bArr4[7], bArr4[28], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollBarFadeDuration, packedPositionGroup, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                            int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                            int i13 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                            byte[] bArr5 = $$a;
                            Object[] objArr12 = new Object[1];
                            c((short) 193, bArr5[3], bArr5[28], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, i12, i13, 986134021, false, (String) objArr12[0], null);
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
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                int i14 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                int iAxisFromString = MotionEvent.axisFromString("") + 24;
                byte[] bArr6 = $$a;
                Object[] objArr13 = new Object[1];
                c((short) 193, bArr6[3], bArr6[28], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i14, iAxisFromString, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType2 = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                    int i15 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int keyRepeatTimeout2 = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr7 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) 156, bArr7[7], bArr7[28], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType2, i15, keyRepeatTimeout2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i16 = ((int[]) objArr15[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i16}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int layoutDirection2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
                int i17 = ~layoutDirection2;
                int i18 = (-245518534) + (((~(178238211 | i17)) | (~((-143929859) | layoutDirection2))) * (-831)) + ((~(534770495 | layoutDirection2)) * (-1662)) + (((~(layoutDirection2 | (-178238212))) | (~(i17 | (-390840638))) | (~(390840637 | layoutDirection2))) * 831) + 676257657;
                int i19 = (i18 << 13) ^ i18;
                int i110 = i19 ^ (i19 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i110 ^ (i110 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{6, 1, 11, 1, 3, 4, 22, 21, 22, 7, 17, 15, '\f', 2, 6, 14}, (byte) (71 - ExpandableListView.getPackedPositionType(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).length() + 11, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{14, 3, 5, 24, 23, '\f', 24, 17, 6, 23, 5, 2, '\r', 19, '\t', 14}, (byte) (TextUtils.getCapsMode("", 0, 0) + 66), 16 - View.resolveSize(0, 0), objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {1892225837};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1726 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 676257657);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cBlue2 = (char) (29944 - Color.blue(0));
                    int minimumFlingVelocity2 = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                    byte[] bArr8 = $$a;
                    Object[] objArr19 = new Object[1];
                    c((short) 156, bArr8[7], bArr8[28], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue2, minimumFlingVelocity2, iLastIndexOf2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                Object[] objArr20 = new Object[1];
                e(new char[]{22, 21, 0, 19, 23, 18, 0, 3, 17, '\b', 1, 17, 17, '\t', 24, 7, '\f', '\n', '\b', 23, 20, 24}, (byte) (53 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.getMode(0) + 22, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{'\b', 4, 20, 11, '\b', 5, 0, '\t', 6, 24, 2, 23, 14, '\f', 13845}, (byte) (21 - ((byte) KeyEvent.getModifierMetaStateMask())), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                    int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr9 = $$a;
                    Object[] objArr111 = new Object[1];
                    c((short) 104, bArr9[7], bArr9[28], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, scrollBarFadeDuration2, packedPositionGroup2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetBefore2 = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                    int i111 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                    int i112 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte[] bArr10 = $$a;
                    Object[] objArr112 = new Object[1];
                    c((short) 193, bArr10[3], bArr10[28], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore2, i111, i112, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            while (i3 < strArr.length) {
                arrayList.add(strArr[i3]);
                i3++;
            }
            throw null;
        }
        int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        Object[] objArr21 = {new int[]{i21}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = ~iIdentityHashCode;
        int i23 = i20 + 596249129 + ((~(159645762 | i22)) * (-560)) + ((~(iIdentityHashCode | (-36179382))) * (-560)) + (((~(52956663 | i22)) | 142868480) * 560);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr21[3])[0] = i25 ^ (i25 << 5);
        int i26 = notify + 99;
        onTransact = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAlpha = (char) Color.alpha(0);
            int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
            int i28 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
            byte[] bArr11 = $$a;
            Object[] objArr22 = new Object[1];
            c((short) 52, bArr11[7], bArr11[28], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAlpha, keyRepeatTimeout3, i28, 1357589585, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        e(new char[]{22, 21, 0, 19, 23, 18, 0, 3, 17, '\b', 1, 17, 17, '\t', 24, 7, '\f', '\n', '\b', 23, 20, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).length() + 53), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(new char[]{'\b', 4, 20, 11, '\b', 5, 0, '\t', 6, 24, 2, 23, 14, '\f', 13845}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).length() + 9, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr12 = $$a;
            Object[] objArr25 = new Object[1];
            c((short) 156, bArr12[7], bArr12[28], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, pressedStateDuration, modifierMetaStateMask, 1344079056, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i29 = notify + 73;
            onTransact = i29 % 128;
            int i30 = i29 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int pressedStateDuration2 = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                byte b2 = $$a[7];
                short s = b2;
                Object[] objArr26 = new Object[1];
                c(s, (byte) (s | 52), b2, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, pressedStateDuration2, edgeSlop, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr27[3])[0];
            int i32 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i34 = ~((-253756525) | i33);
            int i35 = ~i33;
            int i36 = (-1155175919) + ((i34 | (~(264101375 | i35))) * 920) + (((~((-254625022) | i35)) | 253756524) * 920) + (((~(i33 | 264101375)) | (~((-253756525) | i35)) | (~((-868498) | i33))) * 920) + 98938207;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[2])[0] = i38 ^ (i38 << 5);
            int i39 = notify + 11;
            onTransact = i39 % 128;
            int i40 = i39 % 2;
        } else {
            Object[] objArr28 = new Object[1];
            e(new char[]{6, 1, 11, 1, 3, 4, 22, 21, 22, 7, 17, 15, '\f', 2, 6, 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step2).substring(28, 29).codePointAt(0) - 26), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_bad_response_server).substring(0, 24).codePointAt(8) - 85, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(new char[]{14, 3, 5, 24, 23, '\f', 24, 17, 6, 23, 5, 2, '\r', 19, '\t', 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 43), (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {1892225837};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getEdgeSlop() >> 16)), AndroidCharacter.getMirror('0') + 1086, View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, 98938207, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int keyRepeatTimeout4 = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iArgb = Color.argb(0, 0, 0, 0) + 15;
                byte[] bArr13 = $$a;
                Object[] objArr32 = new Object[1];
                c((short) 52, bArr13[7], bArr13[28], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, keyRepeatTimeout4, iArgb, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 1117, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i41 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b3 = $$a[7];
                short s2 = b3;
                Object[] objArr33 = new Object[1];
                c(s2, (byte) (s2 | 52), b3, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay, maximumDrawingCacheSize, i41, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                e(new char[]{22, 21, 0, 19, 23, 18, 0, 3, 17, '\b', 1, 17, 17, '\t', 24, 7, '\f', '\n', '\b', 23, 20, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step6).substring(39, 40).codePointAt(0) + 22), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_other).substring(16, 20).length() + 18, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                e(new char[]{'\b', 4, 20, 11, '\b', 5, 0, '\t', 6, 24, 2, 23, 14, '\f', 13845}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step5).substring(3, 4).length() + 21), ExpandableListView.getPackedPositionType(0L) + 15, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    byte[] bArr14 = $$a;
                    Object[] objArr36 = new Object[1];
                    c((short) 156, bArr14[7], bArr14[28], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(edgeSlop2, iNormalizeMetaState, jumpTapTimeout, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                    byte[] bArr15 = $$a;
                    byte b4 = bArr15[7];
                    byte b5 = bArr15[28];
                    Object[] objArr37 = new Object[1];
                    c((short) 52, b4, b5, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(minimumFlingVelocity3, scrollDefaultDelay, absoluteGravity, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArr[1])[0];
        int i43 = ((int[]) objArr[3])[0];
        if (i43 != i42) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i44 = onTransact + 97;
                notify = i44 % 128;
                int i45 = i44 % 2;
                while (i3 < strArr3.length) {
                    arrayList2.add(strArr3[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i43));
        }
        Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).codePointAt(1) - 159280147;
        int i49 = ~iCodePointAt;
        int i50 = i46 + (-1889632720) + (((~((-893724665) | i49)) | (~(649444494 | iCodePointAt))) * 217) + (((~(iCodePointAt | (-893724665))) | 289407856) * 217) + (((~(649444494 | i49)) | 893724664) * 217);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr38[2])[0] = i52 ^ (i52 << 5);
        int i53 = notify + 37;
        onTransact = i53 % 128;
        int i54 = i53 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i6 = ~i5;
        if (i4 != (-1352379648) + ((i5 | (-981020494)) * 140) + (((~((-981020494) | i6)) | 134218820) * (-280)) + (((~(i5 | (-134218821))) | (~(151032950 | i6)) | (-997834624)) * 140)) {
            int i7 = 355053322 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        if (i8 != ((((~(1876942847 | i9)) | (~((-1796410566) | iIdentityHashCode))) * 988) - 1683258920) + (((~(iIdentityHashCode | 1796443613)) | 80499234 | (~(i9 | (-1796410566)))) * 988)) {
            int i10 = 1923568894 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i11 = notify + 35;
        onTransact = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~iIdentityHashCode;
        if (i2 != 1679164088 + (((~(947528224 | i3)) | (~((-117540682) | iIdentityHashCode))) * 1900) + (((~(i3 | 117540681)) | (~(iIdentityHashCode | (-947528225)))) * (-950)) + (((~(iIdentityHashCode | 117540681)) | (~(i3 | (-947528225)))) * 950)) {
            throw null;
        }
        int i4 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~startElapsedRealtime;
        if (i4 != (-1120453828) + (((~(1588884050 | i5)) | 990171914) * (-328)) + ((startElapsedRealtime | 990171914) * 164) + (((~(startElapsedRealtime | (-1588884051))) | 436490754 | (~(i5 | 2142565210))) * 164)) {
            int i6 = notify + 75;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[1718329876];
            iArr[1718329875] = 1;
            int i8 = 1827254140 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onCreate(bundle);
        int i9 = onTransact + 65;
        notify = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            ((Camera2CameraControlImplExternalSyntheticLambda4) checkEligibilityOldDaySecurityActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1();
            return Unit.INSTANCE;
        }
        ((Camera2CameraControlImplExternalSyntheticLambda4) checkEligibilityOldDaySecurityActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1();
        int i3 = 83 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity, int i, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
        checkEligibilityOldDaySecurityActivity.asInterface = (setPictureInPictureParams) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Iterable iterable = ((lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl) checkEligibilityOldDaySecurityActivity.d.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i3 = 0;
        for (Object obj : iterable) {
            if (i3 < 0) {
                int i4 = notify + 91;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2 = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentbindingInflater1 = i3 == i;
            ((lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl) checkEligibilityOldDaySecurityActivity.d.getValue()).d.set(i3, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2);
            i3++;
            int i5 = notify + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        ((lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl) checkEligibilityOldDaySecurityActivity.d.getValue()).notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_jht", "success_time_server_jht_result"));
                Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
                Intrinsics.checkNotNullParameter("success_time_server_jht_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("success_time_server_jht_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_jht_result", mapMutableMapOf);
                checkEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                i = notify + 39;
                onTransact = i % 128;
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity2 = checkEligibilityOldDaySecurityActivity;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_jht", "failure_time_server_jht_result"));
                Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity2, "");
                Intrinsics.checkNotNullParameter("failure_time_server_jht_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("failure_time_server_jht_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_jht_result", mapMutableMapOf2);
                checkEligibilityOldDaySecurityActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkEligibilityOldDaySecurityActivity2, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            } else {
                checkEligibilityOldDaySecurityActivity.IconCompatParcelizer();
                int i3 = notify + 63;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 3;
                }
            }
            return Unit.INSTANCE;
        }
        Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_jht", "loading_time_server_jht_result"));
        Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
        Intrinsics.checkNotNullParameter("loading_time_server_jht_result", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("loading_time_server_jht_result", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_jht_result", mapMutableMapOf3);
        checkEligibilityOldDaySecurityActivity.MediaBrowserCompat();
        i = onTransact + 9;
        notify = i % 128;
        int i5 = i % 2;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_kpj_result", "loading_kpj_result"));
            Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
            Intrinsics.checkNotNullParameter("loading_kpj_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("loading_kpj_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_kpj_result", mapMutableMapOf);
            checkEligibilityOldDaySecurityActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_kpj_result", "success_kpj_result"));
            Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
            Intrinsics.checkNotNullParameter("success_kpj_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("success_kpj_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_kpj_result", mapMutableMapOf2);
            List<Kpj> kpj = ((KpjItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getKpj();
            if (kpj != null) {
                int i3 = onTransact + 11;
                notify = i3 % 128;
                int i4 = i3 % 2;
                checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().tvKpj.setText(String.valueOf(kpj.get(0).getKpj()));
            }
            ((Camera2CameraControlImplExternalSyntheticLambda4) checkEligibilityOldDaySecurityActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1();
            int i5 = onTransact + 7;
            notify = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 2;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_kpj_result", "failure_kpj_result"));
            Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
            Intrinsics.checkNotNullParameter("failure_kpj_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("failure_kpj_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_kpj_result", mapMutableMapOf3);
            checkEligibilityOldDaySecurityActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = checkEligibilityOldDaySecurityActivity.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string2 = checkEligibilityOldDaySecurityActivity.getString(R.string.action_back);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, strValueOf, string2, null, 112);
            checkEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager supportFragmentManager = checkEligibilityOldDaySecurityActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            getStringOrNull getstringornull = checkEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (getstringornull != null) {
                getstringornull.INotificationSideChannel = checkEligibilityOldDaySecurityActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        } else {
            checkEligibilityOldDaySecurityActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl TuitionPaymentFragmentspecialinlinedviewModeldefault2(final CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity) {
        int i = 2 % 2;
        lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl = new lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl(checkEligibilityOldDaySecurityActivity, null, new Function2() { // from class: lambdaisUseCaseAttached12androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CheckEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, ((Integer) obj).intValue(), (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj2);
            }
        }, 2, null);
        int i2 = notify + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl;
    }

    public static /* synthetic */ Unit b(final CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_reason", "loading_claim_reason_result"));
            Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
            Intrinsics.checkNotNullParameter("loading_claim_reason_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("loading_claim_reason_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_claim_reason_result", mapMutableMapOf);
            MultiStateView multiStateView = checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().msvClaimType;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_claim_reason", "success_claim_reason_result"));
                Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
                Intrinsics.checkNotNullParameter("success_claim_reason_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("success_claim_reason_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_claim_reason_result", mapMutableMapOf2);
                MultiStateView multiStateView2 = checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().msvClaimType;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                List list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                checkEligibilityOldDaySecurityActivity.asInterface = new setPictureInPictureParams(((setPictureInPictureParams) list.get(0)).TuitionPaymentFragmentbindingInflater1, ((setPictureInPictureParams) list.get(0)).TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((setPictureInPictureParams) list.get(0)).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                List list2 = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl = (lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl) checkEligibilityOldDaySecurityActivity.d.getValue();
                lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl.d.clear();
                lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl.notifyDataSetChanged();
                lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl2 = (lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl) checkEligibilityOldDaySecurityActivity.d.getValue();
                List<setPictureInPictureParams> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (setPictureInPictureParams setpictureinpictureparams : list3) {
                    arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy(new setPictureInPictureParams(setpictureinpictureparams.TuitionPaymentFragmentbindingInflater1, setpictureinpictureparams.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setpictureinpictureparams.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
                    int i2 = notify + 101;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 4 / 2;
                    }
                }
                ArrayList arrayList2 = arrayList;
                ((lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) arrayList2.get(0)).TuitionPaymentFragmentbindingInflater1 = true;
                lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList2);
                ScrollView scrollView = checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().eligibleView;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                scrollView.setVisibility(0);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_claim_reason", "failure_claim_reason_result"));
                Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity, "");
                Intrinsics.checkNotNullParameter("failure_claim_reason_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("failure_claim_reason_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_claim_reason_result", mapMutableMapOf3);
                MultiStateView multiStateView3 = checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().msvClaimType;
                Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, new Pair(checkEligibilityOldDaySecurityActivity.getString(R.string.action_retry), new Function0() { // from class: lambdaonUseCaseActive7androidxcameracamera2internalCamera2CameraImpl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckEligibilityOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }));
                int i4 = onTransact + 57;
                notify = i4 % 128;
                int i5 = i4 % 2;
            }
            checkEligibilityOldDaySecurityActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity = (CheckEligibilityOldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity2 = checkEligibilityOldDaySecurityActivity;
        setPictureInPictureParams setpictureinpictureparams = checkEligibilityOldDaySecurityActivity.asInterface;
        if (setpictureinpictureparams != null) {
            int i2 = notify + 113;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                String str9 = setpictureinpictureparams.TuitionPaymentFragmentbindingInflater1;
                throw null;
            }
            str = setpictureinpictureparams.TuitionPaymentFragmentbindingInflater1;
        } else {
            str = null;
        }
        String strConcat = "claim_jht_submission_".concat(String.valueOf(str));
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jhtsubmission", "claim_jht_submission"));
        Intrinsics.checkNotNullParameter(checkEligibilityOldDaySecurityActivity2, "");
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(strConcat, mapMutableMapOf);
        setPictureInPictureParams setpictureinpictureparams2 = checkEligibilityOldDaySecurityActivity.asInterface;
        if (setpictureinpictureparams2 != null) {
            int i3 = notify + 17;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                str2 = setpictureinpictureparams2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4 = 41 / 0;
            } else {
                str2 = setpictureinpictureparams2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        } else {
            str2 = null;
        }
        String str10 = str2 == null ? "" : str2;
        setPictureInPictureParams setpictureinpictureparams3 = checkEligibilityOldDaySecurityActivity.asInterface;
        if (setpictureinpictureparams3 != null) {
            int i5 = onTransact + 119;
            notify = i5 % 128;
            int i6 = i5 % 2;
            str3 = setpictureinpictureparams3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str3 = null;
        }
        String str11 = str3 == null ? "" : str3;
        setPictureInPictureParams setpictureinpictureparams4 = checkEligibilityOldDaySecurityActivity.asInterface;
        String str12 = setpictureinpictureparams4 != null ? setpictureinpictureparams4.TuitionPaymentFragmentbindingInflater1 : null;
        if (str12 == null) {
            int i7 = onTransact + 49;
            notify = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            str4 = "";
        } else {
            str4 = str12;
        }
        setPictureInPictureParams setpictureinpictureparams5 = checkEligibilityOldDaySecurityActivity.asInterface;
        String str13 = setpictureinpictureparams5 != null ? setpictureinpictureparams5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        if (str13 == null) {
            int i8 = onTransact + 39;
            notify = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 1 / 0;
            }
            str5 = "";
        } else {
            str5 = str13;
        }
        IndividualDataClaim individualDataClaim = new IndividualDataClaim(null, null, null, null, null, checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().tvKpj.getText().toString(), str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, str10, str11, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, checkEligibilityOldDaySecurityActivity.asBinder, false, null, null, null, null, null, null, null, 536870815, -1073741825, 127, null);
        setPictureInPictureParams setpictureinpictureparams6 = checkEligibilityOldDaySecurityActivity.asInterface;
        if (Intrinsics.areEqual(setpictureinpictureparams6 != null ? setpictureinpictureparams6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null, "SKJ07")) {
            setPictureInPictureParams setpictureinpictureparams7 = checkEligibilityOldDaySecurityActivity.asInterface;
            if (setpictureinpictureparams7 != null) {
                int i10 = onTransact + 57;
                notify = i10 % 128;
                int i11 = i10 % 2;
                str6 = setpictureinpictureparams7.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                str6 = null;
            }
            String str14 = str6 == null ? "" : str6;
            setPictureInPictureParams setpictureinpictureparams8 = checkEligibilityOldDaySecurityActivity.asInterface;
            String str15 = setpictureinpictureparams8 != null ? setpictureinpictureparams8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            String str16 = str15 == null ? "" : str15;
            setPictureInPictureParams setpictureinpictureparams9 = checkEligibilityOldDaySecurityActivity.asInterface;
            if (setpictureinpictureparams9 != null) {
                int i12 = notify + 5;
                onTransact = i12 % 128;
                if (i12 % 2 != 0) {
                    String str17 = setpictureinpictureparams9.TuitionPaymentFragmentbindingInflater1;
                    throw null;
                }
                str7 = setpictureinpictureparams9.TuitionPaymentFragmentbindingInflater1;
            } else {
                int i13 = onTransact + 17;
                notify = i13 % 128;
                int i14 = i13 % 2;
                str7 = null;
            }
            if (str7 == null) {
                int i15 = notify + 111;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                str8 = "";
            } else {
                str8 = str7;
            }
            setPictureInPictureParams setpictureinpictureparams10 = checkEligibilityOldDaySecurityActivity.asInterface;
            String str18 = setpictureinpictureparams10 != null ? setpictureinpictureparams10.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
            IndividualDataClaim individualDataClaim2 = new IndividualDataClaim(null, null, null, null, null, checkEligibilityOldDaySecurityActivity.INotificationSideChannelStub().tvKpj.getText().toString(), str18 == null ? "" : str18, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, str14, str16, str8, null, null, null, null, null, null, null, null, null, "D429", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, checkEligibilityOldDaySecurityActivity.asBinder, false, null, null, null, null, null, null, null, 536870815, -1073742337, 127, null);
            ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion companion = ClaimOldDaySecurityWorkTerminationParticipantActivity.INSTANCE;
            ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkEligibilityOldDaySecurityActivity, individualDataClaim2);
            int i17 = notify + 83;
            onTransact = i17 % 128;
            int i18 = i17 % 2;
        } else {
            ClaimSubmissionActivity.Companion companion2 = ClaimSubmissionActivity.INSTANCE;
            ClaimSubmissionActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkEligibilityOldDaySecurityActivity, individualDataClaim);
            checkEligibilityOldDaySecurityActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckEligibilityOldDaySecurityActivity checkEligibilityOldDaySecurityActivity, View view) {
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1064859697, 1064859699, iB, zzrf.b(), iB2, new Object[]{checkEligibilityOldDaySecurityActivity, view}, zzrf.b());
    }

    static {
        INotificationSideChannel = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 43;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-519253658, 519253659, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_2).substring(5, 15).length() - 562863269, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, zzrf.b());
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = notify + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = notify + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() throws IllegalAccessException {
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1572787965, -1572787965, iB, zzrf.b(), iB2, new Object[]{this}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-548397956, 548397959, iB, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB2, new Object[]{this}, zzrf.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        cancel = new char[]{60051, 60049, 60117, 60055, 60063, 60073, 60045, 60040, 60083, 60062, 60043, 60054, 60057, 60050, 60088, 60041, 60072, 60060, 60052, 60034, 60053, 60058, 60047, 60048, 60056};
        cancelAll = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, int r8, byte r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity.$$c
            int r8 = 116 - r8
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.CheckEligibilityOldDaySecurityActivity.$$i(short, int, byte):java.lang.String");
    }
}
