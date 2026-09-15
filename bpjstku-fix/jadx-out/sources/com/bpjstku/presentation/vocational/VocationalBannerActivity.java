package com.bpjstku.presentation.vocational;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.databinding.ActivityVocationalBannerBinding;
import com.bpjstku.databinding.LayoutVocationCheckElegibilityLoadingBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.vocational.VocationalBannerActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.kennyc.view.MultiStateView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.ensureLogoView;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getRequiredMaxBitDepth;
import defpackage.initSession;
import defpackage.isOnePlus6;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalBannerActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalBannerBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutVocationCheckElegibilityLoadingBinding;", "Lcom/bpjstku/databinding/LayoutVocationCheckElegibilityLoadingBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalBannerActivity extends BindingBaseActivity<ActivityVocationalBannerBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f653a;
    private static char[] asBinder;
    private static long asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: isHuaweiP20Lite
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return (User) VocationalBannerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1854312323, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1854312323, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutVocationCheckElegibilityLoadingBinding TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -59, 10, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 210;
    private static int cancelAll = 1;
    private static int d = 0;
    private static int g = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i4) | i7);
        int i9 = i2 | i8 | (~(i5 | i4));
        int i10 = (~(i4 | i2)) | (~(i7 | i4)) | (~(i7 | i2));
        int i11 = i2 + i5 + i + (1351532378 * i6) + (1237199896 * i3);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i2) + 1314914304 + ((-491389116) * i5) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i) + ((-1818230784) * i6) + ((-914358272) * i3) + ((-2051670016) * i12);
        int i14 = ((i2 * 406040238) - 634933780) + (i5 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i * 406039561) + (i6 * 1283666474) + (i3 * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        VocationalBannerActivity vocationalBannerActivity = (VocationalBannerActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = d + 81;
        g = i17 % 128;
        int i18 = i17 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) vocationalBannerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i19 = d + 35;
        g = i19 % 128;
        int i20 = i19 % 2;
        return userAsBinder;
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
    private static void c(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r0 = com.bpjstku.presentation.vocational.VocationalBannerActivity.$$a
            int r8 = 53 - r8
            int r7 = 144 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalBannerActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    public VocationalBannerActivity() {
        final VocationalBannerActivity vocationalBannerActivity = this;
        this.b = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalBannerActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalBannerActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.vocational.VocationalBannerActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = vocationalBannerActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalBannerBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
        VocationalBannerActivity$bindingInflater$1 vocationalBannerActivity$bindingInflater$1 = VocationalBannerActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            return vocationalBannerActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = g + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = LayoutVocationCheckElegibilityLoadingBinding.bind(((ActivityVocationalBannerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        VocationalBannerActivity vocationalBannerActivity = this;
        Intrinsics.checkNotNullParameter(vocationalBannerActivity, "");
        vocationalBannerActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityVocationalBannerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_vocational_program);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        ((ActivityVocationalBannerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_vocational_program));
        int i4 = g + 83;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityVocationalBannerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnCheckEligibility;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSamsungJ7Api27AboveExcludedSizes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationalBannerActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue()).onTransact.observe(this, new isOnePlus6(this));
        int i2 = d + 27;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 7;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (user != null) {
            PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue();
            String str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = "";
            if (str == null) {
                int i3 = g + 57;
                d = i3 % 128;
                int i4 = i3 % 2;
                str = "";
            }
            String str3 = ((SubscribedProgram) CollectionsKt.first((List) user.INotificationSideChannel)).b;
            if (str3 != null) {
                int i5 = d + 77;
                g = i5 % 128;
                if (i5 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                str2 = str3;
            }
            previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new VocationProfileRequest(str, str2));
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue()).onTransact.observe(this, new isOnePlus6(this));
        int i2 = d + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 51;
            $10 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr2 = {Integer.valueOf(asBinder[i + i5])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 2186 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 41 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 841711447, false, $$i(b, b2, (byte) (b2 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 32969), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3011, (ViewConfiguration.getTapTimeout() >> 16) + 26, 321985076, false, $$i(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 3376 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -968507904, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(asBinder[i / i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myPid() >> 22), View.MeasureSpec.getSize(0) + 2187, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, 841711447, false, $$i(b7, b8, (byte) (b8 + 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33017), KeyEvent.getDeadChar(0, 0) + 3011, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, 321985076, false, $$i(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 36505), 3376 - Drawable.resolveOpacity(0, 0), 17 - TextUtils.getCapsMode("", 0, 0), -968507904, false, $$i(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36506 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 3376 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, -968507904, false, $$i(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
        int i7 = $10 + 123;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = d + 55;
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
            int i4 = g + 121;
            d = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((short) 141, bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, maximumFlingVelocity, scrollBarFadeDuration, 1357589585, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e('0' - AndroidCharacter.getMirror('0'), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_transaction_response).substring(0, 1).codePointAt(0) - 58, (char) (55836 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(22 - (ViewConfiguration.getTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 101, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
            int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((short) 89, bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, jumpTapTimeout, iIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int jumpTapTimeout2 = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr6 = new Object[1];
                c((short) 37, (byte) ($$b >>> 2), $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, packedPositionType, jumpTapTimeout2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_hat_text).substring(0, 4).length() - 868116158;
            int i5 = ~length;
            int i6 = (((1209598562 + ((536955503 | i5) * (-757))) + ((~(829546351 | length)) * 1514)) + (((~(length | (-292590849))) | ((~(i5 | 292675333)) | 536871018)) * 757)) - 2084900028;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_card_number).substring(11, 12).codePointAt(0) + 5, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).length() + 38669), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 46, 16 - KeyEvent.getDeadChar(0, 0), (char) View.MeasureSpec.getMode(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1495144459};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1134 - TextUtils.getOffsetBefore("", 0), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -2084900028, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                    int iMyPid = 15 - (Process.myPid() >> 22);
                    byte[] bArr3 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((short) 141, bArr3[7], bArr3[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration2, keyRepeatDelay, iMyPid, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Drawable.resolveOpacity(0, 0) + 45993), Color.red(0) + 1117, TextUtils.indexOf((CharSequence) "", '0') + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                    Object[] objArr13 = new Object[1];
                    c((short) 37, (byte) ($$b >>> 2), $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, packedPositionType2, bitsPerPixel, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(ViewConfiguration.getPressedStateDuration() >> 16, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).length() + 55834), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(Color.argb(0, 0, 0, 0) + 22, Gravity.getAbsoluteGravity(0, 0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto4_bni).substring(14, 15).codePointAt(0) - 107), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int i9 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((short) 89, bArr4[7], bArr4[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel2, i9, fadingEdgeLength, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                        int size = View.MeasureSpec.getSize(0) + 15;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((short) 141, bArr5[7], bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType3, capsMode, size, 1357589585, false, (String) objArr17[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i12 = d + 113;
                    g = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 107;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = ~iIdentityHashCode;
        int i17 = (~((-428607397) | i16)) | 143393824;
        int i18 = ~(iIdentityHashCode | 469540798);
        int i19 = i13 + (-819997824) + ((i17 | i18) * (-713)) + (i18 * 1426) + ((~(184327226 | i16)) * 713);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        int i22 = d + 49;
        g = i22 % 128;
        if (i22 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                Object[] objArr19 = new Object[1];
                c((short) 37, (byte) 15, $$a[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, scrollDefaultDelay, trimmedLength, 986134021, false, (String) objArr19[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
            int iAxisFromString = MotionEvent.axisFromString("") + 1756;
            int iMyPid2 = (Process.myPid() >> 22) + 23;
            Object[] objArr20 = new Object[1];
            c((short) 37, (byte) 15, $$a[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(threadPriority, iAxisFromString, iMyPid2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr6 = $$a;
                Object[] objArr21 = new Object[1];
                c((short) 89, bArr6[7], bArr6[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionGroup, packedPositionChild, keyRepeatTimeout, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i23 = ((int[]) objArr22[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i23}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i24 = (((950188177 + ((((~(115212677 | iUptimeMillis)) | (-131993014)) | (~(97389748 | iUptimeMillis))) * (-744))) + (((~iUptimeMillis) | 80609412) * 744)) + ((iUptimeMillis | 131993013) * 744)) - 1952547610;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_full_name_empty).substring(19, 20).codePointAt(0) - 60, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_gojek_message).substring(35, 37).length() + 38668), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bni).substring(1, 3).codePointAt(1) - 68, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step4).substring(76, 78).length() + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellCategoryTitle).substring(0, 8).length() - 8), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1495144459};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), (-16775490) - Color.rgb(0, 0, 0), 29 - TextUtils.indexOf("", ""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr25), -1952547610);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                int iAlpha = 1755 - Color.alpha(0);
                int iBlue = Color.blue(0) + 23;
                byte[] bArr7 = $$a;
                Object[] objArr26 = new Object[1];
                c((short) 89, bArr7[7], bArr7[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb, iAlpha, iBlue, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).codePointAt(4) - 80, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 55824), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(Color.rgb(0, 0, 0) + 16777238, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 31, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca2).substring(15, 16).codePointAt(0) - 32), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char jumpTapTimeout3 = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr8 = $$a;
                    short s = bArr8[7];
                    Object[] objArr29 = new Object[1];
                    c(s, (byte) s, bArr8[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(jumpTapTimeout3, iMakeMeasureSpec, offsetBefore, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                    int iRed = Color.red(0) + 1755;
                    int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                    Object[] objArr30 = new Object[1];
                    c((short) 37, (byte) 15, $$a[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(longPressTimeout, iRed, iNormalizeMetaState, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i27 = ((int[]) objArrB$5f1425da[1])[0];
        int i28 = ((int[]) objArrB$5f1425da[0])[0];
        if (i28 == i27) {
            int i29 = ((int[]) objArrB$5f1425da[3])[0];
            int i30 = ((int[]) objArrB$5f1425da[0])[0];
            Object[] objArr31 = {new int[]{i30}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i32 = ~((-323581787) | i31);
            int i33 = 921620861 + ((34169088 | i32) * (-280)) + ((i32 | (~(110979360 | i31))) * 140);
            int i34 = ~((-289412699) | i31);
            int i35 = ~i31;
            int i36 = i29 + i33 + (((~(i35 | 400392058)) | i34 | (~((-34169089) | i35))) * 140);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr31[3])[0] = i38 ^ (i38 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrB$5f1425da[4];
        if (strArr4 != null) {
            int i39 = 0;
            while (i39 < strArr4.length) {
                arrayList2.add(strArr4[i39]);
                i39++;
                int i40 = g + 55;
                d = i40 % 128;
                int i41 = i40 % 2;
            }
        }
        Toast.makeText((Context) null, i28 / (((i28 - 1) * i28) % 2), 0).show();
        int i42 = ((int[]) objArrB$5f1425da[3])[0];
        int i43 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr32 = {new int[]{i43}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i44 = ~(((int) Runtime.getRuntime().totalMemory()) | 112454872);
        int i45 = i42 + 1566407515 + (((-100147554) | i44) * (-220)) + ((i44 | (-133950970)) * 220) + 1787979134;
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr32[3])[0] = i47 ^ (i47 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        VocationalBannerActivity vocationalBannerActivity = (VocationalBannerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 5;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i4 != 2007683688 + ((1384688475 | iMyPid) * 376) + (((~((~iMyPid) | 834346210)) | 1107338009) * (-376)) + (((~(iMyPid | (-834346211))) | (-1664333754)) * 376)) {
            throw new RuntimeException("-1684613820");
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyUid = Process.myUid();
        if (i5 != (-2100845368) + (((~((~iMyUid) | (-17178635))) | (~((-1920992421) | iMyUid))) * (-302)) + ((~((-17178635) | iMyUid)) * (-604)) + (((~(iMyUid | (-1938171055))) | (-2143252144)) * 302)) {
            throw null;
        }
        super.onResume();
        int i6 = g + 123;
        d = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ba, code lost:
    
        if (r1 != ((((-1622509944) + (((~(1975126937 | r4)) | 259215606) * (-90))) + (((~(1975126937 | r2)) | 1887963913) * (-45))) + ((((~(r2 | (-259215607))) | 1975126937) | (~(r4 | 259215606))) * 45))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bc, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.vocational.VocationalBannerActivity.g + 21;
        com.bpjstku.presentation.vocational.VocationalBannerActivity.d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d1, code lost:
    
        throw new java.lang.RuntimeException("-1000590760");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0059, code lost:
    
        if (r1 == (((183490024 + ((((~((-810191732) | r5)) | 268994865) | (~(1640179274 | r5))) * (-1136))) + ((((~((-810191732) | r4)) | (~(1640179274 | r4))) | (~((-1098982409) | r5))) * (-568))) + (((~(r4 | (-268994866))) | ((~(r5 | (-1640179275))) | (~(810191731 | r5)))) * 568))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0083, code lost:
    
        if (r1 == ((857507822 + (((~(973402154 | r4)) | (-143414612)) * (-983))) + (((~(r4 | (-143414612))) | 134500354) * 983))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0085, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = android.os.Process.myUid();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalBannerActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 45;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = ~((-268972049) | elapsedCpuTime);
            int i5 = ~elapsedCpuTime;
            if (i3 != (-1745625752) + ((i4 | (~(i5 | 2046820087))) * 920) + (((~((-947860497) | i5)) | 268972048) * 920) + (((~(elapsedCpuTime | 2046820087)) | (~((-268972049) | i5)) | (~((-678888449) | elapsedCpuTime))) * 920)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1684380449;
            if (i6 != (((-1134047304) + (((~length) | 285741097) * 1324)) + (((~(length | (-1720101649))) | (~(890114105 | length))) * (-1324))) - 60030620) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i8 = ~iMaxMemory;
        if (i7 != (-1622509944) + (((~(1939606202 | i8)) | 223694871) * (-90)) + (((~(1939606202 | iMaxMemory)) | 1921518248) * (-45)) + (((~(iMaxMemory | (-223694872))) | 1939606202 | (~(i8 | 223694871))) * 45)) {
            int i9 = d + 83;
            g = i9 % 128;
            int i10 = i9 % 2;
            int[] iArr = new int[591765756];
            iArr[591765755] = 1;
            int i11 = (-238135532) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i12 = g + 27;
            d = i12 % 128;
            int i13 = i12 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(VocationalBannerActivity vocationalBannerActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            VocationalCheckEligibilityActivity.Companion companion = VocationalCheckEligibilityActivity.INSTANCE;
            VocationalCheckEligibilityActivity.Companion.b(vocationalBannerActivity);
            vocationalBannerActivity.finish();
            return Unit.INSTANCE;
        }
        VocationalCheckEligibilityActivity.Companion companion2 = VocationalCheckEligibilityActivity.INSTANCE;
        VocationalCheckEligibilityActivity.Companion.b(vocationalBannerActivity);
        vocationalBannerActivity.finish();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(VocationalBannerActivity vocationalBannerActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = g + 107;
        int i3 = i2 % 128;
        d = i3;
        LayoutVocationCheckElegibilityLoadingBinding layoutVocationCheckElegibilityLoadingBinding = null;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MultiStateView multiStateView = ((ActivityVocationalBannerBinding) ((ViewBinding) vocationalBannerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvEligibility;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            LayoutVocationCheckElegibilityLoadingBinding layoutVocationCheckElegibilityLoadingBinding2 = vocationalBannerActivity.TuitionPaymentFragmentbindingInflater1;
            if (layoutVocationCheckElegibilityLoadingBinding2 == null) {
                int i4 = g + 45;
                d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                layoutVocationCheckElegibilityLoadingBinding = layoutVocationCheckElegibilityLoadingBinding2;
            }
            TextView textView = layoutVocationCheckElegibilityLoadingBinding.tvCheckEligibilitasLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                VocationalRegisteredParticipantActivity.Companion companion = VocationalRegisteredParticipantActivity.INSTANCE;
                VocationalRegisteredParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(vocationalBannerActivity);
                vocationalBannerActivity.finish();
                return;
            }
            return;
        }
        int i6 = i3 + 115;
        g = i6 % 128;
        int i7 = i6 % 2;
        MultiStateView multiStateView2 = ((ActivityVocationalBannerBinding) ((ViewBinding) vocationalBannerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvEligibility;
        Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
        multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalBannerActivity vocationalBannerActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (User) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1854312323, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1854312323, new Object[]{vocationalBannerActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    static {
        f653a = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 13;
        f653a = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater2, -147103144, ensureLogoView.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 147103145, new Object[]{this}, iTuitionPaymentFragmentbindingInflater3)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 71;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step6).substring(28, 29).length() + 312952570;
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater1, -314072356, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), length, 314072358, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 57;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = d + 79;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    static void g() {
        asBinder = new char[]{27622, 14769, 53075, 40189, 8840, 61526, 34291, 11201, 63784, 36588, 23769, 57884, 47070, 17804, 60195, 47306, 20074, 7196, 41435, 30560, 1284, 43732, 45561, 58280, 5453, 18148, 63631, 10817, 24552, 61862, 9017, 21733, 34432, 14368, 28117, 40841, 12585, 9976, 29867, 33364, 53755, 28636, 48454, 51427, 26260, 46133, 50084, 4529, 44835, 64193, 2206, 42535, 62935, 45557, 58272, 5449, 18170, 63624, 10829, 24568, 61837, 8980, 21733, 34463, 14396, 28159, 40843, 12584, 25297};
        asInterface = 5886684093998883780L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 93;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 61;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_vocational_banner);
        }
        int i5 = 70 / 0;
        return Integer.valueOf(R.layout.activity_vocational_banner);
    }

    private static String $$i(byte b, short s, byte b2) {
        int i = b * 3;
        byte[] bArr = $$c;
        int i2 = 115 - (b2 * 3);
        int i3 = 4 - (s * 4);
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = i3 + i4;
            i3++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i5 = i6;
            i2 = bArr[i3] + i7;
            i3++;
        }
    }
}
