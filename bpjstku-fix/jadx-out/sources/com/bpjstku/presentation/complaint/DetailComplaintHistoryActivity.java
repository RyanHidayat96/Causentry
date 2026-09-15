package com.bpjstku.presentation.complaint;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.bpjstku.data.complaint.model.request.ComplaintDetailRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityDetailComplaintHistoryBinding;
import com.bpjstku.domain.complaint.model.ComplaintDetail;
import com.bpjstku.domain.complaint.model.ComplaintHistory;
import com.bpjstku.domain.complaint.model.DetailPerusahaanBelumTerdaftar;
import com.bpjstku.domain.complaint.model.TrackingComplaint;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_common.zzin;
import com.google.android.material.button.MaterialButton;
import defpackage.AutoValue_CameraState_StateError;
import defpackage.BufferProviderState;
import defpackage.Camera2InteropExtender;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TorchStateReset;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addStateSet;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setDither;
import defpackage.setEnterFadeDuration;
import defpackage.setQuickZoomEnabled;
import defpackage.setTintList;
import defpackage.setTintMode;
import defpackage.share;
import defpackage.unscheduleDrawable;
import defpackage.updateDensity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\b\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0015\u0010\u001e\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\rR\u0015\u0010#\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\rR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010&R\u0014\u0010\"\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010("}, d2 = {"Lcom/bpjstku/presentation/complaint/DetailComplaintHistoryActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDetailComplaintHistoryBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LaddStateSet;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/complaint/model/ComplaintHistory;", "Lcom/bpjstku/domain/complaint/model/ComplaintHistory;", "Lcom/bpjstku/domain/complaint/model/ComplaintDetail;", "Lcom/bpjstku/domain/complaint/model/ComplaintDetail;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "d", "Ljava/lang/String;", "", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "g", "Ljava/util/List;", "", "INotificationSideChannel", "Z", "notify", "LsetEnterFadeDuration;", "cancelAll", "LsetDither;", "cancel", "onTransact", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DetailComplaintHistoryActivity extends BindingBaseActivity<ActivityDetailComplaintHistoryBinding> {
    private static short[] INotificationSideChannelDefault;
    private static byte[] INotificationSideChannelStub;
    private static int MediaBrowserCompat;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getInterfaceDescriptor;
    private static int onTransact;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private boolean asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private ComplaintDetail TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ComplaintHistory TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private boolean g;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 156;
    private static int connect = 1;
    private static int read = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<TrackingComplaint> d = new ArrayList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private List<ComplaintHistory> INotificationSideChannel = new ArrayList();

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy notify = LazyKt.lazy(new Function0() { // from class: applyTheme
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return (setEnterFadeDuration) DetailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1692846234, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1692846234, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        }
    });

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy onTransact = LazyKt.lazy(new Function0() { // from class: getChangingConfigurations
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DetailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i7 | i4;
        int i9 = ~(i8 | i);
        int i10 = (~i) | (~((~i4) | i2));
        int i11 = (~(i | i4)) | (~(i7 | i)) | (~i8);
        int i12 = i2 + i4 + i6 + ((-953487067) * i5) + ((-1992133889) * i3);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i4) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i6) + ((-1703411712) * i5) + (1961361408 * i3) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i4 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i6 * 272662391) + (i5 * 2077717299) + (i3 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
        }
        DetailComplaintHistoryActivity detailComplaintHistoryActivity = (DetailComplaintHistoryActivity) objArr[0];
        int i17 = 2 % 2;
        ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("");
        RecyclerView recyclerView = ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvTrackingComplaint;
        DetailComplaintHistoryActivity detailComplaintHistoryActivity2 = detailComplaintHistoryActivity;
        recyclerView.setLayoutManager(new LinearLayoutManager(detailComplaintHistoryActivity2));
        recyclerView.setAdapter((setEnterFadeDuration) detailComplaintHistoryActivity.notify.getValue());
        RecyclerView recyclerView2 = ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvTrackingPre;
        recyclerView2.setLayoutManager(new LinearLayoutManager(detailComplaintHistoryActivity2));
        recyclerView2.setAdapter((setDither) detailComplaintHistoryActivity.onTransact.getValue());
        int i18 = read + 75;
        IconCompatParcelizer = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    private static void c(int i, byte b, short s, Object[] objArr) {
        int i2 = 98 - (b * 14);
        byte[] bArr = $$a;
        int i3 = 197 - i;
        byte[] bArr2 = new byte[s + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = s + i3;
            i3++;
            i2 = i5 - 11;
            i4 = -1;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + bArr[i3]) - 11;
            i4 = i6;
        }
    }

    public DetailComplaintHistoryActivity() {
        final DetailComplaintHistoryActivity detailComplaintHistoryActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<addStateSet>() { // from class: com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [addStateSet, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ addStateSet invoke() {
                LifecycleOwner lifecycleOwner = detailComplaintHistoryActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(addStateSet.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/complaint/DetailComplaintHistoryActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/complaint/model/ComplaintHistory;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/domain/complaint/model/ComplaintHistory;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, ComplaintHistory p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) DetailComplaintHistoryActivity.class);
            intent.putExtra("complaintHistory", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDetailComplaintHistoryBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % 128;
        int i3 = i2 % 2;
        DetailComplaintHistoryActivity$bindingInflater$1 detailComplaintHistoryActivity$bindingInflater$1 = DetailComplaintHistoryActivity$bindingInflater$1.b;
        if (i3 == 0) {
            return detailComplaintHistoryActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnDetailComplaint.setOnClickListener(new View.OnClickListener() { // from class: initializeDrawableForDisplay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        MaterialButton materialButton = ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: DrawableContainerCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: draw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        int i2 = read + 93;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        String str;
        int i = 2 % 2;
        ComplaintHistory complaintHistory = (ComplaintHistory) getIntent().getParcelableExtra("complaintHistory");
        String str2 = null;
        if (complaintHistory == null) {
            int i2 = read + 31;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                str2.hashCode();
                throw null;
            }
            complaintHistory = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = complaintHistory;
        if (complaintHistory != null) {
            str = complaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            int i3 = IconCompatParcelizer + 51;
            read = i3 % 128;
            int i4 = i3 % 2;
            str = null;
        }
        this.TuitionPaymentFragmentbindingInflater1 = String.valueOf(str);
        ComplaintHistory complaintHistory2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.b = String.valueOf(complaintHistory2 != null ? complaintHistory2.TuitionPaymentFragmentbindingInflater1 : null);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((addStateSet) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new Observer() { // from class: getAlpha
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DetailComplaintHistoryActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = read + 63;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int iAlpha = 2267 - Color.alpha(0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 33;
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iAlpha, capsMode, 1387473586, false, $$i((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = INotificationSideChannelStub;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = $10 + 11;
                        $11 = i9 % 128;
                        if (i9 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 3358 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, -1054011043, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), Color.red(0) + 3358, TextUtils.lastIndexOf("", '0', 0) + 19, -1054011043, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 77;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = INotificationSideChannelStub;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(onTransact)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int iBlue = Color.blue(0) + 2267;
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, iBlue, doubleTapTimeout, 1387473586, false, $$i((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) / 3046761265686732006L)) >>> ((int) (((long) RemoteActionCompatParcelizer) * 3046761265686732006L));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr4 = INotificationSideChannelStub;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(onTransact)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
                            int i11 = 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte length4 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iNormalizeMetaState, i11, 1387473586, false, $$i((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) RemoteActionCompatParcelizer) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) INotificationSideChannelDefault[i3 + ((int) (((long) onTransact) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) RemoteActionCompatParcelizer) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i12 = ((i3 + iIntValue) - 2) + ((int) (((long) onTransact) ^ 3046761265686732006L));
                if (!z) {
                    i4 = 0;
                } else {
                    int i13 = $10 + 63;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(getInterfaceDescriptor), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 55904), TextUtils.getCapsMode("", 0, 0) + 2855, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, -1529949196, false, $$i(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = INotificationSideChannelStub;
                if (bArr5 != null) {
                    int length5 = bArr5.length;
                    byte[] bArr6 = new byte[length5];
                    for (int i15 = 0; i15 < length5; i15++) {
                        bArr6[i15] = (byte) (((long) bArr5[i15]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i16 = $11 + 69;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    if (z2) {
                        byte[] bArr7 = INotificationSideChannelStub;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i18]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = INotificationSideChannelDefault;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
            int i20 = $10 + 81;
            $11 = i20 % 128;
            int i21 = i20 % 2;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        DetailComplaintHistoryActivity detailComplaintHistoryActivity = (DetailComplaintHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ComplaintHistory complaintHistory = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (complaintHistory != null) {
            final addStateSet addstateset = (addStateSet) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf = String.valueOf(complaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            String strValueOf2 = String.valueOf(complaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            Intrinsics.checkNotNullParameter(strValueOf2, "");
            MutableLiveData<VirtualCameraAdapter1<ComplaintDetail>> mutableLiveData = addstateset.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = addstateset.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            User userAsBinder = addstateset.d.asBinder();
            if (userAsBinder != null) {
                int i4 = IconCompatParcelizer + 89;
                read = i4 % 128;
                if (i4 % 2 != 0) {
                    String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw null;
                }
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                int i5 = IconCompatParcelizer + 55;
                read = i5 % 128;
                int i6 = i5 % 2;
                str = null;
            }
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(r8lambda54beh8zsbru0cxi2ccsp2synys.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ComplaintDetailRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion2, String.valueOf(str), addstateset.TuitionPaymentFragmentbindingInflater1), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, strValueOf, addstateset.TuitionPaymentFragmentbindingInflater1), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, strValueOf2, addstateset.TuitionPaymentFragmentbindingInflater1)))));
            final Function1 function1 = new Function1() { // from class: AnimatedStateListDrawableCompatAnimatedStateListState
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return addStateSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addstateset, (ComplaintDetail) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: generateTransitionKey
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: start
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return addStateSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addstateset, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: indexOfTransition
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            addstateset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % 128;
        Object obj = null;
        int i3 = 0;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                int iAxisFromString = MotionEvent.axisFromString("") + 24;
                byte[] bArr = $$a;
                byte b = bArr[28];
                byte b2 = (byte) (-bArr[2]);
                Object[] objArr2 = new Object[1];
                c((short) 193, b, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumDrawingCacheSize, iAxisFromString, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
            int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
            int iIndexOf = TextUtils.indexOf("", "") + 23;
            byte[] bArr2 = $$a;
            Object[] objArr3 = new Object[1];
            c((short) 193, bArr2[28], (byte) (-bArr2[2]), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, edgeSlop, iIndexOf, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            int i4 = IconCompatParcelizer + 57;
            read = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iIndexOf2 = 1755 - TextUtils.indexOf("", "");
                int i6 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                Object[] objArr4 = new Object[1];
                c((short) $$b, $$a[28], (byte) 52, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf2, i6, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr5[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i7}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i8 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_not_equal).substring(5, 6).codePointAt(0) - 1513449185);
            int i9 = ~(419591119 | i8);
            int i10 = 1403781965 + ((i9 | (-206988694)) * 764) + (((~(i8 | (-206988694))) | 134373765) * (-1528)) + (((-357832283) | i9) * 764) + 1646436752;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i12 ^ (i12 << 5);
            int i13 = read + 35;
            IconCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr6 = new Object[1];
            e(ExpandableListView.getPackedPositionGroup(0L) - 620913295, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step3).substring(25, 26).length() - 32, (short) ((-16777310) - Color.rgb(0, 0, 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 201), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step1).substring(1, 2).codePointAt(0) - 1829882401, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e((-620913296) - View.MeasureSpec.getMode(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 67, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_get_bank_point).substring(1, 2).codePointAt(0) - 191), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_expiry_date).substring(16, 17).codePointAt(0) + 42), (-1829882289) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {1363220964};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 42049), 1726 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.alpha(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 1646436752, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                    int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                    int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                    Object[] objArr9 = new Object[1];
                    c((short) $$b, $$a[28], (byte) 52, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize2, absoluteGravity, maxKeyCode, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 620913340, KeyEvent.getDeadChar(0, 0) - 25, (short) ((ViewConfiguration.getTouchSlop() >> 8) - 113), (byte) (3 - (KeyEvent.getMaxKeyCode() >> 16)), (-1829882274) - View.resolveSize(0, 0), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 620913336, ExpandableListView.getPackedPositionType(0L) - 32, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 195), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step2).substring(15, 16).codePointAt(0) + 30), (-1829882253) - (Process.myPid() >> 22), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                        int iRed = 1755 - Color.red(0);
                        int i15 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr12 = new Object[1];
                        c((short) 104, $$a[28], (byte) 52, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iRed, i15, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1755;
                        int mirror = 'G' - AndroidCharacter.getMirror('0');
                        byte[] bArr3 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((short) 193, bArr3[28], (byte) (-bArr3[2]), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, iIndexOf3, mirror, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i16 = ((int[]) objArrB$7879113[1])[0];
        int i17 = ((int[]) objArrB$7879113[0])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    arrayList.add(strArr[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i18 = read + 29;
        IconCompatParcelizer = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArrB$7879113[3])[0];
        int i21 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr14 = {new int[]{i21}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i22 = ~startElapsedRealtime;
        int i23 = i20 + 1031009069 + (((~(i22 | (-279916663))) | 10747974 | (~((-223350401) | startElapsedRealtime))) * 717) + (((~(startElapsedRealtime | (-279916663))) | (~(i22 | (-223350401))) | 10747974) * 717);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr14[3])[0] = i25 ^ (i25 << 5);
        int i26 = read + 41;
        IconCompatParcelizer = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int iAlpha = Color.alpha(0) + 1031;
            int size = View.MeasureSpec.getSize(0) + 15;
            Object[] objArr15 = new Object[1];
            c((short) 52, $$a[28], (byte) 52, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, iAlpha, size, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 620913340, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 61, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).codePointAt(0) - 214), (byte) (TextUtils.getCapsMode("", 0, 0) + 3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1829882310, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step1).substring(0, 4).length() - 620913304, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik).substring(0, 11).codePointAt(4) - 107, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_bca).substring(8, 9).codePointAt(0) - 110), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 63), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1829882289, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf3 = (char) TextUtils.indexOf("", "");
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 16;
            Object[] objArr18 = new Object[1];
            c((short) $$b, $$a[28], (byte) 52, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf3, jumpTapTimeout, iIndexOf4, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                short s = $$a[7];
                byte b3 = (byte) s;
                Object[] objArr19 = new Object[1];
                c(s, b3, b3, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, packedPositionGroup, scrollBarFadeDuration, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr20[3])[0];
            int i29 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i30 = ~new Random().nextInt();
            int i31 = (((((~((-422315490) | i30)) | 287311232) * (-241)) + 1246179681) + (((~(i30 | (-135004258))) | (-465346552)) * 241)) - 1640799336;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e((-620913295) - Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).length() - 32, (short) ((-93) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).codePointAt(3) - 190), (Process.myPid() >> 22) - 1829882304, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 620913413, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_bill).substring(0, 12).codePointAt(4) - 136, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 105), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_transfer).substring(0, 12).codePointAt(11) + 14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 1829882404, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1363220964};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (AndroidCharacter.getMirror('0') + 45990), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1134, 18 - View.MeasureSpec.getSize(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1640799336, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                int mirror2 = AndroidCharacter.getMirror('0') - '!';
                Object[] objArr25 = new Object[1];
                c((short) 52, $$a[28], (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, scrollBarSize, mirror2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1117 - (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 17), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char mirror3 = (char) ('0' - AndroidCharacter.getMirror('0'));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                short s2 = $$a[7];
                byte b4 = (byte) s2;
                Object[] objArr27 = new Object[1];
                c(s2, b4, b4, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mirror3, keyRepeatDelay, iLastIndexOf, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 620913315, TextUtils.indexOf("", "", 0) - 25, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_title_text).substring(0, 20).length() - 133), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 33), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).length() - 1829882275, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(Color.blue(0) - 620913300, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_sample_valid_date).substring(0, 6).codePointAt(2) - 140, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_500).substring(13, 15).length() - 80), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 45), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1829882289, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                    Object[] objArr30 = new Object[1];
                    c((short) $$b, $$a[28], (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cCombineMeasuredStates, iLastIndexOf2, offsetAfter, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c5 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int iResolveSize = 1031 - View.resolveSize(0, 0);
                    int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    Object[] objArr31 = new Object[1];
                    c((short) 52, $$a[28], (byte) 52, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c5, iResolveSize, maximumFlingVelocity, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i34 = IconCompatParcelizer + 49;
            read = i34 % 128;
            int i35 = i34 % 2;
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[3])[0];
            int i38 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i40 = ~i39;
            int i41 = i36 + 573554113 + (((~((-277908491) | i40)) | (~((-5128534) | i39)) | (~(316665343 | i39))) * 765) + (((~((-283037024) | i40)) | 277908490) * 1530) + (((~(i39 | (-283037024))) | (~(i40 | 316665343))) * 765);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr32[2])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i44 = IconCompatParcelizer + 47;
        read = i44 % 128;
        int i45 = i44 % 2;
        while (i3 < strArr4.length) {
            int i46 = IconCompatParcelizer + 35;
            read = i46 % 128;
            if (i46 % 2 != 0) {
                arrayList2.add(strArr4[i3]);
                i3 += 86;
            } else {
                arrayList2.add(strArr4[i3]);
                i3++;
            }
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        DetailComplaintHistoryActivity detailComplaintHistoryActivity = (DetailComplaintHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = (-1870095304) + (((~((-868819321) | elapsedCpuTime)) | 557916232 | (~((-1698806864) | elapsedCpuTime))) * (-754));
        int i6 = ~((-557916233) | elapsedCpuTime);
        int i7 = ~elapsedCpuTime;
        if (i4 != i5 + ((i6 | (~((-1140890632) | i7))) * (-754)) + ((i7 | (-868819321)) * 754)) {
            int i8 = (-989208528) % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i9 != (-1082856870) + (((~(iMyTid | 855601313)) | (-1996485820)) * 305) + (((~((~iMyTid) | 855601313)) | (-1723454652)) * 305)) {
            throw null;
        }
        super.onResume();
        int i10 = read + 107;
        IconCompatParcelizer = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1069647462
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
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a7, code lost:
    
        if (r1 != (((346024308 + (((~r2) | 566315008) * 1324)) + (((~(r2 | 2011678792)) | (~(567377172 | r2))) * (-1324))) - 243729432)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a9, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.IconCompatParcelizer + 5;
        com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.read = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        throw new java.lang.RuntimeException("-551832259");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
    
        r11 = (-519698536) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1 == ((((((-1054863292) | r5) | (~(215863227 | r4))) * (-338)) - 891494672) + (((~(r4 | (-839000065))) | r5) * 338))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r1 == ((((-328519600) + ((r7 | r8) * 1150)) + (((~((-1688479545) | r5)) | r8) * (-575))) + (((~(r4 | (-858492002))) | (~(r5 | 858492001))) * 575))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().totalMemory();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.read
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L40
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r10)
            r5 = -215863228(0xfffffffff3223044, float:-1.28499E31)
            int r6 = ~r4
            r5 = r5 | r6
            int r5 = ~r5
            r6 = -1054863292(0xffffffffc1201044, float:-10.003971)
            r6 = r6 | r5
            r7 = 215863227(0xcddcfbb, float:3.4175465E-31)
            r7 = r7 | r4
            int r7 = ~r7
            r6 = r6 | r7
            int r6 = r6 * (-338)
            r7 = -891494672(0xffffffffcadcdef0, float:-7237496.0)
            int r6 = r6 + r7
            r7 = -839000065(0xffffffffcdfddfff, float:-5.3241443E8)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 338
            int r6 = r6 + r4
            if (r1 != r6) goto Lbe
            goto L77
        L40:
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r10)
            int r5 = ~r4
            r6 = -858492002(0xffffffffccd4739e, float:-1.1138584E8)
            r7 = r6 | r5
            int r7 = ~r7
            r8 = 1688479544(0x64a42738, float:2.4224736E22)
            r8 = r8 | r4
            int r8 = ~r8
            r7 = r7 | r8
            int r7 = r7 * 1150
            r9 = -328519600(0xffffffffec6b3050, float:-1.1373029E27)
            int r9 = r9 + r7
            r7 = -1688479545(0xffffffff9b5bd8c7, float:-1.81853E-22)
            r7 = r7 | r5
            int r7 = ~r7
            r7 = r7 | r8
            int r7 = r7 * (-575)
            int r9 = r9 + r7
            r4 = r4 | r6
            int r4 = ~r4
            r6 = 858492001(0x332b8c61, float:3.9941714E-8)
            r5 = r5 | r6
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 575
            int r9 = r9 + r4
            if (r1 != r9) goto Lbe
        L77:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r2 = r2.totalMemory()
            int r2 = (int) r2
            int r3 = ~r2
            r4 = 566315008(0x21c14800, float:1.3097247E-18)
            r3 = r3 | r4
            int r3 = r3 * 1324
            r4 = 346024308(0x149fe974, float:1.6146978E-26)
            int r4 = r4 + r3
            r3 = 567377172(0x21d17d14, float:1.4195499E-18)
            r3 = r3 | r2
            int r3 = ~r3
            r5 = 2011678792(0x77e7c848, float:9.402209E33)
            r2 = r2 | r5
            int r2 = ~r2
            r2 = r2 | r3
            int r2 = r2 * (-1324)
            int r4 = r4 + r2
            r2 = -243729432(0xfffffffff178fbe8, float:-1.2329091E30)
            int r4 = r4 + r2
            if (r1 != r4) goto Lb6
            super.onCreate(r11)
            int r11 = com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.IconCompatParcelizer
            int r11 = r11 + 5
            int r1 = r11 % 128
            com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.read = r1
            int r11 = r11 % r0
            return
        Lb6:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "-551832259"
            r11.<init>(r0)
            throw r11
        Lbe:
            r11 = -519698536(0xffffffffe1060798, float:-1.5452568E20)
            int r11 = r11 % r0
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DetailComplaintHistoryActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailComplaintHistoryActivity detailComplaintHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        read = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                detailComplaintHistoryActivity.finish();
                ViewPortBuilder.b();
            } else {
                detailComplaintHistoryActivity.finish();
                ViewPortBuilder.b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ setDither TuitionPaymentFragmentspecialinlinedviewModeldefault2(DetailComplaintHistoryActivity detailComplaintHistoryActivity) {
        int i = 2 % 2;
        setDither setdither = new setDither(detailComplaintHistoryActivity, new ArrayList());
        int i2 = IconCompatParcelizer + 27;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            return setdither;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DetailComplaintHistoryActivity detailComplaintHistoryActivity, View view) {
        String str;
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            setTintList settintlist = new setTintList();
            int i2 = detailComplaintHistoryActivity.getResources().getDisplayMetrics().heightPixels;
            ComplaintDetail complaintDetail = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (complaintDetail != null) {
                int i3 = read + 33;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                str = complaintDetail.cancel;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "P01")) {
                int i5 = read + 71;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                setTintList.Companion companion = setTintList.INSTANCE;
                ComplaintDetail complaintDetail2 = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                settintlist = setTintList.Companion.TuitionPaymentFragmentbindingInflater1(null, complaintDetail2 != null ? complaintDetail2.a : null, null, 5);
                int i7 = read + 121;
                IconCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
            } else if (Intrinsics.areEqual(str, "P02")) {
                setTintList.Companion companion2 = setTintList.INSTANCE;
                ComplaintDetail complaintDetail3 = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (complaintDetail3 != null) {
                    int i9 = IconCompatParcelizer + 95;
                    read = i9 % 128;
                    int i10 = i9 % 2;
                    detailPerusahaanBelumTerdaftar = complaintDetail3.onTransact;
                } else {
                    detailPerusahaanBelumTerdaftar = null;
                }
                settintlist = setTintList.Companion.TuitionPaymentFragmentbindingInflater1(null, null, detailPerusahaanBelumTerdaftar, 3);
            }
            settintlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(i2));
            FragmentManager supportFragmentManager = detailComplaintHistoryActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(settintlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                settintlist.show(supportFragmentManager, settintlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final DetailComplaintHistoryActivity detailComplaintHistoryActivity = (DetailComplaintHistoryActivity) objArr[0];
        int i = 2 % 2;
        setEnterFadeDuration setenterfadeduration = new setEnterFadeDuration(detailComplaintHistoryActivity, new ArrayList(), new Function1() { // from class: canApplyTheme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailComplaintHistoryActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (TrackingComplaint) obj);
            }
        });
        int i2 = read + 35;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return setenterfadeduration;
    }

    public static /* synthetic */ Unit b(DetailComplaintHistoryActivity detailComplaintHistoryActivity, TrackingComplaint trackingComplaint) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(trackingComplaint, "");
        unscheduleDrawable.Companion companion = unscheduleDrawable.INSTANCE;
        unscheduleDrawable unscheduledrawableTuitionPaymentFragmentbindingInflater1 = unscheduleDrawable.Companion.TuitionPaymentFragmentbindingInflater1(trackingComplaint.b);
        unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(detailComplaintHistoryActivity.getResources().getDisplayMetrics().heightPixels));
        FragmentManager supportFragmentManager = detailComplaintHistoryActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = read + 95;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            unscheduledrawableTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i6 = IconCompatParcelizer + 29;
            read = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(DetailComplaintHistoryActivity detailComplaintHistoryActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        read = i2 % 128;
        int i3 = i2 % 2;
        detailComplaintHistoryActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = read + 117;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DetailComplaintHistoryActivity detailComplaintHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        detailComplaintHistoryActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = read + 75;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145 A[PHI: r4 r13 r14 r15
  0x0145: PHI (r4v63 androidx.viewpager.widget.ViewPager) = (r4v62 androidx.viewpager.widget.ViewPager), (r4v78 androidx.viewpager.widget.ViewPager) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r13v15 androidx.fragment.app.FragmentManager) = (r13v14 androidx.fragment.app.FragmentManager), (r13v18 androidx.fragment.app.FragmentManager) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r14v1 AutoValue_CameraState_StateError[]) = (r14v0 AutoValue_CameraState_StateError[]), (r14v7 AutoValue_CameraState_StateError[]) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r15v2 com.bpjstku.domain.complaint.model.ComplaintDetail) = (r15v1 com.bpjstku.domain.complaint.model.ComplaintDetail), (r15v12 com.bpjstku.domain.complaint.model.ComplaintDetail) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0148 A[PHI: r4 r13 r14
  0x0148: PHI (r4v77 androidx.viewpager.widget.ViewPager) = (r4v62 androidx.viewpager.widget.ViewPager), (r4v78 androidx.viewpager.widget.ViewPager) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0148: PHI (r13v17 androidx.fragment.app.FragmentManager) = (r13v14 androidx.fragment.app.FragmentManager), (r13v18 androidx.fragment.app.FragmentManager) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x0148: PHI (r14v6 AutoValue_CameraState_StateError[]) = (r14v0 AutoValue_CameraState_StateError[]), (r14v7 AutoValue_CameraState_StateError[]) binds: [B:51:0x0143, B:48:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x01fd A[PHI: r4 r6 r10 r13
  0x01fd: PHI (r4v48 androidx.viewpager.widget.ViewPager) = (r4v47 androidx.viewpager.widget.ViewPager), (r4v58 androidx.viewpager.widget.ViewPager) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r6v12 androidx.fragment.app.FragmentManager) = (r6v11 androidx.fragment.app.FragmentManager), (r6v18 androidx.fragment.app.FragmentManager) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r10v12 updateDensity[]) = (r10v11 updateDensity[]), (r10v16 updateDensity[]) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r13v2 com.bpjstku.domain.complaint.model.ComplaintDetail) = (r13v1 com.bpjstku.domain.complaint.model.ComplaintDetail), (r13v12 com.bpjstku.domain.complaint.model.ComplaintDetail) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0200 A[PHI: r4 r6 r10
  0x0200: PHI (r4v57 androidx.viewpager.widget.ViewPager) = (r4v47 androidx.viewpager.widget.ViewPager), (r4v58 androidx.viewpager.widget.ViewPager) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x0200: PHI (r6v17 androidx.fragment.app.FragmentManager) = (r6v11 androidx.fragment.app.FragmentManager), (r6v18 androidx.fragment.app.FragmentManager) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x0200: PHI (r10v15 updateDensity[]) = (r10v11 updateDensity[]), (r10v16 updateDensity[]) binds: [B:75:0x01fb, B:72:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0252  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final DetailComplaintHistoryActivity detailComplaintHistoryActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        List<TrackingComplaint> list;
        String str;
        ViewPager viewPager;
        FragmentManager supportFragmentManager;
        updateDensity[] updatedensityArr;
        ComplaintDetail complaintDetail;
        List<TrackingComplaint> list2;
        ViewPager viewPager2;
        FragmentManager supportFragmentManager2;
        AutoValue_CameraState_StateError[] autoValue_CameraState_StateErrorArr;
        ComplaintDetail complaintDetail2;
        List<TrackingComplaint> list3;
        List<TrackingComplaint> list4;
        List<TrackingComplaint> list5;
        List<TrackingComplaint> list6;
        List<TrackingComplaint> list7;
        List<TrackingComplaint> list8;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = IconCompatParcelizer + 5;
            read = i2 % 128;
            int i3 = i2 % 2;
            detailComplaintHistoryActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                detailComplaintHistoryActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailComplaintHistoryActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: animate
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailComplaintHistoryActivity.b(this.TuitionPaymentFragmentbindingInflater1);
                    }
                });
                return;
            }
            return;
        }
        detailComplaintHistoryActivity.IconCompatParcelizer();
        ComplaintDetail complaintDetail3 = (ComplaintDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = complaintDetail3;
        ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerDeskripsiPengaduan.setVisibility(8);
        List<TrackingComplaint> list9 = complaintDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj = null;
        if (list9 != null) {
            int i4 = read + 63;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                list9.size();
                obj.hashCode();
                throw null;
            }
            if (list9.size() != 0) {
                list = complaintDetail3.asInterface;
                if (list == null && list.size() == 0) {
                    list5 = complaintDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (list5 != null || list5.size() != 0) {
                        detailComplaintHistoryActivity.asInterface = true;
                    }
                    list6 = complaintDetail3.asInterface;
                    if (list6 != null || list6.size() != 0) {
                        detailComplaintHistoryActivity.a = true;
                    }
                    list7 = complaintDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (list7 != null && list7.size() == 0 && (list8 = complaintDetail3.asInterface) != null && list8.size() == 0) {
                        detailComplaintHistoryActivity.g = true;
                        ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvTrackingPre.setVisibility(8);
                    }
                } else {
                    detailComplaintHistoryActivity.asBinder = true;
                }
            } else {
                list5 = complaintDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (list5 != null) {
                    detailComplaintHistoryActivity.asInterface = true;
                } else {
                    detailComplaintHistoryActivity.asInterface = true;
                }
                list6 = complaintDetail3.asInterface;
                if (list6 != null) {
                    detailComplaintHistoryActivity.a = true;
                } else {
                    detailComplaintHistoryActivity.a = true;
                }
                list7 = complaintDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (list7 != null) {
                    detailComplaintHistoryActivity.g = true;
                    ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvTrackingPre.setVisibility(8);
                }
            }
        } else {
            list = complaintDetail3.asInterface;
            if (list == null) {
            }
            detailComplaintHistoryActivity.asBinder = true;
        }
        ActivityDetailComplaintHistoryBinding activityDetailComplaintHistoryBinding = (ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        String str2 = complaintDetail3.cancel;
        if (!Intrinsics.areEqual(str2, "P01")) {
            if (Intrinsics.areEqual(str2, "P02")) {
                ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(detailComplaintHistoryActivity.getString(R.string.label_ppbt));
                activityDetailComplaintHistoryBinding.viewPagerComplaint.setVisibility(8);
                activityDetailComplaintHistoryBinding.btnDetailComplaint.setVisibility(0);
                activityDetailComplaintHistoryBinding.rvTrackingComplaint.setVisibility(0);
                activityDetailComplaintHistoryBinding.tvLabelMemberNumber.setText(detailComplaintHistoryActivity.getString(R.string.label_company_address));
                activityDetailComplaintHistoryBinding.tvIdComplaint.setText(complaintDetail3.d);
                activityDetailComplaintHistoryBinding.tvNameCompany.setText(complaintDetail3.asBinder);
                activityDetailComplaintHistoryBinding.tvMemberNumber.setText(complaintDetail3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((setEnterFadeDuration) detailComplaintHistoryActivity.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(complaintDetail3.g);
                String str3 = complaintDetail3.asBinder;
                if (str3 == null || str3.length() == 0) {
                    activityDetailComplaintHistoryBinding.tvNameCompany.setText("-");
                    return;
                }
                return;
            }
            activityDetailComplaintHistoryBinding.tvLabelMemberNumber.setVisibility(8);
            activityDetailComplaintHistoryBinding.tvMemberNumber.setVisibility(8);
            activityDetailComplaintHistoryBinding.line3.setVisibility(8);
            activityDetailComplaintHistoryBinding.viewPagerComplaint.setVisibility(8);
            activityDetailComplaintHistoryBinding.btnDetailComplaint.setVisibility(8);
            activityDetailComplaintHistoryBinding.rvTrackingComplaint.setVisibility(8);
            ActivityDetailComplaintHistoryBinding activityDetailComplaintHistoryBinding2 = (ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            activityDetailComplaintHistoryBinding2.rvTrackingPre.setVisibility(0);
            activityDetailComplaintHistoryBinding2.containerDeskripsiPengaduan.setVisibility(0);
            activityDetailComplaintHistoryBinding2.tvIdComplaint.setText(detailComplaintHistoryActivity.TuitionPaymentFragmentbindingInflater1);
            activityDetailComplaintHistoryBinding2.tvDeskripsiPengaduan.setText(detailComplaintHistoryActivity.b);
            ArrayList arrayList = new ArrayList();
            detailComplaintHistoryActivity.d = arrayList;
            ComplaintHistory complaintHistory = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (complaintHistory != null) {
                int i5 = IconCompatParcelizer + 109;
                read = i5 % 128;
                if (i5 % 2 != 0) {
                    str = complaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i6 = 75 / 0;
                } else {
                    str = complaintHistory.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            } else {
                str = null;
            }
            arrayList.add(0, new TrackingComplaint("Pengaduan diterima", str, "Berhasil", null));
            detailComplaintHistoryActivity.d.add(1, new TrackingComplaint("Verifikasi Pengaduan", null, null, null));
            detailComplaintHistoryActivity.d.add(2, new TrackingComplaint("Tindak Lanjut Pengaduan", null, null, null));
            detailComplaintHistoryActivity.d.add(3, new TrackingComplaint("Pengaduan Selesai", null, null, null));
            ((setDither) detailComplaintHistoryActivity.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(detailComplaintHistoryActivity.d);
            return;
        }
        ((ActivityDetailComplaintHistoryBinding) ((ViewBinding) detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(detailComplaintHistoryActivity.getString(R.string.label_pdts));
        activityDetailComplaintHistoryBinding.viewPagerComplaint.setVisibility(0);
        activityDetailComplaintHistoryBinding.btnDetailComplaint.setVisibility(0);
        activityDetailComplaintHistoryBinding.rvTrackingComplaint.setVisibility(0);
        activityDetailComplaintHistoryBinding.tvLabelMemberNumber.setText(detailComplaintHistoryActivity.getString(R.string.label_membership_number));
        activityDetailComplaintHistoryBinding.tvIdComplaint.setText(complaintDetail3.d);
        activityDetailComplaintHistoryBinding.tvNameCompany.setText(complaintDetail3.asBinder);
        activityDetailComplaintHistoryBinding.tvMemberNumber.setText(complaintDetail3.TuitionPaymentFragmentbindingInflater1);
        if (detailComplaintHistoryActivity.asBinder) {
            int i7 = IconCompatParcelizer + 87;
            read = i7 % 128;
            if (i7 % 2 != 0) {
                viewPager2 = activityDetailComplaintHistoryBinding.viewPagerComplaint;
                supportFragmentManager2 = detailComplaintHistoryActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                autoValue_CameraState_StateErrorArr = new AutoValue_CameraState_StateError[3];
                updateDensity.Companion companion = updateDensity.INSTANCE;
                complaintDetail2 = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (complaintDetail2 != null) {
                    list3 = complaintDetail2.asInterface;
                } else {
                    list3 = null;
                }
            } else {
                viewPager2 = activityDetailComplaintHistoryBinding.viewPagerComplaint;
                supportFragmentManager2 = detailComplaintHistoryActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                autoValue_CameraState_StateErrorArr = new AutoValue_CameraState_StateError[2];
                updateDensity.Companion companion2 = updateDensity.INSTANCE;
                complaintDetail2 = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (complaintDetail2 != null) {
                    list3 = complaintDetail2.asInterface;
                } else {
                    list3 = null;
                }
            }
            Intrinsics.checkNotNull(list3, "");
            autoValue_CameraState_StateErrorArr[0] = updateDensity.Companion.TuitionPaymentFragmentbindingInflater1((ArrayList) list3);
            setTintMode.Companion companion3 = setTintMode.INSTANCE;
            ComplaintDetail complaintDetail4 = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (complaintDetail4 != null) {
                int i8 = IconCompatParcelizer + 17;
                read = i8 % 128;
                int i9 = i8 % 2;
                list4 = complaintDetail4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                list4 = null;
            }
            Intrinsics.checkNotNull(list4, "");
            autoValue_CameraState_StateErrorArr[1] = setTintMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ArrayList) list4);
            viewPager2.setAdapter(new TorchStateReset(supportFragmentManager2, CollectionsKt.mutableListOf(autoValue_CameraState_StateErrorArr), CollectionsKt.mutableListOf(detailComplaintHistoryActivity.getString(R.string.hint_wage_amount), detailComplaintHistoryActivity.getString(R.string.label_all_employee))));
            List<TrackingComplaint> list10 = complaintDetail3.asInterface;
            if (list10 == null || list10.isEmpty()) {
                activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
            } else {
                int i10 = read + 93;
                IconCompatParcelizer = i10 % 128;
                if (i10 % 2 == 0) {
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                } else {
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(0);
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                }
            }
        }
        if (detailComplaintHistoryActivity.a) {
            int i11 = read + 79;
            IconCompatParcelizer = i11 % 128;
            if (i11 % 2 == 0) {
                viewPager = activityDetailComplaintHistoryBinding.viewPagerComplaint;
                supportFragmentManager = detailComplaintHistoryActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                updatedensityArr = new updateDensity[1];
                updateDensity.Companion companion4 = updateDensity.INSTANCE;
                complaintDetail = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (complaintDetail != null) {
                    list2 = complaintDetail.asInterface;
                } else {
                    list2 = null;
                }
            } else {
                viewPager = activityDetailComplaintHistoryBinding.viewPagerComplaint;
                supportFragmentManager = detailComplaintHistoryActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                updatedensityArr = new updateDensity[1];
                updateDensity.Companion companion5 = updateDensity.INSTANCE;
                complaintDetail = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (complaintDetail != null) {
                    list2 = complaintDetail.asInterface;
                } else {
                    list2 = null;
                }
            }
            Intrinsics.checkNotNull(list2, "");
            updatedensityArr[0] = updateDensity.Companion.TuitionPaymentFragmentbindingInflater1((ArrayList) list2);
            viewPager.setAdapter(new TorchStateReset(supportFragmentManager, CollectionsKt.mutableListOf(updatedensityArr), CollectionsKt.mutableListOf(detailComplaintHistoryActivity.getString(R.string.hint_wage_amount))));
            List<TrackingComplaint> list11 = complaintDetail3.asInterface;
            if (list11 != null) {
                int i12 = IconCompatParcelizer + 97;
                read = i12 % 128;
                if (i12 % 2 != 0) {
                    list11.isEmpty();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (list11.isEmpty()) {
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                } else {
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(0);
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                }
            } else {
                activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
            }
        }
        if (detailComplaintHistoryActivity.asInterface) {
            int i13 = read + 91;
            IconCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            ViewPager viewPager3 = activityDetailComplaintHistoryBinding.viewPagerComplaint;
            FragmentManager supportFragmentManager3 = detailComplaintHistoryActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            setTintMode[] settintmodeArr = new setTintMode[1];
            setTintMode.Companion companion6 = setTintMode.INSTANCE;
            ComplaintDetail complaintDetail5 = detailComplaintHistoryActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            List<TrackingComplaint> list12 = complaintDetail5 != null ? complaintDetail5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            Intrinsics.checkNotNull(list12, "");
            settintmodeArr[0] = setTintMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ArrayList) list12);
            viewPager3.setAdapter(new TorchStateReset(supportFragmentManager3, CollectionsKt.mutableListOf(settintmodeArr), CollectionsKt.mutableListOf(detailComplaintHistoryActivity.getString(R.string.label_all_employee))));
            List<TrackingComplaint> list13 = complaintDetail3.asInterface;
            if (list13 != null) {
                int i15 = read + 3;
                IconCompatParcelizer = i15 % 128;
                if (i15 % 2 == 0) {
                    boolean zIsEmpty = list13.isEmpty();
                    int i16 = 48 / 0;
                    if (zIsEmpty) {
                        activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                        activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                    } else {
                        activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(0);
                        activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                    }
                } else if (list13.isEmpty()) {
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                } else {
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(0);
                    activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
                }
            } else {
                activityDetailComplaintHistoryBinding.viewPagerComplaint.setCurrentItem(1);
                activityDetailComplaintHistoryBinding.viewPagerComplaint.requestLayout();
            }
        }
        String str4 = complaintDetail3.asBinder;
        if (str4 == null || str4.length() == 0) {
            activityDetailComplaintHistoryBinding.tvNameCompany.setText("-");
        }
        if (detailComplaintHistoryActivity.g) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "pre complaint", 0).show();
        }
    }

    public static /* synthetic */ setEnterFadeDuration TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailComplaintHistoryActivity detailComplaintHistoryActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (setEnterFadeDuration) TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{detailComplaintHistoryActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1692846234, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1692846234, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static {
        MediaBrowserCompat = 0;
        g();
        INSTANCE = new Companion(null);
        int i = connect + 123;
        MediaBrowserCompat = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 37;
        read = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        read = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_detail_complaint_history;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, -661001890, (-1718445529) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bni).substring(1, 3).codePointAt(1), 661001893, ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, -977825205, ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), 977825207, ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1943032782;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1903016073, ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), -1903016072, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = read + 123;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = read + 5;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    static void g() {
        onTransact = -507734746;
        RemoteActionCompatParcelizer = -1934795575;
        getInterfaceDescriptor = -1448133089;
        INotificationSideChannelStub = new byte[]{-25, 94, -18, 73, 13, 10, 44, 86, -30, 90, 21, 34, 120, -6, 92, 50, 6, 95, -20, 6, 37, 42, -16, 54, 60, 6, 41, 58, 50, 12, -102, -114, -105, 125, -96, -102, -123, -107, -116, 112, 113, -49, -98, 85, -36, -113, -116, -119, -104, ByteCompanionObject.MIN_VALUE, -103, -14, 110, -1, 98, 101, -10, -99, -8, -23, -4, 109, -103, -1, 97, -26, -26, -26, -26};
    }

    private static String $$i(short s, short s2, short s3) {
        int i = 3 - (s * 3);
        int i2 = s3 * 4;
        byte[] bArr = $$c;
        int i3 = 121 - s2;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = i + i4;
            i = i;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i + 1;
            i5 = i6;
            i3 = bArr[i7] + i3;
            i = i7;
        }
    }
}
