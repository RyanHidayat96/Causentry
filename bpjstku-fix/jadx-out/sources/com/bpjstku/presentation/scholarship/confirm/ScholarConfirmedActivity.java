package com.bpjstku.presentation.scholarship.confirm;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityScholarConfirmedBinding;
import com.bpjstku.domain.scholarship.model.ScholarInsertResult;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity;
import com.bpjstku.util.custom.CircleImageView;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.MultiViewUpdateListener;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CaptureSession1;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.mapPoint;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/scholarship/confirm/ScholarConfirmedActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityScholarConfirmedBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;", "Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarConfirmedActivity extends BindingBaseActivity<ActivityScholarConfirmedBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ScholarInsertResult TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$f = 141;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 104, -93, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 133;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int d = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | (~i))) | (~(i6 | i3 | i));
        int i10 = (~(i8 | i)) | (~(i8 | i6));
        int i11 = (~(i | i3)) | i6;
        int i12 = i6 + i3 + i5 + (1661237432 * i2) + (961048624 * i4);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i6) - 281083904) + ((-1329838950) * i3) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i5) + ((-1559232512) * i2) + (1553989632 * i4) + (2020540416 * i13);
        int i15 = (i6 * (-2040814728)) + 92927091 + (i3 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i5 * (-2040814133)) + (i2 * (-1614655000)) + (i4 * 500164112) + (i13 * 184877056);
        return i14 + ((i15 * i15) * 1800994816) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    private static void c(short s, byte b, int i, Object[] objArr) {
        int i2 = 197 - i;
        byte[] bArr = $$a;
        int i3 = 98 - (s * 14);
        byte[] bArr2 = new byte[b + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + i3) - 11;
            i4 = -1;
        }
        while (true) {
            int i5 = i2;
            int i6 = i3;
            int i7 = i4 + 1;
            bArr2[i7] = (byte) i6;
            if (i7 == b) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i5 + 1;
                i3 = (i6 + bArr[i5]) - 11;
                i4 = i7;
            }
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/scholarship/confirm/ScholarConfirmedActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, ScholarInsertResult p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ScholarConfirmedActivity.class, new Pair[]{TuplesKt.to(Scopes.PROFILE, p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ScholarConfirmedActivity() {
        final ScholarConfirmedActivity scholarConfirmedActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = scholarConfirmedActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityScholarConfirmedBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ScholarConfirmedActivity$bindingInflater$1 scholarConfirmedActivity$bindingInflater$1 = ScholarConfirmedActivity$bindingInflater$1.b;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return scholarConfirmedActivity$bindingInflater$1;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ScholarConfirmedActivity scholarConfirmedActivity = (ScholarConfirmedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
            if (scholarConfirmedActivity.getIntent().hasExtra(Scopes.PROFILE)) {
                scholarConfirmedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (ScholarInsertResult) scholarConfirmedActivity.getIntent().getParcelableExtra(Scopes.PROFILE);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (scholarConfirmedActivity.getIntent().hasExtra(Scopes.PROFILE)) {
            scholarConfirmedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (ScholarInsertResult) scholarConfirmedActivity.getIntent().getParcelableExtra(Scopes.PROFILE);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = d + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final ScholarConfirmedActivity scholarConfirmedActivity = (ScholarConfirmedActivity) objArr[0];
        int i = 2 % 2;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) scholarConfirmedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(scholarConfirmedActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getZoomRatioRange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarConfirmedActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            ((ActivityScholarConfirmedBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNamesLegacy.setText(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            if (str3 != null) {
                int i3 = d + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
                str2 = str3;
            }
            activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r5 = r1.contentConfirmStatus2;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r5.setVisibility(8);
        r5 = r1.contentConfirmStatus1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r5.setVisibility(0);
        r1.contentConfirmStatusText1.setText(r4.TuitionPaymentFragmentbindingInflater1);
        r2 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.d + 97;
        com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2 % 128;
        r2 = r2 % 2;
     */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void asBinder() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.asBinder():void");
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = d + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46400), (ViewConfiguration.getFadingEdgeLength() >> 16) + 40, TextUtils.indexOf((CharSequence) "", '0') + 20, 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - Color.alpha(0)), KeyEvent.getDeadChar(0, 0) + 59, Color.blue(0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.getDefaultSize(0, 0) + 37836), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, 18 - Color.alpha(0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -712;
        long j3 = -1;
        long j4 = j3 ^ 5390493879736865819L;
        long j5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        long j6 = j5 ^ j3;
        long j7 = (j6 | 128759617422920420L) ^ j3;
        long j8 = (((long) (-711)) * 128759617422920420L) + (((long) 713) * 5390493879736865819L) + ((((j4 | 128759617422920420L) ^ j3) | j7) * j2) + (j2 * (((5462852877807165183L | j5) ^ j3) | (((j4 | j6) | 128759617422920420L) ^ j3))) + (((long) 712) * (j4 | j7));
        int i5 = 0;
        while (true) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            d = i6 % 128;
            int i7 = 2;
            int i8 = i6 % 2;
            int i9 = 0;
            while (i9 != 8) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                d = i10 % 128;
                if (i10 % i7 == 0) {
                    i4 += ((((int) (j >>> i9)) & 27103) - (i4 >>> 6)) - (i4 + 41);
                    i9 += 75;
                } else {
                    i4 = (((((int) (j >> i9)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                    i9++;
                }
                i7 = 2;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            int i11 = d + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
            j = j8;
        }
        if (i4 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getTapTimeout() >> 16)), 40 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i3));
        }
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i10 = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $11 + 49;
                $10 = i12 % 128;
                int i13 = i12 % i2;
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1270 - (ViewConfiguration.getTapTimeout() >> 16), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 407021364, false, $$i(b, (byte) (b + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
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
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i14 = $10 + 117;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 3225 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2133916302, false, $$i(b2, (byte) (b2 | 6), (byte) i10), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int iResolveSize = View.resolveSize(0, 0) + 1755;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                        byte length2 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSize, scrollBarFadeDuration, 387247676, false, $$i((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41241), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1704, 21 - TextUtils.getOffsetAfter("", 0), -1434471773, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i10 = -1;
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i18 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i18, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i18);
        } else {
            i = 0;
        }
        int i19 = 1;
        if (z) {
            char[] cArr6 = new char[i7];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i7) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - i19];
                setvideostabilizationmode.b += i19;
                int i20 = $10 + i19;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                i19 = 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i22 = 0;
            while (true) {
                setvideostabilizationmode.b = i22;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i22 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
        int i23 = $10 + 5;
        $11 = i23 % 128;
        int i24 = i23 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:19:0x017c  */
    /* JADX WARN: Code duplicated, block: B:22:0x01d4 A[Catch: all -> 0x08d3, TryCatch #2 {all -> 0x08d3, blocks: (B:20:0x01c0, B:22:0x01d4, B:23:0x0207, B:51:0x05d4, B:53:0x05e8, B:54:0x0618, B:56:0x0649, B:57:0x06be), top: B:99:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x021d  */
    /* JADX WARN: Code duplicated, block: B:31:0x02af  */
    /* JADX WARN: Code duplicated, block: B:34:0x02ff  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        d = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(bArr[28], (byte) (-bArr[3]), (short) 193, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, iKeyCodeFromString, packedPositionChild, 986134021, false, (String) objArr2[0], null);
            }
            int i4 = 42 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                    int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                    Object[] objArr3 = new Object[1];
                    c($$a[28], (byte) 52, (short) 156, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iCombineMeasuredStates, i5, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i6 = ((int[]) objArr4[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int i7 = ~Process.myPid();
                int i8 = 1955657614 + (((~((-165030163) | i7)) | (-47572264)) * (-983)) + (((~(i7 | (-47572264))) | 33670181) * 983) + 1805136655;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new int[]{0, 16, 0, 1}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new int[]{16, 16, 42, 15}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-758582203};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1726 - (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 1805136655);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAlpha = (char) (29944 - Color.alpha(0));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                        int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                        Object[] objArr8 = new Object[1];
                        c($$a[28], (byte) 52, (short) 156, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, maximumFlingVelocity, offsetBefore, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new int[]{32, 22, 0, 2}, false, new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new int[]{54, 15, 68, 9}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1}, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                            int iIndexOf = TextUtils.indexOf("", "") + 23;
                            byte[] bArr2 = $$a;
                            Object[] objArr11 = new Object[1];
                            c(bArr2[28], (byte) 52, bArr2[1], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iLastIndexOf, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cGreen = (char) (Color.green(0) + 29944);
                            int mode = 1755 - View.MeasureSpec.getMode(0);
                            int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                            byte[] bArr3 = $$a;
                            Object[] objArr12 = new Object[1];
                            c(bArr3[28], (byte) (-bArr3[3]), (short) 193, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, mode, i11, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i12 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr4 = $$a;
                Object[] objArr13 = new Object[1];
                c(bArr4[28], (byte) (-bArr4[3]), (short) 193, objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, keyRepeatDelay, i12, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int iCombineMeasuredStates2 = 1755 - View.combineMeasuredStates(0, 0);
                    int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                    Object[] objArr14 = new Object[1];
                    c($$a[28], (byte) 52, (short) 156, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, iCombineMeasuredStates2, i13, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i14 = ((int[]) objArr15[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i14}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int i15 = ~Process.myPid();
                int i16 = 1955657614 + (((~((-165030163) | i15)) | (-47572264)) * (-983)) + (((~(i15 | (-47572264))) | 33670181) * 983) + 1805136655;
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i18 ^ (i18 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new int[]{0, 16, 0, 1}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1}, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new int[]{16, 16, 42, 15}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-758582203};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1726 - (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 1805136655);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha2 = (char) (29944 - Color.alpha(0));
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                    int offsetBefore2 = 23 - TextUtils.getOffsetBefore("", 0);
                    Object[] objArr19 = new Object[1];
                    c($$a[28], (byte) 52, (short) 156, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha2, maximumFlingVelocity2, offsetBefore2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                Object[] objArr20 = new Object[1];
                e(new int[]{32, 22, 0, 2}, false, new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new int[]{54, 15, 68, 9}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1}, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char touchSlop2 = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                    int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int iIndexOf2 = TextUtils.indexOf("", "") + 23;
                    byte[] bArr5 = $$a;
                    Object[] objArr111 = new Object[1];
                    c(bArr5[28], (byte) 52, bArr5[1], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop2, iLastIndexOf2, iIndexOf2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cGreen2 = (char) (Color.green(0) + 29944);
                    int mode2 = 1755 - View.MeasureSpec.getMode(0);
                    int i19 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                    byte[] bArr6 = $$a;
                    Object[] objArr112 = new Object[1];
                    c(bArr6[28], (byte) (-bArr6[3]), (short) 193, objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen2, mode2, i19, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            while (i3 < strArr.length) {
                arrayList.add(strArr[i3]);
                i3++;
            }
            throw null;
        }
        int i20 = d + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        int i23 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        Object[] objArr21 = {new int[]{i23}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i25 = ~((-281288769) | i24);
        int i26 = ~i24;
        int i27 = i22 + (-2108100255) + ((i25 | (~(402472831 | i26))) * 920) + (((~((-333786490) | i26)) | 281288768) * 920) + (((~(i24 | 402472831)) | (~((-281288769) | i26)) | (~((-52497722) | i24))) * 920);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr21[3])[0] = i29 ^ (i29 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int i30 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int size = View.MeasureSpec.getSize(0) + 15;
            byte b = (byte) 52;
            Object[] objArr22 = new Object[1];
            c($$a[28], b, b, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, i30, size, 1357589585, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        e(new int[]{32, 22, 0, 2}, false, new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(new int[]{54, 15, 68, 9}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1}, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cRed = (char) Color.red(0);
            int i31 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            Object[] objArr25 = new Object[1];
            c($$a[28], (byte) 52, (short) 156, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRed, i31, scrollBarFadeDuration, 1344079056, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iMyPid = (Process.myPid() >> 22) + 1031;
                int i32 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr26 = new Object[1];
                c(b2, b3, b3, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cCombineMeasuredStates, iMyPid, i32, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr27[3])[0];
            int i34 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int i35 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i36 = (((-1054560939) + (((~(233781993 | i35)) | 10498176) * (-756))) + (((~i35) | 233781993) * 756)) - 913926625;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[2])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            e(new int[]{0, 16, 0, 1}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1}, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(new int[]{16, 16, 42, 15}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {-758582203};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46037), 1134 - View.getDefaultSize(0, 0), 18 - TextUtils.getTrimmedLength(""), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, -913926625, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                int maximumDrawingCacheSize2 = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b4 = (byte) 52;
                Object[] objArr32 = new Object[1];
                c($$a[28], b4, b4, objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, edgeSlop, maximumDrawingCacheSize2, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.alpha(0) + 1117, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr33 = new Object[1];
                c(b5, b6, b6, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(minimumFlingVelocity, iAxisFromString, iResolveSizeAndState, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                e(new int[]{32, 22, 0, 2}, false, new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                e(new int[]{54, 15, 68, 9}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1}, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i39 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                    Object[] objArr36 = new Object[1];
                    c($$a[28], (byte) 52, (short) 156, objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, i39, iIndexOf3, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1031;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    byte b7 = (byte) 52;
                    Object[] objArr37 = new Object[1];
                    c($$a[28], b7, b7, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c2, offsetAfter2, jumpTapTimeout, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
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
            while (i3 < strArr3.length) {
                arrayList2.add(strArr3[i3]);
                i3++;
            }
            throw null;
        }
        int i40 = d + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
        int i41 = i40 % 2;
        Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i42 = ((int[]) objArr[2])[0];
        int i43 = ((int[]) objArr[3])[0];
        int i44 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1345687938;
        int i46 = ~i45;
        int i47 = i42 + 1868277101 + (((~((-589909400) | i46)) | 834189569) * (-328)) + ((i45 | 834189569) * 164) + (((~(i45 | 589909399)) | 277917696 | (~(i46 | (-33637527)))) * 164);
        int i48 = i47 ^ (i47 << 13);
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr38[2])[0] = i49 ^ (i49 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != ((((~(1601794043 | i5)) | (~((-1081671937) | iIdentityHashCode))) * 988) - 1901497476) + (((~(iIdentityHashCode | 1350109650)) | 251684393 | (~(i5 | (-1081671937)))) * 988)) {
            throw null;
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt(174134735);
        int i7 = ~((-1234604701) | iNextInt);
        if (i6 != (-1048827060) + ((270540800 | i7) * (-476)) + (i7 * 952) + ((~((~iNextInt) | (-1234604701))) * 476)) {
            throw new RuntimeException("429140594");
        }
        super.onResume();
        int i8 = d + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d8, code lost:
    
        if (r1 != (((((~((-378107499) | r2)) | 34162274) * (-241)) - 282200050) + (((~(r2 | (-343945225))) | (-2128181104)) * 241))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00da, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e8, code lost:
    
        r1 = (-115661814) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f1, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == ((r9 + (((~(r6 | (-312568362))) | (~(849738493 | r8))) * 859)) + (((~(1679726036 | r8)) | (-1992294398)) * 859))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        if (r1 == ((r9 + (((~(r6 | (-285763082))) | (~(1029203483 | r8))) * 859)) + (((~(1859191026 | r8)) | (-2144954108)) * 859))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0095, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ~((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.onStart():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0090  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != ((641634858 + (((~((-545892738) | iIdentityHashCode)) | (~((-1375880281) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-1577206905))) | ((~((-747219362) | iIdentityHashCode)) | 201326624)) * (-69))) - 464987234) {
                int[] iArr = new int[647853456];
                iArr[647853455] = 1;
                int i4 = 33520496 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                d = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            int i7 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            if (i7 != (-573117390) + (((~(i8 | 872750733)) | 1098424672) * 305) + (((~((~i8) | 872750733)) | 1702738276) * 305)) {
                int[] iArr2 = new int[647853456];
                iArr2[647853455] = 1;
                int i9 = 33520496 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                d = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i13 = ~iUptimeMillis;
        if (i12 != ((((~((-1078102545) | i13)) | (~(1828716476 | iUptimeMillis))) * 988) - 1444759672) + (((~(iUptimeMillis | (-1828442033))) | 750339488 | (~(i13 | 1828716476))) * 988)) {
            throw null;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit b(ScholarConfirmedActivity scholarConfirmedActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 113;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i2 + 35;
            d = i4 % 128;
            int i5 = i4 % 2;
            CircleImageView circleImageView = ((ActivityScholarConfirmedBinding) ((ViewBinding) scholarConfirmedActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            ScholarConfirmedActivity scholarConfirmedActivity2 = scholarConfirmedActivity;
            Bitmap bitmap = (Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Drawable drawable = scholarConfirmedActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            Drawable drawable2 = scholarConfirmedActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            lambdacreateCameraSelectorById0.b(circleImageView, scholarConfirmedActivity2, bitmap, drawable, drawable2);
        }
        return Unit.INSTANCE;
    }

    static {
        asInterface = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 87;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_scholar_confirmed;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 746224833, AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -746224833);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1357578141, AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_due_amount).substring(8, 9).length() + 76173573, 1357578142);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{59709, 59744, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59724, 59800, 59784, 59764, 59804, 59807, 59765, 59777, 59819, 59795, 59795, 59792, 59800, 59781, 59803, 59802, 59706, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59743, 59796, 59796, 59811, 59835, 59838, 59815, 59809, 59815, 59810, 59814, 59812, 59833, 59839, 59809};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.$$c
            int r8 = r8 + 4
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.confirm.ScholarConfirmedActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
