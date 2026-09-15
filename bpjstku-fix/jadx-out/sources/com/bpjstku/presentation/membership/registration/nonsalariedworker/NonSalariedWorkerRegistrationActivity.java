package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
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
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda2;
import com.bpjstku.databinding.ActivityNonSalariedWorkerRegistrationBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.Api33Impl;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.bindCustomTabsService;
import defpackage.cacheInteropConfig;
import defpackage.dumpAudioCapabilities;
import defpackage.findQualityInTargetQualities;
import defpackage.generateCameraId;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.lambdasetActive6androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.logToString;
import defpackage.onActivityResized;
import defpackage.readableMs;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010\t\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\r8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001a\u0010\u001eR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/nonsalariedworker/NonSalariedWorkerRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityNonSalariedWorkerRegistrationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "onTransact", "", "p0", "TuitionPaymentFragmentbindingInflater1", "(I)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "INotificationSideChannel", "LBufferProviderState;", "LBufferProviderState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "g", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "d", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NonSalariedWorkerRegistrationActivity extends BindingBaseActivity<ActivityNonSalariedWorkerRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] asInterface;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final FragmentManager TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = 3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RegistrationForUnregistered a;
    private static final byte[] $$c = {101, 89, 94, -73};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {23, -73, 107, 5, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 29;
    private static int INotificationSideChannel = 0;
    private static int g = 0;
    private static int onTransact = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = i2 | i3;
        int i8 = ~((~i3) | i2);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i6 | i3));
        int i11 = (~(i3 | i9)) | i6;
        int i12 = i2 + i6 + i + (2127773517 * i5) + (1026174006 * i4);
        int i13 = i12 * i12;
        int i14 = (i2 * (-484454144)) + 743702528 + ((-484454144) * i6) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i) + (367263744 * i5) + ((-1434976256) * i4) + (1105526784 * i13);
        int i15 = (i2 * 21308160) + 1622758390 + (i6 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (21309107 * i) + (i5 * 1708896471) + (i4 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
        }
        NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity = (NonSalariedWorkerRegistrationActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i17 = 2 % 2;
        int i18 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i19 = ~i;
        int i20 = (~((-618317199) | i19)) | 72499204;
        int i21 = ~(i | 1994122735);
        if (i18 != (-502326852) + ((i20 | i21) * (-713)) + (i21 * 1426) + ((~(1448304741 | i19)) * 713)) {
            throw null;
        }
        if (((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null) != ((((~((-1065968453) | i19)) | 436822528) * (-241)) - 1202720572) + (((~((-629145925) | i19)) | 1076264984) * 241)) {
            int i22 = onTransact + 67;
            g = i22 % 128;
            int i23 = i22 % 2;
            int[] iArr = new int[1728530758];
            iArr[1728530757] = 1;
            int i24 = 63288798 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i25 = onTransact + 93;
            g = i25 % 128;
            int i26 = i25 % 2;
        }
        super.onCreate(bundle);
        return null;
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
    private static void e(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 197 - r9
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.$$a
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L2a
        L12:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r9 = r9 + r8
            int r9 = r9 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.e(byte, byte, short, java.lang.Object[]):void");
    }

    public static final class TuitionPaymentFragmentbindingInflater1<T> implements findQualityInTargetQualities {
        public static final TuitionPaymentFragmentbindingInflater1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1<>();

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof lambdasetActive6androidxcameracamera2interopCamera2CameraControl;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, R> implements readableMs {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>();

        @Override // defpackage.readableMs
        public final T apply(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (T) ((lambdasetActive6androidxcameracamera2interopCamera2CameraControl) obj);
        }
    }

    public NonSalariedWorkerRegistrationActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = supportFragmentManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        this.b = R.layout.activity_non_salaried_worker_registration;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/nonsalariedworker/NonSalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, NonSalariedWorkerRegistrationActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = this.b;
        int i6 = i3 + 81;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityNonSalariedWorkerRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        NonSalariedWorkerRegistrationActivity$bindingInflater$1 nonSalariedWorkerRegistrationActivity$bindingInflater$1 = NonSalariedWorkerRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = onTransact + 77;
        g = i4 % 128;
        int i5 = i4 % 2;
        return nonSalariedWorkerRegistrationActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity = (NonSalariedWorkerRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 71;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            nonSalariedWorkerRegistrationActivity.a = (RegistrationForUnregistered) nonSalariedWorkerRegistrationActivity.getIntent().getParcelableExtra("unregistered_data");
            obj.hashCode();
            throw null;
        }
        nonSalariedWorkerRegistrationActivity.a = (RegistrationForUnregistered) nonSalariedWorkerRegistrationActivity.getIntent().getParcelableExtra("unregistered_data");
        int i3 = onTransact + 89;
        g = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
        this.g = LayoutRegistrationProgressBinding.bind(((ActivityNonSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(nonSalariedWorkerRegistrationActivity, "");
        nonSalariedWorkerRegistrationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityNonSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_non_salaried_worker);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = onTransact + 55;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 27;
        onTransact = i3 % 128;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding2 = this.g;
        if (layoutRegistrationProgressBinding2 == null) {
            int i4 = i2 + 111;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            layoutRegistrationProgressBinding = layoutRegistrationProgressBinding2;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setOnTouchListener(new View.OnTouchListener() { // from class: warmup
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return NonSalariedWorkerRegistrationActivity.d();
            }
        });
        onTransact();
        ((ActivityNonSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: CustomTabsClient1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        int iIntValue;
        int i;
        int i2;
        long j;
        int i3 = 2 % 2;
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        VideoRecordEventStart<R> map = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().filter(TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).map(TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNullExpressionValue(map, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 46401), 40 - Color.argb(0, 0, 0, 0), 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        int i6 = 1;
        Object[] objArr = new Object[1];
        c(new int[]{0, 22, 195, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -1;
        long j3 = j2 ^ 2913950273795804046L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode ^ j2;
        long j5 = 54;
        long j6 = ((j2 ^ (-816693099053845059L)) | 2913950273795804046L) ^ j2;
        long j7 = (((long) 55) * 2913950273795804046L) + (((long) (-107)) * (-816693099053845059L)) + (((long) (-108)) * (((j3 | (-816693099053845059L)) ^ j2) | ((j4 | (-816693099053845059L)) ^ j2))) + ((((j3 | jIdentityHashCode) ^ j2) | j6 | (j2 ^ (j4 | 2913950273795804046L))) * j5) + (j5 * (jIdentityHashCode | j6));
        int i7 = g + 111;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        long j8 = jLongValue;
        try {
            while (i9 != 10) {
                int i10 = onTransact + 27;
                g = i10 % 128;
                if (i10 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(i4, i4, i4, i4) + 37836), 59 - ((Process.getThreadPriority(i4) + 20) >> 6), 18 - View.getDefaultSize(i4, i4), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    i2 = i6;
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(i4, i4, i4, i4) + 37836), 59 - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSizeAndState(i4, i4, i4) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                    i2 = i4;
                }
                while (true) {
                    int i11 = i4;
                    while (i11 != 8) {
                        int i12 = onTransact + 23;
                        g = i12 % 128;
                        if (i12 % 2 != 0) {
                            i = (((((int) (j8 >> i11)) & 27550) << (i / 13)) >>> (i / 89)) << i;
                            i11 += 14;
                        } else {
                            i = (((((int) (j8 >> i11)) & 255) + (i << 6)) + (i << 16)) - i;
                            i11++;
                        }
                        j7 = j7;
                    }
                    j = j7;
                    if (i2 != 0) {
                        break;
                    }
                    i2++;
                    j7 = j;
                    j8 = j7;
                    i4 = 0;
                }
                if (i == i5) {
                    VideoRecordEventStart videoRecordEventStartObserveOn = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
                    final Function1 function1 = new Function1() { // from class: newSession
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (lambdasetActive6androidxcameracamera2interopCamera2CameraControl) obj);
                        }
                    };
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: CustomTabsClient22
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            NonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
                        }
                    });
                    return;
                } else {
                    j8 -= 1024;
                    i9++;
                    j7 = j;
                    i4 = 0;
                    i6 = 1;
                }
            }
            Object[] objArr3 = {-329342446};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46038), 1134 - TextUtils.getOffsetBefore("", 0), 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 1219244263, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cAlpha = (char) Color.alpha(0);
                int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b = $$a[80];
                Object[] objArr5 = new Object[1];
                e((byte) 52, b, (short) (b | 192), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, absoluteGravity, iIndexOf, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.argb(0, 0, 0, 0)), TextUtils.indexOf("", "", 0) + 1117, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr4);
            int i13 = ((int[]) objArr6[1])[0];
            int i14 = ((int[]) objArr6[3])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i15 = 0;
                    while (i15 < strArr.length) {
                        arrayList.add(strArr[i15]);
                        i15++;
                        int i16 = onTransact + 7;
                        g = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            VideoRecordEventStart videoRecordEventStartObserveOn2 = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
            final Function1 function2 = new Function1() { // from class: newSession
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (lambdasetActive6androidxcameracamera2interopCamera2CameraControl) obj);
                }
            };
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoRecordEventStartObserveOn2.subscribe(new logToString() { // from class: CustomTabsClient22
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    NonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function2, obj);
                }
            });
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr7 = new Object[1];
        c(new int[]{37, 16, 59, 8}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        c(new int[]{53, 16, 183, 13}, true, null, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = asInterface;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int size = 1270 - View.MeasureSpec.getSize(i2);
                        int i8 = 19 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                        byte b = (byte) i2;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, size, i8, 407021364, false, $$i(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i9 = $10 + 27;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i4) {
                int i11 = $11 + 21;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3225, '=' - AndroidCharacter.getMirror('0'), 2133916302, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1755 - TextUtils.getOffsetBefore("", 0), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 387247676, false, $$i(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    int i15 = $11 + 51;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 41241), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1704, 21 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1434471773, false, $$i(b7, (byte) (b7 | 6), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i17, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i17);
        }
        if (z) {
            int i18 = $11 + 11;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i4];
            setvideostabilizationmode.b = 0;
            int i20 = $10 + 19;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            while (setvideostabilizationmode.b < i4) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i4 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i22 = 0;
            while (true) {
                setvideostabilizationmode.b = i22;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i22 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final void onTransact() {
        bindCustomTabsService bindcustomtabsserviceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 93;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i5 == 2) {
            bindCustomTabsService.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = bindCustomTabsService.INSTANCE;
            bindcustomtabsserviceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bindCustomTabsService.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.a);
        } else if (i5 == 3) {
            Api33Impl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = Api33Impl.INSTANCE;
            bindcustomtabsserviceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Api33Impl.Companion.b(this.a);
        } else {
            int i6 = i2 + 125;
            g = i6 % 128;
            int i7 = i6 % 2;
            onActivityResized.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = onActivityResized.INSTANCE;
            bindcustomtabsserviceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onActivityResized.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.a);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.beginTransaction().add(R.id.nonSalariedWorkerContainer, bindcustomtabsserviceTuitionPaymentFragmentspecialinlinedviewModeldefault1).addToBackStack(null).commit();
        TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i8 = onTransact + 125;
        g = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void TuitionPaymentFragmentbindingInflater1(int p0) {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.g;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress((100 / this.TuitionPaymentFragmentbindingInflater1) * p0);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append("/");
        sb.append(i3);
        textView.setText(sb.toString());
        if (p0 == 2) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_choose_program));
            return;
        }
        int i4 = onTransact + 77;
        int i5 = i4 % 128;
        g = i5;
        int i6 = i4 % 2;
        if (p0 == 3) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_work_detail));
            return;
        }
        int i7 = i5 + 31;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_personal_data));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:5:0x0016, B:12:0x0033, B:11:0x0030, B:9:0x0027), top: B:20:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        g = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 69 / 0;
                if (p0.getItemId() == 16908332) {
                    onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = g + 85;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iB = ComplaintDataStore$$ExternalSyntheticLambda2.b();
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 872591342, -16365948, iB, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).codePointAt(8) - 1221665598, new Object[]{this}, 16365948);
            return;
        }
        int iB2 = ComplaintDataStore$$ExternalSyntheticLambda2.b();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 872591342, -16365948, iB2, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).codePointAt(8) - 1221665598, new Object[]{this}, 16365948);
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 5;
        onTransact = i2 % 128;
        BufferProviderState bufferProviderState = null;
        if (i2 % 2 == 0) {
            bufferProviderState.hashCode();
            throw null;
        }
        BufferProviderState bufferProviderState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (bufferProviderState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bufferProviderState2 = null;
        }
        if (!bufferProviderState2.isDisposed()) {
            int i3 = g + 115;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            BufferProviderState bufferProviderState3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (bufferProviderState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = g + 1;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            } else {
                bufferProviderState = bufferProviderState3;
            }
            bufferProviderState.dispose();
        }
        super.onDestroy();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity = (NonSalariedWorkerRegistrationActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (nonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 1) {
            nonSalariedWorkerRegistrationActivity.d_();
            return null;
        }
        int i2 = onTransact + 81;
        g = i2 % 128;
        int i3 = i2 % 2;
        nonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.popBackStack();
        int i4 = nonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1;
        nonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        nonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentbindingInflater1(i4);
        int i5 = g + 27;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int size = 1755 - View.MeasureSpec.getSize(0);
            int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b = $$a[80];
            Object[] objArr2 = new Object[1];
            e((byte) 37, b, (short) (b | 140), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, size, maxKeyCode, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                int mode = View.MeasureSpec.getMode(0) + 23;
                Object[] objArr3 = new Object[1];
                e((byte) 52, $$a[80], (short) 104, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iIndexOf, mode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i2 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i2}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i3 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step4).substring(7, 8).codePointAt(0) + 574919365);
            int i4 = 153751189 + (((~(200015865 | i3)) | 12586560) * (-828)) + ((i3 | 200015865) * (-828)) + 620437471;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(new int[]{37, 16, 59, 8}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(new int[]{53, 16, 183, 13}, true, null, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1853409067};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - View.resolveSize(0, 0)), 1726 - View.resolveSizeAndState(0, 0, 0), 29 - TextUtils.indexOf("", "", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1270150025, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                    Object[] objArr8 = new Object[1];
                    e((byte) 52, $$a[80], (short) 104, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, absoluteGravity, bitsPerPixel, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new int[]{0, 22, 195, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                        int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        Object[] objArr11 = new Object[1];
                        e((byte) 52, $$a[80], (short) 52, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iKeyCodeFromString, longPressTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int bitsPerPixel2 = 1754 - ImageFormat.getBitsPerPixel(0);
                        int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                        byte b2 = $$a[80];
                        Object[] objArr12 = new Object[1];
                        e((byte) 37, b2, (short) (b2 | 140), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, bitsPerPixel2, i7, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr13 = {new int[]{i11}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i13 = i10 + ((((~((-745188848) | i12)) | 204115365) * (-566)) - 222217977) + ((~(i12 | (-541073483))) * 566);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i16 = g + 41;
                onTransact = i16 % 128;
                int i17 = i16 % 2;
                int i18 = 0;
                while (i18 < strArr.length) {
                    arrayList.add(strArr[i18]);
                    i18++;
                    int i19 = g + 59;
                    onTransact = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            int[] iArr = new int[i9];
            int i21 = i9 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i23 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr14 = {new int[]{i23}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_atm_bersama).substring(0, 4).codePointAt(3) - 938927827;
            int i24 = ~iCodePointAt;
            int i25 = i22 + 103761587 + (((~(302521304 | i24)) | (~((-515123731) | iCodePointAt))) * 1900) + (((~(i24 | 515123730)) | (~(iCodePointAt | (-302521305)))) * (-950)) + (((~(iCodePointAt | 515123730)) | (~(i24 | (-302521305)))) * 950);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr14[3])[0] = i27 ^ (i27 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i28 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
            int i29 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
            byte b3 = $$a[80];
            Object[] objArr15 = new Object[1];
            e((byte) 52, b3, (short) (b3 | 192), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, i28, i29, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        c(new int[]{0, 22, 195, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int iGreen = 1031 - Color.green(0);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            Object[] objArr18 = new Object[1];
            e((byte) 52, $$a[80], (short) 104, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, iGreen, scrollBarFadeDuration, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i30 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iArgb = 15 - Color.argb(0, 0, 0, 0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr19 = new Object[1];
                e(b4, b5, b5, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, i30, iArgb, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i33 = ~((int) Runtime.getRuntime().totalMemory());
            int i34 = ~(578399795 | i33);
            int i35 = ((((-806227635) + ((i34 | (-334119626)) * 764)) + (((~(i33 | (-334119626))) | 40370689) * (-1528))) + (((-831778043) | i34) * 764)) - 1511961088;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(new int[]{37, 16, 59, 8}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(new int[]{53, 16, 183, 13}, true, null, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1853409067};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1134, Color.rgb(0, 0, 0) + 16777234, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1511961088, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cRed = (char) Color.red(0);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                int maxKeyCode2 = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b6 = $$a[80];
                Object[] objArr25 = new Object[1];
                e((byte) 52, b6, (short) (b6 | 192), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed, packedPositionChild, maxKeyCode2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0, 0) + 45993), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1117, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int doubleTapTimeout2 = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i38 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                byte b7 = $$a[7];
                byte b8 = b7;
                Object[] objArr26 = new Object[1];
                e(b7, b8, b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mirror, doubleTapTimeout2, i38, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                c(new int[]{0, 22, 195, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i39 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                    Object[] objArr29 = new Object[1];
                    e((byte) 52, $$a[80], (short) 104, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarSize, i39, pressedStateDuration, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b9 = $$a[80];
                    Object[] objArr30 = new Object[1];
                    e((byte) 52, b9, (short) (b9 | 192), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, iMakeMeasureSpec, packedPositionGroup, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArr[1])[0];
        int i41 = ((int[]) objArr[3])[0];
        if (i41 == i40) {
            int i42 = onTransact + 105;
            g = i42 % 128;
            int i43 = i42 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i44 = ((int[]) objArr[2])[0];
            int i45 = ((int[]) objArr[3])[0];
            int i46 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i47 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i48 = i44 + 1733660372 + (((~(728442760 | i47)) | (-972722931)) * (-983)) + (((~(i47 | (-972722931))) | 694813312) * 983);
            int i49 = i48 ^ (i48 << 13);
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr31[2])[0] = i50 ^ (i50 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i51 = 0;
            while (i51 < strArr4.length) {
                int i52 = g + 77;
                onTransact = i52 % 128;
                if (i52 % 2 == 0) {
                    arrayList2.add(strArr4[i51]);
                    i51 += 47;
                } else {
                    arrayList2.add(strArr4[i51]);
                    i51++;
                }
            }
        }
        Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i53 = ((int[]) objArr[2])[0];
        int i54 = ((int[]) objArr[3])[0];
        int i55 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i56 = (~((-714211177) | iIdentityHashCode)) | 579955712;
        int i57 = i53 + (-659599367) + (i56 * 992) + ((i56 | (~((~iIdentityHashCode) | (-335675543)))) * (-496)) + ((iIdentityHashCode | (-469931007)) * 496);
        int i58 = (i57 << 13) ^ i57;
        int i59 = i58 ^ (i58 >>> 17);
        ((int[]) objArr32[2])[0] = i59 ^ (i59 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00eb, code lost:
    
        if (r1 != (((1385593784 + ((r6 | r7) * 1150)) + (((~(1755782603 | r3)) | r7) * (-575))) + (((~(r2 | (-823273362))) | (~(r3 | 823273361))) * 575))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ed, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.g + 43;
        com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f9, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fd, code lost:
    
        r1 = 792032726 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0106, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0107, code lost:
    
        r1 = (-641781280) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0110, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (r1 == (((((~(r7 | (-1124315385))) | ((~((-294327842) | r7)) | 16977952)) * (-397)) + 1580345050) + ((r6 | (-1384687322)) * 397))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0095, code lost:
    
        if (r1 == (((((~((-830904823) | r6)) | 545657028) * (-566)) - 1225755008) + ((~(r6 | (-285247795))) * 566))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0097, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1434278015;
        r3 = ~r2;
        r6 = ~((-823273362) | r3);
        r7 = ~((-1755782604) | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i5 = ~iMyTid;
        if (i4 != (-780159432) + (((~((-1033427029) | i5)) | 201332820) * 184) + ((iMyTid | (-1035533694)) * (-184)) + ((~((-203439486) | i5)) * 184)) {
            throw null;
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i6 != 346024308 + (((~iMyPid) | 29626373) * 1324) + (((~(iMyPid | (-2050681849))) | (~(334770517 | iMyPid))) * (-1324)) + 1662419468) {
            int i7 = onTransact + 37;
            g = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[2038998639];
            iArr[2038998638] = 1;
            int i9 = (-1231323726) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onStart();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        g = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = g + 69;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            int iB = ComplaintDataStore$$ExternalSyntheticLambda2.b();
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 872591342, -16365948, iB, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).codePointAt(8) - 1221665598, new Object[]{nonSalariedWorkerRegistrationActivity}, 16365948);
            ViewPortBuilder.b();
            int i4 = g + 43;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity = (NonSalariedWorkerRegistrationActivity) objArr[0];
        lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = (lambdasetActive6androidxcameracamera2interopCamera2CameraControl) objArr[1];
        int i = 2 % 2;
        int i2 = g + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        nonSalariedWorkerRegistrationActivity.a = lambdasetactive6androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentbindingInflater1;
        nonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
        nonSalariedWorkerRegistrationActivity.onTransact();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 75;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean d() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 105;
        onTransact = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NonSalariedWorkerRegistrationActivity nonSalariedWorkerRegistrationActivity, lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 602268465, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{nonSalariedWorkerRegistrationActivity, lambdasetactive6androidxcameracamera2interopcamera2cameracontrol}, -602268464);
    }

    static {
        notify = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 97;
        notify = i % 128;
        int i2 = i % 2;
    }

    private final void INotificationSideChannel() throws IllegalAccessException {
        int iB = ComplaintDataStore$$ExternalSyntheticLambda2.b();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 872591342, -16365948, iB, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).codePointAt(8) - 1221665598, new Object[]{this}, 16365948);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws IllegalAccessException {
        int i = 2086831008 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        b(ComplaintDataStore$$ExternalSyntheticLambda2.b(), -1229345435, i, ComplaintDataStore$$ExternalSyntheticLambda2.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 1390376090, new Object[]{this}, 1229345438);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 63;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = ComplaintDataStore$$ExternalSyntheticLambda2.b();
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1836315009, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB, new Object[]{this, bundle}, -1836315007);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        asInterface = new char[]{59801, 59425, 59431, 59429, 59448, 59428, 59426, 59399, 59418, 59455, 59416, 59400, 59426, 59442, 59453, 59428, 59431, 59408, 59409, 59451, 59431, 59425, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59738, 59790, 59760, 59818, 59834, 59813, 59820, 59823, 59821, 59819, 59821, 59821, 59785, 59779, 59818, 59817, 59889, 59412, 59425, 59411, 59892, 59451, 59424, 59435, 59424, 59438, 59415, 59408, 59435, 59415, 59408, 59437};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, short r8) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.$$c
            int r7 = r7 + 99
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerRegistrationActivity.$$i(short, int, short):java.lang.String");
    }
}
