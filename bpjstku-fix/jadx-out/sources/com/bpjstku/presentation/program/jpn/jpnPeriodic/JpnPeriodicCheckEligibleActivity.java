package com.bpjstku.presentation.program.jpn.jpnPeriodic;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.ActivityJpnPeriodicCheckEligibleBinding;
import com.bpjstku.domain.jp.model.GetCountClaimJp;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityMenu;
import com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.IntegerRes;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSessionStateCallback;
import defpackage.getStringOrNull;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.stopRepeating;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0015X\u0095D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0018\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0015\u0010\b\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0015\u0010\u0007\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010\n\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0017\u0010\u0006\u001a\u0004\u0018\u00010%8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicCheckEligibleActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJpnPeriodicCheckEligibleBinding;", "<init>", "()V", "", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "g", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LIntegerRes;", "Lkotlin/Lazy;", "LstopRepeating;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LgetStringOrNull;", "LgetStringOrNull;", "", "Ljava/lang/String;", "d", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "Lcom/bpjstku/domain/user/model/User;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnPeriodicCheckEligibleActivity extends BindingBaseActivity<ActivityJpnPeriodicCheckEligibleBinding> {
    private static boolean INotificationSideChannel;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static boolean cancelAll;
    private static char[] d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getStringOrNull g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String d;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 108;
    private static int getInterfaceDescriptor = 0;
    private static int onTransact = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.activity_jpn_periodic_check_eligible;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private JpDataTk asInterface = new JpDataTk("", "", "", "");

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: createMultiResolutionOutputConfigurationCompats
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i2)) | (~(i7 | i3)) | (~(i2 | i3));
        int i9 = (~(i | i3)) | i2;
        int i10 = (~(i3 | i | i2)) | (~(i7 | (~i2) | (~i3)));
        int i11 = i + i2 + i6 + (862446602 * i4) + (395103901 * i5);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i) - 438566912) + ((-683246085) * i2) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i6) + ((-128450560) * i4) + ((-674496512) * i5) + ((-1108934656) * i12);
        int i14 = (i * 1384179468) + 550727958 + (i2 * 1384180977) + (i8 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) + (i9 * (-1006)) + (i10 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) + (i6 * 1384179971) + (i4 * 1640285726) + (i5 * 120803543) + (i12 * 2025127936);
        int i15 = i13 + (i14 * i14 * (-275709952));
        if (i15 != 1) {
            return i15 != 2 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i16 = 2 % 2;
        int i17 = notify + 71;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
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
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    public JpnPeriodicCheckEligibleActivity() {
        final JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = jpnPeriodicCheckEligibleActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity2 = this;
        this.b = LazyKt.lazy(new Function0<stopRepeating>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, stopRepeating] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ stopRepeating invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicCheckEligibleActivity2;
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicCheckEligibleActivity2;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicCheckEligibleActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JpnPeriodicCheckEligibleActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            int i5 = 17 / 0;
        }
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJpnPeriodicCheckEligibleBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        notify = i2 % 128;
        int i3 = i2 % 2;
        JpnPeriodicCheckEligibleActivity$bindingInflater$1 jpnPeriodicCheckEligibleActivity$bindingInflater$1 = JpnPeriodicCheckEligibleActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = notify + 63;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return jpnPeriodicCheckEligibleActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
        JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity = this;
        Intrinsics.checkNotNullParameter(jpnPeriodicCheckEligibleActivity, "");
        jpnPeriodicCheckEligibleActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityJpnPeriodicCheckEligibleBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJpnPeriodicCheckEligibleBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_jp_periodically_confirmation));
        int i4 = notify + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JpnPeriodicCheckEligibleActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JpnPeriodicCheckEligibleActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JpnPeriodicCheckEligibleActivity.this.d_();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity = this;
        ((stopRepeating) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(jpnPeriodicCheckEligibleActivity, new Observer() { // from class: isInOpenState
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((stopRepeating) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(jpnPeriodicCheckEligibleActivity, new Observer() { // from class: cancelIssuedCaptureRequests
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicCheckEligibleActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(jpnPeriodicCheckEligibleActivity, new Observer() { // from class: getCaptureConfigs
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = notify + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = d;
        if (cArr2 != null) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2994, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, 1182129903, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(cancel)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        float f = 0.0f;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 253, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 33602;
        if (INotificationSideChannel) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                try {
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + i6);
                        int bitsPerPixel = 3084 - ImageFormat.getBitsPerPixel(0);
                        int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString("");
                        byte b3 = (byte) ($$f & 7);
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, bitsPerPixel, iKeyCodeFromString, -2146875848, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i6 = 33602;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!cancelAll) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i9 = $10 + 115;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = $10 + 25;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i13 = $11 + 73;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] % iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSize = (char) (33602 - View.resolveSize(0, 0));
                    int iMyPid = (Process.myPid() >> 22) + 3085;
                    int i14 = 26 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                    byte b5 = (byte) ($$f & 7);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iMyPid, i14, -2146875848, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatTimeout = (char) (33602 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i15 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3084;
                    int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b7 = (byte) ($$f & 7);
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, i15, tapTimeout, -2146875848, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            f = 0.0f;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ((stopRepeating) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i4 = onTransact + 7;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JpnPeriodicCheckEligibleActivity.this.d_();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = notify + 1;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i2 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
            short s = $$a[7];
            byte b = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, scrollBarSize, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_clicks).substring(0, 11).codePointAt(3) + 61, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
            int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 52, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, maxKeyCode, offsetAfter, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) Color.alpha(0);
                int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
                short s2 = (short) ($$b - 4);
                Object[] objArr6 = new Object[1];
                c(s2, (byte) (s2 >>> 1), $$a[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, keyRepeatTimeout, iIndexOf, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i6 = (((1866967784 + (((~((-780899663) | i5)) | 537105418) * 345)) + (((~((-780899663) | (~i5))) | (-1073724911)) * 345)) + ((~(i5 | (-537105419))) * 345)) - 1478673045;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.try_again).substring(6, 7).codePointAt(0) + 30, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {18719916};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 1134, 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1478673045, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                    short s3 = $$a[7];
                    byte b3 = (byte) s3;
                    Object[] objArr12 = new Object[1];
                    c(s3, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, defaultSize, maxKeyCode2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45993), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                    int iGreen = 15 - Color.green(0);
                    short s4 = (short) ($$b - 4);
                    Object[] objArr13 = new Object[1];
                    c(s4, (byte) (s4 >>> 1), $$a[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionType, iGreen, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_error_shopeepay_transaction).substring(0, 6).codePointAt(4) + 12, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(null, null, Color.rgb(0, 0, 0) + 16777343, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                        int iRed = 15 - Color.red(0);
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 52, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, edgeSlop2, iRed, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iBlue = Color.blue(0) + 15;
                        short s5 = $$a[7];
                        byte b5 = (byte) s5;
                        Object[] objArr17 = new Object[1];
                        c(s5, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, pressedStateDuration, iBlue, 1357589585, false, (String) objArr17[0], null);
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
        if (i10 == i9) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i11 = ((int[]) objArr[2])[0];
            int i12 = ((int[]) objArr[3])[0];
            int i13 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = i11 + 1272823593 + (((~(33830437 | iIdentityHashCode)) | 278102410) * 576) + (((~((~iIdentityHashCode) | 311932847)) | FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE) * 576) + 1273198208;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr18[2])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i17 = onTransact + 31;
                notify = i17 % 128;
                int i18 = i17 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i19 = i10 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i19) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[3])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i23 = i20 + (-1408452497) + (((-287814657) | (~iUptimeMillis)) * (-490)) + (((~(iUptimeMillis | 647514518)) | (-935329175)) * 490) + 1107266582;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
            int iAlpha = Color.alpha(0) + 1755;
            int i26 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr20 = new Object[1];
            c((short) ($$b - 4), (byte) 15, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, iAlpha, i26, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16777239;
                byte b6 = $$a[7];
                Object[] objArr21 = new Object[1];
                c((short) 52, b6, b6, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cRgb, iResolveSizeAndState, iRgb, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i27 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step6).substring(20, 21).codePointAt(0) + 1350716671);
            int i28 = (-666745324) + (((~(178027511 | i27)) | (-390629938)) * (-983)) + (((~(i27 | (-390629938))) | 34081329) * 983) + 830839937;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 10, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {18719916};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionType(0L)), Color.rgb(0, 0, 0) + 16778942, 28 - MotionEvent.axisFromString(""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 830839937);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cGreen = (char) (Color.green(0) + 29944);
                int mode = View.MeasureSpec.getMode(0) + 1755;
                int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b7 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 52, b7, b7, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cGreen, mode, scrollBarFadeDuration, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                    int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b8 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 141, b8, b8, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay, offsetBefore, longPressTimeout, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                    int fadingEdgeLength2 = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr30 = new Object[1];
                    c((short) ($$b - 4), (byte) 15, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength, fadingEdgeLength2, iLastIndexOf, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr5 != null) {
                int i33 = onTransact + 89;
                notify = i33 % 128;
                for (int i34 = i33 % 2 != 0 ? 0 : 1; i34 < strArr5.length; i34++) {
                    arrayList2.add(strArr5[i34]);
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i36 = ~iIdentityHashCode2;
        int i37 = i35 + (((1566088347 + (((~(455385962 | i36)) | (~((-667988389) | iIdentityHashCode2))) * (-370))) + ((((~(iIdentityHashCode2 | 455385962)) | (~(i36 | (-667988389)))) | 405013066) * (-370))) - 469020940);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr31[3])[0] = i39 ^ (i39 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ed, code lost:
    
        if (r1 != (((81946460 + ((r3 | r7) * (-516))) + (((~(r2 | (-12158575))) | (~((-272635905) | r6))) * 516)) + ((272635904 | r7) * 516))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ef, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify + 93;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fe, code lost:
    
        r2 = 93 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0101, code lost:
    
        r1 = (-915944418) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010a, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0066, code lost:
    
        if (r1 == ((((-864906616) + (((~(r6 | (-1098465642))) | 268478098) * (-828))) + ((r6 | (-1098465642)) * (-828))) - 1003516004)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        if (r1 == (((281630720 + (((~(1313722884 | r6)) | (-483735342)) * (-948))) + ((~((~r6) | (-277882154))) * (-948))) + 1308054180)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0095, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 744451679;
        r3 = ~(2000705809 | r2);
        r6 = ~r2;
        r3 = r3 | (~(284794478 | r6));
        r7 = ~((-2000705810) | r6);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i5 = 934053288 + ((~(iMyTid | 642947372)) * 216);
        int i6 = ~iMyTid;
        if (i4 != i5 + ((2010889519 | i6) * (-216)) + (((~(i6 | 642947372)) | (-1472934916)) * 216)) {
            int i7 = onTransact + 23;
            notify = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[1946104925];
            iArr[1946104924] = 1;
            int i9 = 1979495788 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i10 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ~iIdentityHashCode;
        if (i10 != (-216160296) + (((~((-624960122) | i11)) | 1954095843) * 519) + (((~(i11 | (-16777241))) | (~(1970873083 | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | 1954095843)) | 624960121) * 519)) {
            throw new RuntimeException("-1579029426");
        }
        super.onStart();
        int i12 = onTransact + 47;
        notify = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0101, code lost:
    
        if (r1 != (((767966968 + (((-1917255718) | r3) * (-369))) + (((~((-219697027) | r3)) | (-1935608358)) * (-369))) + ((((~(r2 | 219697026)) | (-2136952744)) | (~(r3 | (-18352641)))) * 369))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0103, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact + 45;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x010f, code lost:
    
        if ((r11 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0111, code lost:
    
        r11 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0114, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0115, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0116, code lost:
    
        r11 = (-1001465788) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011f, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r1 == (((((~((-801394937) | r6)) | 553926856) * (-566)) - 839999656) + ((~(r6 | (-247468081))) * 566))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009a, code lost:
    
        if (r1 == (((-917711884) + ((r8 | r6) * (-502))) + ((r6 | (~(r7 | (-71436929)))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_DRAWPATH))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.redeem_mandiri_details).substring(87, 89).length() + 822065160;
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = notify + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_jp_periodic", "loading_time_server_jp_periodic"));
            Intrinsics.checkNotNullParameter(jpnPeriodicCheckEligibleActivity, "");
            Intrinsics.checkNotNullParameter("loading_time_server_jp_periodic", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("loading_time_server_jp_periodic", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_jp_periodic", mapMutableMapOf);
            jpnPeriodicCheckEligibleActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_jp_periodic", "success_time_server_jp_periodic"));
            Intrinsics.checkNotNullParameter(jpnPeriodicCheckEligibleActivity, "");
            Intrinsics.checkNotNullParameter("success_time_server_jp_periodic", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("success_time_server_jp_periodic", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_jp_periodic", mapMutableMapOf2);
            jpnPeriodicCheckEligibleActivity.IconCompatParcelizer();
            jpnPeriodicCheckEligibleActivity.d = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity2 = jpnPeriodicCheckEligibleActivity;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_jp_periodic", "failure_time_server_jp_periodic"));
            Intrinsics.checkNotNullParameter(jpnPeriodicCheckEligibleActivity2, "");
            Intrinsics.checkNotNullParameter("failure_time_server_jp_periodic", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("failure_time_server_jp_periodic", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_jp_periodic", mapMutableMapOf3);
            jpnPeriodicCheckEligibleActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicCheckEligibleActivity2, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        int i3 = onTransact + 65;
        notify = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r11 instanceof VirtualCameraAdapter1.asBinder) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r10.IconCompatParcelizer();
        r11 = (VirtualCameraAdapter1.asBinder) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.domain.jp.model.CheckEligibleJp) r11.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "Y") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify + 119;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.domain.jp.model.CheckEligibleJp) r11.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r11 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify + 47;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact = r11 % 128;
        r11 = r11 % 2;
        r10.d_();
        r11 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r10, r10.asInterface);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.domain.jp.model.CheckEligibleJp) r11.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact + 87;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.domain.jp.model.CheckEligibleJp) r11.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3, "Y") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r11 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify + 23;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact = r11 % 128;
        r11 = r11 % 2;
        r11 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.INSTANCE;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicInformationVerifiedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r10, r10.asInterface, false);
        r10.d_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r1 = defpackage.getStringOrNull.INSTANCE;
        r5 = r10.getString(com.bpjstku.R.string.action_information);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r6 = ((com.bpjstku.domain.jp.model.CheckEligibleJp) r11.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b;
        r7 = r10.getString(com.bpjstku.R.string.action_back);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r11 = defpackage.getStringOrNull.Companion.b(com.bpjstku.R.drawable.ic_info_blue, r5, r6, r7, null, 112);
        r10.g = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r1 = r10.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if (r1.findFragmentByTag(r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
    
        r2 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.onTransact + 13;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.notify = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if ((r2 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        r11.show(r1, r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        r11.show(r1, r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        r11 = r10.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
    
        r11.INotificationSideChannel = new com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if ((r11 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        r10.IconCompatParcelizer();
        r0 = defpackage.getStringOrNull.INSTANCE;
        r5 = r10.getString(com.bpjstku.R.string.title_jp_periodically_confirmation);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r6 = java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r11).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        r7 = r10.getString(com.bpjstku.R.string.action_back);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r11 = defpackage.getStringOrNull.Companion.b(com.bpjstku.R.drawable.ic_info_blue, r5, r6, r7, null, 112);
        r10.g = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012e, code lost:
    
        if (r11 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        r0 = r10.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        if (r0.findFragmentByTag(r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0142, code lost:
    
        r11.show(r0, r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0147, code lost:
    
        r11 = r10.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        if (r11 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r11.INotificationSideChannel = new com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentbindingInflater1(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0154, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r11 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r11 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r10.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity r10, defpackage.VirtualCameraAdapter1 r11) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity) {
        int i = 2 % 2;
        int i2 = notify + 81;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            obj.hashCode();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicCheckEligibleActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = notify + 55;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return userAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ void b(JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        int i3 = i2 % 128;
        notify = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            jpnPeriodicCheckEligibleActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = i3 + 77;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                jpnPeriodicCheckEligibleActivity.IconCompatParcelizer();
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = jpnPeriodicCheckEligibleActivity.getString(R.string.title_jp_periodically_confirmation);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string2 = jpnPeriodicCheckEligibleActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, strValueOf, string2, null, 112);
                jpnPeriodicCheckEligibleActivity.g = getstringornullB;
                if (getstringornullB != null) {
                    FragmentManager supportFragmentManager = jpnPeriodicCheckEligibleActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                getStringOrNull getstringornull = jpnPeriodicCheckEligibleActivity.g;
                if (getstringornull != null) {
                    getstringornull.INotificationSideChannel = jpnPeriodicCheckEligibleActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    return;
                }
                return;
            }
            return;
        }
        jpnPeriodicCheckEligibleActivity.IconCompatParcelizer();
        GetCountClaimJp getCountClaimJp = (GetCountClaimJp) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(getCountClaimJp, "");
        if (getCountClaimJp.TuitionPaymentFragmentbindingInflater1 != 0) {
            if (getCountClaimJp.TuitionPaymentFragmentbindingInflater1 == 1) {
                JpDataTk jpDataTk = getCountClaimJp.b.get(0);
                jpnPeriodicCheckEligibleActivity.asInterface = jpDataTk;
                ((stopRepeating) jpnPeriodicCheckEligibleActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(jpDataTk);
                return;
            } else {
                jpnPeriodicCheckEligibleActivity.d_();
                JpnPeriodicChooseKpjActivity.Companion bVar = JpnPeriodicChooseKpjActivity.INSTANCE;
                JpnPeriodicChooseKpjActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jpnPeriodicCheckEligibleActivity);
                return;
            }
        }
        new JpDataTk("0", "0", "0", "0");
        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
        String string3 = jpnPeriodicCheckEligibleActivity.getString(R.string.action_back);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_failed, "Mohon Maaf", "Anda tidak dapat melakukan konfirmasikan JP berkala", string3, null, 112);
        jpnPeriodicCheckEligibleActivity.g = getstringornullB2;
        if (getstringornullB2 != null) {
            int i6 = notify + 117;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                FragmentManager supportFragmentManager2 = jpnPeriodicCheckEligibleActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                supportFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                obj.hashCode();
                throw null;
            }
            FragmentManager supportFragmentManager3 = jpnPeriodicCheckEligibleActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
            if (supportFragmentManager3.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i7 = notify + 7;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                getstringornullB2.show(supportFragmentManager3, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        getStringOrNull getstringornull2 = jpnPeriodicCheckEligibleActivity.g;
        if (getstringornull2 != null) {
            getstringornull2.INotificationSideChannel = jpnPeriodicCheckEligibleActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i9 = notify + 49;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 4;
            }
        }
    }

    static {
        RemoteActionCompatParcelizer = 1;
        g();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 33;
        RemoteActionCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1(131472112, new Object[]{this}, -131472112, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 970425705);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentbindingInflater1(1760664822, new Object[]{this}, -1760664821, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1700417629, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        TuitionPaymentFragmentbindingInflater1(-1343731061, new Object[]{this}, 1343731063, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void g() {
        d = new char[]{47281, 47268, 47278, 47264, 47267, 47273, 47204, 47327, 47295, 47321, 47326, 47277, 47269, 47247, 47270, 47279, 47271, 47266, 47232, 47272, 47324, 47275, 47242, 47274};
        cancel = 2047719506;
        cancelAll = true;
        INotificationSideChannel = true;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        JpnPeriodicCheckEligibleActivity jpnPeriodicCheckEligibleActivity = (JpnPeriodicCheckEligibleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, int r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = 68 - r7
            int r9 = r9 * 2
            int r9 = 4 - r9
            byte[] r0 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r7
            r7 = r6
        L27:
            int r7 = -r7
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity.$$i(byte, int, short):java.lang.String");
    }
}
