package com.bpjstku.presentation.program;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityProgramDetailBinding;
import com.bpjstku.domain.programinfo.model.ProgramAttribute;
import com.bpjstku.presentation.program.ProgramDetailActivity;
import com.bpjstku.presentation.program.model.ProgramInfo;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.kennyc.view.MultiStateView;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.EncoderImplByteBufferInput;
import defpackage.TargetAspectRatio;
import defpackage.TorchStateReset;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.applyAppLocales;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getAfState;
import defpackage.getDevice;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getNextMenuPosition;
import defpackage.initSession;
import defpackage.isUltraHdrOn;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.r8lambdadPEOltVNxwFUffOSXiaKZsPUiI;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0015\u0010\u0016\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0015X\u0095D¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/program/ProgramDetailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityProgramDetailBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "onTransact", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "LisUltraHdrOn;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgramDetailActivity extends BindingBaseActivity<ActivityProgramDetailBinding> {
    private static char TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f581a;
    private static char asBinder;
    private static char asInterface;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_program_detail;
    private ProgramInfo b;
    private static final byte[] $$c = {55, -64, 35, -71};
    private static final int $$f = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {49, 89, 41, 48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 108;
    private static int notify = 0;
    private static int g = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i6;
        int i11 = ~i;
        int i12 = i9 | (~(i10 | i11 | i4));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i4;
        int i15 = (~(i | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i4 + i6 + i2 + ((-327997910) * i3) + ((-604038433) * i5);
        int i18 = i17 * i17;
        int i19 = ((i4 * 234895570) - 128974848) + (234895570 * i6) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i2) + (36700160 * i3) + ((-297271296) * i5) + (1302134784 * i18);
        int i20 = (i4 * (-238133666)) + 182491156 + (i6 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i2 * (-238134313)) + (i3 * (-1022231738)) + (i5 * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        if (i21 != 1) {
            return i21 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
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
    private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.ProgramDetailActivity.$$a
            int r7 = 53 - r7
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r8 = 196 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2a
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ProgramDetailActivity.c(int, short, byte, java.lang.Object[]):void");
    }

    public ProgramDetailActivity() {
        final ProgramDetailActivity programDetailActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<isUltraHdrOn>() { // from class: com.bpjstku.presentation.program.ProgramDetailActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [isUltraHdrOn, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final isUltraHdrOn invoke() {
                ComponentCallbacks componentCallbacks = programDetailActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(isUltraHdrOn.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.ProgramDetailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/ProgramDetailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/program/model/ProgramInfo;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, ProgramInfo p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ProgramDetailActivity.class, new Pair[]{TuplesKt.to("program", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 41;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i2 + 31;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 5;
        d = i2 % 128;
        int i3 = i2 % 2;
        ProgramDetailActivity$bindingInflater$1 programDetailActivity$bindingInflater$1 = ProgramDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return programDetailActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 47;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("program");
            Intrinsics.checkNotNull(parcelableExtra);
            this.b = (ProgramInfo) parcelableExtra;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("program");
        Intrinsics.checkNotNull(parcelableExtra2);
        this.b = (ProgramInfo) parcelableExtra2;
        int i3 = g + 21;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = d + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        ProgramDetailActivity programDetailActivity = this;
        Intrinsics.checkNotNullParameter(programDetailActivity, "");
        programDetailActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityProgramDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        TextView textView = ((ActivityProgramDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle;
        ProgramInfo programInfo = this.b;
        if (programInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            programInfo = null;
        }
        textView.setText(programInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i4 = d + 115;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((isUltraHdrOn) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new Observer() { // from class: getCameraId
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                ProgramDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        onTransact();
        int i2 = d + 91;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = g + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        ProgramDetailActivity programDetailActivity = this;
        ProgramInfo programInfo = this.b;
        ProgramInfo programInfo2 = null;
        if (programInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = g + 73;
            d = i4 % 128;
            int i5 = i4 % 2;
            programInfo = null;
        }
        String strConcat = "view_detail_info_program_".concat(String.valueOf(programInfo.b));
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_detail_info_program", "view_detail_info_program_result"));
        Intrinsics.checkNotNullParameter(programDetailActivity, "");
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(strConcat, mapMutableMapOf);
        isUltraHdrOn isultrahdron = (isUltraHdrOn) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        ProgramInfo programInfo3 = this.b;
        if (programInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            programInfo2 = programInfo3;
        }
        isultrahdron.TuitionPaymentFragmentspecialinlinedviewModeldefault2(programInfo2.b);
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
                break;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 27;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) f581a) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 47774);
                        int defaultSize = 468 - View.getDefaultSize(i3, i3);
                        int iResolveSizeAndState = View.resolveSizeAndState(i3, i3, i3) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, defaultSize, iResolveSizeAndState, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47772), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 467, 13 - ((Process.getThreadPriority(0) + 20) >> 6), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
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
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2323 - KeyEvent.normalizeMetaState(0), View.resolveSize(0, 0) + 44, -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i11 = $11 + 75;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 51;
        d = i2 % 128;
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
                int i3 = d + 107;
                g = i3 % 128;
                if (i3 % 2 != 0) {
                    d_();
                    int i4 = 23 / 0;
                } else {
                    d_();
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

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        String str;
        Object[] objArr2;
        ProgramDetailActivity programDetailActivity = (ProgramDetailActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = d + 41;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int gidForName = 1754 - Process.getGidForName("");
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[27] - 1), (short) 193, bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, maximumDrawingCacheSize, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                int gidForName2 = Process.getGidForName("") + 24;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr4 = new Object[1];
                c(b2, (short) (b2 | 156), b, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, packedPositionType, gidForName2, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iMyTid = Process.myTid();
            int i4 = (-446229533) + (((-351040455) | iMyTid) * 614);
            int i5 = ~iMyTid;
            int i6 = ((i4 + ((((~((-836748553) | i5)) | 554927112) | (~((-624146127) | i5))) * (-1228))) + (((~(i5 | (-69219015))) | (~((-281821441) | i5))) * 614)) - 861252511;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{15500, 26093, 2562, 21727, 35024, 14286, 16384, 12722, 61826, 64278, 38630, 48953, 29990, 39027, 1369, 9156, 18527, 54461}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_empty).substring(7, 8).codePointAt(0) - 94, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{61333, 38867, 29949, 28336, 25735, 50496, 59657, 24708, 50707, 15150, 6647, 46864, 54425, 7108, 61059, 22328, 15748, 15415}, Color.alpha(0) + 16, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, programDetailActivity)).intValue();
            try {
                Object[] objArr8 = {-1132673974};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.lastIndexOf("", '0') + 1727, TextUtils.indexOf("", "") + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), -861252511, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr9 = new Object[1];
                    c(b4, (short) (b4 | 156), b3, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, i9, jumpTapTimeout, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{9510, 12701, 30388, 47994, 62615, 24937, 56793, 4151, 41227, 41049, 15095, 12708, 64690, 25448, 64003, 65271, 19880, 2389, 60644, 3443, 28347, 55403, 37965, 18626}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step5).substring(3, 4).length() + 21, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{57847, 42816, 52978, 62493, 53095, 2133, 40592, 43506, 49564, 10270, 27831, 14007, 49826, 26908, 33675, 5570, 24830, 46750}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step6).substring(28, 29).length() + 14, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                        int i10 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr12 = new Object[1];
                        c(b6, (short) (b6 | 104), b5, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, i10, iLastIndexOf, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                        int iRgb = Color.rgb(0, 0, 0) + 16778971;
                        int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((byte) (bArr2[27] - 1), (short) 193, bArr2[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, iRgb, absoluteGravity, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i14 = ~iElapsedRealtime;
            int i15 = i13 + (((~(376698240 | i14)) | (~((-589300667) | iElapsedRealtime)) | (~(i14 | 589300666))) * 959) + 1839446706 + (((~(iElapsedRealtime | 589300666)) | (~(i14 | (-589300667))) | (~(376698240 | iElapsedRealtime))) * 959);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                for (String str2 : strArr) {
                    int i18 = g + 53;
                    d = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str2);
                }
            }
            int[] iArr = new int[i12];
            int i20 = i12 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iMyTid2 = Process.myTid();
            int i22 = ~iMyTid2;
            int i23 = i21 + 1958332176 + (((~(498940313 | i22)) | 711542739) * 226) + (((~(i22 | 1073577947)) | (~((-711542740) | iMyTid2)) | 136905105) * (-113)) + ((~(iMyTid2 | 498940313)) * 113);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr15[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cBlue = (char) Color.blue(0);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
            int i26 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b7 = $$a[7];
            byte b8 = b7;
            Object[] objArr16 = new Object[1];
            c(b8, (short) (b8 | 52), b7, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue, iNormalizeMetaState, i26, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new char[]{9510, 12701, 30388, 47994, 62615, 24937, 56793, 4151, 41227, 41049, 15095, 12708, 64690, 25448, 64003, 65271, 19880, 2389, 60644, 3443, 28347, 55403, 37965, 18626}, 22 - (Process.myTid() >> 22), objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new char[]{57847, 42816, 52978, 62493, 53095, 2133, 40592, 43506, 49564, 10270, 27831, 14007, 49826, 26908, 33675, 5570, 24830, 46750}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step4).substring(89, 91).codePointAt(1) - 95, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int size = View.MeasureSpec.getSize(0) + 1031;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            byte b9 = $$a[7];
            byte b10 = b9;
            Object[] objArr19 = new Object[1];
            c(b10, (short) (b10 | 156), b9, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, size, scrollBarFadeDuration, 1344079056, false, (String) objArr19[0], null);
        }
        if (j != ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr20 = new Object[1];
            e(new char[]{15500, 26093, 2562, 21727, 35024, 14286, 16384, 12722, 61826, 64278, 38630, 48953, 29990, 39027, 1369, 9156, 18527, 54461}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{61333, 38867, 29949, 28336, 25735, 50496, 59657, 24708, 50707, 15150, 6647, 46864, 54425, 7108, 61059, 22328, 15748, 15415}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, programDetailActivity)).intValue();
            Object[] objArr22 = {-1132673974};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                str = "";
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46038), TextUtils.indexOf((CharSequence) str, '0', 0) + 1135, 18 - TextUtils.getCapsMode(str, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            } else {
                str = r8;
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1230875313, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iAlpha = 15 - Color.alpha(0);
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr24 = new Object[1];
                c(b12, (short) (b12 | 52), b11, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, keyRepeatDelay, iAlpha, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.green(0) + 45993), Color.green(0) + 1117, (Process.myTid() >> 22) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) str, '0') + 1032;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                byte[] bArr3 = $$a;
                Object[] objArr25 = new Object[1];
                c((byte) 52, bArr3[7], bArr3[28], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(deadChar, iIndexOf, pressedStateDuration, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr2);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{9510, 12701, 30388, 47994, 62615, 24937, 56793, 4151, 41227, 41049, 15095, 12708, 64690, 25448, 64003, 65271, 19880, 2389, 60644, 3443, 28347, 55403, 37965, 18626}, 21 - TextUtils.indexOf((CharSequence) str, '0', 0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{57847, 42816, 52978, 62493, 53095, 2133, 40592, 43506, 49564, 10270, 27831, 14007, 49826, 26908, 33675, 5570, 24830, 46750}, TextUtils.indexOf(str, str) + 15, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(str);
                    int i27 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iGreen = 15 - Color.green(0);
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr28 = new Object[1];
                    c(b14, (short) (b14 | 156), b13, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, i27, iGreen, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iGreen2 = Color.green(0) + 1031;
                    int iMyTid3 = 15 - (Process.myTid() >> 22);
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr29 = new Object[1];
                    c(b16, (short) (b16 | 52), b15, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatTimeout, iGreen2, iMyTid3, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cAlpha = (char) Color.alpha(0);
                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1031;
                int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr4 = $$a;
                Object[] objArr30 = new Object[1];
                c((byte) 52, bArr4[7], bArr4[28], objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAlpha, deadChar2, longPressTimeout, 632103528, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr31[3])[0];
            int i29 = ((int[]) objArr31[1])[0];
            String[] strArr2 = (String[]) objArr31[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i30 = ~startElapsedRealtime;
            int i31 = ~(457375264 | i30);
            int i32 = (-389245583) + (((-536084151) | i31) * (-712)) + (((~(startElapsedRealtime | (-78708887))) | (~(i30 | 536084150))) * (-712)) + ((213095094 | i31) * 712) + 1230875313;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[2])[0] = i34 ^ (i34 << 5);
        }
        if (((int[]) objArr2[3])[0] == ((int[]) objArr2[1])[0]) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr2[2])[0];
            int i36 = ((int[]) objArr2[3])[0];
            int i37 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int i38 = (int) Runtime.getRuntime().totalMemory();
            int i39 = i35 + 619471748 + (((~((~i38) | 138103276)) | (-243231230)) * 529) + (((~(i38 | 138103276)) | (-106176894)) * 529);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr32[2])[0] = i41 ^ (i41 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            for (String str3 : strArr4) {
                arrayList2.add(str3);
            }
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d4, code lost:
    
        if (r1 != ((r6 + (r2 * (-245))) + ((r2 | 774893778) * 245))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.program.ProgramDetailActivity.d + 13;
        com.bpjstku.presentation.program.ProgramDetailActivity.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e2, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e4, code lost:
    
        r0 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e8, code lost:
    
        r1 = (-1363102160) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f1, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f2, code lost:
    
        r1 = 308508404 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fb, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005b, code lost:
    
        if (r1 == ((((-410628888) + (((~(926051194 | r2)) | 9015425) * 104)) + ((~((~r2) | (-839002969))) * (-104))) + ((r2 | 96063651) * 104))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        if (r1 == ((((-1541134816) + (((-20972105) | r2) * (-627))) + (((~(1096557135 | r2)) | 266569592) * (-627))) + (((~(r2 | 266569592)) | (~((~r2) | (-1096557136)))) * 627))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a9, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) android.os.SystemClock.elapsedRealtime();
        r6 = 1346745460 + (((~((~r2) | (-1804162187))) | 1098908680) * (-245));
        r2 = ~(r2 | (-1804162187));
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ProgramDetailActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 121;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~startElapsedRealtime;
        if (i4 != (-1490977934) + (((~(i5 | (-1213998249))) | 384010705) * (-1042)) + (((-1213998249) | startElapsedRealtime) * 521) + (((~(startElapsedRealtime | (-384010706))) | 379816273 | (~(i5 | (-1209803817)))) * 521)) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i8 = ~((-738877598) | i7);
        int i9 = ~i7;
        if (i6 != 669516476 + ((i8 | (~(i9 | (-1076101121)))) * 920) + (((~((-764077248) | i9)) | 738877597) * 920) + (((~(i7 | (-1076101121))) | (~((-738877598) | i9)) | (~((-25199651) | i7))) * 920)) {
            throw null;
        }
        super.onStart();
        int i10 = g + 89;
        d = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 65;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ~System.identityHashCode(this);
        if (i4 != ((1563865192 + (((~(i5 | 2147336191)) | (~((-541397701) | i5))) * (-184))) + (((387975474 | (~((-929373175) | i5))) | (~(1759360717 | i5))) * 184)) - 766895920) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 827923427;
        int i7 = ~length;
        int i8 = (~((-311119493) | i7)) | 34162304;
        int i9 = ~(length | (-1750073636));
        if (i6 != (-1746303908) + ((i8 | i9) * (-502)) + ((i9 | (~(i7 | (-276957189)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            int i10 = 111715680 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i11 = d + 53;
        g = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x021c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ProgramDetailActivity programDetailActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i;
        int i2;
        String str;
        ActivityProgramDetailBinding activityProgramDetailBinding;
        ProgramInfo programInfo;
        ProgramAttribute programAttribute;
        List listMutableListOf;
        List listMutableListOf2;
        int i3;
        int i4 = 2 % 2;
        int i5 = d + 105;
        int i6 = i5 % 128;
        g = i6;
        ProgramInfo programInfo2 = null;
        if (i5 % 2 != 0) {
            int i7 = 36 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                i = i6 + 101;
                d = i % 128;
                if (i % 2 != 0) {
                    MultiStateView multiStateView = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
                    Intrinsics.checkNotNullExpressionValue(multiStateView, "");
                    multiStateView.setViewState(MultiStateView.ViewState.LOADING);
                    programInfo2.hashCode();
                    throw null;
                }
                MultiStateView multiStateView2 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
                Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
                multiStateView2.setViewState(MultiStateView.ViewState.LOADING);
                i2 = d + 21;
                g = i2 % 128;
                if (i2 % 2 != 0) {
                    int i8 = 2 % 5;
                }
                str = "loading_info_program_result";
            } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                MultiStateView multiStateView3 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
                Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
                multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
                r8lambdadPEOltVNxwFUffOSXiaKZsPUiI r8lambdadpeoltvnxwfuffosxiakzspuii = (r8lambdadPEOltVNxwFUffOSXiaKZsPUiI) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                activityProgramDetailBinding = (ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                programInfo = programDetailActivity.b;
                if (programInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    programInfo2 = programInfo;
                }
                activityProgramDetailBinding.imgProgram.setImageResource(programInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                activityProgramDetailBinding.tvProgramTitle.setText(programInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (programInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    i3 = g + 101;
                    d = i3 % 128;
                    if (i3 % 2 == 0) {
                        ImageView imageView = activityProgramDetailBinding.imgStatusCheck;
                        Intrinsics.checkNotNullExpressionValue(imageView, "");
                        imageView.setVisibility(1);
                        activityProgramDetailBinding.tvProgramUserStatus.setText(programDetailActivity.getString(R.string.label_program_registered));
                    } else {
                        ImageView imageView2 = activityProgramDetailBinding.imgStatusCheck;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "");
                        imageView2.setVisibility(0);
                        activityProgramDetailBinding.tvProgramUserStatus.setText(programDetailActivity.getString(R.string.label_program_registered));
                    }
                } else {
                    ImageView imageView3 = activityProgramDetailBinding.imgStatusCheck;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    imageView3.setVisibility(8);
                    activityProgramDetailBinding.tvProgramUserStatus.setText(programDetailActivity.getString(R.string.label_program_not_registered));
                }
                activityProgramDetailBinding.tvProgramDescription.setText(r8lambdadpeoltvnxwfuffosxiakzspuii.data.description);
                programAttribute = r8lambdadpeoltvnxwfuffosxiakzspuii.data;
                ViewPager viewPager = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpProgramDetail;
                FragmentManager supportFragmentManager = programDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                if (!Intrinsics.areEqual(programAttribute.JakonTuitionAmount, "") && Intrinsics.areEqual(programAttribute.bpuTuitionAmount, "") && Intrinsics.areEqual(programAttribute.pmiTuitionAmount, "") && Intrinsics.areEqual(programAttribute.puTuitionAmount, "")) {
                    getDevice.Companion companion = getDevice.INSTANCE;
                    listMutableListOf = CollectionsKt.mutableListOf(getDevice.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(programAttribute));
                } else {
                    getDevice.Companion companion2 = getDevice.INSTANCE;
                    getAfState.Companion companion3 = getAfState.INSTANCE;
                    listMutableListOf = CollectionsKt.mutableListOf(getDevice.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(programAttribute), getAfState.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(programAttribute));
                }
                if (!Intrinsics.areEqual(programAttribute.JakonTuitionAmount, "") && Intrinsics.areEqual(programAttribute.bpuTuitionAmount, "") && Intrinsics.areEqual(programAttribute.pmiTuitionAmount, "")) {
                    int i9 = g + 121;
                    d = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 1 / 0;
                        if (!(!Intrinsics.areEqual(programAttribute.puTuitionAmount, ""))) {
                            listMutableListOf2 = CollectionsKt.mutableListOf("Manfaat");
                        } else {
                            listMutableListOf2 = CollectionsKt.mutableListOf(programDetailActivity.getString(R.string.label_benefit), programDetailActivity.getString(R.string.label_tuition_fee));
                        }
                    } else if (!Intrinsics.areEqual(programAttribute.puTuitionAmount, "")) {
                        listMutableListOf2 = CollectionsKt.mutableListOf(programDetailActivity.getString(R.string.label_benefit), programDetailActivity.getString(R.string.label_tuition_fee));
                    } else {
                        listMutableListOf2 = CollectionsKt.mutableListOf("Manfaat");
                    }
                } else {
                    listMutableListOf2 = CollectionsKt.mutableListOf(programDetailActivity.getString(R.string.label_benefit), programDetailActivity.getString(R.string.label_tuition_fee));
                }
                viewPager.setAdapter(new TorchStateReset(supportFragmentManager, listMutableListOf, listMutableListOf2));
                ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tabProgramDetail.setupWithViewPager(((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpProgramDetail);
                str = "success_info_program_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                MultiStateView multiStateView4 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
                Intrinsics.checkNotNullExpressionValue(multiStateView4, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView4, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, programDetailActivity.getString(R.string.error_error_occured), null, new Pair(programDetailActivity.getString(R.string.action_retry), new Function0() { // from class: AutoValue_SupportedSurfaceCombination_FeatureSettings
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProgramDetailActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                    }
                }));
                str = "failure_info_program_result";
            } else {
                str = "";
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            i = i6 + 101;
            d = i % 128;
            if (i % 2 != 0) {
                MultiStateView multiStateView5 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
                Intrinsics.checkNotNullExpressionValue(multiStateView5, "");
                multiStateView5.setViewState(MultiStateView.ViewState.LOADING);
                programInfo2.hashCode();
                throw null;
            }
            MultiStateView multiStateView6 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView6, "");
            multiStateView6.setViewState(MultiStateView.ViewState.LOADING);
            i2 = d + 21;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                int i11 = 2 % 5;
            }
            str = "loading_info_program_result";
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            MultiStateView multiStateView7 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView7, "");
            multiStateView7.setViewState(MultiStateView.ViewState.CONTENT);
            r8lambdadPEOltVNxwFUffOSXiaKZsPUiI r8lambdadpeoltvnxwfuffosxiakzspuii2 = (r8lambdadPEOltVNxwFUffOSXiaKZsPUiI) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            activityProgramDetailBinding = (ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            programInfo = programDetailActivity.b;
            if (programInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                programInfo2 = programInfo;
            }
            activityProgramDetailBinding.imgProgram.setImageResource(programInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            activityProgramDetailBinding.tvProgramTitle.setText(programInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (programInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                i3 = g + 101;
                d = i3 % 128;
                if (i3 % 2 == 0) {
                    ImageView imageView4 = activityProgramDetailBinding.imgStatusCheck;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(1);
                    activityProgramDetailBinding.tvProgramUserStatus.setText(programDetailActivity.getString(R.string.label_program_registered));
                } else {
                    ImageView imageView5 = activityProgramDetailBinding.imgStatusCheck;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "");
                    imageView5.setVisibility(0);
                    activityProgramDetailBinding.tvProgramUserStatus.setText(programDetailActivity.getString(R.string.label_program_registered));
                }
            } else {
                ImageView imageView6 = activityProgramDetailBinding.imgStatusCheck;
                Intrinsics.checkNotNullExpressionValue(imageView6, "");
                imageView6.setVisibility(8);
                activityProgramDetailBinding.tvProgramUserStatus.setText(programDetailActivity.getString(R.string.label_program_not_registered));
            }
            activityProgramDetailBinding.tvProgramDescription.setText(r8lambdadpeoltvnxwfuffosxiakzspuii2.data.description);
            programAttribute = r8lambdadpeoltvnxwfuffosxiakzspuii2.data;
            ViewPager viewPager2 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpProgramDetail;
            FragmentManager supportFragmentManager2 = programDetailActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            if (!Intrinsics.areEqual(programAttribute.JakonTuitionAmount, "")) {
                getDevice.Companion companion4 = getDevice.INSTANCE;
                getAfState.Companion companion5 = getAfState.INSTANCE;
                listMutableListOf = CollectionsKt.mutableListOf(getDevice.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(programAttribute), getAfState.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(programAttribute));
            } else {
                getDevice.Companion companion6 = getDevice.INSTANCE;
                getAfState.Companion companion7 = getAfState.INSTANCE;
                listMutableListOf = CollectionsKt.mutableListOf(getDevice.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(programAttribute), getAfState.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(programAttribute));
            }
            if (!Intrinsics.areEqual(programAttribute.JakonTuitionAmount, "")) {
                listMutableListOf2 = CollectionsKt.mutableListOf(programDetailActivity.getString(R.string.label_benefit), programDetailActivity.getString(R.string.label_tuition_fee));
            } else {
                listMutableListOf2 = CollectionsKt.mutableListOf(programDetailActivity.getString(R.string.label_benefit), programDetailActivity.getString(R.string.label_tuition_fee));
            }
            viewPager2.setAdapter(new TorchStateReset(supportFragmentManager2, listMutableListOf, listMutableListOf2));
            ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tabProgramDetail.setupWithViewPager(((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpProgramDetail);
            str = "success_info_program_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            MultiStateView multiStateView8 = ((ActivityProgramDetailBinding) ((ViewBinding) programDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView8, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView8, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, programDetailActivity.getString(R.string.error_error_occured), null, new Pair(programDetailActivity.getString(R.string.action_retry), new Function0() { // from class: AutoValue_SupportedSurfaceCombination_FeatureSettings
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProgramDetailActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                }
            }));
            str = "failure_info_program_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_info_program", str));
        Intrinsics.checkNotNullParameter(programDetailActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ProgramDetailActivity programDetailActivity) {
        int i = 2 % 2;
        int i2 = d + 37;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            programDetailActivity.onTransact();
            return Unit.INSTANCE;
        }
        programDetailActivity.onTransact();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    static {
        onTransact = 1;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 117;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityProgramDetailBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) TuitionPaymentFragmentbindingInflater1(getNextMenuPosition.b(), new Object[]{this}, getNextMenuPosition.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 1009950846, -1002062912, 1003035946 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).length(), 1002062913);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentbindingInflater1(getNextMenuPosition.b(), new Object[]{this}, applyAppLocales.TuitionPaymentFragmentbindingInflater1(), applyAppLocales.TuitionPaymentFragmentbindingInflater1(), -1888747634, getNextMenuPosition.b(), 1888747634);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 85;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 83;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentbindingInflater1(applyAppLocales.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, context}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_canceled).substring(13, 14).length() + 599733860, getNextMenuPosition.b(), 2067694538, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_registration).substring(12, 13).length() - 1653860364, -2067694536);
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = (char) 40722;
        asBinder = (char) 38136;
        f581a = (char) 15849;
        asInterface = (char) 38742;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 59;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r6 = r6 * 2
            int r6 = 108 - r6
            byte[] r0 = com.bpjstku.presentation.program.ProgramDetailActivity.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ProgramDetailActivity.$$i(int, int, byte):java.lang.String");
    }
}
