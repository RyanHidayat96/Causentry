package com.bpjstku.presentation.membership.registration.indonesianmigranworker;

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
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityIndonesianMigrantWorkerBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.util.custom.WrapContentLinearLayoutManager;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda1;
import defpackage.CameraUseCaseAdapter;
import defpackage.TooltipCompatApi26Impl;
import defpackage.TorchFlashRequiredFor3aUpdateQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.dumpAudioCapabilities;
import defpackage.findQualityInTargetQualities;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getIOThreadExecutor;
import defpackage.getIncrementalScaleFactor;
import defpackage.getInflatedId;
import defpackage.initSession;
import defpackage.lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl;
import defpackage.logToString;
import defpackage.onCaptureSessionEnd;
import defpackage.readableMs;
import defpackage.shouldBeUsed;
import defpackage.tryUnregisterOnBackInvokedCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\n\u001a\u00020\r8\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\u000f\u0010'"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/indonesianmigranworker/IndonesianMigrantWorkerActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityIndonesianMigrantWorkerBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "onTransact", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "cancelAll", "LBufferProviderState;", "LBufferProviderState;", "Landroidx/fragment/app/FragmentManager;", "TuitionPaymentFragmentbindingInflater1", "Landroidx/fragment/app/FragmentManager;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "d", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndonesianMigrantWorkerActivity extends BindingBaseActivity<ActivityIndonesianMigrantWorkerBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancelAll;
    private static char d;
    private static char g;
    private static char notify;
    private static int onTransact;
    private final FragmentManager TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private MigrantWorkerRegistration b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$f = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {8, -36, 87, -65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 83;
    private static int INotificationSideChannelStub = 1;
    private static int cancel = 0;
    private static int INotificationSideChannel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = ~(i9 | i5);
        int i11 = ~((~i6) | i);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i + i5 + i4 + ((-1232316077) * i2) + ((-263306238) * i3);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i) - 1785593856) + (933837065 * i5) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i4) + (1319895040 * i2) + (1514668032 * i3) + (1334968320 * i15);
        int i17 = ((i * (-2046307327)) - 1888090795) + (i5 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i4 * (-2046307883)) + (i2 * 1526207759) + (i3 * (-1095616598)) + (i15 * 1719271424);
        int i18 = i16 + (i17 * i17 * 2111700992);
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    public static final class TuitionPaymentFragmentbindingInflater1<T> implements findQualityInTargetQualities {
        public static final TuitionPaymentFragmentbindingInflater1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1<>();

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof Camera2CameraControlExternalSyntheticLambda1;
        }
    }

    public static final class b<T, R> implements readableMs {
        public static final b<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b<>();

        @Override // defpackage.readableMs
        public final T apply(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (T) ((Camera2CameraControlExternalSyntheticLambda1) obj);
        }
    }

    public IndonesianMigrantWorkerActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.TuitionPaymentFragmentbindingInflater1 = supportFragmentManager;
        this.b = new MigrantWorkerRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        this.asInterface = R.layout.activity_indonesian_migrant_worker;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/indonesianmigranworker/IndonesianMigrantWorkerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, IndonesianMigrantWorkerActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 87;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerActivity$bindingInflater$1 indonesianMigrantWorkerActivity$bindingInflater$1 = IndonesianMigrantWorkerActivity$bindingInflater$1.b;
        if (i3 != 0) {
            return indonesianMigrantWorkerActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        IndonesianMigrantWorkerActivity indonesianMigrantWorkerActivity = (IndonesianMigrantWorkerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 29;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = indonesianMigrantWorkerActivity.asInterface;
        if (i4 == 0) {
            int i6 = 37 / 0;
        }
        int i7 = i3 + 25;
        cancel = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 121;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.d = LayoutRegistrationProgressBinding.bind(((ActivityIndonesianMigrantWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        IndonesianMigrantWorkerActivity indonesianMigrantWorkerActivity = this;
        Intrinsics.checkNotNullParameter(indonesianMigrantWorkerActivity, "");
        indonesianMigrantWorkerActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityIndonesianMigrantWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_indonesia_migrant_worker);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = cancel + 111;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.d;
        if (layoutRegistrationProgressBinding == null) {
            int i2 = cancel + 57;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = INotificationSideChannel + 77;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        onTransact();
        ((ActivityIndonesianMigrantWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ToolbarInspectionCompanion
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndonesianMigrantWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        VideoRecordEventStart<R> map = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().filter(TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).map(b.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNullExpressionValue(map, "");
        VideoRecordEventStart videoRecordEventStartObserveOn = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: ToolbarExpandedActionViewMenuPresenter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (Camera2CameraControlExternalSyntheticLambda1) obj};
                int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                return (Unit) IndonesianMigrantWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-83493082, WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), objArr, WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), 83493084, iTuitionPaymentFragmentbindingInflater1);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: tryRegisterOnBackInvokedCallback
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                IndonesianMigrantWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        });
        int i2 = cancel + 13;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
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
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) notify) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(cancelAll);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cBlue = (char) (47773 - Color.blue(i3));
                        int i12 = 469 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i13 = (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i12, i13, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i14 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) d) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(g)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myTid() >> 22) + 47773), TextUtils.getCapsMode("", 0, 0) + 468, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i14 + 1;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2323 - View.combineMeasuredStates(0, 0), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1312321721, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i15 = $10 + 77;
            $11 = i15 % 128;
            int i16 = i15 % 2;
        }
    }

    private final void onTransact() {
        getIOThreadExecutor getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i2 == 2) {
            getIOThreadExecutor.Companion companion = getIOThreadExecutor.INSTANCE;
            getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getIOThreadExecutor.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        } else if (i2 == 3) {
            tryUnregisterOnBackInvokedCallback.Companion bVar = tryUnregisterOnBackInvokedCallback.INSTANCE;
            getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = tryUnregisterOnBackInvokedCallback.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        } else if (i2 == 4) {
            shouldBeUsed.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = shouldBeUsed.INSTANCE;
            getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldBeUsed.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        } else if (i2 != 5) {
            int i3 = INotificationSideChannel + 91;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            TooltipCompatApi26Impl.Companion bVar2 = TooltipCompatApi26Impl.INSTANCE;
            getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TooltipCompatApi26Impl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i5 = cancel + 31;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getInflatedId.Companion companion2 = getInflatedId.INSTANCE;
            getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInflatedId.Companion.TuitionPaymentFragmentbindingInflater1(this.b);
        }
        this.TuitionPaymentFragmentbindingInflater1.beginTransaction().add(R.id.indonesianMigrantWorkerContainer, getiothreadexecutorTuitionPaymentFragmentspecialinlinedviewModeldefault3).addToBackStack(null).commit();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i7 = cancel + 15;
        INotificationSideChannel = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.d;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress((100 / this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * p0);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append("/");
        sb.append(i3);
        textView.setText(sb.toString());
        if (p0 == 2) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_upload_document));
            return;
        }
        int i4 = INotificationSideChannel;
        int i5 = i4 + 17;
        cancel = i5 % 128;
        if (i5 % 2 == 0 ? p0 == 3 : p0 == 2) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_form_filling));
            return;
        }
        if (p0 == 4) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_program_of_choise));
            return;
        }
        int i6 = i4 + 61;
        cancel = i6 % 128;
        int i7 = i6 % 2;
        if (p0 == 5) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_confirmation));
            return;
        }
        int i8 = i4 + 99;
        cancel = i8 % 128;
        int i9 = i8 % 2;
        layoutRegistrationProgressBinding.tvRegistrationStep.setText(getResources().getString(R.string.label_identity_verification));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancel + 91;
        INotificationSideChannel = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i3 = INotificationSideChannel + 9;
                cancel = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = cancel + 69;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        cancelAll();
        int i4 = cancel + 119;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        BufferProviderState bufferProviderState2 = null;
        if (bufferProviderState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bufferProviderState = null;
        }
        if (!bufferProviderState.isDisposed()) {
            BufferProviderState bufferProviderState3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bufferProviderState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                bufferProviderState2 = bufferProviderState3;
            }
            bufferProviderState2.dispose();
            int i2 = cancel + 29;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        super.onDestroy();
        int i4 = INotificationSideChannel + 107;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void cancelAll() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 99;
        cancel = i2 % 128;
        if (i2 % 2 == 0 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 1 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 1) {
            this.TuitionPaymentFragmentbindingInflater1.popBackStack();
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
            return;
        }
        d_();
        int i4 = INotificationSideChannel + 101;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
            int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) 52, bArr[7], bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i3, iIndexOf, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{7505, 55236, 9844, 3577, 9666, 50305, 9459, 12259, 8118, 6916, 56486, 51798, 39846, 54104, 35860, 53297, 18072, 4280, 35834, 60532, 40264, 49606, 26198, 47921}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{46051, 12327, 6426, 17523, 52822, 38211, 11442, 36102, 12072, 10392, 10980, 57795, 29121, 22611, 26158, 50631, 21768, 31778}, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
            byte b2 = (byte) 52;
            Object[] objArr6 = new Object[1];
            c(b2, b2, $$a[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iIndexOf2, iLastIndexOf, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i4 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b4, (short) (b4 | 104), b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i4, iNormalizeMetaState, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr8[3])[0];
            int i6 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i7 = ~iUptimeMillis;
            int i8 = ((((-1691414020) + ((~(817903467 | i7)) * 979)) + ((iUptimeMillis | 1062183637) * (-979))) + (((~(iUptimeMillis | 817903467)) | (~(i7 | 1062183637))) * 979)) - 824950377;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{48308, 7767, 28286, 15508, 11195, 53865, 7654, 7826, 43828, 7903, 15675, 31271, 10785, 24128, 61490, 16026, 40304, 5450}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{26615, 36687, 1172, 27558, 64407, 57132, 7179, 46873, 36484, 62810, 36282, 20368, 64481, 49133, 33751, 21627, 37144, 42912}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {1939799850};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - Process.getGidForName("")), ExpandableListView.getPackedPositionChild(0L) + 1135, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -824950377, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                    int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((byte) 52, bArr2[7], bArr2[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, longPressTimeout, deadChar, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), 16 - ImageFormat.getBitsPerPixel(0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr14 = new Object[1];
                    c(b6, (short) (b6 | 104), b5, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i11, tapTimeout, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{7505, 55236, 9844, 3577, 9666, 50305, 9459, 12259, 8118, 6916, 56486, 51798, 39846, 54104, 35860, 53297, 18072, 4280, 35834, 60532, 40264, 49606, 26198, 47921}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_klik_bca).substring(4, 5).codePointAt(0) - 93, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{46051, 12327, 6426, 17523, 52822, 38211, 11442, 36102, 12072, 10392, 10980, 57795, 29121, 22611, 26158, 50631, 21768, 31778}, 14 - Process.getGidForName(""), objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iGreen = Color.green(0) + 1031;
                        int iArgb = Color.argb(0, 0, 0, 0) + 15;
                        byte b7 = (byte) 52;
                        Object[] objArr17 = new Object[1];
                        c(b7, b7, $$a[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, iGreen, iArgb, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i12 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr3[7], bArr3[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, doubleTapTimeout, i12, 1357589585, false, (String) objArr18[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i15 = cancel + 77;
                INotificationSideChannel = i15 % 128;
                int i16 = i15 % 2;
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i20 = ~((int) Process.getStartElapsedRealtime());
        int i21 = i17 + 2075124816 + (((~(449937891 | i20)) | (-694218062)) * (-983)) + (((~(i20 | (-694218062))) | 138445121) * 983);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr19[2])[0] = i23 ^ (i23 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c4 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int doubleTapTimeout2 = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int size2 = View.MeasureSpec.getSize(0) + 23;
            Object[] objArr20 = new Object[1];
            c((byte) 37, (short) 104, $$a[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, doubleTapTimeout2, size2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c5 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int iAlpha = Color.alpha(0) + 23;
                byte b8 = (byte) 52;
                Object[] objArr21 = new Object[1];
                c(b8, b8, $$a[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, trimmedLength, iAlpha, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i24 = ((int[]) objArr22[0])[0];
            objArr2 = new Object[]{new int[]{i24}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i25 = ~iUptimeMillis2;
            int i26 = (~((-670413943) | i25)) | 54633524;
            int i27 = ~(iUptimeMillis2 | 1073591934);
            int i28 = 1478470340 + ((i26 | i27) * (-713)) + (i27 * 1426) + ((~(457811516 | i25)) * 713) + 1684508826;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[3])[0] = i30 ^ (i30 << 5);
            int i31 = cancel + 81;
            INotificationSideChannel = i31 % 128;
            int i32 = i31 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{48308, 7767, 28286, 15508, 11195, 53865, 7654, 7826, 43828, 7903, 15675, 31271, 10785, 24128, 61490, 16026, 40304, 5450}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step4).substring(0, 3).codePointAt(2) + 7, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{26615, 36687, 1172, 27558, 64407, 57132, 7179, 46873, 36484, 62810, 36282, 20368, 64481, 49133, 33751, 21627, 37144, 42912}, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1939799850};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.MeasureSpec.getSize(0) + 42049), Color.alpha(0) + 1726, 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1684508826);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c6 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int iGreen2 = Color.green(0) + 1755;
                int longPressTimeout2 = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b9 = (byte) 52;
                Object[] objArr26 = new Object[1];
                c(b9, b9, $$a[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c6, iGreen2, longPressTimeout2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{7505, 55236, 9844, 3577, 9666, 50305, 9459, 12259, 8118, 6916, 56486, 51798, 39846, 54104, 35860, 53297, 18072, 4280, 35834, 60532, 40264, 49606, 26198, 47921}, (ViewConfiguration.getTouchSlop() >> 8) + 22, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{46051, 12327, 6426, 17523, 52822, 38211, 11442, 36102, 12072, 10392, 10980, 57795, 29121, 22611, 26158, 50631, 21768, 31778}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 31, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                    int i33 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) 141, $$a[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb, fadingEdgeLength, i33, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                    int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 23;
                    Object[] objArr30 = new Object[1];
                    c((byte) 37, (short) 104, $$a[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mirror, capsMode, iArgb2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr2[1])[0];
        int i35 = ((int[]) objArr2[0])[0];
        if (i35 != i34) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i35));
        }
        int i36 = ((int[]) objArr2[3])[0];
        int i37 = ((int[]) objArr2[0])[0];
        Object[] objArr31 = {new int[]{i37}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int iMyUid = Process.myUid();
        int i38 = ~iMyUid;
        int i39 = (~(424176249 | i38)) | 615780482;
        int i40 = ~(iMyUid | (-403178057));
        int i41 = i36 + ((i39 | i40) * (-252)) + 770461233 + ((i40 | (~(i38 | 1039956731))) * 252);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e4, code lost:
    
        if (r1 != (((1221027989 + (((~(r2 | (-1791033925))) | (-75122594)) * (-465))) + (((-1791033925) | (~((-75122594) | r2))) * 930)) + ((r2 | (-4194817)) * 465))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e6, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.INotificationSideChannel + 5;
        com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.cancel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f2, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f5, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f9, code lost:
    
        r1 = (-1210803378) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0102, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010a, code lost:
    
        throw new java.lang.RuntimeException("1683050608");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r1 == ((((-1547220428) + (((~((-277248219) | r5)) | 1107235761) * (-865))) + ((~(r4 | 277248218)) * 865)) + (((~(1107235761 | r5)) | (~(r5 | 277248218))) * 865))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r1 == ((((-1740472208) + ((r5 | r7) * (-516))) + (((~(r4 | (-537100586))) | (~((-234898051) | r6))) * 516)) + ((234898050 | r7) * 516))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.ef_content_desc_folder).substring(0, 6).length() + 149132010;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 61;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            if (i3 != (-1662159884) + (((~((~i4) | (-134482577))) | (~((-1111105569) | i4))) * (-302)) + ((~((-134482577) | i4)) * (-604)) + (((~(i4 | (-1245588145))) | (-1526706170)) * 302)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            if (i5 != ((~(i6 | (-1580842512))) * TypedValues.CycleType.TYPE_EASING) + 2093588940 + (((~((~i6) | (-1580842512))) | 549454128) * TypedValues.CycleType.TYPE_EASING)) {
                throw null;
            }
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(381552144);
        if (i7 != (((-1193462180) + (((~((-1738354043) | iNextInt)) | 572261730) * 576)) + (((~((~iNextInt) | (-1166092313))) | 268440192) * 576)) - 1089725312) {
            throw null;
        }
        super.onStart();
        int i8 = cancel + 33;
        INotificationSideChannel = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 69;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay_qris).substring(0, 5).codePointAt(2) + 455607102;
        int i5 = ~iCodePointAt;
        if (i4 != 1030217848 + (((~(995323155 | i5)) | (~((-838937860) | iCodePointAt))) * (-831)) + ((~(1004273471 | iCodePointAt)) * (-1662)) + (((~(iCodePointAt | (-995323156))) | (~(i5 | (-165335613))) | (~(165335612 | iCodePointAt))) * 831)) {
            int i6 = (-787531034) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        if (i7 != (((~(i8 | 2116783268)) * TypedValues.CycleType.TYPE_EASING) - 511189616) + (((~((~i8) | 2116783268)) | 436832416) * TypedValues.CycleType.TYPE_EASING)) {
            int i9 = (-291483342) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = INotificationSideChannel + 61;
        cancel = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndonesianMigrantWorkerActivity indonesianMigrantWorkerActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 89;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            indonesianMigrantWorkerActivity.cancelAll();
            ViewPortBuilder.b();
            int i4 = INotificationSideChannel + 81;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        IndonesianMigrantWorkerActivity indonesianMigrantWorkerActivity = (IndonesianMigrantWorkerActivity) objArr[0];
        Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = (Camera2CameraControlExternalSyntheticLambda1) objArr[1];
        int i = 2 % 2;
        int i2 = cancel + 75;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        indonesianMigrantWorkerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        indonesianMigrantWorkerActivity.b = camera2CameraControlExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
        indonesianMigrantWorkerActivity.onTransact();
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 115;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancel + 29;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndonesianMigrantWorkerActivity indonesianMigrantWorkerActivity, Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1) {
        int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-83493082, WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), new Object[]{indonesianMigrantWorkerActivity, camera2CameraControlExternalSyntheticLambda1}, iTuitionPaymentFragmentbindingInflater2, 83493084, iTuitionPaymentFragmentbindingInflater1);
    }

    static {
        onTransact = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStub + 81;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityIndonesianMigrantWorkerBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TorchFlashRequiredFor3aUpdateQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(1817255880, (-2007799520) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingzipcode_invalid).substring(24, 25).length(), WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1817255879, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1926835702;
        int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(2111865108, WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), TorchFlashRequiredFor3aUpdateQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, -2111865105, iCodePointAt)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancel + 35;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 63;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 1768563879 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1909261113, WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1(), 1282022595 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, 1909261113, i);
    }

    static void g() {
        d = (char) 20609;
        g = (char) 54988;
        notify = (char) 47369;
        cancelAll = (char) 32810;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        IndonesianMigrantWorkerActivity indonesianMigrantWorkerActivity = (IndonesianMigrantWorkerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 73;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 87;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 3
            int r6 = 108 - r6
            byte[] r1 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerActivity.$$i(byte, byte, short):java.lang.String");
    }
}
