package com.bpjstku.presentation.danasiaga;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.danasiaga.model.request.EligibleIctMenuRequest;
import com.bpjstku.data.danasiaga.model.response.EligibleIctMenuResponse;
import com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda24;
import com.bpjstku.databinding.ActivityDanasiagaBinding;
import com.bpjstku.domain.danasiaga.model.DanaSiagaService;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.danasiaga.DanaSiagaActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SearchView9;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage._init_lambda2;
import defpackage.addMenu;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createPopupWindow;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getNextMenuPosition;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0012\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0018\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/danasiaga/DanaSiagaActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDanasiagaBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LcreatePopupWindow;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "LaddMenu;", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DanaSiagaActivity extends BindingBaseActivity<ActivityDanasiagaBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static char[] b;
    private static char d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final boolean b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: BaseMenuWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DanaSiagaActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });
    private static final byte[] $$c = {109, 7, 114, -90};
    private static final int $$f = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {112, 19, -59, 97, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$k = 118;
    private static final byte[] $$a = {106, -22, 107, 95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 150;
    private static int asInterface = 1;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f481a = 1;

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

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i2) | i8)) | i9;
        int i11 = i | i6;
        int i12 = (~(i2 | i8)) | i9;
        int i13 = i + i6 + i4 + (1258674323 * i3) + ((-126594725) * i5);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i) + 1954676736 + ((-212912869) * i6) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i4) + (881065984 * i3) + ((-991690752) * i5) + ((-541982720) * i14);
        int i16 = ((i * (-1656160718)) - 817430035) + (i6 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i4 * (-1656160097)) + (i3 * (-2121497779)) + (i5 * 1378977669) + (i14 * (-275906560));
        int i17 = i15 + (i16 * i16 * (-372375552));
        if (i17 != 1) {
            if (i17 != 2) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            final DanaSiagaActivity danaSiagaActivity = (DanaSiagaActivity) objArr[0];
            int i18 = 2 % 2;
            ((createPopupWindow) danaSiagaActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(danaSiagaActivity, new b(new Function1() { // from class: updateMenuView
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DanaSiagaActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
                }
            }));
            int i19 = f481a + 79;
            g = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        DanaSiagaActivity danaSiagaActivity2 = (DanaSiagaActivity) objArr[0];
        int i21 = 2 % 2;
        int i22 = g + 25;
        f481a = i22 % 128;
        int i23 = i22 % 2;
        super.onPause();
        int i24 = g + 121;
        f481a = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 53 - r9
            byte[] r0 = com.bpjstku.presentation.danasiaga.DanaSiagaActivity.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r8 = 145 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L28:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 15
            int r0 = 53 - r8
            byte[] r1 = com.bpjstku.presentation.danasiaga.DanaSiagaActivity.$$j
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaActivity.f(short, int, short, java.lang.Object[]):void");
    }

    public DanaSiagaActivity() {
        final DanaSiagaActivity danaSiagaActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<createPopupWindow>() { // from class: com.bpjstku.presentation.danasiaga.DanaSiagaActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [createPopupWindow, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final createPopupWindow invoke() {
                ComponentCallbacks componentCallbacks = danaSiagaActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(createPopupWindow.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        this.b = getMaxImages.MediaBrowserCompatMediaBrowserImplApi217();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDanasiagaBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 67;
        f481a = i2 % 128;
        if (i2 % 2 == 0) {
            DanaSiagaActivity$bindingInflater$1 danaSiagaActivity$bindingInflater$1 = DanaSiagaActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        DanaSiagaActivity$bindingInflater$1 danaSiagaActivity$bindingInflater$2 = DanaSiagaActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = g + 77;
        f481a = i3 % 128;
        int i4 = i3 % 2;
        return danaSiagaActivity$bindingInflater$2;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.danasiaga.DanaSiagaActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/danasiaga/DanaSiagaActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) DanaSiagaActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0325  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        String str;
        String str2;
        Object[] objArr;
        int i = 2 % 2;
        final createPopupWindow createpopupwindow = (createPopupWindow) this.TuitionPaymentFragmentbindingInflater1.getValue();
        MutableLiveData<VirtualCameraAdapter1<EligibleIctMenuResponse>> mutableLiveData = createpopupwindow.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = createpopupwindow.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder();
        _init_lambda2 _init_lambda2Var = createpopupwindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (userAsBinder != null) {
            str = userAsBinder.b;
        } else {
            int i2 = f481a + 97;
            g = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        String strValueOf = String.valueOf(str);
        if (userAsBinder != null) {
            int i4 = g + 85;
            f481a = i4 % 128;
            if (i4 % 2 == 0) {
                str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = 61 / 0;
            } else {
                str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else {
            str2 = null;
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(_init_lambda2Var.b(new EligibleIctMenuRequest(strValueOf, String.valueOf(str2)))));
        final getNextMenuPosition getnextmenuposition = new getNextMenuPosition(createpopupwindow);
        logToString logtostring = new logToString() { // from class: getInitialMenuPosition
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getnextmenuposition.invoke(obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: findMenuItemForSubmenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createPopupWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createpopupwindow, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: showMenu
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
            int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
            byte b2 = $$a[80];
            Object[] objArr2 = new Object[1];
            c(b2, (short) (b2 | 140), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i6, scrollBarFadeDuration, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{11, 0, 14, '\t', 24, 22, 5, 24, 20, '\b', 24, '\n', '\n', '\b', 7, '\t', 18, 15, '\b', 3, 11, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_redirecting_to_shopee).substring(1, 2).codePointAt(0) + 18), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 87, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{'\r', '\b', 11, '\f', 6, '\t', 7, 24, 5, '\r', 1, '\b', 22, 16, 13860}, (byte) (36 - ExpandableListView.getPackedPositionChild(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 921;
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            c(b4, (short) (b4 | 141), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, capsMode, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = g + 47;
            f481a = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState2 = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                int iMyTid = 921 - (Process.myTid() >> 22);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte[] bArr = $$a;
                byte b5 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b5, (short) (b5 | 89), (byte) (bArr[33] - 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState2, iMyTid, doubleTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step6).substring(17, 18).codePointAt(0) - 588030511;
            int i9 = ~iCodePointAt;
            int i10 = (((316981601 + (((~(1051060758 | i9)) | 18351233) * (-108))) + (((~(i9 | 723018885)) | ((~((-723018886) | iCodePointAt)) | 346393106)) * 54)) + ((iCodePointAt | 346393106) * 54)) - 267492067;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            int i13 = f481a + 91;
            g = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i15 = g + 75;
                int i16 = i15 % 128;
                f481a = i16;
                int i17 = i15 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i18 = i16 + 83;
                    g = i18 % 128;
                    if (i18 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr8 = new Object[1];
            e(new char[]{20, 15, 0, '\f', 23, 0, 11, 0, 20, 21, '\n', 14, 6, 7, 7, 18}, (byte) (1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 101, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{24, 6, 6, 3, 11, 1, '\b', 11, 5, '\f', '\n', 5, 18, 24, 5, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_deeplink).substring(1, 2).length() + 25), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, createpopupwindow)).intValue();
            int i19 = g + 71;
            f481a = i19 % 128;
            int i20 = i19 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(iIntValue), 0, -267492067};
                byte[] bArr2 = $$j;
                Object[] objArr11 = new Object[1];
                f(bArr2[14], bArr2[51], bArr2[74], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                f((byte) ($$k & 173), bArr2[74], bArr2[51], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                    int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr13 = new Object[1];
                    c(b6, (short) (b6 | 89), (byte) (bArr3[33] - 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, scrollBarSize, minimumFlingVelocity, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{11, 0, 14, '\t', 24, 22, 5, 24, 20, '\b', 24, '\n', '\n', '\b', 7, '\t', 18, 15, '\b', 3, 11, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_5).substring(3, 4).length() + 118), AndroidCharacter.getMirror('0') - 26, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{'\r', '\b', 11, '\f', 6, '\t', 7, 24, 5, '\r', 1, '\b', 22, 16, 13860}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int iArgb = Color.argb(0, 0, 0, 0) + 921;
                        int minimumFlingVelocity2 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr16 = new Object[1];
                        c(b8, (short) (b8 | 141), b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iArgb, minimumFlingVelocity2, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
                        int i21 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b9 = $$a[80];
                        Object[] objArr17 = new Object[1];
                        c(b9, (short) (b9 | 140), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, packedPositionGroup, i21, -1048449946, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str3 : strArr) {
                    arrayList.add(str3);
                }
            }
            throw null;
        }
        int i22 = ((int[]) objArr[0])[0];
        Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i23 = i22 + 766618353 + (((~((-886036375) | iIdentityHashCode)) | (-888141720)) * (-502)) + ((~((~iIdentityHashCode) | (-98451))) * (-502)) + (((~(iIdentityHashCode | (-888043270))) | (-886036375)) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[0])[0] = i25 ^ (i25 << 5);
        int i26 = g + 125;
        f481a = i26 % 128;
        int i27 = i26 % 2;
        createpopupwindow.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1(((ActivityDanasiagaBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityDanasiagaBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_danasiaga));
        RecyclerView recyclerView = ((ActivityDanasiagaBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).activityDanasiagaRecycler;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((addMenu) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i2 = f481a + 69;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f481a + 115;
        g = i2 % 128;
        Object obj = null;
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
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = f481a + 17;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
            int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
            int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, (short) (b2 | 89), (byte) (bArr[33] - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i3, keyRepeatTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = g + 3;
            f481a = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                int iMyPid = 1755 - (Process.myPid() >> 22);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr3 = new Object[1];
                c(b4, (short) (b4 | 141), b3, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iMyPid, iResolveOpacity, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i6 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~(367609218 | iIdentityHashCode);
            int i8 = (-1331812914) + (((-503150539) | i7) * (-814)) + ((i7 | (~((~iIdentityHashCode) | 155006792)) | 19465472) * 407) + (((~(iIdentityHashCode | (-155006793))) | (~((-367609219) | iIdentityHashCode)) | 19465472) * 407) + 529004643;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{20, 15, 0, '\f', 23, 0, 11, 0, 20, 21, '\n', 14, 6, 7, 7, 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_image_too_dark).substring(0, 24).length() - 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{24, 6, 6, 3, 11, 1, '\b', 11, 5, '\f', '\n', 5, 18, 24, 5, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 85), 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1281912805};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (Process.myTid() >> 22)), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0), 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 529004643, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    c(b6, (short) (b6 | 141), b5, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i11, i12, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{11, 0, 14, '\t', 24, 22, 5, 24, 20, '\b', 24, '\n', '\n', '\b', 7, '\t', 18, 15, '\b', 3, 11, 17}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 119), ImageFormat.getBitsPerPixel(0) + 23, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{'\r', '\b', 11, '\f', 6, '\t', 7, 24, 5, '\r', 1, '\b', 22, 16, 13860}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step8).substring(31, 33).length() + 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card).substring(0, 1).length() + 14, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        c(b8, (short) (b8 | 52), b7, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, fadingEdgeLength, longPressTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                        int i13 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                        byte[] bArr2 = $$a;
                        byte b9 = bArr2[7];
                        Object[] objArr12 = new Object[1];
                        c(b9, (short) (b9 | 89), (byte) (bArr2[33] - 1), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, i13, pressedStateDuration, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            int i14 = f481a + 25;
            g = i14 % 128;
            int i15 = i14 % 2;
            while (i2 < strArr.length) {
                int i16 = g + 51;
                f481a = i16 % 128;
                int i17 = i16 % 2;
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i18 = g + 69;
        f481a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr13 = {new int[]{i21}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i22 = ~layoutDirection;
        int i23 = i20 + (-585790755) + (((~((-375757924) | i22)) | 588360349) * (-328)) + ((layoutDirection | 588360349) * 164) + (((~(layoutDirection | 375757923)) | 554705564 | (~(i22 | (-342103139)))) * 164);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr13[3])[0] = i25 ^ (i25 << 5);
        int i26 = g + 15;
        f481a = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
            int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
            byte b10 = $$a[7];
            short s = b10;
            Object[] objArr14 = new Object[1];
            c(b10, s, (byte) s, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, keyRepeatTimeout2, iKeyCodeFromString, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{11, 0, 14, '\t', 24, 22, 5, 24, 20, '\b', 24, '\n', '\n', '\b', 7, '\t', 18, 15, '\b', 3, 11, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 108), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{'\r', '\b', 11, '\f', 6, '\t', 7, 24, 5, '\r', 1, '\b', 22, 16, 13860}, (byte) (37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cBlue = (char) Color.blue(0);
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
            int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0);
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr17 = new Object[1];
            c(b12, (short) (b12 | 141), b11, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, iLastIndexOf, iLastIndexOf2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int i28 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                byte b13 = $$a[80];
                Object[] objArr18 = new Object[1];
                c(b13, (short) (b13 | 140), (byte) 52, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, i28, longPressTimeout2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr19[3])[0];
            int i30 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i31 = ~(((int) Process.getStartUptimeMillis()) | (-83338004));
            int i32 = (((((-402108288) | i31) * (-196)) + 686000825) + ((i31 | 318770284) * 196)) - 737547504;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[2])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{20, 15, 0, '\f', 23, 0, 11, 0, 20, 21, '\n', 14, 6, 7, 7, 18}, (byte) (1 - KeyEvent.getDeadChar(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).length() + 15, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{24, 6, 6, 3, 11, 1, '\b', 11, 5, '\f', '\n', 5, 18, 24, 5, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_card).substring(0, 1).length() + 25), TextUtils.indexOf("", "", 0, 0) + 16, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1281912805};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "", 0, 0) + 1134, 18 - (ViewConfiguration.getEdgeSlop() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -737547504, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int threadPriority2 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b14 = $$a[7];
                short s2 = b14;
                Object[] objArr24 = new Object[1];
                c(b14, s2, (byte) s2, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState, threadPriority2, minimumFlingVelocity, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1117 - KeyEvent.normalizeMetaState(0), KeyEvent.normalizeMetaState(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                int pressedStateDuration2 = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int gidForName = Process.getGidForName("") + 16;
                byte b15 = $$a[80];
                Object[] objArr25 = new Object[1];
                c(b15, (short) (b15 | 140), (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, pressedStateDuration2, gidForName, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{11, 0, 14, '\t', 24, 22, 5, 24, 20, '\b', 24, '\n', '\n', '\b', 7, '\t', 18, 15, '\b', 3, 11, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 12), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bbm_money).substring(0, 9).codePointAt(3) - 10, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{'\r', '\b', 11, '\f', 6, '\t', 7, 24, 5, '\r', 1, '\b', 22, 16, 13860}, (byte) (37 - (ViewConfiguration.getScrollBarSize() >> 8)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i35 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b16 = $$a[7];
                    byte b17 = b16;
                    Object[] objArr28 = new Object[1];
                    c(b17, (short) (b17 | 141), b16, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration3, keyRepeatDelay, i35, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i36 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                    byte b18 = $$a[7];
                    short s3 = b18;
                    Object[] objArr29 = new Object[1];
                    c(b18, s3, (byte) s3, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength2, i36, scrollDefaultDelay, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArr[1])[0];
        int i38 = ((int[]) objArr[3])[0];
        if (i38 != i37) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i39 = g + 45;
                f481a = i39 % 128;
                int i40 = i39 % 2;
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i38));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i45 = i41 + 608946369 + (((~(138615039 | i44)) | 378569728) * 104) + ((~((~i44) | (-134289559))) * (-104)) + ((i44 | 382895209) * 104);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr30[2])[0] = i47 ^ (i47 << 5);
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = 5;
        int i7 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + i6;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i7;
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, TextUtils.indexOf("", "") + 33, -1927765101, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 2;
                    i5 = 1770390596;
                    i6 = 5;
                    i7 = 3;
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
        try {
            Object[] objArr3 = {Integer.valueOf(d)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 3;
                byte b6 = (byte) (b5 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2267 - TextUtils.getOffsetAfter("", 0), 32 - ImageFormat.getBitsPerPixel(0), -1927765101, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i11 = $11 + 97;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 2;
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3262 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 30 - TextUtils.getTrimmedLength(""), -127612708, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22877), TextUtils.indexOf((CharSequence) "", '0', 0) + 595, TextUtils.lastIndexOf("", '0', 0) + 18, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            } else {
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i18 = 0; i18 < i; i18++) {
                int i19 = $11 + 113;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -652396442
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
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f481a + 65;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i6 = ~(1136555540 | i5);
        int i7 = ~i5;
        if (i4 != 1672375580 + ((i6 | (~((-1102717953) | i7))) * (-406)) + ((~(1409285949 | i7)) * (-406)) + (((~(i5 | (-306567998))) | (~((-1136555541) | i7))) * 406)) {
            int i8 = 66054900 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = ~((-78642102) | iIdentityHashCode);
        int i11 = (-1461541628) + ((10924560 | i10) * (-280)) + ((i10 | (~(1794553432 | iIdentityHashCode))) * 140);
        int i12 = ~((-67717542) | iIdentityHashCode);
        int i13 = ~iIdentityHashCode;
        if (i9 != i11 + (((~(i13 | 1862270973)) | i12 | (~((-10924561) | i13))) * 140)) {
            throw new RuntimeException("36292629");
        }
        super.onStart();
        int i14 = g + 29;
        f481a = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00af, code lost:
    
        if (r3 != (((645208060 + (((~(1897613822 | r5)) | 180651521) * 104)) + ((~((~r5) | (-1896562853))) * (-104))) + ((r5 | 181702491) * 104))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b1, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.danasiaga.DanaSiagaActivity.g + 89;
        com.bpjstku.presentation.danasiaga.DanaSiagaActivity.f481a = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bd, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bf, code lost:
    
        r9 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        throw new java.lang.RuntimeException("-1408776886");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
    
        r9 = 1152189744 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (r3 == ((((-1152060852) + (((~((~r5) | (-67371139))) | (~((-1371055113) | r5))) * (-302))) + ((~((-67371139) | r5)) * (-604))) + (((~(r5 | (-1438426251))) | (-1979493820)) * 302))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (r3 == ((r8 + ((1006477305 | r5) * (-216))) + (((~(r5 | 167052177)) | (-997039721)) * 216))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r3 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r5 = (int) android.os.SystemClock.uptimeMillis();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[] r9) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Unit b(DanaSiagaActivity danaSiagaActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            danaSiagaActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            danaSiagaActivity.IconCompatParcelizer();
            if (Intrinsics.areEqual(((EligibleIctMenuResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().getStatusEligible(), "Y")) {
                addMenu addmenu = (addMenu) danaSiagaActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                ArrayList arrayList = new ArrayList();
                if (danaSiagaActivity.b) {
                    String string = danaSiagaActivity.getString(R.string.ict_danasiaga_name);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = danaSiagaActivity.getString(R.string.ict_danasiaga_company);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String string3 = danaSiagaActivity.getString(R.string.ict_danasiaga_description);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    arrayList.add(new DanaSiagaService(2, R.drawable.ic_icon_ict, string, string2, string3, "", "", ""));
                }
                addmenu.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
                int i2 = f481a + 25;
                g = i2 % 128;
                int i3 = i2 % 2;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = f481a + 85;
            g = i4 % 128;
            int i5 = i4 % 2;
            danaSiagaActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            danaSiagaActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ addMenu TuitionPaymentFragmentspecialinlinedviewModeldefault3(final DanaSiagaActivity danaSiagaActivity) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        String string = danaSiagaActivity.getString(R.string.pinang_name);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = danaSiagaActivity.getString(R.string.pinang_company);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = danaSiagaActivity.getString(R.string.pinang_description);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = danaSiagaActivity.getString(R.string.pinang_tenor);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = danaSiagaActivity.getString(R.string.pinang_process);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        arrayList.add(new DanaSiagaService(1, R.drawable.ic_bri_pinang, string, string2, string3, string4, "", string5));
        addMenu addmenu = new addMenu(danaSiagaActivity, arrayList, new Function1() { // from class: internalClear
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DanaSiagaActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (DanaSiagaService) obj);
            }
        });
        int i2 = g + 75;
        f481a = i2 % 128;
        int i3 = i2 % 2;
        return addmenu;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(DanaSiagaActivity danaSiagaActivity, DanaSiagaService danaSiagaService) {
        int i = 2 % 2;
        int i2 = g + 107;
        f481a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(danaSiagaService, "");
        if (i3 != 0) {
            DanaSiagaConcentActivity.Companion companion = DanaSiagaConcentActivity.INSTANCE;
            DanaSiagaConcentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(danaSiagaActivity, danaSiagaService);
            return Unit.INSTANCE;
        }
        DanaSiagaConcentActivity.Companion companion2 = DanaSiagaConcentActivity.INSTANCE;
        DanaSiagaConcentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(danaSiagaActivity, danaSiagaService);
        int i4 = 87 / 0;
        return Unit.INSTANCE;
    }

    static {
        asBinder = 0;
        d();
        INSTANCE = new Companion(null);
        int i = asInterface + 23;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f481a;
        int i3 = i2 + 31;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return R.layout.activity_danasiaga;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 7;
        f481a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f481a + 85;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentbindingInflater1(966628339, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1751037174 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step9).substring(20, 21).length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).length() - 1995419374, new Object[]{this}, -966628337);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iB = SearchView9.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(1982165572, iB, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 222073371, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, SearchView9.b(), new Object[]{this, bundle}, -1982165572);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        TuitionPaymentFragmentbindingInflater1(-523370262, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellDetailsDescription).substring(0, 139).length() - 888597992, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), (-2135737543) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).codePointAt(43), new Object[]{this}, 523370263);
    }

    static void d() {
        b = new char[]{60051, 60053, 60045, 60055, 60041, 60040, 60047, 60083, 60062, 60063, 60058, 60043, 60056, 60034, 60072, 60049, 60048, 60054, 60057, 60088, 60117, 60050, 60073, 60052, 60060};
        d = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, byte r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            byte[] r0 = com.bpjstku.presentation.danasiaga.DanaSiagaActivity.$$c
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = 116 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            r6 = r9
            r9 = r7
            r7 = r6
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.danasiaga.DanaSiagaActivity.$$i(byte, byte, int):java.lang.String");
    }
}
