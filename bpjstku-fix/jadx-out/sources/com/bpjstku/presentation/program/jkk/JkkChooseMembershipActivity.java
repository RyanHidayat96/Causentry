package com.bpjstku.presentation.program.jkk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJkkChooseMembershipBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.di.ApiModuleKt;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.MediaSpecOutputFormat;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getCaptureRequestOption;
import defpackage.getMaxImages;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/program/jkk/JkkChooseMembershipActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkkChooseMembershipBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "b", "a", "asInterface", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkkChooseMembershipActivity extends BindingBaseActivity<ActivityJkkChooseMembershipBinding> {
    private static long asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;
    private List<ClaimSegmenItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {80, -8, 43, 65};
    private static final int $$f = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 16;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f599a = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i4 | i2)) | i3;
        int i8 = ~i4;
        int i9 = ~((~i3) | i8 | i2);
        int i10 = (~(i2 | i3)) | (~(i8 | (~i2)));
        int i11 = i4 + i3 + i6 + (1616745821 * i) + (2077170981 * i5);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i4) + 1587019776 + (806482222 * i3) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i6) + ((-395313152) * i) + (904921088 * i5) + (345505792 * i12);
        int i14 = (i4 * (-1558553916)) + 318941677 + (i3 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i6 * (-1558553459)) + (i * 397062201) + (i5 * 609114465) + (i12 * (-138936320));
        int i15 = i13 + (i14 * i14 * 1630011392);
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return b(objArr);
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
    private static void c(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.$$a
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r7 = 53 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jkk/JkkChooseMembershipActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) JkkChooseMembershipActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        f599a = i2 % 128;
        int i3 = i2 % 2;
        JkkChooseMembershipActivity$bindingInflater$1 jkkChooseMembershipActivity$bindingInflater$1 = JkkChooseMembershipActivity$bindingInflater$1.b;
        int i4 = asInterface + 41;
        f599a = i4 % 128;
        int i5 = i4 % 2;
        return jkkChooseMembershipActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final JkkChooseMembershipActivity jkkChooseMembershipActivity = (JkkChooseMembershipActivity) objArr[0];
        int i = 2 % 2;
        ((ActivityJkkChooseMembershipBinding) ((ViewBinding) jkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lambdapreCapture10androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        ImageView imageView = ((ActivityJkkChooseMembershipBinding) ((ViewBinding) jkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Function1 function1 = new Function1() { // from class: lambdapreCapture3androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = ((ActivityJkkChooseMembershipBinding) ((ViewBinding) jkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgNonSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        ImageView imageView4 = imageView3;
        Function1 function2 = new Function1() { // from class: lambdapreCapture2androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        imageView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        ImageView imageView5 = ((ActivityJkkChooseMembershipBinding) ((ViewBinding) jkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgIndonesianMigrantWorker;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        ImageView imageView6 = imageView5;
        Function1 function3 = new Function1() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkkChooseMembershipActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView6, "");
        Intrinsics.checkNotNullParameter(function3, "");
        imageView6.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function3));
        int i2 = asInterface + 99;
        f599a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f599a + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        MaterialToolbar materialToolbar = ((ActivityJkkChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_title_claim_jkk);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = asInterface + 19;
        f599a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(asBinder ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 91;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 13;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64839), 1356 - (Process.myPid() >> 22), 39 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 894276454, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16824989), (Process.myPid() >> 22) + 468, 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $10 + 49;
        $11 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        f599a = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getIntent().getParcelableArrayListExtra("claimSegmen");
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getIntent().getParcelableArrayListExtra("claimSegmen");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        f599a = i2 % 128;
        if (i2 % 2 != 0) {
            ((ActivityJkkChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(1);
            this.TuitionPaymentFragmentbindingInflater1 = "PMI";
        } else {
            ((ActivityJkkChooseMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupIndonesianMigrantWorker.setVisibility(0);
            this.TuitionPaymentFragmentbindingInflater1 = "PMI";
        }
        int i3 = f599a + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 43;
        f599a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
            byte b = (byte) ($$b - 1);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(b, bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, tapTimeout, iResolveOpacity, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 37), bArr2[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, threadPriority, capsMode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i6 = ~startElapsedRealtime;
            int i7 = (((1553114857 + (((~(i6 | 52207360)) | ((~((-160395066) | i6)) | 142827577)) * 464)) + (((-17567489) | startElapsedRealtime) * (-464))) + (((~(startElapsedRealtime | 52207360)) | 142827577) * 464)) - 843661697;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{971, 55024, 929, 10409, 21370, 13054, 8969, 41822, 5193, 19211, 2890, 39933, 11508, 25501, 5076, 62366, 17596, 6763, 31254, 59990}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).length() - 7, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{12687, 31568, 12774, 14153, 65247, 3948, 15610, 40643, 9815, 59054, 5311, 42616, 7839, 52850, 3092, 52765, 30408, 47056, 26103, 55244}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-367544293};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 42049), TextUtils.indexOf("", "", 0) + 1726, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -843661697);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                    int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b3, (short) (b3 | 37), bArr3[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, minimumFlingVelocity, packedPositionChild, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{22549, 22220, 22644, 14850, 54089, 43018, 12720, 14777, 20438, 52018, 6628, 329, 30498, 58364, 258, 26944, 8040, 39504, 26796, 28842, 1736, 45588, 20712, 22548, 11818, 43744}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).length(), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{15011, 23472, 15046, 26384, 56887, 49726, 27815, 21391, 11644, 50754, 17654, 27393, 5534, 61074, 23634, 851, 32206, 38706, 13743}, (Process.myTid() >> 22) + 1, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                        int packedPositionChild2 = 22 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b4, (short) (b4 | 89), bArr4[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iLastIndexOf, packedPositionChild2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                        int i10 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b5 = (byte) ($$b - 1);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c(b5, bArr5[7], bArr5[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, iIndexOf, i10, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrB$5f1425da[1])[0];
        int i12 = ((int[]) objArrB$5f1425da[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    arrayList.add(strArr[i4]);
                    i4++;
                    int i13 = f599a + 75;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i15 = f599a + 51;
        asInterface = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrB$5f1425da[3])[0];
        int i18 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i18}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i19 = ~(System.identityHashCode(this) | 930709469);
        int i20 = i17 + (((-498339455) | i19) * (-658)) + 762432459 + ((i19 | (-1073577984)) * 658);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr13[3])[0] = i22 ^ (i22 << 5);
        int i23 = f599a + 77;
        asInterface = i23 % 128;
        int i24 = i23 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int i25 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
            byte[] bArr6 = $$a;
            byte b6 = bArr6[7];
            Object[] objArr14 = new Object[1];
            c(b6, (short) (b6 | 141), bArr6[5], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(absoluteGravity, iMakeMeasureSpec, i25, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{22549, 22220, 22644, 14850, 54089, 43018, 12720, 14777, 20438, 52018, 6628, 329, 30498, 58364, 258, 26944, 8040, 39504, 26796, 28842, 1736, 45588, 20712, 22548, 11818, 43744}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_bni).substring(14, 15).codePointAt(0) - 106, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{15011, 23472, 15046, 26384, 56887, 49726, 27815, 21391, 11644, 50754, 17654, 27393, 5534, 61074, 23634, 851, 32206, 38706, 13743}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_denied).substring(0, 6).length() - 5, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cBlue = (char) Color.blue(0);
            int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i26 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr7 = $$a;
            byte b7 = bArr7[7];
            Object[] objArr17 = new Object[1];
            c(b7, (short) (b7 | 37), bArr7[5], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, keyRepeatTimeout, i26, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cGreen = (char) Color.green(0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                Object[] objArr18 = new Object[1];
                c((byte) ($$b | 36), (short) 193, $$a[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cGreen, trimmedLength, iCombineMeasuredStates, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr19[3])[0];
            int i28 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1184234318;
            int i30 = (((((~((-137248785) | i29)) | (-465567163)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1523030800) + ((~((~i29) | (-137248785))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 875517665;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{971, 55024, 929, 10409, 21370, 13054, 8969, 41822, 5193, 19211, 2890, 39933, 11508, 25501, 5076, 62366, 17596, 6763, 31254, 59990}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{12687, 31568, 12774, 14153, 65247, 3948, 15610, 40643, 9815, 59054, 5311, 42616, 7839, 52850, 3092, 52765, 30408, 47056, 26103, 55244}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1060).substring(0, 31).length() - 30, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-367544293};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Color.rgb(0, 0, 0) + 16823254), 1134 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -875517665, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                int size = View.MeasureSpec.getSize(0) + 15;
                byte[] bArr8 = $$a;
                byte b8 = bArr8[7];
                Object[] objArr24 = new Object[1];
                c(b8, (short) (b8 | 141), bArr8[5], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState, maxKeyCode, size, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.resolveSizeAndState(0, 0, 0)), Process.getGidForName("") + 1118, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                int iRgb = Color.rgb(0, 0, 0) + 16777231;
                Object[] objArr25 = new Object[1];
                c((byte) ($$b | 36), (short) 193, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType, iNormalizeMetaState, iRgb, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{22549, 22220, 22644, 14850, 54089, 43018, 12720, 14777, 20438, 52018, 6628, 329, 30498, 58364, 258, 26944, 8040, 39504, 26796, 28842, 1736, 45588, 20712, 22548, 11818, 43744}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{15011, 23472, 15046, 26384, 56887, 49726, 27815, 21391, 11644, 50754, 17654, 27393, 5534, 61074, 23634, 851, 32206, 38706, 13743}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr9 = $$a;
                    byte b9 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    c(b9, (short) (b9 | 37), bArr9[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration2, iIndexOf2, iLastIndexOf2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int scrollDefaultDelay3 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr10 = $$a;
                    byte b10 = bArr10[7];
                    Object[] objArr29 = new Object[1];
                    c(b10, (short) (b10 | 141), bArr10[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarSize, scrollDefaultDelay2, scrollDefaultDelay3, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
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
            while (i4 < strArr3.length) {
                arrayList2.add(strArr3[i4]);
                i4++;
                int i33 = f599a + 81;
                asInterface = i33 % 128;
                int i34 = i33 % 2;
            }
            throw null;
        }
        int i35 = asInterface + 25;
        f599a = i35 % 128;
        int i36 = i35 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i40 = ~iIdentityHashCode;
        int i41 = i37 + 106353603 + (((~((-72452846) | i40)) | (~((-171827325) | iIdentityHashCode))) * 1900) + (((~(i40 | 171827324)) | (~(iIdentityHashCode | 72452845))) * (-950)) + (((~(iIdentityHashCode | 171827324)) | (~(i40 | 72452845))) * 950);
        int i42 = i41 ^ (i41 << 13);
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr30[2])[0] = i43 ^ (i43 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -915879328
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
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.asInterface
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.f599a = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.smallestScreenWidthDp
            int r5 = ~r4
            r6 = 1729871728(0x671bbf70, float:7.354982E23)
            r7 = r6 | r5
            int r7 = ~r7
            r8 = 899884185(0x35a32499, float:1.2155098E-6)
            r7 = r7 | r8
            int r7 = r7 * (-90)
            r9 = 475278640(0x1c542d30, float:7.020332E-22)
            int r9 = r9 + r7
            r7 = r6 | r4
            int r7 = ~r7
            r10 = 1108908896(0x42189b60, float:38.151733)
            r7 = r7 | r10
            int r7 = r7 * (-45)
            int r9 = r9 + r7
            r7 = -899884186(0xffffffffca5cdb66, float:-3618521.5)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r6
            r5 = r5 | r8
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 45
            int r9 = r9 + r4
            if (r1 == r9) goto L94
            int r1 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.asInterface
            int r1 = r1 + 59
            int r4 = r1 % 128
            com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.f599a = r4
            int r1 = r1 % r0
            r4 = -1
            r5 = -915879329(0xffffffffc968ca5f, float:-953509.94)
            r6 = -915879328(0xffffffffc968ca60, float:-953510.0)
            if (r1 == 0) goto L82
            int[] r0 = new int[r6]
            r0[r5] = r2
            r0 = r0[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r2)
            r0.show()
            goto L94
        L82:
            int[] r1 = new int[r6]
            r6 = 1
            r1[r5] = r6
            r5 = 76732832(0x492d9a0, float:3.4524292E-36)
            int r5 = r5 % r0
            r0 = r1[r4]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r6)
            r0.show()
        L94:
            java.lang.reflect.Member[] r0 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r0 = r0[r2]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r3)
            int r1 = android.os.Process.myUid()
            int r2 = ~r1
            r4 = 130357748(0x7c519f4, float:2.965652E-34)
            r2 = r2 | r4
            int r2 = ~r2
            r5 = 1745536003(0x680ac403, float:2.6212094E24)
            r2 = r2 | r5
            int r2 = r2 * 529
            r5 = 1100061850(0x41919c9a, float:18.201466)
            int r5 = r5 + r2
            r1 = r1 | r4
            int r1 = ~r1
            r2 = 1846269079(0x6e0bd497, float:1.0818855E28)
            r1 = r1 | r2
            int r1 = r1 * 529
            int r5 = r5 + r1
            if (r0 != r5) goto Lc1
            super.onResume()
            return
        Lc1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        f599a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i5 = ~i4;
            if (i3 != 183490024 + (((~((-865386637) | i5)) | 311459980 | (~(1695374179 | i5))) * (-1136)) + (((~((-865386637) | i4)) | (~(1695374179 | i4)) | (~((-1141447524) | i5))) * (-568)) + (((~(i4 | (-311459981))) | (~(i5 | (-1695374180))) | (~(865386636 | i5))) * 568)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            if (i6 != (((~(1709576357 | i7)) | (-1368089964)) * 262) + 1312642172 + (((~((~i7) | 1709576357)) | (-1368089964)) * 262)) {
                throw null;
            }
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i10 = ~i9;
        if (i8 != (-1395971716) + (((~((-794335858) | i10)) | 708872801 | (~((-1784720108) | i10))) * (-1136)) + (((~((-794335858) | i9)) | (~((-1784720108) | i9)) | (~(1870183163 | i10))) * (-568)) + (((~(i9 | (-708872802))) | (~(i10 | 1784720107)) | (~(794335857 | i10))) * 568)) {
            throw new RuntimeException("-1630635438");
        }
        super.onStart();
        int i11 = f599a + 19;
        asInterface = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f599a + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-1273806040) + ((771883048 | i5) * (-192)) + (((~(1872438591 | i5)) | 270568000) * (-384)) + (((~(iIdentityHashCode | (-1100555544))) | (~(i5 | 2143006591)) | (~((-270568001) | iIdentityHashCode))) * DerHeader.TAG_CLASS_PRIVATE)) {
            int i6 = 29373470 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i7 != 1245544084 + (((~(2040324859 | iIdentityHashCode2)) | 538731105) * (-756)) + (((~iIdentityHashCode2) | 2040324859) * 756)) {
            throw null;
        }
        super.onCreate(bundle);
        int i8 = f599a + 37;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Unit b(JkkChooseMembershipActivity jkkChooseMembershipActivity, View view) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        f599a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            getMaxImages.connect();
            Intrinsics.checkNotNullExpressionValue(ProgramType.JKK.getCode().toLowerCase(Locale.ROOT), "");
            Intrinsics.areEqual("PMI", "PMI");
            obj.hashCode();
            throw null;
        }
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        String strConnect = getMaxImages.connect();
        String lowerCase = ProgramType.JKK.getCode().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!Intrinsics.areEqual("PMI", "PMI")) {
            getCaptureRequestOption.Companion companion = getCaptureRequestOption.INSTANCE;
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE, "{\"source\":\"jmo\"}", ApiModuleKt.getClaimPmiSaltKey()));
            int i4 = asInterface + 7;
            f599a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = f599a + 7;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                getCaptureRequestOption.Companion companion2 = getCaptureRequestOption.INSTANCE;
                getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE.TuitionPaymentFragmentbindingInflater1("{\"source\":\"jmo\"}", ApiModuleKt.getClaimPmiSaltKey(), "PMI"));
                obj.hashCode();
                throw null;
            }
            getCaptureRequestOption.Companion companion3 = getCaptureRequestOption.INSTANCE;
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE.TuitionPaymentFragmentbindingInflater1("{\"source\":\"jmo\"}", ApiModuleKt.getClaimPmiSaltKey(), "PMI"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strConnect);
        sb.append("/");
        sb.append(lowerCase);
        sb.append("/");
        sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String string = sb.toString();
        WebviewCustomActivity.Companion companion4 = WebviewCustomActivity.INSTANCE;
        String string2 = jkkChooseMembershipActivity.getString(R.string.label_title_claim_jkk);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkChooseMembershipActivity, string, string2, 0, null, false, 56);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(JkkChooseMembershipActivity jkkChooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = f599a + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkChooseMembershipActivity, jkkChooseMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Unit unit = Unit.INSTANCE;
        int i4 = f599a + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkkChooseMembershipActivity jkkChooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        f599a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            jkkChooseMembershipActivity.finish();
            ViewPortBuilder.b();
            int i4 = f599a + 49;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 99 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(JkkChooseMembershipActivity jkkChooseMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        f599a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkChooseMembershipActivity, jkkChooseMembershipActivity.b, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 101;
        f599a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 123;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkkChooseMembershipBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Function1) TuitionPaymentFragmentbindingInflater1(MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -801698381, 801698382, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        f599a = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_jkk_choose_membership;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2041797011 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentbindingInflater1 = MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, i, 261688154, -261688154, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        f599a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 793896851, new Object[]{this}, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -99165935, 99165937, MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void g() {
        asBinder = -8316000552162463859L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        JkkChooseMembershipActivity jkkChooseMembershipActivity = (JkkChooseMembershipActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 103;
        f599a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 59;
        f599a = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
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
    private static java.lang.String $$i(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 107
            byte[] r1 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity.$$i(int, int, int):java.lang.String");
    }
}
