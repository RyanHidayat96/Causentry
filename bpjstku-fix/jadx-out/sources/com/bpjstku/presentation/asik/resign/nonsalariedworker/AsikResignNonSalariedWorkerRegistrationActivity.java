package com.bpjstku.presentation.asik.resign.nonsalariedworker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAsikResignNonSalariedWorkerRegistrationBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.AppCompatViewInflater;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.collapseItemActionView;
import defpackage.createEditText;
import defpackage.createExtraImageCapture;
import defpackage.createRatingBar;
import defpackage.createViewByPrefix;
import defpackage.createViewFromTag;
import defpackage.dumpAudioCapabilities;
import defpackage.findQualityInTargetQualities;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.lambdasetActive6androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl;
import defpackage.logToString;
import defpackage.readableMs;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u001a\u0010\n\u001a\u00020\r8\u0015X\u0095D¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u000f\u0010#"}, d2 = {"Lcom/bpjstku/presentation/asik/resign/nonsalariedworker/AsikResignNonSalariedWorkerRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikResignNonSalariedWorkerRegistrationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "g", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "cancelAll", "LBufferProviderState;", "LBufferProviderState;", "I", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikResignNonSalariedWorkerRegistrationActivity extends BindingBaseActivity<ActivityAsikResignNonSalariedWorkerRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] asBinder;
    private static int cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final FragmentManager b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 4;
    private final int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {82, Base64.padSymbol, -66, -42};
    private static final int $$f = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 238;
    private static int onTransact = 1;
    private static int g = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        createViewFromTag createviewfromtagB;
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = i | i7 | i8;
        int i10 = ~(i6 | i7);
        int i11 = (~(i7 | i8)) | (~i);
        int i12 = i + i3 + i2 + ((-1537480081) * i4) + ((-1176924877) * i5);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i) - 1179058176) + ((-1443770816) * i3) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i2) + (1226178560 * i4) + ((-1044512768) * i5) + (1201733632 * i13);
        int i15 = (i * 1018573086) + 1206756779 + (i3 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i2 * 1018572655) + (i4 * (-758184159)) + (i5 * (-595421667)) + (i13 * (-1647378432));
        int i16 = i14 + (i15 * i15 * 1518272512);
        if (i16 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i16 != 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity = (AsikResignNonSalariedWorkerRegistrationActivity) objArr[0];
        int i17 = 2 % 2;
        int i18 = d + 125;
        int i19 = i18 % 128;
        g = i19;
        int i20 = i18 % 2;
        int i21 = asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i21 != 2) {
            int i22 = i19 + 113;
            int i23 = i22 % 128;
            d = i23;
            int i24 = i22 % 2;
            if (i21 != 3) {
                int i25 = i23 + 37;
                g = i25 % 128;
                if (i25 % 2 == 0 ? i21 == 4 : i21 == 4) {
                    createRatingBar.Companion companion = createRatingBar.INSTANCE;
                    createviewfromtagB = createRatingBar.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } else {
                    createViewByPrefix.Companion companion2 = createViewByPrefix.INSTANCE;
                    createviewfromtagB = createViewByPrefix.Companion.b();
                }
            } else {
                AppCompatViewInflater.Companion companion3 = AppCompatViewInflater.INSTANCE;
                createviewfromtagB = AppCompatViewInflater.Companion.b();
            }
        } else {
            createViewFromTag.Companion companion4 = createViewFromTag.INSTANCE;
            createviewfromtagB = createViewFromTag.Companion.b();
        }
        asikResignNonSalariedWorkerRegistrationActivity.b.beginTransaction().add(R.id.nonSalariedWorkerContainer, createviewfromtagB).addToBackStack(null).commit();
        asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity.$$a
            int r9 = 144 - r9
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L13:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L17:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements findQualityInTargetQualities {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>();

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof lambdasetActive6androidxcameracamera2interopCamera2CameraControl;
        }
    }

    public static final class b<T, R> implements readableMs {
        public static final b<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b<>();

        @Override // defpackage.readableMs
        public final T apply(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (T) ((lambdasetActive6androidxcameracamera2interopCamera2CameraControl) obj);
        }
    }

    public AsikResignNonSalariedWorkerRegistrationActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.b = supportFragmentManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        this.asInterface = R.layout.activity_asik_resign_non_salaried_worker_registration;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/asik/resign/nonsalariedworker/AsikResignNonSalariedWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, AsikResignNonSalariedWorkerRegistrationActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikResignNonSalariedWorkerRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
        AsikResignNonSalariedWorkerRegistrationActivity$bindingInflater$1 asikResignNonSalariedWorkerRegistrationActivity$bindingInflater$1 = AsikResignNonSalariedWorkerRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return asikResignNonSalariedWorkerRegistrationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 57;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.asInterface;
        int i6 = i3 + 65;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity = (AsikResignNonSalariedWorkerRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 57;
        g = i2 % 128;
        int i3 = i2 % 2;
        asikResignNonSalariedWorkerRegistrationActivity.a = LayoutRegistrationProgressBinding.bind(((ActivityAsikResignNonSalariedWorkerRegistrationBinding) ((ViewBinding) asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity2 = asikResignNonSalariedWorkerRegistrationActivity;
        Intrinsics.checkNotNullParameter(asikResignNonSalariedWorkerRegistrationActivity2, "");
        asikResignNonSalariedWorkerRegistrationActivity2.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityAsikResignNonSalariedWorkerRegistrationBinding) ((ViewBinding) asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = asikResignNonSalariedWorkerRegistrationActivity.getString(R.string.title_asik_program);
        Intrinsics.checkNotNullExpressionValue(string, "");
        asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = g + 117;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 55;
        int i3 = i2 % 128;
        g = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        if (layoutRegistrationProgressBinding == null) {
            int i4 = i3 + 87;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        TuitionPaymentFragmentbindingInflater1(-1238193542, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1238193545, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1683951732, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        ((ActivityAsikResignNonSalariedWorkerRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: createToggleButton
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentbindingInflater1(-636222203, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 636222203, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view}, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        VideoRecordEventStart<R> map = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().filter(TuitionPaymentFragmentspecialinlinedviewModeldefault1.b).map(b.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNullExpressionValue(map, "");
        VideoRecordEventStart videoRecordEventStartObserveOn = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: createTextView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikResignNonSalariedWorkerRegistrationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: AppCompatViewInflaterDeclaredOnClickListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                AsikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        });
        int i2 = d + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        int i = 2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        if (layoutRegistrationProgressBinding == null) {
            int i2 = g + 63;
            d = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress((100 / this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * p0);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append("/");
        sb.append(i5);
        textView.setText(sb.toString());
        if (p0 == 2) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_population_data));
            return;
        }
        if (p0 == 3) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_contact_and_additional_data));
            int i6 = g + 69;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i7 = d + 119;
        g = i7 % 128;
        int i8 = i7 % 2;
        if (p0 == 4) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_biometric_verification));
            return;
        }
        layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_current_job));
        int i9 = g + 85;
        d = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = g + 41;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 2 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = d + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        cancelAll();
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (bufferProviderState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bufferProviderState = null;
        }
        if (!bufferProviderState.isDisposed()) {
            BufferProviderState bufferProviderState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bufferProviderState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i2 = g + 63;
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 5;
                }
                bufferProviderState2 = null;
            }
            bufferProviderState2.dispose();
        }
        super.onDestroy();
        int i4 = d + 105;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void cancelAll() {
        int i = 2 % 2;
        int i2 = d + 37;
        g = i2 % 128;
        if (i2 % 2 == 0 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 1 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0) {
            d_();
            return;
        }
        this.b.popBackStack();
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
        int i4 = g + 29;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = asBinder;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 23;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i9 = $10 + 77;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 3290 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, 1948206109, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i2++;
                    i3 = 2;
                    i5 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asBinder;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 69;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i6;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(i7), View.resolveSizeAndState(i7, i7, i7) + 3291, 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1948206109, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i7;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i15 = $11 + 93;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i17 = 17;
            for (int i18 = 1; i17 > i18; i18 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                try {
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2558 - ImageFormat.getBitsPerPixel(0), 29 - Gravity.getAbsoluteGravity(0, 0), 683220507, false, $$i(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i17--;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 28879), (ViewConfiguration.getEdgeSlop() >> 16) + 348, ((byte) KeyEvent.getModifierMetaStateMask()) + 26, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArr3;
        int i = 0;
        AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity = (AsikResignNonSalariedWorkerRegistrationActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iAxisFromString = MotionEvent.axisFromString("") + 16;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr4 = new Object[1];
            c(b2, b3, (short) (b3 | 141), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, iAxisFromString, 1357589585, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        e(new int[]{1199987693, -137388059, -239105919, 988715839, 1536081163, -427768575, 631045936, 1641514180, 1032020908, -1988710792, -409223115, 9560301, -835465950, -1991471948}, 22 - (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        e(new int[]{-152606894, -1294092691, -1170499179, 2018259366, 627618058, 280857396, -1864569541, 1188424408, 217511168, -915495703}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
            int iBlue = 15 - Color.blue(0);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            byte b5 = bArr2[7];
            Object[] objArr7 = new Object[1];
            c(b4, b5, (short) (b5 | 89), objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, iKeyCodeFromString, iBlue, 1344079056, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = d + 105;
            g = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int i5 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                byte b6 = $$a[7];
                Object[] objArr8 = new Object[1];
                c(b6, (byte) (b6 | 52), (short) 37, objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, i5, iResolveOpacity, 632103528, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr9[3])[0];
            int i7 = ((int[]) objArr9[1])[0];
            String[] strArr = (String[]) objArr9[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i8 = (((~(iUptimeMillis | 177554434)) | 66725735) * 56) + 2131659569 + (((~((~iUptimeMillis) | 66725735)) | 177554434) * 56) + 953650597;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            e(new int[]{358276792, 998489747, -1606585991, -457487033, 117733219, -813849535, -1655221467, -959936654, -533654194, -1256798037}, 16 - TextUtils.indexOf("", ""), objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{-1998900070, -1215817938, 1480428964, 1965050455, -773012031, 433238816, -1093587255, -2005724585, 45133602, -822931980}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_invalid_parameter).substring(0, 23).length() - 7, objArr11);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr11[0], Object.class).invoke(null, asikResignNonSalariedWorkerRegistrationActivity)).intValue();
            try {
                Object[] objArr12 = {-2096597324};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - ((byte) KeyEvent.getModifierMetaStateMask())), 1134 - (ViewConfiguration.getFadingEdgeLength() >> 16), 18 - KeyEvent.normalizeMetaState(0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr13 = {Integer.valueOf(iIntValue), 0, 953650597, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr12), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                    int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr3 = $$a;
                    byte b7 = bArr3[5];
                    byte b8 = bArr3[7];
                    Object[] objArr14 = new Object[1];
                    c(b7, b8, (short) (b8 | 141), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarFadeDuration, threadPriority, 1298546779, false, (String) objArr14[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45992), View.resolveSizeAndState(0, 0, 0) + 1117, Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                    byte b9 = $$a[7];
                    Object[] objArr15 = new Object[1];
                    c(b9, (byte) (b9 | 52), (short) 37, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i11, offsetBefore, 632103528, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new int[]{1199987693, -137388059, -239105919, 988715839, 1536081163, -427768575, 631045936, 1641514180, 1032020908, -1988710792, -409223115, 9560301, -835465950, -1991471948}, 22 - TextUtils.indexOf("", ""), objArr16);
                    Class<?> cls3 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new int[]{-152606894, -1294092691, -1170499179, 2018259366, 627618058, 280857396, -1864569541, 1188424408, 217511168, -915495703}, 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr17);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iRed = 1031 - Color.red(0);
                        int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        byte b11 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        c(b10, b11, (short) (b11 | 89), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, iRed, i12, 1344079056, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int doubleTapTimeout2 = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int defaultSize = 15 - View.getDefaultSize(0, 0);
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[5];
                        byte b13 = bArr5[7];
                        Object[] objArr19 = new Object[1];
                        c(b12, b13, (short) (b13 | 141), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, doubleTapTimeout2, defaultSize, 1357589585, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr2[1])[0];
        int i14 = ((int[]) objArr2[3])[0];
        if (i14 == i13) {
            int i15 = d + 117;
            g = i15 % 128;
            int i16 = i15 % 2;
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr2[2])[0];
            int i18 = ((int[]) objArr2[3])[0];
            int i19 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int i20 = ~((~Process.myPid()) | 371846522);
            int i21 = i17 + ((101220368 | i20) * (-374)) + 1311025645 + ((i20 | 270626154) * 374);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr20[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                int i24 = 0;
                while (i24 < strArr3.length) {
                    int i25 = d + 53;
                    g = i25 % 128;
                    if (i25 % 2 != 0) {
                        arrayList.add(strArr3[i24]);
                        i24 += 99;
                    } else {
                        arrayList.add(strArr3[i24]);
                        i24++;
                    }
                }
            }
            int[] iArr = new int[i14];
            int i26 = i14 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i26) % 2) - 1], 1).show();
            Object[] objArr21 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr2[2])[0];
            int i28 = ((int[]) objArr2[3])[0];
            int i29 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int i30 = ~Process.myTid();
            int i31 = i27 + (-312448887) + (((~(i30 | 523083541)) | 9576618) * (-160)) + (((~(i30 | 278803371)) | 523083541) * 160);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr21[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
            int touchSlop = 23 - (ViewConfiguration.getTouchSlop() >> 8);
            byte b14 = $$a[5];
            Object[] objArr22 = new Object[1];
            c(b14, (byte) (b14 | 14), (short) 37, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, iLastIndexOf, touchSlop, 986134021, false, (String) objArr22[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = g + 1;
            d = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (29943 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int iGreen = Color.green(0) + 23;
                byte[] bArr6 = $$a;
                byte b15 = bArr6[5];
                byte b16 = bArr6[7];
                Object[] objArr23 = new Object[1];
                c(b15, b16, (short) (b16 | 89), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, mirror, iGreen, 1599039318, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i36 = ((int[]) objArr24[0])[0];
            objArr3 = new Object[]{new int[]{i36}, new int[]{((int[]) objArr24[1])[0]}, (Object[]) objArr24[2], new int[1], (String[]) objArr24[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i37 = ~iMaxMemory;
            int i38 = (((2031834509 + (((~((-72882185) | i37)) | 285484610) * 220)) + (((~(i37 | (-249239821))) | 461842246) * (-440))) + ((iMaxMemory | (-72882185)) * 220)) - 1757680119;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr3[3])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr25 = new Object[1];
            e(new int[]{358276792, 998489747, -1606585991, -457487033, 117733219, -813849535, -1655221467, -959936654, -533654194, -1256798037}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step3).substring(0, 1).codePointAt(0) - 51, objArr25);
            Class<?> cls4 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            e(new int[]{-1998900070, -1215817938, 1480428964, 1965050455, -773012031, 433238816, -1093587255, -2005724585, 45133602, -822931980}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr26);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr26[0], Object.class).invoke(null, asikResignNonSalariedWorkerRegistrationActivity)).intValue();
            Object[] objArr27 = {-2096597324};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1726 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr27), -1757680119, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                int iGreen2 = Color.green(0) + 23;
                byte[] bArr7 = $$a;
                byte b17 = bArr7[5];
                byte b18 = bArr7[7];
                Object[] objArr28 = new Object[1];
                c(b17, b18, (short) (b18 | 89), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid, pressedStateDuration2, iGreen2, 1599039318, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr29 = new Object[1];
                e(new int[]{1199987693, -137388059, -239105919, 988715839, 1536081163, -427768575, 631045936, 1641514180, 1032020908, -1988710792, -409223115, 9560301, -835465950, -1991471948}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 94, objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e(new int[]{-152606894, -1294092691, -1170499179, 2018259366, 627618058, 280857396, -1864569541, 1188424408, 217511168, -915495703}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr30);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int defaultSize2 = 1755 - View.getDefaultSize(0, 0);
                    int doubleTapTimeout3 = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr8 = $$a;
                    byte b19 = bArr8[5];
                    byte b20 = bArr8[7];
                    Object[] objArr31 = new Object[1];
                    c(b19, b20, b20, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay, defaultSize2, doubleTapTimeout3, 1596667560, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                    int i41 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                    int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b21 = $$a[5];
                    Object[] objArr32 = new Object[1];
                    c(b21, (byte) (b21 | 14), (short) 37, objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState, i41, keyRepeatDelay, 986134021, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr3 = objArrB$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[4];
            if (strArr5 != null) {
                int i42 = g + 23;
                d = i42 % 128;
                int i43 = i42 % 2;
                while (i < strArr5.length) {
                    int i44 = g + 99;
                    d = i44 % 128;
                    if (i44 % 2 == 0) {
                        arrayList2.add(strArr5[i]);
                        i += 61;
                    } else {
                        arrayList2.add(strArr5[i]);
                        i++;
                    }
                }
            }
            throw null;
        }
        int i45 = ((int[]) objArr3[3])[0];
        int i46 = ((int[]) objArr3[0])[0];
        Object[] objArr33 = {new int[]{i46}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
        int i47 = (int) Runtime.getRuntime().totalMemory();
        int i48 = (-1675824599) + (((~((-370102423) | i47)) | 369889410 | (~(157499996 | i47))) * (-880));
        int i49 = (~((-370102423) | (~i47))) | (-157499997);
        int i50 = ~(i47 | 370102422);
        int i51 = i45 + i48 + ((i49 | i50) * (-880)) + (i50 * 880);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr33[3])[0] = i53 ^ (i53 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_now).substring(1, 3).codePointAt(0) + 1321070652;
        if (i4 != ((465590814 + (((~((-554731090) | iCodePointAt)) | (~((-1384718633) | iCodePointAt))) * 69)) + (((~(iCodePointAt | (-1389193515))) | ((~((-559205972) | iCodePointAt)) | 4474882)) * (-69))) - 986811500) {
            throw new RuntimeException("1083225398");
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(1265132678);
        if (i5 != (((~((~iNextInt) | 1809762223)) * 130) - 590173256) + (((~(iNextInt | 1809762223)) | android.R.string.copyUrl) * 130)) {
            int i6 = d + 55;
            g = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[1455382154];
            iArr[1455382153] = 1;
            int i8 = (-1776925734) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i9 = d + 45;
            g = i9 % 128;
            int i10 = i9 % 2;
        }
        super.onResume();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 91;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = 899737108 + ((iIdentityHashCode | 160649223) * (-50));
        int i6 = ~((-9441282) | iIdentityHashCode);
        int i7 = ~iIdentityHashCode;
        if (i4 != i5 + ((i6 | (~(1000078047 | i7))) * 50) + (((~(i7 | 160649223)) | (~(990636766 | i7)) | (-1000078048)) * 50)) {
            throw null;
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i9 = ~iMyUid;
        if (i8 != 850025856 + (((~((-991557601) | i9)) | (~((-1587498365) | iMyUid))) * 217) + (((~(iMyUid | (-991557601))) | 437863776) * 217) + (((~((-1587498365) | i9)) | 991557600) * 217)) {
            throw new RuntimeException("-1868880557");
        }
        super.onStart();
        int i10 = g + 119;
        d = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay).substring(1, 3).codePointAt(1) - 163838535;
        if (i4 != (((~((~iCodePointAt) | 1522531293)) * 130) - 776189476) + (((~(iCodePointAt | 1522531293)) | 134512644) * 130)) {
            throw null;
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i5 != ((((~((-1869986391) | iIdentityHashCode)) | 1161179472) * 398) - 1286382776) + (((~((~iIdentityHashCode) | (-1869986391))) | 1161179472) * 398)) {
            throw new RuntimeException("-1155708267");
        }
        super.onCreate(bundle);
        int i6 = g + 101;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = d + 43;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit b(AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity) {
        int i = 2 % 2;
        int i2 = g + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        asikResignNonSalariedWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        TuitionPaymentFragmentbindingInflater1(-1238193542, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1238193545, new Object[]{asikResignNonSalariedWorkerRegistrationActivity}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1683951732, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Unit unit = Unit.INSTANCE;
        int i4 = d + 79;
        g = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity = (AsikResignNonSalariedWorkerRegistrationActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = d + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            asikResignNonSalariedWorkerRegistrationActivity.cancelAll();
            ViewPortBuilder.b();
            int i4 = d + 65;
            g = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(AsikResignNonSalariedWorkerRegistrationActivity asikResignNonSalariedWorkerRegistrationActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-636222203, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 636222203, new Object[]{asikResignNonSalariedWorkerRegistrationActivity, view}, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        cancelAll = 0;
        d();
        INSTANCE = new Companion(null);
        int i = onTransact + 115;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    private final void g() {
        TuitionPaymentFragmentbindingInflater1(-1238193542, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1238193545, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1683951732, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = g + 15;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentbindingInflater1(-1922951310, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 1120888131, 1922951312, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 451575933, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_500).substring(13, 15).codePointAt(0) - 1872849285, 2042838443 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 121;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 57;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentbindingInflater1(-1121527977, 1503653381 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step2).substring(0, 3).length(), 1121527978, new Object[]{this, context}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 1693836911, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void d() {
        asBinder = new int[]{-1176119618, -846342336, -999544485, 639182847, -695096721, -1935964417, -313379286, -422181721, -1705391516, 1767693946, -851977204, 300076003, -1565831800, 493744256, -175139205, -526650786, 301687366, -1609564585};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity.$$c
            int r6 = r6 * 56
            int r6 = 122 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity.$$i(short, int, byte):java.lang.String");
    }
}
