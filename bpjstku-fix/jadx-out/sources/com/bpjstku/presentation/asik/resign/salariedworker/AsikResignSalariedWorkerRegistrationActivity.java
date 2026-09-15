package com.bpjstku.presentation.asik.resign.salariedworker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAsikResignSalariedWorkerRegistrationBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.DecorContentParent;
import defpackage.NavItemSelectedListener;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.dumpAudioCapabilities;
import defpackage.findQualityInTargetQualities;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getConfigs;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdasetActive6androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl;
import defpackage.logToString;
import defpackage.onBind;
import defpackage.readableMs;
import defpackage.resolveMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010 R\u0016\u0010\u000b\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001a\u0010\b\u001a\u00020\r8\u0015X\u0095D¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0018\u0010#"}, d2 = {"Lcom/bpjstku/presentation/asik/resign/salariedworker/AsikResignSalariedWorkerRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikResignSalariedWorkerRegistrationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "g", "", "p0", "(I)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "INotificationSideChannel", "LBufferProviderState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LBufferProviderState;", "Landroidx/fragment/app/FragmentManager;", "TuitionPaymentFragmentbindingInflater1", "Landroidx/fragment/app/FragmentManager;", "I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikResignSalariedWorkerRegistrationActivity extends BindingBaseActivity<ActivityAsikResignSalariedWorkerRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f470a;
    private static long asBinder;
    private static int onTransact;
    private final FragmentManager TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int asBinder;
    private static final byte[] $$c = {31, -3, -46, 11};
    private static final int $$f = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {87, 51, -85, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 210;
    private static int cancelAll = 1;
    private static int d = 0;
    private static int INotificationSideChannel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws NoSuchMethodException {
        int i7 = ~i5;
        int i8 = ~(i6 | i7);
        int i9 = i | i8;
        int i10 = ~i;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i)) | (~(i10 | i5));
        int i13 = i5 + i + i2 + (513088896 * i3) + ((-1342203445) * i4);
        int i14 = i13 * i13;
        int i15 = (665020156 * i5) + 661520384 + (1303681286 * i) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i2) + ((-771751936) * i3) + (1382285312 * i4) + ((-350355456) * i14);
        int i16 = ((i5 * (-363642324)) - 614971735) + (i * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i2 * (-363641803)) + (i3 * (-2127225984)) + (i4 * (-1080704249)) + (i14 * (-1523187712));
        int i17 = i15 + (i16 * i16 * (-227409920));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 == 2) {
            AsikResignSalariedWorkerRegistrationActivity asikResignSalariedWorkerRegistrationActivity = (AsikResignSalariedWorkerRegistrationActivity) objArr[0];
            int i18 = 2 % 2;
            int i19 = INotificationSideChannel + 89;
            d = i19 % 128;
            int i20 = i19 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1817517939, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 287365829, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1530772841, 1817517939, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{asikResignSalariedWorkerRegistrationActivity});
            int i21 = INotificationSideChannel + 87;
            d = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        if (i17 == 3) {
            int i23 = 2 % 2;
            int i24 = d + 91;
            INotificationSideChannel = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        AsikResignSalariedWorkerRegistrationActivity asikResignSalariedWorkerRegistrationActivity2 = (AsikResignSalariedWorkerRegistrationActivity) objArr[0];
        int i26 = 2 % 2;
        int i27 = INotificationSideChannel;
        int i28 = i27 + 53;
        d = i28 % 128;
        int i29 = i28 % 2;
        if (asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 1) {
            asikResignSalariedWorkerRegistrationActivity2.d_();
            return null;
        }
        int i30 = i27 + 37;
        d = i30 % 128;
        if (i30 % 2 != 0) {
            asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentbindingInflater1.popBackStack();
            int i31 = asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31;
            asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i31);
            return null;
        }
        asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentbindingInflater1.popBackStack();
        int i32 = asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
        asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32;
        asikResignSalariedWorkerRegistrationActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i32);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 196 - r8
            int r0 = 53 - r7
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    public static final class b<T> implements findQualityInTargetQualities {
        public static final b<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b<>();

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof lambdasetActive6androidxcameracamera2interopCamera2CameraControl;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, R> implements readableMs {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>();

        @Override // defpackage.readableMs
        public final T apply(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (T) ((lambdasetActive6androidxcameracamera2interopCamera2CameraControl) obj);
        }
    }

    public AsikResignSalariedWorkerRegistrationActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.TuitionPaymentFragmentbindingInflater1 = supportFragmentManager;
        this.b = 3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        this.asBinder = R.layout.activity_asik_resign_salaried_worker_registration;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/asik/resign/salariedworker/AsikResignSalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, AsikResignSalariedWorkerRegistrationActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikResignSalariedWorkerRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        AsikResignSalariedWorkerRegistrationActivity$bindingInflater$1 asikResignSalariedWorkerRegistrationActivity$bindingInflater$1 = AsikResignSalariedWorkerRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = d + 95;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return asikResignSalariedWorkerRegistrationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 5;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = this.asBinder;
        int i6 = i3 + 91;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 17;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.a = LayoutRegistrationProgressBinding.bind(((ActivityAsikResignSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        AsikResignSalariedWorkerRegistrationActivity asikResignSalariedWorkerRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(asikResignSalariedWorkerRegistrationActivity, "");
        asikResignSalariedWorkerRegistrationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityAsikResignSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_asik_program);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = d + 89;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        if (layoutRegistrationProgressBinding == null) {
            int i2 = d + 105;
            INotificationSideChannel = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        g();
        ((ActivityAsikResignSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: detect
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikResignSalariedWorkerRegistrationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        int i3 = INotificationSideChannel + 19;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        VideoRecordEventStart<R> map = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().filter(b.TuitionPaymentFragmentspecialinlinedviewModeldefault2).map(TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNullExpressionValue(map, "");
        VideoRecordEventStart videoRecordEventStartObserveOn = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: LocaleOverlayHelper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikResignSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: isParserOutdated
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AsikResignSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        });
        int i2 = INotificationSideChannel + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void g() {
        resolveMethod resolvemethodTuitionPaymentFragmentbindingInflater1;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 31;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i5 == 2) {
            resolveMethod.Companion companion = resolveMethod.INSTANCE;
            resolvemethodTuitionPaymentFragmentbindingInflater1 = resolveMethod.Companion.TuitionPaymentFragmentbindingInflater1();
        } else {
            int i6 = i3 + 101;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 != 0 ? i5 == 3 : i5 == 3) {
                NavItemSelectedListener.Companion companion2 = NavItemSelectedListener.INSTANCE;
                resolvemethodTuitionPaymentFragmentbindingInflater1 = NavItemSelectedListener.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                onBind.Companion companion3 = onBind.INSTANCE;
                resolvemethodTuitionPaymentFragmentbindingInflater1 = onBind.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
        this.TuitionPaymentFragmentbindingInflater1.beginTransaction().add(R.id.nonSalariedWorkerContainer, resolvemethodTuitionPaymentFragmentbindingInflater1).addToBackStack(null).commit();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(f470a[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2186 - ExpandableListView.getPackedPositionChild(0L), 40 - ExpandableListView.getPackedPositionGroup(0L), 841711447, false, $$i(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asBinder), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3012 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 26 - Color.green(0), 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 3377, 17 - Color.argb(0, 0, 0, 0), -968507904, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 99;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 36506), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3375, Process.getGidForName("") + 18, -968507904, false, $$i(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 36506), 3376 - View.getDefaultSize(0, 0), 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -968507904, false, $$i(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
        int i6 = $10 + 87;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) {
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            layoutRegistrationProgressBinding = this.a;
            int i3 = 83 / 0;
            if (layoutRegistrationProgressBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                layoutRegistrationProgressBinding = null;
            }
        } else {
            layoutRegistrationProgressBinding = this.a;
            if (layoutRegistrationProgressBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                layoutRegistrationProgressBinding = null;
            }
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress((100 / this.b) * p0);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append("/");
        sb.append(i5);
        textView.setText(sb.toString());
        if (p0 == 2) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_contact_and_additional_data));
            return;
        }
        if (p0 == 3) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_biometric_verification));
            int i6 = d + 101;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_population_data));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        d = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 66 / 0;
                if (p0.getItemId() == 16908332) {
                    int i4 = INotificationSideChannel + 25;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                    onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    int i6 = INotificationSideChannel + 25;
                    d = i6 % 128;
                    int i7 = i6 % 2;
                    onBackPressed();
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

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c A[PHI: r1
  0x004c: PHI (r1v14 BufferProviderState) = (r1v10 BufferProviderState), (r1v15 BufferProviderState) binds: [B:17:0x003d, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        BufferProviderState bufferProviderState;
        int i = 2 % 2;
        BufferProviderState bufferProviderState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        BufferProviderState bufferProviderState3 = null;
        if (bufferProviderState2 == null) {
            int i2 = INotificationSideChannel + 105;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bufferProviderState3.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            bufferProviderState2 = null;
        }
        if (!bufferProviderState2.isDisposed()) {
            int i3 = INotificationSideChannel + 39;
            d = i3 % 128;
            if (i3 % 2 != 0) {
                bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4 = 30 / 0;
                if (bufferProviderState == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = d + 99;
                    INotificationSideChannel = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    bufferProviderState3 = bufferProviderState;
                }
            } else {
                bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bufferProviderState == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = d + 99;
                    INotificationSideChannel = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    bufferProviderState3 = bufferProviderState;
                }
            }
            bufferProviderState3.dispose();
        }
        super.onDestroy();
        int i9 = d + 43;
        INotificationSideChannel = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
            int iResolveSize = 1755 - View.resolveSize(0, 0);
            int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
            byte b2 = $$a[28];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 14), (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iResolveSize, i2, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cGreen = (char) (Color.green(0) + 29944);
                int i3 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i4 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b3 = bArr[28];
                byte b4 = bArr[7];
                Object[] objArr3 = new Object[1];
                c(b3, b4, (short) (b4 | 156), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, i3, i4, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).codePointAt(1) + 1187251028;
            int i5 = 631833220 + (((~(iCodePointAt | 699910447)) | 336081616) * 305) + (((~((~iCodePointAt) | 699910447)) | 487308021) * 305) + 1443157174;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, 15 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e((ViewConfiguration.getPressedStateDuration() >> 16) + 16, (ViewConfiguration.getLongPressTimeout() >> 16) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-456298544};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 42050), 1725 - ExpandableListView.getPackedPositionChild(0L), (KeyEvent.getMaxKeyCode() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1443157174);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                    int iMyPid = 1755 - (Process.myPid() >> 22);
                    int gidForName = 22 - Process.getGidForName("");
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[28];
                    byte b6 = bArr2[7];
                    Object[] objArr8 = new Object[1];
                    c(b5, b6, (short) (b6 | 156), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iMyPid, gidForName, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 53, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 31, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                        int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                        int iBlue = Color.blue(0) + 23;
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[28];
                        byte b8 = bArr3[7];
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (short) (b8 | 104), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, offsetBefore, iBlue, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                        byte b9 = $$a[28];
                        Object[] objArr12 = new Object[1];
                        c(b9, (byte) (b9 | 14), (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iCombineMeasuredStates, packedPositionType, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i9 == i8) {
            int i10 = INotificationSideChannel + 25;
            d = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bank_transfer).substring(0, 4).codePointAt(2) + 1291676695;
            int i13 = ~iCodePointAt2;
            int i14 = i12 + (((~(i13 | (-690493896))) | (~((-903096322) | i13)) | 553650177) * (-397)) + 751937889 + ((iCodePointAt2 | (-486289863)) * 397);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
            int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i18 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 580779314;
            int i19 = ~i18;
            int i20 = i17 + (-1850400084) + ((~(662580563 | i19)) * 979) + ((i18 | 875182989) * (-979)) + (((~(i18 | 662580563)) | (~(i19 | 875182989))) * 979);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int iMyPid2 = 1031 - (Process.myPid() >> 22);
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            byte[] bArr4 = $$a;
            byte b10 = bArr4[28];
            byte b11 = bArr4[7];
            Object[] objArr15 = new Object[1];
            c(b10, b11, (short) (b11 | 52), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iMyPid2, iResolveOpacity, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_utilized_orderid).substring(9, 10).codePointAt(0) - 69, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bca).substring(1, 3).codePointAt(0) - 82, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
            byte[] bArr5 = $$a;
            byte b12 = bArr5[28];
            byte b13 = bArr5[7];
            Object[] objArr18 = new Object[1];
            c(b12, b13, (short) (b13 | 156), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSizeAndState, trimmedLength, keyRepeatTimeout, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i23 = d + 41;
            INotificationSideChannel = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i25 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int i26 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr19 = new Object[1];
                c(b15, (byte) (b15 | 52), b14, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(threadPriority, i25, i26, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr20[3])[0];
            int i28 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i29 = (((-1706667071) + (((~((-5288817) | layoutDirection)) | (-238991354)) * (-964))) + (((~((~layoutDirection) | (-5288817))) | 4194304) * (-964))) - 977822712;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
            int i32 = d + 11;
            INotificationSideChannel = i32 % 128;
            int i33 = i32 % 2;
        } else {
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).codePointAt(1) - 121, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_5).substring(3, 4).length() + 15, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_warning_text_blur_image).substring(30, 31).codePointAt(0) - 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-456298544};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46037), 1134 - Color.red(0), View.getDefaultSize(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -977822712, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                byte[] bArr6 = $$a;
                byte b16 = bArr6[28];
                byte b17 = bArr6[7];
                Object[] objArr25 = new Object[1];
                c(b16, b17, (short) (b17 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, iIndexOf, iIndexOf2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45994), 1117 - Gravity.getAbsoluteGravity(0, 0), Process.getGidForName("") + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int i34 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                byte b18 = $$a[7];
                byte b19 = b18;
                Object[] objArr26 = new Object[1];
                c(b19, (byte) (b19 | 52), b18, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mode, pressedStateDuration2, i34, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_alto).substring(1, 3).codePointAt(1) - 89, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step3).substring(0, 1).length() + 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_saved_cards).substring(7, 8).length() - 1), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_6).substring(12, 13).codePointAt(0) - 54, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                    int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                    byte[] bArr7 = $$a;
                    byte b20 = bArr7[28];
                    byte b21 = bArr7[7];
                    Object[] objArr29 = new Object[1];
                    c(b20, b21, (short) (b21 | 156), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration3, iAxisFromString, iKeyCodeFromString, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int iResolveOpacity2 = 15 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr8 = $$a;
                    byte b22 = bArr8[28];
                    byte b23 = bArr8[7];
                    Object[] objArr30 = new Object[1];
                    c(b22, b23, (short) (b23 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, packedPositionChild, iResolveOpacity2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 == i35) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i37 = ((int[]) objArr[2])[0];
            int i38 = ((int[]) objArr[3])[0];
            int i39 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i40 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i41 = i37 + 2078834297 + ((~((-771887238) | i40)) * (-783)) + (((~(i40 | (-800264326))) | (-1044544496)) * 783);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i44 = INotificationSideChannel + 71;
                d = i44 % 128;
                int i45 = i44 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i36 / (((i36 - 1) * i36) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i49 = ~iIdentityHashCode;
        int i50 = i46 + (-985412167) + ((~(809665833 | i49)) * (-560)) + ((~(iIdentityHashCode | 838049215)) * (-560)) + (((~((-565385664) | i49)) | 537002281) * 560);
        int i51 = i50 ^ (i50 << 13);
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[2])[0] = i52 ^ (i52 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 760149116;
        int i6 = ~((-303572854) | i5);
        int i7 = (-1494795456) + ((34603588 | i6) * (-280)) + ((i6 | (~(1133560396 | i5))) * 140);
        int i8 = ~((-268969266) | i5);
        int i9 = ~i5;
        if (i4 != i7 + (((~(i9 | 1402529661)) | i8 | (~((-34603589) | i9))) * 140)) {
            throw null;
        }
        int i10 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i10 != 346024308 + (((~iIdentityHashCode) | 33818978) * 1324) + (((~(iIdentityHashCode | (-1842013198))) | (~(126101866 | iIdentityHashCode))) * (-1324)) + 406377744) {
            int i11 = (-761789248) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i12 = d + 21;
        INotificationSideChannel = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 63 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 65;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i6 = ~i5;
        int i7 = (~(1143871173 | i6)) | 311519530;
        int i8 = ~(i5 | (-1141507074));
        if (i4 != ((i7 | i8) * (-252)) + 363522688 + ((i8 | (~(i6 | 1455390703))) * 252)) {
            throw new RuntimeException("-1432920835");
        }
        int i9 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i11 = ~i10;
        if (i9 != (((~((-1935082021) | i11)) | (~((-643973945) | i10)) | (~(i11 | 643973944))) * 959) + 1148408635 + (((~(i10 | 643973944)) | (~(i11 | (-643973945))) | (~((-1935082021) | i10))) * 959)) {
            throw new RuntimeException("1860221501");
        }
        super.onStart();
        int i12 = INotificationSideChannel + 9;
        d = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a3, code lost:
    
        if (r0 == ((((-1225217362) + ((~((-1895874597) | r4)) * (-301))) + (((~(1962987620 | r4)) | (~((~r4) | 247076289))) * (-301))) + (((~(r4 | (-247076290))) | 1962987620) * 301))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a5, code lost:
    
        r0 = com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.INotificationSideChannel + 63;
        com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.d = r0 % 128;
        r0 = r0 % 2;
        r0 = new int[2015459472];
        r0[2015459471(0x7821788f, float:1.3100078E34)] = 1;
        r4 = (-708454288) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r0[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c6, code lost:
    
        super.onCreate(r13);
        r13 = com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.d + 9;
        com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.INotificationSideChannel = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d2, code lost:
    
        if ((r13 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
    
        r13 = (-947040862) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00df, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r4 == ((((~((-17171489) | r6)) * 521) - 1453921582) + (((~((~r6) | (-17171489))) | (-865074938)) * 521))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r4 == ((1693056763 + ((((~(r7 | (-1053673961))) | 847823080) | (~((-17835538) | r6))) * 717)) + (((~(r6 | (-1053673961))) | ((~(r7 | (-17835538))) | 847823080)) * 717))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = android.os.Process.myUid();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = d + 15;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannel + 115;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void b(AsikResignSalariedWorkerRegistrationActivity asikResignSalariedWorkerRegistrationActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1817517939, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 287365829, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1530772841, 1817517939, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{asikResignSalariedWorkerRegistrationActivity});
            ViewPortBuilder.b();
            int i4 = d + 21;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikResignSalariedWorkerRegistrationActivity asikResignSalariedWorkerRegistrationActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 35;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            asikResignSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = asikResignSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            asikResignSalariedWorkerRegistrationActivity.g();
            return Unit.INSTANCE;
        }
        asikResignSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        asikResignSalariedWorkerRegistrationActivity.g();
        return Unit.INSTANCE;
    }

    static {
        onTransact = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancelAll + 91;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final void INotificationSideChannel() throws NoSuchMethodException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1817517939, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 287365829, (-1530772841) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 1817517939, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 109;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 63;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws NoSuchMethodException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(881098728, RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1158488422 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_email_id).substring(14, 16).length(), RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -881098725, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this});
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws NoSuchMethodException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(630816864, RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -630816862, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1918280574, 2048396406 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).codePointAt(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1681046426, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1918280575, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, bundle});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 91;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    static void d() {
        f470a = new char[]{45558, 31895, 11070, 55747, 33818, 45794, 24961, 11284, 55979, 35080, 47083, 25195, 4375, 57226, 35381, 47303, 45557, 31890, 11053, 55756, 33856, 45799, 24980, 11267, 55940, 35143, 47051, 25210, 4391, 57233, 35380, 47311, 45565, 31896, 11052, 55760, 33883, 45799, 24964, 11348, 55971, 35157, 46998, 25153, 4381, 57229, 35364, 47311, 26449, 5589, 49284, 36653, 48567, 26693, 45561, 31898, 11049, 55762, 33863, 45803, 24964, 11304, 55977, 35143, 47060, 25190, 4365, 57235, 35381};
        asBinder = 514058367597378806L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.$$c
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity.$$i(short, byte, byte):java.lang.String");
    }
}
