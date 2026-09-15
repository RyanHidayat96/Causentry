package com.bpjstku.presentation.promo;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.banner.model.request.BannerRequest;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityPromoBinding;
import com.bpjstku.domain.banner.model.Banner;
import com.bpjstku.presentation.promo.PromoActivity;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.kennyc.view.MultiStateView;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.FocusMeteringControlExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.flushLollipops;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.setCameraOperatingMode;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.unbindImageCaptureAndRecreate;
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
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001aR\u0015\u0010\b\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/promo/PromoActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPromoBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LflushLollipops;", "Lkotlin/Lazy;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LFocusMeteringControlExternalSyntheticLambda0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromoActivity extends BindingBaseActivity<ActivityPromoBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int b;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {87, -91, 60, 112};
    private static final int $$f = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 13;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f620a = 0;
    private static int g = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_promo;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getMaxSizeDisplay
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = ~i2;
        int i10 = (~(i9 | i3)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i3;
        int i13 = i10 | (~i12);
        int i14 = i7 | i2;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i2));
        int i17 = i3 + i2 + i4 + ((-1254723898) * i) + ((-1667789834) * i6);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i3) + 1379663872 + ((-481802647) * i2) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i4) + ((-1033371648) * i) + ((-106430464) * i6) + (1552875520 * i18);
        int i20 = ((i3 * (-402395399)) - 1316031342) + (i2 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i4 * (-402393527)) + (i * (-1219896714)) + (i6 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        if (i21 != 1) {
            return i21 != 2 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 1
            byte[] r0 = com.bpjstku.presentation.promo.PromoActivity.$$a
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    public PromoActivity() {
        final PromoActivity promoActivity = this;
        this.b = LazyKt.lazy(new Function0<flushLollipops>() { // from class: com.bpjstku.presentation.promo.PromoActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [flushLollipops, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final flushLollipops invoke() {
                ComponentCallbacks componentCallbacks = promoActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(flushLollipops.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.promo.PromoActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/promo/PromoActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PromoActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 83;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentbindingInflater1;
        int i5 = i2 + 97;
        g = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPromoBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 11;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            PromoActivity$bindingInflater$1 promoActivity$bindingInflater$1 = PromoActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PromoActivity$bindingInflater$1 promoActivity$bindingInflater$2 = PromoActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = g + 9;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return promoActivity$bindingInflater$2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        ((flushLollipops) ((PromoActivity) objArr[0]).b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BannerRequest());
        int i2 = asInterface + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((flushLollipops) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new Observer() { // from class: canResolveWithinConstraints
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PromoActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asInterface + 95;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0181  */
    /* JADX WARN: Code duplicated, block: B:40:0x0182  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 3292, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 1199271174, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651, 44 - (ViewConfiguration.getScrollBarSize() >> 8), -450685997, false, $$i(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $10 + 103;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            int i10 = $10 + 19;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 651, 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -450685997, false, $$i(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        PromoActivity promoActivity = this;
        Intrinsics.checkNotNullParameter(promoActivity, "");
        promoActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityPromoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityPromoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_promo_and_discount));
        RecyclerView recyclerView = ((ActivityPromoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvPromo;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new setCameraOperatingMode(24, 16));
        recyclerView.setAdapter((FocusMeteringControlExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i2 = asInterface + 41;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = g + 1;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        int i;
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i2 = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
            byte b2 = (byte) ($$b << 2);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(b2, bArr[5], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, packedPositionGroup, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, 197 - View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, 5 - KeyEvent.getDeadChar(0, 0), new char[]{65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(true, 201 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_1).substring(14, 15).length() + 14, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, new char[]{5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
            byte b3 = (byte) ($$b << 2);
            byte b4 = $$a[5];
            Object[] objArr5 = new Object[1];
            c(b3, b4, (short) (b4 | 50), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, iKeyCodeFromString, iLastIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = g + 35;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                i = 15;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                c(b5, b6, (short) (b6 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, iIndexOf, edgeSlop, 632103528, false, (String) objArr6[0], null);
            } else {
                i = 15;
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ~((int) Process.getStartElapsedRealtime());
            int i10 = (((((~((-511352583) | i9)) | 269519874) * (-241)) + 1243782650) + (((~(i9 | (-241832709))) | (-536592287)) * 241)) - 941292005;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            i = 15;
            Object[] objArr8 = new Object[1];
            e(false, 196 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_not_equal).substring(5, 6).length() + 15, 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{'\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 164, (ViewConfiguration.getLongPressTimeout() >> 16) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {556831873};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Color.red(0)), (Process.myTid() >> 22) + 1134, (-16777198) - Color.rgb(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -941292005, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte b7 = (byte) ($$b << 2);
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c(b7, bArr2[5], bArr2[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, iArgb, scrollBarSize, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.green(0)), 1117 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0')), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int i13 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr13 = new Object[1];
                    c(b8, b9, (short) (b9 | 103), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, windowTouchSlop, i13, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 85, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).codePointAt(0) - 58, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_atm_bersama).substring(52, 57).length(), new char[]{65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n'}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).codePointAt(0) + 102, 15 - KeyEvent.normalizeMetaState(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.thank_you).substring(0, 1).codePointAt(0) - 82, new char[]{5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                        byte b10 = (byte) ($$b << 2);
                        byte b11 = $$a[5];
                        Object[] objArr16 = new Object[1];
                        c(b10, b11, (short) (b11 | 50), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iAxisFromString, iCombineMeasuredStates, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int iIndexOf2 = 1031 - TextUtils.indexOf("", "");
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                        byte b12 = (byte) ($$b << 2);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(b12, bArr3[5], bArr3[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode, iIndexOf2, pressedStateDuration, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i3 < strArr2.length) {
                    arrayList.add(strArr2[i3]);
                    i3++;
                    int i16 = g + 77;
                    asInterface = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = ~iIdentityHashCode;
        int i22 = i18 + 1271955545 + ((~(335970882 | i21)) * (-560)) + ((~(iIdentityHashCode | 360158938)) * (-560)) + (((~((-91690713) | i21)) | 67502656) * 560);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        int i25 = asInterface + 113;
        g = i25 % 128;
        int i26 = i25 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cBlue = (char) (Color.blue(0) + 29944);
            int i27 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 24;
            byte[] bArr4 = $$a;
            byte b13 = bArr4[3];
            byte b14 = bArr4[5];
            Object[] objArr19 = new Object[1];
            c(b13, b14, (short) (b14 | 102), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cBlue, i27, iIndexOf3, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i28 = asInterface + 77;
            g = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i30 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                byte b15 = (byte) ($$b << 2);
                byte b16 = $$a[5];
                Object[] objArr20 = new Object[1];
                c(b15, b16, (short) (b16 | 50), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(longPressTimeout, jumpTapTimeout, i30, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i31 = ((int[]) objArr21[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i31}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i32 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1113005435);
            int i33 = 1965120341 + ((~((-72619025) | i32)) * 52) + (((~(832809803 | i32)) | (~(620207377 | i32)) | (-905428828)) * (-52)) + (((~(i32 | (-832809804))) | 547588353) * 52) + 2094786525;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).length() + 159, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contact_detail_title).substring(10, 12).length() + 14, new char[]{'\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 83, View.combineMeasuredStates(0, 0) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {556831873};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1725 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 2094786525);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                byte b17 = (byte) ($$b << 2);
                byte b18 = $$a[5];
                Object[] objArr25 = new Object[1];
                c(b17, b18, (short) (b18 | 50), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, scrollBarFadeDuration, iNormalizeMetaState, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).length() + 195, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length() + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 31, new char[]{65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n'}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                char[] cArr = new char[i];
                // fill-array-data instruction
                cArr[0] = 5;
                cArr[1] = 65534;
                cArr[2] = 65534;
                cArr[3] = 6;
                cArr[4] = 2;
                cArr[5] = '\r';
                cArr[6] = 5;
                cArr[7] = 65530;
                cArr[8] = 65534;
                cArr[9] = 65515;
                cArr[10] = 65533;
                cArr[11] = 65534;
                cArr[12] = '\f';
                cArr[13] = '\t';
                cArr[14] = 65530;
                Object[] objArr27 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 165, 15 - Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 114, cArr, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 23;
                    Object[] objArr28 = new Object[1];
                    c((byte) ($$b << 2), $$a[5], (short) 140, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cCombineMeasuredStates, iIndexOf4, capsMode2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
                    byte[] bArr5 = $$a;
                    byte b19 = bArr5[3];
                    byte b20 = bArr5[5];
                    Object[] objArr29 = new Object[1];
                    c(b19, b20, (short) (b20 | 102), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, scrollBarFadeDuration2, iLastIndexOf2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$5f1425da[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i3 < strArr4.length) {
                arrayList2.add(strArr4[i3]);
                i3++;
            }
            throw null;
        }
        int i36 = ((int[]) objArrB$5f1425da[3])[0];
        int i37 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i37}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_not_straight).substring(0, 31).length() + 1018286998;
        int i38 = i36 + (-1144866607) + (((~(71274913 | length)) | 281022042) * 336) + (((~(length | 283877339)) | 68419616) * (-168)) + (((~((~length) | 283877339)) | 71274913) * 168);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr30[3])[0] = i40 ^ (i40 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c3, code lost:
    
        if (r1 != ((((68233472 | r2) * (-374)) + 1045849574) + ((r2 | 37881345) * 374))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c5, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.promo.PromoActivity.g + 41;
        com.bpjstku.presentation.promo.PromoActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d1, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
    
        throw new java.lang.RuntimeException("-693542739");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dd, code lost:
    
        r1 = 1867240770 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r1 == ((((-627089741) + (((~(r6 | (-1359496643))) | (-529509100)) * (-465))) + (((-1359496643) | (~((-529509100) | r6))) * 930)) + ((r6 | (-285737155)) * 465))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0083, code lost:
    
        if (r1 == (((-752284519) + ((~((-142608469) | r6)) * (-783))) + (((~(r6 | (-972703830))) | (-142716287)) * 783))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ~((~((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels) | 106114817);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00af, code lost:
    
        if (r1 != (((1355497662 + (((-309769) | r2) * (-381))) + (((~((~r2) | (-1783937549))) | 1851344229) * 381)) + 118021608)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b1, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.promo.PromoActivity.asInterface + 83;
        com.bpjstku.presentation.promo.PromoActivity.g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bf, code lost:
    
        r1 = 617472574 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r1 == ((((-864906616) + (((~(r4 | (-881459209))) | 51471665) * (-828))) + ((r4 | (-881459209)) * (-828))) - 296216096)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (r1 == (((-1806733070) + (((~((~r4) | 165182048)) | 838927639) * 529)) + (((~(r4 | 165182048)) | 995169591) * 529))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (((~(iIdentityHashCode | (-1601788528))) * TypedValues.CycleType.TYPE_EASING) - 1436588340) + (((~((~iIdentityHashCode) | (-1601788528))) | 536913296) * TypedValues.CycleType.TYPE_EASING)) {
            int i5 = 230735046 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2105129048;
        int i8 = ~i7;
        if (i6 != 1512351330 + (((~((-310197723) | i8)) | (-2026109054)) * (-602)) + (((~(i7 | (-310197723))) | 37488002 | (~((-1753399334) | i8))) * (-301)) + ((~(i8 | (-2026109054))) * 301)) {
            throw new RuntimeException("-1337706652");
        }
        super.onCreate(bundle);
        int i9 = asInterface + 83;
        g = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PromoActivity promoActivity) {
        int i = 2 % 2;
        ((flushLollipops) promoActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BannerRequest());
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final PromoActivity promoActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MultiStateView multiStateView = ((ActivityPromoBinding) ((ViewBinding) promoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPromo;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            str = "loading_show_banners";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            MultiStateView multiStateView2 = ((ActivityPromoBinding) ((ViewBinding) promoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPromo;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            ((FocusMeteringControlExternalSyntheticLambda0) promoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i2 = asInterface + 21;
            g = i2 % 128;
            int i3 = i2 % 2;
            str = "success_show_banners";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = g + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "")) {
                MultiStateView multiStateView3 = ((ActivityPromoBinding) ((ViewBinding) promoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPromo;
                Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, promoActivity.getString(R.string.message_promo), null, new Pair(promoActivity.getString(R.string.action_back), new Function0() { // from class: getCorrectedDisplaySize
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                        int iB = ModuleInstallRequest.b();
                        return (Unit) PromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr, ModuleInstallRequest.b(), 2071431972, -2071431970, ModuleInstallRequest.b(), iB, ModuleInstallRequest.b());
                    }
                }));
            } else {
                MultiStateView multiStateView4 = ((ActivityPromoBinding) ((ViewBinding) promoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPromo;
                Intrinsics.checkNotNullExpressionValue(multiStateView4, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView4, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, promoActivity.getString(R.string.error_error_occured), null, new Pair(promoActivity.getString(R.string.action_retry), new Function0() { // from class: getMaxSizeDisplayInternal
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PromoActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }));
            }
            int i6 = asInterface + 37;
            g = i6 % 128;
            int i7 = i6 % 2;
            str = "failure_show_banners";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i8 = g + 77;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            MultiStateView multiStateView5 = ((ActivityPromoBinding) ((ViewBinding) promoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPromo;
            Intrinsics.checkNotNullExpressionValue(multiStateView5, "");
            multiStateView5.setViewState(MultiStateView.ViewState.EMPTY);
            str = "empty_show_banners";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_show_banners_result", str));
        Intrinsics.checkNotNullParameter(promoActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ FocusMeteringControlExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(final PromoActivity promoActivity) {
        int i = 2 % 2;
        FocusMeteringControlExternalSyntheticLambda0 focusMeteringControlExternalSyntheticLambda0 = new FocusMeteringControlExternalSyntheticLambda0(promoActivity, new ArrayList(), new Function1() { // from class: getPreviewSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Banner) obj);
            }
        });
        int i2 = g + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return focusMeteringControlExternalSyntheticLambda0;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        PromoActivity promoActivity = (PromoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 85;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            promoActivity.d_();
            return Unit.INSTANCE;
        }
        promoActivity.d_();
        int i3 = 92 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PromoActivity promoActivity, Banner banner) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(banner, "");
        PromoActivity promoActivity2 = promoActivity;
        String str = banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(promoActivity2, "");
        Intrinsics.checkNotNullParameter(str, "");
        WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(promoActivity2, str, "");
        String strConcat = "click_promo_".concat(String.valueOf(banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_detail_promo", banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        Intrinsics.checkNotNullParameter(promoActivity, "");
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(strConcat, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(strConcat, mapMutableMapOf);
        Unit unit = Unit.INSTANCE;
        int i2 = g + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(PromoActivity promoActivity) {
        int iB = ModuleInstallRequest.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{promoActivity}, ModuleInstallRequest.b(), 2071431972, -2071431970, ModuleInstallRequest.b(), iB, ModuleInstallRequest.b());
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f620a + 113;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, ModuleInstallRequest.b(), -1216292713, 1216292713, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1994338255, unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ModuleInstallRequest.b());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 1291991563, -2119407454, 2119407455, ModuleInstallRequest.b(), unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), unbindImageCaptureAndRecreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 125;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        b = -83722496;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, short r8, short r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.promo.PromoActivity.$$c
            int r8 = 120 - r8
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r8 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r9 = r9 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoActivity.$$i(short, short, short):java.lang.String");
    }
}
