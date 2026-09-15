package com.bpjstku.presentation.program.jkp.tracking;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda10;
import com.bpjstku.databinding.ActivityJkpClaimTrackingTimelineBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.domain.jkp.model.ClaimStep;
import com.bpjstku.domain.jkp.model.ClaimTitle;
import com.bpjstku.domain.jkp.model.JkpTrackClaim;
import com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import defpackage.CameraUseCaseAdapter;
import defpackage.ComponentActivityExternalSyntheticLambda7;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.addTask;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0015\u0010\u0016\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0015X\u0095D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/tracking/JkpClaimTrackingTimelineActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkpClaimTrackingTimelineBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/jkp/model/JkpTrackClaim;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/jkp/model/JkpTrackClaim;", "Lcom/bpjstku/domain/jht/model/Kpj;", "Lcom/bpjstku/domain/jht/model/Kpj;", "LCamera2CapturePipelineTorchTaskExternalSyntheticLambda2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentbindingInflater1", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpClaimTrackingTimelineActivity extends BindingBaseActivity<ActivityJkpClaimTrackingTimelineBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long asInterface;
    private static int d;
    private JkpTrackClaim TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 133;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f607a = 0;
    private static int g = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: findHighestQualityProfiles
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_jkp_claim_tracking_timeline;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i4 | i2)) | i;
        int i8 = i2 | i4 | i;
        int i9 = ~i4;
        int i10 = i4 + i + i3 + ((-421447895) * i5) + ((-859425246) * i6);
        int i11 = i10 * i10;
        int i12 = (i4 * (-629045104)) + 1817116672 + ((-629045104) * i) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i3) + ((-2125594624) * i5) + (888930304 * i6) + (441384960 * i11);
        int i13 = (i4 * 1303038832) + 2077918271 + (i * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i3 * 1303038783) + (i5 * 1583617559) + (i6 * (-1102559138)) + (i11 * 510722048);
        return i12 + ((i13 * i13) * 607191040) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/program/jkp/tracking/JkpClaimTrackingTimelineActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/jkp/model/JkpTrackClaim;", "p1", "Lcom/bpjstku/domain/jht/model/Kpj;", "p2", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/domain/jkp/model/JkpTrackClaim;Lcom/bpjstku/domain/jht/model/Kpj;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, JkpTrackClaim p1, Kpj p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JkpClaimTrackingTimelineActivity.class, new Pair[]{TuplesKt.to("claim_track", p1), TuplesKt.to("kpj", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f607a + 37;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 91;
        f607a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkpClaimTrackingTimelineBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 43;
        f607a = i2 % 128;
        int i3 = i2 % 2;
        JkpClaimTrackingTimelineActivity$bindingInflater$1 jkpClaimTrackingTimelineActivity$bindingInflater$1 = JkpClaimTrackingTimelineActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = g + 113;
        f607a = i4 % 128;
        int i5 = i4 % 2;
        return jkpClaimTrackingTimelineActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final JkpClaimTrackingTimelineActivity jkpClaimTrackingTimelineActivity = (JkpClaimTrackingTimelineActivity) objArr[0];
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityJkpClaimTrackingTimelineBinding) ((ViewBinding) jkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2DeviceSurfaceManager1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkpClaimTrackingTimelineActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        int i2 = f607a + 11;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f607a + 7;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Kpj kpj = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = intent != null ? (JkpTrackClaim) intent.getParcelableExtra("claim_track") : null;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i4 = f607a + 41;
            g = i4 % 128;
            int i5 = i4 % 2;
            Kpj kpj2 = (Kpj) intent2.getParcelableExtra("kpj");
            if (i5 == 0) {
                int i6 = 46 / 0;
            }
            kpj = kpj2;
            int i7 = g + 53;
            f607a = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 5;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = kpj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052 A[PHI: r1
  0x0052: PHI (r1v8 com.bpjstku.domain.jkp.model.ClaimTitle) = (r1v7 com.bpjstku.domain.jkp.model.ClaimTitle), (r1v9 com.bpjstku.domain.jkp.model.ClaimTitle) binds: [B:14:0x0050, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str;
        String str2;
        ArrayList arrayList;
        List<ClaimStep> list;
        ClaimTitle claimTitle;
        JkpClaimTrackingTimelineActivity jkpClaimTrackingTimelineActivity = (JkpClaimTrackingTimelineActivity) objArr[0];
        int i = 2 % 2;
        ActivityJkpClaimTrackingTimelineBinding activityJkpClaimTrackingTimelineBinding = (ActivityJkpClaimTrackingTimelineBinding) ((ViewBinding) jkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityJkpClaimTrackingTimelineBinding.tvKpjNumber;
        Kpj kpj = jkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (kpj != null) {
            str = kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = f607a + 47;
            g = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        textView.setText("KPJ : ".concat(String.valueOf(str)));
        TextView textView2 = activityJkpClaimTrackingTimelineBinding.tvClaimCode;
        JkpTrackClaim jkpTrackClaim = jkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (jkpTrackClaim != null) {
            int i4 = g + 89;
            f607a = i4 % 128;
            if (i4 % 2 != 0) {
                claimTitle = jkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = 92 / 0;
                if (claimTitle != null) {
                    str2 = claimTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str2 = null;
                }
            } else {
                claimTitle = jkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (claimTitle != null) {
                    str2 = claimTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str2 = null;
                }
            }
        } else {
            str2 = null;
        }
        textView2.setText("Kode Klaim : ".concat(String.valueOf(str2)));
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) jkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        JkpTrackClaim jkpTrackClaim2 = jkpClaimTrackingTimelineActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (jkpTrackClaim2 == null || (list = jkpTrackClaim2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            arrayList = null;
        } else {
            List<ClaimStep> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (ClaimStep claimStep : list2) {
                arrayList2.add(new ComponentActivityExternalSyntheticLambda7(claimStep.TuitionPaymentFragmentbindingInflater1, claimStep.b, claimStep.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
            arrayList = arrayList2;
        }
        camera2CapturePipelineTorchTaskExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
        return null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 87;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2624, 13 - KeyEvent.normalizeMetaState(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (asInterface ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39421), TextUtils.lastIndexOf("", '0', 0, 0) + 482, ((byte) KeyEvent.getModifierMetaStateMask()) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (Process.myTid() >> 22)), Color.rgb(0, 0, 0) + 16777697, 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JkpClaimTrackingTimelineActivity jkpClaimTrackingTimelineActivity = this;
        Intrinsics.checkNotNullParameter(jkpClaimTrackingTimelineActivity, "");
        jkpClaimTrackingTimelineActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityJkpClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJkpClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_eclaim));
        RecyclerView recyclerView = ((ActivityJkpClaimTrackingTimelineBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvClaimTrackingTimeline;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        int i2 = g + 17;
        f607a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 107;
        f607a = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = g + 15;
                f607a = i3 % 128;
                if (i3 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = 92 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
            int iBlue = Color.blue(0) + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i2, iBlue, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{43390, 54510, 21061, 53680, 24332, 56685, 22721, 50792, 17800, 50171, 16647, 52377, 18962, 51327, 30681, 62763, 28802, 65235, 31837, 64445, 30992, 59263}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_app).substring(13, 16).length() + 32156, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{43386, 40102, 49876, 2064, 32312, 42067, 60293, 53662, 2002, 19715, 45857, 63820, 11402, 4771, 22748}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 13666, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int iMyPid = (Process.myPid() >> 22) + 15;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b2, b3, (short) (b3 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, iIndexOf, iMyPid, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int threadPriority2 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                int iResolveSize = View.resolveSize(0, 0) + 15;
                byte b4 = $$a[5];
                Object[] objArr6 = new Object[1];
                c((byte) 52, b4, (short) (b4 | 102), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, threadPriority2, iResolveSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i5 = ~((~Process.myPid()) | (-115950021));
            int i6 = (((((-402255343) | i5) * (-970)) - 1939634001) + ((i5 | 286305322) * 970)) - 1485679747;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{43381, 37661, 56751, 1623, 16573, 35484, 63276, 12740, 31328, 42058, 61074, 11047, 5576, 24172, 38928, 49855}, 14948 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{43382, 25792, 12812, 49216, 40839, 44497, 31497, 2427, 50319, 37613, 40994, 32382, 3480, 56079, 59713, 42127}, TextUtils.indexOf("", "", 0) + 52667, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1702960850};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46038), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1135, 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1485679747, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iResolveSize2 = View.resolveSize(0, 0) + 1031;
                    int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(b5, b5, bArr2[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, iResolveSize2, iNormalizeMetaState, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.indexOf("", "", 0)), 1117 - TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                    int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                    byte b6 = $$a[5];
                    Object[] objArr13 = new Object[1];
                    c((byte) 52, b6, (short) (b6 | 102), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, absoluteGravity, packedPositionChild, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{43390, 54510, 21061, 53680, 24332, 56685, 22721, 50792, 17800, 50171, 16647, 52377, 18962, 51327, 30681, 62763, 28802, 65235, 31837, 64445, 30992, 59263}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 32113, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{43386, 40102, 49876, 2064, 32312, 42067, 60293, 53662, 2002, 19715, 45857, 63820, 11402, 4771, 22748}, 13781 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int mirror = 1079 - AndroidCharacter.getMirror('0');
                        int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr16 = new Object[1];
                        c(b7, b8, (short) (b8 | 51), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, mirror, minimumFlingVelocity, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iIndexOf2 = 1031 - TextUtils.indexOf("", "");
                        int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        byte b9 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(b9, b9, bArr3[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, iIndexOf2, longPressTimeout, 1357589585, false, (String) objArr17[0], null);
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    int i11 = f607a + 47;
                    g = i11 % 128;
                    int i12 = i11 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = ~iIdentityHashCode;
        int i17 = (~(749070399 | i16)) | 319820672;
        int i18 = ~(iIdentityHashCode | (-75540503));
        int i19 = i13 + (((i17 | i18) * (-252)) - 765289111) + ((i18 | (~(i16 | 1068891071))) * 252);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1756;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
            byte b10 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((byte) 15, b10, (short) (b10 | 103), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(capsMode, packedPositionChild2, scrollDefaultDelay, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                int iMyTid = 23 - (Process.myTid() >> 22);
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr20 = new Object[1];
                c(b11, b12, (short) (b12 | 51), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, modifierMetaStateMask, iMyTid, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellSiteTitle).substring(0, 4).length() - 522799661;
            int i22 = (-538743511) + (((~((-541855773) | (~length))) | (~((-329253347) | length))) * (-272)) + (((~((-610210333) | length)) | 68354560) * (-272)) + (((~(length | 610210332)) | (-397607907)) * 272) + 1165681333;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i24 ^ (i24 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{43381, 37661, 56751, 1623, 16573, 35484, 63276, 12740, 31328, 42058, 61074, 11047, 5576, 24172, 38928, 49855}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 14911, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{43382, 25792, 12812, 49216, 40839, 44497, 31497, 2427, 50319, 37613, 40994, 32382, 3480, 56079, 59713, 42127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52631, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1702960850};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42048), ExpandableListView.getPackedPositionType(0L) + 1726, 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1165681333);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                int i25 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b13 = $$a[7];
                byte b14 = b13;
                Object[] objArr25 = new Object[1];
                c(b13, b14, (short) (b14 | 51), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveSize, iKeyCodeFromString, i25, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{43390, 54510, 21061, 53680, 24332, 56685, 22721, 50792, 17800, 50171, 16647, 52377, 18962, 51327, 30681, 62763, 28802, 65235, 31837, 64445, 30992, 59263}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32148, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{43386, 40102, 49876, 2064, 32312, 42067, 60293, 53662, 2002, 19715, 45857, 63820, 11402, 4771, 22748}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 13735, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int iResolveSize3 = View.resolveSize(0, 0) + 1755;
                    int i26 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr28 = new Object[1];
                    c(b15, b16, (short) (b16 | 140), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(edgeSlop, iResolveSize3, i26, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0));
                    int i27 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
                    byte b17 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 15, b17, (short) (b17 | 103), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, i27, offsetAfter, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i28 = ((int[]) objArrB$5f1425da[1])[0];
        int i29 = ((int[]) objArrB$5f1425da[0])[0];
        if (i29 == i28) {
            int i30 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i32 = (-1547593692) + (((~((~i31) | 186543923)) | (-534675328)) * (-245));
            int i33 = ~(i31 | 186543923);
            int i34 = i30 + i32 + (i33 * (-245)) + ((i33 | 399146349) * 245);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr30[3])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrB$5f1425da[4];
        if (strArr4 != null) {
            int i37 = g + 85;
            f607a = i37 % 128;
            int i38 = 2;
            int i39 = i37 % 2;
            int i40 = 0;
            while (i40 < strArr4.length) {
                int i41 = f607a + 5;
                g = i41 % 128;
                int i42 = i41 % i38;
                arrayList2.add(strArr4[i40]);
                i40++;
                i38 = 2;
            }
        }
        int[] iArr = new int[i29];
        int i43 = i29 - 1;
        iArr[i43] = 1;
        Toast.makeText((Context) null, iArr[((i29 * i43) % 2) - 1], 1).show();
        int i44 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i45 = (int) Runtime.getRuntime().totalMemory();
        int i46 = ~i45;
        int i47 = (~((-577115317) | i46)) | 574886020;
        int i48 = ~(i45 | (-362283595));
        int i49 = i44 + 1042575633 + ((i47 | i48) * (-502)) + ((i48 | (~(i46 | (-2229297)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f607a + 103;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_400).substring(21, 22).codePointAt(0) - 398017880;
        int i5 = ~iCodePointAt;
        if (i4 != 1168966376 + (((~(1744644718 | i5)) | 268469649) * 168) + ((~((-268469650) | iCodePointAt)) * 168) + (((~(iCodePointAt | 2013114367)) | (~(i5 | (-914657176))) | 646187526) * 168)) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = (~Process.myTid()) | 970220997;
        if (i6 != (-952706272) + (i7 * 495) + (((~i7) | 432293253) * 495)) {
            throw null;
        }
        super.onResume();
        int i8 = f607a + 73;
        g = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f607a + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        if (i4 != 1363830818 + ((~((~i5) | (-138414343))) * 433) + (((~(977848798 | i5)) | (-147861256)) * (-433)) + (((~(i5 | (-147861256))) | 839434456) * 433)) {
            int i6 = (-1286813642) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i9 = ~i8;
        if (i7 != (-458405284) + ((403836960 | i9) * (-192)) + (((~((-1638264736) | i9)) | 536954269) * (-384)) + (((~(i8 | 2042101695)) | (~(i9 | (-1101310467))) | (~((-536954270) | i8))) * DerHeader.TAG_CLASS_PRIVATE)) {
            throw new RuntimeException("-1675458595");
        }
        super.onStart();
        int i10 = g + 75;
        f607a = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009d, code lost:
    
        if (r1 == ((997876746 + (((~((-1996756722) | r2)) | 582299243) * (-366))) + (((~(r2 | (-1426067601))) | 11610122) * 366))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009f, code lost:
    
        r1 = com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.g + 77;
        com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.f607a = r1 % 128;
        r1 = r1 % 2;
        r1 = new int[65033377];
        r1[65033376(0x3e054a0, float:1.3184966E-36)] = 1;
        r2 = (-136726368) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
        r1 = com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.g + 57;
        com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.f607a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ca, code lost:
    
        super.onCreate(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ce, code lost:
    
        r10 = 1025645310 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        if (r1 == ((((-1273806040) + ((6308884 | r5) * (-192))) + (((~(1215061780 | r5)) | 378765353) * (-384))) + (((~(r4 | (-1208752897))) | ((~(r5 | 1593827133)) | (~((-378765354) | r4)))) * okhttp3.tls.internal.der.DerHeader.TAG_CLASS_PRIVATE))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0071, code lost:
    
        if (r1 == (((((-2124005246) | r4) * (-196)) + 1781392716) + ((r4 | 579895593) * 196))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) android.os.Process.getElapsedCpuTime();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkp.tracking.JkpClaimTrackingTimelineActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit b(JkpClaimTrackingTimelineActivity jkpClaimTrackingTimelineActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 103;
        f607a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            jkpClaimTrackingTimelineActivity.onBackPressed();
            return Unit.INSTANCE;
        }
        jkpClaimTrackingTimelineActivity.onBackPressed();
        int i4 = 3 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkpClaimTrackingTimelineActivity jkpClaimTrackingTimelineActivity) {
        int i = 2 % 2;
        Object obj = null;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda2(jkpClaimTrackingTimelineActivity, null, 2, null);
        int i2 = g + 11;
        f607a = i2 % 128;
        if (i2 % 2 == 0) {
            return camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        obj.hashCode();
        throw null;
    }

    static {
        d = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 103;
        d = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, -1955576399, OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), addTask.TuitionPaymentFragmentbindingInflater1(), 1955576400, OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), addTask.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = f607a + 41;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, 1405222266, OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1405222266, addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f607a + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 71;
        f607a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }

    static void g() {
        asInterface = -1558403255871078396L;
    }
}
