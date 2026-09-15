package com.bpjstku.presentation.ewallet;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.databinding.ActivityEwalletUnlinkBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.ewallet.EwalletUnlinkActivity;
import com.bpjstku.presentation.ewallet.model.DataEwalletDetail;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.createByte;
import defpackage.createDouble;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getHeaderTitle;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onItemVisibleChanged;
import defpackage.onResume;
import defpackage.removeGroup;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0016\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001bR\u0016\u0010\b\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/ewallet/EwalletUnlinkActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityEwalletUnlinkBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LgetHeaderTitle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/ewallet/model/DataEwalletDetail;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "LremoveGroup;", "LremoveGroup;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EwalletUnlinkActivity extends BindingBaseActivity<ActivityEwalletUnlinkBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static char[] d;
    private static int g;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: findItemIndex
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EwalletUnlinkActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private removeGroup a;
    private static final byte[] $$c = {68, 83, 49, -116};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {46, 47, -18, 64, 9, -20, 28, -27, -10, 2, -10, 2, 14, -24, -16, 6, -1, -24, 6, -10, 2, 16, -24, -17, -9, 11, -19, -6};
    private static final int $$k = 235;
    private static final byte[] $$a = {33, -59, 107, -108, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 252;
    private static int cancel = 1;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f490a = 1;

    public static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            createDouble.b[0] = createByte.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i2));
        int i11 = (~(i4 | i2)) | (~((~i2) | i7 | i9));
        int i12 = i7 | i2 | i9;
        int i13 = i2 + i6 + i + (1362283521 * i3) + ((-853422242) * i5);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i2) - 1228931072) + ((-782767794) * i6) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i * 465567744) + (465567744 * i3) + (1887436800 * i5) + ((-1154482176) * i14);
        int i16 = ((i2 * 722868660) - 41817558) + (i6 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i * 722869185) + (i3 * 1172694977) + (i5 * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        final EwalletUnlinkActivity ewalletUnlinkActivity = (EwalletUnlinkActivity) objArr[0];
        int i18 = 2 % 2;
        ((getHeaderTitle) ewalletUnlinkActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(ewalletUnlinkActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: findItemWithShortcutForKey
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EwalletUnlinkActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i19 = f490a + 77;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    private static void c(int i, byte b, int i2, Object[] objArr) {
        int i3 = 144 - i;
        int i4 = (i2 * 14) + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - b];
        int i5 = 52 - b;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (i4 + i3) - 11;
            i3 = i3;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3 + 1;
            i6 = i7;
            i4 = (i4 + bArr[i8]) - 11;
            i3 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 17
            int r7 = 115 - r7
            byte[] r0 = com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.$$j
            int r8 = r8 * 24
            int r1 = 25 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = 24 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-5)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.f(short, short, byte, java.lang.Object[]):void");
    }

    public EwalletUnlinkActivity() {
        final EwalletUnlinkActivity ewalletUnlinkActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.ewallet.EwalletUnlinkActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = ewalletUnlinkActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final EwalletUnlinkActivity ewalletUnlinkActivity2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getHeaderTitle>() { // from class: com.bpjstku.presentation.ewallet.EwalletUnlinkActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getHeaderTitle] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getHeaderTitle invoke() {
                LifecycleOwner lifecycleOwner = ewalletUnlinkActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getHeaderTitle.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.ewallet.EwalletUnlinkActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/ewallet/EwalletUnlinkActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/ewallet/model/DataEwalletDetail;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/ewallet/model/DataEwalletDetail;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, DataEwalletDetail p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) EwalletUnlinkActivity.class);
            intent.putExtra("data_ewallet", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityEwalletUnlinkBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        f490a = i2 % 128;
        int i3 = i2 % 2;
        EwalletUnlinkActivity$bindingInflater$1 ewalletUnlinkActivity$bindingInflater$1 = EwalletUnlinkActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = asInterface + 49;
        f490a = i4 % 128;
        if (i4 % 2 != 0) {
            return ewalletUnlinkActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityEwalletUnlinkBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).unlinkEwallet;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getHeaderIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EwalletUnlinkActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = asInterface + 31;
        f490a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityEwalletUnlinkBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityEwalletUnlinkBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_e_wallet));
        EwalletUnlinkActivity ewalletUnlinkActivity = this;
        this.a = new removeGroup(ewalletUnlinkActivity, ((DataEwalletDetail) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1);
        RecyclerView recyclerView = ((ActivityEwalletUnlinkBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvEwallet;
        recyclerView.setLayoutManager(new LinearLayoutManager(ewalletUnlinkActivity));
        removeGroup removegroup = this.a;
        if (removegroup == null) {
            int i2 = f490a + 83;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            removegroup = null;
        }
        recyclerView.setAdapter(removegroup);
        int i4 = asInterface + 49;
        f490a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f490a + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = asInterface + 3;
            f490a = i4 % 128;
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

    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:37:0x016b A[Catch: all -> 0x0346, TryCatch #0 {all -> 0x0346, blocks: (B:7:0x001e, B:9:0x002c, B:10:0x0057, B:14:0x006f, B:16:0x0082, B:17:0x00af, B:35:0x0120, B:37:0x016b, B:38:0x01da, B:42:0x01f8, B:44:0x0234, B:46:0x029d), top: B:66:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:44:0x0234 A[Catch: all -> 0x0346, TryCatch #0 {all -> 0x0346, blocks: (B:7:0x001e, B:9:0x002c, B:10:0x0057, B:14:0x006f, B:16:0x0082, B:17:0x00af, B:35:0x0120, B:37:0x016b, B:38:0x01da, B:42:0x01f8, B:44:0x0234, B:46:0x029d), top: B:66:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x029b  */
    /* JADX WARN: Code duplicated, block: B:48:0x02be  */
    /* JADX WARN: Code duplicated, block: B:50:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x02f9  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = d;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2267 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(asBinder)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b4 = (byte) 0;
            byte b5 = b4;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2267 - (Process.myTid() >> 22), 33 - (ViewConfiguration.getEdgeSlop() >> 16), -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i6 = $10 + 49;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - Color.argb(0, 0, 0, 0)), 3261 - View.MeasureSpec.getSize(0), 30 - TextUtils.indexOf("", "", 0), -127612708, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i7 = $10 + 1;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 22879), (-16776622) - Color.rgb(0, 0, 0), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1570859318, false, $$i(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i10 = $10 + 65;
                                $11 = i10 % 128;
                                int i11 = i10 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - Color.argb(0, 0, 0, 0)), 3261 - View.MeasureSpec.getSize(0), 30 - TextUtils.indexOf("", "", 0), -127612708, false, $$i(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i16 = $10 + 1;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 22879), (-16776622) - Color.rgb(0, 0, 0), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1570859318, false, $$i(b12, b13, (byte) (b13 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i19 = $10 + 65;
                                $11 = i19 % 128;
                                int i110 = i19 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i111 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i111];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                            } else {
                                int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = $10 + 107;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                cArr4[i20] = (char) (cArr4[i20] ^ 23562);
                i20 += 60;
            } else {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArr3;
        EwalletUnlinkActivity ewalletUnlinkActivity = (EwalletUnlinkActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) Color.green(0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
            int defaultSize = View.getDefaultSize(0, 0) + 15;
            short s = (short) ($$b & 55);
            byte b = $$a[7];
            Object[] objArr4 = new Object[1];
            c(s, b, b, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iLastIndexOf, defaultSize, 1357589585, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        e(new char[]{1, 7, '\n', 20, '\n', 2, 6, '\n', 11, 2, 14, 6, 1, 6, 1, 19, 15, 23, 22, 14, '\t', '\f'}, (byte) (46 - (ViewConfiguration.getTouchSlop() >> 8)), 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        e(new char[]{19, 21, 3, 7, 6, 21, '\b', 20, 17, 1, 4, '\t', 3, 15, 13903}, (byte) (80 - (ViewConfiguration.getScrollBarSize() >> 8)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i2 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
            byte b2 = $$a[7];
            Object[] objArr7 = new Object[1];
            c((short) 141, b2, b2, objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, maximumFlingVelocity, 1344079056, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                Object[] objArr8 = new Object[1];
                c((short) 141, (byte) ($$b & 55), $$a[80], objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iLastIndexOf2, scrollBarSize, 632103528, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr9[3])[0];
            int i4 = ((int[]) objArr9[1])[0];
            String[] strArr = (String[]) objArr9[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = (((1972551637 + ((~((~elapsedCpuTime) | (-1087767))) * (-116))) + ((786908360 | elapsedCpuTime) * 116)) + (((~(elapsedCpuTime | 542628190)) | 245367936) * 116)) - 563836169;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr2[2])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            e(new char[]{17, 4, '\f', 0, 14, 21, 1, 7, 21, '\f', 6, 24, 2, 0, 17, 19}, (byte) (97 - ((Process.getThreadPriority(0) + 20) >> 6)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).codePointAt(0) - 81, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{5, '\n', 21, 11, 0, 1, 1, 24, '\f', 3, 2, 4, 22, '\n', 6, 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step3).substring(0, 1).length() + 121), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 100, objArr11);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr11[0], Object.class).invoke(null, ewalletUnlinkActivity)).intValue();
            try {
                Object[] objArr12 = {1579569084};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1133, 18 - (ViewConfiguration.getTouchSlop() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr13 = {Integer.valueOf(iIntValue), 0, -563836169, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr12), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    short s2 = (short) ($$b & 55);
                    byte b3 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c(s2, b3, b3, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, maximumDrawingCacheSize, i8, 1298546779, false, (String) objArr14[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 1117, View.combineMeasuredStates(0, 0) + 17), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                    Object[] objArr15 = new Object[1];
                    c((short) 141, (byte) ($$b & 55), $$a[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, packedPositionChild, iResolveOpacity, 632103528, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{1, 7, '\n', 20, '\n', 2, 6, '\n', 11, 2, 14, 6, 1, 6, 1, 19, 15, 23, 22, 14, '\t', '\f'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 52), (KeyEvent.getMaxKeyCode() >> 16) + 22, objArr16);
                    Class<?> cls3 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{19, 21, 3, 7, 6, 21, '\b', 20, 17, 1, 4, '\t', 3, 15, 13903}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_3).substring(3, 4).length() + 79), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step3).substring(0, 1).length() + 14, objArr17);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int i9 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                        byte b4 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        c((short) 141, b4, b4, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, i9, packedPositionType, 1344079056, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 16;
                        short s3 = (short) ($$b & 55);
                        byte b5 = $$a[7];
                        Object[] objArr19 = new Object[1];
                        c(s3, b5, b5, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveOpacity, iIndexOf, iLastIndexOf3, 1357589585, false, (String) objArr19[0], null);
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
        int i10 = ((int[]) objArr2[1])[0];
        int i11 = ((int[]) objArr2[3])[0];
        if (i11 == i10) {
            int i12 = asInterface + 19;
            f490a = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr2[2])[0];
            int i15 = ((int[]) objArr2[3])[0];
            int i16 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iMyUid = Process.myUid();
            int i17 = ~iMyUid;
            int i18 = i14 + (-968507368) + (((~(i17 | (-375439815))) | 619719984) * (-1042)) + (((-375439815) | iMyUid) * 521) + (((~(iMyUid | (-619719985))) | 546319408 | (~(i17 | (-302039239)))) * 521);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr20[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i21 = asInterface + 35;
                    f490a = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            Object[] objArr21 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr2[2])[0];
            int i24 = ((int[]) objArr2[3])[0];
            int i25 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i26 = ~iMaxMemory;
            int i27 = i23 + 1873657757 + ((iMaxMemory | (-300818914)) * 140) + (((~((-300818914) | i26)) | 7078209) * (-280)) + (((~(iMaxMemory | (-7078210))) | (~(545099083 | i26)) | (-838839788)) * 140);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr21[2])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSize2 = (char) (View.resolveSize(0, 0) + 29944);
            int i30 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
            int i31 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
            byte[] bArr = $$a;
            Object[] objArr22 = new Object[1];
            c((short) 89, (byte) (bArr[33] - 1), bArr[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSize2, i30, i31, 986134021, false, (String) objArr22[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iAlpha = 1755 - Color.alpha(0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                byte b6 = $$a[7];
                Object[] objArr23 = new Object[1];
                c((short) 141, b6, b6, objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, iAlpha, offsetAfter, 1599039318, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr24[0])[0]}, new int[]{((int[]) objArr24[1])[0]}, (Object[]) objArr24[2], new int[1], (String[]) objArr24[4]};
            int iMyPid = Process.myPid();
            int i32 = ((374948539 + (((-285229131) | (~iMyPid)) * (-490))) + (((~(iMyPid | 752857905)) | (-1038087036)) * 490)) - 703464811;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr3[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr25 = new Object[1];
            e(new char[]{17, 4, '\f', 0, 14, 21, 1, 7, 21, '\f', 6, 24, 2, 0, 17, 19}, (byte) (KeyEvent.keyCodeFromString("") + 97), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr25);
            Class<?> cls4 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            e(new char[]{5, '\n', 21, 11, 0, 1, 1, 24, '\f', 3, 2, 4, 22, '\n', 6, 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 111), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr26);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr26[0], Object.class).invoke(null, ewalletUnlinkActivity)).intValue();
            Object[] objArr27 = {1579569084};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - KeyEvent.keyCodeFromString("")), 1725 - MotionEvent.axisFromString(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr27), -74304691);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cGreen2 = (char) (Color.green(0) + 29944);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                byte b7 = $$a[7];
                Object[] objArr28 = new Object[1];
                c((short) 141, b7, b7, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cGreen2, maxKeyCode, minimumFlingVelocity, 1599039318, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr29 = new Object[1];
                e(new char[]{1, 7, '\n', 20, '\n', 2, 6, '\n', 11, 2, 14, 6, 1, 6, 1, 19, 15, 23, 22, 14, '\t', '\f'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_bad_response_server).substring(0, 24).length() - 2, objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e(new char[]{19, 21, 3, 7, 6, 21, '\b', 20, 17, 1, 4, '\t', 3, 15, 13903}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.currency_invalid).substring(15, 16).length() + 79), 15 - Color.argb(0, 0, 0, 0), objArr30);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int maxKeyCode2 = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                    short s4 = $$a[7];
                    byte b8 = (byte) s4;
                    Object[] objArr31 = new Object[1];
                    c(s4, b8, b8, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(fadingEdgeLength, maxKeyCode2, packedPositionGroup, 1596667560, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                    int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr32 = new Object[1];
                    c((short) 89, (byte) (bArr2[33] - 1), bArr2[7], objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAxisFromString, capsMode, iCombineMeasuredStates, 986134021, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr3 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr3[1])[0];
        int i36 = ((int[]) objArr3[0])[0];
        if (i36 == i35) {
            int i37 = asInterface + 35;
            f490a = i37 % 128;
            int i38 = i37 % 2;
            int i39 = ((int[]) objArr3[3])[0];
            Object[] objArr33 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int i40 = (int) Runtime.getRuntime().totalMemory();
            int i41 = ~i40;
            int i42 = i39 + (-1144866607) + (((~((-89729684) | i41)) | 89137794) * 168) + ((~((-89137795) | i40)) * 168) + (((~(i40 | (-591890))) | (~(i41 | (-122872743))) | 33734948) * 168);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr33[3])[0] = i44 ^ (i44 << 5);
            int i45 = f490a + 23;
            asInterface = i45 % 128;
            int i46 = i45 % 2;
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArr3[4];
        if (strArr5 != null) {
            for (String str2 : strArr5) {
                int i47 = asInterface + 59;
                f490a = i47 % 128;
                int i48 = i47 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i36 / (((i36 - 1) * i36) % 2), 0).show();
        int i49 = ((int[]) objArr3[3])[0];
        Object[] objArr34 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i50 = ~iMaxMemory2;
        int i51 = i49 + 1082671776 + ((iMaxMemory2 | 706803087) * (-859)) + (((~(iMaxMemory2 | (-570429579))) | (~(706803087 | i50))) * 859) + (((~(494200661 | i50)) | (-1064630240)) * 859);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr34[3])[0] = i53 ^ (i53 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        f490a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i4 != (-1541134816) + (((-2556165) | iMyPid) * (-627)) + (((~(950512605 | iMyPid)) | 120525062) * (-627)) + (((~(iMyPid | 120525062)) | (~((~iMyPid) | (-950512606)))) * 627)) {
            throw new RuntimeException("-324375475");
        }
        int i5 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~((-1895411086) | iIdentityHashCode);
        int i7 = ~iIdentityHashCode;
        if (i5 != 634896560 + ((i6 | (~(2030026703 | i7))) * (-406)) + ((~((-1346381825) | i7)) * (-406)) + (((~(iIdentityHashCode | (-683644880))) | (~(1895411085 | i7))) * 406)) {
            throw null;
        }
        super.onResume();
        int i8 = asInterface + 17;
        f490a = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f490a + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        if (i4 != ((853039694 + (((-154402821) | i5) * (-381))) + (((~((~i5) | (-993338397))) | 847883609) * 381)) - 1302067724) {
            int i6 = 384435140 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i9 = 1178985164 + ((i8 | 201785450) * (-50));
        int i10 = ~((-201457763) | i8);
        int i11 = ~i8;
        if (i7 != i9 + ((i10 | (~(2119154543 | i11))) * 50) + (((~(i11 | 201785450)) | (~(1917696781 | i11)) | (-2119154544)) * 50)) {
            throw null;
        }
        super.onStart();
        int i12 = asInterface + 103;
        f490a = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c9, code lost:
    
        if (r1 != ((((-1661831708) + (((~((-1661062116) | r2)) | (-917993850)) * (-948))) + ((~((~r2) | (-570509666))) * (-948))) + 1243394788)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cb, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.asInterface + 5;
        com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.f490a = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        if ((r11 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        r11 = 26 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00dd, code lost:
    
        r11 = 415441120 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e7, code lost:
    
        r11 = 1624164062 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if (r1 == ((504564364 + (((~(1730860534 | r6)) | (-900872992)) * (-964))) + (((~((~r6) | 1730860534)) | (-2008743936)) * (-964)))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0084, code lost:
    
        if (r1 == (((-1806733070) + (((~((~r6) | 61877557)) | 872988680) * 529)) + (((~(r6 | 61877557)) | 891865100) * 529))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0086, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ DataEwalletDetail TuitionPaymentFragmentspecialinlinedviewModeldefault2(EwalletUnlinkActivity ewalletUnlinkActivity) {
        int i = 2 % 2;
        int i2 = f490a + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = ewalletUnlinkActivity.getIntent().getParcelableExtra("data_ewallet");
            Intrinsics.checkNotNull(parcelableExtra);
            return (DataEwalletDetail) parcelableExtra;
        }
        Parcelable parcelableExtra2 = ewalletUnlinkActivity.getIntent().getParcelableExtra("data_ewallet");
        Intrinsics.checkNotNull(parcelableExtra2);
        int i3 = 29 / 0;
        return (DataEwalletDetail) parcelableExtra2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(EwalletUnlinkActivity ewalletUnlinkActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = f490a;
        int i3 = i2 + 83;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i6 = i2 + 49;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                ewalletUnlinkActivity.MediaBrowserCompat();
                throw null;
            }
            ewalletUnlinkActivity.MediaBrowserCompat();
            str = "loading_check_connect_motionpay";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = i4 + 121;
            f490a = i7 % 128;
            if (i7 % 2 == 0) {
                ewalletUnlinkActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "MotionPay telah berhasil dihapus dari akun JMO.", 0).show();
                MainActivity.Companion companion = MainActivity.INSTANCE;
                MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ewalletUnlinkActivity, null, null, 102);
                ewalletUnlinkActivity.d_();
            } else {
                ewalletUnlinkActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "MotionPay telah berhasil dihapus dari akun JMO.", 1).show();
                MainActivity.Companion companion2 = MainActivity.INSTANCE;
                MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ewalletUnlinkActivity, null, null, 6);
                ewalletUnlinkActivity.d_();
            }
            str = "success_check_connect_motionpay";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ewalletUnlinkActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_ewallet_motion_connect", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EwalletUnlinkActivity ewalletUnlinkActivity) throws Throwable {
        String str;
        Object[] objArr;
        int i = 2 % 2;
        final getHeaderTitle getheadertitle = (getHeaderTitle) ewalletUnlinkActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) ewalletUnlinkActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            int i2 = f490a + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            str = userAsBinder.b;
        } else {
            str = null;
        }
        MotionUnlinkRequest motionUnlinkRequest = new MotionUnlinkRequest(String.valueOf(str));
        Intrinsics.checkNotNullParameter(motionUnlinkRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getheadertitle.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec<BaseModel> derivecodecB = getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(motionUnlinkRequest);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
            int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
            int i5 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c((short) 141, (byte) ($$b & 55), $$a[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetBefore, i5, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{1, 7, '\n', 20, '\n', 2, 6, '\n', 11, 2, 14, 6, 1, 6, 1, 19, 15, 23, 22, 14, '\t', '\f'}, (byte) (ImageFormat.getBitsPerPixel(0) + 47), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{19, 21, 3, 7, 6, 21, '\b', 20, 17, 1, 4, '\t', 3, 15, 13903}, (byte) (80 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 15 - View.getDefaultSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int gidForName = Process.getGidForName("") + 922;
            int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
            byte b = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 141, b, b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, gidForName, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                int i6 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 89, (byte) (bArr[33] - 1), bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, scrollBarSize, i6, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i7 = 685251801 + (((~((~iUptimeMillis) | (-774771197))) | 999308447) * (-235)) + (((~((-774771197) | iUptimeMillis)) | 999308447) * (-470)) + (((~(iUptimeMillis | (-70123873))) | 294661123) * 235) + 199374748;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = asInterface + 67;
                f490a = i10 % 128;
                if (i10 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            e(new char[]{17, 4, '\f', 0, 14, 21, 1, 7, 21, '\f', 6, 24, 2, 0, 17, 19}, (byte) (96 - TextUtils.lastIndexOf("", '0')), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{5, '\n', 21, 11, 0, 1, 1, 24, '\f', 3, 2, 4, 22, '\n', 6, 15}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 121), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, getheadertitle)).intValue();
            int i11 = asInterface + 47;
            f490a = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(iIntValue), 0, 199374748};
                byte[] bArr2 = $$j;
                byte b2 = bArr2[16];
                byte b3 = (byte) (b2 + 1);
                Object[] objArr11 = new Object[1];
                f(b2, b3, b3, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = (byte) (-bArr2[16]);
                Object[] objArr12 = new Object[1];
                f((byte) 23, b4, b4, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetBefore2 = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                    int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                    byte[] bArr3 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) 89, (byte) (bArr3[33] - 1), bArr3[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore2, iResolveSizeAndState, tapTimeout, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{1, 7, '\n', 20, '\n', 2, 6, '\n', 11, 2, 14, 6, 1, 6, 1, 19, 15, 23, 22, 14, '\t', '\f'}, (byte) (46 - View.resolveSize(0, 0)), 21 - ExpandableListView.getPackedPositionChild(0L), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{19, 21, 3, 7, 6, 21, '\b', 20, 17, 1, 4, '\t', 3, 15, 13903}, (byte) (81 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                        int iAlpha = 921 - Color.alpha(0);
                        int iIndexOf = 28 - TextUtils.indexOf("", "", 0);
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iAlpha, iIndexOf, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                        int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                        int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        Object[] objArr18 = new Object[1];
                        c((short) 141, (byte) ($$b & 55), $$a[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, iCombineMeasuredStates, longPressTimeout, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i15 = f490a + 73;
                asInterface = i15 % 128;
                while (true) {
                    int i16 = i15 % 2;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i4]);
                    i4++;
                    i15 = asInterface + 109;
                    f490a = i15 % 128;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iMyTid = Process.myTid();
        int i18 = i17 + ((((-416573316) + (((-10889492) | iMyTid) * (-381))) + (((~((~iMyTid) | 1729630952)) | (-1706961244)) * 381)) - 146071225);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        Object obj = objArr19[0];
        ((int[]) obj)[0] = i20 ^ (i20 << 5);
        int i21 = ((int[]) obj)[0];
        int i22 = i21 * i21;
        int i23 = -(1934556879 * i21);
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        int i25 = -(i21 * 2029532663);
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        int i27 = ((i26 | (-668122551)) << 1) - ((-668122551) ^ i26);
        int i28 = i27 >> 16;
        int i29 = (((-131071) & i28) + (i28 | (-131071))) / 65536;
        int i30 = -(((i27 - (~(((i29 | 1) << 1) - (i29 ^ 1)))) - 1) ^ ((((i27 >> 18) - 32767) / 16384) + 1));
        int i31 = (i30 & 1) + (i30 | 1);
        int i32 = ((i31 >> 24) - 511) / 256;
        int i33 = (i32 & 1) + (i32 | 1);
        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 5856 / (((-((i33 & 1) + (i33 | 1))) & i31) * 1952)), "transformer is null")).TuitionPaymentFragmentbindingInflater1(derivecodecB));
        if (derivecodecB2 != null) {
            final Function1 function1 = new Function1() { // from class: getExpandedItem
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return getHeaderTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getheadertitle, (BaseModel) obj2);
                }
            };
            logToString logtostring = new logToString() { // from class: getVisibleItems
                private static final byte[] $$c = {80, -8, 43, 65};
                private static final int $$f = 117;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {56, 94, 119, -19, 15, 1, -60, 55, 17, -3, 12, 4, -6, 13, -68, 69, 5, -10, 17, -11, 12, 9, -16, 22, -8, 9, 2, -61, 69, 5, 0, 1, 5, -62, 25, 36, 18, -16, 11, 6, -25, 37, 0, 1, 5, -43, 37, 20, -8, 16, -10, 14, 8, -82, 82, 0, -8, 1, 9, -5, 14, -69, 3, 72, 8, 1, 0, 8, -6, 2, -61, 72, 8, -1, -2, 1, 20, -77, 67, 4, 4, -2, 23, -6, 11, -77, 16, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
                private static final int $$e = 142;
                private static final byte[] $$a = {119, -103, 14, -22, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
                private static final int $$b = 12;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                private static char[] TuitionPaymentFragmentbindingInflater1 = {60072, 60041, 60052, 60050, 60051, 60053, 60062, 60054, 60060, 60045, 60088, 60043, 60073, 60056, 60117, 60040, 60055, 60058, 60075, 60047, 60048, 60083, 60034, 60063, 60049};
                private static char b = 57188;

                /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 15
                        int r0 = r7 + 38
                        int r6 = r6 + 4
                        byte[] r1 = defpackage.getVisibleItems.$$a
                        int r8 = r8 * 4
                        int r8 = 84 - r8
                        byte[] r0 = new byte[r0]
                        int r7 = r7 + 37
                        r2 = 0
                        if (r1 != 0) goto L17
                        r3 = r8
                        r4 = r2
                        r8 = r6
                        goto L2e
                    L17:
                        r3 = r2
                    L18:
                        int r6 = r6 + 1
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L29
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L29:
                        r3 = r1[r6]
                        r5 = r8
                        r8 = r6
                        r6 = r5
                    L2e:
                        int r3 = -r3
                        int r6 = r6 + r3
                        int r6 = r6 + (-11)
                        r3 = r4
                        r5 = r8
                        r8 = r6
                        r6 = r5
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getVisibleItems.a(short, int, short, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 46
                        int r7 = 84 - r7
                        int r8 = r8 * 83
                        int r8 = r8 + 4
                        byte[] r0 = defpackage.getVisibleItems.$$d
                        int r6 = r6 * 15
                        int r6 = 99 - r6
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r8
                        r4 = r2
                        goto L28
                    L16:
                        r3 = r2
                    L17:
                        int r4 = r3 + 1
                        byte r5 = (byte) r6
                        r1[r3] = r5
                        if (r4 != r7) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L26:
                        r3 = r0[r8]
                    L28:
                        int r8 = r8 + 1
                        int r6 = r6 + r3
                        int r6 = r6 + (-3)
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getVisibleItems.d(short, byte, byte, java.lang.Object[]):void");
                }

                @Override // defpackage.logToString
                public final void accept(Object obj2) throws Throwable {
                    Object[] objArr20;
                    int i34 = 2 % 2;
                    int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
                    int i36 = i35 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAlpha = (char) (43042 - Color.alpha(0));
                        int i37 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3111;
                        int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr4 = $$a;
                        Object[] objArr21 = new Object[1];
                        a(bArr4[132], bArr4[5], bArr4[7], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, i37, maximumDrawingCacheSize, -1272852037, false, (String) objArr21[0], null);
                    }
                    long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                    Object[] objArr22 = new Object[1];
                    c(new char[]{15, 7, 21, 3, 3, 4, 24, '\r', 0, 17, '\n', 4, 20, 17, 16, '\t', 5, '\f', 17, 1, '\n', 23}, (byte) (41 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    c(new char[]{11, 21, 16, '\f', 16, 5, 22, '\r', 7, 16, 17, 15, 2, '\b', 13849}, (byte) (25 - ((byte) KeyEvent.getModifierMetaStateMask())), 15 - (Process.myPid() >> 22), objArr23);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                        int packedPositionType = 3111 - ExpandableListView.getPackedPositionType(0L);
                        int iBlue = Color.blue(0) + 22;
                        byte[] bArr5 = $$a;
                        Object[] objArr24 = new Object[1];
                        a((byte) 51, bArr5[5], bArr5[7], objArr24);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, packedPositionType, iBlue, -1269618118, false, (String) objArr24[0], null);
                    }
                    if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042);
                            int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0');
                            byte[] bArr6 = $$a;
                            byte b6 = (byte) (-bArr6[1]);
                            byte b7 = bArr6[7];
                            Object[] objArr25 = new Object[1];
                            a(b6, b7, b7, objArr25);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(minimumFlingVelocity, doubleTapTimeout, iLastIndexOf2, 154975793, false, (String) objArr25[0], null);
                        }
                        Object[] objArr26 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                        int i38 = ((int[]) objArr26[2])[0];
                        int i39 = ((int[]) objArr26[1])[0];
                        String[] strArr2 = (String[]) objArr26[3];
                        int[] iArr = {i38};
                        int i40 = ~System.identityHashCode(this);
                        int i41 = ((1002156970 + (((-301998171) | i40) * 494)) + (((~(i40 | 771509924)) | (-441984731)) * 494)) - 670293437;
                        int i42 = (i41 << 13) ^ i41;
                        int i43 = i42 ^ (i42 >>> 17);
                        ((int[]) objArr20[0])[0] = i43 ^ (i43 << 5);
                        objArr20 = new Object[]{new int[1], new int[]{i39}, iArr, strArr2};
                    } else {
                        Object[] objArr27 = new Object[1];
                        c(new char[]{22, 19, 7, 19, 11, 19, 15, 7, '\t', '\r', 2, 20, 16, 15, 7, '\b'}, (byte) (30 - View.getDefaultSize(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, objArr27);
                        Class<?> cls6 = Class.forName((String) objArr27[0]);
                        Object[] objArr28 = new Object[1];
                        c(new char[]{'\b', 3, 7, 6, 18, 4, 17, 24, 22, 16, 19, 0, '\f', 0, 21, '\b'}, (byte) (36 - (KeyEvent.getMaxKeyCode() >> 16)), Drawable.resolveOpacity(0, 0) + 16, objArr28);
                        int iIntValue2 = ((Integer) cls6.getMethod((String) objArr28[0], Object.class).invoke(null, this)).intValue();
                        int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i44 % 128;
                        int i45 = i44 % 2;
                        try {
                            Object[] objArr29 = {null, Integer.valueOf(iIntValue2), 0, -670293437};
                            byte[] bArr7 = $$d;
                            byte b8 = bArr7[30];
                            byte b9 = b8;
                            Object[] objArr30 = new Object[1];
                            d(b8, b9, b9, objArr30);
                            Class<?> cls7 = Class.forName((String) objArr30[0]);
                            byte b10 = bArr7[5];
                            byte b11 = b10;
                            Object[] objArr31 = new Object[1];
                            d(b10, b11, b11, objArr31);
                            objArr20 = (Object[]) cls7.getMethod((String) objArr31[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr29);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
                                int i46 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int doubleTapTimeout2 = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                byte[] bArr8 = $$a;
                                byte b12 = (byte) (-bArr8[1]);
                                byte b13 = bArr8[7];
                                Object[] objArr32 = new Object[1];
                                a(b12, b13, b13, objArr32);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(windowTouchSlop, i46, doubleTapTimeout2, 154975793, false, (String) objArr32[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr20);
                            try {
                                Object[] objArr33 = new Object[1];
                                c(new char[]{15, 7, 21, 3, 3, 4, 24, '\r', 0, 17, '\n', 4, 20, 17, 16, '\t', 5, '\f', 17, 1, '\n', 23}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr33);
                                Class<?> cls8 = Class.forName((String) objArr33[0]);
                                Object[] objArr34 = new Object[1];
                                c(new char[]{11, 21, 16, '\f', 16, 5, 22, '\r', 7, 16, 17, 15, 2, '\b', 13849}, (byte) (26 - Color.blue(0)), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr34);
                                long jLongValue4 = ((Long) cls8.getDeclaredMethod((String) objArr34[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf3 = Long.valueOf(jLongValue4);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                    char c2 = (char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int iGreen = 3111 - Color.green(0);
                                    int iResolveSize = 22 - View.resolveSize(0, 0);
                                    byte[] bArr9 = $$a;
                                    Object[] objArr35 = new Object[1];
                                    a((byte) 51, bArr9[5], bArr9[7], objArr35);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, iGreen, iResolveSize, -1269618118, false, (String) objArr35[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                    char c3 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    int i47 = 3111 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                                    byte[] bArr10 = $$a;
                                    Object[] objArr36 = new Object[1];
                                    a(bArr10[132], bArr10[5], bArr10[7], objArr36);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i47, deadChar, -1272852037, false, (String) objArr36[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                            } catch (Exception unused2) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i48 = ((int[]) objArr20[1])[0];
                    int i49 = ((int[]) objArr20[2])[0];
                    if (i49 == i48) {
                        int i50 = ((int[]) objArr20[0])[0];
                        int i51 = ((int[]) objArr20[2])[0];
                        int i52 = ((int[]) objArr20[1])[0];
                        String[] strArr3 = (String[]) objArr20[3];
                        int[] iArr2 = {i51};
                        int iNextInt = new Random().nextInt();
                        int i53 = ~iNextInt;
                        int i54 = i50 + ((((~((-1232426194) | i53)) | (~(iNextInt | 472605265))) * 959) - 1113764511) + (((~(iNextInt | (-1232426194))) | (~(i53 | 472605265))) * 959);
                        int i55 = (i54 << 13) ^ i54;
                        int i56 = i55 ^ (i55 >>> 17);
                        ((int[]) objArr[0])[0] = i56 ^ (i56 << 5);
                        Object[] objArr37 = {new int[1], new int[]{i52}, iArr2, strArr3};
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        String[] strArr4 = (String[]) objArr20[3];
                        if (strArr4 != null) {
                            int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i57 % 128;
                            int i58 = i57 % 2;
                            for (String str2 : strArr4) {
                                arrayList2.add(str2);
                            }
                        }
                        Toast.makeText((Context) null, i49 / (((i49 - 1) * i49) % 2), 0).show();
                        int i59 = ((int[]) objArr20[0])[0];
                        int i60 = ((int[]) objArr20[2])[0];
                        int i61 = ((int[]) objArr20[1])[0];
                        String[] strArr5 = (String[]) objArr20[3];
                        int[] iArr3 = {i60};
                        int i62 = ~System.identityHashCode(this);
                        int i63 = i59 + 820907842 + (((~(i62 | 727401331)) | (-996111360)) * (-160)) + (((~(i62 | (-977630128))) | 727401331) * 160);
                        int i64 = (i63 << 13) ^ i63;
                        int i65 = i64 ^ (i64 >>> 17);
                        ((int[]) objArr[0])[0] = i65 ^ (i65 << 5);
                        Object[] objArr38 = {new int[1], new int[]{i61}, iArr3, strArr5};
                    }
                    function1.invoke(obj2);
                }

                /* JADX WARN: Code duplicated, block: B:33:0x0125  */
                /* JADX WARN: Code duplicated, block: B:34:0x0140  */
                /* JADX WARN: Code duplicated, block: B:37:0x018d A[Catch: all -> 0x036a, TryCatch #0 {all -> 0x036a, blocks: (B:7:0x002b, B:9:0x0039, B:10:0x006b, B:14:0x0087, B:16:0x0098, B:17:0x00cd, B:35:0x0142, B:37:0x018d, B:39:0x0205, B:43:0x0224, B:45:0x0261, B:47:0x02ca), top: B:67:0x002b }] */
                /* JADX WARN: Code duplicated, block: B:38:0x0203  */
                /* JADX WARN: Code duplicated, block: B:42:0x0218  */
                /* JADX WARN: Code duplicated, block: B:45:0x0261 A[Catch: all -> 0x036a, TryCatch #0 {all -> 0x036a, blocks: (B:7:0x002b, B:9:0x0039, B:10:0x006b, B:14:0x0087, B:16:0x0098, B:17:0x00cd, B:35:0x0142, B:37:0x018d, B:39:0x0205, B:43:0x0224, B:45:0x0261, B:47:0x02ca), top: B:67:0x002b }] */
                /* JADX WARN: Code duplicated, block: B:46:0x02c7  */
                /* JADX WARN: Code duplicated, block: B:49:0x02eb  */
                /* JADX WARN: Code duplicated, block: B:51:0x02f5  */
                /* JADX WARN: Code duplicated, block: B:52:0x031d  */
                private static void c(char[] cArr, byte b6, int i34, Object[] objArr20) throws Throwable {
                    int i35;
                    Object obj2;
                    Object[] objArr21;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                    int i36 = 2 % 2;
                    deInitSession deinitsession = new deInitSession();
                    char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                    float f = 0.0f;
                    int i37 = 1770390596;
                    Object obj3 = null;
                    int i38 = 8;
                    int i39 = 3;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i40 = $10 + 73;
                        $11 = i40 % 128;
                        int i41 = i40 % 2;
                        int i42 = 0;
                        while (i42 < length) {
                            try {
                                Object[] objArr22 = {Integer.valueOf(cArr2[i42])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i37);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> i38);
                                    int iIndexOf2 = TextUtils.indexOf("", "") + 2267;
                                    int i43 = 33 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                                    byte b7 = (byte) i39;
                                    byte b8 = (byte) (b7 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, iIndexOf2, i43, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                                }
                                cArr3[i42] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr22)).charValue();
                                i42++;
                                f = 0.0f;
                                i37 = 1770390596;
                                i38 = 8;
                                i39 = 3;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        cArr2 = cArr3;
                    }
                    Object[] objArr23 = {Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        byte b9 = (byte) 3;
                        byte b10 = (byte) (b9 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) KeyEvent.normalizeMetaState(0), (-16774949) - Color.rgb(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, -1927765101, false, $$g(b9, b10, b10), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr23)).charValue();
                    char[] cArr4 = new char[i34];
                    if (i34 % 2 != 0) {
                        i35 = i34 - 1;
                        cArr4[i35] = (char) (cArr[i35] - b6);
                    } else {
                        i35 = i34;
                    }
                    if (i35 > 1) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i35) {
                            int i44 = $10 + 119;
                            $11 = i44 % 128;
                            if (i44 % 2 == 0) {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b6);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b6);
                                    obj2 = obj3;
                                } else {
                                    objArr21 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        byte b11 = (byte) 2;
                                        byte b12 = (byte) (b11 - 2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49266), 3261 - TextUtils.getOffsetAfter("", 0), Color.argb(0, 0, 0, 0) + 30, -127612708, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).intValue() == deinitsession.asBinder) {
                                        int i45 = $11 + 49;
                                        $10 = i45 % 128;
                                        int i46 = i45 % 2;
                                        Object[] objArr24 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                            byte b13 = (byte) 0;
                                            byte b14 = b13;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (22878 - Color.blue(0)), 593 - MotionEvent.axisFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 17, 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj2 = null;
                                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr24)).intValue();
                                        int i47 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i47];
                                    } else {
                                        obj2 = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i48 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i49 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i48];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i49];
                                        } else {
                                            int i50 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i51 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i50];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i51];
                                        }
                                    }
                                }
                            } else {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b6);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b6);
                                    obj2 = obj3;
                                } else {
                                    objArr21 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        byte b15 = (byte) 2;
                                        byte b16 = (byte) (b15 - 2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49266), 3261 - TextUtils.getOffsetAfter("", 0), Color.argb(0, 0, 0, 0) + 30, -127612708, false, $$g(b15, b16, b16), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).intValue() == deinitsession.asBinder) {
                                        int i410 = $11 + 49;
                                        $10 = i410 % 128;
                                        int i411 = i410 % 2;
                                        Object[] objArr25 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                            byte b17 = (byte) 0;
                                            byte b18 = b17;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (22878 - Color.blue(0)), 593 - MotionEvent.axisFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 17, 1570859318, false, $$g(b17, b18, b18), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj2 = null;
                                        int iIntValue3 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr25)).intValue();
                                        int i412 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue3];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i412];
                                    } else {
                                        obj2 = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i413 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i414 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i413];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i414];
                                        } else {
                                            int i52 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i53 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i52];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i53];
                                        }
                                    }
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                            obj3 = obj2;
                        }
                    }
                    int i54 = 0;
                    while (i54 < i34) {
                        int i55 = $11 + 67;
                        $10 = i55 % 128;
                        if (i55 % 2 != 0) {
                            cArr4[i54] = (char) (cArr4[i54] ^ 8148);
                            i54 += 122;
                        } else {
                            cArr4[i54] = (char) (cArr4[i54] ^ 13722);
                            i54++;
                        }
                    }
                    objArr20[0] = new String(cArr4);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r7, short r8, int r9) {
                    /*
                        int r8 = r8 * 2
                        int r8 = r8 + 4
                        byte[] r0 = defpackage.getVisibleItems.$$c
                        int r7 = 116 - r7
                        int r9 = r9 * 2
                        int r9 = 1 - r9
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r7 = r8
                        r3 = r9
                        r4 = r2
                        goto L2b
                    L15:
                        r3 = r2
                    L16:
                        r6 = r8
                        r8 = r7
                        r7 = r6
                        int r4 = r3 + 1
                        byte r5 = (byte) r8
                        r1[r3] = r5
                        if (r4 != r9) goto L26
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L26:
                        r3 = r0[r7]
                        r6 = r8
                        r8 = r7
                        r7 = r6
                    L2b:
                        int r8 = r8 + 1
                        int r7 = r7 + r3
                        r3 = r4
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getVisibleItems.$$g(short, short, int):java.lang.String");
                }
            };
            final Function1 function2 = new Function1() { // from class: isQwertyMode
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return getHeaderTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getheadertitle, (Throwable) obj2);
                }
            };
            getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isGroupDividerEnabled
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function2.invoke(obj2);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final EwalletUnlinkActivity ewalletUnlinkActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String str = ((DataEwalletDetail) ewalletUnlinkActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.get(0).b;
        StringBuilder sb = new StringBuilder("Apakah Anda yakin stop sambungkan ");
        sb.append(str);
        sb.append(" dengan akun JMO?");
        String string = sb.toString();
        String str2 = ((DataEwalletDetail) ewalletUnlinkActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.get(0).b;
        String str3 = ((DataEwalletDetail) ewalletUnlinkActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.get(0).b;
        StringBuilder sb2 = new StringBuilder("Untuk menggunakan Saldo ");
        sb2.append(str2);
        sb2.append(", Anda harus menyambungkan kembali akun e-Wallet ");
        sb2.append(str3);
        sb2.append(" pada aplikasi JMO");
        String string2 = sb2.toString();
        onItemVisibleChanged.Companion companion = onItemVisibleChanged.INSTANCE;
        onItemVisibleChanged onitemvisiblechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onItemVisibleChanged.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, string2, new Function0() { // from class: getActionViewStatesKey
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EwalletUnlinkActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        }, new Function0() { // from class: getActionItems
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EwalletUnlinkActivity.g();
            }
        });
        FragmentManager supportFragmentManager = ewalletUnlinkActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(onitemvisiblechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = asInterface + 123;
            f490a = i2 % 128;
            if (i2 % 2 == 0) {
                onitemvisiblechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, onitemvisiblechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i3 = 63 / 0;
            } else {
                onitemvisiblechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, onitemvisiblechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        f490a = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 65;
        f490a = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        g = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancel + 3;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        f490a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_ewallet_unlink;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        f490a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -577964529, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, (-587356111) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, new Object[]{this}, 577964529);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1891676131, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, 1891676132);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f490a + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 521167620, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, context}, -521167618);
    }

    static void d() {
        d = new char[]{60050, 60040, 60058, 60051, 60047, 60063, 60053, 60056, 60043, 60072, 60045, 60117, 60052, 60083, 60048, 60041, 60062, 60057, 60054, 60049, 60088, 60034, 60060, 60073, 60055};
        asBinder = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        f490a = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.$$c
            int r8 = r8 + 113
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ewallet.EwalletUnlinkActivity.$$i(int, int, byte):java.lang.String");
    }
}
