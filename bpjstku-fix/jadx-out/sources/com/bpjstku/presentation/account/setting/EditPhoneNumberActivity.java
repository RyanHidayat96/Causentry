package com.bpjstku.presentation.account.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.databinding.ActivityEditPhoneNumberBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.EditPhoneNumberActivity;
import com.bpjstku.presentation.account.verify.AccountVerificationActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.auth.zzgx;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LayoutSettings;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getItemView;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setSurfaceAspectRatio;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u000b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0015\u0010\b\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/account/setting/EditPhoneNumberActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityEditPhoneNumberBinding;", "<init>", "()V", "", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "", "INotificationSideChannel", "()Ljava/lang/String;", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "LIntegerRes;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditPhoneNumberActivity extends BindingReactiveFormActivity<ActivityEditPhoneNumberBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asInterface;
    private static int d;
    private static long g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: Discouraged
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private CodeNamePair asInterface;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {29, -5, -24, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 129;
    private static int INotificationSideChannel = 1;
    private static int cancel = 0;
    private static int cancelAll = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2116530051
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r6, int r7, int r8, int r9, int r10, java.lang.Object[] r11, int r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, int, int, int, int, java.lang.Object[], int):java.lang.Object");
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
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r8 = r8 + 4
            byte[] r1 = com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    public EditPhoneNumberActivity() {
        final EditPhoneNumberActivity editPhoneNumberActivity = this;
        this.b = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = editPhoneNumberActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = editPhoneNumberActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/account/setting/EditPhoneNumberActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, EditPhoneNumberActivity.class, new Pair[]{TuplesKt.to("check_sum", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityEditPhoneNumberBinding> TuitionPaymentFragmentbindingInflater1() {
        EditPhoneNumberActivity$bindingInflater$1 editPhoneNumberActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = cancel + 103;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            editPhoneNumberActivity$bindingInflater$1 = EditPhoneNumberActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = 60 / 0;
        } else {
            editPhoneNumberActivity$bindingInflater$1 = EditPhoneNumberActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i4 = cancelAll + 1;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return editPhoneNumberActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 27;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        EditPhoneNumberActivity editPhoneNumberActivity = this;
        Intrinsics.checkNotNullParameter(editPhoneNumberActivity, "");
        editPhoneNumberActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_edit_phone_number));
        int i4 = cancelAll + 97;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityEditPhoneNumberBinding activityEditPhoneNumberBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Button button = activityEditPhoneNumberBindingINotificationSideChannelStub.btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: DisplayContext
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditPhoneNumberActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityEditPhoneNumberBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        activityEditPhoneNumberBindingINotificationSideChannelStub.tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: DimensionCompanion
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, activityEditPhoneNumberBindingINotificationSideChannelStub, view);
            }
        });
        int i2 = cancel + 21;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 19;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8327), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1234, 35 - Gravity.getAbsoluteGravity(0, 0), -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) i2;
                    byte b4 = (byte) (b3 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), Color.red(0) + 2764, 13 - TextUtils.lastIndexOf("", '0', 0, 0), 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 254 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 65200);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2891;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 17;
                    byte b5 = (byte) ($$f & 7);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, threadPriority, iCombineMeasuredStates, 2012627446, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (g ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) d) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asInterface) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 125;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 57;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("check_sum");
        if (stringExtra == null) {
            int i4 = cancel + 77;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 3;
            }
            stringExtra = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stringExtra;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((IntegerRes) this.b.getValue()).connect.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: unit
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = cancelAll + 7;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        EditPhoneNumberActivity editPhoneNumberActivity = (EditPhoneNumberActivity) objArr[0];
        int i = 2 % 2;
        String str = editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str == null) {
            int i2 = cancel + 85;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = cancelAll + 27;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        if (str.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Terjadi perbedaan integritas data", 0).show();
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i6 = cancelAll + 51;
            cancel = i6 % 128;
            int i7 = i6 % 2;
        }
        return null;
    }

    private final String INotificationSideChannel() {
        int i = 2 % 2;
        String strReplace$default = StringsKt.replace$default(StringsKt.trim((CharSequence) INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+", "", false, 4, (Object) null);
        String string = StringsKt.trim((CharSequence) INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace$default);
        sb.append(string);
        String string2 = sb.toString();
        int i2 = cancelAll + 123;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            return string2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = cancelAll + 111;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
        int i4 = cancel + 93;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancelAll + 43;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSavePhoneNumber;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
        int i4 = cancel + 53;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int iRed = Color.red(0) + 1031;
            int iGreen = 15 - Color.green(0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[132], (byte) 52, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, iRed, iGreen, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{29774, 58337, 9702, 12469}, (char) (KeyEvent.getMaxKeyCode() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98, new char[]{1992, 3376, 25366, 41122, 50463, 49193, 65509, 5400, 43620, 56614, 16039, 38178, 47416, 15057, 38055, 15671, 60207, 14295, 51073, 45725, 50909, 56627}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{388, 28181, 62873, 41150}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 48849), (-1720838947) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, new char[]{5530, 522, 59218, 49339, 24516, 49381, 19885, 26613, 40780, 7001, 49295, 51705, 54239, 4634, 60308}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int size = 1031 - View.MeasureSpec.getSize(0);
            int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
            byte b = (byte) 52;
            Object[] objArr5 = new Object[1];
            c($$a[132], b, (short) (b - 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, size, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = cancel + 67;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int defaultSize = 1031 - View.getDefaultSize(0, 0);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, (short) (b3 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, defaultSize, absoluteGravity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyUid = Process.myUid();
            int i8 = 2105328549 + (((~(231692119 | iMyUid)) | 12588050) * (-756)) + (((~iMyUid) | 231692119) * 756) + 1961706982;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{41339, 47248, 28849, 20482}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 509), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_sdk_general_error).substring(0, 45).length() - 45, new char[]{31784, 62185, 33308, 12121, 799, 6250, 19062, 36525, 58496, 41654, 35918, 3383, 18947, 58785, 47339, 65170}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{62514, 17634, 37832, 27186}, (char) (12948 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{37548, 26202, 19193, 2392, 23855, 56505, 21968, 6465, 59952, 3287, 61505, 62882, 44055, 36226, 31819, 16387}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1170723314};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46038), 1134 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1961706982, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int mirror = 1079 - AndroidCharacter.getMirror('0');
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c(bArr2[132], (byte) 52, bArr2[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, mirror, iResolveOpacity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 45993), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1117, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                    int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b4, b5, (short) (b5 | 103), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, capsMode, maximumFlingVelocity, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{29774, 58337, 9702, 12469}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step2).substring(1, 3).codePointAt(0) - 108, new char[]{1992, 3376, 25366, 41122, 50463, 49193, 65509, 5400, 43620, 56614, 16039, 38178, 47416, 15057, 38055, 15671, 60207, 14295, 51073, 45725, 50909, 56627}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{388, 28181, 62873, 41150}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bank_transfer).substring(0, 4).codePointAt(1) + 48801), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_not_enabled_message).substring(5, 6).length() - 1720838912, new char[]{5530, 522, 59218, 49339, 24516, 49381, 19885, 26613, 40780, 7001, 49295, 51705, 54239, 4634, 60308}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
                        int size2 = 15 - View.MeasureSpec.getSize(0);
                        byte b6 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        c($$a[132], b6, (short) (b6 - 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, iKeyCodeFromString, size2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                        int iGreen2 = Color.green(0) + 15;
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr3[132], (byte) 52, bArr3[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSizeAndState, packedPositionGroup, iGreen2, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i11 = cancel + 97;
            cancelAll = i11 % 128;
            int i12 = i11 % 2;
            while (i2 < strArr2.length) {
                arrayList.add(strArr2[i2]);
                i2++;
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i17 = i13 + ((((-32342713) + (((~i16) | 865055918) * 1444)) + (((~(i16 | (-451962868))) | ((~(696243037 | i16)) | 310387874)) * (-1444))) - 1800115598);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr18[2])[0] = i19 ^ (i19 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
            int maximumFlingVelocity2 = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b7 = $$a[132];
            byte b8 = (byte) (b7 | 36);
            Object[] objArr19 = new Object[1];
            c(b7, b8, (short) (b8 | 66), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(minimumFlingVelocity, iNormalizeMetaState, maximumFlingVelocity2, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b9 = (byte) 52;
                Object[] objArr20 = new Object[1];
                c($$a[132], b9, (short) (b9 - 1), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, iIndexOf, modifierMetaStateMask, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i20 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{i20}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i21 = ~startElapsedRealtime;
            int i22 = (~((-110558124) | i21)) | 8579361 | (~(102044302 | i21));
            int i23 = (((940789519 + (((~(startElapsedRealtime | (-65541))) | i22) * 590)) + (i22 * (-1180))) + (((~((-102044303) | i21)) | (~(i21 | 110558123))) * 590)) - 1726461119;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i25 ^ (i25 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{41339, 47248, 28849, 20482}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 588), KeyEvent.getMaxKeyCode() >> 16, new char[]{31784, 62185, 33308, 12121, 799, 6250, 19062, 36525, 58496, 41654, 35918, 3383, 18947, 58785, 47339, 65170}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{62514, 17634, 37832, 27186}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 12911), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{37548, 26202, 19193, 2392, 23855, 56505, 21968, 6465, 59952, 3287, 61505, 62882, 44055, 36226, 31819, 16387}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1170723314};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), ExpandableListView.getPackedPositionGroup(0L) + 1726, TextUtils.indexOf("", "", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -1726461119);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                byte b10 = (byte) 52;
                Object[] objArr25 = new Object[1];
                c($$a[132], b10, (short) (b10 - 1), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, iMakeMeasureSpec, maximumFlingVelocity3, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{29774, 58337, 9702, 12469}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1060).substring(0, 31).length() - 31), (Process.getThreadPriority(0) + 20) >> 6, new char[]{1992, 3376, 25366, 41122, 50463, 49193, 65509, 5400, 43620, 56614, 16039, 38178, 47416, 15057, 38055, 15671, 60207, 14295, 51073, 45725, 50909, 56627}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{388, 28181, 62873, 41150}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 48849), (-1720838911) - View.MeasureSpec.getSize(0), new char[]{5530, 522, 59218, 49339, 24516, 49381, 19885, 26613, 40780, 7001, 49295, 51705, 54239, 4634, 60308}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                    int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    Object[] objArr28 = new Object[1];
                    c($$a[132], (byte) 52, (short) 140, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(fadingEdgeLength, pressedStateDuration, keyRepeatDelay, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                    int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                    int i26 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                    byte b11 = $$a[132];
                    byte b12 = (byte) (b11 | 36);
                    Object[] objArr29 = new Object[1];
                    c(b11, b12, (short) (b12 | 66), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatTimeout, iArgb, i26, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr4 == null) {
                throw null;
            }
            int i27 = cancelAll + 1;
            cancel = i27 % 128;
            int i28 = i27 % 2;
            while (i2 < strArr4.length) {
                arrayList2.add(strArr4[i2]);
                i2++;
            }
            throw null;
        }
        int i29 = cancelAll + 15;
        cancel = i29 % 128;
        int i30 = i29 % 2;
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i32}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i33 = ~iIdentityHashCode;
        int i34 = i31 + 176828186 + (((~(i33 | (-693303280))) | 905905705) * (-1042)) + (((-693303280) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-905905706))) | 346882048 | (~(i33 | (-134279623)))) * 521);
        int i35 = (i34 << 13) ^ i34;
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr30[3])[0] = i36 ^ (i36 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b1, code lost:
    
        if (r1 != ((r6 + ((r5 | (~((-1208254797) | r2))) * 50)) + (((~(r2 | 833255952)) | ((~((-1745800013) | r2)) | 1208254796)) * 50))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b3, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.cancel + 103;
        com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.cancelAll = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c8, code lost:
    
        throw new java.lang.RuntimeException("-1700385000");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004f, code lost:
    
        if (r1 == (((24719761 + (((-2008872828) | r5) * (-814))) + ((r5 | ((~((~r4) | 1453125946)) | 67391522)) * 407)) + (((~(r4 | (-1453125947))) | ((~((-623138404) | r4)) | 67391522)) * 407))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (r1 == (((((~((-1070764308) | r4)) | 826409218) * (-566)) - 1233805420) + ((~(r4 | (-244355090))) * 566))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r6 = (-98474076) + ((r2 | 833255952) * (-50));
        r5 = ~((-537545217) | r2);
        r2 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00a5  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancelAll + 5;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != 550387624 + (((~((-524029074) | iIdentityHashCode)) | 252184721) * 1504) + ((~(iIdentityHashCode | (-271844353))) * (-1504)) + 1585893792) {
                int[] iArr = new int[1854734323];
                iArr[1854734322] = 1;
                int i4 = 1461780662 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i5 = cancel + 67;
                cancelAll = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            int i7 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_internet).substring(0, 16).codePointAt(1) + 892603383;
            int i8 = (~(1452532055 | iCodePointAt)) | 554174080;
            int i9 = ~iCodePointAt;
            if (i7 != 1260472760 + ((i8 | (~((-1384161624) | i9))) * 886) + (((~(i9 | (-1452532056))) | 622544512) * (-1772)) + ((~(i9 | 622544512)) * 886)) {
                int[] iArr2 = new int[1854734323];
                iArr2[1854734322] = 1;
                int i10 = 1461780662 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i11 = cancel + 67;
                cancelAll = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i14 = ~layoutDirection;
        if (i13 != 767966968 + (((-1783039270) | i14) * (-369)) + (((~((-337144539) | i14)) | (-2053055870)) * (-369)) + (((~(layoutDirection | 337144538)) | (-2120183808) | (~(i14 | (-270016601)))) * 369)) {
            throw null;
        }
        super.onStart();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(EditPhoneNumberActivity editPhoneNumberActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            editPhoneNumberActivity.MediaBrowserCompat();
            str = "loading_new_phone_number_verification";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            editPhoneNumberActivity.IconCompatParcelizer();
            AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            EditPhoneNumberActivity editPhoneNumberActivity2 = editPhoneNumberActivity;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str2 == null) {
                int i2 = cancelAll + 77;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                str2 = "";
            }
            String str3 = editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3 == null) {
                int i4 = cancelAll + 123;
                cancel = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                str3 = null;
            }
            AccountVerificationActivity.b.b(editPhoneNumberActivity2, str2, str3, 5, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, 32);
            str = "success_new_phone_number_verification";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = cancelAll + 11;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            editPhoneNumberActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_new_phone_number_verification";
        } else {
            editPhoneNumberActivity.IconCompatParcelizer();
            int i8 = cancelAll + 35;
            cancel = i8 % 128;
            int i9 = i8 % 2;
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_new_phone_number_result", str));
        Intrinsics.checkNotNullParameter(editPhoneNumberActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        Unit unit = Unit.INSTANCE;
        int i10 = cancelAll + 105;
        cancel = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditPhoneNumberActivity editPhoneNumberActivity) {
        int i = 2 % 2;
        int i2 = cancel + 99;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i;
        EditPhoneNumberActivity editPhoneNumberActivity = (EditPhoneNumberActivity) objArr[0];
        ActivityEditPhoneNumberBinding activityEditPhoneNumberBinding = (ActivityEditPhoneNumberBinding) objArr[1];
        CodeNamePair codeNamePair = (CodeNamePair) objArr[2];
        int i2 = 2 % 2;
        int i3 = cancel + 23;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        editPhoneNumberActivity.asInterface = codeNamePair;
        TextView textView = activityEditPhoneNumberBinding.tvSamplePhoneNumber;
        if (Intrinsics.areEqual(codeNamePair.b, "+62")) {
            int i5 = cancelAll + 95;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (codeNamePair.b.length() > 0) {
            int i7 = cancelAll + 49;
            cancel = i7 % 128;
            if (i7 % 2 != 0) {
                activityEditPhoneNumberBinding.tvPrefix.setText(codeNamePair.b);
                int i8 = 30 / 0;
            } else {
                activityEditPhoneNumberBinding.tvPrefix.setText(codeNamePair.b);
            }
        } else {
            String string = editPhoneNumberActivity.getString(R.string.label_dialcode_empty);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x012c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0078  */
    /* JADX WARN: Code duplicated, block: B:8:0x0093  */
    public static /* synthetic */ Unit b(EditPhoneNumberActivity editPhoneNumberActivity, ActivityEditPhoneNumberBinding activityEditPhoneNumberBinding, View view) {
        int length;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        EditPhoneNumberActivity editPhoneNumberActivity2 = editPhoneNumberActivity;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_new_phone_number", "save_new_phone_number"));
        Intrinsics.checkNotNullParameter(editPhoneNumberActivity2, "");
        Intrinsics.checkNotNullParameter("save_new_phone_number", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("save_new_phone_number", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("save_new_phone_number", mapMutableMapOf);
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) activityEditPhoneNumberBinding.tvPrefix.getText().toString()).toString(), "+62")) {
            String string = StringsKt.trim((CharSequence) activityEditPhoneNumberBinding.edtPhoneNumber.getText().toString()).toString();
            Intrinsics.checkNotNullParameter(string, "");
            if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                length = StringsKt.trim((CharSequence) activityEditPhoneNumberBinding.edtPhoneNumber.getText().toString()).toString().length();
                if (4 <= length) {
                    int i3 = cancel;
                    i = i3 + 69;
                    cancelAll = i % 128;
                    if (i % 2 == 0 ? length >= 16 : length >= 77) {
                        String string2 = editPhoneNumberActivity.getString(R.string.error_format_phone_number);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                    } else {
                        int i4 = i3 + 37;
                        cancelAll = i4 % 128;
                        int i5 = i4 % 2;
                        String strINotificationSideChannel = editPhoneNumberActivity.INotificationSideChannel();
                        User user = (User) editPhoneNumberActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        Intrinsics.checkNotNull(user);
                        boolean zAreEqual = Intrinsics.areEqual(strINotificationSideChannel, String.valueOf(user.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        String str = null;
                        if (zAreEqual) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(editPhoneNumberActivity2, "Maaf, Anda masih mengisi nomor handphone lama Anda. Jika ingin melakukan perubahan, Silahkan mengisi nomor handphone yang Baru", null);
                            int i6 = cancelAll + 45;
                            cancel = i6 % 128;
                            int i7 = i6 % 2;
                        } else {
                            int i8 = cancel + 29;
                            cancelAll = i8 % 128;
                            int i9 = i8 % 2;
                            editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = editPhoneNumberActivity.INotificationSideChannel();
                            IntegerRes integerRes = (IntegerRes) editPhoneNumberActivity.b.getValue();
                            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                            String strValueOf = String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                            String str2 = editPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (str2 == null) {
                                int i10 = cancelAll + 3;
                                cancel = i10 % 128;
                                if (i10 % 2 != 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    str.hashCode();
                                    throw null;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            } else {
                                str = str2;
                            }
                            integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ChangeHandphoneVerificationRequest(strValueOf, str));
                        }
                    }
                } else {
                    String string3 = editPhoneNumberActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
                }
            } else {
                String string4 = editPhoneNumberActivity.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
            }
        } else {
            length = StringsKt.trim((CharSequence) activityEditPhoneNumberBinding.edtPhoneNumber.getText().toString()).toString().length();
            if (4 <= length) {
                int i11 = cancel;
                i = i11 + 69;
                cancelAll = i % 128;
                if (i % 2 == 0) {
                    String string5 = editPhoneNumberActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
                } else {
                    String string6 = editPhoneNumberActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string6, 0).show();
                }
            } else {
                String string7 = editPhoneNumberActivity.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string7, 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final EditPhoneNumberActivity editPhoneNumberActivity, final ActivityEditPhoneNumberBinding activityEditPhoneNumberBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion companion = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(editPhoneNumberActivity.asInterface, new Function1() { // from class: DoNotInline
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditPhoneNumberActivity.b(this.b, activityEditPhoneNumberBinding, (CodeNamePair) obj);
                }
            });
            FragmentManager supportFragmentManager = editPhoneNumberActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = cancelAll + 25;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = cancelAll + 9;
                cancel = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(EditPhoneNumberActivity editPhoneNumberActivity, ActivityEditPhoneNumberBinding activityEditPhoneNumberBinding, CodeNamePair codeNamePair) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -443654488, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 443654489, new Object[]{editPhoneNumberActivity, activityEditPhoneNumberBinding, codeNamePair}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        notify = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 45;
        notify = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 21;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_edit_phone_number;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 593025162, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -593025162, new Object[]{this}, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentbindingInflater1 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step3).substring(25, 26).codePointAt(0) + 1856931286;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater1, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), -46153487, iCodePointAt, 46153489, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentbindingInflater2, (-1246813537) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).codePointAt(0), -52758507, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 52758510, new Object[]{this, bundle}, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 7;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = cancel + 1;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        g = -6377398940819159759L;
        d = -981105359;
        asInterface = 'L';
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, short r6, int r7) {
        /*
            byte[] r0 = com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.$$c
            int r5 = r5 + 102
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditPhoneNumberActivity.$$i(short, short, int):java.lang.String");
    }
}
