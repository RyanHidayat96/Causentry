package com.bpjstku.presentation.account.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest;
import com.bpjstku.data.payment.model.response.GetListKodenonaktifAutodebitResponse;
import com.bpjstku.data.payment.model.response.ItemKodeNonaktifautodebitResponse;
import com.bpjstku.databinding.ActivityNonactiveAutodebetBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.model.ItemAutodebitParticipant;
import com.bpjstku.presentation.account.model.KodeNonaktifAutodebet;
import com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.getEntries;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isHideOnContentScrollEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0015\u0010\u001b\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010\r\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010\n\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u0015\u0010,\u001a\u00020+8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/account/setting/NonactiveAutodebetActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityNonactiveAutodebetBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/account/model/KodeNonaktifAutodebet;", "Lcom/bpjstku/presentation/account/model/KodeNonaktifAutodebet;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LListPopupWindow2;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "cancel", "Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "LgetStringOrNull;", "LgetStringOrNull;", "g", "", "Ljava/lang/String;", "", "Ljava/util/List;", "cancelAll", "LisHideOnContentScrollEnabled;", "INotificationSideChannel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NonactiveAutodebetActivity extends BindingReactiveFormActivity<ActivityNonactiveAutodebetBinding> {
    private static long INotificationSideChannel;
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private getStringOrNull g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getStringOrNull asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private ItemAutodebitParticipant a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private KodeNonaktifAutodebet b;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$f = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, -51, 54, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 98;
    private static int getInterfaceDescriptor = 1;
    private static int notify = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String d = "911";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<KodeNonaktifAutodebet> cancelAll = new ArrayList();

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: mask
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NonactiveAutodebetActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i4;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i2));
        int i12 = (~(i5 | i9 | i2)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i4 + i2 + i3 + (563899752 * i) + (667302295 * i6);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1426164010) - 416808960) + (1426164010 * i2) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i3) + ((-1270874112) * i) + (1914175488 * i6) + ((-1995833344) * i15);
        int i17 = (i4 * (-901935710)) + 144807674 + (i2 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i3 * (-901935539)) + (i * 42244168) + (i6 * (-913566613)) + (i15 * (-1006501888));
        int i18 = i16 + (i17 * i17 * (-1006239744));
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r7
            int r6 = 144 - r6
            byte[] r1 = com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity.$$a
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    public NonactiveAutodebetActivity() {
        final NonactiveAutodebetActivity nonactiveAutodebetActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ListPopupWindow2, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ListPopupWindow2 invoke() {
                ComponentCallbacks componentCallbacks = nonactiveAutodebetActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ListPopupWindow2.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = nonactiveAutodebetActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/account/setting/NonactiveAutodebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, NonactiveAutodebetActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityNonactiveAutodebetBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 113;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        NonactiveAutodebetActivity$bindingInflater$1 nonactiveAutodebetActivity$bindingInflater$1 = NonactiveAutodebetActivity$bindingInflater$1.b;
        int i4 = cancelAll + 45;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            return nonactiveAutodebetActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancelAll + 65;
        notify = i2 % 128;
        int i3 = i2 % 2;
        final ActivityNonactiveAutodebetBinding activityNonactiveAutodebetBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityNonactiveAutodebetBindingINotificationSideChannelStub.tilChoseNonactiveAutodebetParticipant.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: flag
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NonactiveAutodebetActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, activityNonactiveAutodebetBindingINotificationSideChannelStub, view);
                }
            });
        }
        MaterialButton materialButton = activityNonactiveAutodebetBindingINotificationSideChannelStub.btnNonactiveAutodebit;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: IntDef
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonactiveAutodebetActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i4 = cancelAll + 75;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(onTransact[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2187, 41 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 841711447, false, $$i(b, b2, (byte) (b2 + 3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(INotificationSideChannel), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 33017), TextUtils.lastIndexOf("", '0', 0) + 3012, 26 - Drawable.resolveOpacity(0, 0), 321985076, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), 3375 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, -968507904, false, $$i(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $10 + 123;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 97;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - ExpandableListView.getPackedPositionGroup(0L)), 3376 - TextUtils.getOffsetBefore("", 0), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -968507904, false, $$i(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final NonactiveAutodebetActivity nonactiveAutodebetActivity = (NonactiveAutodebetActivity) objArr[0];
        int i = 2 % 2;
        NonactiveAutodebetActivity nonactiveAutodebetActivity2 = nonactiveAutodebetActivity;
        ((ListPopupWindow2) nonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getInterfaceDescriptor.observe(nonactiveAutodebetActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: values
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((ListPopupWindow2) nonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStubProxy.observe(nonactiveAutodebetActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: valueOf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = notify + 103;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        this.a = null;
        ActivityNonactiveAutodebetBinding activityNonactiveAutodebetBindingINotificationSideChannelStub = INotificationSideChannelStub();
        activityNonactiveAutodebetBindingINotificationSideChannelStub.containerReasonNonactiveAutodebit.setVisibility(8);
        activityNonactiveAutodebetBindingINotificationSideChannelStub.containerInfoAutodebet.setVisibility(8);
        final ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        MutableLiveData<VirtualCameraAdapter1<GetListKodenonaktifAutodebitResponse>> mutableLiveData = listPopupWindow2.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(listPopupWindow2.write.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        final Function1 function1 = new Function1() { // from class: getDisplayMetrics
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(listPopupWindow2, (GetListKodenonaktifAutodebitResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getDrawableForDensity
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.notify(listPopupWindow2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getInteger
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        listPopupWindow2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = notify + 97;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        NonactiveAutodebetActivity nonactiveAutodebetActivity = this;
        Intrinsics.checkNotNullParameter(nonactiveAutodebetActivity, "");
        nonactiveAutodebetActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_nonactive_autodebet));
        RecyclerView recyclerView = INotificationSideChannelStub().rvKodeNonaktif;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        int i2 = 0;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((isHideOnContentScrollEnabled) this.INotificationSideChannel.getValue());
        KodeNonaktifAutodebet kodeNonaktifAutodebet = this.b;
        if (kodeNonaktifAutodebet != null) {
            int i3 = cancelAll + 73;
            notify = i3 % 128;
            int i4 = i3 % 2;
            List<Data> list = ((isHideOnContentScrollEnabled) this.INotificationSideChannel.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(list, "");
            int size = list.size() - 1;
            if (size >= 0) {
                int i5 = notify + 73;
                cancelAll = i5 % 128;
                int i6 = i5 % 2;
                while (true) {
                    KodeNonaktifAutodebet kodeNonaktifAutodebet2 = (KodeNonaktifAutodebet) list.get(i2);
                    kodeNonaktifAutodebet2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Intrinsics.areEqual(kodeNonaktifAutodebet2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, kodeNonaktifAutodebet.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    ((isHideOnContentScrollEnabled) this.INotificationSideChannel.getValue()).d.set(i2, (Data) kodeNonaktifAutodebet2);
                    if (i2 == size) {
                        break;
                    }
                    int i7 = cancelAll + 41;
                    notify = i7 % 128;
                    i2 = i7 % 2 != 0 ? i2 + 43 : i2 + 1;
                }
            }
            ((isHideOnContentScrollEnabled) this.INotificationSideChannel.getValue()).notifyDataSetChanged();
            int i8 = cancelAll + 105;
            notify = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = notify + 71;
        cancelAll = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = notify + 93;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNonactiveAutodebit;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnNonactiveAutodebit;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancelAll + 79;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNonactiveAutodebit;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNonactiveAutodebit;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = cancelAll + 1;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputEditText textInputEditText = INotificationSideChannelStub().edtChoseListAutodebet;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = cancelAll + 97;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 75;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = cancelAll + 15;
            notify = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrB$7879113;
        NonactiveAutodebetActivity nonactiveAutodebetActivity = (NonactiveAutodebetActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int trimmedLength = TextUtils.getTrimmedLength("") + 15;
            byte[] bArr = $$a;
            byte b = bArr[132];
            Object[] objArr3 = new Object[1];
            c(b, (short) (b | 140), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumFlingVelocity, trimmedLength, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_required).substring(5, 6).codePointAt(0) - 32, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20016), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e((ViewConfiguration.getFadingEdgeLength() >> 16) + 22, View.getDefaultSize(0, 0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step4).substring(7, 8).codePointAt(0) - 32), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iAlpha = Color.alpha(0) + 1031;
            int trimmedLength2 = 15 - TextUtils.getTrimmedLength("");
            byte[] bArr2 = $$a;
            byte b2 = bArr2[132];
            Object[] objArr6 = new Object[1];
            c(b2, (short) (b2 | 88), bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iAlpha, trimmedLength2, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = cancelAll + 119;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                byte b3 = $$a[7];
                Object[] objArr7 = new Object[1];
                c(b3, (short) (b3 | 37), (byte) 52, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, i4, i5, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iNextInt = new Random().nextInt(626463197);
            int i8 = ~(990480274 | iNextInt);
            int i9 = (-1608543234) + (((-1065066427) | i8) * (-814)) + ((i8 | (~((~iNextInt) | 746200104)) | 671613952) * 407) + (((~(iNextInt | (-746200105))) | (~((-990480275) | iNextInt)) | 671613952) * 407) + 1541775203;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr2[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(37 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "", 0, 0) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).codePointAt(0) - 80), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_message_link).substring(0, 22).codePointAt(7) + 6, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step2).substring(4, 5).codePointAt(0) - 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 55744), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, nonactiveAutodebetActivity)).intValue();
            try {
                Object[] objArr11 = {1594638619};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1133 - MotionEvent.axisFromString(""), 17 - TextUtils.lastIndexOf("", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1541775203, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                    int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[132];
                    Object[] objArr13 = new Object[1];
                    c(b4, (short) (b4 | 140), bArr3[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i12, pressedStateDuration, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 45993), 1117 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 17), Boolean.TYPE});
                }
                Object[] objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cGreen = (char) Color.green(0);
                    int i13 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    byte b5 = $$a[7];
                    Object[] objArr15 = new Object[1];
                    c(b5, (short) (b5 | 37), (byte) 52, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, i13, tapTimeout, 632103528, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).length() + 21, (char) (Color.blue(0) + 20016), objArr16);
                    Class<?> cls3 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_shopeepay_qris).substring(0, 5).codePointAt(0) - 68, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr17);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[132];
                        Object[] objArr18 = new Object[1];
                        c(b6, (short) (b6 | 88), bArr4[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, jumpTapTimeout, scrollDefaultDelay, 1344079056, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[132];
                        Object[] objArr19 = new Object[1];
                        c(b7, (short) (b7 | 140), bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, scrollBarSize, i14, 1357589585, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i15 = notify + 45;
                    cancelAll = i15 % 128;
                    int i16 = i15 % 2;
                    objArr2 = objArr14;
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
        int i17 = ((int[]) objArr2[1])[0];
        int i18 = ((int[]) objArr2[3])[0];
        if (i18 == i17) {
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr2[2])[0];
            int i20 = ((int[]) objArr2[3])[0];
            int i21 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iNextInt2 = new Random().nextInt(793241533);
            int i22 = i19 + (-2091904918) + (((~((-287311245) | (~iNextInt2))) | 43031074) * (-591)) + ((iNextInt2 | (-287311245)) * 591);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i18];
            int i25 = i18 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i25) % 2) - 1], 1).show();
            Object[] objArr21 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr2[2])[0];
            int i27 = ((int[]) objArr2[3])[0];
            int i28 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int iMyPid = Process.myPid();
            int i29 = i26 + 1735288292 + (((~(iMyPid | 584703822)) | 335683744) * 305) + (((~((~iMyPid) | 584703822)) | 340423652) * 305);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr21[2])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
            int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i32 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr6 = $$a;
            byte b8 = bArr6[132];
            Object[] objArr22 = new Object[1];
            c(b8, (short) (b8 | 36), (byte) (bArr6[33] - 1), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout2, scrollDefaultDelay2, i32, 986134021, false, (String) objArr22[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                byte[] bArr7 = $$a;
                byte b9 = bArr7[132];
                Object[] objArr23 = new Object[1];
                c(b9, (short) (b9 | 88), bArr7[7], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, doubleTapTimeout, packedPositionChild, 1599039318, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr24[0])[0]}, new int[]{((int[]) objArr24[1])[0]}, (Object[]) objArr24[2], new int[1], (String[]) objArr24[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i33 = ~iFreeMemory;
            int i34 = 316429289 + ((~(543374824 | i33)) * (-560)) + ((~(iFreeMemory | 871841774)) * (-560)) + (((~((-330772399) | i33)) | 2305448) * 560) + 454451553;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr25 = new Object[1];
            e(37 - (ViewConfiguration.getTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_error_internal_server).substring(28, 29).codePointAt(0) - 81, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.epay_bri).substring(0, 9).codePointAt(2) - 80), objArr25);
            Class<?> cls4 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 55780), objArr26);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr26[0], Object.class).invoke(null, nonactiveAutodebetActivity)).intValue();
            Object[] objArr27 = {1594638619};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) + 1726, ((Process.getThreadPriority(0) + 20) >> 6) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr27), 454451553, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                int i37 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr8 = $$a;
                byte b10 = bArr8[132];
                Object[] objArr28 = new Object[1];
                c(b10, (short) (b10 | 88), bArr8[7], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode, longPressTimeout, i37, 1599039318, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr29 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, 'F' - AndroidCharacter.getMirror('0'), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 20005), objArr29);
                Class<?> cls5 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_4).substring(1, 3).codePointAt(0) - 82, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_kioson).substring(19, 20).length() - 1), objArr30);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                    int i38 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte[] bArr9 = $$a;
                    byte b11 = bArr9[132];
                    short s = bArr9[7];
                    Object[] objArr31 = new Object[1];
                    c(b11, s, (byte) s, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveOpacity, i38, iIndexOf, 1596667560, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                    int defaultSize = View.getDefaultSize(0, 0) + 23;
                    byte[] bArr10 = $$a;
                    byte b12 = bArr10[132];
                    Object[] objArr32 = new Object[1];
                    c(b12, (short) (b12 | 36), (byte) (bArr10[33] - 1), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask, iKeyCodeFromString, defaultSize, 986134021, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArrB$7879113[1])[0];
        int i40 = ((int[]) objArrB$7879113[0])[0];
        if (i40 == i39) {
            int i41 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr33 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int i42 = (int) Runtime.getRuntime().totalMemory();
            int i43 = i41 + (((~((-180202157) | i42)) | 168921120) * (-283)) + 772639129 + ((~(i42 | (-11281037))) * 283);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr33[3])[0] = i45 ^ (i45 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrB$7879113[4];
        if (strArr5 != null) {
            int i46 = notify + 97;
            cancelAll = i46 % 128;
            int i47 = i46 % 2;
            for (String str2 : strArr5) {
                arrayList2.add(str2);
            }
        }
        int[] iArr2 = new int[i40];
        int i48 = i40 - 1;
        iArr2[i48] = 1;
        Toast.makeText((Context) null, iArr2[((i40 * i48) % 2) - 1], 1).show();
        int i49 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr34 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i50 = ~iFreeMemory2;
        int i51 = i49 + 811625157 + (((~((-124748480) | i50)) | (~(iFreeMemory2 | 87853946))) * 333) + (((~(iFreeMemory2 | (-124748480))) | (~(i50 | 87853946))) * 333);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr34[3])[0] = i53 ^ (i53 << 5);
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1754332023
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 1;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            if (i3 != (-559250944) + (((~(1757970857 | i4)) | 1216348457) * (-502)) + ((~((~i4) | 2144331771)) * (-502)) + (((~(i4 | (-927983315))) | 1757970857) * TypedValues.PositionType.TYPE_DRAWPATH)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            if (i5 != (((~(1943650235 | i6)) | (~((-1116284161) | iIdentityHashCode))) * 988) + 1170693244 + (((~(iIdentityHashCode | 1657353618)) | 286296617 | (~(i6 | (-1116284161)))) * 988)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i8 = ~startElapsedRealtime;
        if (i7 != (-1234856132) + (((~(i8 | 1035495497)) | (~((-1543560468) | i8)) | 1073779986) * 464) + (((-469780482) | startElapsedRealtime) * (-464)) + (((~(startElapsedRealtime | 1035495497)) | 1073779986) * 464)) {
            int i9 = (-1809273584) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = notify + 101;
        cancelAll = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1287374217
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        String strValueOf;
        String str2;
        NonactiveAutodebetActivity nonactiveAutodebetActivity = (NonactiveAutodebetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 13;
        notify = i2 % 128;
        int i3 = i2 % 2;
        KodeNonaktifAutodebet kodeNonaktifAutodebet = nonactiveAutodebetActivity.b;
        if (kodeNonaktifAutodebet != null) {
            str = kodeNonaktifAutodebet.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = cancelAll + 7;
            notify = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, nonactiveAutodebetActivity.d)) {
            EditText editText = nonactiveAutodebetActivity.INotificationSideChannelStub().tilReasonNonactiveAutodebet.getEditText();
            strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        } else {
            KodeNonaktifAutodebet kodeNonaktifAutodebet2 = nonactiveAutodebetActivity.b;
            strValueOf = String.valueOf(kodeNonaktifAutodebet2 != null ? kodeNonaktifAutodebet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        }
        nonactiveAutodebetActivity.asBinder = strValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) nonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) nonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            int i6 = notify + 75;
            cancelAll = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw null;
            }
            str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("#");
        sb.append(jCurrentTimeMillis);
        String string = sb.toString();
        ItemAutodebitParticipant itemAutodebitParticipant = nonactiveAutodebetActivity.a;
        Intrinsics.checkNotNull(itemAutodebitParticipant);
        String str4 = itemAutodebitParticipant.asInterface;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append("#");
        sb2.append(jCurrentTimeMillis);
        NonactiveAutodebetRequest nonactiveAutodebetRequest = new NonactiveAutodebetRequest(sb2.toString(), string, nonactiveAutodebetActivity.asBinder);
        Intrinsics.checkNotNullParameter(nonactiveAutodebetRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = listPopupWindow2.INotificationSideChannelStubProxy;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(listPopupWindow2.write.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nonactiveAutodebetRequest)));
        final Function1 function1 = new Function1() { // from class: getBoolean
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(listPopupWindow2, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getConfiguration
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getDrawableCanonical
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListPopupWindow2.onTransact(listPopupWindow2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getFraction
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        listPopupWindow2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = cancelAll + 69;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NonactiveAutodebetActivity nonactiveAutodebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        int i3 = cancelAll;
        int i4 = i3 + 125;
        notify = i4 % 128;
        int i5 = i4 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                nonactiveAutodebetActivity.IconCompatParcelizer();
                int i6 = 0;
                for (ItemKodeNonaktifautodebitResponse itemKodeNonaktifautodebitResponse : ((GetListKodenonaktifAutodebitResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData()) {
                    nonactiveAutodebetActivity.cancelAll.add(i6, new KodeNonaktifAutodebet(itemKodeNonaktifautodebitResponse.getKode(), itemKodeNonaktifautodebitResponse.getDeskripsi(), false, 4, null));
                    i6++;
                }
                nonactiveAutodebetActivity.cancelAll.add(new KodeNonaktifAutodebet(nonactiveAutodebetActivity.d, "Lainnya, sebutkan disini", false));
                ((isHideOnContentScrollEnabled) nonactiveAutodebetActivity.INotificationSideChannel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(nonactiveAutodebetActivity.cancelAll);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i7 = i3 + 19;
                notify = i7 % 128;
                if (i7 % 2 != 0) {
                    nonactiveAutodebetActivity.IconCompatParcelizer();
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                } else {
                    nonactiveAutodebetActivity.IconCompatParcelizer();
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                }
            } else {
                nonactiveAutodebetActivity.IconCompatParcelizer();
                i = cancelAll + 47;
            }
            return Unit.INSTANCE;
        }
        nonactiveAutodebetActivity.MediaBrowserCompat();
        i = cancelAll + 109;
        notify = i % 128;
        int i8 = i % 2;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NonactiveAutodebetActivity nonactiveAutodebetActivity) {
        int i = 2 % 2;
        int i2 = notify + 47;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            nonactiveAutodebetActivity.d_();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        nonactiveAutodebetActivity.d_();
        Unit unit2 = Unit.INSTANCE;
        int i3 = notify + 47;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final NonactiveAutodebetActivity nonactiveAutodebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 73;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            nonactiveAutodebetActivity.MediaBrowserCompat();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            int i4 = cancelAll + 115;
            notify = i4 % 128;
            int i5 = i4 % 2;
            nonactiveAutodebetActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            ItemAutodebitParticipant itemAutodebitParticipant = nonactiveAutodebetActivity.a;
            String str2 = null;
            if (itemAutodebitParticipant != null) {
                int i6 = cancelAll + 81;
                notify = i6 % 128;
                if (i6 % 2 != 0) {
                    str = itemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1;
                    int i7 = 95 / 0;
                } else {
                    str = itemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1;
                }
            } else {
                str = null;
            }
            ItemAutodebitParticipant itemAutodebitParticipant2 = nonactiveAutodebetActivity.a;
            if (itemAutodebitParticipant2 != null) {
                int i8 = cancelAll + 25;
                notify = i8 % 128;
                int i9 = i8 % 2;
                str2 = itemAutodebitParticipant2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            StringBuilder sb = new StringBuilder("Penonaktifan auto debit berhasil dilakukan atas nama ");
            sb.append(str);
            sb.append(" pada ");
            sb.append(str2);
            sb.append(".");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, "", sb.toString(), "Ok", new Function0() { // from class: enumMapping
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NonactiveAutodebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }, 96);
            nonactiveAutodebetActivity.asInterface = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager supportFragmentManager = nonactiveAutodebetActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            nonactiveAutodebetActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            nonactiveAutodebetActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ isHideOnContentScrollEnabled TuitionPaymentFragmentbindingInflater1(final NonactiveAutodebetActivity nonactiveAutodebetActivity) {
        int i = 2 % 2;
        isHideOnContentScrollEnabled ishideoncontentscrollenabled = new isHideOnContentScrollEnabled(nonactiveAutodebetActivity, nonactiveAutodebetActivity.cancelAll, new Function2() { // from class: target
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NonactiveAutodebetActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((Integer) obj).intValue(), (KodeNonaktifAutodebet) obj2);
            }
        });
        int i2 = notify + 95;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return ishideoncontentscrollenabled;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final NonactiveAutodebetActivity nonactiveAutodebetActivity, View view) {
        String str;
        int i = 2 % 2;
        int i2 = notify + 39;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            KodeNonaktifAutodebet kodeNonaktifAutodebet = nonactiveAutodebetActivity.b;
            throw null;
        }
        if (nonactiveAutodebetActivity.b == null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nonactiveAutodebetActivity, "Silakan pilih alasan nonaktif", null);
        } else {
            ItemAutodebitParticipant itemAutodebitParticipant = nonactiveAutodebetActivity.a;
            Intrinsics.checkNotNull(itemAutodebitParticipant);
            if (itemAutodebitParticipant.a) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_warning_2, "Nonaktif Autodebit", "Apakah anda yakin akan melakukan penonaktifan autodebit", "Proses", new Function0() { // from class: InspectablePropertyEnumEntry
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return (Unit) NonactiveAutodebetActivity.b(MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -331493350, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, 331493351, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    }
                }, nonactiveAutodebetActivity.getString(R.string.action_return), new Function0() { // from class: InspectablePropertyValueType
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NonactiveAutodebetActivity.g();
                    }
                });
                nonactiveAutodebetActivity.g = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                FragmentManager supportFragmentManager = nonactiveAutodebetActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = notify + 119;
                    cancelAll = i4 % 128;
                    if (i4 % 2 == 0) {
                        getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        throw null;
                    }
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                NonactiveAutodebetActivity nonactiveAutodebetActivity2 = nonactiveAutodebetActivity;
                ItemAutodebitParticipant itemAutodebitParticipant2 = nonactiveAutodebetActivity.a;
                if (itemAutodebitParticipant2 != null) {
                    str = itemAutodebitParticipant2.g;
                    int i5 = cancelAll + 49;
                    notify = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    str = null;
                }
                StringBuilder sb = new StringBuilder("Penonaktifan auto debit dapat dilakukan setelah 30 hari dari tanggal ");
                sb.append(str);
                sb.append(" atas pendaftaran auto debit.");
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nonactiveAutodebetActivity2, sb.toString(), null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit b(NonactiveAutodebetActivity nonactiveAutodebetActivity, int i, KodeNonaktifAutodebet kodeNonaktifAutodebet) {
        String str;
        Object next;
        int i2 = 2 % 2;
        int i3 = notify + 59;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(kodeNonaktifAutodebet, "");
        List<Data> list = ((isHideOnContentScrollEnabled) nonactiveAutodebetActivity.INotificationSideChannel.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(list, "");
        int size = list.size() - 1;
        if (size >= 0) {
            int i5 = 0;
            while (true) {
                KodeNonaktifAutodebet kodeNonaktifAutodebet2 = (KodeNonaktifAutodebet) list.get(i5);
                kodeNonaktifAutodebet2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i == i5;
                ((isHideOnContentScrollEnabled) nonactiveAutodebetActivity.INotificationSideChannel.getValue()).d.set(i5, (Data) kodeNonaktifAutodebet2);
                if (i5 == size) {
                    break;
                }
                int i6 = cancelAll + 103;
                notify = i6 % 128;
                i5 = i6 % 2 != 0 ? i5 + 56 : i5 + 1;
            }
        }
        ((isHideOnContentScrollEnabled) nonactiveAutodebetActivity.INotificationSideChannel.getValue()).notifyDataSetChanged();
        Iterator<T> it = nonactiveAutodebetActivity.cancelAll.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((KodeNonaktifAutodebet) next).TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(kodeNonaktifAutodebet.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        KodeNonaktifAutodebet kodeNonaktifAutodebet3 = (KodeNonaktifAutodebet) next;
        nonactiveAutodebetActivity.b = kodeNonaktifAutodebet3;
        if (kodeNonaktifAutodebet3 != null) {
            int i7 = notify + 111;
            cancelAll = i7 % 128;
            int i8 = i7 % 2;
            str = kodeNonaktifAutodebet3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (Intrinsics.areEqual(str, nonactiveAutodebetActivity.d)) {
            int i9 = cancelAll + 57;
            notify = i9 % 128;
            if (i9 % 2 != 0) {
                nonactiveAutodebetActivity.INotificationSideChannelStub().tilReasonNonactiveAutodebet.setVisibility(0);
            } else {
                nonactiveAutodebetActivity.INotificationSideChannelStub().tilReasonNonactiveAutodebet.setVisibility(0);
            }
        } else {
            nonactiveAutodebetActivity.INotificationSideChannelStub().tilReasonNonactiveAutodebet.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final NonactiveAutodebetActivity nonactiveAutodebetActivity, final ActivityNonactiveAutodebetBinding activityNonactiveAutodebetBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getEntries.Companion companion = getEntries.INSTANCE;
            getEntries getentriesB = getEntries.Companion.b(nonactiveAutodebetActivity.a, new Function1() { // from class: InspectablePropertyFlagEntry
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, activityNonactiveAutodebetBinding, (ItemAutodebitParticipant) obj};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    return (Unit) NonactiveAutodebetActivity.b(MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1767777855, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, 1767777855, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            });
            FragmentManager supportFragmentManager = nonactiveAutodebetActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getentriesB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = notify + 119;
                cancelAll = i2 % 128;
                if (i2 % 2 == 0) {
                    getentriesB.show(supportFragmentManager, getentriesB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i3 = 15 / 0;
                } else {
                    getentriesB.show(supportFragmentManager, getentriesB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
            int i4 = notify + 35;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws ParseException {
        String str;
        String str2;
        String str3;
        NonactiveAutodebetActivity nonactiveAutodebetActivity = (NonactiveAutodebetActivity) objArr[0];
        ActivityNonactiveAutodebetBinding activityNonactiveAutodebetBinding = (ActivityNonactiveAutodebetBinding) objArr[1];
        ItemAutodebitParticipant itemAutodebitParticipant = (ItemAutodebitParticipant) objArr[2];
        int i = 2 % 2;
        int i2 = cancelAll + 121;
        notify = i2 % 128;
        int i3 = i2 % 2;
        nonactiveAutodebetActivity.a = itemAutodebitParticipant;
        EditText editText = activityNonactiveAutodebetBinding.tilChoseNonactiveAutodebetParticipant.getEditText();
        String strTuitionPaymentFragmentbindingInflater1 = null;
        if (editText != null) {
            editText.setText(String.valueOf(itemAutodebitParticipant != null ? itemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1 : null));
        }
        ActivityNonactiveAutodebetBinding activityNonactiveAutodebetBindingINotificationSideChannelStub = nonactiveAutodebetActivity.INotificationSideChannelStub();
        if (nonactiveAutodebetActivity.a == null) {
            activityNonactiveAutodebetBindingINotificationSideChannelStub.containerInfoAutodebet.setVisibility(8);
        } else {
            activityNonactiveAutodebetBindingINotificationSideChannelStub.containerInfoAutodebet.setVisibility(0);
            TextView textView = activityNonactiveAutodebetBindingINotificationSideChannelStub.tvTitleInfoNikValue;
            ItemAutodebitParticipant itemAutodebitParticipant2 = nonactiveAutodebetActivity.a;
            if (itemAutodebitParticipant2 != null) {
                str = itemAutodebitParticipant2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                int i4 = notify + 93;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                str = null;
            }
            textView.setText(String.valueOf(str));
            TextView textView2 = activityNonactiveAutodebetBindingINotificationSideChannelStub.tvTitleInfoNamaValue;
            ItemAutodebitParticipant itemAutodebitParticipant3 = nonactiveAutodebetActivity.a;
            textView2.setText(String.valueOf(itemAutodebitParticipant3 != null ? itemAutodebitParticipant3.TuitionPaymentFragmentbindingInflater1 : null));
            TextView textView3 = activityNonactiveAutodebetBindingINotificationSideChannelStub.tvChannelAutodebetValue;
            ItemAutodebitParticipant itemAutodebitParticipant4 = nonactiveAutodebetActivity.a;
            if (itemAutodebitParticipant4 != null) {
                int i6 = notify + 23;
                cancelAll = i6 % 128;
                if (i6 % 2 == 0) {
                    str2 = itemAutodebitParticipant4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i7 = 58 / 0;
                } else {
                    str2 = itemAutodebitParticipant4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            } else {
                str2 = null;
            }
            textView3.setText(String.valueOf(str2));
            TextView textView4 = activityNonactiveAutodebetBindingINotificationSideChannelStub.tvTitleInfoTuitionValue;
            ItemAutodebitParticipant itemAutodebitParticipant5 = nonactiveAutodebetActivity.a;
            if (itemAutodebitParticipant5 != null && (str3 = itemAutodebitParticipant5.asBinder) != null) {
                strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str3);
            }
            textView4.setText(String.valueOf(strTuitionPaymentFragmentbindingInflater1));
        }
        activityNonactiveAutodebetBindingINotificationSideChannelStub.containerReasonNonactiveAutodebit.setVisibility(0);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NonactiveAutodebetActivity nonactiveAutodebetActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) b(MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -331493350, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{nonactiveAutodebetActivity}, 331493351, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NonactiveAutodebetActivity nonactiveAutodebetActivity, ActivityNonactiveAutodebetBinding activityNonactiveAutodebetBinding, ItemAutodebitParticipant itemAutodebitParticipant) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) b(MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1767777855, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{nonactiveAutodebetActivity, activityNonactiveAutodebetBinding, itemAutodebitParticipant}, 1767777855, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static {
        INotificationSideChannelStub = 0;
        onTransact();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 125;
        INotificationSideChannelStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 29;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_nonactive_autodebet;
        }
        int i3 = 19 / 0;
        return R.layout.activity_nonactive_autodebet;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int length = 1268276195 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_delete_message).substring(0, 1).length();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 516289646;
        b(MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1830280565, i, new Object[]{this}, -1830280563, length, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1734621553, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, 1734621556, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 73;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = notify + 95;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1285196380, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this, context}, 1285196384, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static void onTransact() {
        onTransact = new char[]{65485, 64073, 62686, 61311, 59887, 58482, 56970, 55631, 54171, 52796, 51436, 49926, 48465, 47056, 45634, 44268, 42865, 41428, 39942, 38546, 37139, 35744, 45561, 46203, 47851, 41293, 42947, 43598, 37050, 38659, 40353, 32798, 34462, 36113, 62321, 63998, 64611, 45558, 46198, 47868, 41308, 42910, 43591, 37055, 38719, 40355, 32849, 34465, 36124, 62315, 63975, 64611, 58068, 26641, 28055, 25355, 30903, 32288, 29606, 18766, 20172, 17512, 23034, 24421, 21737, 10943, Typography.leftSingleQuote, 9606, 15160};
        INotificationSideChannel = 303788631860622359L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 67;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity.$$i(int, short, byte):java.lang.String");
    }
}
