package com.bpjstku.presentation.program.jpn.jpnPeriodic;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJpnPeriodicChooseKpjBinding;
import com.bpjstku.domain.jp.model.CheckEligibleJp;
import com.bpjstku.domain.jp.model.GetCountClaimJp;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.kennyc.view.MultiStateView;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.CameraDeviceStateCallbacks;
import defpackage.CameraUseCaseAdapter;
import defpackage.CaptureSessionExternalSyntheticLambda3;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRatioByPercentage;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setBackpressureStrategy;
import defpackage.setCameraOperatingMode;
import defpackage.setQuickZoomEnabled;
import defpackage.stopRepeating;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0015\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0011\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010\u001a\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\""}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicChooseKpjActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJpnPeriodicChooseKpjBinding;", "<init>", "()V", "", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LCaptureSessionExternalSyntheticLambda3;", "Lkotlin/Lazy;", "LstopRepeating;", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCameraDeviceStateCallbacks;", "LgetStringOrNull;", "LgetStringOrNull;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "", "Ljava/util/List;", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnPeriodicChooseKpjActivity extends BindingBaseActivity<ActivityJpnPeriodicChooseKpjBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f613a;
    private static long asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private getStringOrNull asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 233;
    private static int cancel = 0;
    private static int onTransact = 0;
    private static int cancelAll = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: groupMrirOutputConfigs
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (CameraDeviceStateCallbacks) JpnPeriodicChooseKpjActivity.b(setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -617726338, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2}, setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 617726339);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private JpDataTk g = new JpDataTk("", "", "", "");

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private List<JpDataTk> d = CollectionsKt.listOf((Object[]) new JpDataTk[]{new JpDataTk("1234567890", "3308082009590001", "Akaw", "KL22112406451142"), new JpDataTk("0987654321", "3308082009590001", "Nikel", "KL22112406451142"), new JpDataTk("0987654321", "3308082009590001", "Roqib", "KL22112406451142"), new JpDataTk("0987654321", "3308082009590001", "Malik", "KL22112406451142"), new JpDataTk("0987654321", "3308082009590001", "Lurah", "KL22112406451142"), new JpDataTk("0987654321", "3308082009590001", "Ikin", "KL22112406451142"), new JpDataTk("0987654321", "3308082009590001", "Icah", "KL22112406451142")});

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        String str;
        int i7 = ~((~i5) | i4);
        int i8 = ~((~i4) | i6);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i6) | i4));
        int i11 = i4 + i6 + i + (762724209 * i2) + (1201824936 * i3);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i4) + 43253760 + (1339426419 * i6) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i) + (1302855680 * i2) + (1514143744 * i3) + (1905524736 * i12);
        int i14 = ((i4 * 162561953) - 555857873) + (i6 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i * 162560975) + (i2 * 701011807) + (i3 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        final JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity = (JpnPeriodicChooseKpjActivity) objArr[0];
        int i16 = 2 % 2;
        JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity2 = jpnPeriodicChooseKpjActivity;
        User userAsBinder = ((CaptureSessionExternalSyntheticLambda3) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i17 = cancelAll + 7;
            onTransact = i17 % 128;
            int i18 = i17 % 2;
        } else {
            str = null;
        }
        if (str == null) {
            int i19 = onTransact + 117;
            cancelAll = i19 % 128;
            int i20 = i19 % 2;
            str = "";
        }
        return new CameraDeviceStateCallbacks(jpnPeriodicChooseKpjActivity2, str, new ArrayList(), new Function1() { // from class: issueCaptureRequests
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (JpDataTk) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.$$a
            int r8 = 53 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public JpnPeriodicChooseKpjActivity() {
        final JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<CaptureSessionExternalSyntheticLambda3>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [CaptureSessionExternalSyntheticLambda3, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ CaptureSessionExternalSyntheticLambda3 invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicChooseKpjActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CaptureSessionExternalSyntheticLambda3.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<stopRepeating>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, stopRepeating] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ stopRepeating invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicChooseKpjActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(stopRepeating.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicChooseKpjActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JpnPeriodicChooseKpjActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        JpnPeriodicChooseKpjActivity$bindingInflater$1 jpnPeriodicChooseKpjActivity$bindingInflater$1 = JpnPeriodicChooseKpjActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = onTransact + 101;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return jpnPeriodicChooseKpjActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity = this;
        Intrinsics.checkNotNullParameter(jpnPeriodicChooseKpjActivity, "");
        jpnPeriodicChooseKpjActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJpnPeriodicChooseKpjBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenterPinned.toolbar, true);
        ((ActivityJpnPeriodicChooseKpjBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenterPinned.tvToolbarTitle.setText(getString(R.string.label_choose_jamsostek_id_jp));
        RecyclerView recyclerView = ((ActivityJpnPeriodicChooseKpjBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvDigitalCard;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new setCameraOperatingMode(16, 16));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((CameraDeviceStateCallbacks) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        int i2 = onTransact + 103;
        cancelAll = i2 % 128;
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
        JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity = this;
        ((stopRepeating) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(jpnPeriodicChooseKpjActivity, new Observer() { // from class: getUniqueOutputConfigurations
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicChooseKpjActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((stopRepeating) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(jpnPeriodicChooseKpjActivity, new Observer() { // from class: issueBurstCaptureRequest
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = onTransact + 125;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 25;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - MotionEvent.axisFromString("")), 1235 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34, -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2764 - TextUtils.indexOf("", "", 0), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1504416861, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionType(0L)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 254, View.MeasureSpec.getSize(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 65201), 2891 - ExpandableListView.getPackedPositionGroup(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 17, 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asInterface ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) d) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) f613a) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 103;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancelAll + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            Intrinsics.checkNotNullParameter(string, "");
            ((stopRepeating) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3 = 47 / 0;
        } else {
            String string2 = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string2, "");
            Intrinsics.checkNotNullParameter(string2, "");
            ((stopRepeating) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        int i4 = cancelAll + 67;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = cancelAll + 123;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 73 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
                int i6 = onTransact + 85;
                cancelAll = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 5;
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancelAll + 111;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                int touchSlop = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr = $$a;
                short s = bArr[5];
                byte b = bArr[28];
                Object[] objArr2 = new Object[1];
                c(s, b, (byte) (b | 14), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, tapTimeout, touchSlop, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
            int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
            byte[] bArr2 = $$a;
            short s2 = bArr2[5];
            byte b2 = bArr2[28];
            Object[] objArr3 = new Object[1];
            c(s2, b2, (byte) (b2 | 14), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, threadPriority, i3, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) (29944 - Color.red(0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                byte[] bArr3 = $$a;
                Object[] objArr4 = new Object[1];
                c((short) (bArr3[12] + 1), bArr3[28], bArr3[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iLastIndexOf, i4, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((((-33853323) + (((~((-72613895) | i5)) | 285216320) * 220)) + (((~(i5 | (-752132120))) | 964734545) * (-440))) + ((iIdentityHashCode | (-72613895)) * 220)) - 1702134589;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{54500, 13223, 4418, 7596}, new char[]{29880, 43268, 41079, 17007}, (char) (28576 - View.MeasureSpec.getMode(0)), TextUtils.getCapsMode("", 0, 0), new char[]{150, 42566, 21238, 34065, 19355, 47611, 42904, 8261, 43627, 22941, 46297, 31518, 29021, 20115, 536, 62972}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{54500, 13223, 4418, 7596}, new char[]{50825, 6812, 49059, 3119}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12212), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{11694, 13413, 12994, 46174, 47017, 41677, 25510, 6081, 34380, 4337, 40974, 33179, 45139, 51519, 47761, 24693}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-146198433};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1726 - (ViewConfiguration.getScrollBarSize() >> 8), 29 - Color.alpha(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), -1702134589, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int windowTouchSlop = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    c((short) (bArr4[12] + 1), bArr4[28], bArr4[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, windowTouchSlop, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{54500, 13223, 4418, 7596}, new char[]{36573, 3696, 30400, 43113}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{9711, 24035, 34204, 36241, 65002, 7425, 22830, 31998, 59186, 31728, 2746, 4828, 15857, 49768, 44330, 39167, 42037, 15965, 38279, 42206, 25132, 63322}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{54500, 13223, 4418, 7596}, new char[]{23267, 48124, 1188, 32947}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 45817), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 1531184150, new char[]{34757, 12905, 23434, 37040, 2357, 54414, 37569, 47320, 19359, 36226, 56357, 35382, 43963, 62834, 3015}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 29944);
                        int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                        int i9 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((short) 88, bArr5[28], bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb2, iResolveOpacity, i9, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                        int iGreen = 1755 - Color.green(0);
                        int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr6 = $$a;
                        short s3 = bArr6[5];
                        byte b3 = bArr6[28];
                        Object[] objArr13 = new Object[1];
                        c(s3, b3, (byte) (b3 | 14), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iGreen, packedPositionGroup, 986134021, false, (String) objArr13[0], null);
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
        }
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = cancelAll + 111;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iMyUid = Process.myUid();
            int i15 = i14 + (((~((-385942722) | iMyUid)) | 33555585) * (-283)) + 1118898388 + ((~(iMyUid | (-352387137))) * 283);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i18 = onTransact + 75;
                cancelAll = i18 % 128;
                int i19 = i18 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i22 = i20 + (((242838557 + (((~(530225988 | i21)) | (-742828415)) * (-948))) + ((~((~i21) | (-541335611))) * (-948))) - 2066854248);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr15[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i25 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 15;
            byte[] bArr7 = $$a;
            Object[] objArr16 = new Object[1];
            c((short) 140, bArr7[28], bArr7[7], objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, i25, iResolveOpacity2, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new char[]{54500, 13223, 4418, 7596}, new char[]{36573, 3696, 30400, 43113}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_expiration_message).substring(3, 4).codePointAt(0) - 97), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_407).substring(10, 11).length() - 1, new char[]{9711, 24035, 34204, 36241, 65002, 7425, 22830, 31998, 59186, 31728, 2746, 4828, 15857, 49768, 44330, 39167, 42037, 15965, 38279, 42206, 25132, 63322}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new char[]{54500, 13223, 4418, 7596}, new char[]{23267, 48124, 1188, 32947}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 45817), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1531184074, new char[]{34757, 12905, 23434, 37040, 2357, 54414, 37569, 47320, 19359, 36226, 56357, 35382, 43963, 62834, 3015}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0);
            int gidForName = 14 - Process.getGidForName("");
            byte[] bArr8 = $$a;
            Object[] objArr19 = new Object[1];
            c((short) (bArr8[12] + 1), bArr8[28], bArr8[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(deadChar, iLastIndexOf2, gidForName, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i26 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                short s4 = (short) ($$b & 976);
                byte b4 = $$a[7];
                Object[] objArr20 = new Object[1];
                c(s4, b4, (byte) (b4 | 52), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, fadingEdgeLength, i26, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr21[3])[0];
            int i28 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int i29 = (~System.identityHashCode(this)) | 617398986;
            int i30 = (-1168711038) + (i29 * 495) + (((~i29) | 549486730) * 495) + 926809759;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{54500, 13223, 4418, 7596}, new char[]{29880, 43268, 41079, 17007}, (char) (28576 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step1).substring(0, 1).length() - 1, new char[]{150, 42566, 21238, 34065, 19355, 47611, 42904, 8261, 43627, 22941, 46297, 31518, 29021, 20115, 536, 62972}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{54500, 13223, 4418, 7596}, new char[]{50825, 6812, 49059, 3119}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 12187), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{11694, 13413, 12994, 46174, 47017, 41677, 25510, 6081, 34380, 4337, 40974, 33179, 45139, 51519, 47761, 24693}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-146198433};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46037 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1134, Color.red(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 926809759, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                byte[] bArr9 = $$a;
                Object[] objArr26 = new Object[1];
                c((short) 140, bArr9[28], bArr9[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid2, scrollBarSize, maxKeyCode, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTapTimeout() >> 16) + 45993), 1116 - TextUtils.lastIndexOf("", '0', 0), 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 15;
                short s5 = (short) ($$b & 976);
                byte b5 = $$a[7];
                Object[] objArr27 = new Object[1];
                c(s5, b5, (byte) (b5 | 52), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(bitsPerPixel, fadingEdgeLength2, iIndexOf2, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{54500, 13223, 4418, 7596}, new char[]{36573, 3696, 30400, 43113}, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{9711, 24035, 34204, 36241, 65002, 7425, 22830, 31998, 59186, 31728, 2746, 4828, 15857, 49768, 44330, 39167, 42037, 15965, 38279, 42206, 25132, 63322}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{54500, 13223, 4418, 7596}, new char[]{23267, 48124, 1188, 32947}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 45792), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay).substring(0, 5).codePointAt(3) - 1531184135, new char[]{34757, 12905, 23434, 37040, 2357, 54414, 37569, 47320, 19359, 36226, 56357, 35382, 43963, 62834, 3015}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 16;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) (bArr10[12] + 1), bArr10[28], bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState, defaultSize, iLastIndexOf3, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0);
                    int i33 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    byte[] bArr11 = $$a;
                    Object[] objArr31 = new Object[1];
                    c((short) 140, bArr11[28], bArr11[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf, iIndexOf3, i33, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 == null) {
                throw null;
            }
            for (String str2 : strArr3) {
                arrayList2.add(str2);
            }
            throw null;
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr[2])[0];
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i38 = i34 + ((((-379072925) + (((-538144769) | (~i37)) * (-490))) + (((~(i37 | 398755583)) | (-936900352)) * 490)) - 1554906852);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr32[2])[0] = i40 ^ (i40 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~Process.myUid();
        if (i4 != (-952003670) + ((~((-23199765) | i5)) * (-783)) + (((~(i5 | (-895654965))) | (-65667422)) * 783)) {
            throw new RuntimeException("-1523969755");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~Process.myTid();
        int i8 = (-1035352272) | i7;
        if (i6 != 479161148 + (((~(i7 | (-1073808385))) | (~((-565456963) | i7))) * (-184)) + ((469895309 | (~i8) | (~((-1543703694) | i7))) * 184) + 1538503880) {
            throw null;
        }
        super.onResume();
        int i9 = cancelAll + 31;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iMyUid = Process.myUid();
        if (i4 != 1586999448 + (((~(1573541381 | iMyUid)) | (-743553839)) * (-948)) + ((~((~iMyUid) | (-538028331))) * (-948)) + 313326092) {
            int i5 = (-1334421092) % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = ~((-846463178) | iIdentityHashCode);
        int i8 = ~iIdentityHashCode;
        if (i6 != 381805580 + ((i7 | (~(1732592787 | i8))) * (-1808)) + (((~((-574881922) | iIdentityHashCode)) | (~(i8 | 2004174043))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode | (-1732592788))) | 271581256 | (~(846463177 | i8))) * TypedValues.Custom.TYPE_BOOLEAN)) {
            throw null;
        }
        super.onStart();
        int i9 = cancelAll + 13;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 85 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bb, code lost:
    
        if (r1 != (((-1070812804) + (((~(2146958554 | r2)) | 432097410) * (-756))) + (((~r2) | 2146958554) * 756))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bd, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.onTransact + 125;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.cancelAll = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d1, code lost:
    
        throw new java.lang.RuntimeException("-624486375");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
    
        r10 = (-254339548) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00db, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0063, code lost:
    
        if (r1 == ((((-967330136) + ((((~(1374629499 | r5)) | (-544641957)) | (~((-1374629500) | r4))) * (-564))) + ((~(r4 | (-6685217))) * 1128)) + (((~((-544641957) | r5)) | 1367944283) * 564))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0096, code lost:
    
        if (r1 == (((2047873600 + (((~((-506952804) | r4)) | 268920897) * 345)) + (((~((-506952804) | (~r4))) | (-1605861244)) * 345)) + ((~(r4 | (-268920898))) * 345))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity, JpDataTk jpDataTk) {
        int i = 2 % 2;
        int i2 = cancelAll + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jpDataTk, "");
        if (i3 == 0) {
            jpnPeriodicChooseKpjActivity.g = jpDataTk;
            ((stopRepeating) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(jpDataTk);
            return Unit.INSTANCE;
        }
        jpnPeriodicChooseKpjActivity.g = jpDataTk;
        ((stopRepeating) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(jpDataTk);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 97;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            jpnPeriodicChooseKpjActivity.onBackPressed();
            unit = Unit.INSTANCE;
            int i3 = 70 / 0;
        } else {
            jpnPeriodicChooseKpjActivity.onBackPressed();
            unit = Unit.INSTANCE;
        }
        int i4 = cancelAll + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 97;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MultiStateView multiStateView = ((ActivityJpnPeriodicChooseKpjBinding) ((ViewBinding) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                MultiStateView multiStateView2 = ((ActivityJpnPeriodicChooseKpjBinding) ((ViewBinding) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDigitalCard;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, new Pair(jpnPeriodicChooseKpjActivity.getString(R.string.action_return), new Function0() { // from class: issuePendingCaptureRequest
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }));
                return;
            }
            return;
        }
        int i4 = i2 + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        MultiStateView multiStateView3 = ((ActivityJpnPeriodicChooseKpjBinding) ((ViewBinding) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDigitalCard;
        Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
        multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
        ((CameraDeviceStateCallbacks) jpnPeriodicChooseKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(((GetCountClaimJp) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).b);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 59;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            jpnPeriodicChooseKpjActivity.MediaBrowserCompat();
            int i4 = onTransact + 81;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                jpnPeriodicChooseKpjActivity.IconCompatParcelizer();
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = jpnPeriodicChooseKpjActivity.getString(R.string.title_jp_periodically_confirmation);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string2 = jpnPeriodicChooseKpjActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, strValueOf, string2, null, 112);
                jpnPeriodicChooseKpjActivity.asInterface = getstringornullB;
                if (getstringornullB != null) {
                    int i5 = onTransact + 75;
                    cancelAll = i5 % 128;
                    int i6 = i5 % 2;
                    FragmentManager supportFragmentManager = jpnPeriodicChooseKpjActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i7 = i2 + 125;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        jpnPeriodicChooseKpjActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        if (Intrinsics.areEqual(((CheckEligibleJp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "Y") && Intrinsics.areEqual(((CheckEligibleJp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3, ExifInterface.GPS_DIRECTION_TRUE)) {
            jpnPeriodicChooseKpjActivity.d_();
            JpnPeriodicActivity.Companion companion2 = JpnPeriodicActivity.INSTANCE;
            JpnPeriodicActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicChooseKpjActivity, jpnPeriodicChooseKpjActivity.g);
            return;
        }
        if (Intrinsics.areEqual(((CheckEligibleJp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, ExifInterface.GPS_DIRECTION_TRUE) && Intrinsics.areEqual(((CheckEligibleJp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3, "Y")) {
            int i9 = onTransact + 55;
            cancelAll = i9 % 128;
            if (i9 % 2 != 0) {
                JpnPeriodicInformationVerifiedActivity.Companion companion3 = JpnPeriodicInformationVerifiedActivity.INSTANCE;
                JpnPeriodicInformationVerifiedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicChooseKpjActivity, jpnPeriodicChooseKpjActivity.g, false);
                jpnPeriodicChooseKpjActivity.d_();
                return;
            } else {
                JpnPeriodicInformationVerifiedActivity.Companion companion4 = JpnPeriodicInformationVerifiedActivity.INSTANCE;
                JpnPeriodicInformationVerifiedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicChooseKpjActivity, jpnPeriodicChooseKpjActivity.g, false);
                jpnPeriodicChooseKpjActivity.d_();
                obj.hashCode();
                throw null;
            }
        }
        getStringOrNull.Companion companion5 = getStringOrNull.INSTANCE;
        String string3 = jpnPeriodicChooseKpjActivity.getString(R.string.error_message_sorry);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String str = ((CheckEligibleJp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b;
        String string4 = jpnPeriodicChooseKpjActivity.getString(R.string.action_back);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, str, string4, null, 112);
        jpnPeriodicChooseKpjActivity.asInterface = getstringornullB2;
        if (getstringornullB2 != null) {
            FragmentManager supportFragmentManager2 = jpnPeriodicChooseKpjActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
            if (supportFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB2.show(supportFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            int i10 = onTransact + 25;
            cancelAll = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ CameraDeviceStateCallbacks TuitionPaymentFragmentbindingInflater1(JpnPeriodicChooseKpjActivity jpnPeriodicChooseKpjActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (CameraDeviceStateCallbacks) b(setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -617726338, new Object[]{jpnPeriodicChooseKpjActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 617726339);
    }

    static {
        INotificationSideChannel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 45;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJpnPeriodicChooseKpjBinding> TuitionPaymentFragmentbindingInflater1() {
        int iCodePointAt = 474029804 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_unavailable).substring(4, 5).codePointAt(0);
        return (Function1) b(getRatioByPercentage.b.b(), getRatioByPercentage.b.b(), (-31423951) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 470871057, new Object[]{this}, iCodePointAt, -470871057);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setBackpressureStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness).substring(3, 4).codePointAt(0) + 1939630032, getRatioByPercentage.b.b(), getRatioByPercentage.b.b(), -2109197532, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 2109197534)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancelAll + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        asInterface = -4984644546032676395L;
        d = -981105359;
        f613a = (char) 34097;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_jpn_periodic_choose_kpj);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, short r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 + 102
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicChooseKpjActivity.$$i(short, short, int):java.lang.String");
    }
}
