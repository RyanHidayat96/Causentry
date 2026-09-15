package com.bpjstku.presentation.ewallet;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.databinding.ActivityEwalletBinding;
import com.bpjstku.domain.ewallet.model.EWalletService;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.ewallet.EWalletActivity;
import com.bpjstku.presentation.ewallet.model.DataEwalletDetail;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CaptureBundle;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getHeaderTitle;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onItemActionRequestChanged;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.HeldCertificate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0016\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0015\u0010\u0006\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 "}, d2 = {"Lcom/bpjstku/presentation/ewallet/EWalletActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityEwalletBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onResume", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LgetHeaderTitle;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LonItemActionRequestChanged;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LonItemActionRequestChanged;", "", "Lcom/bpjstku/domain/ewallet/model/EWalletService;", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EWalletActivity extends BindingBaseActivity<ActivityEwalletBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f488a;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private List<EWalletService> asBinder = CollectionsKt.emptyList();
    private onItemActionRequestChanged TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$a = {2, -84, 82, -15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 102;
    private static int d = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(Function1 function1) {
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
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = i7 | i5;
        int i9 = (~i8) | (~(i7 | i4));
        int i10 = (~((~i4) | i7 | (~i5))) | (~(i2 | i5));
        int i11 = i2 + i5 + i6 + ((-540997959) * i3) + (162607451 * i);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i2) + 1723858944 + (1667710703 * i5) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i6) + ((-672137216) * i3) + (483393536 * i) + (377683968 * i12);
        int i14 = (i2 * 228155117) + 240245784 + (i5 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i6 * 228155391) + (i3 * (-329950905)) + (i * (-2026639707)) + (i12 * 159186944);
        int i15 = i13 + (i14 * i14 * (-1451425792));
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.ewallet.EWalletActivity.$$a
            int r1 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ewallet.EWalletActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.ewallet.EWalletActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/ewallet/EWalletActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) EWalletActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EWalletActivity() {
        final EWalletActivity eWalletActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getHeaderTitle>() { // from class: com.bpjstku.presentation.ewallet.EWalletActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getHeaderTitle] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getHeaderTitle invoke() {
                LifecycleOwner lifecycleOwner = eWalletActivity;
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
        final EWalletActivity eWalletActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.ewallet.EWalletActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = eWalletActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        EWalletActivity$bindingInflater$1 eWalletActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            eWalletActivity$bindingInflater$1 = EWalletActivity$bindingInflater$1.b;
            int i3 = 82 / 0;
        } else {
            eWalletActivity$bindingInflater$1 = EWalletActivity$bindingInflater$1.b;
        }
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return eWalletActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((getHeaderTitle) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(this, new b(new Function1() { // from class: add
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EWalletActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asBinder + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 21;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - View.MeasureSpec.getSize(0)), TextUtils.indexOf("", "", 0, 0) + 2624, Color.blue(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (f488a ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.MeasureSpec.getSize(0)), 481 - (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 51;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 71;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0, 0) + 482, Color.alpha(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i9 = 23 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getTapTimeout() >> 16)), 481 - (ViewConfiguration.getJumpTapTimeout() >> 16), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final EWalletActivity eWalletActivity = (EWalletActivity) objArr[0];
        int i = 2 % 2;
        eWalletActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityEwalletBinding) ((ViewBinding) eWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityEwalletBinding) ((ViewBinding) eWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(eWalletActivity.getString(R.string.title_e_wallet));
        Object obj = null;
        eWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new onItemActionRequestChanged(CollectionsKt.listOf(new EWalletService(1, R.drawable.ic_motionpay, "MotionPay", null)), new Function1() { // from class: addIntentOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (EWalletService) obj2);
            }
        }, new Function1() { // from class: addInternal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EWalletActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (EWalletService) obj2);
            }
        });
        RecyclerView recyclerView = ((ActivityEwalletBinding) ((ViewBinding) eWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).activityEwalletRecycler;
        recyclerView.setLayoutManager(new LinearLayoutManager(eWalletActivity));
        onItemActionRequestChanged onitemactionrequestchanged = eWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (onitemactionrequestchanged == null) {
            int i2 = asBinder + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                throw null;
            }
            onitemactionrequestchanged = null;
        }
        recyclerView.setAdapter(onitemactionrequestchanged);
        int i4 = asInterface + 41;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = asInterface + 73;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = asBinder + 81;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00be  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_snap_transaction_details).substring(1, 2).codePointAt(0) - 903794756);
            if (i3 != (((-1989216684) + (((~((-905559283) | i4)) | 1735546825) * (-933))) + (((~(i4 | 1735546825)) | (-2013003772)) * 933)) - 1841410099) {
                int[] iArr = new int[16649433];
                iArr[16649432] = 1;
                int i5 = 2118320920 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i7 = ~layoutDirection;
            if (i6 != (-1095355004) + (((~((-1070388758) | i7)) | 239342100) * (-108)) + (((~(i7 | 240401214)) | (~((-240401215) | layoutDirection)) | (-1071447872)) * 54) + ((layoutDirection | (-1071447872)) * 54)) {
                int[] iArr2 = new int[16649433];
                iArr2[16649432] = 1;
                int i8 = 2118320920 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingzipcode_invalid).substring(24, 25).codePointAt(0) - 94404174;
        if (i9 != (((~(iCodePointAt | 417371672)) | (-2133283004)) * 56) + 1872491924 + (((~((~iCodePointAt) | (-2133283004))) | 417371672) * 56)) {
            throw null;
        }
        super.onResume();
        getHeaderTitle getheadertitle = (getHeaderTitle) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            int i10 = asBinder + 9;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i11 = 4 / 0;
            } else {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else {
            str = null;
        }
        if (str == null) {
            int i12 = asBinder + 49;
            asInterface = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            str = "";
        }
        getheadertitle.b(new MotionCheckConnectRequest(str));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((byte) 37, bArr[28], bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, i3, iResolveOpacity, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
            byte[] bArr2 = $$a;
            short s = bArr2[28];
            byte b2 = bArr2[5];
            Object[] objArr3 = new Object[1];
            c((byte) 37, s, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, windowTouchSlop, i4, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            int i5 = asBinder + 117;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) (29944 - View.MeasureSpec.getSize(0));
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                byte b3 = (byte) 52;
                Object[] objArr4 = new Object[1];
                c(b3, (short) (b3 & 239), $$a[5], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, edgeSlop, absoluteGravity, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto2).substring(8, 9).codePointAt(0) + 1535317314;
            int i7 = ((~((~iCodePointAt) | 938956763)) * 130) + 509585775 + (((~(iCodePointAt | 938956763)) | 606290177) * 130) + 720672313;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{54565, 40579, 16995, 13865, 64469, 44866, 4896, 50330, 34880, 31860, 8670, 38233, 22816, 754, 63068, 47617}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 19262, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{54566, 62378, 38952, 42658, 20287, 5539, 12861, 55473, 57615, 36775, 21558, 29356, 6912, 8621, 52773, 38053}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_alfamart).substring(1, 3).length() + 9855, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {489374257};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 42049), 1726 - (ViewConfiguration.getLongPressTimeout() >> 16), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 720672313);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                    int defaultSize = View.getDefaultSize(0, 0) + 23;
                    byte b4 = (byte) 52;
                    Object[] objArr9 = new Object[1];
                    c(b4, (short) (b4 & 239), $$a[5], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, tapTimeout, defaultSize, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{54574, 9870, 12917, 3632, 7068, 5965, 25393, 31912, 18520, 17435, 20919, 44441, 47362, 35551, 34473, 37483, 61394, 64403, 63341, 49373, 56448, 10367}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step7).substring(16, 17).codePointAt(0) + 62282, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{54570, 30882, 36396, 56764, 25400, 46767, 50221, 27546, 47394, 52391, 4649, 41392, 63274, 6831, 43044}, 44417 - TextUtils.getCapsMode("", 0, 0), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                        Object[] objArr12 = new Object[1];
                        c((byte) 52, (short) 88, $$a[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iLastIndexOf, edgeSlop2, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int i10 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr3 = $$a;
                        Object[] objArr13 = new Object[1];
                        c((byte) 37, bArr3[28], bArr3[5], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay, i10, iNormalizeMetaState, 986134021, false, (String) objArr13[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                int i11 = asBinder + 79;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i13 = asBinder + 37;
        asInterface = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = i15 + 631833220 + (((~(iIdentityHashCode | 475522608)) | 61346246) * 305) + (((~((~iIdentityHashCode) | 475522608)) | 262920182) * 305);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
        int i19 = asBinder + 65;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
            Object[] objArr15 = new Object[1];
            c((byte) 52, (short) 140, $$a[5], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(threadPriority, minimumFlingVelocity, edgeSlop3, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{54574, 9870, 12917, 3632, 7068, 5965, 25393, 31912, 18520, 17435, 20919, 44441, 47362, 35551, 34473, 37483, 61394, 64403, 63341, 49373, 56448, 10367}, ((byte) KeyEvent.getModifierMetaStateMask()) + 62384, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{54570, 30882, 36396, 56764, 25400, 46767, 50221, 27546, 47394, 52391, 4649, 41392, 63274, 6831, 43044}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 44306, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int i21 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
            int i22 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
            byte b5 = (byte) 52;
            Object[] objArr18 = new Object[1];
            c(b5, (short) (b5 & 239), $$a[5], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSizeAndState, i21, i22, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i23 = asBinder + 21;
            asInterface = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr19 = new Object[1];
                c(b7, (short) (b7 | 192), b6, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(windowTouchSlop2, trimmedLength, bitsPerPixel, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = ((((-1648014114) + (((~((-839746) | i27)) | 243440424) * (-90))) + (((~((-839746) | iIdentityHashCode2)) | (-244243306)) * (-45))) + ((((~(iIdentityHashCode2 | (-243440425))) | (-839746)) | (~(i27 | 243440424))) * 45)) - 263306142;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{54565, 40579, 16995, 13865, 64469, 44866, 4896, 50330, 34880, 31860, 8670, 38233, 22816, 754, 63068, 47617}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19362, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{54566, 62378, 38952, 42658, 20287, 5539, 12861, 55473, 57615, 36775, 21558, 29356, 6912, 8621, 52773, 38053}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_all_bank).substring(13, 15).length() + 9855, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {489374257};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1134 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -263306142, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                Object[] objArr25 = new Object[1];
                c((byte) 52, (short) 140, $$a[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMakeMeasureSpec, packedPositionType, threadPriority2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1117 - TextUtils.getTrimmedLength(""), (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iIndexOf = 1031 - TextUtils.indexOf("", "", 0);
                int i31 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                byte b8 = $$a[7];
                byte b9 = b8;
                Object[] objArr26 = new Object[1];
                c(b9, (short) (b9 | 192), b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(edgeSlop4, iIndexOf, i31, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{54574, 9870, 12917, 3632, 7068, 5965, 25393, 31912, 18520, 17435, 20919, 44441, 47362, 35551, 34473, 37483, 61394, 64403, 63341, 49373, 56448, 10367}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_atm_bersama).substring(1, 2).codePointAt(0) + 62278, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{54570, 30882, 36396, 56764, 25400, 46767, 50221, 27546, 47394, 52391, 4649, 41392, 63274, 6831, 43044}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 44306, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int mirror = AndroidCharacter.getMirror('0') + 983;
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte b10 = (byte) 52;
                    Object[] objArr29 = new Object[1];
                    c(b10, (short) (b10 & 239), $$a[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, mirror, iArgb, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int i32 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                    Object[] objArr30 = new Object[1];
                    c((byte) 52, (short) 140, $$a[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cKeyCodeFromString2, iIndexOf2, i32, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArr[1])[0];
        int i34 = ((int[]) objArr[3])[0];
        if (i34 == i33) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i39 = ~i38;
            int i40 = (-2117104157) + (((~(27317372 | i39)) | 206439041) * (-1188));
            int i41 = (~(i38 | (-27317373))) | 206439041;
            int i42 = ~(216962797 | i39);
            int i43 = i35 + i40 + ((i41 | i42) * 594) + (((~((-27317373) | i39)) | 16793616 | i42) * 594);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i46 = 0;
            while (i46 < strArr4.length) {
                int i47 = asInterface + 35;
                asBinder = i47 % 128;
                if (i47 % 2 != 0) {
                    arrayList2.add(strArr4[i46]);
                    i46 += 89;
                } else {
                    arrayList2.add(strArr4[i46]);
                    i46++;
                }
            }
        }
        int[] iArr = new int[i34];
        int i48 = i34 - 1;
        iArr[i48] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i48) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i49 = ((int[]) objArr[2])[0];
        int i50 = ((int[]) objArr[3])[0];
        int i51 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i52 = i49 + 366918306 + ((~(395639990 | iIdentityHashCode3)) * 623) + (((~iIdentityHashCode3) | 100925472) * (-623)) + (((~(iIdentityHashCode3 | 370422816)) | (~(126142646 | iIdentityHashCode3)) | (-395639991)) * 623);
        int i53 = i52 ^ (i52 << 13);
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr32[2])[0] = i54 ^ (i54 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        EWalletActivity eWalletActivity = (EWalletActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ~(((int) Runtime.getRuntime().totalMemory()) | (-1009029964));
        if (i4 != ((((-1051720576) | i5) * (-196)) - 586215592) + ((i5 | 42690612) * 196)) {
            throw new RuntimeException("-1791607244");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i7 = ~((-371623336) | iFreeMemory);
        int i8 = (-1031174732) + ((337903618 | i7) * (-280)) + ((i7 | (~(2087534666 | iFreeMemory))) * 140);
        int i9 = ~((-33719718) | iFreeMemory);
        int i10 = ~iFreeMemory;
        if (i6 != i8 + (((~(i10 | 2121254383)) | i9 | (~((-337903619) | i10))) * 140)) {
            throw null;
        }
        super.onStart();
        int i11 = asInterface + 91;
        asBinder = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (-1950300046) + (((~(i5 | (-1496665656))) | 1476480023 | (~((-646492481) | iIdentityHashCode))) * 717) + (((~(iIdentityHashCode | (-1496665656))) | (~(i5 | (-646492481))) | 1476480023) * 717)) {
            throw new RuntimeException("-2037077475");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 558582935;
        int i8 = ~i7;
        if (i6 != (((~(2013653320 | i8)) | (~((-297741990) | i7)) | (~(i8 | 297741989))) * 959) + 567960832 + (((~(i7 | 297741989)) | (~(i8 | (-297741990))) | (~(2013653320 | i7))) * 959)) {
            throw new RuntimeException("-782446414");
        }
        super.onCreate(bundle);
        int i9 = asBinder + 107;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EWalletActivity eWalletActivity, EWalletService eWalletService) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(eWalletService, "");
        if (i3 != 0 ? eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1 : eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1) {
            EWalletMotionConnectActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = EWalletMotionConnectActivity.INSTANCE;
            EWalletMotionConnectActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(eWalletActivity);
            int i4 = asInterface + 1;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 19;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(EWalletActivity eWalletActivity, EWalletService eWalletService) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eWalletService, "");
        EwalletUnlinkActivity.Companion companion = EwalletUnlinkActivity.INSTANCE;
        EwalletUnlinkActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(eWalletActivity, new DataEwalletDetail(eWalletActivity.asBinder));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(EWalletActivity eWalletActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asInterface + 75;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            eWalletActivity.MediaBrowserCompat();
            str = "loading_check_connect_motionpay";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            eWalletActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (Intrinsics.areEqual(((MotionCheckConnectResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isExists(), "true")) {
                String upperCase = ((MotionCheckConnectResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (Intrinsics.areEqual(upperCase, "LINKED")) {
                    onItemActionRequestChanged onitemactionrequestchanged = null;
                    List<EWalletService> listListOf = CollectionsKt.listOf(new EWalletService(1, R.drawable.ic_motionpay, "MotionPay", null));
                    EWalletService eWalletService = listListOf.get(0);
                    int intOrNull = StringsKt.toIntOrNull(((MotionCheckConnectResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCash());
                    if (intOrNull == null) {
                        intOrNull = 0;
                    }
                    eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = intOrNull;
                    eWalletActivity.asBinder = listListOf;
                    onItemActionRequestChanged onitemactionrequestchanged2 = eWalletActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (onitemactionrequestchanged2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        onitemactionrequestchanged = onitemactionrequestchanged2;
                    }
                    onitemactionrequestchanged.submitList(listListOf);
                }
            }
            str = "success_check_connect_motionpay";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = asBinder + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            eWalletActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = eWalletActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_error_process, "", strValueOf, string, null, 112);
            FragmentManager supportFragmentManager = eWalletActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            int i6 = asInterface + 39;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            str = "failed_check_connect_motionpay";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_ewallet_motion_connect", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    static {
        g = 0;
        g();
        INSTANCE = new Companion(null);
        int i = d + 119;
        g = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityEwalletBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_object_active).substring(3, 4).length() + 740546972;
        int iTuitionPaymentFragmentbindingInflater2 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        return (Function1) TuitionPaymentFragmentbindingInflater1(HeldCertificate.Companion.TuitionPaymentFragmentbindingInflater1(), 1290773733, iTuitionPaymentFragmentbindingInflater2, iTuitionPaymentFragmentbindingInflater1, -1290773732, length, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_ewallet;
        }
        int i3 = 13 / 0;
        return R.layout.activity_ewallet;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentbindingInflater1 = CaptureBundle.TuitionPaymentFragmentbindingInflater1();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 212462383;
        TuitionPaymentFragmentbindingInflater1(HeldCertificate.Companion.TuitionPaymentFragmentbindingInflater1(), 1407460894, CaptureBundle.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, -1407460892, i, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int i = (-81331626) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int length = (-419880674) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_expiration_message).substring(3, 4).length();
        int length2 = (-1387765932) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_5).substring(3, 4).length() + 629980537, -1803387524, length2, i, 1803387524, length, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void g() {
        f488a = 6037029291529043028L;
    }
}
