package com.bpjstku.presentation.vocational;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.vocation.model.request.DataSurveyRequest;
import com.bpjstku.data.vocation.model.request.SaveSurveyRequest;
import com.bpjstku.databinding.ActivityVocationalRatingBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.vocation.model.VocationProfile;
import com.bpjstku.presentation.vocational.VocationalRatingActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.Scopes;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.ActivityResultContractSynchronousResult;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.ConstantObservable;
import defpackage.OutputSizesCorrector;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.PreviewOrientationIncorrectQuirk;
import defpackage.TorchFlashRequiredFor3aUpdateQuirk;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getHuaweiP20LiteExcludedSizes;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.setQuickZoomEnabled;
import defpackage.setVideoStabilizationMode;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0015\u0010\u0015\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRatingActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalRatingBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LOutputSizesCorrector;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/vocation/model/VocationProfile;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalRatingActivity extends BindingBaseActivity<ActivityVocationalRatingBinding> {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: ImageCaptureFailedForVideoSnapshotQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: ImageCaptureFailWithAutoFlashQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            return (VocationProfile) VocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1462046987, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), objArr, ScholarshipHistoryRequest.b(), -1462046984);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, -108, 100, 114, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 243;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f655a = 0;
    private static int asInterface = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i3 | i8 | i6)) | (~(i7 | i)) | (~(i10 | i7));
        int i14 = i6 + i + i4 + ((-1336646162) * i2) + (1706069763 * i5);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-1709230891)) - 203685888) + ((-1709230891) * i) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i4) + ((-602931200) * i2) + ((-1331167232) * i5) + ((-1604583424) * i15);
        int i17 = ((i6 * 112646815) - 831444653) + (i * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i4 * 112647075) + (i2 * (-2078048118)) + (i5 * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i19 = 2 % 2;
        int i20 = f655a + 121;
        int i21 = i20 % 128;
        asInterface = i21;
        int i22 = i20 % 2;
        int i23 = i21 + 53;
        f655a = i23 % 128;
        int i24 = i23 % 2;
        return Integer.valueOf(R.layout.activity_vocational_rating);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.vocational.VocationalRatingActivity.$$a
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRatingActivity.c(short, int, byte, java.lang.Object[]):void");
    }

    public VocationalRatingActivity() {
        final VocationalRatingActivity vocationalRatingActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalRatingActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalRatingActivity;
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
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalRatingActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRatingActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/vocation/model/VocationProfile;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/domain/vocation/model/VocationProfile;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, VocationProfile p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VocationalRatingActivity.class, new Pair[]{TuplesKt.to(Scopes.PROFILE, p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalRatingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f655a + 53;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            VocationalRatingActivity$bindingInflater$1 vocationalRatingActivity$bindingInflater$1 = VocationalRatingActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VocationalRatingActivity$bindingInflater$1 vocationalRatingActivity$bindingInflater$2 = VocationalRatingActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = asInterface + 73;
        f655a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 71 / 0;
        }
        return vocationalRatingActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        VocationalRatingActivity vocationalRatingActivity = this;
        Intrinsics.checkNotNullParameter(vocationalRatingActivity, "");
        vocationalRatingActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityVocationalRatingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_rate);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        RecyclerView recyclerView = ((ActivityVocationalRatingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvVocationalRating;
        VocationalRatingActivity vocationalRatingActivity2 = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(vocationalRatingActivity2));
        recyclerView.addItemDecoration(new DividerItemDecoration(vocationalRatingActivity2, 1));
        recyclerView.setAdapter((OutputSizesCorrector) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        int i2 = f655a + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        a();
        Button button = ((ActivityVocationalRatingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSendSurvey;
        Intrinsics.checkNotNullExpressionValue(button, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button, new Function0() { // from class: isHuaweiPSmart
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VocationalRatingActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        int i2 = f655a + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        VocationalRatingActivity vocationalRatingActivity = this;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentbindingInflater1.getValue()).asBinder.observe(vocationalRatingActivity, new Observer() { // from class: isPixel4XLApi29
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj};
                VocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1956963418, ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), ScholarshipHistoryRequest.b(), objArr, ScholarshipHistoryRequest.b(), 1956963418);
            }
        });
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentbindingInflater1.getValue()).notify.observe(vocationalRatingActivity, new Observer() { // from class: isBluStudioX10
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asInterface + 29;
        f655a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f655a + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = f655a + 81;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f655a + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = f655a + 71;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = f655a + 61;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr2;
        int i = 0;
        VocationalRatingActivity vocationalRatingActivity = (VocationalRatingActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int mode = 1755 - View.MeasureSpec.getMode(0);
            int i3 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) 37, bArr[5], bArr[28], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, mode, i3, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                int i4 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b = (byte) 52;
                Object[] objArr4 = new Object[1];
                c(b, (short) (b & 239), $$a[28], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, offsetBefore, i4, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr5[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iMyUid = Process.myUid();
            int i6 = (((~(iMyUid | (-97738825))) * TypedValues.CycleType.TYPE_EASING) - 1382397231) + (((~((~iMyUid) | (-97738825))) | 304877186) * TypedValues.CycleType.TYPE_EASING) + 1156672280;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i8 ^ (i8 << 5);
            int i9 = asInterface + 119;
            f655a = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr6 = new Object[1];
            e(new int[]{0, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new int[]{16, 16, 131, 0}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, vocationalRatingActivity)).intValue();
            try {
                Object[] objArr8 = {-308779664};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 42050), 1726 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - View.MeasureSpec.getMode(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 1156672280, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                    int iGreen = Color.green(0) + 1755;
                    int iAxisFromString = 22 - MotionEvent.axisFromString("");
                    byte b2 = (byte) 52;
                    Object[] objArr9 = new Object[1];
                    c(b2, (short) (b2 & 239), $$a[28], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iGreen, iAxisFromString, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new int[]{32, 22, 165, 15}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new int[]{54, 15, 11, 6}, false, new byte[]{0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                        Object[] objArr12 = new Object[1];
                        c((byte) 52, (short) 88, $$a[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, i11, i12, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                        int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((byte) 37, bArr2[5], bArr2[28], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, packedPositionType, minimumFlingVelocity, 986134021, false, (String) objArr13[0], null);
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
        int i13 = ((int[]) objArrB$7879113[1])[0];
        int i14 = ((int[]) objArrB$7879113[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                while (i < strArr.length) {
                    arrayList.add(strArr[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i15 = ((int[]) objArrB$7879113[3])[0];
        int i16 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr14 = {new int[]{i16}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i17 = 1359388895 + (((-265557599) | startElapsedRealtime) * 614);
        int i18 = ~startElapsedRealtime;
        int i19 = i15 + i17 + (((~((-778760910) | i18)) | 539680897 | (~((-566158484) | i18))) * (-1228)) + (((~(i18 | (-26477587))) | (~((-239080013) | i18))) * 614);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr14[3])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mode2 = (char) View.MeasureSpec.getMode(0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr15 = new Object[1];
            c((byte) 52, (short) 140, $$a[28], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode2, iIndexOf, scrollBarFadeDuration, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{32, 22, 165, 15}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{54, 15, 11, 6}, false, new byte[]{0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
            int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b3 = (byte) 52;
            Object[] objArr18 = new Object[1];
            c(b3, (short) (b3 & 239), $$a[28], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, threadPriority, iMakeMeasureSpec, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i22 = f655a + 9;
            asInterface = i22 % 128;
            int i23 = i22 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char mode3 = (char) View.MeasureSpec.getMode(0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                int iAxisFromString2 = 14 - MotionEvent.axisFromString("");
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr19 = new Object[1];
                c(b5, (short) (b5 | 192), b4, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mode3, touchSlop, iAxisFromString2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr20[3])[0];
            int i25 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i26 = ~(((int) SystemClock.elapsedRealtime()) | 178696977);
            int i27 = ((((156109641 | i26) * (-658)) - 1375525893) + ((i26 | 21497928) * 658)) - 714316053;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{0, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{16, 16, 131, 0}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, vocationalRatingActivity)).intValue();
            Object[] objArr23 = {-308779664};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Color.green(0)), 1134 - ExpandableListView.getPackedPositionGroup(0L), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -714316053, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i30 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                int iAxisFromString3 = MotionEvent.axisFromString("") + 16;
                Object[] objArr25 = new Object[1];
                c((byte) 52, (short) 140, $$a[28], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(minimumFlingVelocity2, i30, iAxisFromString3, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName("") + 45994), ExpandableListView.getPackedPositionChild(0L) + 1118, (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr26 = new Object[1];
                c(b7, (short) (b7 | 192), b6, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, iResolveOpacity, fadingEdgeLength, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{32, 22, 165, 15}, false, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{54, 15, 11, 6}, false, new byte[]{0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iGreen2 = Color.green(0) + 15;
                    byte b8 = (byte) 52;
                    Object[] objArr29 = new Object[1];
                    c(b8, (short) (b8 & 239), $$a[28], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionGroup, longPressTimeout, iGreen2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                    int size = View.MeasureSpec.getSize(0) + 15;
                    Object[] objArr30 = new Object[1];
                    c((byte) 52, (short) 140, $$a[28], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, iArgb, size, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr2[1])[0];
        int i32 = ((int[]) objArr2[3])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                while (i < strArr3.length) {
                    arrayList2.add(strArr3[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i33 = ((int[]) objArr2[2])[0];
        int i34 = ((int[]) objArr2[3])[0];
        int i35 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
        int i36 = ~startElapsedRealtime2;
        int i37 = i33 + 500751287 + (((~((-348312218) | i36)) | (~(104032047 | startElapsedRealtime2))) * 217) + (((~(startElapsedRealtime2 | (-348312218))) | 281055376) * 217) + (((~(104032047 | i36)) | 348312217) * 217);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0146 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:9:0x0030, B:11:0x003e, B:12:0x0075, B:15:0x0088, B:17:0x0097, B:18:0x00d6, B:37:0x012e, B:39:0x0146, B:40:0x017e, B:49:0x01ff, B:51:0x020c, B:53:0x0252, B:43:0x0195, B:45:0x01ae, B:46:0x01ec), top: B:79:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x018e  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ae A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:9:0x0030, B:11:0x003e, B:12:0x0075, B:15:0x0088, B:17:0x0097, B:18:0x00d6, B:37:0x012e, B:39:0x0146, B:40:0x017e, B:49:0x01ff, B:51:0x020c, B:53:0x0252, B:43:0x0195, B:45:0x01ae, B:46:0x01ec), top: B:79:0x0030 }] */
    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i9 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 77;
                $11 = i11 % 128;
                if (i11 % i == 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i3] = Integer.valueOf(cArr2[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b = (byte) i9;
                            byte b2 = (byte) (b & 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + i5), 1270 - Color.blue(i3), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 407021364, false, $$i(b, b2, (byte) (b2 - 5)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 & 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1269 - TextUtils.lastIndexOf("", '0', 0, 0), 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 407021364, false, $$i(b3, b4, (byte) (b4 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i = 2;
                i3 = 0;
                i5 = 1;
                i9 = -1;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr != null) {
            int i12 = $10 + 37;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                int i14 = $11 + 87;
                $10 = i14 % 128;
                if (i14 % 2 == 0) {
                    c = 1;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i15 = setvideostabilizationmode.b;
                        char c3 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr4 = new Object[2];
                        objArr4[c] = Integer.valueOf(c2);
                        objArr4[0] = Integer.valueOf(c3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 3225, 12 - ImageFormat.getBitsPerPixel(0), 2133916302, false, $$i(b5, (byte) (b5 & 6), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                    } else {
                        int i16 = setvideostabilizationmode.b;
                        Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1755;
                            int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iIndexOf2, 387247676, false, $$i((byte) (-1), length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                    }
                } else if (bArr[setvideostabilizationmode.b] == 0) {
                    c = 1;
                    int i17 = setvideostabilizationmode.b;
                    char c4 = cArr4[setvideostabilizationmode.b];
                    Object[] objArr6 = new Object[2];
                    objArr6[c] = Integer.valueOf(c2);
                    objArr6[0] = Integer.valueOf(c4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b6 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 3225, 12 - ImageFormat.getBitsPerPixel(0), 2133916302, false, $$i(b6, (byte) (b6 & 6), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).charValue();
                } else {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr7 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                        int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 1755;
                        int iIndexOf4 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, iIndexOf3, iIndexOf4, 387247676, false, $$i((byte) (-1), length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr7)).charValue();
                }
                c2 = cArr5[setvideostabilizationmode.b];
                Object[] objArr8 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41242), 1705 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21, -1434471773, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i19 = i6 - i8;
            System.arraycopy(cArr6, 0, cArr4, i19, i8);
            System.arraycopy(cArr6, i8, cArr4, 0, i19);
        }
        if (z) {
            int i20 = $11 + 13;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                cArr[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i21 = 0;
            while (true) {
                setvideostabilizationmode.b = i21;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i21 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        f655a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i6 = (~(1072176195 | i5)) | 491820;
        int i7 = ~((~i5) | (-830479364));
        if (i4 != (-598832144) + ((i6 | i7) * (-470)) + (((~(i5 | 1072668015)) | i7) * 470)) {
            throw new RuntimeException("-1861958054");
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        if (i8 != 940128704 + (((~((~i9) | (-554700833))) | (~(2138488063 | i9))) * (-302)) + ((~((-554700833) | i9)) * (-604)) + (((~(i9 | 1583787231)) | 1143219330) * 302)) {
            throw null;
        }
        super.onResume();
        int i10 = asInterface + 113;
        f655a = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        f655a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1884155095;
        if (i4 != 994155036 + (((~(1715012836 | i5)) | (-885025294)) * (-964)) + (((~((~i5) | 1715012836)) | (-1996058350)) * (-964))) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i7 = ~iMyUid;
        if (i6 != (-1166867536) + (((~(i7 | 1635236436)) | 943819528) * (-1042)) + ((1635236436 | iMyUid) * 521) + (((~(iMyUid | (-943819529))) | 541166080 | (~(i7 | 2037889884))) * 521)) {
            throw null;
        }
        super.onStart();
        int i8 = f655a + 5;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 89 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f655a + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step1).substring(92, 93).length() - 4592581;
        if (i4 != (-1016429650) + (((~((~length) | (-972628031))) | (-1802615574)) * (-235)) + (((~((-972628031) | length)) | (-1802615574)) * (-470)) + (((~(length | (-695279637))) | (-2079963968)) * 235)) {
            throw null;
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i7 = ~i6;
        if (i5 != 2029252593 + (((~((-1021930160) | i7)) | 1557125805) * (-602)) + (((~(i6 | (-1021930160))) | 482953901 | (~(2096102063 | i7))) * (-301)) + ((~(i7 | 1557125805)) * 301)) {
            int i8 = (-1398732646) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = f655a + 121;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ Unit b(VocationalRatingActivity vocationalRatingActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        f655a = i2 % 128;
        if (i2 % 2 != 0) {
            vocationalRatingActivity.finish();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        vocationalRatingActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        int i3 = f655a + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationalRatingActivity vocationalRatingActivity) {
        int i = 2 % 2;
        int i2 = f655a + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) vocationalRatingActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit = Unit.INSTANCE;
        int i4 = f655a + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((!(r14 instanceof VirtualCameraAdapter1.asBinder)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r8 = ((com.bpjstku.databinding.ActivityVocationalRatingBinding) ((androidx.viewbinding.ViewBinding) r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvRating;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        defpackage.Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r14).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, r1.getString(com.bpjstku.R.string.error_error_occured), null, new kotlin.Pair(r1.getString(com.bpjstku.R.string.action_retry), new defpackage.isUniSocChipsetDevice(r1)));
        r14 = com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface + 71;
        com.bpjstku.presentation.vocational.VocationalRatingActivity.f655a = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r4 = r4 + 117;
        com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface = r4 % 128;
        r4 = r4 % 2;
        r0 = ((com.bpjstku.databinding.ActivityVocationalRatingBinding) ((androidx.viewbinding.ViewBinding) r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvRating;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0.setViewState(com.kennyc.view.MultiStateView.ViewState.CONTENT);
        ((defpackage.OutputSizesCorrector) r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((java.util.List) ((VirtualCameraAdapter1.asBinder) r14).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        r14 = ((com.bpjstku.databinding.ActivityVocationalRatingBinding) ((androidx.viewbinding.ViewBinding) r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvRating;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "");
        r14.setViewState(com.kennyc.view.MultiStateView.ViewState.LOADING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if ((r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((!(r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r14) {
        /*
            r0 = 0
            r1 = r14[r0]
            com.bpjstku.presentation.vocational.VocationalRatingActivity r1 = (com.bpjstku.presentation.vocational.VocationalRatingActivity) r1
            r2 = 1
            r14 = r14[r2]
            VirtualCameraAdapter1 r14 = (defpackage.VirtualCameraAdapter1) r14
            r3 = 2
            int r4 = r3 % r3
            int r4 = com.bpjstku.presentation.vocational.VocationalRatingActivity.f655a
            int r5 = r4 + 69
            int r6 = r5 % 128
            com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface = r6
            int r5 = r5 % r3
            r6 = 0
            java.lang.String r7 = ""
            if (r5 != 0) goto L23
            boolean r5 = r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r8 = 59
            int r8 = r8 / r0
            if (r5 == 0) goto L28
            goto L98
        L23:
            boolean r0 = r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r0 = r0 ^ r2
            if (r0 == 0) goto L98
        L28:
            boolean r0 = r14 instanceof VirtualCameraAdapter1.asBinder
            r0 = r0 ^ r2
            if (r0 == 0) goto L6b
            boolean r0 = r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r0 == 0) goto L6a
            kotlin.Lazy r0 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r0 = r0.getValue()
            androidx.viewbinding.ViewBinding r0 = (androidx.viewbinding.ViewBinding) r0
            com.bpjstku.databinding.ActivityVocationalRatingBinding r0 = (com.bpjstku.databinding.ActivityVocationalRatingBinding) r0
            com.kennyc.view.MultiStateView r8 = r0.msvRating
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r14 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r14
            java.lang.Throwable r9 = r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r14 = 2132017684(0x7f140214, float:1.9673653E38)
            java.lang.String r11 = r1.getString(r14)
            r14 = 2132017286(0x7f140086, float:1.9672846E38)
            java.lang.String r14 = r1.getString(r14)
            isUniSocChipsetDevice r0 = new isUniSocChipsetDevice
            r0.<init>()
            kotlin.Pair r13 = new kotlin.Pair
            r13.<init>(r14, r0)
            r10 = 0
            r12 = 0
            defpackage.Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8, r9, r10, r11, r12, r13)
            int r14 = com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface
            int r14 = r14 + 71
            int r0 = r14 % 128
            com.bpjstku.presentation.vocational.VocationalRatingActivity.f655a = r0
            int r14 = r14 % r3
        L6a:
            return r6
        L6b:
            int r4 = r4 + 117
            int r0 = r4 % 128
            com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface = r0
            int r4 = r4 % r3
            kotlin.Lazy r0 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r0 = r0.getValue()
            androidx.viewbinding.ViewBinding r0 = (androidx.viewbinding.ViewBinding) r0
            com.bpjstku.databinding.ActivityVocationalRatingBinding r0 = (com.bpjstku.databinding.ActivityVocationalRatingBinding) r0
            com.kennyc.view.MultiStateView r0 = r0.msvRating
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            com.kennyc.view.MultiStateView$ViewState r2 = com.kennyc.view.MultiStateView.ViewState.CONTENT
            r0.setViewState(r2)
            kotlin.Lazy r0 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Object r0 = r0.getValue()
            OutputSizesCorrector r0 = (defpackage.OutputSizesCorrector) r0
            VirtualCameraAdapter1$asBinder r14 = (VirtualCameraAdapter1.asBinder) r14
            T r14 = r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.List r14 = (java.util.List) r14
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r14)
            return r6
        L98:
            kotlin.Lazy r14 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r14 = r14.getValue()
            androidx.viewbinding.ViewBinding r14 = (androidx.viewbinding.ViewBinding) r14
            com.bpjstku.databinding.ActivityVocationalRatingBinding r14 = (com.bpjstku.databinding.ActivityVocationalRatingBinding) r14
            com.kennyc.view.MultiStateView r14 = r14.msvRating
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r7)
            com.kennyc.view.MultiStateView$ViewState r0 = com.kennyc.view.MultiStateView.ViewState.LOADING
            r14.setViewState(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRatingActivity.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return (com.bpjstku.domain.vocation.model.VocationProfile) r4.getParcelableExtra(com.google.android.gms.common.Scopes.PROFILE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4 = com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface + 29;
        com.bpjstku.presentation.vocational.VocationalRatingActivity.f655a = r4 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            com.bpjstku.presentation.vocational.VocationalRatingActivity r4 = (com.bpjstku.presentation.vocational.VocationalRatingActivity) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface
            int r2 = r2 + 89
            int r3 = r2 % 128
            com.bpjstku.presentation.vocational.VocationalRatingActivity.f655a = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L1d
            android.content.Intent r4 = r4.getIntent()
            r2 = 83
            int r2 = r2 / r0
            if (r4 == 0) goto L2c
            goto L23
        L1d:
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L2c
        L23:
            java.lang.String r0 = "profile"
            android.os.Parcelable r4 = r4.getParcelableExtra(r0)
            com.bpjstku.domain.vocation.model.VocationProfile r4 = (com.bpjstku.domain.vocation.model.VocationProfile) r4
            return r4
        L2c:
            int r4 = com.bpjstku.presentation.vocational.VocationalRatingActivity.asInterface
            int r4 = r4 + 29
            int r0 = r4 % 128
            com.bpjstku.presentation.vocational.VocationalRatingActivity.f655a = r0
            int r4 = r4 % r1
            r0 = 0
            if (r4 != 0) goto L39
            return r0
        L39:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(VocationalRatingActivity vocationalRatingActivity) {
        int i = 2 % 2;
        int i2 = f655a + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        VocationProfile vocationProfile = (VocationProfile) vocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (vocationProfile != null) {
            String str = vocationProfile.d;
            String str2 = vocationProfile.notify;
            String str3 = vocationProfile.onTransact;
            String str4 = vocationProfile.RemoteActionCompatParcelizer;
            Iterable iterable = ((OutputSizesCorrector) vocationalRatingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            Iterable<ActivityResultContractSynchronousResult> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (ActivityResultContractSynchronousResult activityResultContractSynchronousResult : iterable2) {
                arrayList.add(new DataSurveyRequest(activityResultContractSynchronousResult.b, activityResultContractSynchronousResult.TuitionPaymentFragmentbindingInflater1, String.valueOf(activityResultContractSynchronousResult.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                int i4 = asInterface + 85;
                f655a = i4 % 128;
                int i5 = i4 % 2;
            }
            SaveSurveyRequest saveSurveyRequest = new SaveSurveyRequest(arrayList, str, str2, str3, str4);
            PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) vocationalRatingActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            Intrinsics.checkNotNullParameter(saveSurveyRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.notify;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(saveSurveyRequest)));
            final PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk = new PreviewOrientationIncorrectQuirk(previewDelayWhenVideoCaptureIsBoundQuirk);
            logToString logtostring = new logToString() { // from class: isHuaweiP8Lite
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    previewOrientationIncorrectQuirk.invoke(obj);
                }
            };
            final TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = new TorchFlashRequiredFor3aUpdateQuirk(previewDelayWhenVideoCaptureIsBoundQuirk);
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isSamsungSMA920F
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    torchFlashRequiredFor3aUpdateQuirk.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i6 = f655a + 99;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = f655a + 55;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ OutputSizesCorrector TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalRatingActivity vocationalRatingActivity) {
        int i = 2 % 2;
        OutputSizesCorrector outputSizesCorrector = new OutputSizesCorrector(vocationalRatingActivity, null, null, 6, null);
        int i2 = f655a + 49;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return outputSizesCorrector;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final VocationalRatingActivity vocationalRatingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = f655a + 45;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            vocationalRatingActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = i3 + 3;
                f655a = i5 % 128;
                if (i5 % 2 == 0) {
                    vocationalRatingActivity.IconCompatParcelizer();
                    return;
                } else {
                    vocationalRatingActivity.IconCompatParcelizer();
                    throw null;
                }
            }
            return;
        }
        vocationalRatingActivity.IconCompatParcelizer();
        getHuaweiP20LiteExcludedSizes gethuaweip20liteexcludedsizes = new getHuaweiP20LiteExcludedSizes(null, vocationalRatingActivity.getString(R.string.label_message_rating_success), null, new Function0() { // from class: ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VocationalRatingActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }, 5, null);
        FragmentManager supportFragmentManager = vocationalRatingActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(gethuaweip20liteexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i6 = asInterface + 17;
            f655a = i6 % 128;
            if (i6 % 2 == 0) {
                gethuaweip20liteexcludedsizes.show(supportFragmentManager, gethuaweip20liteexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                gethuaweip20liteexcludedsizes.show(supportFragmentManager, gethuaweip20liteexcludedsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i7 = 63 / 0;
            }
        }
    }

    public static /* synthetic */ void b(VocationalRatingActivity vocationalRatingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = ScholarshipHistoryRequest.b();
        int iB2 = ScholarshipHistoryRequest.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1956963418, ScholarshipHistoryRequest.b(), iB, iB2, new Object[]{vocationalRatingActivity, virtualCameraAdapter1}, ScholarshipHistoryRequest.b(), 1956963418);
    }

    public static /* synthetic */ VocationProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalRatingActivity vocationalRatingActivity) {
        int iB = ScholarshipHistoryRequest.b();
        int iB2 = ScholarshipHistoryRequest.b();
        return (VocationProfile) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1462046987, ScholarshipHistoryRequest.b(), iB, iB2, new Object[]{vocationalRatingActivity}, ScholarshipHistoryRequest.b(), -1462046984);
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 5;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iB = ScholarshipHistoryRequest.b();
        int length = 155456613 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_transaction_response).substring(0, 1).length();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-825671604, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), iB, length, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step6).substring(20, 21).codePointAt(0) + 1871711179, 825671606)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        f655a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f655a + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f655a + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = f655a + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(1357644851, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step5).substring(1, 7).codePointAt(2) - 2057210825, ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, context}, ScholarshipHistoryRequest.b(), -1357644850);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59773, 59874, 59884, 59879, 59903, 59898, 59898, 59890, 59880, 59868, 59878, 59899, 59859, 59863, 59879, 59884, 59746, 59896, 59421, 59902, 59886, 59392, 59408, 59411, 59418, 59397, 59894, 59895, 59417, 59397, 59399, 59392, 59399, 59397, 59419, 59422, 59418, 59392, 59709, 59770, 59760, 59762, 59773, 59775, 59771, 59768, 59770, 59768, 59767, 59772, 59748, 59757, 59757};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = 105 - r7
            int r6 = r6 + 4
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalRatingActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRatingActivity.$$i(byte, int, short):java.lang.String");
    }
}
