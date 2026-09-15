package com.bpjstku.presentation.danasiaga;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.danasiaga.model.request.CheckEligiblePinangRequest;
import com.bpjstku.data.danasiaga.model.response.CheckEligiblePinangResponse;
import com.bpjstku.databinding.ActivityDanasiagaConcentBinding;
import com.bpjstku.domain.danasiaga.model.DanaSiagaService;
import com.bpjstku.domain.ict.model.IctTokenModel;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity;
import com.bpjstku.presentation.ict.WebViewIctActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.createPopupWindow;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.performItemAction;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0015\u0010\u0007\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0015\u0010\u0006\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0015\u0010\b\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/danasiaga/DanaSiagaConcentActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDanasiagaConcentBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "Lcom/bpjstku/domain/danasiaga/model/DanaSiagaService;", "Lcom/bpjstku/domain/danasiaga/model/DanaSiagaService;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LcreatePopupWindow;", "LperformItemAction;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DanaSiagaConcentActivity extends BindingBaseActivity<ActivityDanasiagaConcentBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;
    private static long g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DanaSiagaService TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 177;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {81, 125, 2, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 209;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f482a = 0;
    private static int asInterface = 0;
    private static int asBinder = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 145 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r9 = 53 - r9
            byte[] r0 = com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    public DanaSiagaConcentActivity() {
        final DanaSiagaConcentActivity danaSiagaConcentActivity = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = danaSiagaConcentActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<createPopupWindow>() { // from class: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [createPopupWindow, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final createPopupWindow invoke() {
                ComponentCallbacks componentCallbacks = danaSiagaConcentActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(createPopupWindow.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.a = LazyKt.lazy(new Function0<performItemAction>() { // from class: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, performItemAction] */
            @Override // kotlin.jvm.functions.Function0
            public final performItemAction invoke() {
                ComponentCallbacks componentCallbacks = danaSiagaConcentActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(performItemAction.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDanasiagaConcentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DanaSiagaConcentActivity$bindingInflater$1 danaSiagaConcentActivity$bindingInflater$1 = DanaSiagaConcentActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return danaSiagaConcentActivity$bindingInflater$1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/danasiaga/DanaSiagaConcentActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/danasiaga/model/DanaSiagaService;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/domain/danasiaga/model/DanaSiagaService;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, DanaSiagaService p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) DanaSiagaConcentActivity.class);
            intent.putExtra("KEY_DANA_SIAGA_SERVICE", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityDanasiagaConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).activityDanasiagaAgree;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: internalRemoveItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(g ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char touchSlop = (char) (64838 - (ViewConfiguration.getTouchSlop() >> 8));
                    int i6 = 1356 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int size = View.MeasureSpec.getSize(0) + 38;
                    byte b = (byte) ($$c[3] - 1);
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, i6, size, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47772), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 467, 12 - TextUtils.lastIndexOf("", '0', 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i7 = $10 + 25;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
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
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        DanaSiagaConcentActivity danaSiagaConcentActivity = this;
        ((createPopupWindow) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.observe(danaSiagaConcentActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getSubMenuWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DanaSiagaConcentActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((performItemAction) this.a.getValue()).b.observe(danaSiagaConcentActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getMenuItemWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;
        private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
        private static final int $$f = 131;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {48, -110, 22, 55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 90;
        private static final byte[] $$a = {94, -56, 58, -24, -7, 23, -19, 25, -72, 55, 17, 9, -7, 6, -3, -63, 71, -1, -9, 0, -51, 39, 20, 0, 17, -11, 17, -39, 28, 22, -36, 31, -9, 0};
        private static final int $$b = 187;
        private static int asInterface = 0;
        private static int d = 1;
        private static char b = 1311;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5793;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 14065;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 46235;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                int r6 = r6 * 3
                int r6 = r6 + 31
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r7 = r7 * 2
                int r7 = 106 - r7
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r5 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r8]
            L28:
                int r8 = r8 + 1
                int r7 = r7 + r3
                int r7 = r7 + (-2)
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = 103 - r7
                int r5 = r5 * 52
                int r0 = 53 - r5
                int r6 = r6 * 52
                int r6 = r6 + 4
                byte[] r1 = com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                byte[] r0 = new byte[r0]
                int r5 = 52 - r5
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r5
                r4 = r6
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r1[r6]
            L29:
                int r6 = r6 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.c(int, int, short, java.lang.Object[]):void");
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
                int i4 = $11 + 19;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                char c = 1;
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[c] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3, i3) + 47774);
                            int iCombineMeasuredStates = 468 - View.combineMeasuredStates(i3, i3);
                            int maximumDrawingCacheSize = 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iCombineMeasuredStates, maximumDrawingCacheSize, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 47773), TextUtils.indexOf((CharSequence) "", '0') + 469, 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        c = 1;
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
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.blue(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2323, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (obj instanceof Observer) {
                int i2 = asInterface + 17;
                int i3 = i2 % 128;
                d = i3;
                int i4 = i2 % 2;
                if (obj instanceof FunctionAdapter) {
                    int i5 = i3 + 117;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    Function<?> functionDelegate = getFunctionDelegate();
                    if (i6 == 0) {
                        return Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    boolean zAreEqual = Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
                    int i7 = 81 / 0;
                    return zAreEqual;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = asInterface + 49;
            d = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.TuitionPaymentFragmentbindingInflater1;
            if (i3 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 51;
            d = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = asInterface + 59;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 49;
            d = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
            int i4 = d + 93;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:127:0x093b  */
        /* JADX WARN: Code duplicated, block: B:140:0x05ba A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x06c4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x0529  */
        /* JADX WARN: Code duplicated, block: B:69:0x0536  */
        /* JADX WARN: Code duplicated, block: B:72:0x0553  */
        /* JADX WARN: Code duplicated, block: B:73:0x0566  */
        /* JADX WARN: Code duplicated, block: B:78:0x05c3  */
        /* JADX WARN: Code duplicated, block: B:81:0x060e  */
        /* JADX WARN: Code duplicated, block: B:85:0x0665 A[Catch: all -> 0x0947, TryCatch #0 {all -> 0x0947, blocks: (B:83:0x064e, B:85:0x0665, B:86:0x06ab, B:99:0x072b, B:101:0x0738, B:102:0x0771, B:104:0x0790, B:105:0x07dd), top: B:135:0x064e }] */
        /* JADX WARN: Code duplicated, block: B:88:0x06c2  */
        public static int b(List list) throws Throwable {
            int i;
            int i2;
            boolean z;
            int i3;
            String string;
            Integer num;
            Class<?> cls;
            char[] cArr;
            int scrollDefaultDelay;
            int iB;
            int i4;
            char[] cArr2;
            long packedPositionForGroup;
            int i5;
            int i6;
            Class<?> cls2;
            char[] cArr3;
            Object[] objArr;
            Method method;
            int i7;
            int i8;
            int iB2;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i20 = 2;
            int i21 = 2 % 2;
            byte b2 = $$a[19];
            byte b3 = b2;
            int i22 = 1;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            int i23 = 0;
            Constructor[] constructorArr = {Class.forName((String) objArr3[0]).getDeclaredConstructor(byte[].class, String.class)};
            int i24 = asInterface;
            int i25 = (i24 & 63) + (i24 | 63);
            d = i25 % 128;
            if (i25 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iLastIndexOf = 2822 - TextUtils.lastIndexOf("", '0', 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 23;
                    byte[] bArr = $$d;
                    byte b4 = bArr[7];
                    Object[] objArr4 = new Object[1];
                    c(b4, b4, bArr[54], objArr4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, iLastIndexOf, iLastIndexOf2, 1814927978, false, (String) objArr4[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw null;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 2823;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                byte[] bArr2 = $$d;
                byte b5 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b5, b5, bArr2[54], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay2, mode, keyRepeatDelay, 1814927978, false, (String) objArr5[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 2823, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i26 = 0;
                while (i26 < length) {
                    int i27 = asInterface;
                    int i28 = (i27 ^ 95) + ((i27 & 95) << i22);
                    d = i28 % 128;
                    int i29 = i28 % i20;
                    Method method2 = declaredMethods[i26];
                    int i30 = i27 + 95;
                    d = i30 % 128;
                    int i31 = i30 % i20;
                    try {
                        Object[] objArr6 = new Object[i22];
                        e(new char[]{4216, 4726, 56106, 50349, 61131, 24813, 34064, 16344, 46697, 16756, 43850, 5314, 54392, 10953, 56231, 58521, 41021, 32548, 6222, 55943, 14393, 34180, 16574, 19655, 44149, 46465}, 23 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[i23]);
                        char[] cArr4 = {6229, 63582, 33562, 32678, 743, 8020, 29244, 2254, 63498, 38918, 34454, 18319, 54027, 31250};
                        int defaultSize = View.getDefaultSize(i23, i23);
                        int iB3 = zzn.b();
                        int i32 = defaultSize * (-1975);
                        int i33 = (i32 & 11868) + (i32 | 11868);
                        int i34 = asInterface;
                        int i35 = (i34 ^ 55) + ((i34 & 55) << 1);
                        d = i35 % 128;
                        int i36 = i35 % i20;
                        int i37 = ~defaultSize;
                        int i38 = ~((i37 ^ 12) | (i37 & 12));
                        int i39 = i33 + (((iB3 ^ i38) | (i38 & iB3)) * 988);
                        int i40 = ~(((-13) ^ defaultSize) | ((-13) & defaultSize));
                        int i41 = ~iB3;
                        int i42 = ~((i41 ^ defaultSize) | (i41 & defaultSize));
                        int i43 = ((i40 ^ i42) | (i42 & i40)) * (-1976);
                        int i44 = (i39 ^ i43) + ((i43 & i39) << 1);
                        int i45 = i34 + 107;
                        d = i45 % 128;
                        if (i45 % 2 == 0) {
                            int i46 = (~((i37 & 12) | (i37 ^ 12))) | (~(((-13) & iB3) | ((-13) ^ iB3)));
                            int i47 = ~(i41 | 12);
                            int i48 = (i47 & i46) | (i46 ^ i47);
                            Object[] objArr7 = new Object[1];
                            e(cArr4, i44 >> ((i48 & 988) + (i48 | 988)), objArr7);
                            num = (Integer) cls3.getMethod((String) objArr7[0], null).invoke(method2, null);
                        } else {
                            int i49 = ~defaultSize;
                            int i50 = ~((i49 & 12) | (i49 ^ 12));
                            int i51 = ~(((-13) & iB3) | ((-13) ^ iB3));
                            int i52 = ((i50 & i51) | (i50 ^ i51) | (~((~iB3) | 12))) * 988;
                            Object[] objArr8 = new Object[1];
                            e(cArr4, (i44 & i52) + (i52 | i44), objArr8);
                            num = (Integer) cls3.getMethod((String) objArr8[0], null).invoke(method2, null);
                        }
                        Object[] objArr9 = {Integer.valueOf(num.intValue())};
                        char[] cArr5 = {49013, 39661, 31042, 53598, 5720, 36534, 30672, 4026, 6868, 25114, 8399, 31881, 17634, 32413, 23501, 16807, 54498, 36835, 1501, 14207, 33470, 26832, 34272, 21349, 16884, 51024, 11870, 9316};
                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                        int iB4 = zzn.b();
                        int i53 = scrollBarFadeDuration * 465;
                        int i54 = (i53 ^ (-12038)) + ((i53 & (-12038)) << 1);
                        int i55 = d;
                        int i56 = (i55 & 11) + (i55 | 11);
                        int i57 = i56 % 128;
                        asInterface = i57;
                        int i58 = i56 % 2;
                        int i59 = ~iB4;
                        int i60 = ((-27) & scrollBarFadeDuration) | ((-27) ^ scrollBarFadeDuration);
                        int i61 = (~((i59 & (-27)) | ((-27) ^ i59))) | (~i60);
                        int i62 = ~iB4;
                        int i63 = ~((i62 & scrollBarFadeDuration) | (i62 ^ scrollBarFadeDuration));
                        int i64 = -(-(464 * ((i61 & i63) | (i61 ^ i63))));
                        int i65 = (i54 ^ i64) + ((i54 & i64) << 1);
                        int i66 = ~scrollBarFadeDuration;
                        int i67 = (i66 & iB4) | (iB4 ^ i66);
                        int i68 = ((i67 & (-27)) | (i67 ^ (-27))) * (-464);
                        int i69 = (i57 & 85) + (i57 | 85);
                        d = i69 % 128;
                        if (i69 % 2 == 0) {
                            int i70 = ~((-27) | scrollBarFadeDuration);
                            int i71 = ~((scrollBarFadeDuration & iB4) | (scrollBarFadeDuration ^ iB4));
                            Object[] objArr10 = new Object[1];
                            e(cArr5, (i65 % i68) / (464 >>> ((i71 & i70) | (i70 ^ i71))), objArr10);
                            cls = Class.forName((String) objArr10[0]);
                            cArr = new char[]{2658, 59769, 14657, 55715, 56365, 20663, 34443, 61574, 28507, 'E'};
                            scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 35;
                            iB = zzn.b();
                            i4 = 39;
                        } else {
                            int i72 = (i65 ^ i68) + ((i68 & i65) << 1);
                            int i73 = ~i60;
                            int i74 = ~(scrollBarFadeDuration | iB4);
                            int i75 = -(-(((i74 & i73) | (i73 ^ i74)) * 464));
                            int i76 = (i72 ^ i75) + ((i75 & i72) << 1);
                            Object[] objArr11 = new Object[1];
                            e(cArr5, i76, objArr11);
                            cls = Class.forName((String) objArr11[0]);
                            cArr = new char[]{2658, 59769, 14657, 55715, 56365, 20663, 34443, 61574, 28507, 'E'};
                            scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            iB = zzn.b();
                            i4 = 8;
                        }
                        int i77 = scrollDefaultDelay * 980;
                        int i78 = -(-(i4 * (-978)));
                        int i79 = (i77 & i78) + (i77 | i78);
                        int i80 = -(-((~((~i4) | (~iB))) * 979));
                        int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                        int i82 = ((scrollDefaultDelay ^ iB) | (scrollDefaultDelay & iB)) * (-979);
                        int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                        int i84 = ~i4;
                        int i85 = ~((i84 & iB) | (i84 ^ iB));
                        int i86 = ~iB;
                        int i87 = ~((scrollDefaultDelay & i86) | (i86 ^ scrollDefaultDelay));
                        int i88 = -(-(((i87 & i85) | (i85 ^ i87)) * 979));
                        int i89 = (i83 ^ i88) + ((i88 & i83) << 1);
                        Object[] objArr12 = new Object[1];
                        e(cArr, i89, objArr12);
                        if (((Boolean) cls.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr9)).booleanValue()) {
                            int i90 = asInterface;
                            int i91 = ((i90 | 19) << 1) - (i90 ^ 19);
                            d = i91 % 128;
                            int i92 = i91 % 2;
                            Class cls4 = Long.TYPE;
                            if (i92 == 0) {
                                cArr2 = new char[]{4216, 4726, 56106, 50349, 61131, 24813, 34064, 16344, 46697, 16756, 43850, 5314, 54392, 10953, 56231, 58521, 41021, 32548, 6222, 55943, 14393, 34180, 16574, 19655, 44149, 46465};
                                packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
                                i5 = 29;
                            } else {
                                cArr2 = new char[]{4216, 4726, 56106, 50349, 61131, 24813, 34064, 16344, 46697, 16756, 43850, 5314, 54392, 10953, 56231, 58521, 41021, 32548, 6222, 55943, 14393, 34180, 16574, 19655, 44149, 46465};
                                packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
                                i5 = 24;
                            }
                            int i93 = (i5 - (~(-(packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1))))) - 1;
                            Object[] objArr13 = new Object[1];
                            e(cArr2, i93, objArr13);
                            Class<?> cls5 = Class.forName((String) objArr13[0]);
                            int i94 = -(ViewConfiguration.getScrollBarSize() >> 8);
                            int i95 = ((i94 | 13) << 1) - (i94 ^ 13);
                            Object[] objArr14 = new Object[1];
                            e(new char[]{27945, 12755, 10647, 9019, 4300, 8661, 984, 44175, 53263, 35157, 4136, 25526, 5149, 34244, 19659, 24429}, i95, objArr14);
                            if (cls4.equals(cls5.getMethod((String) objArr14[0], null).invoke(method2, null))) {
                                char[] cArr6 = {4216, 4726, 56106, 50349, 61131, 24813, 34064, 16344, 46697, 16756, 43850, 5314, 54392, 10953, 56231, 58521, 41021, 32548, 6222, 55943, 14393, 34180, 16574, 19655, 44149, 46465};
                                int i96 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int iB5 = zzn.b();
                                int i97 = i96 * 71;
                                int i98 = (i97 & (-1656)) + (i97 | (-1656));
                                int i99 = asInterface;
                                int i100 = ((i99 | 51) << 1) - (i99 ^ 51);
                                d = i100 % 128;
                                if (i100 % 2 == 0) {
                                    int i101 = ~i96;
                                    int i102 = ~((i101 & 24) | (i101 ^ 24));
                                    int i103 = ~((iB5 ^ 24) | (iB5 & 24));
                                    i6 = (-140) >>> ((i102 & i103) | (i102 ^ i103));
                                } else {
                                    int i104 = ~i96;
                                    i6 = ((~((i104 & 24) | (i104 ^ 24))) | (~((iB5 ^ 24) | (iB5 & 24)))) * (-140);
                                }
                                int i105 = (i98 ^ i6) + ((i98 & i6) << 1);
                                int i106 = (~((i96 ^ 24) | (i96 & 24) | iB5)) * 70;
                                int i107 = (i105 & i106) + (i106 | i105);
                                int i108 = ~((~i96) | 24);
                                int i109 = ~((-25) | i96);
                                int i110 = i99 + 63;
                                d = i110 % 128;
                                if (i110 % 2 == 0) {
                                    int i111 = (i108 ^ i109) | (i108 & i109);
                                    int i112 = ~(i96 | iB5);
                                    Object[] objArr15 = new Object[1];
                                    e(cArr6, i107 / (70 >>> ((i112 & i111) | (i111 ^ i112))), objArr15);
                                    cls2 = Class.forName((String) objArr15[0]);
                                    cArr3 = new char[20];
                                } else {
                                    int i113 = (i107 - (~(((~((i96 & iB5) | (i96 ^ iB5))) | (i108 | i109)) * 70))) - 1;
                                    Object[] objArr16 = new Object[1];
                                    e(cArr6, i113, objArr16);
                                    cls2 = Class.forName((String) objArr16[0]);
                                    cArr3 = new char[20];
                                }
                                // fill-array-data instruction
                                cArr3[0] = 63386;
                                cArr3[1] = 25950;
                                cArr3[2] = 9379;
                                cArr3[3] = 38717;
                                cArr3[4] = 53404;
                                cArr3[5] = 64057;
                                cArr3[6] = 33851;
                                cArr3[7] = 1579;
                                cArr3[8] = 28883;
                                cArr3[9] = 46860;
                                cArr3[10] = 7330;
                                cArr3[11] = 35125;
                                cArr3[12] = 53303;
                                cArr3[13] = 25423;
                                cArr3[14] = 24356;
                                cArr3[15] = 42234;
                                cArr3[16] = 43917;
                                cArr3[17] = 59545;
                                cArr3[18] = 18897;
                                cArr3[19] = 28393;
                                int i114 = d;
                                int i115 = (i114 & 123) + (i114 | 123);
                                asInterface = i115 % 128;
                                if (i115 % 2 != 0) {
                                    int i116 = -(ViewConfiguration.getTouchSlop() + 71);
                                    int i117 = (i116 ^ 109) + ((i116 & 109) << 1);
                                    Object[] objArr17 = new Object[1];
                                    e(cArr3, i117, objArr17);
                                    method = cls2.getMethod((String) objArr17[0], null);
                                    objArr = null;
                                } else {
                                    Object[] objArr18 = new Object[1];
                                    e(cArr3, 17 - (ViewConfiguration.getTouchSlop() >> 8), objArr18);
                                    objArr = null;
                                    method = cls2.getMethod((String) objArr18[0], null);
                                }
                                Object[] objArr19 = (Object[]) method.invoke(method2, objArr);
                                if (objArr19.length == 2) {
                                    int i118 = d;
                                    int i119 = (i118 ^ 33) + ((i118 & 33) << 1);
                                    asInterface = i119 % 128;
                                    int i120 = i119 % 2;
                                    Class cls6 = Long.TYPE;
                                    if (i120 == 0) {
                                        i7 = 0;
                                        if (!(!cls6.equals(objArr19[0]))) {
                                            char[] cArr7 = {4216, 4726, 56106, 50349, 61131, 24813, 34064, 16344, 46697, 16756, 43850, 5314, 54392, 10953, 56231, 58521, 41021, 32548, 6222, 55943, 14393, 34180, 16574, 19655, 44149, 46465};
                                            i8 = -(ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1));
                                            iB2 = zzn.b();
                                            int i121 = asInterface;
                                            int i122 = (i121 & 77) + (i121 | 77);
                                            int i123 = i122 % 128;
                                            d = i123;
                                            int i124 = i122 % 2;
                                            int i125 = i8 * 141;
                                            i9 = ((i125 | (-3336)) << 1) - (i125 ^ (-3336));
                                            int i126 = ((i123 | 57) << 1) - (i123 ^ 57);
                                            asInterface = i126 % 128;
                                            int i127 = i126 % 2;
                                            i10 = ~i8;
                                            i11 = ~((i10 ^ 24) | (i10 & 24));
                                            i12 = ~((i10 ^ iB2) | (i10 & iB2));
                                            i13 = ((i123 | 9) << 1) - (i123 ^ 9);
                                            int i128 = i13 % 128;
                                            asInterface = i128;
                                            if (i13 % 2 != 0) {
                                                i14 = i9 >> ((-280) >> ((i11 ^ i12) | (i11 & i12)));
                                                i15 = (i10 ^ iB2) | (i10 & iB2);
                                            } else {
                                                int i129 = -(-(((i11 ^ i12) | (i11 & i12)) * (-280)));
                                                i14 = (i129 | i9) + (i9 & i129);
                                                i15 = i10 | iB2;
                                            }
                                            i16 = ~i15;
                                            i17 = (i128 & 105) + (i128 | 105);
                                            d = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                int i130 = ~((-25) | iB2);
                                                int i131 = -(-(139 - (~((i16 & i130) | (i16 ^ i130)))));
                                                i18 = ((i14 | i131) << 1) - (i14 ^ i131);
                                                i19 = ~i8;
                                            } else {
                                                int i132 = -(-(140 * (i16 | (~(((-25) & iB2) | ((-25) ^ iB2))))));
                                                i18 = (i14 & i132) + (i14 | i132);
                                                i19 = i10;
                                            }
                                            int i133 = (i19 & (-25)) | (i19 ^ (-25));
                                            int i134 = ~((i133 & iB2) | (i133 ^ iB2));
                                            int i135 = ~iB2;
                                            int i136 = (i135 & i10) | (i10 ^ i135);
                                            int i137 = ~((i136 & 24) | (i136 ^ 24));
                                            int i138 = ~iB2;
                                            int i139 = (i138 & (-25)) | ((-25) ^ i138);
                                            int i140 = (i18 - (~(140 * (((i134 & i137) | (i134 ^ i137)) | (~((i8 & i139) | (i139 ^ i8))))))) - 1;
                                            objArr2 = new Object[1];
                                            e(cArr7, i140, objArr2);
                                            if (Class.forName((String) objArr2[0]).equals(objArr19[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
                                                    int iBlue = 22 - Color.blue(0);
                                                    byte[] bArr3 = $$d;
                                                    byte b6 = bArr3[7];
                                                    Object[] objArr20 = new Object[1];
                                                    c(b6, b6, bArr3[54], objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, touchSlop, iBlue, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823;
                                                    int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                                    byte[] bArr4 = $$d;
                                                    byte b7 = bArr4[7];
                                                    Object[] objArr21 = new Object[1];
                                                    c(b7, b7, bArr4[54], objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, keyRepeatTimeout, packedPositionGroup, 1814927978, false, (String) objArr21[0], null);
                                                }
                                                Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                                    int mode2 = View.MeasureSpec.getMode(0) + 2823;
                                                    int i141 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                                                    byte[] bArr5 = $$d;
                                                    byte b8 = (byte) (-bArr5[5]);
                                                    Object[] objArr23 = new Object[1];
                                                    c(b8, b8, bArr5[7], objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, mode2, i141, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr22)).longValue();
                                                int i142 = d + 97;
                                                asInterface = i142 % 128;
                                                int i143 = i142 % 2;
                                                break;
                                            }
                                        }
                                    } else if (cls6.equals(objArr19[1])) {
                                        i7 = 0;
                                        char[] cArr8 = {4216, 4726, 56106, 50349, 61131, 24813, 34064, 16344, 46697, 16756, 43850, 5314, 54392, 10953, 56231, 58521, 41021, 32548, 6222, 55943, 14393, 34180, 16574, 19655, 44149, 46465};
                                        i8 = -(ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1));
                                        iB2 = zzn.b();
                                        int i1210 = asInterface;
                                        int i1211 = (i1210 & 77) + (i1210 | 77);
                                        int i1212 = i1211 % 128;
                                        d = i1212;
                                        int i1213 = i1211 % 2;
                                        int i1214 = i8 * 141;
                                        i9 = ((i1214 | (-3336)) << 1) - (i1214 ^ (-3336));
                                        int i1215 = ((i1212 | 57) << 1) - (i1212 ^ 57);
                                        asInterface = i1215 % 128;
                                        int i1216 = i1215 % 2;
                                        i10 = ~i8;
                                        i11 = ~((i10 ^ 24) | (i10 & 24));
                                        i12 = ~((i10 ^ iB2) | (i10 & iB2));
                                        i13 = ((i1212 | 9) << 1) - (i1212 ^ 9);
                                        int i1217 = i13 % 128;
                                        asInterface = i1217;
                                        if (i13 % 2 != 0) {
                                            i14 = i9 >> ((-280) >> ((i11 ^ i12) | (i11 & i12)));
                                            i15 = (i10 ^ iB2) | (i10 & iB2);
                                        } else {
                                            int i1218 = -(-(((i11 ^ i12) | (i11 & i12)) * (-280)));
                                            i14 = (i1218 | i9) + (i9 & i1218);
                                            i15 = i10 | iB2;
                                        }
                                        i16 = ~i15;
                                        i17 = (i1217 & 105) + (i1217 | 105);
                                        d = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            int i1310 = ~((-25) | iB2);
                                            int i1311 = -(-(139 - (~((i16 & i1310) | (i16 ^ i1310)))));
                                            i18 = ((i14 | i1311) << 1) - (i14 ^ i1311);
                                            i19 = ~i8;
                                        } else {
                                            int i1312 = -(-(140 * (i16 | (~(((-25) & iB2) | ((-25) ^ iB2))))));
                                            i18 = (i14 & i1312) + (i14 | i1312);
                                            i19 = i10;
                                        }
                                        int i1313 = (i19 & (-25)) | (i19 ^ (-25));
                                        int i1314 = ~((i1313 & iB2) | (i1313 ^ iB2));
                                        int i1315 = ~iB2;
                                        int i1316 = (i1315 & i10) | (i10 ^ i1315);
                                        int i1317 = ~((i1316 & 24) | (i1316 ^ 24));
                                        int i1318 = ~iB2;
                                        int i1319 = (i1318 & (-25)) | ((-25) ^ i1318);
                                        int i144 = (i18 - (~(140 * (((i1314 & i1317) | (i1314 ^ i1317)) | (~((i8 & i1319) | (i1319 ^ i8))))))) - 1;
                                        objArr2 = new Object[1];
                                        e(cArr8, i144, objArr2);
                                        if (Class.forName((String) objArr2[0]).equals(objArr19[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                                                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
                                                int iBlue2 = 22 - Color.blue(0);
                                                byte[] bArr6 = $$d;
                                                byte b9 = bArr6[7];
                                                Object[] objArr24 = new Object[1];
                                                c(b9, b9, bArr6[54], objArr24);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, touchSlop2, iBlue2, 1814927978, false, (String) objArr24[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823;
                                                int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                                byte[] bArr7 = $$d;
                                                byte b10 = bArr7[7];
                                                Object[] objArr25 = new Object[1];
                                                c(b10, b10, bArr7[54], objArr25);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout2, keyRepeatTimeout2, packedPositionGroup2, 1814927978, false, (String) objArr25[0], null);
                                            }
                                            try {
                                                Object[] objArr26 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                                    int mode3 = View.MeasureSpec.getMode(0) + 2823;
                                                    int i145 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                                                    byte[] bArr8 = $$d;
                                                    byte b11 = (byte) (-bArr8[5]);
                                                    Object[] objArr27 = new Object[1];
                                                    c(b11, b11, bArr8[7], objArr27);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, mode3, i145, -2137287382, false, (String) objArr27[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr26)).longValue();
                                                int i146 = d + 97;
                                                asInterface = i146 % 128;
                                                int i147 = i146 % 2;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int i148 = i26 - 110;
                        i26 = ((i148 | 111) << 1) - (i148 ^ 111);
                        declaredMethods = declaredMethods;
                        i20 = 2;
                        i23 = 0;
                        i22 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2823;
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
                byte[] bArr9 = $$d;
                byte b12 = bArr9[7];
                Object[] objArr28 = new Object[1];
                c(b12, b12, bArr9[54], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup3, offsetBefore, windowTouchSlop, 1814927978, false, (String) objArr28[0], null);
            }
            Object[] objArr29 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iArgb = Color.argb(0, 0, 0, 0) + 2823;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
                byte b13 = (byte) (-$$d[5]);
                byte b14 = b13;
                Object[] objArr30 = new Object[1];
                c(b13, b14, (byte) (b14 + 4), objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iArgb, iResolveOpacity, 1025296417, false, (String) objArr30[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr29);
            Object[] objArr31 = {0, constructorArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char c3 = (char) (37656 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int packedPositionGroup4 = 2720 - ExpandableListView.getPackedPositionGroup(0L);
                int i149 = 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr10 = $$d;
                byte b15 = (byte) (-bArr10[5]);
                Object[] objArr32 = new Object[1];
                c(b15, b15, bArr10[14], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, packedPositionGroup4, i149, 865785343, false, (String) objArr32[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr31)).longValue();
            int i150 = d;
            int i151 = ((i150 | 123) << 1) - (i150 ^ 123);
            asInterface = i151 % 128;
            int i152 = i151 % 2;
            long j = 251847774;
            long j2 = 253;
            long j3 = (j2 * j) + (j2 * jLongValue);
            long j4 = -252;
            long j5 = -1;
            long j6 = jLongValue ^ j5;
            long j7 = ((j ^ j5) | j6) ^ j5;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j8 = j6 | (startUptimeMillis ^ j5);
            long j9 = jLongValue | j;
            long j10 = (j9 | startUptimeMillis) ^ j5;
            long j11 = j3 + ((j7 | (j8 ^ j5) | j10) * j4) + (j4 * j9) + (((long) 252) * (j10 | ((j8 | j) ^ j5))) + ((long) (-1275903396));
            int iNextInt = new Random().nextInt();
            int i153 = ~iNextInt;
            int i154 = ((((~((-1120963845) | i153)) | (~(316262566 | iNextInt))) * 959) - 1472152249) + (((~(iNextInt | (-1120963845))) | (~(i153 | 316262566))) * 959);
            int i155 = asInterface;
            int i156 = (i155 ^ 93) + ((i155 & 93) << 1);
            d = i156 % 128;
            int i157 = ((int) (j11 >> 32)) & i154;
            int i158 = (int) j11;
            if (i156 % 2 == 0) {
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i159 = ~iMaxMemory;
                int i160 = ~(1093143917 | i159);
                int i161 = i158 & ((-104023955) + ((671453312 | i160) * (-712)) + (((~(iMaxMemory | 1764597229)) | (~(i159 | (-671453313)))) * (-712)) + (((-1764596969) | i160) * 712));
                i = (i157 & i161) | (i157 ^ i161);
                i2 = 125;
            } else {
                int i162 = ~Process.myTid();
                i = i157 | (i158 & (1019428157 + (((~(i162 | (-1052950))) | (~(1862187903 | i162))) * (-184)) + ((211954272 | (~(1650233631 | i162)) | (~((-213007222) | i162))) * 184) + 1493432344));
                i2 = 24;
            }
            int i163 = i >>> i2;
            int i164 = i & ViewCompat.MEASURED_SIZE_MASK;
            if (i163 != 0) {
                int i165 = d;
                int i166 = ((i165 | 87) << 1) - (i165 ^ 87);
                asInterface = i166 % 128;
                int i167 = i166 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3 = 1;
            } else {
                int i168 = d + 69;
                asInterface = i168 % 128;
                int i169 = i168 % 2;
                i3 = 0;
            }
            if (z) {
                int i170 = d;
                int i171 = ((i170 | 45) << 1) - (i170 ^ 45);
                asInterface = i171 % 128;
                int i172 = i171 % 2;
                if (i164 < 1) {
                    int i173 = (i170 & 75) + (i170 | 75);
                    asInterface = i173 % 128;
                    int i174 = i173 % 2;
                    Constructor constructor = constructorArr[i164];
                    if (constructor != null) {
                        int i175 = i170 + 37;
                        asInterface = i175 % 128;
                        if (i175 % 2 != 0) {
                            constructor.toString();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        string = constructor.toString();
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            list.add(string);
            return (i163 + 6) * i3;
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
        private static java.lang.String $$g(short r6, int r7, byte r8) {
            /*
                byte[] r0 = com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                int r6 = r6 * 4
                int r1 = r6 + 1
                int r7 = r7 * 2
                int r7 = 3 - r7
                int r8 = r8 * 3
                int r8 = 108 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r7 = r7 + 1
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$g(short, int, byte):java.lang.String");
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = asBinder + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentbindingInflater1(((ActivityDanasiagaConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityDanasiagaConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_danasiaga));
        ActivityDanasiagaConcentBinding activityDanasiagaConcentBinding = (ActivityDanasiagaConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        DanaSiagaService danaSiagaService = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (danaSiagaService != null) {
            int i4 = asBinder + 63;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                numValueOf = Integer.valueOf(danaSiagaService.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i5 = 5 / 0;
            } else {
                numValueOf = Integer.valueOf(danaSiagaService.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            activityDanasiagaConcentBinding.activityDanasiagaTitle.setText(getString(R.string.tnc_danasiaga_by_pinang_flexi_title));
            activityDanasiagaConcentBinding.activityDanasiagaContent.setText(getString(R.string.label_danasiaga_consent_content));
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2) {
            return;
        }
        int i6 = asInterface + 25;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            activityDanasiagaConcentBinding.activityDanasiagaTitle.setText(getString(R.string.tnc_danasiaga_title));
            activityDanasiagaConcentBinding.activityDanasiagaContent.setText(getString(R.string.tnc_danasiaga_content));
            int i7 = 59 / 0;
        } else {
            activityDanasiagaConcentBinding.activityDanasiagaTitle.setText(getString(R.string.tnc_danasiaga_title));
            activityDanasiagaConcentBinding.activityDanasiagaContent.setText(getString(R.string.tnc_danasiaga_content));
        }
        int i8 = asBinder + 97;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = asInterface + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int i3 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, i3, keyRepeatTimeout, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{45266, 35381, 41571, 48782, 45235, 25476, 29113, 865, 6081, 6919, 55613, 56249, 65093, 45713, 33019, 45640, 18143, 27157, 26661, 2810, 11599, 3513, 54177, 58732, 62941, 42261}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{64487, 28867, 29376, 39918, 64386, 39280, 41247, 9731, 23784, 57853, 2462, 65189, 46458, 18549, 20506, 38671, 3578, 37117, 47255}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_instruction_text).substring(0, 53).length() - 52, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
            int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 89, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, absoluteGravity, iNormalizeMetaState, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iAlpha = Color.alpha(0) + 1031;
                int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                Object[] objArr6 = new Object[1];
                c((short) 37, $$a[132], (byte) ($$b >>> 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iAlpha, iResolveSizeAndState, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i6 = ~iFreeMemory;
            int i7 = ((((-1110225) + (((~((-974521397) | i6)) | (-730241227)) * (-602))) + ((((~(iFreeMemory | (-974521397))) | 269485108) | (~((-25204939) | i6))) * (-301))) + ((~(i6 | (-730241227))) * 301)) - 1650474248;
            int i8 = i7 ^ (i7 << 13);
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            int i10 = asBinder + 101;
            asInterface = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 2;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{52284, 34675, 31043, 27430, 52310, 28365, 43659, 55002, 27502, 5700, 536, 3665, 33443, 49034, 23462, 26570, 14907, 26452, 45844, 57178}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay).substring(0, 16).codePointAt(12) - 106, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{1889, 59524, 18256, 49700, 1800, 319, 38027, 32727, 41065, 31158, 15390, 42820, 18897, 53298, 26005, 52953, 61782, 2232, 36102, 30288}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1908237117};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myPid() >> 22) + 46038), 1134 - (ViewConfiguration.getTapTimeout() >> 16), 18 - KeyEvent.keyCodeFromString(""), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1650474248, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                    byte b3 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 141, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, touchSlop, iResolveOpacity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45993), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1117, TextUtils.indexOf("", "") + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cBlue = (char) Color.blue(0);
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int i12 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    Object[] objArr13 = new Object[1];
                    c((short) 37, $$a[132], (byte) ($$b >>> 2), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, touchSlop2, i12, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{45266, 35381, 41571, 48782, 45235, 25476, 29113, 865, 6081, 6919, 55613, 56249, 65093, 45713, 33019, 45640, 18143, 27157, 26661, 2810, 11599, 3513, 54177, 58732, 62941, 42261}, TextUtils.indexOf("", "") + 1, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{64487, 28867, 29376, 39918, 64386, 39280, 41247, 9731, 23784, 57853, 2462, 65189, 46458, 18549, 20506, 38671, 3578, 37117, 47255}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iResolveOpacity2 = 1031 - Drawable.resolveOpacity(0, 0);
                        int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 89, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, iResolveOpacity2, i13, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iRed = Color.red(0) + 1031;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity, iRed, pressedStateDuration, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = asBinder + 63;
        asInterface = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i22 = ~i21;
        int i23 = i18 + (-1232861766) + ((i21 | 71280662) * (-859)) + (((~(i21 | (-1015827))) | (~(71280662 | i22))) * 859) + (((~((-172999508) | i22)) | 171983681) * 859);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
            int i26 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
            int i27 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b6 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((short) 37, b6, (byte) (b6 | 15), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(threadPriority, i26, i27, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i28 = asBinder + 3;
            asInterface = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                int i30 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                byte b7 = $$a[7];
                Object[] objArr20 = new Object[1];
                c((short) 89, b7, b7, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(modifierMetaStateMask, i30, scrollBarFadeDuration, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i31 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i31}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i33 = 1196619647 + (((~((-611071259) | i32)) | 71312384 | (~((-398468833) | i32))) * (-754));
            int i34 = ~((-71312385) | i32);
            int i35 = ~i32;
            int i36 = i33 + ((i34 | (~((-327156449) | i35))) * (-754)) + ((i35 | (-611071259)) * 754) + 651841333;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{52284, 34675, 31043, 27430, 52310, 28365, 43659, 55002, 27502, 5700, 536, 3665, 33443, 49034, 23462, 26570, 14907, 26452, 45844, 57178}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{1889, 59524, 18256, 49700, 1800, 319, 38027, 32727, 41065, 31158, 15390, 42820, 18897, 53298, 26005, 52953, 61782, 2232, 36102, 30288}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1908237117};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - Color.alpha(0)), 1726 - Color.green(0), Color.rgb(0, 0, 0) + 16777245, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 651841333, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                int i39 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 89, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid, iIndexOf, i39, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{45266, 35381, 41571, 48782, 45235, 25476, 29113, 865, 6081, 6919, 55613, 56249, 65093, 45713, 33019, 45640, 18143, 27157, 26661, 2810, 11599, 3513, 54177, 58732, 62941, 42261}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 115, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{64487, 28867, 29376, 39918, 64386, 39280, 41247, 9731, 23784, 57853, 2462, 65189, 46458, 18549, 20506, 38671, 3578, 37117, 47255}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 23;
                    short s = $$a[7];
                    byte b9 = (byte) s;
                    Object[] objArr28 = new Object[1];
                    c(s, b9, b9, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(fadingEdgeLength, maxKeyCode, iResolveSizeAndState2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                    int pressedStateDuration2 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte b10 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 37, b10, (byte) (b10 | 15), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid, pressedStateDuration2, keyRepeatDelay, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                arrayList2.add(strArr4[i2]);
                i2++;
            }
            throw null;
        }
        int i40 = asBinder + 55;
        asInterface = i40 % 128;
        int i41 = i40 % 2;
        int i42 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr30 = {new int[]{i43}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i45 = i42 + 370336724 + (((-201533442) | i44) * (-627)) + (((~(526593121 | i44)) | 739195547) * (-627)) + (((~(i44 | 739195547)) | (~((~i44) | (-526593122)))) * 627);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr30[3])[0] = i47 ^ (i47 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1846660798
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
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i5 = ~iMyTid;
        if (i4 != 1572274376 + (((~((-910323478) | i5)) | 71320596) * 184) + ((iMyTid | (-919338816)) * (-184)) + ((~((-80335935) | i5)) * 184)) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i6 != ((~(iMyPid | (-1916240057))) * TypedValues.CycleType.TYPE_EASING) + 926365512 + (((~((~iMyPid) | (-1916240057))) | 163595781) * TypedValues.CycleType.TYPE_EASING)) {
            throw new RuntimeException("-1159812732");
        }
        super.onStart();
        int i7 = asInterface + 1;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00fd, code lost:
    
        if (r1 != (((221489124 + (((~r2) | 1777949351) * 1444)) + (((~(r2 | (-1747323582))) | ((~(31412250 | r2)) | 1746930341)) * (-1444))) + 515789360)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ff, code lost:
    
        super.onCreate(r13);
        r13 = com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.asInterface + 63;
        com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.asBinder = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x010b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0113, code lost:
    
        throw new java.lang.RuntimeException("2004882798");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
    
        r13 = (-387276940) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011d, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0068, code lost:
    
        if (r1 == ((r9 + ((r7 | (~(r8 | (-1074331689)))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(r6 | (-1074331689))) | (~(1593829247 | r8))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009e, code lost:
    
        if (r1 == (((914202440 + (((~((~r6) | (-538992641))) | (~((-1208622116) | r6))) * (-302))) + ((~((-538992641) | r6)) * (-604))) + (((~(r6 | (-1747614756))) | (-2126249328)) * 302))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a0, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.shipping_address).substring(12, 13).codePointAt(0) - 1242377539;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DanaSiagaConcentActivity danaSiagaConcentActivity, View view) {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            DanaSiagaService danaSiagaService = danaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        DanaSiagaService danaSiagaService2 = danaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Integer numValueOf = danaSiagaService2 != null ? Integer.valueOf(danaSiagaService2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            int i4 = asInterface + 19;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivityResultContractsPickVisualMediaMediaCapabilities) danaSiagaConcentActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                throw null;
            }
            final createPopupWindow createpopupwindow = (createPopupWindow) danaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) danaSiagaConcentActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str2 = userAsBinder != null ? userAsBinder.b : null;
            if (str2 == null) {
                str2 = "";
            }
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) danaSiagaConcentActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder2 != null) {
                str = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = asInterface + 71;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str = null;
            }
            if (str == null) {
                int i7 = asBinder + 105;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str = "";
            }
            CheckEligiblePinangRequest checkEligiblePinangRequest = new CheckEligiblePinangRequest(str2, str);
            Intrinsics.checkNotNullParameter(checkEligiblePinangRequest, "");
            MutableLiveData<VirtualCameraAdapter1<CheckEligiblePinangResponse>> mutableLiveData = createpopupwindow.b;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(createpopupwindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkEligiblePinangRequest)));
            if (derivecodecB != null) {
                final Function1 function1 = new Function1() { // from class: CascadingMenuPopup
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return createPopupWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createpopupwindow, (CheckEligiblePinangResponse) obj2);
                    }
                };
                logToString logtostring = new logToString() { // from class: findIndexOfAddedMenu
                    @Override // defpackage.logToString
                    public final void accept(Object obj2) {
                        function1.invoke(obj2);
                    }
                };
                final Function1 function2 = new Function1() { // from class: internalRemoveGroup
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return createPopupWindow.b(createpopupwindow, (Throwable) obj2);
                    }
                };
                createpopupwindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: findParentViewForSubmenu
                    @Override // defpackage.logToString
                    public final void accept(Object obj2) {
                        function2.invoke(obj2);
                    }
                }));
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            int i8 = asBinder + 15;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            ((performItemAction) danaSiagaConcentActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1("DANASIAGA");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DanaSiagaConcentActivity danaSiagaConcentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            danaSiagaConcentActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = asInterface + 31;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                danaSiagaConcentActivity.IconCompatParcelizer();
                IctTokenModel ictTokenModel = (IctTokenModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                String strDisconnect = getMaxImages.disconnect();
                WebViewIctActivity.Companion companion = WebViewIctActivity.INSTANCE;
                WebViewIctActivity.Companion.b(danaSiagaConcentActivity, strDisconnect, ictTokenModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "DANASIAGA");
                int i3 = 52 / 0;
            } else {
                danaSiagaConcentActivity.IconCompatParcelizer();
                IctTokenModel ictTokenModel2 = (IctTokenModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                String strDisconnect2 = getMaxImages.disconnect();
                WebViewIctActivity.Companion companion2 = WebViewIctActivity.INSTANCE;
                WebViewIctActivity.Companion.b(danaSiagaConcentActivity, strDisconnect2, ictTokenModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "DANASIAGA");
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = asBinder + 87;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            danaSiagaConcentActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
            String string = danaSiagaConcentActivity.getString(R.string.message_sorry);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string2 = danaSiagaConcentActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, strValueOf, string2, null, 112);
            FragmentManager supportFragmentManager = danaSiagaConcentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(DanaSiagaConcentActivity danaSiagaConcentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            danaSiagaConcentActivity.MediaBrowserCompat();
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                danaSiagaConcentActivity.IconCompatParcelizer();
                String strIsEligible = ((CheckEligiblePinangResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEligible();
                if (strIsEligible == null) {
                    int i2 = asBinder + 109;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    strIsEligible = "";
                }
                if (Intrinsics.areEqual(strIsEligible, "true")) {
                    getMaxImages getmaximages = getMaxImages.INSTANCE;
                    String strMediaBrowserCompatMediaBrowserImplApi212 = getMaxImages.MediaBrowserCompatMediaBrowserImplApi212();
                    PinangWebViewActivity.Companion companion = PinangWebViewActivity.INSTANCE;
                    PinangWebViewActivity.Companion.b(danaSiagaConcentActivity, strMediaBrowserCompatMediaBrowserImplApi212);
                } else {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String string = danaSiagaConcentActivity.getString(R.string.message_sorry);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = danaSiagaConcentActivity.getString(R.string.label_not_eligible_raya);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String string3 = danaSiagaConcentActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, string2, string3, null, 112);
                    FragmentManager supportFragmentManager = danaSiagaConcentActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i4 = asBinder + 67;
                        asInterface = i4 % 128;
                        if (i4 % 2 != 0) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            obj.hashCode();
                            throw null;
                        }
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = asInterface + 85;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                danaSiagaConcentActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(danaSiagaConcentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i4 | i9;
        int i11 = (~(i7 | i4)) | i9 | (~(i8 | i4));
        int i12 = ~((~i4) | i6 | i5);
        int i13 = i6 + i5 + i + ((-2027816600) * i3) + ((-1234684791) * i2);
        int i14 = i13 * i13;
        int i15 = (i6 * (-132237830)) + 1711013888 + ((-132237830) * i5) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i) + (811597824 * i3) + (1100742656 * i2) + (1751056384 * i14);
        int i16 = ((i6 * 572746074) - 905264446) + (i5 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i * 572745585) + (i3 * 982511336) + (i2 * (-774025351)) + (i14 * 1257177088);
        int i17 = i15 + (i16 * i16 * 1874919424);
        if (i17 == 1) {
            DanaSiagaConcentActivity danaSiagaConcentActivity = (DanaSiagaConcentActivity) objArr[0];
            int i18 = 2 % 2;
            int i19 = asInterface + 105;
            asBinder = i19 % 128;
            int i20 = i19 % 2;
            danaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (DanaSiagaService) danaSiagaConcentActivity.getIntent().getParcelableExtra("KEY_DANA_SIAGA_SERVICE");
            int i21 = asInterface + 107;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        if (i17 != 2) {
            int i23 = 2 % 2;
            int i24 = asBinder + 47;
            asInterface = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        int i26 = 2 % 2;
        int i27 = asInterface;
        int i28 = i27 + 101;
        asBinder = i28 % 128;
        int i29 = i28 % 2;
        int i30 = i27 + 105;
        asBinder = i30 % 128;
        int i31 = i30 % 2;
        return Integer.valueOf(R.layout.activity_danasiaga_concent);
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f482a + 67;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1687410505, new Object[]{this}, 1687410507)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1065323872;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), length, 1544070460, new Object[]{this}, -1544070459);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 467458942;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB, iCodePointAt, -1626444359, new Object[]{this}, 1626444359);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = asBinder + 107;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    static void g() {
        g = -2880400555165023303L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r7, int r8, byte r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.$$c
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = 107 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity.$$i(int, int, byte):java.lang.String");
    }
}
