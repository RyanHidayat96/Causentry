package com.bpjstku.presentation.program.jht.olddaysecurity.tracking;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
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
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtItem;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda10;
import com.bpjstku.databinding.ActivityClaimTrackingTimelineBinding;
import com.bpjstku.domain.jht.model.ClaimStep;
import com.bpjstku.domain.jht.model.JhtClaimTrack;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addTask;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.enableEdgeToEdgelambda1;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isModeInList;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setFlashMode;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0018\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0015\u0010\u0013\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\""}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/tracking/ClaimTrackingTimelineActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimTrackingTimelineBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/jht/model/JhtClaimTrack;", "Lcom/bpjstku/domain/jht/model/JhtClaimTrack;", "Lcom/bpjstku/domain/jht/model/Kpj;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/jht/model/Kpj;", "LisModeInList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "LsetFlashMode;", "", "d", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimTrackingTimelineActivity extends BindingBaseActivity<ActivityClaimTrackingTimelineBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f598a;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private ClaimEvidenceJhtItem TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private JhtClaimTrack b;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$f = 7;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, -108, 100, 114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 63;
    private static int INotificationSideChannel = 0;
    private static int g = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: lambdapostCapture12
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimTrackingTimelineActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });
    private final int d = R.layout.activity_claim_tracking_timeline;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i | i3));
        int i12 = i8 | i;
        int i13 = (~(i2 | i)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i + i3 + i6 + ((-1468046718) * i5) + (327422179 * i4);
        int i16 = i15 * i15;
        int i17 = ((-645773371) * i) + 280972133 + (i3 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i6 * (-645772719)) + (i5 * 1523302178) + (i4 * 1475409363) + (i16 * (-1007288320));
        int i18 = (677926197 * i) + 1810235392 + (1154460365 * i3) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i6) + (1933049856 * i5) + (743702528 * i4) + (286654464 * i16) + (i17 * i17 * (-492175360));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 != 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        ClaimTrackingTimelineActivity claimTrackingTimelineActivity = (ClaimTrackingTimelineActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i21 = ~((-993559604) | i7);
        int i22 = ~(1823547146 | i);
        if (i20 != (-328519600) + ((i21 | i22) * 1150) + (((~((-1823547147) | i7)) | i22) * (-575)) + (((~((-993559604) | i)) | (~(993559603 | i7))) * 575)) {
            throw new RuntimeException("36961439");
        }
        if (((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) != 978395380 + (((~(i | (-1879508289))) | 163596957) * (-756)) + (((-1879508289) | i7) * 756)) {
            int i23 = asBinder + 85;
            g = i23 % 128;
            if (i23 % 2 != 0) {
                int[] iArr = new int[1464419777];
                iArr[1464419776] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1464419777];
                iArr2[1464419776] = 1;
                int i24 = (-1312139840) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i25 = asBinder + 43;
            g = i25 % 128;
            int i26 = i25 % 2;
        }
        super.onResume();
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
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity.$$a
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity.c(short, int, byte, java.lang.Object[]):void");
    }

    public ClaimTrackingTimelineActivity() {
        final ClaimTrackingTimelineActivity claimTrackingTimelineActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<isModeInList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isModeInList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isModeInList invoke() {
                LifecycleOwner lifecycleOwner = claimTrackingTimelineActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(isModeInList.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/tracking/ClaimTrackingTimelineActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/jht/model/JhtClaimTrack;", "p1", "Lcom/bpjstku/domain/jht/model/Kpj;", "p2", "", "b", "(Landroid/content/Context;Lcom/bpjstku/domain/jht/model/JhtClaimTrack;Lcom/bpjstku/domain/jht/model/Kpj;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, JhtClaimTrack p1, Kpj p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ClaimTrackingTimelineActivity.class, new Pair[]{TuplesKt.to("claim_track", p1), TuplesKt.to("kpj", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimTrackingTimelineBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        g = i2 % 128;
        int i3 = i2 % 2;
        ClaimTrackingTimelineActivity$bindingInflater$1 claimTrackingTimelineActivity$bindingInflater$1 = ClaimTrackingTimelineActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = g + 13;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return claimTrackingTimelineActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        JhtClaimTrack jhtClaimTrack;
        Kpj kpj;
        ClaimTrackingTimelineActivity claimTrackingTimelineActivity = (ClaimTrackingTimelineActivity) objArr[0];
        int i = 2 % 2;
        Intent intent = claimTrackingTimelineActivity.getIntent();
        if (intent != null) {
            int i2 = g + 91;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            jhtClaimTrack = (JhtClaimTrack) intent.getParcelableExtra("claim_track");
        } else {
            int i3 = asBinder + 37;
            g = i3 % 128;
            int i4 = i3 % 2;
            jhtClaimTrack = null;
        }
        claimTrackingTimelineActivity.b = jhtClaimTrack;
        Intent intent2 = claimTrackingTimelineActivity.getIntent();
        if (intent2 != null) {
            int i5 = asBinder + 21;
            g = i5 % 128;
            int i6 = i5 % 2;
            kpj = (Kpj) intent2.getParcelableExtra("kpj");
        } else {
            kpj = null;
        }
        claimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = kpj;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ClaimTrackingTimelineActivity claimTrackingTimelineActivity = this;
        Intrinsics.checkNotNullParameter(claimTrackingTimelineActivity, "");
        claimTrackingTimelineActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_eclaim));
        RecyclerView recyclerView = ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvClaimTrackingTimeline;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((setFlashMode) this.TuitionPaymentFragmentbindingInflater1.getValue());
        int i2 = g + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdapreCapture4androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnDownloadEvidenceTransaction.setOnClickListener(new View.OnClickListener() { // from class: lambdapreCapture5androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClaimTrackingTimelineActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        int i2 = g + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        JhtClaimTrack jhtClaimTrack;
        String str;
        int i = 2 % 2;
        int i2 = g + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            jhtClaimTrack = this.b;
            int i3 = 26 / 0;
            if (jhtClaimTrack == null) {
                return;
            }
        } else {
            jhtClaimTrack = this.b;
            if (jhtClaimTrack == null) {
                return;
            }
        }
        TextView textView = ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvKpjNumber;
        Kpj kpj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (kpj != null) {
            int i4 = g + 13;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                String str2 = kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                obj.hashCode();
                throw null;
            }
            str = kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            str = null;
        }
        textView.setText(getString(R.string.label_concate_kpj, str));
        ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvClaimCode.setText(getString(R.string.label_concate_code_claim, jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1));
        if (Intrinsics.areEqual(jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "Y")) {
            int i5 = asBinder + 7;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                ((isModeInList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1("TRACKING_KLAIM", jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
                obj.hashCode();
                throw null;
            }
            ((isModeInList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1("TRACKING_KLAIM", jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
        }
        setFlashMode setflashmode = (setFlashMode) this.TuitionPaymentFragmentbindingInflater1.getValue();
        List<ClaimStep> list = jhtClaimTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ClaimStep claimStep : list) {
            arrayList.add(new enableEdgeToEdgelambda1(claimStep.TuitionPaymentFragmentbindingInflater1, claimStep.TuitionPaymentFragmentspecialinlinedviewModeldefault3, claimStep.b));
        }
        setflashmode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((isModeInList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: lambdapreCapture9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asBinder + 111;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = g + 109;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = f598a;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cGreen = (char) Color.green(i2);
                        int i8 = 1270 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                        int iResolveSizeAndState = View.resolveSizeAndState(i2, i2, i2) + 18;
                        byte b = (byte) ($$f >>> 2);
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, i8, iResolveSizeAndState, 407021364, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i9 = $11 + 85;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3225, KeyEvent.getDeadChar(0, 0) + 13, 2133916302, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        int i11 = 46 / 0;
                    } else {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 3225 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 14, 2133916302, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                        int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                        byte b7 = (byte) ($$f - 5);
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, scrollDefaultDelay, capsMode, 387247676, false, $$i(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr5[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41241), 1704 - TextUtils.lastIndexOf("", '0'), 21 - Color.red(0), -1434471773, false, $$i((byte) ($$f - 1), b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i14, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 57;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                cArr[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i16 = 0;
            while (true) {
                setvideostabilizationmode.b = i16;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i16 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (29944 - Color.green(0));
            int iAlpha = 1755 - Color.alpha(0);
            int iAxisFromString = 22 - MotionEvent.axisFromString("");
            short s = $$a[7];
            byte b = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iAlpha, iAxisFromString, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                short s2 = (short) ($$b & 229);
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(s2, b2, (byte) (b2 | 52), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i2, iMakeMeasureSpec, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (((-118798613) + (((~((~iIdentityHashCode) | 89580486)) | 301993984) * 446)) + (((~(iIdentityHashCode | 391574470)) | 188928) * 446)) - 951466112;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i5 ^ (i5 << 5);
            int i6 = asBinder + 15;
            g = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{0, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{16, 16, 0, 9}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1020959670};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - Color.red(0)), (Process.myPid() >> 22) + 1726, ((byte) KeyEvent.getModifierMetaStateMask()) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1798170496);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int iMakeMeasureSpec2 = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                    short s3 = (short) ($$b & 229);
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(s3, b3, (byte) (b3 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, iMakeMeasureSpec2, i8, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{32, 22, 151, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{54, 15, 120, 11}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iAlpha2 = 23 - Color.alpha(0);
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((short) 89, b4, (byte) (b4 | 52), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, absoluteGravity, iAlpha2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        short s4 = $$a[7];
                        byte b5 = (byte) s4;
                        Object[] objArr12 = new Object[1];
                        c(s4, b5, (byte) (b5 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, i9, iKeyCodeFromString, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i13 = i12 + (((~(733347773 | iIdentityHashCode2)) | (-332919371)) * 262) + 119782449 + (((~((~iIdentityHashCode2) | 733347773)) | (-332919371)) * 262);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i16 = 0;
                while (i16 < strArr.length) {
                    int i17 = g + 107;
                    asBinder = i17 % 128;
                    if (i17 % 2 == 0) {
                        arrayList.add(strArr[i16]);
                        i16 += 91;
                    } else {
                        arrayList.add(strArr[i16]);
                        i16++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i20 = i18 + ((((~(710978389 | i19)) | (-493621979)) * 398) - 806029151) + (((~((~i19) | 710978389)) | (-493621979)) * 398);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i23 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i24 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            c((short) 141, b6, (byte) (b6 | 52), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, i23, i24, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{32, 22, 151, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{54, 15, 120, 11}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            short s5 = (short) ($$b & 229);
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            c(s5, b7, (byte) (b7 | 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf2, iIndexOf, iResolveOpacity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int defaultSize2 = View.getDefaultSize(0, 0) + 1031;
                int i25 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr19 = new Object[1];
                c((short) 193, bArr[5], bArr[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(defaultSize, defaultSize2, i25, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr20[3])[0];
            int i27 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i28 = 1478684575 + (((~((-3337551) | iIdentityHashCode3)) | 2261316 | (~(240942619 | iIdentityHashCode3))) * (-754));
            int i29 = ~((-2261317) | iIdentityHashCode3);
            int i30 = ~iIdentityHashCode3;
            int i31 = i28 + ((i29 | (~(243203935 | i30))) * (-754)) + ((i30 | (-3337551)) * 754) + 819636721;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{0, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{16, 16, 0, 9}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1020959670};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getTapTimeout() >> 16)), View.combineMeasuredStates(0, 0) + 1134, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 819636721, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i34 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 141, b8, (byte) (b8 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority, scrollBarSize, i34, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 16 - ExpandableListView.getPackedPositionChild(0L)), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
                int iAlpha3 = 15 - Color.alpha(0);
                byte[] bArr2 = $$a;
                Object[] objArr27 = new Object[1];
                c((short) 193, bArr2[5], bArr2[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(threadPriority2, iLastIndexOf, iAlpha3, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                e(new int[]{32, 22, 151, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new int[]{54, 15, 120, 11}, false, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iAlpha4 = Color.alpha(0) + 1031;
                    int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                    short s6 = (short) ($$b & 229);
                    byte b9 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(s6, b9, (byte) (b9 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, iAlpha4, deadChar, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iAxisFromString2 = MotionEvent.axisFromString("") + 1032;
                    int deadChar2 = 15 - KeyEvent.getDeadChar(0, 0);
                    byte b10 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c((short) 141, b10, (byte) (b10 | 52), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumDrawingCacheSize, iAxisFromString2, deadChar2, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 == i35) {
            int i37 = asBinder + 111;
            g = i37 % 128;
            int i38 = i37 % 2;
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr[2])[0];
            int i40 = ((int[]) objArr[3])[0];
            int i41 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_order_id_required).substring(0, 9).codePointAt(6) - 1539964593;
            int i42 = (~((-80529897) | iCodePointAt)) | 12616064;
            int i43 = ~((~iCodePointAt) | 231664105);
            int i44 = i39 + 1878862953 + ((i42 | i43) * (-470)) + (((~(iCodePointAt | (-67913833))) | i43) * 470);
            int i45 = i44 ^ (i44 << 13);
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr32[2])[0] = i46 ^ (i46 << 5);
            int i47 = asBinder + 97;
            g = i47 % 128;
            int i48 = i47 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                int i49 = g + 29;
                asBinder = i49 % 128;
                int i50 = i49 % 2;
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i36];
        int i51 = i36 - 1;
        iArr[i51] = 1;
        Toast.makeText((Context) null, iArr[((i36 * i51) % 2) - 1], 1).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i52 = ((int[]) objArr[2])[0];
        int i53 = ((int[]) objArr[3])[0];
        int i54 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i55 = ~((int) SystemClock.elapsedRealtime());
        int i56 = i52 + 431443793 + ((399998846 | i55) * 184) + (((~(i55 | 324238712)) | 395800438) * 184);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr33[2])[0] = i58 ^ (i58 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00ab  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            if (i3 != 1735425328 + (((~((-1719161989) | i4)) | 889174445) * (-328)) + ((iIdentityHashCode | 889174445) * 164) + (((~(iIdentityHashCode | 1719161988)) | 277326121 | (~(i4 | (-1107313665)))) * 164)) {
                int[] iArr = new int[601542627];
                iArr[601542626] = 1;
                int i5 = (-1517153434) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i6 = asBinder + 65;
                g = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            int i8 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay).substring(0, 5).codePointAt(2) - 761627585;
            int i9 = 1473874448 + ((iCodePointAt | 68843568) * (-859));
            int i10 = ~iCodePointAt;
            if (i8 != i9 + (((~(iCodePointAt | (-550961))) | (~(68843568 | i10))) * 859) + (((~(898831111 | i10)) | (-899382072)) * 859)) {
                int[] iArr2 = new int[601542627];
                iArr2[601542626] = 1;
                int i11 = (-1517153434) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i12 = asBinder + 65;
                g = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        int i14 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.shipping_cb_message).substring(0, 3).codePointAt(1) - 478206988;
        int i15 = ~iCodePointAt2;
        if (i14 != (-216160296) + (((~((-547145071) | i15)) | 2031910894) * 519) + (((~(i15 | (-8421377))) | (~(2040332270 | iCodePointAt2))) * (-519)) + (((~(iCodePointAt2 | 2031910894)) | 547145070) * 519)) {
            int i16 = 29142494 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-916428844) + (((~((~iIdentityHashCode) | (-105209889))) | (~((-1098947673) | iIdentityHashCode))) * (-302)) + ((~((-105209889) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-1204157561))) | (-1473117690)) * 302)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i7 = ~i6;
        if (i5 != (-1622509944) + (((~((-1739814711) | i7)) | 839241254) * (-90)) + (((~((-1739814711) | i6)) | (-2008547127)) * (-45)) + (((~(i6 | (-839241255))) | (-1739814711) | (~(i7 | 839241254))) * 45)) {
            int i8 = (-859988862) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = g + 15;
        asBinder = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setFlashMode TuitionPaymentFragmentbindingInflater1(ClaimTrackingTimelineActivity claimTrackingTimelineActivity) {
        int i = 2 % 2;
        setFlashMode setflashmode = new setFlashMode(claimTrackingTimelineActivity, null, 2, null);
        int i2 = asBinder + 1;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return setflashmode;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ClaimTrackingTimelineActivity claimTrackingTimelineActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            ReceiptClaimOldDaySecurityActivity.Companion companion = ReceiptClaimOldDaySecurityActivity.INSTANCE;
            ReceiptClaimOldDaySecurityActivity.Companion.b(claimTrackingTimelineActivity, claimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ViewPortBuilder.b();
            int i4 = g + 113;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimTrackingTimelineActivity claimTrackingTimelineActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            claimTrackingTimelineActivity.getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
        claimTrackingTimelineActivity.getOnBackPressedDispatcher().onBackPressed();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ClaimTrackingTimelineActivity claimTrackingTimelineActivity = (ClaimTrackingTimelineActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            claimTrackingTimelineActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = g + 37;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                claimTrackingTimelineActivity.IconCompatParcelizer();
                Intrinsics.areEqual(((ClaimEvidenceJhtResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEvidence(), "Y");
                throw null;
            }
            claimTrackingTimelineActivity.IconCompatParcelizer();
            ClaimEvidenceJhtResponse claimEvidenceJhtResponse = (ClaimEvidenceJhtResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (Intrinsics.areEqual(claimEvidenceJhtResponse.isEvidence(), "Y")) {
                if (!(true ^ (claimEvidenceJhtResponse.getData() != null))) {
                    ((ActivityClaimTrackingTimelineBinding) ((ViewBinding) claimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnDownloadEvidenceTransaction.setVisibility(0);
                    claimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = claimEvidenceJhtResponse.getData();
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i3 = asBinder + 25;
            g = i3 % 128;
            if (i3 % 2 != 0) {
                claimTrackingTimelineActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 1).show();
            } else {
                claimTrackingTimelineActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimTrackingTimelineActivity claimTrackingTimelineActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(433930086, iTuitionPaymentFragmentbindingInflater1, -433930086, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater3, new Object[]{claimTrackingTimelineActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentbindingInflater2);
    }

    static {
        notify = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 31;
        notify = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1800419126, iTuitionPaymentFragmentbindingInflater1, -1800419125, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1164113337, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1164113339, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 45;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
    }

    static void g() {
        f598a = new char[]{59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59695, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59767, 59893, 59403, 59401, 59404, 59400, 59894, 59883, 59886, 59395, 59884, 59868, 59894, 59398, 59393, 59400, 59403, 59876, 59877, 59407, 59403, 59893, 59774, 59887, 59863, 59864, 59864, 59856, 59861, 59875, 59885, 59880, 59882, 59862, 59883, 59861, 59883};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 + 99
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingTimelineActivity.$$i(int, int, byte):java.lang.String");
    }
}
