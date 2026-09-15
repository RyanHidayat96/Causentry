package com.bpjstku.presentation.program.jht.olddaysecurity.rsjht;

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
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
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
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityOldDaySecurityCheckRsjhtBinding;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjRsjht;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;
import defpackage.AutoValue_MediaSpec1;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.CameraUseCaseAdapter;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isModeInList;
import defpackage.lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
import kotlin.jvm.internal.TypeReference;
import okhttp3.tls.internal.der.DerHeader;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0019\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0015\u0010\u001d\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/OldDaySecurityCheckRsjhtActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityOldDaySecurityCheckRsjhtBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LisModeInList;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetStringOrNull;", "LgetStringOrNull;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjRsjht;", "d", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjRsjht;", "", "Lcom/bpjstku/domain/jht/model/JhtBalance;", "Ljava/util/List;", "g", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;", "LlambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OldDaySecurityCheckRsjhtActivity extends BindingBaseActivity<ActivityOldDaySecurityCheckRsjhtBinding> {
    private static char[] asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private KpjParcelItem a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private KpjRsjht TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {7, 15, 25, 25};
    private static final int $$f = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {6, 51, 46, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = DerHeader.TAG_CLASS_PRIVATE;
    private static int onTransact = 1;
    private static int asInterface = 0;
    private static int INotificationSideChannel = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private List<JhtBalance> g = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: Camera2CapturePipelinePipelineExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = ~(i2 | i3);
        int i12 = i10 | i11;
        int i13 = ~i2;
        int i14 = i10 | (~(i13 | i)) | i11;
        int i15 = (~(i3 | i2 | i)) | (~(i8 | i13 | i9));
        int i16 = i2 + i + i4 + (1322235619 * i5) + (440487356 * i6);
        int i17 = i16 * i16;
        int i18 = (((-1102165783) * i2) - 2100690944) + ((-281430247) * i) + ((-820735536) * i12) + (i14 * 410367768) + (410367768 * i15) + ((-691798016) * i4) + ((-942931968) * i5) + ((-1410334720) * i6) + (1251606528 * i17);
        int i19 = (i2 * 157034417) + 1376579869 + (i * 157036385) + (i12 * (-1968)) + (i14 * 984) + (i15 * 984) + (i4 * 157035401) + (i5 * (-982187909)) + (i6 * (-1869533796)) + (i17 * (-899022848));
        int i20 = i18 + (i19 * i19 * (-511311872));
        if (i20 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i20 == 2) {
            int i21 = 2 % 2;
            int i22 = asInterface + 75;
            INotificationSideChannel = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        if (i20 != 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity = (OldDaySecurityCheckRsjhtActivity) objArr[0];
        int i24 = 2 % 2;
        if (oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1 == null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityCheckRsjhtActivity, "Anda Belum Memilih Nomor KPJ", null);
            i7 = INotificationSideChannel + 75;
            asInterface = i7 % 128;
        } else {
            ClaimOldDaySecurityViewBalanceJhtActivity.Companion companion = ClaimOldDaySecurityViewBalanceJhtActivity.INSTANCE;
            KpjRsjht kpjRsjht = oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(kpjRsjht);
            String str = kpjRsjht.asBinder;
            KpjRsjht kpjRsjht2 = oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(kpjRsjht2);
            String str2 = kpjRsjht2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            KpjRsjht kpjRsjht3 = oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(kpjRsjht3);
            String str3 = kpjRsjht3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            KpjRsjht kpjRsjht4 = oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(kpjRsjht4);
            ClaimOldDaySecurityViewBalanceJhtActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityCheckRsjhtActivity, str2, str, str3, kpjRsjht4.d);
            i7 = asInterface + 109;
            INotificationSideChannel = i7 % 128;
        }
        int i25 = i7 % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = 144 - r6
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity.c(short, int, byte, java.lang.Object[]):void");
    }

    public OldDaySecurityCheckRsjhtActivity() {
        final OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<isModeInList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [isModeInList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final isModeInList invoke() {
                ComponentCallbacks componentCallbacks = oldDaySecurityCheckRsjhtActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(isModeInList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/OldDaySecurityCheckRsjhtActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, OldDaySecurityCheckRsjhtActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityOldDaySecurityCheckRsjhtBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        OldDaySecurityCheckRsjhtActivity$bindingInflater$1 oldDaySecurityCheckRsjhtActivity$bindingInflater$1 = OldDaySecurityCheckRsjhtActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = asInterface + 51;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return oldDaySecurityCheckRsjhtActivity$bindingInflater$1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1 r2
  0x0037: PHI (r1v8 com.bpjstku.databinding.ActivityOldDaySecurityCheckRsjhtBinding) = 
  (r1v7 com.bpjstku.databinding.ActivityOldDaySecurityCheckRsjhtBinding)
  (r1v18 com.bpjstku.databinding.ActivityOldDaySecurityCheckRsjhtBinding)
 binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r2v3 android.widget.EditText) = (r2v2 android.widget.EditText), (r2v11 android.widget.EditText) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        ActivityOldDaySecurityCheckRsjhtBinding activityOldDaySecurityCheckRsjhtBinding;
        EditText editText;
        int i = 2 % 2;
        int i2 = asInterface + 31;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            activityOldDaySecurityCheckRsjhtBinding = (ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            editText = activityOldDaySecurityCheckRsjhtBinding.tilChooseKpj.getEditText();
            int i3 = 76 / 0;
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: Camera2CapturePipelinePipelineExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                    }
                });
                int i4 = INotificationSideChannel + 105;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            activityOldDaySecurityCheckRsjhtBinding = (ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            editText = activityOldDaySecurityCheckRsjhtBinding.tilChooseKpj.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: Camera2CapturePipelinePipelineExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                    }
                });
                int i6 = INotificationSideChannel + 105;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        MaterialButton materialButton = activityOldDaySecurityCheckRsjhtBinding.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: Camera2CapturePipelinePipelineExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (Unit) OldDaySecurityCheckRsjhtActivity.b(-2067284592, 2067284595, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        int i8 = INotificationSideChannel + 51;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((isModeInList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new Observer() { // from class: Camera2CapturePipelinePipeline1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = INotificationSideChannel + 77;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ((isModeInList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = asInterface + 101;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity = this;
        Intrinsics.checkNotNullParameter(oldDaySecurityCheckRsjhtActivity, "");
        oldDaySecurityCheckRsjhtActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_info_rjhst));
        int i4 = INotificationSideChannel + 7;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:5:0x0016, B:13:0x0040, B:11:0x0030, B:9:0x0027), top: B:18:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 95;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 37 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = INotificationSideChannel + 93;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i6 = INotificationSideChannel + 93;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
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

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = asBinder;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
                    i5 = 3;
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
        Object[] objArr3 = {Integer.valueOf(g)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267, 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 2;
                        byte b7 = (byte) (b6 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49266), 3260 - TextUtils.lastIndexOf("", '0'), 30 - Drawable.resolveOpacity(0, 0), -127612708, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i8 = $10 + 29;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 22878), 594 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1570859318, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i15 = $10 + 41;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iMyPid = 1031 - (Process.myPid() >> 22);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (bArr[1] + 1), (short) 141, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iMyPid, iCombineMeasuredStates, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{20, 7, 24, '\r', 2, '\b', 24, 22, 1, 18, 20, 16, 1, 17, 3, 11, 15, 24, 23, 4, 0, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_alfamart).substring(0, 8).codePointAt(1) - 14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_order_id_required).substring(0, 9).length() + 13, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{14, 23, 21, 7, 18, 11, 3, '\r', '\f', 23, 21, 4, '\t', 17, 13878}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contact_detail_title).substring(10, 12).codePointAt(1) - 50, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int i2 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int gidForName = 14 - Process.getGidForName("");
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) (bArr2[1] + 1), (short) 89, bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, i2, gidForName, 1344079056, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr6 = new Object[1];
            e(new char[]{7, 24, '\f', 20, 22, 20, 20, 7, 11, 22, 17, 0, 21, 6, 14, 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama5).substring(12, 13).length() + 36), 16 - View.getDefaultSize(0, 0), objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{'\b', 22, '\n', '\b', 2, 6, 2, 3, '\f', 21, 17, 19, 23, 0, 3, 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 102), View.getDefaultSize(0, 0) + 16, objArr7);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-80735018};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - Color.blue(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1133, 18 - Color.argb(0, 0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr9 = {Integer.valueOf(iIntValue), 0, 381400539, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                    int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                    byte[] bArr3 = $$a;
                    Object[] objArr10 = new Object[1];
                    c((byte) (bArr3[1] + 1), (short) 141, bArr3[132], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, absoluteGravity, i3, 1298546779, false, (String) objArr10[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionType(0L)), 1117 - TextUtils.getOffsetBefore("", 0), 17 - TextUtils.getOffsetBefore("", 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                    int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b = $$a[7];
                    byte b2 = b;
                    Object[] objArr11 = new Object[1];
                    c(b2, (short) (b2 | 37), b, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iLastIndexOf, iIndexOf, 632103528, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{20, 7, 24, '\r', 2, '\b', 24, 22, 1, 18, 20, 16, 1, 17, 3, 11, 15, 24, 23, 4, 0, 1}, (byte) (KeyEvent.normalizeMetaState(0) + 94), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).length() + 13, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{14, 23, 21, 7, 18, 11, 3, '\r', '\f', 23, 21, 4, '\t', 17, 13878}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyTid2 = (char) (Process.myTid() >> 22);
                        int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iBlue = 15 - Color.blue(0);
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        c((byte) (bArr4[1] + 1), (short) 89, bArr4[132], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid2, iIndexOf2, iBlue, 1344079056, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c((byte) (bArr5[1] + 1), (short) 141, bArr5[132], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, maximumFlingVelocity, maxKeyCode, 1357589585, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        } else {
            int i4 = asInterface + 23;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                int iIndexOf3 = 15 - TextUtils.indexOf("", "", 0);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr16 = new Object[1];
                c(b4, (short) (b4 | 37), b3, objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatDelay, windowTouchSlop, iIndexOf3, 632103528, false, (String) objArr16[0], null);
            }
            Object[] objArr17 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr17[3])[0];
            int i7 = ((int[]) objArr17[1])[0];
            String[] strArr = (String[]) objArr17[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~((-17854477) | iIdentityHashCode);
            int i9 = ~iIdentityHashCode;
            int i10 = (-1155175919) + ((i8 | (~((-205654850) | i9))) * 920) + ((17854476 | (~((-20770845) | i9))) * 920) + (((~(iIdentityHashCode | (-205654850))) | (~((-17854477) | i9)) | (~((-2916369) | iIdentityHashCode))) * 920) + 381400539;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i18 = i15 + ((((~((-883228670) | iElapsedRealtime)) | 604279953) * (-566)) - 1330650113) + ((~(iElapsedRealtime | (-278948717))) * 566);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i21 = INotificationSideChannel + 91;
                asInterface = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i23 = i14 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ~(System.identityHashCode(this) | (-645781029));
            int i28 = i24 + ((((-1194640257) + (((-890061199) | i27) * (-220))) + ((i27 | 40932896) * 220)) - 1516317562);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[2])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
            int i31 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iIndexOf4 = 23 - TextUtils.indexOf("", "");
            byte b5 = (byte) 37;
            Object[] objArr20 = new Object[1];
            c(b5, b5, $$a[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, i31, iIndexOf4, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int iResolveSize = 23 - View.resolveSize(0, 0);
                byte[] bArr6 = $$a;
                Object[] objArr21 = new Object[1];
                c((byte) (bArr6[1] + 1), (short) 89, bArr6[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, scrollDefaultDelay, iResolveSize, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i33 = ~i32;
            int i34 = (((-2048593179) + (((~((-51656304) | i33)) | (~(i32 | 160946122))) * 333)) + (((~(i32 | (-51656304))) | (~(i33 | 160946122))) * 333)) - 651157885;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{7, 24, '\f', 20, 22, 20, 20, 7, 11, 22, 17, 0, 21, 6, 14, 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{'\b', 22, '\n', '\b', 2, 6, 2, 3, '\f', 21, 17, 19, 23, 0, 3, 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 77), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-80735018};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 42049), TextUtils.lastIndexOf("", '0', 0) + 1727, (-16777187) - Color.rgb(0, 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -651157885, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                int size = View.MeasureSpec.getSize(0) + 1755;
                int iIndexOf5 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr7 = $$a;
                Object[] objArr26 = new Object[1];
                c((byte) (bArr7[1] + 1), (short) 89, bArr7[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel, size, iIndexOf5, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{20, 7, 24, '\r', 2, '\b', 24, 22, 1, 18, 20, 16, 1, 17, 3, 11, 15, 24, 23, 4, 0, 1}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step1).substring(2, 4).codePointAt(1) - 7), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 24, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{14, 23, 21, 7, 18, 11, 3, '\r', '\f', 23, 21, 4, '\t', 17, 13878}, (byte) (55 - TextUtils.getOffsetAfter("", 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_indosat_phone_number).substring(0, 20).length() - 5, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                    int i37 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i38 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    byte[] bArr8 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((byte) (bArr8[1] + 1), bArr8[7], bArr8[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout, i37, i38, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cGreen = (char) (29944 - Color.green(0));
                    int bitsPerPixel2 = 1754 - ImageFormat.getBitsPerPixel(0);
                    int i39 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                    byte b6 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    c(b6, b6, $$a[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cGreen, bitsPerPixel2, i39, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArrB$7879113[1])[0];
        int i41 = ((int[]) objArrB$7879113[0])[0];
        if (i41 == i40) {
            int i42 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int i43 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i44 = ~i43;
            int i45 = i42 + (((((~(301477528 | i44)) | (~((-514079955) | i43))) | (~(i44 | 514079954))) * 959) - 1955386694) + (((~(i43 | 514079954)) | (~(i44 | (-514079955))) | (~(301477528 | i43))) * 959);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrB$7879113[4];
        if (strArr5 != null) {
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
        int i48 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i49 = ~(Process.myPid() | 789682193);
        int i50 = i48 + (((-225710535) | i49) * (-658)) + 1956366827 + ((i49 | (-796236248)) * 658);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[3])[0] = i52 ^ (i52 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0092  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~((-537429381) | iIdentityHashCode);
            int i5 = ~iIdentityHashCode;
            if (i3 != (-1745625752) + ((i4 | (~(i5 | 1939734495))) * 920) + (((~((-572317573) | i5)) | 537429380) * 920) + (((~(iIdentityHashCode | 1939734495)) | (~((-537429381) | i5)) | (~((-34888193) | iIdentityHashCode))) * 920)) {
                int i6 = asInterface + 115;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                int[] iArr = new int[2094467291];
                iArr[2094467290] = 1;
                int i8 = (-1957600642) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i9 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            if (i9 != 1126804208 + (((~((-1376406297) | i10)) | 546418753) * (-756)) + (((~i10) | (-1376406297)) * 756)) {
                int i11 = asInterface + 115;
                INotificationSideChannel = i11 % 128;
                int i12 = i11 % 2;
                int[] iArr2 = new int[2094467291];
                iArr2[2094467290] = 1;
                int i13 = (-1957600642) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i14 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i15 = ~((int) Process.getStartElapsedRealtime());
        int i16 = (-564285268) | i15;
        if (i14 != 479161148 + (((~(i15 | (-1477750793))) | (~((-27265363) | i15))) * (-184)) + ((537019905 | (~i16) | (~((-2014770698) | i15))) * 184) + 2072480104) {
            throw null;
        }
        super.onResume();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i4 = (-596881108) + ((i3 | 537006722) * 988);
        int i5 = ~i3;
        if (i2 != i4 + (((~(814389195 | i5)) | (-1921759212)) * (-1976)) + (((~(i3 | 1644376738)) | 537006722 | (~((-1644376739) | i5))) * 988)) {
            throw null;
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(170037029);
        if (i6 != ((~((~iNextInt) | (-1091834899))) * 130) + 884231720 + (((~(iNextInt | (-1091834899))) | 606150920) * 130)) {
            int i7 = INotificationSideChannel + 13;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[720620676];
            iArr[720620675] = 1;
            int i9 = 184997772 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = asInterface + 37;
            INotificationSideChannel = i10 % 128;
            int i11 = i10 % 2;
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        if (i4 != 1592386536 + (((~((~i5) | (-277447989))) | 1107435531) * (-591)) + ((i5 | (-277447989)) * 591)) {
            throw new RuntimeException("-1452283398");
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i6 != 346024308 + (((~elapsedCpuTime) | 448808289) * 1324) + (((~(elapsedCpuTime | 1524684145)) | (~(1054371819 | elapsedCpuTime))) * (-1324)) + 716343868) {
            throw new RuntimeException("1510404199");
        }
        super.onCreate(bundle);
        int i7 = asInterface + 79;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            oldDaySecurityCheckRsjhtActivity.d_();
            return Unit.INSTANCE;
        }
        oldDaySecurityCheckRsjhtActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline TuitionPaymentFragmentspecialinlinedviewModeldefault3(final OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity) {
        int i = 2 % 2;
        lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline.Companion companion = lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline.INSTANCE;
        lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipelineTuitionPaymentFragmentbindingInflater1 = lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline.Companion.TuitionPaymentFragmentbindingInflater1(oldDaySecurityCheckRsjhtActivity.a, new Function1() { // from class: Camera2CapturePipelinePipeline2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (KpjRsjht) obj);
            }
        }, oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1);
        int i2 = INotificationSideChannel + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipelineTuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 13;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i4 = i3 + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            MultiStateView multiStateView = ((ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvCheckRsjht;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            str = "loading_jht_balance_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            MultiStateView multiStateView2 = ((ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvCheckRsjht;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            oldDaySecurityCheckRsjhtActivity.g = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list, "");
            oldDaySecurityCheckRsjhtActivity.a = new KpjParcelItem(list);
            str = "success_jht_balance_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            MultiStateView multiStateView3 = ((ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvCheckRsjht;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, oldDaySecurityCheckRsjhtActivity.getString(R.string.action_failed_get_rsjhtjp), null, new Pair(oldDaySecurityCheckRsjhtActivity.getString(R.string.action_retry), new Function0() { // from class: Camera2CapturePipelinePipelineExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (Unit) OldDaySecurityCheckRsjhtActivity.b(1256805484, -1256805483, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            }));
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = oldDaySecurityCheckRsjhtActivity.getString(R.string.action_failed_get_rsjhtjp);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = oldDaySecurityCheckRsjhtActivity.getString(R.string.action_retry);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_failed, "", string, string2, new Function0() { // from class: Camera2CapturePipelinePipelineExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }, oldDaySecurityCheckRsjhtActivity.getString(R.string.action_return), new Function0() { // from class: Camera2CapturePipelinePipeline1ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
                }
            });
            str = "failure_jht_balance_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_jht_balance_result", str));
        Intrinsics.checkNotNullParameter(oldDaySecurityCheckRsjhtActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            ((isModeInList) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return Unit.INSTANCE;
        }
        ((isModeInList) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i3 = 66 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity = (OldDaySecurityCheckRsjhtActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 77;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((isModeInList) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        ((isModeInList) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 117;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline = (lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline) oldDaySecurityCheckRsjhtActivity.d.getValue();
            FragmentManager supportFragmentManager = oldDaySecurityCheckRsjhtActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = INotificationSideChannel + 47;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.show(supportFragmentManager, lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i3 = 58 / 0;
                } else {
                    lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.show(supportFragmentManager, lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
            int i4 = INotificationSideChannel + 19;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity, KpjRsjht kpjRsjht) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kpjRsjht, "");
        ((ActivityOldDaySecurityCheckRsjhtBinding) ((ViewBinding) oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtChooseKpj.setText(kpjRsjht.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        oldDaySecurityCheckRsjhtActivity.TuitionPaymentFragmentbindingInflater1 = kpjRsjht;
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity) {
        return (Unit) b(-2067284592, 2067284595, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{oldDaySecurityCheckRsjhtActivity}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity) {
        return (Unit) b(1256805484, -1256805483, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{oldDaySecurityCheckRsjhtActivity}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static {
        notify = 0;
        g();
        INSTANCE = new Companion(null);
        int i = onTransact + 25;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_old_day_security_check_rsjht;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        b(-179762552, 179762554, TypeReference.Companion.TuitionPaymentFragmentbindingInflater1(), TypeReference.Companion.TuitionPaymentFragmentbindingInflater1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(244259065, -244259065, TypeReference.Companion.TuitionPaymentFragmentbindingInflater1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 928932193 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).codePointAt(5), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).length() + 80356454);
    }

    static void g() {
        asBinder = new char[]{60048, 60047, 60034, 60052, 60056, 60053, 60043, 60050, 60073, 60049, 60045, 60083, 60060, 60062, 60041, 60072, 60040, 60057, 60051, 60054, 60088, 60117, 60058, 60063, 60055};
        g = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        OldDaySecurityCheckRsjhtActivity oldDaySecurityCheckRsjhtActivity = (OldDaySecurityCheckRsjhtActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 39;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 89;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity.$$c
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r5 = 116 - r5
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r2
            r2 = r6
            goto L2b
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L25:
            r3 = r1[r5]
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r4
        L2b:
            int r6 = r6 + r5
            int r5 = r2 + 1
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity.$$i(short, byte, short):java.lang.String");
    }
}
