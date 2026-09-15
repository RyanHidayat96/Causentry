package com.bpjstku.presentation.asik.resign;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAsikResignProgramBinding;
import com.bpjstku.presentation.asik.resign.AsikResignProgramActivity;
import com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedWorkerRegistrationActivity;
import com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerRegistrationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.libraries.places.internal.zzapt;
import defpackage.EncoderImplExternalSyntheticLambda6;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/asik/resign/AsikResignProgramActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikResignProgramBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikResignProgramActivity extends BindingBaseActivity<ActivityAsikResignProgramBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f468a;
    private static byte[] asBinder;
    private static int b;
    private static int cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int b = R.layout.activity_asik_resign_program;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {91, -17, 90, 37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 55;
    private static int g = 0;
    private static int d = 0;
    private static int asInterface = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i4));
        int i11 = ~(i2 | i4);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i4);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i6 + i4 + i3 + (1349231875 * i5) + (1735201104 * i);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i6) + 1558183936 + (237349861 * i4) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i3) + ((-1337982976) * i5) + (469762048 * i) + (1272971264 * i16);
        int i18 = ((i6 * 236314795) - 374860141) + (i4 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i3 * 236313959) + (i5 * (-66979019)) + (i * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 != 1) {
            return i19 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.$$a
            int r9 = r9 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.resign.AsikResignProgramActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/asik/resign/AsikResignProgramActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, AsikResignProgramActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikResignProgramBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AsikResignProgramActivity$bindingInflater$1 asikResignProgramActivity$bindingInflater$1 = AsikResignProgramActivity$bindingInflater$1.b;
        int i4 = asInterface + 89;
        d = i4 % 128;
        int i5 = i4 % 2;
        return asikResignProgramActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        AsikResignProgramActivity asikResignProgramActivity = this;
        Intrinsics.checkNotNullParameter(asikResignProgramActivity, "");
        asikResignProgramActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityAsikResignProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAsikResignProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_data_adjustment));
        int i4 = d + 65;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        CardView cardView = ((ActivityAsikResignProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvYesIdo;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setupDialog
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikResignProgramActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        CardView cardView2 = ((ActivityAsikResignProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvNotReadyYet;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: backportAccessibilityAttributes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikResignProgramActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = d + 65;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = d + 67;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = d + 63;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x023f  */
    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, View.MeasureSpec.makeMeasureSpec(0, 0) + 33, 1387473586, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i6 = $11 + 49;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int i8 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3358;
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 18;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, i8, iNormalizeMetaState, -1054011043, false, $$i((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8), MotionEvent.axisFromString("") + 34, 1387473586, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) f468a[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                if (z2) {
                    int i10 = $10 + 93;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i9 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 2855 - View.MeasureSpec.getMode(0), View.combineMeasuredStates(0, 0) + 13, -1529949196, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int i12 = $10 + 99;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 21;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = asBinder;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = f468a;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b2 = $$a[7];
            short s = b2;
            Object[] objArr2 = new Object[1];
            c(b2, s, (byte) (s | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, keyRepeatTimeout, scrollBarFadeDuration, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1460783923, TextUtils.getOffsetAfter("", 0) - 74, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_primary_cta_text).substring(0, 14).codePointAt(7) - 154), 1762744510 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(TextUtils.lastIndexOf("", '0', 0) - 1460783917, KeyEvent.normalizeMetaState(0) - 81, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 5), 1762744567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int iRed = Color.red(0) + 15;
            byte b3 = $$a[7];
            short s2 = (short) (b3 | 52);
            Object[] objArr5 = new Object[1];
            c(b3, s2, (byte) s2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout2, iIndexOf, iRed, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asInterface + 77;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAlpha = 1031 - Color.alpha(0);
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr[132], (short) 104, bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iAlpha, iLastIndexOf, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful_msg).substring(0, 21).codePointAt(4) + 1423559900;
            int i6 = ~iCodePointAt;
            int i7 = (~((-487946669) | i6)) | 286355884;
            int i8 = ~(iCodePointAt | (-42075715));
            int i9 = (((-2033954127) + ((i7 | i8) * (-502))) + ((i8 | (~(i6 | (-201590785)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 90055126;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).length() - 1460783917, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 116, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) ((-22) - ((byte) KeyEvent.getModifierMetaStateMask())), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 1762744535, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step1).substring(0, 1).codePointAt(0) - 1460783990, View.resolveSize(0, 0) - 80, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 11), TextUtils.lastIndexOf("", '0', 0) + 1762744597, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1786957614};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 46038), 1134 - TextUtils.getTrimmedLength(""), ImageFormat.getBitsPerPixel(0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -90055126, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int iResolveSize = 15 - View.resolveSize(0, 0);
                    byte b4 = $$a[7];
                    short s3 = b4;
                    Object[] objArr12 = new Object[1];
                    c(b4, s3, (byte) (s3 | 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, iIndexOf2, iResolveSize, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getScrollBarSize() >> 8) + 1117, 17 - KeyEvent.getDeadChar(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr2[132], (short) 104, bArr2[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, packedPositionChild, iIndexOf3, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step6).substring(49, 56).codePointAt(1) - 1460784032, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 110, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (KeyEvent.getDeadChar(0, 0) - 122), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1762744510, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1460783929, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 92, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (42 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1762744556, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                        int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b5 = $$a[7];
                        short s4 = (short) (b5 | 52);
                        Object[] objArr16 = new Object[1];
                        c(b5, s4, (byte) s4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iIndexOf4, doubleTapTimeout, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                        int gidForName = Process.getGidForName("") + 16;
                        byte b6 = $$a[7];
                        short s5 = b6;
                        Object[] objArr17 = new Object[1];
                        c(b6, s5, (byte) (s5 | 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, iLastIndexOf2, gidForName, 1357589585, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i17 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i18 = i14 + 1229186809 + (((~((-784212157) | i17)) | 244318380) * 1504) + ((~(i17 | (-539893777))) * (-1504)) + 927437296;
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
            int packedPositionChild2 = 1754 - ExpandableListView.getPackedPositionChild(0L);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
            byte[] bArr3 = $$a;
            byte b7 = bArr3[7];
            Object[] objArr19 = new Object[1];
            c(b7, (short) (b7 | 104), bArr3[3], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mode, packedPositionChild2, iKeyCodeFromString, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i21 = asInterface + 123;
            d = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char keyRepeatTimeout3 = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int iMyPid = (Process.myPid() >> 22) + 1755;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                byte b8 = $$a[7];
                short s6 = (short) (b8 | 52);
                Object[] objArr20 = new Object[1];
                c(b8, s6, (byte) s6, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatTimeout3, iMyPid, bitsPerPixel, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iMyTid = Process.myTid();
            int i23 = (-1316206347) + (((~((-335819217) | iMyTid)) | 548421642) * (-756)) + (((~iMyTid) | (-335819217)) * 756) + 1096109409;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i25 ^ (i25 << 5);
            int i26 = d + 49;
            asInterface = i26 % 128;
            int i27 = i26 % 2;
        } else {
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1065).substring(0, 62).codePointAt(1) - 1460784024, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step3).substring(0, 1).length() - 81, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_cards).substring(1, 2).length() - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() - 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1762744545, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e((-1460783913) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 91, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).length() + 19), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1762744596, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1786957614};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - Gravity.getAbsoluteGravity(0, 0)), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1096109409);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                int iGreen = 1755 - Color.green(0);
                int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                byte b9 = $$a[7];
                short s7 = (short) (b9 | 52);
                Object[] objArr25 = new Object[1];
                c(b9, s7, (byte) s7, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionChild3, iGreen, packedPositionType, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobapp).substring(0, 12).codePointAt(11) - 1460784034, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 110, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 234), 1762744546 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima3).substring(12, 18).length() - 1460783924, (-81) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).length() + 39), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1762744556, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName2 = (char) (29943 - Process.getGidForName(""));
                    int iRgb = Color.rgb(0, 0, 0) + 16778971;
                    int iResolveSize2 = View.resolveSize(0, 0) + 23;
                    byte b10 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c(b10, (short) (b10 | 141), (byte) ($$b - 3), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName2, iRgb, iResolveSize2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                    int iMyTid2 = 1755 - (Process.myTid() >> 22);
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 23;
                    byte[] bArr4 = $$a;
                    byte b11 = bArr4[7];
                    Object[] objArr29 = new Object[1];
                    c(b11, (short) (b11 | 104), bArr4[3], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, iMyTid2, packedPositionType2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i28 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i29 == i28) {
            int i30 = asInterface + 51;
            d = i30 % 128;
            int i31 = i30 % 2;
            int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_expiry_date).substring(16, 17).codePointAt(0) - 99822922;
            int i33 = ~iCodePointAt2;
            int i34 = 2117729153 + (((~((-240128065) | i33)) | (~((-296585007) | iCodePointAt2))) * 520);
            int i35 = ~(296585006 | i33);
            int i36 = ~(iCodePointAt2 | 509187432);
            int i37 = i32 + i34 + ((i35 | i36) * (-1040)) + ((i36 | (~(i33 | (-509187433))) | (-536713071)) * 520);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr30[3])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
        if (strArr4 != null) {
            int i40 = asInterface + 83;
            d = i40 % 128;
            int i41 = 2;
            int i42 = i40 % 2;
            int i43 = 0;
            while (i43 < strArr4.length) {
                int i44 = asInterface + 11;
                d = i44 % 128;
                int i45 = i44 % i41;
                arrayList2.add(strArr4[i43]);
                i43++;
                i41 = 2;
            }
        }
        Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
        int i46 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i48 = ~i47;
        int i49 = i46 + 711695537 + (((~((-226408731) | i48)) | 220991770 | (~(13806304 | i48))) * (-1136)) + (((~((-226408731) | i47)) | (~(13806304 | i47)) | (~((-8389345) | i48))) * (-568)) + (((~(i47 | (-220991771))) | (~(i48 | (-13806305))) | (~(226408730 | i48))) * 568);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~((int) Runtime.getRuntime().freeMemory());
        if (i4 != 761779848 + (((~(i5 | 345859528)) | 1107427351) * (-160)) + (((~(i5 | 1175847071)) | 345859528) * 160)) {
            throw new RuntimeException("179301621");
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2003244459;
        int i8 = ~i7;
        if (i6 != (((~(1916758227 | i8)) | (~(i7 | 200846896))) * 959) + 1842839831 + (((~(i7 | 1916758227)) | (~(i8 | 200846896))) * 959)) {
            throw new RuntimeException("-788042458");
        }
        super.onResume();
        int i9 = d + 87;
        asInterface = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 35 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00aa, code lost:
    
        if (r1 != (((1487147752 + ((r3 | 1941399125) * 764)) + (((~(r2 | 1941399125)) | 67148034) * (-1528))) + ((1438038354 | r3) * 764))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.asInterface + 119;
        com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b9, code lost:
    
        r1 = 1711414862 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        throw new java.lang.RuntimeException("-1217848110");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        if (r1 == (((1863056658 + (((~(1405246197 | r5)) | (-1942739712)) * 98)) + ((((~(r5 | (-575258655))) | 1405246197) | (~(575258654 | r4))) * (-49))) + (((~(r4 | 1405246197)) | 1367481057) * 49))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0079, code lost:
    
        if (r1 == (((((~(1684908863 | r4)) | (-1452850008)) * 262) + 263601096) + (((~((~r4) | 1684908863)) | (-1452850008)) * 262))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = ~java.lang.System.identityHashCode(r9);
        r3 = ~(637656839 | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.onStart():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        AsikResignProgramActivity asikResignProgramActivity = (AsikResignProgramActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 39;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int i4 = (~((int) Runtime.getRuntime().freeMemory())) | 118948434;
            if (i3 != 647162505 + (i4 * 495) + (((~i4) | 118489682) * 495)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iMyPid = Process.myPid();
            int i6 = ~iMyPid;
            if (i5 != (-2003281769) + (((~((-598424006) | i6)) | (-1428411549)) * (-602)) + (((~(iMyPid | (-598424006))) | 579348801 | (~((-1409336345) | i6))) * (-301)) + ((~(i6 | (-1428411549))) * 301)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = (int) Runtime.getRuntime().totalMemory();
        int i9 = ~((-34163214) | i8);
        int i10 = ~i8;
        if (i7 != 669516476 + ((i9 | (~(i10 | 1786740671))) * 920) + (((~((-36666128) | i10)) | 34163213) * 920) + (((~(i8 | 1786740671)) | (~((-34163214) | i10)) | (~((-2502915) | i8))) * 920)) {
            throw new RuntimeException("333626836");
        }
        super.onCreate(bundle);
        int i11 = asInterface + 67;
        d = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 69 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikResignProgramActivity asikResignProgramActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            AsikResignNonSalariedWorkerRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikResignNonSalariedWorkerRegistrationActivity.INSTANCE;
            AsikResignNonSalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentbindingInflater1(asikResignProgramActivity);
            return Unit.INSTANCE;
        }
        AsikResignNonSalariedWorkerRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikResignNonSalariedWorkerRegistrationActivity.INSTANCE;
        AsikResignNonSalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentbindingInflater1(asikResignProgramActivity);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikResignProgramActivity asikResignProgramActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            AsikResignSalariedWorkerRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikResignSalariedWorkerRegistrationActivity.INSTANCE;
            AsikResignSalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikResignProgramActivity);
            return Unit.INSTANCE;
        }
        AsikResignSalariedWorkerRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikResignSalariedWorkerRegistrationActivity.INSTANCE;
        AsikResignSalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikResignProgramActivity);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    static {
        cancel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 15;
        cancel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1095376274, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, 1095376275);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b(EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2143977349, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 304446001, new Object[]{this}, -2143977347);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = d + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = (-2098357418) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        b((-2064888879) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2024562495, i, new Object[]{this, bundle}, -2024562495);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 85;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void g() {
        b = 440663032;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795642;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -608397451;
        asBinder = new byte[]{104, -108, 99, 73, -74, 104, -111, 97, -102, 70, 69, -37, 100, 33, -86, -101, -102, -99, 110, -106, 109, 55, -53, 58, -57, -60, 51, -36, 33, 48, Base64.padSymbol, -52, -64, 58, -56, 5, -4, 12, -9, 43, 40, -54, -12, 0, -8, 51, -64, -26, 24, -6, -2, 10, -45, 36, 10, -19, -26, 48, -6, -12, 10, -7, -10, -2, 4, -26, -26, -26, -26};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 77;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        d = i2 % 128;
        int i3 = i2 % 2;
        return null;
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
    private static java.lang.String $$i(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 + 117
            byte[] r0 = com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.resign.AsikResignProgramActivity.$$i(byte, int, byte):java.lang.String");
    }
}
