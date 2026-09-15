package com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityOldDaySecurityBalanceCheckBinding;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity;
import com.bpjstku.presentation.program.model.BalanceInfo;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.dynamite.zzk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.kennyc.view.MultiStateView;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.CameraDeviceSurfaceManager;
import defpackage.CameraProviderInitRetryPolicyLegacy;
import defpackage.CameraRepositoryExternalSyntheticLambda0;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getCameraUseCaseAdapter;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isModeInList;
import defpackage.lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl;
import defpackage.mapPoint;
import defpackage.setButtonPanelLayoutHint;
import defpackage.updateSessionConfigSynchronous;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0015\u0010\u001a\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\t\u001a\u00020\u001b8\u0007@\u0007X\u0087,¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0015\u0010\u0007\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010\n\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u000b\u001a\u00020(8\u0015X\u0095D¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\u001a\u0010*R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00020+8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010-"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/balancecheck/OldDaySecurityBalanceCheckActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityOldDaySecurityBalanceCheckBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "", "p0", "(Ljava/lang/String;)V", "cancelAll", "", "Lcom/bpjstku/presentation/program/model/BalanceInfo;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Ljava/util/List;", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LlambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LCameraDeviceSurfaceManager;", "LCameraDeviceSurfaceManager;", "Lcom/google/android/play/core/review/ReviewInfo;", "Lcom/google/android/play/core/review/ReviewInfo;", "LisModeInList;", "d", "Lcom/bpjstku/domain/jht/model/Kpj;", "Lcom/bpjstku/domain/jht/model/Kpj;", "", "Lcom/bpjstku/domain/jht/model/JhtBalance;", "g", "Ljava/util/List;", "LupdateSessionConfigSynchronous;", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OldDaySecurityBalanceCheckActivity extends BindingBaseActivity<ActivityOldDaySecurityBalanceCheckBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f583a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public ReviewInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public CameraDeviceSurfaceManager TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {101, 89, 94, -73, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 125;
    private static int cancel = 1;
    private static int cancelAll = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: submitCaptureRequestsInternal
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<JhtBalance> d = new ArrayList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: startFocusAndMetering
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final int a = R.layout.activity_old_day_security_balance_check;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MembershipType.values().length];
            try {
                iArr[MembershipType.PU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipType.BPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MembershipType.PMI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i3)) | i;
        int i9 = ~i3;
        int i10 = ~i;
        int i11 = (~(i9 | i10)) | i2;
        int i12 = (~(i | i9 | i2)) | (~(i7 | i9 | i10)) | (~(i10 | i3 | i2));
        int i13 = i3 + i2 + i6 + ((-104759182) * i5) + ((-453318476) * i4);
        int i14 = i13 * i13;
        int i15 = (i3 * 1504131295) + 1805123584 + (1504131295 * i2) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i6) + (711983104 * i5) + (1180696576 * i4) + (1022754816 * i14);
        int i16 = ((i3 * (-1431886989)) - 1507491630) + (i2 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i6 * (-1431886867)) + (i5 * 722567050) + (i4 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 == 2) {
            return b(objArr);
        }
        if (i17 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 != 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        final OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity = (OldDaySecurityBalanceCheckActivity) objArr[0];
        int i18 = 2 % 2;
        OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity2 = oldDaySecurityBalanceCheckActivity;
        Intrinsics.checkNotNullParameter(oldDaySecurityBalanceCheckActivity2, "");
        oldDaySecurityBalanceCheckActivity2.getWindow().addFlags(8192);
        oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(oldDaySecurityBalanceCheckActivity.getString(R.string.label_balance_check));
        RecyclerView recyclerView = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvBalanceCheck;
        OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity3 = oldDaySecurityBalanceCheckActivity;
        recyclerView.setLayoutManager(new LinearLayoutManager(oldDaySecurityBalanceCheckActivity3));
        recyclerView.addItemDecoration(new DividerItemDecoration(oldDaySecurityBalanceCheckActivity3, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        Context applicationContext = oldDaySecurityBalanceCheckActivity3.getApplicationContext();
        if (applicationContext != null) {
            int i19 = cancelAll + 111;
            int i20 = i19 % 128;
            notify = i20;
            int i21 = i19 % 2;
            int i22 = i20 + 97;
            cancelAll = i22 % 128;
            int i23 = i22 % 2;
            oldDaySecurityBalanceCheckActivity3 = applicationContext;
        }
        CameraProviderInitRetryPolicyLegacy cameraProviderInitRetryPolicyLegacy = new CameraProviderInitRetryPolicyLegacy(new CameraRepositoryExternalSyntheticLambda0(oldDaySecurityBalanceCheckActivity3));
        Intrinsics.checkNotNullParameter(cameraProviderInitRetryPolicyLegacy, "");
        oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraProviderInitRetryPolicyLegacy;
        int i24 = notify + 49;
        cancelAll = i24 % 128;
        int i25 = i24 % 2;
        cameraProviderInitRetryPolicyLegacy.TuitionPaymentFragmentbindingInflater1().addOnCompleteListener(new OnCompleteListener() { // from class: submitStillCaptureRequests
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, task);
            }
        });
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = 53 - r6
            int r8 = 196 - r8
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity.c(int, short, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity = (OldDaySecurityBalanceCheckActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 61;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        isModeInList ismodeinlist = (isModeInList) oldDaySecurityBalanceCheckActivity.b.getValue();
        int i4 = notify + 31;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return ismodeinlist;
        }
        throw null;
    }

    public OldDaySecurityBalanceCheckActivity() {
        final OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity = this;
        this.b = LazyKt.lazy(new Function0<isModeInList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [isModeInList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final isModeInList invoke() {
                ComponentCallbacks componentCallbacks = oldDaySecurityBalanceCheckActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(isModeInList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/balancecheck/OldDaySecurityBalanceCheckActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, OldDaySecurityBalanceCheckActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 27;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.a;
        int i5 = i3 + 21;
        cancelAll = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityOldDaySecurityBalanceCheckBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancelAll + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
        OldDaySecurityBalanceCheckActivity$bindingInflater$1 oldDaySecurityBalanceCheckActivity$bindingInflater$1 = OldDaySecurityBalanceCheckActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = notify + 11;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return oldDaySecurityBalanceCheckActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        EditText editText = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilChooseKpj.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: updateSessionConfig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            int i2 = notify + 69;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
        }
        ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlBalanceCheck.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: updateSessionConfigAsync
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        int i4 = cancelAll + 121;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        MediaBrowserCompat();
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new OldDaySecurityBalanceCheckActivity$initProcess$1(this, null), 3, null);
        int i2 = cancelAll + 35;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity = (OldDaySecurityBalanceCheckActivity) objArr[0];
        int i = 2 % 2;
        ((isModeInList) oldDaySecurityBalanceCheckActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(oldDaySecurityBalanceCheckActivity, new Observer() { // from class: Camera2CameraControlImplExternalSyntheticLambda10
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = notify + 47;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f583a;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iBlue = 3291 - Color.blue(i6);
                        int offsetAfter = 31 - TextUtils.getOffsetAfter("", i6);
                        byte b = (byte) ($$f & 5);
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iBlue, offsetAfter, 1948206109, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
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
        int[] iArr6 = f583a;
        long j = 0;
        if (iArr6 != null) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
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
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 3292;
                    int offsetAfter2 = 31 - TextUtils.getOffsetAfter("", 0);
                    byte b3 = (byte) ($$f & 5);
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i9, offsetAfter2, 1948206109, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i2++;
                iArr6 = iArr6;
                j = 0;
                i5 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i10 = $10 + 75;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i12 = 17;
            for (int i13 = 1; i12 > i13; i13 = 1) {
                int i14 = $11 + 101;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i12];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 2559, TextUtils.indexOf((CharSequence) "", '0', 0) + 30, 683220507, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i12--;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28879), ExpandableListView.getPackedPositionType(0L) + 348, 25 - TextUtils.getOffsetBefore("", 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 45;
        notify = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilChooseKpj.getEditText();
        if (editText != null) {
            int i4 = cancelAll + 79;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                editText.setText(p0);
                int i5 = 25 / 0;
            } else {
                editText.setText(p0);
            }
        }
        if (!this.d.isEmpty()) {
            int i6 = cancelAll + 19;
            notify = i6 % 128;
            int i7 = i6 % 2;
            lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl = (lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl.d.clear();
            lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl.notifyDataSetChanged();
            ((lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).notifyDataSetChanged();
            if (TuitionPaymentFragmentbindingInflater1(p0).isEmpty()) {
                MultiStateView multiStateView = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvJhtBalance;
                Intrinsics.checkNotNullExpressionValue(multiStateView, "");
                getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(multiStateView, "Saldo Tidak Tersedia.", null, null, null);
            } else {
                MultiStateView multiStateView2 = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvJhtBalance;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
                ((lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1(p0));
            }
            cancelAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    private final void cancelAll() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager;
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 53;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            int i5 = i2 + 47;
            cancelAll = i5 % 128;
            if (i5 % 2 != 0) {
                cameraDeviceSurfaceManager = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i6 = 3 / 0;
                if (cameraDeviceSurfaceManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = notify + 45;
                    cancelAll = i7 % 128;
                    int i8 = i7 % 2;
                    cameraDeviceSurfaceManager = null;
                }
            } else {
                cameraDeviceSurfaceManager = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (cameraDeviceSurfaceManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i9 = notify + 45;
                    cancelAll = i9 % 128;
                    int i10 = i9 % 2;
                    cameraDeviceSurfaceManager = null;
                }
            }
            ReviewInfo reviewInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNull(reviewInfo);
            cameraDeviceSurfaceManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, reviewInfo).addOnFailureListener(new OnFailureListener() { // from class: setScreenFlash
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1226916931, new Object[]{exc}, 1226916934, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: setZslDisabledByUserCaseConfig
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(task);
                }
            });
        }
    }

    private final List<BalanceInfo> TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2;
        int i2 = 2 % 2;
        List<JhtBalance> list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((JhtBalance) obj).TuitionPaymentFragmentbindingInflater1, p0)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        int i3 = 0;
        int i4 = WhenMappings.$EnumSwitchMapping$0[((JhtBalance) arrayList2.get(0)).b.ordinal()];
        if (i4 == 1) {
            ArrayList arrayList3 = new ArrayList();
            int i5 = notify + 21;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            for (Object obj2 : arrayList2) {
                if (i3 < 0) {
                    int i7 = notify + 89;
                    cancelAll = i7 % 128;
                    int i8 = i7 % i;
                    CollectionsKt.throwIndexOverflow();
                }
                JhtBalance jhtBalance = (JhtBalance) obj2;
                arrayList3.addAll(CollectionsKt.listOf(new BalanceInfo(i3, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jhtBalance.b, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jhtBalance.TuitionPaymentFragmentbindingInflater1, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jhtBalance.d, jhtBalance.asBinder, jhtBalance.g, jhtBalance.a, jhtBalance.asInterface, jhtBalance.cancel, jhtBalance.notify)));
                i3++;
                i = 2;
            }
            return arrayList3;
        }
        if (i4 != 2 && i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList4 = new ArrayList();
        int i9 = cancelAll + 41;
        notify = i9 % 128;
        int i10 = i9 % 2;
        for (Object obj3 : arrayList2) {
            int i11 = cancelAll + 23;
            notify = i11 % 128;
            int i12 = i11 % 2;
            if (i3 < 0) {
                int i13 = cancelAll + 111;
                notify = i13 % 128;
                int i14 = i13 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            JhtBalance jhtBalance2 = (JhtBalance) obj3;
            MembershipType membershipType = jhtBalance2.b;
            String str = jhtBalance2.cancel;
            String str2 = jhtBalance2.asInterface;
            String str3 = jhtBalance2.a;
            String str4 = jhtBalance2.d;
            int i15 = i3;
            arrayList4.addAll(CollectionsKt.listOf(new BalanceInfo(i15, null, membershipType, jhtBalance2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jhtBalance2.TuitionPaymentFragmentbindingInflater1, null, str4, null, null, str3, str2, str, jhtBalance2.notify)));
            i3++;
        }
        return arrayList4;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = notify + 63;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i4 = notify + 75;
                cancelAll = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = cancelAll + 23;
            notify = i6 % 128;
            if (i6 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancelAll + 121;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
            int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((byte) 15, b, (short) (b | 193), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, deadChar, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i5 = notify + 51;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int i7 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                c(b2, b3, (short) (b3 | 156), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, i7, i8, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i9 = ((int[]) objArr4[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i9}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i11 = (((~((~i10) | (-177392945))) * 130) - 1383245745) + (((~(i10 | (-177392945))) | 73861) * 130) + 844149150;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{459486272, -287740783, 1675501512, 948572590, 1011992453, 823305755, 1584465656, 526224150, -1118950760, -855609118}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{2091531202, 211516539, -368450671, -722772232, 449259747, -408047800, 1859302440, 1825187292, -277603709, -1846579711}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_utilized_orderid).substring(9, 10).length() + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {217199416};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42048), 1726 - TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 844149150);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRed = (char) (Color.red(0) + 29944);
                    int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i14 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (short) (b5 | 156), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, maximumDrawingCacheSize, i14, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-1307594207, -1413805049, -1460807623, -1571688493, -1458066159, 1396241614, 120867345, -1208132119, 1050715266, 2127324541, -1861151215, -326429789, 1956552615, 1268922103}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{-781853797, 430780402, -605829057, 793366299, -1870829251, 714743266, -804234598, 1504395820, -93572927, 1396798636}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i15 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr11 = new Object[1];
                        c(b6, b7, (short) (b7 | 104), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf2, i15, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                        int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                        byte b8 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, b8, (short) (b8 | 193), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, scrollBarFadeDuration, packedPositionType, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                int i16 = notify + 31;
                cancelAll = i16 % 128;
                int i17 = i16 % 2;
                while (i4 < strArr.length) {
                    arrayList.add(strArr[i4]);
                    i4++;
                }
            }
            throw null;
        }
        int i18 = cancelAll + 37;
        notify = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArrB$5f1425da[3])[0];
        int i21 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i21}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i22 = ~startUptimeMillis;
        int i23 = i20 + (-87932987) + (((-16908294) | startUptimeMillis) * (-676)) + (((~(182320946 | i22)) | android.R.id.hint) * 676) + (((~(startUptimeMillis | 199229239)) | (~(i22 | (-30281480))) | 13373186) * 676);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr13[3])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iMyPid = (Process.myPid() >> 22) + 1031;
            int iBlue = Color.blue(0) + 15;
            byte b9 = $$a[7];
            byte b10 = b9;
            Object[] objArr14 = new Object[1];
            c(b9, b10, (short) (b10 | 52), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, iMyPid, iBlue, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new int[]{-1307594207, -1413805049, -1460807623, -1571688493, -1458066159, 1396241614, 120867345, -1208132119, 1050715266, 2127324541, -1861151215, -326429789, 1956552615, 1268922103}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_error_shopeepay_transaction).substring(0, 6).codePointAt(4) - 93, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new int[]{-781853797, 430780402, -605829057, 793366299, -1870829251, 714743266, -804234598, 1504395820, -93572927, 1396798636}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).codePointAt(5) - 62, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int i26 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
            int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr17 = new Object[1];
            c(b11, b12, (short) (b12 | 156), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i26, edgeSlop, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                int iArgb = 1031 - Color.argb(0, 0, 0, 0);
                int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                byte b13 = (byte) ($$b & 182);
                byte[] bArr = $$a;
                Object[] objArr18 = new Object[1];
                c(b13, bArr[5], bArr[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(deadChar2, iArgb, iResolveOpacity, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr19[3])[0];
            int i28 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i30 = (-645394357) + (((~((-750984978) | i29)) | 201528065 | (~((-506704808) | i29))) * (-754));
            int i31 = ~((-201528066) | i29);
            int i32 = ~i29;
            int i33 = i30 + ((i31 | (~((-305176743) | i32))) * (-754)) + ((i32 | (-750984978)) * 754) + 1921649570;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new int[]{459486272, -287740783, 1675501512, 948572590, 1011992453, 823305755, 1584465656, 526224150, -1118950760, -855609118}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step5).substring(8, 9).codePointAt(0) - 16, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new int[]{2091531202, 211516539, -368450671, -722772232, 449259747, -408047800, 1859302440, 1825187292, -277603709, -1846579711}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {217199416};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46038), Color.argb(0, 0, 0, 0) + 1134, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1921649570, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0);
                int i36 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr24 = new Object[1];
                c(b14, b15, (short) (b15 | 52), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority, iIndexOf3, i36, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1116, ExpandableListView.getPackedPositionChild(0L) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int mode = View.MeasureSpec.getMode(0) + 15;
                byte b16 = (byte) ($$b & 182);
                byte[] bArr2 = $$a;
                Object[] objArr25 = new Object[1];
                c(b16, bArr2[5], bArr2[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, iResolveSizeAndState, mode, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new int[]{-1307594207, -1413805049, -1460807623, -1571688493, -1458066159, 1396241614, 120867345, -1208132119, 1050715266, 2127324541, -1861151215, -326429789, 1956552615, 1268922103}, View.MeasureSpec.getMode(0) + 22, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new int[]{-781853797, 430780402, -605829057, 793366299, -1870829251, 714743266, -804234598, 1504395820, -93572927, 1396798636}, TextUtils.indexOf("", "") + 15, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int i37 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr28 = new Object[1];
                    c(b17, b18, (short) (b18 | 156), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, i37, bitsPerPixel, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                    byte b19 = $$a[7];
                    byte b20 = b19;
                    Object[] objArr29 = new Object[1];
                    c(b19, b20, (short) (b20 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild, iIndexOf4, iCombineMeasuredStates, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i38 = cancelAll + 109;
                notify = i38 % 128;
                int i39 = i38 % 2;
                while (i4 < strArr3.length) {
                    arrayList2.add(strArr3[i4]);
                    i4++;
                }
            }
            throw null;
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i40 = ((int[]) objArr[2])[0];
        int i41 = ((int[]) objArr[3])[0];
        int i42 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i43 = ~iIdentityHashCode;
        int i44 = i40 + 189349314 + (((-1116427) | i43) * (-369)) + (((~((-513832182) | i43)) | (-269552012)) * (-369)) + (((~(iIdentityHashCode | 513832181)) | (-514948608) | (~(i43 | (-268435586)))) * 369);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr30[2])[0] = i46 ^ (i46 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 91;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~((int) Runtime.getRuntime().freeMemory());
        if (i4 != ((1563865192 + (((~(i5 | 1602812733)) | (~((-268451861) | i5))) * (-184))) + (((252186665 | (~((-520638526) | i5))) | (~(1350626068 | i5))) * 184)) - 1551558840) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode;
        if (i6 != (-247323225) + (((~((-1872306188) | i7)) | 1167654922) * 98) + (((~(i7 | (-706749778))) | (-1872306188) | (~(706749777 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | (-1872306188))) | (-1874404700)) * 49)) {
            throw new RuntimeException("-864608304");
        }
        super.onResume();
        int i8 = cancelAll + 57;
        notify = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 31 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1240318305
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 99;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (((~(1252546756 | iIdentityHashCode)) | (-1401414954)) * 262) + 1524461354 + (((~((~iIdentityHashCode) | 1252546756)) | (-1401414954)) * 262)) {
            int i5 = (-1901488796) % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1925689022;
        int i8 = ~i7;
        int i9 = (~((-499331487) | i8)) | 67182592;
        int i10 = ~(i7 | (-1647575585));
        if (i6 != 1040284220 + ((i9 | i10) * (-713)) + (i10 * 1426) + ((~((-2079724479) | i8)) * 713)) {
            int i11 = (-1879994910) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i12 = notify + 77;
        cancelAll = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        Exception exc = (Exception) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 117;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        int i4 = cancelAll + 79;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Task task) {
        int i = 2 % 2;
        int i2 = notify + 67;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(task, "");
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(task, "");
        }
        int i4 = cancelAll + 51;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ updateSessionConfigSynchronous TuitionPaymentFragmentspecialinlinedviewModeldefault1(final OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity) {
        int i = 2 % 2;
        updateSessionConfigSynchronous.Companion companion = updateSessionConfigSynchronous.INSTANCE;
        updateSessionConfigSynchronous updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1 = updateSessionConfigSynchronous.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: setLinearZoom
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 145938502;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (Kpj) obj);
            }
        }, oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentbindingInflater1);
        int i2 = cancelAll + 55;
        notify = i2 % 128;
        int i3 = i2 % 2;
        return updatesessionconfigsynchronousTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity, Task task) {
        int i = 2 % 2;
        int i2 = notify + 93;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (ReviewInfo) task.getResult();
            int i4 = cancelAll + 33;
            notify = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl TuitionPaymentFragmentbindingInflater1(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity) {
        int i = 2 % 2;
        lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl = new lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl(oldDaySecurityBalanceCheckActivity, new ArrayList());
        int i2 = notify + 31;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity, Kpj kpj) {
        int i = 2 % 2;
        int i2 = cancelAll + 25;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kpj, "");
        if (StringsKt.contains((CharSequence) kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (CharSequence) "JHT", true)) {
            int i4 = cancelAll + 59;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtChooseKpj.setText(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtChooseKpj.setText(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            String string = oldDaySecurityBalanceCheckActivity.getString(R.string.error_message_kpj_ineligible_jht);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity, View view) {
        int i = 2 % 2;
        int i2 = notify + 55;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            updateSessionConfigSynchronous updatesessionconfigsynchronous = (updateSessionConfigSynchronous) oldDaySecurityBalanceCheckActivity.asInterface.getValue();
            FragmentManager supportFragmentManager = oldDaySecurityBalanceCheckActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(updatesessionconfigsynchronous.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = cancelAll + 83;
                notify = i4 % 128;
                if (i4 % 2 == 0) {
                    updatesessionconfigsynchronous.show(supportFragmentManager, updatesessionconfigsynchronous.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                updatesessionconfigsynchronous.show(supportFragmentManager, updatesessionconfigsynchronous.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 113;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ((isModeInList) oldDaySecurityBalanceCheckActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 87;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 37;
            cancelAll = i2 % 128;
            if (i2 % 2 != 0) {
                ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlBalanceCheck.setRefreshing(true);
                oldDaySecurityBalanceCheckActivity.MediaBrowserCompat();
                return;
            } else {
                ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlBalanceCheck.setRefreshing(false);
                oldDaySecurityBalanceCheckActivity.MediaBrowserCompat();
                return;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlBalanceCheck.setRefreshing(false);
            oldDaySecurityBalanceCheckActivity.IconCompatParcelizer();
            ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilChooseKpj.setVisibility(0);
            oldDaySecurityBalanceCheckActivity.d.addAll((Collection) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentbindingInflater1 = new Kpj(oldDaySecurityBalanceCheckActivity.d.get(0).TuitionPaymentFragmentbindingInflater1, oldDaySecurityBalanceCheckActivity.d.get(0).b.name(), true, oldDaySecurityBalanceCheckActivity.d.get(0).a, oldDaySecurityBalanceCheckActivity.d.get(0).notify);
            oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(oldDaySecurityBalanceCheckActivity.d.get(0).TuitionPaymentFragmentbindingInflater1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlBalanceCheck.setRefreshing(false);
            oldDaySecurityBalanceCheckActivity.IconCompatParcelizer();
            ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilChooseKpj.setVisibility(8);
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String str = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(str);
            if (str.length() <= 0) {
                MultiStateView multiStateView = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvJhtBalance;
                Intrinsics.checkNotNullExpressionValue(multiStateView, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, new Pair(oldDaySecurityBalanceCheckActivity.getString(R.string.action_retry), new Function0() { // from class: setPreviewAspectRatio
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OldDaySecurityBalanceCheckActivity.b(this.b);
                    }
                }));
            } else {
                int i3 = notify + 65;
                cancelAll = i3 % 128;
                int i4 = i3 % 2;
                MultiStateView multiStateView2 = ((ActivityOldDaySecurityBalanceCheckBinding) ((ViewBinding) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvJhtBalance;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(multiStateView2, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, null, null);
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity) {
        int i = 2 % 2;
        int i2 = notify + 123;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.g();
        try {
            lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl = (lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl) oldDaySecurityBalanceCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl.d.clear();
            lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl.notifyDataSetChanged();
            oldDaySecurityBalanceCheckActivity.d.clear();
            ((isModeInList) oldDaySecurityBalanceCheckActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            ViewPortBuilder.asBinder();
            int i4 = notify + 31;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.asBinder();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1226916931, new Object[]{exc}, 1226916934, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        INotificationSideChannel = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 63;
        INotificationSideChannel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ isModeInList TuitionPaymentFragmentspecialinlinedviewModeldefault3(OldDaySecurityBalanceCheckActivity oldDaySecurityBalanceCheckActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (isModeInList) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1400691460, new Object[]{oldDaySecurityBalanceCheckActivity}, -1400691458, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 85;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int length = (-188080014) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step4).substring(26, 27).length();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1322159804, new Object[]{this}, 1322159804, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step1).substring(0, 1).codePointAt(0) + 711802668, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), length);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 1068243860, 190971272, new Object[]{this}, -190971271, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 67752578, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step6).substring(3, 4).length() - 1082222277, 1565671308, new Object[]{this}, -1565671304, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1857503086, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_others).substring(0, 6).codePointAt(3) - 486777164, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 73;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancelAll + 57;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        f583a = new int[]{1375351580, 1139479085, 16268557, 1086110500, 432889331, -1355684672, -1780376719, -1574590329, -334483583, 105858050, 1577047240, -1994081117, 1758308899, -1573746636, 712738138, -1687095346, 1290680440, -1652192264};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 31;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
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
    private static java.lang.String $$i(int r7, int r8, short r9) {
        /*
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            r9 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity.$$i(int, int, short):java.lang.String");
    }
}
