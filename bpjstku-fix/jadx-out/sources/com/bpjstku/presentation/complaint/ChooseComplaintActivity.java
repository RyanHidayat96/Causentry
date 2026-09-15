package com.bpjstku.presentation.complaint;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityChooseComplaintBinding;
import com.bpjstku.presentation.complaint.ChooseComplaintActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.card.MaterialCardView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CaptureSession1;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.setRelative;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/complaint/ChooseComplaintActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityChooseComplaintBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChooseComplaintActivity extends BindingBaseActivity<ActivityChooseComplaintBinding> {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f475a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {67, -127, -109, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 104;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i3 | i4)) | i2;
        int i8 = (~((~i4) | i3)) | i2;
        int i9 = (~i2) | i3;
        int i10 = i2 + i3 + i + (440753341 * i6) + ((-634449194) * i5);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i3) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i) + (780402688 * i6) + ((-180879360) * i5) + (353763328 * i11);
        int i13 = (i2 * 892202253) + 1676176333 + (i3 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i * 892200819) + (i6 * (-770690073)) + (i5 * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        if (i14 == 1) {
            return b(objArr);
        }
        if (i14 != 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        ChooseComplaintActivity chooseComplaintActivity = (ChooseComplaintActivity) objArr[0];
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint", "complaint_non_registered_company"));
        Intrinsics.checkNotNullParameter(chooseComplaintActivity, "");
        Intrinsics.checkNotNullParameter("complaint_non_registered_company", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("complaint_non_registered_company", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("complaint_non_registered_company", mapMutableMapOf);
        NonRegisterCompanyComplaintActivity.Companion companion = NonRegisterCompanyComplaintActivity.INSTANCE;
        NonRegisterCompanyComplaintActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(chooseComplaintActivity);
        Unit unit = Unit.INSTANCE;
        int i16 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
        int i17 = i16 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.complaint.ChooseComplaintActivity.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ChooseComplaintActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.complaint.ChooseComplaintActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/complaint/ChooseComplaintActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ChooseComplaintActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityChooseComplaintBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            ChooseComplaintActivity$bindingInflater$1 chooseComplaintActivity$bindingInflater$1 = ChooseComplaintActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        ChooseComplaintActivity$bindingInflater$1 chooseComplaintActivity$bindingInflater$2 = ChooseComplaintActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return chooseComplaintActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ChooseComplaintActivity chooseComplaintActivity = this;
        Intrinsics.checkNotNullParameter(chooseComplaintActivity, "");
        chooseComplaintActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityChooseComplaintBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityChooseComplaintBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_choose_complaint));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialCardView materialCardView = ((ActivityChooseComplaintBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvUnmatchedData;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "");
        materialCardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: inflate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                int iB = setRelative.b();
                return (Unit) ChooseComplaintActivity.b(objArr, setRelative.b(), 71603737, -71603737, iB, setRelative.b(), setRelative.b());
            }
        }));
        MaterialCardView materialCardView2 = ((ActivityChooseComplaintBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvNonRegisteredCompany;
        Intrinsics.checkNotNullExpressionValue(materialCardView2, "");
        materialCardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: cloneConstantState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj};
                int iB = setRelative.b();
                return (Unit) ChooseComplaintActivity.b(objArr, setRelative.b(), -1475091054, 1475091056, iB, setRelative.b(), setRelative.b());
            }
        }));
        MaterialCardView materialCardView3 = ((ActivityChooseComplaintBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvComplaintHistory;
        Intrinsics.checkNotNullExpressionValue(materialCardView3, "");
        materialCardView3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isStateful
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (View) obj};
                int iB = setRelative.b();
                return (Unit) ChooseComplaintActivity.b(objArr, setRelative.b(), -1610419780, 1610419781, iB, setRelative.b(), setRelative.b());
            }
        }));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = TuitionPaymentFragmentbindingInflater1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
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

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), View.MeasureSpec.getSize(0) + 3291, 31 - (Process.myPid() >> 22), 1948206109, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 73;
                $11 = i12 % 128;
                if (i12 % i9 == 0) {
                    try {
                        Object[] objArr3 = new Object[i5];
                        objArr3[i6] = Integer.valueOf(iArr5[i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", i6);
                            int minimumFlingVelocity = 3291 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iResolveOpacity = 31 - Drawable.resolveOpacity(i6, i6);
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (-b3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, minimumFlingVelocity, iResolveOpacity, 1948206109, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        length3 = length3;
                        i5 = 1;
                        i6 = 0;
                        i11 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 1;
                        byte b6 = (byte) (-b5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, 31 - View.combineMeasuredStates(0, 0), 1948206109, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i11++;
                    length3 = i13;
                    i5 = 1;
                    i6 = 0;
                }
                i9 = 2;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = 17;
            int i15 = $10 + 17;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i17 = 1; i14 > i17; i17 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2559 - (Process.myTid() >> 22), 28 - TextUtils.lastIndexOf("", '0', 0, 0), 683220507, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.blue(0) + 28879), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 348, 25 - (Process.myTid() >> 22), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 29944);
            int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (bArr[27] - 1), bArr[28], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, maximumDrawingCacheSize, packedPositionChild, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                int i4 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                byte[] bArr2 = $$a;
                byte b = bArr2[7];
                byte b2 = bArr2[28];
                Object[] objArr3 = new Object[1];
                c(b, b2, (short) (b2 | 36), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, i4, capsMode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i5 = (-118798613) + (((~((~layoutDirection) | 95036318)) | 307499072) * 446) + (((~(layoutDirection | 402535390)) | 139672) * 446) + 450274298;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{2127130248, 146388018, 1747892835, -1699851486, 932370617, -1319688237, -1109385999, -1566952075, -883622075, 2025887594}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-2080826267, -1931562050, -486298517, 1120271640, 1481557557, -470936241, -2036258578, -133322691, -131139694, 324278173}, 16 - TextUtils.indexOf("", ""), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1294334748};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - View.resolveSize(0, 0)), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getMode(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 744641658);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAlpha = (char) (29944 - Color.alpha(0));
                    int gidForName = 1754 - Process.getGidForName("");
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    byte b4 = bArr3[28];
                    Object[] objArr8 = new Object[1];
                    c(b3, b4, (short) (b4 | 36), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, gidForName, maximumDrawingCacheSize2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{872776549, -462493953, -1377883662, -1605349815, -1100780004, -1440771086, 427390619, 183660794, -1969753416, 1515240208, -1579820167, 469468807, -1026325121, 464049825}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_2).substring(10, 11).codePointAt(0) - 81, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{1944594604, 616684648, 1612616377, 1309747399, -1934406308, 451840405, -742674473, -1029192232, 676539096, -929059204}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step3).substring(3, 4).length() + 14, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[7];
                        byte b6 = bArr4[28];
                        Object[] objArr11 = new Object[1];
                        c(b5, b6, (short) (b6 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, iKeyCodeFromString, threadPriority, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                        int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                        int maxKeyCode2 = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) (bArr5[27] - 1), bArr5[28], bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, maxKeyCode2, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i9 == i8) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i13 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1880100526;
            int i14 = ~i13;
            int i15 = i12 + ((((~(i14 | (-438814871))) | ((~((-651417297) | i14)) | 33800336)) * (-397)) - 1290755676) + ((i13 | (-1022631495)) * 397);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                int i18 = TuitionPaymentFragmentbindingInflater1 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                int i19 = i18 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i9];
            int i20 = i9 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = i21 + (-423213295) + (((~(134901771 | iIdentityHashCode)) | 347344452) * 104) + ((~((~iIdentityHashCode) | (-134742027))) * (-104)) + ((iIdentityHashCode | 347504197) * 104);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i25 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
            int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr6 = $$a;
            byte b7 = bArr6[7];
            byte b8 = bArr6[28];
            Object[] objArr15 = new Object[1];
            c(b7, b8, (short) (b8 | 140), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration, i25, scrollDefaultDelay, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{872776549, -462493953, -1377883662, -1605349815, -1100780004, -1440771086, 427390619, 183660794, -1969753416, 1515240208, -1579820167, 469468807, -1026325121, 464049825}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 94, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{1944594604, 616684648, 1612616377, 1309747399, -1934406308, 451840405, -742674473, -1029192232, 676539096, -929059204}, 15 - (Process.myPid() >> 22), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            byte[] bArr7 = $$a;
            byte b9 = bArr7[7];
            byte b10 = bArr7[28];
            Object[] objArr18 = new Object[1];
            c(b9, b10, (short) (b10 | 36), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, scrollBarFadeDuration, iLastIndexOf, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                byte b11 = (byte) ($$b >>> 1);
                byte b12 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b11, b12, (short) (b12 | 193), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iLastIndexOf2, iLastIndexOf3, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr20[3])[0];
            int i27 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i28 = ~startElapsedRealtime;
            int i29 = ~(344896684 | i28);
            int i30 = (((866462385 + (((-369098223) | i29) * (-712))) + (((~(startElapsedRealtime | (-24201539))) | (~(i28 | 369098222))) * (-712))) + ((100616514 | i29) * 712)) - 1702745693;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{2127130248, 146388018, 1747892835, -1699851486, 932370617, -1319688237, -1109385999, -1566952075, -883622075, 2025887594}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{-2080826267, -1931562050, -486298517, 1120271640, 1481557557, -470936241, -2036258578, -133322691, -131139694, 324278173}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step6).substring(28, 29).length() + 15, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1294334748};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46038), 1134 - ExpandableListView.getPackedPositionType(0L), 18 - View.resolveSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1702745693, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int iArgb = 1031 - Color.argb(0, 0, 0, 0);
                int iLastIndexOf4 = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr8 = $$a;
                byte b13 = bArr8[7];
                byte b14 = bArr8[28];
                Object[] objArr25 = new Object[1];
                c(b13, b14, (short) (b14 | 140), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarSize, iArgb, iLastIndexOf4, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 45993), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1116, View.MeasureSpec.getSize(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                int maxKeyCode3 = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b15 = (byte) ($$b >>> 1);
                byte b16 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b15, b16, (short) (b16 | 193), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar, tapTimeout, maxKeyCode3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{872776549, -462493953, -1377883662, -1605349815, -1100780004, -1440771086, 427390619, 183660794, -1969753416, 1515240208, -1579820167, 469468807, -1026325121, 464049825}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 85, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{1944594604, 616684648, 1612616377, 1309747399, -1934406308, 451840405, -742674473, -1029192232, 676539096, -929059204}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i33 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i34 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr9 = $$a;
                    byte b17 = bArr9[7];
                    byte b18 = bArr9[28];
                    Object[] objArr29 = new Object[1];
                    c(b17, b18, (short) (b18 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout, i33, i34, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int i35 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr10 = $$a;
                    byte b19 = bArr10[7];
                    byte b20 = bArr10[28];
                    Object[] objArr30 = new Object[1];
                    c(b19, b20, (short) (b20 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, maximumFlingVelocity, i35, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr[1])[0];
        int i37 = ((int[]) objArr[3])[0];
        if (i37 == i36) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i41 = i38 + (((~((~iIdentityHashCode2) | 519744510)) * 130) - 1396262201) + (((~(iIdentityHashCode2 | 519744510)) | 201981968) * 130);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                TuitionPaymentFragmentbindingInflater1 = i44 % 128;
                int i45 = i44 % 2;
                arrayList2.add(str2);
            }
        }
        int[] iArr2 = new int[i37];
        int i46 = i37 - 1;
        iArr2[i46] = 1;
        Toast.makeText((Context) null, iArr2[((i37 * i46) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i47 = ((int[]) objArr[2])[0];
        int i48 = ((int[]) objArr[3])[0];
        int i49 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i50 = ~iFreeMemory;
        int i51 = (-711022115) + (((~((-352885570) | i50)) | 285249536 | (~(108605399 | i50)) | (~((-40969367) | iFreeMemory))) * (-84));
        int i52 = (~(iFreeMemory | 108605399)) | 352885569;
        int i53 = ~(i50 | (-108605400));
        int i54 = i47 + i51 + ((i52 | i53) * (-84)) + ((40969366 | i53) * 84);
        int i55 = i54 ^ (i54 << 13);
        int i56 = i55 ^ (i55 >>> 17);
        ((int[]) objArr32[2])[0] = i56 ^ (i56 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e1, code lost:
    
        if (r1 != (r7 + (((~(r2 | (-1361645587))) | (r3 | (~((-76554505) | r2)))) * 140))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e3, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.complaint.ChooseComplaintActivity.TuitionPaymentFragmentbindingInflater1 + 67;
        com.bpjstku.presentation.complaint.ChooseComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ef, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f1, code lost:
    
        r0 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f6, code lost:
    
        r1 = 1383228452 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ff, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (r1 == ((4649960 + (((~((-1384185892) | r6)) | 554198348) * (-756))) + (((~r6) | (-1384185892)) * 756))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008b, code lost:
    
        if (r1 == ((((-1746924028) + (((~((-277358890) | r6)) | (~((~r6) | (-1107346433)))) * (-318))) + (((~(282016555 | r6)) | (-1389362988)) * (-318))) + (((~(r6 | (-282016556))) | 1112004098) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        r3 = ~((-646982442) | r2);
        r7 = ((-1240036380) + ((76554504 | r3) * (-280))) + ((r3 | (~((-1932073524) | r2))) * 140);
        r3 = ~((-570427938) | r2);
        r2 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ChooseComplaintActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -441564035
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ChooseComplaintActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 2058941736 + ((~(406907156 | i5)) * (-560)) + ((~(iIdentityHashCode | 1509551103)) * (-560)) + (((~((-1236894700) | i5)) | 134250752) * 560)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode2;
        if (i6 != 498515012 + (((~((-2083470912) | i7)) | (-495585054) | (~(2083470911 | iIdentityHashCode2))) * (-564)) + ((~(iIdentityHashCode2 | (-25166081))) * 1128) + (((~((-495585054) | i7)) | (-2108636992)) * 564)) {
            int i8 = (-167324110) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ChooseComplaintActivity chooseComplaintActivity = (ChooseComplaintActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint", "complaint_history"));
        Intrinsics.checkNotNullParameter(chooseComplaintActivity, "");
        Intrinsics.checkNotNullParameter("complaint_history", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("complaint_history", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("complaint_history", mapMutableMapOf);
        ComplaintHistoryActivity.Companion companion = ComplaintHistoryActivity.INSTANCE;
        ComplaintHistoryActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseComplaintActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ChooseComplaintActivity chooseComplaintActivity = (ChooseComplaintActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint", "complaint_unmatched_data"));
        Intrinsics.checkNotNullParameter(chooseComplaintActivity, "");
        Intrinsics.checkNotNullParameter("complaint_unmatched_data", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("complaint_unmatched_data", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("complaint_unmatched_data", mapMutableMapOf);
        DataUnmatchedComplaintActivity.Companion companion = DataUnmatchedComplaintActivity.INSTANCE;
        DataUnmatchedComplaintActivity.Companion.TuitionPaymentFragmentbindingInflater1(chooseComplaintActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit b(ChooseComplaintActivity chooseComplaintActivity, View view) {
        int iB = setRelative.b();
        return (Unit) b(new Object[]{chooseComplaintActivity, view}, setRelative.b(), -1475091054, 1475091056, iB, setRelative.b(), setRelative.b());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChooseComplaintActivity chooseComplaintActivity, View view) {
        int iB = setRelative.b();
        return (Unit) b(new Object[]{chooseComplaintActivity, view}, setRelative.b(), -1610419780, 1610419781, iB, setRelative.b(), setRelative.b());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChooseComplaintActivity chooseComplaintActivity, View view) {
        int iB = setRelative.b();
        return (Unit) b(new Object[]{chooseComplaintActivity, view}, setRelative.b(), 71603737, -71603737, iB, setRelative.b(), setRelative.b());
    }

    static {
        f475a = 1;
        d();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        f475a = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_choose_complaint;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
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
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{-786527809, -1611945399, -35343743, -713018188, -793686397, -801177997, 593658761, -1100873373, -577095, 1082299028, -1137902333, -1120124549, 770561837, -1554884595, 1010892776, -2058681657, 1012792118, -1985909404};
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
    private static java.lang.String $$i(int r5, byte r6, short r7) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.complaint.ChooseComplaintActivity.$$c
            int r5 = r5 * 56
            int r5 = 122 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r3 = r1[r6]
        L28:
            int r5 = r5 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.ChooseComplaintActivity.$$i(int, byte, short):java.lang.String");
    }
}
