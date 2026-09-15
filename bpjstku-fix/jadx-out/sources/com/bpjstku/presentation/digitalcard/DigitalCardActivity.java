package com.bpjstku.presentation.digitalcard;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.volley.toolbox.HttpHeaderParser;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.databinding.ActivityDigitalCardBinding;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.digitalcard.DigitalCardActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.mlkit.common.MlKitException;
import defpackage.BufferProviderState;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addMenuPresenter;
import defpackage.cacheInteropConfig;
import defpackage.deriveCodec;
import defpackage.ensureViewModelStore;
import defpackage.generateCameraId;
import defpackage.getAdapter;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.setCameraOperatingMode;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019R\u0015\u0010\u0016\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/DigitalCardActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDigitalCardBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LgetAdapter;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "()I", "LaddMenuPresenter;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigitalCardActivity extends BindingBaseActivity<ActivityDigitalCardBinding> {
    private static char TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static int asInterface;
    private static char b;
    private static char d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: getItemIndexOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DigitalCardActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {106, -93, -11, -74};
    private static final int $$f = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, 65, -9, -121, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 65;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f486a = 0;
    private static int g = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = i3 | i7;
        int i9 = ~i;
        int i10 = ~((~i3) | i7);
        int i11 = i4 + i + i2 + (1977613057 * i5) + (454551927 * i6);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i4) + 473956352 + (953991674 * i) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i2) + ((-981467136) * i5) + ((-830472192) * i6) + ((-499122176) * i12);
        int i14 = (i4 * (-1131120504)) + 246467939 + (i * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i2 * (-1131119791)) + (i5 * (-1039407535)) + (i6 * 1820920743) + (i12 * 1447034880);
        int i15 = i13 + (i14 * i14 * 1170210816);
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    private static void c(int i, short s, short s2, Object[] objArr) {
        int i2 = s + 4;
        byte[] bArr = $$a;
        int i3 = (i * 14) + 84;
        byte[] bArr2 = new byte[s2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (s2 + i2) - 11;
            i2++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == s2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i3 = (i3 + bArr[i2]) - 11;
            i2 = i6 + 1;
            i4 = i5;
        }
    }

    public DigitalCardActivity() {
        final DigitalCardActivity digitalCardActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getAdapter>() { // from class: com.bpjstku.presentation.digitalcard.DigitalCardActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getAdapter] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getAdapter invoke() {
                LifecycleOwner lifecycleOwner = digitalCardActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getAdapter.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.digitalcard.DigitalCardActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/DigitalCardActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, DigitalCardActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDigitalCardBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 49;
        f486a = i2 % 128;
        int i3 = i2 % 2;
        DigitalCardActivity$bindingInflater$1 digitalCardActivity$bindingInflater$1 = DigitalCardActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = g + 101;
        f486a = i4 % 128;
        int i5 = i4 % 2;
        return digitalCardActivity$bindingInflater$1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0055 A[PHI: r2 r8
  0x0055: PHI (r2v13 ensureViewModelStore) = (r2v5 ensureViewModelStore), (r2v15 ensureViewModelStore) binds: [B:8:0x0050, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r8v14 getAdapter) = (r8v5 getAdapter), (r8v17 getAdapter) binds: [B:8:0x0050, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0052 A[PHI: r2 r4 r8
  0x0052: PHI (r2v6 ensureViewModelStore) = (r2v5 ensureViewModelStore), (r2v15 ensureViewModelStore) binds: [B:8:0x0050, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r4v4 com.bpjstku.domain.user.model.User) = (r4v3 com.bpjstku.domain.user.model.User), (r4v24 com.bpjstku.domain.user.model.User) binds: [B:8:0x0050, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r8v6 getAdapter) = (r8v5 getAdapter), (r8v17 getAdapter) binds: [B:8:0x0050, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final getAdapter getadapter;
        ensureViewModelStore ensureviewmodelstore;
        User userAsBinder;
        String str;
        DigitalCardActivity digitalCardActivity = (DigitalCardActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f486a + 71;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            getadapter = (getAdapter) digitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> mutableLiveData = getadapter.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            ensureviewmodelstore = getadapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            userAsBinder = getadapter.asBinder.asBinder();
            int i3 = 22 / 0;
            if (userAsBinder != null) {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
        } else {
            getadapter = (getAdapter) digitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> mutableLiveData2 = getadapter.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            ensureviewmodelstore = getadapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            userAsBinder = getadapter.asBinder.asBinder();
            if (userAsBinder != null) {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
        }
        if (str == null) {
            int i4 = f486a + 75;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            str = "";
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(ensureviewmodelstore.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DigitalCardRequest(str))));
        final Function1 function1 = new Function1() { // from class: notifyDataSetChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getadapter, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: MenuBuilder
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: createNewMenuItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getAdapter.b(getadapter, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: dispatchSaveInstanceState
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        getadapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i6 = f486a + 21;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((getAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new Observer() { // from class: ListMenuPresenter
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = f486a + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        DigitalCardActivity digitalCardActivity = this;
        Intrinsics.checkNotNullParameter(digitalCardActivity, "");
        digitalCardActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbarCenter.toolbar, true);
        ((ActivityDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbarCenter.tvToolbarTitle.setText(getString(R.string.label_digital_card));
        RecyclerView recyclerView = ((ActivityDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvDigitalCard;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new setCameraOperatingMode(16, 16));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((addMenuPresenter) this.TuitionPaymentFragmentbindingInflater1.getValue());
        int i2 = f486a + 85;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = g + 9;
                f486a = i2 % 128;
                if (i2 % 2 != 0) {
                    onBackPressed();
                    int i3 = 56 / 0;
                } else {
                    onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = f486a + 121;
            g = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i3 = $10 + 37;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 119;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i11 = i8;
                int i12 = (c4 + i7) ^ ((c4 << 4) + ((char) (((long) asBinder) ^ 8611973335120459638L)));
                int i13 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c2] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47773);
                        int i14 = 468 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, i14, fadingEdgeLength, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 47773), MotionEvent.axisFromString("") + 469, (ViewConfiguration.getTapTimeout() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i11 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), 2323 - (ViewConfiguration.getEdgeSlop() >> 16), 44 - View.resolveSizeAndState(0, 0, 0), -1312321721, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        DigitalCardActivity digitalCardActivity = (DigitalCardActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = g + 97;
        f486a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            byte b2 = $$a[7];
            short s = b2;
            Object[] objArr3 = new Object[1];
            c(b2, s, (byte) (s | 52), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, minimumFlingVelocity, i4, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{46028, 13994, 33205, 23108, 27180, 18756, 14972, 16309, 37085, 4414, 33982, 28300, 20251, 14387, 60385, 4277, 11985, 36280, 45887, 18428, 55867, 65399, 27288, 835}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).length() + 17, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{15097, 21324, 12170, 50157, 44178, 11011, 21838, 27788, 62152, 15913, 24347, 42905, 9174, 31128, 19675, 44596, 59205, 54289}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_primary_cta_text).substring(0, 14).length() + 1, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 15;
            byte b3 = $$a[7];
            short s2 = (short) (b3 | 52);
            Object[] objArr6 = new Object[1];
            c(b3, s2, (byte) s2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, iIndexOf, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 1032;
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte[] bArr = $$a;
                Object[] objArr7 = new Object[1];
                c(bArr[132], (short) 104, bArr[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, bitsPerPixel2, mirror, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr8[3])[0];
            int i6 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = ~startUptimeMillis;
            int i8 = 106353603 + (((~(194715822 | i7)) | (~((-438995993) | startUptimeMillis))) * 1900) + (((~(startUptimeMillis | (-194715823))) | (~(i7 | 438995992))) * (-950)) + (((~(i7 | (-194715823))) | (~(startUptimeMillis | 438995992))) * 950) + 1967922515;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{54151, 8725, 26151, 7731, 53830, 53406, 46152, 8431, 35751, 18637, 62078, 43318, 54777, 56161, 28410, 34719, 38157, 23525}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{49155, 1096, 46082, 64046, 34763, 27800, 10310, 3742, 31637, 14340, 42949, 60101, 26150, 9582, 12287, 61321, 23948, 34021}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_5).substring(25, 26).length() + 15, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, digitalCardActivity)).intValue();
            try {
                Object[] objArr11 = {-458696075};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - ((Process.getThreadPriority(0) + 20) >> 6)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1134, TextUtils.lastIndexOf("", '0', 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1967922515, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int i11 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i12 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b4 = $$a[7];
                    short s3 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b4, s3, (byte) (s3 | 52), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, i11, i12, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (46041 - AndroidCharacter.getMirror('0')), 1117 - View.MeasureSpec.getMode(0), View.resolveSize(0, 0) + 17), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int iMyPid = 15 - (Process.myPid() >> 22);
                    byte[] bArr2 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr2[132], (short) 104, bArr2[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, touchSlop, iMyPid, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{46028, 13994, 33205, 23108, 27180, 18756, 14972, 16309, 37085, 4414, 33982, 28300, 20251, 14387, 60385, 4277, 11985, 36280, 45887, 18428, 55867, 65399, 27288, 835}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_credit_card).substring(10, 12).length() + 20, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{15097, 21324, 12170, 50157, 44178, 11011, 21838, 27788, 62152, 15913, 24347, 42905, 9174, 31128, 19675, 44596, 59205, 54289}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_mandiri_ecash).substring(1, 3).length() + 13, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                        int size = View.MeasureSpec.getSize(0) + 15;
                        byte b5 = $$a[7];
                        short s4 = (short) (b5 | 52);
                        Object[] objArr17 = new Object[1];
                        c(b5, s4, (byte) s4, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iMakeMeasureSpec, size, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iBlue = Color.blue(0) + 1031;
                        int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b6 = $$a[7];
                        short s5 = b6;
                        Object[] objArr18 = new Object[1];
                        c(b6, s5, (byte) (s5 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iBlue, maxKeyCode, 1357589585, false, (String) objArr18[0], null);
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
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr2[2])[0];
            int i16 = ((int[]) objArr2[3])[0];
            int i17 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iMyTid = Process.myTid();
            int i18 = i15 + (((~((-141066753) | iMyTid)) | (-519698331)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 960140224 + ((~((~iMyTid) | (-141066753))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[2])[0] = i20 ^ (i20 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cGreen = (char) (29944 - Color.green(0));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                byte b7 = $$a[7];
                Object[] objArr20 = new Object[1];
                c(b7, (short) (b7 | 104), (byte) 37, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cGreen, iKeyCodeFromString, pressedStateDuration, 986134021, false, (String) objArr20[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int i21 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b8 = $$a[7];
                    short s6 = (short) (b8 | 52);
                    Object[] objArr21 = new Object[1];
                    c(b8, s6, (byte) s6, objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMakeMeasureSpec, i21, packedPositionGroup, 1599039318, false, (String) objArr21[0], null);
                }
                Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i22 = 631833220 + (((~(iFreeMemory | 548856692)) | 336073738) * 305) + (((~((~iFreeMemory) | 548856692)) | 336254266) * 305) + 1316507460;
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i24 ^ (i24 << 5);
            } else {
                Object[] objArr23 = new Object[1];
                e(new char[]{54151, 8725, 26151, 7731, 53830, 53406, 46152, 8431, 35751, 18637, 62078, 43318, 54777, 56161, 28410, 34719, 38157, 23525}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
                Class<?> cls4 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                e(new char[]{49155, 1096, 46082, 64046, 34763, 27800, 10310, 3742, 31637, 14340, 42949, 60101, 26150, 9582, 12287, 61321, 23948, 34021}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, digitalCardActivity)).intValue();
                Object[] objArr25 = {-458696075};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 42049), View.MeasureSpec.makeMeasureSpec(0, 0) + 1726, 29 - (ViewConfiguration.getPressedStateDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1316507460, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int iMyTid2 = 1755 - (Process.myTid() >> 22);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                    byte b9 = $$a[7];
                    short s7 = (short) (b9 | 52);
                    Object[] objArr26 = new Object[1];
                    c(b9, s7, (byte) s7, objArr26);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollDefaultDelay, iMyTid2, iIndexOf2, 1599039318, false, (String) objArr26[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr27 = new Object[1];
                    e(new char[]{46028, 13994, 33205, 23108, 27180, 18756, 14972, 16309, 37085, 4414, 33982, 28300, 20251, 14387, 60385, 4277, 11985, 36280, 45887, 18428, 55867, 65399, 27288, 835}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr27);
                    Class<?> cls5 = Class.forName((String) objArr27[0]);
                    Object[] objArr28 = new Object[1];
                    e(new char[]{15097, 21324, 12170, 50157, 44178, 11011, 21838, 27788, 62152, 15913, 24347, 42905, 9174, 31128, 19675, 44596, 59205, 54289}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bri).substring(1, 3).length() + 13, objArr28);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                        int iIndexOf3 = 1755 - TextUtils.indexOf("", "", 0, 0);
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                        byte b10 = $$a[7];
                        Object[] objArr29 = new Object[1];
                        c(b10, (short) (b10 | 141), (byte) 52, objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, iIndexOf3, iIndexOf4, 1596667560, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", ""));
                        int mode = 1755 - View.MeasureSpec.getMode(0);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                        byte b11 = $$a[7];
                        Object[] objArr30 = new Object[1];
                        c(b11, (short) (b11 | 104), (byte) 37, objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, mode, pressedStateDuration2, 986134021, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i25 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
            int i26 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            if (i26 == i25) {
                int i27 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
                Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                int i28 = i27 + (((~((-2164898) | startUptimeMillis2)) * 521) - 1844089492) + (((~((~startUptimeMillis2) | (-2164898))) | (-888536828)) * 521);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr31[3])[0] = i30 ^ (i30 << 5);
                int i31 = g + 9;
                f486a = i31 % 128;
                int i32 = i31 % 2;
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i26];
            int i33 = i26 - 1;
            iArr[i33] = 1;
            Toast.makeText((Context) null, iArr[((i26 * i33) % 2) - 1], 1).show();
            int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
            int i35 = 425661703 + (((~((-444290874) | startUptimeMillis3)) | 231688447) * (-318));
            int i36 = ~(231688447 | startUptimeMillis3);
            int i37 = ~startUptimeMillis3;
            int i38 = i34 + i35 + ((i36 | (~((-92539079) | i37))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(startUptimeMillis3 | (-92539079))) | (~(536829951 | i37))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr32[3])[0] = i40 ^ (i40 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i41 = f486a + 79;
                g = i41 % 128;
                int i42 = i41 % 2;
                arrayList2.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i14));
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -447090368
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
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DigitalCardActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1161264902
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
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.digitalcard.DigitalCardActivity.g
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.bpjstku.presentation.digitalcard.DigitalCardActivity.f486a = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
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
            int r4 = r4.densityDpi
            int r5 = ~r4
            r6 = 1044251781(0x3e3e0485, float:0.18556412)
            r7 = r6 | r5
            int r7 = ~r7
            r8 = 214264238(0xcc569ae, float:3.041626E-31)
            r7 = r7 | r8
            int r7 = r7 * (-90)
            r9 = 475278640(0x1c542d30, float:7.020332E-22)
            int r9 = r9 + r7
            r7 = r6 | r4
            int r7 = ~r7
            r10 = 842662913(0x323a0401, float:1.0827535E-8)
            r7 = r7 | r10
            int r7 = r7 * (-45)
            int r9 = r9 + r7
            r7 = -214264239(0xfffffffff33a9651, float:-1.4782959E31)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r6
            r5 = r5 | r8
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 45
            int r9 = r9 + r4
            if (r1 != r9) goto Lc0
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r2 = (int) r4
            int r4 = ~r2
            r5 = -625769350(0xffffffffdab3847a, float:-2.526484E16)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = -1953286616(0xffffffff8b933628, float:-5.6703826E-32)
            r7 = r7 | r2
            int r7 = ~r7
            r6 = r6 | r7
            int r6 = r6 * 1150
            r8 = 1385593784(0x52967bb8, float:3.2316038E11)
            int r8 = r8 + r6
            r6 = 1953286615(0x746cc9d7, float:7.504125E31)
            r6 = r6 | r4
            int r6 = ~r6
            r6 = r6 | r7
            int r6 = r6 * (-575)
            int r8 = r8 + r6
            r2 = r2 | r5
            int r2 = ~r2
            r5 = 625769349(0x254c7b85, float:1.773603E-16)
            r4 = r4 | r5
            int r4 = ~r4
            r2 = r2 | r4
            int r2 = r2 * 575
            int r8 = r8 + r2
            if (r1 == r8) goto Lbc
            int r1 = com.bpjstku.presentation.digitalcard.DigitalCardActivity.f486a
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.bpjstku.presentation.digitalcard.DigitalCardActivity.g = r2
            int r1 = r1 % r0
            r1 = -1161264902(0xffffffffbac880fa, float:-0.0015297227)
            int[] r1 = new int[r1]
            r2 = -1161264903(0xffffffffbac880f9, float:-0.0015297226)
            r4 = 1
            r1[r2] = r4
            r2 = 1423078186(0x54d2732a, float:7.231002E12)
            int r2 = r2 % r0
            r0 = -1
            r0 = r1[r0]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r4)
            r0.show()
        Lbc:
            super.onStart()
            return
        Lc0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DigitalCardActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 61;
        f486a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-653327748) + (((~((-746816032) | iIdentityHashCode)) | 1576803574) * (-318));
            int i5 = ~(1576803574 | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            if (i3 != i4 + ((i5 | (~(i6 | (-1367088353)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | (-1367088353))) | (~(2113904383 | i6))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
                throw null;
            }
        } else {
            int i7 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iMyPid = Process.myPid();
            int i8 = ~iMyPid;
            if (i7 != 1542320064 + (((~((-800679513) | i8)) | (-1630667056)) * (-602)) + (((~(iMyPid | (-800679513))) | 243885648 | (~((-1073873192) | i8))) * (-301)) + ((~(i8 | (-1630667056))) * 301)) {
                throw null;
            }
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 480665207;
        int i10 = 1287130652 + (((~(834597154 | length)) | 1744458810) * 672);
        int i11 = ~length;
        if (i9 != i10 + (((~(length | 1744458810)) | (~((-834597155) | i11))) * (-672)) + (((~((-1744458811) | i11)) | 1178600472) * 672)) {
            throw new RuntimeException("264066709");
        }
        super.onCreate(bundle);
        int i12 = f486a + 75;
        g = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ addMenuPresenter b(final DigitalCardActivity digitalCardActivity) {
        int i = 2 % 2;
        addMenuPresenter addmenupresenter = new addMenuPresenter(digitalCardActivity, ((getAdapter) digitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new ArrayList(), new Function1() { // from class: restoreHierarchyState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (DigitalCard) obj);
            }
        });
        int i2 = f486a + 9;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return addmenupresenter;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        DigitalCardActivity digitalCardActivity = (DigitalCardActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 55;
        f486a = i2 % 128;
        if (i2 % 2 == 0) {
            digitalCardActivity.onBackPressed();
            return Unit.INSTANCE;
        }
        digitalCardActivity.onBackPressed();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DigitalCardActivity digitalCardActivity, DigitalCard digitalCard) {
        int i = 2 % 2;
        int i2 = f486a + 11;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(digitalCard, "");
        if (i3 != 0) {
            DetailDigitalCardActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = DetailDigitalCardActivity.INSTANCE;
            DetailDigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(digitalCardActivity, digitalCard);
            return Unit.INSTANCE;
        }
        DetailDigitalCardActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = DetailDigitalCardActivity.INSTANCE;
        DetailDigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(digitalCardActivity, digitalCard);
        int i4 = 53 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if ((r10 instanceof VirtualCameraAdapter1.asBinder) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r0 = ((com.bpjstku.databinding.ActivityDigitalCardBinding) ((androidx.viewbinding.ViewBinding) r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDigitalCard;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0.setViewState(com.kennyc.view.MultiStateView.ViewState.CONTENT);
        ((defpackage.addMenuPresenter) r9.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((java.util.List) ((VirtualCameraAdapter1.asBinder) r10).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if ((r10 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r3 = ((com.bpjstku.databinding.ActivityDigitalCardBinding) ((androidx.viewbinding.ViewBinding) r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDigitalCard;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
        r10 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r10;
        defpackage.Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, r10.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, java.lang.String.valueOf(r10.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, new kotlin.Pair(r9.getString(com.bpjstku.R.string.action_return), new defpackage.onFinishInflate(r9)));
        r9 = com.bpjstku.presentation.digitalcard.DigitalCardActivity.f486a + 37;
        com.bpjstku.presentation.digitalcard.DigitalCardActivity.g = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r10 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r10 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r9 = ((com.bpjstku.databinding.ActivityDigitalCardBinding) ((androidx.viewbinding.ViewBinding) r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDigitalCard;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r9.setViewState(com.kennyc.view.MultiStateView.ViewState.LOADING);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final com.bpjstku.presentation.digitalcard.DigitalCardActivity r9, defpackage.VirtualCameraAdapter1 r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.digitalcard.DigitalCardActivity.g
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.bpjstku.presentation.digitalcard.DigitalCardActivity.f486a = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L1a
            boolean r1 = r10 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r3 = 33
            int r3 = r3 / 0
            r3 = 1
            if (r1 == r3) goto L1e
            goto L33
        L1a:
            boolean r1 = r10 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r1 == 0) goto L33
        L1e:
            kotlin.Lazy r9 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r9 = r9.getValue()
            androidx.viewbinding.ViewBinding r9 = (androidx.viewbinding.ViewBinding) r9
            com.bpjstku.databinding.ActivityDigitalCardBinding r9 = (com.bpjstku.databinding.ActivityDigitalCardBinding) r9
            com.kennyc.view.MultiStateView r9 = r9.msvDigitalCard
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            com.kennyc.view.MultiStateView$ViewState r10 = com.kennyc.view.MultiStateView.ViewState.LOADING
            r9.setViewState(r10)
            return
        L33:
            boolean r1 = r10 instanceof VirtualCameraAdapter1.asBinder
            if (r1 == 0) goto L5d
            kotlin.Lazy r0 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r0 = r0.getValue()
            androidx.viewbinding.ViewBinding r0 = (androidx.viewbinding.ViewBinding) r0
            com.bpjstku.databinding.ActivityDigitalCardBinding r0 = (com.bpjstku.databinding.ActivityDigitalCardBinding) r0
            com.kennyc.view.MultiStateView r0 = r0.msvDigitalCard
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.kennyc.view.MultiStateView$ViewState r1 = com.kennyc.view.MultiStateView.ViewState.CONTENT
            r0.setViewState(r1)
            VirtualCameraAdapter1$asBinder r10 = (VirtualCameraAdapter1.asBinder) r10
            T r10 = r10.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.List r10 = (java.util.List) r10
            kotlin.Lazy r9 = r9.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r9 = r9.getValue()
            addMenuPresenter r9 = (defpackage.addMenuPresenter) r9
            r9.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r10)
            return
        L5d:
            boolean r1 = r10 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r1 == 0) goto L99
            kotlin.Lazy r1 = r9.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r1 = r1.getValue()
            androidx.viewbinding.ViewBinding r1 = (androidx.viewbinding.ViewBinding) r1
            com.bpjstku.databinding.ActivityDigitalCardBinding r1 = (com.bpjstku.databinding.ActivityDigitalCardBinding) r1
            com.kennyc.view.MultiStateView r3 = r1.msvDigitalCard
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r10 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r10
            java.lang.Throwable r4 = r10.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.String r10 = r10.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r6 = java.lang.String.valueOf(r10)
            r10 = 2132017289(0x7f140089, float:1.9672852E38)
            java.lang.String r10 = r9.getString(r10)
            onFinishInflate r1 = new onFinishInflate
            r1.<init>()
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r10, r1)
            r5 = 0
            r7 = 0
            defpackage.Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, r4, r5, r6, r7, r8)
            int r9 = com.bpjstku.presentation.digitalcard.DigitalCardActivity.f486a
            int r9 = r9 + 37
            int r10 = r9 % 128
            com.bpjstku.presentation.digitalcard.DigitalCardActivity.g = r10
            int r9 = r9 % r0
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.digitalcard.DigitalCardActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DigitalCardActivity digitalCardActivity) {
        int iB = zzn.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(826404868, zzn.b(), iB, -826404867, zzn.b(), zzn.b(), new Object[]{digitalCardActivity});
    }

    static {
        asInterface = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 93;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f486a;
        int i3 = i2 + 101;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_digital_card;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 63;
        f486a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 49;
        f486a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f486a + 117;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iB = zzn.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(873516290, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), iB, -873516290, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), zzn.b(), new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f486a + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentbindingInflater1 = HttpHeaderParser.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(2132088640, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, -2132088638, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), zzn.b(), new Object[]{this, context});
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = (char) 60813;
        b = (char) 14679;
        asBinder = (char) 33160;
        d = (char) 57052;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.digitalcard.DigitalCardActivity.$$c
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r8 = r8 * 4
            int r8 = r8 + 108
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DigitalCardActivity.$$i(byte, byte, short):java.lang.String");
    }
}
