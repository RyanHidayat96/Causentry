package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.android.volley.toolbox.HttpHeaderParser;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.GetRsJhtRequest;
import com.bpjstku.data.jht.model.request.SendRsJhtRequest;
import com.bpjstku.databinding.ActivityClaimOldDaySecurityViewBalanceJhtBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isModeInList;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.updateSession;
import java.io.InputStream;
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
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\t\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0015\u0010\b\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\n\u001a\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010&R\u0015\u0010)\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityViewBalanceJhtActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimOldDaySecurityViewBalanceJhtBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "Lcom/bpjstku/domain/user/model/User;", "onTransact", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/io/InputStream;", "d", "Ljava/io/InputStream;", "LupdateSession;", "LupdateSession;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "g", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LgetStringOrNull;", "LgetStringOrNull;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "cancelAll", "LisModeInList;", "cancel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimOldDaySecurityViewBalanceJhtActivity extends BindingBaseActivity<ActivityClaimOldDaySecurityViewBalanceJhtBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy cancel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private getStringOrNull d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private updateSession TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: Camera2CapturePipelineAePreCaptureTask
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private static final byte[] $$a = {7, 15, 25, 25, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 34;
    private static int cancel = 0;
    private static int notify = 0;
    private static int cancelAll = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = i8 | i2;
        int i10 = (~(i7 | i8)) | (~(i7 | i2)) | (~i9);
        int i11 = ~i2;
        int i12 = (~(i3 | i11 | i6)) | (~(i7 | i11 | i8)) | (~(i9 | i6));
        int i13 = ~(i8 | i11 | i6);
        int i14 = i2 + i6 + i5 + ((-973178360) * i) + (1542423572 * i4);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i2) - 1073741824) + ((-187520530) * i6) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i5) + (1207959552 * i) + ((-1275068416) * i4) + (196542464 * i15);
        int i17 = (i2 * (-490823948)) + 944362368 + (i6 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i5 * (-490822951)) + (i * 2145288392) + (i4 * 779328756) + (i15 * (-1138819072));
        int i18 = i16 + (i17 * i17 * 1440284672);
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 == 3) {
            final ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity = (ClaimOldDaySecurityViewBalanceJhtActivity) objArr[0];
            int i19 = 2 % 2;
            ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity2 = claimOldDaySecurityViewBalanceJhtActivity;
            ((isModeInList) claimOldDaySecurityViewBalanceJhtActivity.cancel.getValue()).b.observe(claimOldDaySecurityViewBalanceJhtActivity2, new Observer() { // from class: Camera2CapturePipelineExternalSyntheticLambda0
                @Override // androidx.p002lifecycle.Observer
                public final void onChanged(Object obj) {
                    ClaimOldDaySecurityViewBalanceJhtActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
                }
            });
            ((isModeInList) claimOldDaySecurityViewBalanceJhtActivity.cancel.getValue()).d.observe(claimOldDaySecurityViewBalanceJhtActivity2, new Observer() { // from class: createPipeline
                @Override // androidx.p002lifecycle.Observer
                public final void onChanged(Object obj) {
                    ClaimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
                }
            });
            int i20 = cancelAll + 117;
            notify = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity3 = (ClaimOldDaySecurityViewBalanceJhtActivity) objArr[0];
        int i22 = 2 % 2;
        int i23 = notify + 51;
        cancelAll = i23 % 128;
        int i24 = i23 % 2;
        int i25 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i26 = ~(((int) SystemClock.elapsedRealtime()) | 347563243);
        if (i25 != (((-1385732906) | i26) * (-658)) + 2076729292 + ((i26 | (-1455423468)) * 658)) {
            int i27 = (-554531098) % 2;
            throw new ArithmeticException();
        }
        int i28 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i28 != (-238692436) + ((~((~iElapsedRealtime) | (-1715912965))) * (-116)) + ((135333609 | iElapsedRealtime) * 116) + (((~(iElapsedRealtime | 1851244940)) | 1633) * 116)) {
            int i29 = (-2026654884) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i30 = cancelAll + 81;
        notify = i30 % 128;
        int i31 = i30 % 2;
        return null;
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
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity.$$a
            int r1 = r7 + 1
            int r6 = 145 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L29:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ActivityClaimOldDaySecurityViewBalanceJhtBinding TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 27;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ActivityClaimOldDaySecurityViewBalanceJhtBinding activityClaimOldDaySecurityViewBalanceJhtBinding = (ActivityClaimOldDaySecurityViewBalanceJhtBinding) ((ViewBinding) claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = cancelAll + 71;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return activityClaimOldDaySecurityViewBalanceJhtBinding;
    }

    public static final /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity) {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 125;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        InputStream inputStream = claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 93;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return inputStream;
    }

    public static final /* synthetic */ updateSession TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity) {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 113;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        updateSession updatesession = claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 71;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return updatesession;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity, String str) {
        int i = 2 % 2;
        int i2 = notify + 107;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = claimOldDaySecurityViewBalanceJhtActivity.getString(R.string.action_failed_get_rsjhtjp);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = claimOldDaySecurityViewBalanceJhtActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str, string, string2, null, 112);
        FragmentManager supportFragmentManager = claimOldDaySecurityViewBalanceJhtActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        getstringornullB.INotificationSideChannel = claimOldDaySecurityViewBalanceJhtActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = cancelAll + 43;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    public ClaimOldDaySecurityViewBalanceJhtActivity() {
        final ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity = this;
        this.a = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = claimOldDaySecurityViewBalanceJhtActivity;
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
        final ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity2 = this;
        this.cancel = LazyKt.lazy(new Function0<isModeInList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [isModeInList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final isModeInList invoke() {
                ComponentCallbacks componentCallbacks = claimOldDaySecurityViewBalanceJhtActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(isModeInList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityViewBalanceJhtActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityViewBalanceJhtActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1, String p2, String p3, String p4) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ClaimOldDaySecurityViewBalanceJhtActivity.class, new Pair[]{TuplesKt.to("kpj", p1), TuplesKt.to("company_code", p2), TuplesKt.to("segment_code", p3), TuplesKt.to("divition_code", p4)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 23;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ClaimOldDaySecurityViewBalanceJhtActivity$bindingInflater$1 claimOldDaySecurityViewBalanceJhtActivity$bindingInflater$1 = ClaimOldDaySecurityViewBalanceJhtActivity$bindingInflater$1.b;
        int i4 = cancelAll + 99;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return claimOldDaySecurityViewBalanceJhtActivity$bindingInflater$1;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 85;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getMode(0) + 19472), TextUtils.getCapsMode("", 0, 0) + 2624, 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (INotificationSideChannel ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 39422), 481 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 9;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 9;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.indexOf("", "") + 481, 38 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i9 = 35 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 39422), ((Process.getThreadPriority(0) + 20) >> 6) + 481, 38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityClaimOldDaySecurityViewBalanceJhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSendEmail;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: waitForResult
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimOldDaySecurityViewBalanceJhtActivity.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        int i2 = cancelAll + 7;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("kpj");
        if (stringExtra == null) {
            int i2 = cancelAll + 73;
            notify = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.b = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("company_code");
        if (stringExtra2 == null) {
            int i4 = cancelAll + 109;
            notify = i4 % 128;
            int i5 = i4 % 2;
            stringExtra2 = "";
        }
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("segment_code");
        if (stringExtra3 == null) {
            int i6 = cancelAll + 3;
            notify = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 22 / 0;
            }
            stringExtra3 = "";
        }
        this.g = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("divition_code");
        this.asInterface = stringExtra4 != null ? stringExtra4 : "";
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ClaimOldDaySecurityViewBalanceJhtActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ClaimOldDaySecurityViewBalanceJhtActivity.this.d_();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        int i2 = cancelAll + 39;
        notify = i2 % 128;
        int i3 = i2 % 2;
        final isModeInList ismodeinlist = (isModeInList) this.cancel.getValue();
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String strValueOf = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        String str5 = this.TuitionPaymentFragmentbindingInflater1;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        } else {
            str = str5;
        }
        String str6 = this.g;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        } else {
            str2 = str6;
        }
        String str7 = this.b;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        } else {
            str3 = str7;
        }
        String str8 = this.asInterface;
        if (str8 == null) {
            int i4 = cancelAll + 31;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        } else {
            str4 = str8;
        }
        GetRsJhtRequest getRsJhtRequest = new GetRsJhtRequest(strValueOf, str, str2, str3, str4);
        Intrinsics.checkNotNullParameter(getRsJhtRequest, "");
        MutableLiveData<VirtualCameraAdapter1<InputStream>> mutableLiveData = ismodeinlist.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(ismodeinlist.f1223a.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getRsJhtRequest)));
        final Function1 function1 = new Function1() { // from class: lambdaclearInteropConfig1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ismodeinlist, (InputStream) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: lambdawaitForSessionUpdateId2
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: waitForSessionUpdateId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ismodeinlist, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isSessionUpdated
            private static final byte[] $$c = {21, -108, 100, 114};
            private static final int $$d = 69;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 55;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {20670, 8408, 45161, 406, 37140, 25275, 62157, 16942, 54264, 41757, 13547, 33807, 5194, 58873, 29973, 50845, 22050, 9829, 47057, 1915, 39048, 26665, 45561, 49561, 20783, 57559, 28747, 33780, 5006, 41745, 12977, 16972, 54762, 25963, 62745, 1188, 37959, 11285, 23671, 52443, 32037, 60917, 7710, 36456, 16078, 44880, 57312, 18486, 63621, 26848, 39262, 2468, 47669, 2057, 30829, 59607, 22837, 51632, 14852, 43618, 6854, 35680, 64432, 27657, 56459, 19663, 48474, 11706, 40482};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6370197151023578635L;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.isSessionUpdated.$$a
                    int r8 = 92 - r8
                    int r6 = r6 * 15
                    int r6 = 53 - r6
                    int r7 = r7 * 2
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L29
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                L29:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.isSessionUpdated.a(byte, short, byte, java.lang.Object[]):void");
            }

            private static void c(int i5, int i6, char c, Object[] objArr) throws Throwable {
                int i7 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i6];
                int i8 = 0;
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i6) {
                    int i9 = $10 + 79;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i8] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5 + i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", i8, i8);
                            int i12 = 2188 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 41;
                            byte b2 = (byte) 2;
                            byte b3 = (byte) (b2 - 2);
                            String str$$e = $$e(b2, b3, b3);
                            Class[] clsArr = new Class[1];
                            clsArr[i8] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i12, packedPositionChild, 841711447, false, str$$e, clsArr);
                        }
                        try {
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i11), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 33017), TextUtils.getTrimmedLength("") + 3011, 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i11] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            try {
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cMyTid = (char) (36505 - (Process.myTid() >> 22));
                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3376;
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 17;
                                    byte b6 = (byte) ($$d & 3);
                                    byte b7 = (byte) (b6 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, jumpTapTimeout, iKeyCodeFromString, -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                i8 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                char[] cArr = new char[i6];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i6) {
                    int i13 = $10 + 11;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 36505);
                        int i15 = 3376 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int scrollDefaultDelay = 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b8 = (byte) ($$d & 3);
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, i15, scrollDefaultDelay, -968507904, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr);
                int i16 = $10 + 17;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }

            @Override // defpackage.logToString
            public final void accept(Object obj) throws Throwable {
                Object[] objArr;
                int i5 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                    int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
                    byte[] bArr = $$a;
                    byte b2 = bArr[28];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 | 89), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, modifierMetaStateMask, iIndexOf, 986134021, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(View.getDefaultSize(0, 0), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (57667 - View.resolveSize(0, 0)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), MotionEvent.axisFromString("") + 16, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                    int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, (byte) (b5 | 52), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, scrollDefaultDelay, 1596667560, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i6 = b + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                    int i7 = i6 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                        int gidForName = 22 - Process.getGidForName("");
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, b7, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, keyRepeatTimeout, gidForName, 1599039318, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                    int iMyPid = Process.myPid();
                    int i8 = (~((-355752044) | iMyPid)) | 355733578;
                    int i9 = 2135982025 + (i8 * 992) + ((i8 | (~((~iMyPid) | (-143131153)))) * (-496)) + ((iMyPid | (-143149618)) * 496) + 261582197;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(Color.green(0) + 37, 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (40419 - TextUtils.getOffsetAfter("", 0)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(53 - (ViewConfiguration.getFadingEdgeLength() >> 16), 16 - (Process.myTid() >> 22), (char) (47611 - MotionEvent.axisFromString("")), objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr10 = {389700676};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42049), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1725, 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 261582197);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char modifierMetaStateMask2 = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr11 = new Object[1];
                            a(b8, b9, b9, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask2, packedPositionGroup, edgeSlop, 1599039318, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                        try {
                            Object[] objArr12 = new Object[1];
                            c((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), 21 - MotionEvent.axisFromString(""), (char) (TextUtils.getOffsetBefore("", 0) + 57667), objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, (char) Color.red(0), objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cGreen = (char) (Color.green(0) + 29944);
                                int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0, 0);
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr14 = new Object[1];
                                a(b10, b11, (byte) (b11 | 52), objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, iIndexOf2, packedPositionType, 1596667560, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                                int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                                int iMyTid = (Process.myTid() >> 22) + 23;
                                byte[] bArr2 = $$a;
                                byte b12 = bArr2[28];
                                byte b13 = bArr2[7];
                                Object[] objArr15 = new Object[1];
                                a(b12, b13, (byte) (b13 | 89), objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i12, iMyTid, 986134021, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                            objArr = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
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
                int i13 = ((int[]) objArr[1])[0];
                int i14 = ((int[]) objArr[0])[0];
                if (i14 == i13) {
                    int i15 = ((int[]) objArr[3])[0];
                    Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i16 = i15 + (-856254480) + (((~(iIdentityHashCode | (-210303808))) | (-422906234)) * (-465)) + (((-210303808) | (~((-422906234) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-134220090)) * 465);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr16[3])[0] = i18 ^ (i18 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i19 = b + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                        int i20 = i19 % 2;
                        for (String str9 : strArr) {
                            arrayList.add(str9);
                        }
                    }
                    Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                    int i21 = ((int[]) objArr[3])[0];
                    Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                    int iNextInt = new Random().nextInt(1832875719);
                    int i22 = ~iNextInt;
                    int i23 = i21 + ((((~(i22 | 197360517)) | ((~((-15241909) | i22)) | 2654256)) * (-397)) - 127780948) + ((iNextInt | 187427121) * 397);
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr17[3])[0] = i25 ^ (i25 << 5);
                    int i26 = b + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                    int i27 = i26 % 2;
                }
                function2.invoke(obj);
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                b = i28 % 128;
                if (i28 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, byte r7, int r8) {
                /*
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    int r7 = r7 * 2
                    int r0 = r7 + 1
                    int r6 = r6 * 3
                    int r6 = 115 - r6
                    byte[] r1 = defpackage.isSessionUpdated.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r4 = r7
                    r6 = r8
                    r3 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1b:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r6 = r6 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L28:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                L2c:
                    int r4 = -r4
                    int r8 = r8 + r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.isSessionUpdated.$$e(int, byte, int):java.lang.String");
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        ismodeinlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity = this;
        Intrinsics.checkNotNullParameter(claimOldDaySecurityViewBalanceJhtActivity, "");
        claimOldDaySecurityViewBalanceJhtActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityClaimOldDaySecurityViewBalanceJhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityClaimOldDaySecurityViewBalanceJhtBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.title_info_rjhst));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new updateSession(this);
        int i2 = cancelAll + 85;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 107;
        notify = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = notify + 49;
                cancelAll = i3 % 128;
                if (i3 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity = (ClaimOldDaySecurityViewBalanceJhtActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 63;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        updateSession updatesession = claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj = null;
        if (updatesession == null) {
            int i4 = notify + 109;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            updatesession = null;
        }
        updatesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
            int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr2 = new Object[1];
            c((short) 141, (byte) 52, $$a[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, deadChar, fadingEdgeLength, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{21399, 10703, 42812, 15489, 47813, 12332, 36248, 3001, 33057, 7818, 38078, 4632, 61339, 26094, 58176, 30858, 63211, 19570, 51588, 18412, 56665, 23230}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 31221, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{21395, 54617, 24081, 51151, 18569, 62044, 31488, 64753, 25995, 61260, 4100, 39395, 699, 33916, 3385}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 34463, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i3 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
            Object[] objArr5 = new Object[1];
            c((short) 89, (byte) 52, $$a[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i3, longPressTimeout, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i4 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                short s = (short) ($$b + 3);
                byte b = $$a[7];
                Object[] objArr6 = new Object[1];
                c(s, b, b, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, edgeSlop, i4, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-1068530437) + (((~((-205944413) | iIdentityHashCode)) | 138698820) * (-140)) + ((~((-67245593) | iIdentityHashCode)) * 70) + (((~(iIdentityHashCode | 450224582)) | (-378771355)) * 70) + 1500972749;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{21404, 23308, 17078, 19014, 29108, 30877, 24629, 28581, 5961, 7851, 1451, 3366, 13505, 15453, 11241, 53902}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2167, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{21407, 33129, 63077, 11113, 6254, 19832, 41568, 38738, 50278, 14660, 28235, 17239, 45169, 58662, 55848, 3878}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).codePointAt(0) + 53914, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {436586957};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), TextUtils.indexOf("", "") + 1134, 18 - Color.green(0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1500972749, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                    int iMyTid = (Process.myTid() >> 22) + 15;
                    Object[] objArr12 = new Object[1];
                    c((short) 141, (byte) 52, $$a[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, iLastIndexOf, iMyTid, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45992), Color.green(0) + 1117, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRed = (char) Color.red(0);
                    int iAlpha = Color.alpha(0) + 1031;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                    short s2 = (short) ($$b + 3);
                    byte b2 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c(s2, b2, b2, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iAlpha, scrollBarFadeDuration, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{21399, 10703, 42812, 15489, 47813, 12332, 36248, 3001, 33057, 7818, 38078, 4632, 61339, 26094, 58176, 30858, 63211, 19570, 51588, 18412, 56665, 23230}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_unable_to_decrypt_message).substring(0, 26).length() + 31293, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{21395, 54617, 24081, 51151, 18569, 62044, 31488, 64753, 25995, 61260, 4100, 39395, 699, 33916, 3385}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34488, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cBlue = (char) Color.blue(0);
                        int iGreen = 1031 - Color.green(0);
                        int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
                        Object[] objArr16 = new Object[1];
                        c((short) 89, (byte) 52, $$a[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue, iGreen, i10, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                        int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0);
                        Object[] objArr17 = new Object[1];
                        c((short) 141, (byte) 52, $$a[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, packedPositionType, iLastIndexOf2, 1357589585, false, (String) objArr17[0], null);
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
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i16 = ~System.identityHashCode(this);
        int i17 = i13 + ((((-1753597967) + (((~(i16 | (-153878561))) | (~((-4327490) | i16))) * (-184))) + (((43037060 | (~((-47364550) | i16))) | (~((-196915621) | i16))) * 184)) - 1625973608);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr18[2])[0] = i19 ^ (i19 << 5);
        int i20 = cancelAll + 79;
        notify = i20 % 128;
        int i21 = i20 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int scrollBarSize2 = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i22 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
            short s3 = (short) ($$b + 3);
            Object[] objArr19 = new Object[1];
            c(s3, (byte) s3, $$a[132], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, scrollBarSize2, i22, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                int size2 = View.MeasureSpec.getSize(0) + 1755;
                int i23 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr20 = new Object[1];
                c((short) 89, (byte) 52, $$a[132], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType2, size2, i23, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i24 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{i24}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 556279638;
            int i25 = ~length;
            int i26 = (((1837007473 + (((~((-20276315) | i25)) | 192326111) * (-602))) + ((((~(length | (-20276315))) | 20193370) | (~(192409055 | i25))) * (-301))) + ((~(i25 | 192326111)) * 301)) - 2004135250;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{21404, 23308, 17078, 19014, 29108, 30877, 24629, 28581, 5961, 7851, 1451, 3366, 13505, 15453, 11241, 53902}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2167, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{21407, 33129, 63077, 11113, 6254, 19832, 41568, 38738, 50278, 14660, 28235, 17239, 45169, 58662, 55848, 3878}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_sdk_invalid).substring(14, 23).codePointAt(1) + 53912, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {436586957};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "") + 1726, 29 - Color.blue(0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -2004135250);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int iMyPid = 1755 - (Process.myPid() >> 22);
                int iGreen2 = 23 - Color.green(0);
                Object[] objArr25 = new Object[1];
                c((short) 89, (byte) 52, $$a[132], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyPid, iMyPid, iGreen2, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{21399, 10703, 42812, 15489, 47813, 12332, 36248, 3001, 33057, 7818, 38078, 4632, 61339, 26094, 58176, 30858, 63211, 19570, 51588, 18412, 56665, 23230}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 31283, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{21395, 54617, 24081, 51151, 18569, 62044, 31488, 64753, 25995, 61260, 4100, 39395, 699, 33916, 3385}, 34499 - TextUtils.indexOf("", "", 0), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                    int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                    int gidForName2 = 22 - Process.getGidForName("");
                    byte[] bArr = $$a;
                    short s4 = bArr[7];
                    Object[] objArr28 = new Object[1];
                    c(s4, (byte) (s4 | 52), bArr[132], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetBefore, maxKeyCode, gidForName2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                    int iRed = 1755 - Color.red(0);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
                    short s5 = (short) ($$b + 3);
                    Object[] objArr29 = new Object[1];
                    c(s5, (byte) s5, $$a[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState, iRed, iIndexOf, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i29 = cancelAll + 121;
        notify = i29 % 128;
        int i30 = i29 % 2;
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i32}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i33 = i31 + 501154002 + ((~((~iIdentityHashCode2) | (-33763369))) * 433) + (((~(42151982 | iIdentityHashCode2)) | (-254754409)) * (-433)) + (((~(iIdentityHashCode2 | (-254754409))) | 8388614) * 433);
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr30[3])[0] = i35 ^ (i35 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ~(((int) Runtime.getRuntime().freeMemory()) | (-1025175737));
        if (i4 != (-1926033668) + (((-195188194) | i5) * (-220)) + ((i5 | 874029080) * 220) + 2091447124) {
            throw null;
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~((~new Random().nextInt()) | 527891355);
        if (i6 != (((87339546 | i7) * (-374)) - 673311518) + ((i7 | 440551809) * 374)) {
            throw new RuntimeException("1386680656");
        }
        super.onResume();
        int i8 = cancelAll + 111;
        notify = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 107;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-1762987842) + (((~((-8939842) | iIdentityHashCode)) | (~((-838927385) | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | (-906200123))) | (~((-76212580) | iIdentityHashCode)) | 67272738) * (-69)) + 1279851924) {
            int i5 = (-1266300016) % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i6 != (-238692436) + ((~((~startUptimeMillis) | (-1879653029))) * (-116)) + ((266519891 | startUptimeMillis) * 116) + (((~(startUptimeMillis | 1982431222)) | 163741697) * 116)) {
            throw new RuntimeException("-904077986");
        }
        super.onCreate(bundle);
        int i7 = cancelAll + 111;
        notify = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ Unit b(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity) {
        String str;
        int i = 2 % 2;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_send_to_email_rsjht", "send_to_email_rsjht"));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityViewBalanceJhtActivity, "");
        Intrinsics.checkNotNullParameter("send_to_email_rsjht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("send_to_email_rsjht", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("send_to_email_rsjht", mapMutableMapOf);
        final isModeInList ismodeinlist = (isModeInList) claimOldDaySecurityViewBalanceJhtActivity.cancel.getValue();
        User user = (User) claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (user != null) {
            int i2 = cancelAll + 65;
            notify = i2 % 128;
            int i3 = i2 % 2;
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = cancelAll + 51;
            notify = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        String str2 = claimOldDaySecurityViewBalanceJhtActivity.b;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        SendRsJhtRequest sendRsJhtRequest = new SendRsJhtRequest(strValueOf, str2);
        Intrinsics.checkNotNullParameter(sendRsJhtRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = ismodeinlist.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(ismodeinlist.f1223a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendRsJhtRequest)));
        final Function1 function1 = new Function1() { // from class: decrementVideoUsage
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ismodeinlist, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: decrementUseCount
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getSupportedAeMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.TuitionPaymentFragmentbindingInflater1(ismodeinlist, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: addSessionCameraCaptureCallback
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        ismodeinlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i6 = notify + 9;
        cancelAll = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void b(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = cancelAll + 75;
        notify = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            claimOldDaySecurityViewBalanceJhtActivity.MediaBrowserCompat();
            int i4 = notify + 119;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            str = "loading_view_rsjht";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            claimOldDaySecurityViewBalanceJhtActivity.IconCompatParcelizer();
            claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (InputStream) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(claimOldDaySecurityViewBalanceJhtActivity), null, null, new ClaimOldDaySecurityViewBalanceJhtActivity$showRsjht$1(claimOldDaySecurityViewBalanceJhtActivity, null), 3, null);
            str = "success_view_rsjht";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            claimOldDaySecurityViewBalanceJhtActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = claimOldDaySecurityViewBalanceJhtActivity.getString(R.string.action_failed_get_rsjhtjp);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = claimOldDaySecurityViewBalanceJhtActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, strValueOf, string, string2, null, 112);
            FragmentManager supportFragmentManager = claimOldDaySecurityViewBalanceJhtActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            getstringornullB.INotificationSideChannel = claimOldDaySecurityViewBalanceJhtActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            str = "failure_view_rsjht";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_rsjht_result", str));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityViewBalanceJhtActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = cancelAll + 55;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            claimOldDaySecurityViewBalanceJhtActivity.MediaBrowserCompat();
            str = "loading_send_email_rsjht";
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                claimOldDaySecurityViewBalanceJhtActivity.IconCompatParcelizer();
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                User user = (User) claimOldDaySecurityViewBalanceJhtActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (user != null) {
                    str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i5 = cancelAll + 77;
                    notify = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    str2 = null;
                }
                StringBuilder sb = new StringBuilder("Rincian Saldo JHT & JP Anda telah dikirim ke email ");
                sb.append(str2);
                sb.append(" ");
                String string = sb.toString();
                String string2 = claimOldDaySecurityViewBalanceJhtActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, "", string, string2, null, 112);
                claimOldDaySecurityViewBalanceJhtActivity.d = getstringornullB;
                if (getstringornullB != null) {
                    int i7 = notify + 105;
                    cancelAll = i7 % 128;
                    if (i7 % 2 == 0) {
                        FragmentManager supportFragmentManager = claimOldDaySecurityViewBalanceJhtActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        obj.hashCode();
                        throw null;
                    }
                    FragmentManager supportFragmentManager2 = claimOldDaySecurityViewBalanceJhtActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                str = "success_send_email_rsjht";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i8 = i3 + 41;
                cancelAll = i8 % 128;
                int i9 = i8 % 2;
                claimOldDaySecurityViewBalanceJhtActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityViewBalanceJhtActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                str = "failure_send_email_rsjht";
            } else {
                str = "";
            }
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_send_email_rsjht_result", str));
        Intrinsics.checkNotNullParameter(claimOldDaySecurityViewBalanceJhtActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityViewBalanceJhtActivity claimOldDaySecurityViewBalanceJhtActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 117;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) claimOldDaySecurityViewBalanceJhtActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) claimOldDaySecurityViewBalanceJhtActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getInterfaceDescriptor = 1;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 91;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimOldDaySecurityViewBalanceJhtBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentbindingInflater1 = HttpHeaderParser.TuitionPaymentFragmentbindingInflater1();
        int iB = zzn.b();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzn.b(), new Object[]{this}, 750703310, iTuitionPaymentFragmentbindingInflater1, (-472078728) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), iB, -750703309);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 11;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_claim_old_day_security_view_balance_jht;
        }
        int i3 = 71 / 0;
        return R.layout.activity_claim_old_day_security_view_balance_jht;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzn.b(), new Object[]{this}, 182006341, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_network_not_available).substring(0, 23).codePointAt(14) - 1088945715, zzn.b(), HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), -182006338);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = HttpHeaderParser.TuitionPaymentFragmentbindingInflater1();
        int iB = zzn.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzn.b(), new Object[]{this}, 158595262, iTuitionPaymentFragmentbindingInflater1, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), iB, -158595260);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 936003833, new Object[]{this}, 2032864756, (-1973124180) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_4).substring(1, 2).codePointAt(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.try_again).substring(6, 7).codePointAt(0) - 2034035600, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), -2032864756);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 11;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 31;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    static void g() {
        INotificationSideChannel = 3542198501082725101L;
    }
}
