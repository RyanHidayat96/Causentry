package com.bpjstku.presentation.complaint;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityComplaintHistoryBinding;
import com.bpjstku.domain.complaint.model.ComplaintHistory;
import com.bpjstku.presentation.complaint.ComplaintHistoryActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_face.zznv;
import com.google.android.gms.tasks.zzu;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addStateSet;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onBackPressedDispatcher_delegatelambda010;
import defpackage.onCaptureSessionEnd;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setHotspot;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0015\u0010\u0012\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\rR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/complaint/ComplaintHistoryActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityComplaintHistoryBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LaddStateSet;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Z", "LsetHotspot;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComplaintHistoryActivity extends BindingBaseActivity<ActivityComplaintHistoryBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char asBinder;
    private static char asInterface;
    private static char g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: mutate
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });
    private boolean b;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {5, 11, -122, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 53;
    private static int notify = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f476a = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = (~(i7 | i10)) | (~(i8 | i4 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = i4 + i2 + i6 + ((-1255669517) * i) + (533247121 * i3);
        int i14 = i13 * i13;
        int i15 = ((i4 * (-1895547823)) - 858849280) + ((-1895547823) * i2) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i6) + (760610816 * i) + ((-1057882112) * i3) + (1344208896 * i14);
        int i16 = ((i4 * (-122328301)) - 2132886715) + (i2 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i6 * (-122328029)) + ((-1196579527) * i) + (i3 * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        if (i17 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 != 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        ComplaintHistoryActivity complaintHistoryActivity = (ComplaintHistoryActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i18 = 2 % 2;
        int i19 = d + 95;
        f476a = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            if (i20 != (-1928845608) + (((~((-1107370202) | iUptimeMillis)) | 277382658) * (-756)) + (((~iUptimeMillis) | (-1107370202)) * 756)) {
                throw null;
            }
        } else {
            int i21 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i22 = ~i;
            if (i21 != 1679164088 + (((~(1432976815 | i22)) | (~((-602989273) | i))) * 1900) + (((~(i22 | 602989272)) | (~(i | (-1432976816)))) * (-950)) + (((~(i | 602989272)) | (~(i22 | (-1432976816)))) * 950)) {
                throw null;
            }
        }
        int i23 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i24 = (int) Runtime.getRuntime().totalMemory();
        if (i23 != 836861340 + (((~((-2041966594) | i24)) | 287649792) * (-140)) + ((~((-1754316802) | i24)) * 70) + (((~(i24 | 326055262)) | (-1792722272)) * 70)) {
            int i25 = 1406743662 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i26 = f476a + 79;
        d = i26 % 128;
        int i27 = i26 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.complaint.ComplaintHistoryActivity.$$a
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ComplaintHistoryActivity.c(short, short, short, java.lang.Object[]):void");
    }

    public ComplaintHistoryActivity() {
        final ComplaintHistoryActivity complaintHistoryActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<addStateSet>() { // from class: com.bpjstku.presentation.complaint.ComplaintHistoryActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [addStateSet, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ addStateSet invoke() {
                LifecycleOwner lifecycleOwner = complaintHistoryActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(addStateSet.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.complaint.ComplaintHistoryActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/complaint/ComplaintHistoryActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ComplaintHistoryActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityComplaintHistoryBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 75;
        f476a = i2 % 128;
        int i3 = i2 % 2;
        ComplaintHistoryActivity$bindingInflater$1 complaintHistoryActivity$bindingInflater$1 = ComplaintHistoryActivity$bindingInflater$1.b;
        int i4 = f476a + 1;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return complaintHistoryActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: onStateChange
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        ((ActivityComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlComplaintHistory.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: setVisible
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                ComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        int i2 = d + 11;
        f476a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((addStateSet) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(this, new Observer() { // from class: AnimatedStateListDrawableCompat1
            private static short[] g;
            private static final byte[] $$c = {49, 84, -120, 101};
            private static final int $$f = 200;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {55, -64, 35, -71, -2, 21, -2, 11, 6, 23, 8, -28, 46, 11, 14, 8, -24, 43, 6, -3, 4, 11, 11, -42, 56, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -26, 42, 10, 4, 29, 0, 17, -24, 43, 6, -3, 4, 11, 11, -12, 43, 6, -3, 11, 23, 9, 5, 12, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
            private static final int $$e = 246;
            private static final byte[] $$a = {25, -93, -120, -48, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 225;
            private static int asBinder = 0;
            private static int d = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1895981653;
            private static int TuitionPaymentFragmentbindingInflater1 = -1934795566;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 966327771;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {4, 5, 41, 56, -30, 87, 5, 42, 58, 51, -25, -26, 112, 57, -6, 67, 48, 51, 62, 15, 55, 14, Base64.padSymbol, 118, 122, 107, 70, 69, 114, 77, 96, 113, 108, 125, 65, 107, 121, 0, -39, -34, -55, -96, -74, -15, -89, -95, -55, -81, -41, -85, -72, -87, 28, -38, -83, -119, -32, -47, -48, -33, -84, -44, -81, 56, 123, 66, 117, 87, 122, 126, 125, 124, 120, 43, -115, 66, 65, 119, 120, 125, 86, 58, -71, -82, -66, -73, -101, -102, -8, -74, -126, -86, 115, -62, -92, -118, -88, 58, -108, ByteCompanionObject.MIN_VALUE, 123, -86, ByteCompanionObject.MIN_VALUE, 101, 108, -90, -112, -102, ByteCompanionObject.MIN_VALUE, -111, -100, -108, -118};

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r7, short r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 + 1
                    int r7 = r7 * 14
                    int r7 = r7 + 84
                    int r9 = r9 + 4
                    byte[] r0 = defpackage.AnimatedStateListDrawableCompat1.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r9
                    r4 = r2
                    goto L29
                L12:
                    r3 = r2
                L13:
                    int r9 = r9 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L24
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
                    int r7 = r7 + r9
                    int r7 = r7 + (-10)
                    r9 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AnimatedStateListDrawableCompat1.a(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(short r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.AnimatedStateListDrawableCompat1.$$d
                    int r6 = r6 + 4
                    int r8 = r8 * 24
                    int r8 = 108 - r8
                    int r7 = r7 * 34
                    int r1 = 72 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 71 - r7
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1b:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L2a:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                L2e:
                    int r6 = r6 + r3
                    int r6 = r6 + (-9)
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AnimatedStateListDrawableCompat1.e(short, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0087 A[PHI: r4
  0x0087: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v20 byte[]) binds: [B:19:0x0085, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:22:0x008d  */
            /* JADX WARN: Code duplicated, block: B:25:0x00a0 A[Catch: all -> 0x02bd, TryCatch #0 {all -> 0x02bd, blocks: (B:3:0x000f, B:6:0x002a, B:7:0x005b, B:31:0x00f0, B:33:0x0107, B:34:0x013b, B:40:0x018e, B:42:0x01ab, B:43:0x01f2, B:23:0x008f, B:25:0x00a0, B:26:0x00d1), top: B:74:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:58:0x024a  */
            private static void c(int i2, int i3, short s, byte b, int i4, Object[] objArr) throws Throwable {
                long j;
                boolean z;
                byte[] bArr;
                int length;
                byte[] bArr2;
                int i5;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iIndexOf = 2267 - TextUtils.indexOf("", "", 0);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                        byte length2 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, iIndexOf, doubleTapTimeout, 1387473586, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2)).intValue();
                    int i7 = iIntValue == -1 ? 1 : 0;
                    if (i7 != 0) {
                        int i8 = $10 + 89;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i9 = 76 / 0;
                            if (bArr != null) {
                                length = bArr.length;
                                bArr2 = new byte[length];
                                for (i5 = 0; i5 < length; i5++) {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i5])};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3358 - TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 18, -1054011043, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i5] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).byteValue();
                                }
                                bArr = bArr2;
                            }
                        } else {
                            bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (bArr != null) {
                                length = bArr.length;
                                bArr2 = new byte[length];
                                while (i5 < length) {
                                    Object[] objArr4 = {Integer.valueOf(bArr[i5])};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3358 - TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i5] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).byteValue();
                                }
                                bArr = bArr2;
                            }
                        }
                        if (bArr != null) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr5 = {Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int iArgb = Color.argb(0, 0, 0, 0) + 2267;
                                int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iArgb, i10, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                            j = 3046761265686732006L;
                        } else {
                            j = 3046761265686732006L;
                            iIntValue = (short) (((short) (((long) g[i4 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        }
                    } else {
                        j = 3046761265686732006L;
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i4 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + i7;
                        Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - Color.argb(0, 0, 0, 0)), 2855 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1529949196, false, $$g(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (bArr4 != null) {
                            int length4 = bArr4.length;
                            byte[] bArr5 = new byte[length4];
                            int i11 = 0;
                            while (i11 < length4) {
                                int i12 = $11 + 41;
                                $10 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    bArr5[i11] = (byte) (((long) bArr4[i11]) / 3046761265686732006L);
                                } else {
                                    bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 3046761265686732006L);
                                    i11++;
                                }
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i13 = $11 + 109;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            int i14 = $10 + 49;
                            int i15 = i14 % 128;
                            $11 = i15;
                            int i16 = i14 % 2;
                            if (z) {
                                int i17 = i15 + 91;
                                $10 = i17 % 128;
                                int i18 = i17 % 2;
                                byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                            } else {
                                short[] sArr = g;
                                int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = d + 23;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[37], bArr[80], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollDefaultDelay, iRgb, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(1254776611 - ((byte) KeyEvent.getModifierMetaStateMask()), (-53) - KeyEvent.normalizeMetaState(0), (short) (KeyEvent.keyCodeFromString("") + 37), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-38846797) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(Color.rgb(0, 0, 0) + 1271553832, (-53) - View.MeasureSpec.getMode(0), (short) (View.MeasureSpec.getSize(0) + 104), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-38846775) - Color.green(0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c2 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int deadChar = 921 - KeyEvent.getDeadChar(0, 0);
                    int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                    byte[] bArr2 = $$a;
                    byte b = bArr2[80];
                    Object[] objArr5 = new Object[1];
                    a(b, (byte) (b | 52), bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, deadChar, i5, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                        int iAxisFromString = MotionEvent.axisFromString("") + 922;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                        byte b2 = $$a[80];
                        Object[] objArr6 = new Object[1];
                        a(b2, (byte) (b2 | 37), (byte) 51, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, iAxisFromString, packedPositionType, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iMyUid = Process.myUid();
                    int i6 = ~iMyUid;
                    int i7 = (((699364615 + ((((~((-950816178) | i6)) | (-823263467)) | (~(950816177 | iMyUid))) * (-564))) + ((~(iMyUid | (-17956939))) * 1128)) + (((~((-823263467) | i6)) | (-968773116)) * 564)) - 301693022;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c((ViewConfiguration.getScrollBarSize() >> 8) + 1254776612, (ViewConfiguration.getLongPressTimeout() >> 16) - 53, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 61), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ImageFormat.getBitsPerPixel(0) - 38846759, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(1254776614 - Color.alpha(0), (-53) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (98 - View.combineMeasuredStates(0, 0)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf("", "") - 38846734, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(1254776621 - (ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) - 53, (short) ((-87) - (ViewConfiguration.getWindowTouchSlop() >> 8)), (byte) (ViewConfiguration.getTapTimeout() >> 16), (-38846716) - (Process.myTid() >> 22), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(KeyEvent.getDeadChar(0, 0) + 1254776620, (-53) - (KeyEvent.getMaxKeyCode() >> 16), (short) ((-112) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) Drawable.resolveOpacity(0, 0), (-38846701) - ExpandableListView.getPackedPositionChild(0L), objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -301693022};
                        byte[] bArr3 = $$d;
                        byte b3 = bArr3[26];
                        byte b4 = bArr3[57];
                        Object[] objArr13 = new Object[1];
                        e(b3, b4, b4, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b5 = (byte) ($$e & 335);
                        byte b6 = bArr3[35];
                        Object[] objArr14 = new Object[1];
                        e(b5, b6, b6, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cBlue = (char) (Color.blue(0) + 31533);
                            int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                            int gidForName = Process.getGidForName("") + 29;
                            byte b7 = $$a[80];
                            Object[] objArr15 = new Object[1];
                            a(b7, (byte) (b7 | 37), (byte) 51, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i10, gidForName, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(1254776613 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-53) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) (36 - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-38846797) - KeyEvent.getDeadChar(0, 0), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(TextUtils.indexOf("", "") + 1254776616, (-53) - ExpandableListView.getPackedPositionType(0L), (short) (View.MeasureSpec.getMode(0) + 104), (byte) View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') - 38846774, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char touchSlop = (char) (31533 - (ViewConfiguration.getTouchSlop() >> 8));
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 922;
                                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 28;
                                byte[] bArr4 = $$a;
                                byte b8 = bArr4[80];
                                Object[] objArr18 = new Object[1];
                                a(b8, (byte) (b8 | 52), bArr4[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, iIndexOf, packedPositionType2, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                                int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                                byte[] bArr5 = $$a;
                                Object[] objArr19 = new Object[1];
                                a(bArr5[37], bArr5[80], bArr5[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, keyRepeatTimeout, i11, -1048449946, false, (String) objArr19[0], null);
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
                int i12 = ((int[]) objArr[1])[0];
                int i13 = ((int[]) objArr[3])[0];
                if (i13 == i12) {
                    int i14 = ((int[]) objArr[0])[0];
                    Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i15 = ~iIdentityHashCode;
                    int i16 = i14 + 81443043 + (((~((-1053128102) | i15)) | 717246628) * 168) + ((~((-717246629) | iIdentityHashCode)) * 168) + (((~(iIdentityHashCode | (-335881474))) | (~(i15 | (-720951543))) | 3704914) * 168);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr20[0])[0] = i18 ^ (i18 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i19 = 0;
                        while (i19 < strArr.length) {
                            int i20 = asBinder + 115;
                            d = i20 % 128;
                            if (i20 % 2 == 0) {
                                arrayList.add(strArr[i19]);
                                i19 += 37;
                            } else {
                                arrayList.add(strArr[i19]);
                                i19++;
                            }
                            int i21 = asBinder + 5;
                            d = i21 % 128;
                            int i22 = i21 % 2;
                        }
                    }
                    Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                    int i23 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int i24 = ~System.identityHashCode(this);
                    int i25 = i23 + ((((~((-1073357918) | i24)) | 700456988) * (-241)) - 1278279947) + (((~(i24 | (-372900930))) | 264738) * 241);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr21[0])[0] = i27 ^ (i27 << 5);
                }
                ComplaintHistoryActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, int r7, int r8) {
                /*
                    int r7 = 121 - r7
                    int r8 = r8 * 4
                    int r0 = 1 - r8
                    byte[] r1 = defpackage.AnimatedStateListDrawableCompat1.$$c
                    int r6 = r6 * 2
                    int r6 = 3 - r6
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2c
                L16:
                    r3 = r2
                L17:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L24:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2c:
                    int r7 = -r7
                    int r7 = r7 + r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AnimatedStateListDrawableCompat1.$$g(byte, int, int):java.lang.String");
            }
        });
        int i2 = d + 121;
        f476a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f476a + 69;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            ((addStateSet) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1();
            return;
        }
        ((addStateSet) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i5 = $11 + 3;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            int i7 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = 58224;
            if (i8 % i3 == 0) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i10 = 0;
            while (i10 < 16) {
                int i11 = $11 + 95;
                $10 = i11 % 128;
                int i12 = i11 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i7];
                int i13 = (c2 + i9) ^ ((c2 << 4) + ((char) (((long) g) ^ 8611973335120459638L)));
                int i14 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[i3] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[i7] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (47772 - TextUtils.lastIndexOf("", '0', i7, i7));
                        int size = 468 - View.MeasureSpec.getSize(i7);
                        int i15 = 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, size, i15, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 468, Color.red(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    oncapturesessionend = oncapturesessionend2;
                    i3 = 2;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2323;
                int i16 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
                byte b = (byte) 0;
                byte b2 = b;
                String str$$i = $$i(b, b2, b2);
                i2 = 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, longPressTimeout, i16, -1312321721, false, str$$i, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i3 = i2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ((ActivityComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_complaint_history));
        RecyclerView recyclerView = ((ActivityComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvComplaintHistory;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((setHotspot) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i2 = d + 103;
        f476a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = d + 9;
        f476a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
            int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
            short s = $$a[7];
            byte b = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iIndexOf, keyRepeatTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                short s2 = (short) ($$b & 239);
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c(s2, b2, (byte) (b2 | 52), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionChild, i4, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i6 = ~i5;
            int i7 = (((((~(i6 | 24049177)) | ((~((-188553249) | i6)) | 168888352)) * (-397)) - 1527957132) + ((i5 | 173272633) * 397)) - 1592789795;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{54450, 14990, 60552, 36316, 36063, 58093, 35651, 10249, 19889, 17957, 63471, 2139, 54262, 7210, 45872, 4474, 8713, 32599}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card_dialog).substring(24, 25).codePointAt(0) - 101, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{49053, 9581, 22648, 44714, 20695, 31793, 18736, 61069, 23784, 55778, 24155, 47929, 18034, 56118, 64368, 36943, 61870, 21471}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1758639695};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.getDefaultSize(0, 0) + 1726, 28 - MotionEvent.axisFromString(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1592789795, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                    int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                    short s3 = (short) ($$b & 239);
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(s3, b3, (byte) (b3 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, deadChar, packedPositionGroup, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{14021, 46642, 8876, 5806, 18665, 4969, 64178, 47935, 42821, 52181, 16211, 17169, 14731, 19163, 42384, 9526, 24437, 16285, 2164, 8916, 48317, 47026, 19617, 8190}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_no_shopee_message).substring(3, 4).length() + 21, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{21448, 47894, 56337, 34907, 13067, 45083, 4454, 40826, 61691, 53196, 9778, 21663, 23738, 19223, 56729, 21852, 41954, 25805}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 29944);
                        int iResolveSize = 1755 - View.resolveSize(0, 0);
                        int iRed = 23 - Color.red(0);
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((short) 89, b4, (byte) (b4 | 52), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize2, iResolveSize, iRed, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                        int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 23;
                        short s4 = $$a[7];
                        byte b5 = (byte) s4;
                        Object[] objArr12 = new Object[1];
                        c(s4, b5, (byte) (b5 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, i10, packedPositionGroup2, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            int i11 = f476a + 19;
            d = i11 % 128;
            for (int i12 = i11 % 2 != 0 ? 0 : 1; i12 < strArr.length; i12++) {
                int i13 = f476a + 65;
                d = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(strArr[i12]);
            }
            throw null;
        }
        int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = i15 + (-665502068) + ((~((~iIdentityHashCode) | (-268648770))) * 433) + (((~(296436033 | iIdentityHashCode)) | (-509038460)) * (-433)) + (((~(iIdentityHashCode | (-509038460))) | 27787264) * 433);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
            byte b6 = $$a[7];
            Object[] objArr14 = new Object[1];
            c((short) 141, b6, (byte) (b6 | 52), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, keyRepeatTimeout2, threadPriority, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{14021, 46642, 8876, 5806, 18665, 4969, 64178, 47935, 42821, 52181, 16211, 17169, 14731, 19163, 42384, 9526, 24437, 16285, 2164, 8916, 48317, 47026, 19617, 8190}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_bill).substring(0, 12).codePointAt(5) - 92, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{21448, 47894, 56337, 34907, 13067, 45083, 4454, 40826, 61691, 53196, 9778, 21663, 23738, 19223, 56729, 21852, 41954, 25805}, (-16777201) - Color.rgb(0, 0, 0), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iResolveSize2 = View.resolveSize(0, 0) + 1031;
            int i19 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            short s5 = (short) ($$b & 239);
            byte b7 = $$a[7];
            Object[] objArr17 = new Object[1];
            c(s5, b7, (byte) (b7 | 52), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iResolveSize2, i19, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int defaultSize3 = View.getDefaultSize(0, 0) + 1031;
                int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                byte[] bArr = $$a;
                Object[] objArr18 = new Object[1];
                c((short) 193, bArr[5], bArr[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRgb, defaultSize3, tapTimeout, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr19[3])[0];
            int i21 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i22 = (~System.identityHashCode(this)) | 826450837;
            int i23 = (-1294925268) + (i22 * 495) + (((~i22) | 289440660) * 495) + 195032754;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
            int i26 = d + 57;
            f476a = i26 % 128;
            int i27 = i26 % 2;
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{54450, 14990, 60552, 36316, 36063, 58093, 35651, 10249, 19889, 17957, 63471, 2139, 54262, 7210, 45872, 4474, 8713, 32599}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).length() + 7, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{49053, 9581, 22648, 44714, 20695, 31793, 18736, 61069, 23784, 55778, 24155, 47929, 18034, 56118, 64368, 36943, 61870, 21471}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).length() + 15, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1758639695};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - TextUtils.getCapsMode("", 0, 0)), KeyEvent.normalizeMetaState(0) + 1134, 18 - KeyEvent.normalizeMetaState(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 195032754, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                byte b8 = $$a[7];
                Object[] objArr24 = new Object[1];
                c((short) 141, b8, (byte) (b8 | 52), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mirror, trimmedLength, iIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "") + 45993), 1117 - View.MeasureSpec.getMode(0), 17 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i28 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr25 = new Object[1];
                c((short) 193, bArr2[5], bArr2[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid, i28, iResolveOpacity, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{14021, 46642, 8876, 5806, 18665, 4969, 64178, 47935, 42821, 52181, 16211, 17169, 14731, 19163, 42384, 9526, 24437, 16285, 2164, 8916, 48317, 47026, 19617, 8190}, 22 - TextUtils.indexOf("", "", 0, 0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{21448, 47894, 56337, 34907, 13067, 45083, 4454, 40826, 61691, 53196, 9778, 21663, 23738, 19223, 56729, 21852, 41954, 25805}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int i29 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                    int i30 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                    short s6 = (short) ($$b & 239);
                    byte b9 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c(s6, b9, (byte) (b9 | 52), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, i29, i30, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                    int i31 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int trimmedLength3 = 15 - TextUtils.getTrimmedLength("");
                    byte b10 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 141, b10, (byte) (b10 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength2, i31, trimmedLength3, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 == i32) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[3])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i38 = ~i37;
            int i39 = i34 + (-562789195) + ((1006091930 | i37) * (-676)) + (((~(712418818 | i38)) | (-1006091931)) * 676) + (((~(i37 | (-293673113))) | (~(i38 | 468138648)) | 537953282) * 676);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr30[2])[0] = i41 ^ (i41 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                int i42 = d + 81;
                f476a = i42 % 128;
                int i43 = i42 % 2;
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i33 / (((i33 - 1) * i33) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iMyTid = Process.myTid();
        int i47 = i44 + (((~((~iMyTid) | 515891190)) * 130) - 1411617257) + (((~(iMyTid | 515891190)) | 17504) * 130);
        int i48 = i47 ^ (i47 << 13);
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr31[2])[0] = i49 ^ (i49 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1000493886
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ComplaintHistoryActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 119;
        f476a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-1134047304) + (((~iIdentityHashCode) | 269062474) * 1324) + (((~(iIdentityHashCode | (-1743941302))) | (~(913953758 | iIdentityHashCode))) * (-1324)) + 547629752) {
            int i5 = d + 105;
            f476a = i5 % 128;
            int i6 = i5 % 2;
            int[] iArr = new int[512830807];
            iArr[512830806] = 1;
            int i7 = (-1442544070) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i8 != (-1860741752) + (((~((-1930662987) | startUptimeMillis)) | 36866) * (-140)) + ((~((-1930626121) | startUptimeMillis)) * 70) + (((~(startUptimeMillis | 214751655)) | (-2145340910)) * 70)) {
            int i9 = (-1614200478) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c A[PHI: r1
  0x006c: PHI (r1v5 VirtualCameraAdapter1$asBinder) = (r1v4 VirtualCameraAdapter1$asBinder), (r1v12 VirtualCameraAdapter1$asBinder) binds: [B:18:0x006a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x010b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0138  */
    /* JADX WARN: Code duplicated, block: B:37:0x0165  */
    /* JADX WARN: Code duplicated, block: B:40:0x0192  */
    /* JADX WARN: Code duplicated, block: B:52:0x0198 A[SYNTHETIC] */
    public static /* synthetic */ void b(final ComplaintHistoryActivity complaintHistoryActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        VirtualCameraAdapter1.asBinder asbinder;
        int i;
        List list;
        int size;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i3 = 2 % 2;
        int i4 = d + 39;
        int i5 = i4 % 128;
        f476a = i5;
        int i6 = i4 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (complaintHistoryActivity.b) {
                ((ActivityComplaintHistoryBinding) ((ViewBinding) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlComplaintHistory.setRefreshing(true);
                return;
            } else {
                complaintHistoryActivity.MediaBrowserCompat();
                return;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                complaintHistoryActivity.IconCompatParcelizer();
                ((ActivityComplaintHistoryBinding) ((ViewBinding) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlComplaintHistory.setRefreshing(false);
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: AnimatedStateListDrawableCompatAnimatableTransition
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComplaintHistoryActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                });
                return;
            }
            return;
        }
        int i7 = i5 + 117;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            complaintHistoryActivity.IconCompatParcelizer();
            ((ActivityComplaintHistoryBinding) ((ViewBinding) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlComplaintHistory.setRefreshing(true);
            asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                if (!((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty()) {
                    i = f476a + 65;
                    d = i % 128;
                    if (i % 2 == 0) {
                        list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNullParameter(list, "");
                        size = list.size();
                        i2 = 1;
                    } else {
                        list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNullParameter(list, "");
                        size = list.size();
                        i2 = 0;
                    }
                    while (i2 < size) {
                        int i8 = f476a + 71;
                        d = i8 % 128;
                        int i9 = i8 % 2;
                        str = ((ComplaintHistory) list.get(i2)).a;
                        str2 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(str2);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str2, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str3 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNull(str3);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str3, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str4 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        Intrinsics.checkNotNull(str4);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str4, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str5 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Intrinsics.checkNotNull(str5);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str5, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str6 = ((ComplaintHistory) list.get(i2)).b;
                        Intrinsics.checkNotNull(str6);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str6, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        ComplaintHistory complaintHistory = (ComplaintHistory) list.get(i2);
                        String str7 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(str7);
                        complaintHistory.TuitionPaymentFragmentbindingInflater1 = (String) StringsKt.split$default((CharSequence) str7, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory2 = (ComplaintHistory) list.get(i2);
                        String str8 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNull(str8);
                        complaintHistory2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (String) StringsKt.split$default((CharSequence) str8, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory3 = (ComplaintHistory) list.get(i2);
                        String str9 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        Intrinsics.checkNotNull(str9);
                        complaintHistory3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (String) StringsKt.split$default((CharSequence) str9, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory4 = (ComplaintHistory) list.get(i2);
                        String str10 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Intrinsics.checkNotNull(str10);
                        complaintHistory4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String) StringsKt.split$default((CharSequence) str10, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory5 = (ComplaintHistory) list.get(i2);
                        String str11 = ((ComplaintHistory) list.get(i2)).b;
                        Intrinsics.checkNotNull(str11);
                        complaintHistory5.b = (String) StringsKt.split$default((CharSequence) str11, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        i2++;
                        int i10 = f476a + 65;
                        d = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    Intrinsics.checkNotNullParameter(list, "");
                    list.size();
                    ((setHotspot) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(list);
                    return;
                }
            }
        } else {
            complaintHistoryActivity.IconCompatParcelizer();
            ((ActivityComplaintHistoryBinding) ((ViewBinding) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlComplaintHistory.setRefreshing(false);
            asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                if (!((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty()) {
                    i = f476a + 65;
                    d = i % 128;
                    if (i % 2 == 0) {
                        list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNullParameter(list, "");
                        size = list.size();
                        i2 = 1;
                    } else {
                        list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNullParameter(list, "");
                        size = list.size();
                        i2 = 0;
                    }
                    while (i2 < size) {
                        int i12 = f476a + 71;
                        d = i12 % 128;
                        int i13 = i12 % 2;
                        str = ((ComplaintHistory) list.get(i2)).a;
                        str2 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(str2);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str2, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str3 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNull(str3);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str3, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str4 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        Intrinsics.checkNotNull(str4);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str4, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str5 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Intrinsics.checkNotNull(str5);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str5, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        str6 = ((ComplaintHistory) list.get(i2)).b;
                        Intrinsics.checkNotNull(str6);
                        if (!Intrinsics.areEqual(StringsKt.split$default((CharSequence) str6, new String[]{"#"}, false, 0, 6, (Object) null).get(1), str)) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintHistoryActivity, "data invalid", null);
                        }
                        ComplaintHistory complaintHistory6 = (ComplaintHistory) list.get(i2);
                        String str12 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(str12);
                        complaintHistory6.TuitionPaymentFragmentbindingInflater1 = (String) StringsKt.split$default((CharSequence) str12, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory7 = (ComplaintHistory) list.get(i2);
                        String str13 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNull(str13);
                        complaintHistory7.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (String) StringsKt.split$default((CharSequence) str13, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory8 = (ComplaintHistory) list.get(i2);
                        String str14 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        Intrinsics.checkNotNull(str14);
                        complaintHistory8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (String) StringsKt.split$default((CharSequence) str14, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory9 = (ComplaintHistory) list.get(i2);
                        String str15 = ((ComplaintHistory) list.get(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Intrinsics.checkNotNull(str15);
                        complaintHistory9.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String) StringsKt.split$default((CharSequence) str15, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        ComplaintHistory complaintHistory10 = (ComplaintHistory) list.get(i2);
                        String str16 = ((ComplaintHistory) list.get(i2)).b;
                        Intrinsics.checkNotNull(str16);
                        complaintHistory10.b = (String) StringsKt.split$default((CharSequence) str16, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                        i2++;
                        int i14 = f476a + 65;
                        d = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    Intrinsics.checkNotNullParameter(list, "");
                    list.size();
                    ((setHotspot) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(list);
                    return;
                }
            }
        }
        ((ActivityComplaintHistoryBinding) ((ViewBinding) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEnmptyComplaint.setVisibility(0);
        int i16 = d + 111;
        f476a = i16 % 128;
        int i17 = i16 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ComplaintHistoryActivity complaintHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 29;
        f476a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            complaintHistoryActivity.finish();
            ViewPortBuilder.b();
            int i4 = f476a + 125;
            d = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ setHotspot TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ComplaintHistoryActivity complaintHistoryActivity) {
        int i = 2 % 2;
        setHotspot sethotspot = new setHotspot(complaintHistoryActivity, new ArrayList(), new Function1() { // from class: setConstantState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ComplaintHistory) obj);
            }
        });
        int i2 = f476a + 107;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return sethotspot;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ComplaintHistoryActivity complaintHistoryActivity) {
        int i = 2 % 2;
        int i2 = f476a + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.g();
        try {
            if (i3 == 0) {
                complaintHistoryActivity.b = true;
                ((addStateSet) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1();
            } else {
                complaintHistoryActivity.b = true;
                ((addStateSet) complaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1();
            }
            ViewPortBuilder.asBinder();
        } catch (Throwable th) {
            ViewPortBuilder.asBinder();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(ComplaintHistoryActivity complaintHistoryActivity) {
        int i = 2 % 2;
        int i2 = f476a + 41;
        d = i2 % 128;
        int i3 = i2 % 2;
        complaintHistoryActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = f476a + 35;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ComplaintHistoryActivity complaintHistoryActivity = (ComplaintHistoryActivity) objArr[0];
        ComplaintHistory complaintHistory = (ComplaintHistory) objArr[1];
        int i = 2 % 2;
        int i2 = f476a + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(complaintHistory, "");
        DetailComplaintHistoryActivity.Companion companion = DetailComplaintHistoryActivity.INSTANCE;
        DetailComplaintHistoryActivity.Companion.b(complaintHistoryActivity, complaintHistory);
        Unit unit = Unit.INSTANCE;
        int i4 = d + 89;
        f476a = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ComplaintHistoryActivity complaintHistoryActivity, ComplaintHistory complaintHistory) {
        int iB = zznv.b();
        int iB2 = zznv.b();
        return (Unit) TuitionPaymentFragmentbindingInflater1(zznv.b(), 1698797625, new Object[]{complaintHistoryActivity, complaintHistory}, zznv.b(), -1698797624, iB, iB2);
    }

    static {
        onTransact = 1;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 111;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(zznv.b(), 339079400, new Object[]{this}, zznv.b(), -339079400, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 59;
        f476a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        TuitionPaymentFragmentbindingInflater1(zznv.b(), -68330980, new Object[]{this, bundle}, onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1(), 68330982, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1340016988, zznv.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f476a + 9;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 40042;
        asInterface = (char) 36922;
        g = (char) 54636;
        asBinder = (char) 28529;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 115;
        f476a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 59;
        f476a = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(R.layout.activity_complaint_history);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = 108 - r5
            byte[] r0 = com.bpjstku.presentation.complaint.ComplaintHistoryActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r4 = r6
            r5 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ComplaintHistoryActivity.$$i(int, short, byte):java.lang.String");
    }
}
