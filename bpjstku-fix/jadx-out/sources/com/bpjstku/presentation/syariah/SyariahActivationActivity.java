package com.bpjstku.presentation.syariah;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda2;
import com.bpjstku.data.syariah.model.request.SyariahFaqRequest;
import com.bpjstku.databinding.ActivitySyariahBinding;
import com.bpjstku.domain.syariah.model.FaqSyariah;
import com.bpjstku.presentation.syariah.SyariahActivationActivity;
import com.bpjstku.presentation.syariah.model.FaqSyariahModel;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.checkPreconditions;
import defpackage.createCaptureSession;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0016\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahActivationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySyariahBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "Lcom/bpjstku/domain/syariah/model/FaqSyariah;", "Lcom/bpjstku/presentation/syariah/model/FaqSyariahModel;", "(Lcom/bpjstku/domain/syariah/model/FaqSyariah;)Lcom/bpjstku/presentation/syariah/model/FaqSyariahModel;", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LcreateCaptureSession;", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahActivationActivity extends BindingBaseActivity<ActivitySyariahBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 145;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -56, 58, -24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 74;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f638a = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private List<FaqSyariahModel> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyariahActivationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    public static /* synthetic */ Object b(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = (~(i7 | (~i5) | i6)) | (~(i8 | i7 | i5));
        int i11 = (~(i5 | i6)) | (~(i2 | i6));
        int i12 = i2 + i6 + i4 + ((-1520811122) * i3) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i2) - 1254686720) + (875799021 * i6) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i4) + ((-206831616) * i3) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i2 * (-660833811)) - 1995073173) + (i6 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i4 * (-660833671)) + (i3 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        int i16 = i14 + (i15 * i15 * 814809088);
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahActivationActivity.$$a
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r6 = r6 + 1
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahActivationActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public SyariahActivationActivity() {
        final SyariahActivationActivity syariahActivationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<createCaptureSession>() { // from class: com.bpjstku.presentation.syariah.SyariahActivationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, createCaptureSession] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ createCaptureSession invoke() {
                LifecycleOwner lifecycleOwner = syariahActivationActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(createCaptureSession.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.syariah.SyariahActivationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahActivationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SyariahActivationActivity.class, new Pair[]{TuplesKt.to("worker_code", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySyariahBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        f638a = i2 % 128;
        int i3 = i2 % 2;
        SyariahActivationActivity$bindingInflater$1 syariahActivationActivity$bindingInflater$1 = SyariahActivationActivity$bindingInflater$1.b;
        int i4 = f638a + 35;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return syariahActivationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivitySyariahBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnViewFaqSyariahService;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda6
            public static int b = -588396091;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SyariahActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        MaterialButton materialButton2 = ((ActivitySyariahBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnActivateSyariahService;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton2, new Function0() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SyariahActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        int i2 = asBinder + 67;
        f638a = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 59;
        while (true) {
            $11 = i3 % 128;
            int i4 = i3 % 2;
            if (abortcapture.b >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 64839);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1356;
                    int iMyPid = (Process.myPid() >> 22) + 38;
                    byte b = $$c[2];
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, jumpTapTimeout, iMyPid, 894276454, false, $$i(b2, b2, b), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 47773), TextUtils.indexOf("", "", 0, 0) + 468, 13 - View.MeasureSpec.getMode(0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $10 + 23;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((createCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new Observer() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapper
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SyariahActivationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f638a + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str = "";
        FaqSyariah faqSyariah = (FaqSyariah) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(faqSyariah, "");
        String str2 = faqSyariah.TuitionPaymentFragmentbindingInflater1;
        if (str2 == null) {
            int i2 = f638a + 91;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
            str2 = "";
        }
        String str3 = faqSyariah.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str3 == null) {
            int i4 = f638a + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = str3;
        }
        return new FaqSyariahModel(str2, str, false);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        final createCaptureSession createcapturesession = (createCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        SyariahFaqRequest syariahFaqRequest = new SyariahFaqRequest();
        Intrinsics.checkNotNullParameter(syariahFaqRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<FaqSyariah>>> mutableLiveData = createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(syariahFaqRequest)));
        final Function1 function1 = new Function1() { // from class: toCameraDeviceCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createcapturesession, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: CameraDeviceCompatApi28Impl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: CameraDeviceCompatBaseImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createCaptureSession.TuitionPaymentFragmentbindingInflater1(createcapturesession, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CameraDeviceCompatApi24Impl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        createcapturesession.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = asBinder + 107;
        f638a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f638a + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SyariahActivationActivity syariahActivationActivity = this;
        Intrinsics.checkNotNullParameter(syariahActivationActivity, "");
        syariahActivationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((ActivitySyariahBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, "Informasi Layanan Syariah", true);
        int i4 = asBinder + 59;
        f638a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f638a + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = asBinder + 91;
                f638a = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = asBinder + 59;
            f638a = i6 % 128;
            int i7 = i6 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
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
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
            int i3 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$a;
            short s = bArr[5];
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s & 37), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, i2, i3, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = f638a + 99;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int size = 1755 - View.MeasureSpec.getSize(0);
                int mirror = AndroidCharacter.getMirror('0') - 25;
                byte[] bArr2 = $$a;
                short s2 = (short) (bArr2[12] + 1);
                Object[] objArr3 = new Object[1];
                c(s2, (byte) (s2 | 16), bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, size, mirror, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((1698353437 + (((~(iIdentityHashCode | 344547880)) | 131945454) * (-668))) + ((344547880 | (~(131945454 | iIdentityHashCode))) * 1336)) + ((iIdentityHashCode | 400389102) * 668)) - 2043107609;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
            int i9 = f638a + 67;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{32048, 32090, 19293, 24544, 60689, 2311, 5068, 64481, 58794, 30160, 47759, 33362, 19519, 40166, 8817, 10897, 46943, 15200, 18931, 46537}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).codePointAt(0) - 79, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{10274, 10315, 35134, 49813, 12151, 28961, 36522, 33736, 45282, 47030, 10223, 64099, 6402, 24266, 48932, 21158, 57981, 63768, 54407, 52711}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step7).substring(0, 1).codePointAt(0) - 79, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1577461015};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 29 - View.getDefaultSize(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -2043107609);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte[] bArr3 = $$a;
                    short s3 = (short) (bArr3[12] + 1);
                    Object[] objArr8 = new Object[1];
                    c(s3, (byte) (s3 | 16), bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, iArgb, i11, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{50306, 50403, 33606, 8047, 9477, 23912, 21329, 44957, 23641, 48590, 64005, 54909, 62853, 21664, 25219, 32468, 3815, 62332, 2413, 57774, 42559, 35832, 45097, 2128, 16229, 8860}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_delete).substring(1, 2).codePointAt(0) - 100, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{25222, 25315, 37338, 42227, 14235, 46035, 59592, 16676, 64065, 44894, 16793, 14522, 21387, 17966, 55645, 36936, 43251, 57854, 45792}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                        Object[] objArr11 = new Object[1];
                        c((short) 88, (byte) 52, $$a[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, iResolveSizeAndState, packedPositionChild, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int i12 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                        byte[] bArr4 = $$a;
                        short s4 = bArr4[5];
                        Object[] objArr12 = new Object[1];
                        c(s4, (byte) (s4 & 37), bArr4[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i12, scrollDefaultDelay, 986134021, false, (String) objArr12[0], null);
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
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i15 = f638a + 23;
        asBinder = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = i17 + ((((-1694943010) + (((~((-281023117) | iIdentityHashCode2)) | (~((-68420691) | iIdentityHashCode2))) * 69)) + (((~(iIdentityHashCode2 | (-657949780))) | ((~((-870552206) | iIdentityHashCode2)) | 589529089)) * (-69))) - 364620384);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
            Object[] objArr14 = new Object[1];
            c((short) 140, (byte) 52, $$a[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, doubleTapTimeout, pressedStateDuration2, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{50306, 50403, 33606, 8047, 9477, 23912, 21329, 44957, 23641, 48590, 64005, 54909, 62853, 21664, 25219, 32468, 3815, 62332, 2413, 57774, 42559, 35832, 45097, 2128, 16229, 8860}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step2).substring(8, 9).length(), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{25222, 25315, 37338, 42227, 14235, 46035, 59592, 16676, 64065, 44894, 16793, 14522, 21387, 17966, 55645, 36936, 43251, 57854, 45792}, KeyEvent.keyCodeFromString("") + 1, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int i21 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int bitsPerPixel2 = 14 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr5 = $$a;
            short s5 = (short) (bArr5[12] + 1);
            Object[] objArr17 = new Object[1];
            c(s5, (byte) (s5 | 16), bArr5[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i21, bitsPerPixel2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i22 = f638a + 43;
            asBinder = i22 % 128;
            int i23 = i22 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 1031;
                int i24 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                short s6 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte[] bArr6 = $$a;
                Object[] objArr18 = new Object[1];
                c(s6, bArr6[7], bArr6[28], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollDefaultDelay2, mode, i24, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr19[3])[0];
            int i26 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.txt_checkout).substring(0, 15).codePointAt(7) + 366543856;
            int i27 = ((834633418 + (((-694813265) | iCodePointAt) * (-381))) + (((~((~iCodePointAt) | (-762006257))) | 378666154) * 381)) - 2044307730;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{32048, 32090, 19293, 24544, 60689, 2311, 5068, 64481, 58794, 30160, 47759, 33362, 19519, 40166, 8817, 10897, 46943, 15200, 18931, 46537}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_image_too_dark).substring(0, 24).codePointAt(22) - 96, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{10274, 10315, 35134, 49813, 12151, 28961, 36522, 33736, 45282, 47030, 10223, 64099, 6402, 24266, 48932, 21158, 57981, 63768, 54407, 52711}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_4).substring(5, 12).codePointAt(2) - 109, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1577461015};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 1135, 18 - ExpandableListView.getPackedPositionType(0L), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -480188962, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                int i30 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                Object[] objArr24 = new Object[1];
                c((short) 140, (byte) 52, $$a[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates, doubleTapTimeout2, i30, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45993), 1117 - Color.argb(0, 0, 0, 0), 17 - KeyEvent.normalizeMetaState(0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iIndexOf = 1031 - TextUtils.indexOf("", "");
                int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                short s7 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte[] bArr7 = $$a;
                Object[] objArr25 = new Object[1];
                c(s7, bArr7[7], bArr7[28], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, iIndexOf, keyRepeatTimeout, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{50306, 50403, 33606, 8047, 9477, 23912, 21329, 44957, 23641, 48590, 64005, 54909, 62853, 21664, 25219, 32468, 3815, 62332, 2413, 57774, 42559, 35832, 45097, 2128, 16229, 8860}, 1 - View.getDefaultSize(0, 0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{25222, 25315, 37338, 42227, 14235, 46035, 59592, 16676, 64065, 44894, 16793, 14522, 21387, 17966, 55645, 36936, 43251, 57854, 45792}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                    byte[] bArr8 = $$a;
                    short s8 = (short) (bArr8[12] + 1);
                    Object[] objArr28 = new Object[1];
                    c(s8, (byte) (s8 | 16), bArr8[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarFadeDuration, iIndexOf2, maxKeyCode2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                    int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                    Object[] objArr29 = new Object[1];
                    c((short) 140, (byte) 52, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString, jumpTapTimeout, i31, 1357589585, false, (String) objArr29[0], null);
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
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i37 = i34 + 1936732341 + (((~(717469493 | elapsedCpuTime)) | 961749663) * (-366)) + (((~(elapsedCpuTime | 1003730879)) | 675488277) * 366);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr30[2])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i40 = f638a + 55;
            asBinder = i40 % 128;
            int i41 = 2;
            int i42 = i40 % 2;
            int i43 = 0;
            while (i43 < strArr4.length) {
                int i44 = f638a + 47;
                asBinder = i44 % 128;
                if (i44 % i41 == 0) {
                    arrayList2.add(strArr4[i43]);
                    i43 += 123;
                } else {
                    arrayList2.add(strArr4[i43]);
                    i43++;
                }
                i41 = 2;
            }
        }
        int[] iArr = new int[i33];
        int i45 = i33 - 1;
        iArr[i45] = 1;
        Toast.makeText((Context) null, iArr[((i33 * i45) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).length() + 1853963557;
        int i49 = ~length;
        int i50 = i46 + (-1101715956) + (((~(785729660 | i49)) | (~((-43075609) | length))) * (-831)) + ((~(1073085438 | length)) * (-1662)) + (((~(length | (-785729661))) | (~(i49 | (-1030009831))) | (~(1030009830 | length))) * 831);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr31[2])[0] = i52 ^ (i52 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -216526301
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
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.syariah.SyariahActivationActivity.f638a
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.bpjstku.presentation.syariah.SyariahActivationActivity.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L39
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r4)
            int r5 = java.lang.System.identityHashCode(r9)
            int r5 = ~r5
            r6 = -1603483231(0xffffffffa06cc9a1, float:-2.0056691E-19)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = -2140913632(0xffffffff80644020, float:-9.206553E-39)
            r6 = r6 | r5
            int r6 = r6 * (-970)
            r7 = -368485474(0xffffffffea095b9e, float:-4.151387E25)
            int r6 = r6 + r7
            r7 = 537430401(0x20088981, float:1.1565144E-19)
            r5 = r5 | r7
            int r5 = r5 * 970
            int r6 = r6 + r5
            if (r1 != r6) goto Lc6
            goto L66
        L39:
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r4)
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int r5 = r5.nextInt()
            int r5 = ~r5
            r6 = -70320169(0xfffffffffbceffd7, float:-2.1496044E36)
            r6 = r6 | r5
            int r6 = ~r6
            int r6 = r6 * (-783)
            r7 = -1206672049(0xffffffffb813a54f, float:-3.5201487E-5)
            int r7 = r7 + r6
            r6 = -1186049088(0xffffffffb94e53c0, float:-1.967689E-4)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = -356061545(0xffffffffeac6ee97, float:-1.2024701E26)
            r5 = r5 | r6
            int r5 = r5 * 783
            int r7 = r7 + r5
            if (r1 != r7) goto Lc6
        L66:
            java.lang.reflect.Member[] r1 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r4)
            int r2 = android.os.Process.myPid()
            int r5 = ~r2
            r6 = -2101796155(0xffffffff82b922c5, float:-2.7203264E-37)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = -477259811(0xffffffffe38d97dd, float:-5.2238676E21)
            r6 = r6 | r7
            r8 = 2101796154(0x7d46dd3a, float:1.6520989E37)
            r8 = r8 | r2
            int r8 = ~r8
            r6 = r6 | r8
            int r6 = r6 * (-564)
            r8 = -305447364(0xffffffffedcb3e3c, float:-7.862587E27)
            int r8 = r8 + r6
            r6 = -3153921(0xffffffffffcfdfff, float:NaN)
            r2 = r2 | r6
            int r2 = ~r2
            int r2 = r2 * 1128
            int r8 = r8 + r2
            r2 = r7 | r5
            int r2 = ~r2
            r5 = -2104950075(0xffffffff828902c5, float:-2.013193E-37)
            r2 = r2 | r5
            int r2 = r2 * 564
            int r8 = r8 + r2
            if (r1 == r8) goto Lb6
            r1 = -216526301(0xfffffffff3181223, float:-1.2048294E31)
            int[] r1 = new int[r1]
            r2 = -216526302(0xfffffffff3181222, float:-1.2048293E31)
            r1[r2] = r3
            r2 = -423567706(0xffffffffe6c0dea6, float:-4.5540075E23)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r4, r1, r3)
            r1.show()
        Lb6:
            super.onResume()
            int r1 = com.bpjstku.presentation.syariah.SyariahActivationActivity.f638a
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.bpjstku.presentation.syariah.SyariahActivationActivity.asBinder = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lc5
            return
        Lc5:
            throw r4
        Lc6:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahActivationActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0095, code lost:
    
        if (r1 != (((159221532 + (((~((-33074296) | r2)) | 29395045) * 1504)) + ((~(r2 | (-3679251))) * (-1504))) + 1159359712)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.syariah.SyariahActivationActivity.f638a + 91;
        com.bpjstku.presentation.syariah.SyariahActivationActivity.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        r1 = (-1313453714) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ad, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        throw new java.lang.RuntimeException("-1326400281");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r1 == ((((-1663688324) + (((~((-925149951) | r5)) | 1755137493) * (-865))) + ((~(r4 | 925149950)) * 865)) + (((~(1755137493 | r5)) | (~(r5 | 925149950))) * 865))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if (r1 == (((-573117390) + (((~(r4 | 870734979)) | 1142465368) * 305)) + (((~((~r4) | 870734979)) | 1700722522) * 305))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.syariah.SyariahActivationActivity.asBinder
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.bpjstku.presentation.syariah.SyariahActivationActivity.f638a = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L42
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r9)
            int r5 = ~r4
            r6 = -925149951(0xffffffffc8db5501, float:-449192.03)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 1755137493(0x689d45d5, float:5.9415977E24)
            r6 = r6 | r7
            int r6 = r6 * (-865)
            r8 = -1663688324(0xffffffff9cd6217c, float:-1.4169988E-21)
            int r8 = r8 + r6
            r6 = 925149950(0x3724aafe, float:9.814974E-6)
            r4 = r4 | r6
            int r4 = ~r4
            int r4 = r4 * 865
            int r8 = r8 + r4
            r4 = r7 | r5
            int r4 = ~r4
            r5 = r5 | r6
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 865
            int r8 = r8 + r4
            if (r1 != r8) goto Lae
            goto L6c
        L42:
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r9)
            r5 = 870734979(0x33e65c83, float:1.07270374E-7)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = 1142465368(0x4418a358, float:610.55225)
            r6 = r6 | r7
            int r6 = r6 * 305
            r7 = -573117390(0xffffffffddd6ec32, float:-1.935851E18)
            int r7 = r7 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 1700722522(0x655ef75a, float:6.580801E22)
            r4 = r4 | r5
            int r4 = r4 * 305
            int r7 = r7 + r4
            if (r1 != r7) goto Lae
        L6c:
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r2 = java.lang.System.identityHashCode(r9)
            r3 = -33074296(0xfffffffffe075388, float:-4.4969875E37)
            r3 = r3 | r2
            int r3 = ~r3
            r4 = 29395045(0x1c08865, float:7.072538E-38)
            r3 = r3 | r4
            int r3 = r3 * 1504
            r4 = 159221532(0x97d871c, float:3.0517295E-33)
            int r4 = r4 + r3
            r3 = -3679251(0xffffffffffc7dbed, float:NaN)
            r2 = r2 | r3
            int r2 = ~r2
            int r2 = r2 * (-1504)
            int r4 = r4 + r2
            r2 = 1159359712(0x451a6ce0, float:2470.8047)
            int r4 = r4 + r2
            if (r1 != r4) goto La4
            super.onStart()
            int r1 = com.bpjstku.presentation.syariah.SyariahActivationActivity.f638a
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.bpjstku.presentation.syariah.SyariahActivationActivity.asBinder = r2
            int r1 = r1 % r0
            return
        La4:
            r1 = -1313453714(0xffffffffb1b6496e, float:-5.305245E-9)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        Lae:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-1326400281"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahActivationActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00fe, code lost:
    
        if (r1 != ((((-1647386976) + (((-541214722) | (~r2)) * (-490))) + (((~(r2 | (-1885494338))) | 1344279616) * 490)) - 542781336)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0100, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.syariah.SyariahActivationActivity.f638a + 105;
        com.bpjstku.presentation.syariah.SyariahActivationActivity.asBinder = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x010c, code lost:
    
        if ((r9 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x010e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010f, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0112, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011a, code lost:
    
        throw new java.lang.RuntimeException("-1413627391");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011b, code lost:
    
        r9 = 823726960 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0124, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006f, code lost:
    
        if (r1 == (((1420565080 + (((~r2) | 1989143343) * 1444)) + (((~(r2 | (-1565807444))) | ((~(735819900 | r2)) | 1409565443)) * (-1444))) - 1642417504)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d3, code lost:
    
        if (r1 == (((1864231568 + ((r3 | (~((-1149304858) | r6))) * (-406))) + ((~(2143254495 | r6)) * (-406))) + (((~(r2 | (-993949639))) | (~((-1823937182) | r6))) * 406))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d5, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = android.os.Process.myPid();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahActivationActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahActivationActivity syariahActivationActivity) {
        int i = 2 % 2;
        int i2 = f638a + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            FaqSyariahServiceActivity.Companion companion = FaqSyariahServiceActivity.INSTANCE;
            FaqSyariahServiceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahActivationActivity, syariahActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return Unit.INSTANCE;
        }
        FaqSyariahServiceActivity.Companion companion2 = FaqSyariahServiceActivity.INSTANCE;
        FaqSyariahServiceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahActivationActivity, syariahActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SyariahActivationActivity syariahActivationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asBinder + 55;
            f638a = i2 % 128;
            if (i2 % 2 == 0) {
                syariahActivationActivity.MediaBrowserCompat();
                return;
            } else {
                syariahActivationActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                syariahActivationActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahActivationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        syariahActivationActivity.IconCompatParcelizer();
        List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Object[] objArr = {(FaqSyariah) it.next()};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            arrayList.add((FaqSyariahModel) b(FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -453882450, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 453882451));
        }
        syariahActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            int i3 = f638a + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = {(FaqSyariah) it2.next()};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            arrayList2.add((FaqSyariahModel) b(FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr2, -453882450, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault6, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, 453882451));
            int i5 = f638a + 73;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 3;
            }
        }
        SyariahActivationActivity syariahActivationActivity2 = syariahActivationActivity;
        checkPreconditions checkpreconditions = new checkPreconditions(syariahActivationActivity2, CollectionsKt.slice((List) arrayList2, new IntRange(0, 1)));
        RecyclerView recyclerView = ((ActivitySyariahBinding) ((ViewBinding) syariahActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvListPrimaryFaq;
        recyclerView.setLayoutManager(new LinearLayoutManager(syariahActivationActivity2));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(checkpreconditions);
    }

    public static /* synthetic */ String b(SyariahActivationActivity syariahActivationActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        f638a = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = syariahActivationActivity.getIntent().getStringExtra("worker_code");
        Intrinsics.checkNotNull(stringExtra);
        int i4 = asBinder + 31;
        f638a = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahActivationActivity syariahActivationActivity) {
        int i = 2 % 2;
        int i2 = f638a + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            SyariahActivationDetailActivity.Companion companion = SyariahActivationDetailActivity.INSTANCE;
            SyariahActivationDetailActivity.Companion.b(syariahActivationActivity, (String) syariahActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            return Unit.INSTANCE;
        }
        SyariahActivationDetailActivity.Companion companion2 = SyariahActivationDetailActivity.INSTANCE;
        SyariahActivationDetailActivity.Companion.b(syariahActivationActivity, (String) syariahActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue());
        int i3 = 95 / 0;
        return Unit.INSTANCE;
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 103;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        f638a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        f638a = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_syariah;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = ComplaintDataStore$$ExternalSyntheticLambda2.b();
        b(FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 1809902084, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1809902084);
    }

    private static FaqSyariahModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(FaqSyariah faqSyariah) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (FaqSyariahModel) b(FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{faqSyariah}, -453882450, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 453882451);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iCodePointAt = 1259335966 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step0).substring(40, 43).codePointAt(0);
        b(ComplaintDataStore$$ExternalSyntheticLambda2.b(), new Object[]{this}, -343759988, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1213230145, iCodePointAt, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 343759990);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 3376764972141726795L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f638a + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SyariahActivationActivity syariahActivationActivity = (SyariahActivationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f638a + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        int i4 = 8 / 0;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, byte r6, byte r7) {
        /*
            int r7 = r7 + 4
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = com.bpjstku.presentation.syariah.SyariahActivationActivity.$$c
            int r6 = r6 * 3
            int r6 = 107 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r3 = r1[r7]
        L28:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahActivationActivity.$$i(int, byte, byte):java.lang.String");
    }
}
