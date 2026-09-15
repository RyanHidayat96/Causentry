package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.PhoneVerificationRequestAuth;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.ActivityPhoneActivationVerificationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity;
import com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.dynamic.zag;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.libraries.places.internal.zzbpk;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityChooserViewCallbacks;
import defpackage.CameraManagerCompatBaseImplCameraManagerCompatParamsApi21;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getItemView;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setSplitTrack;
import defpackage.unregisterLifecycle;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0019\u0010%"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewPhoneVerificationResetActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityPhoneActivationVerificationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "onBackPressed", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "", "INotificationSideChannel", "()Ljava/lang/String;", "LUseTorchAsFlash;", "p0", "onClosePageEvent", "(LUseTorchAsFlash;)V", "onDestroy", "LsetSplitTrack;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewPhoneVerificationResetActivity extends BindingReactiveFormActivity<ActivityPhoneActivationVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long asInterface;
    private static char d;
    private static int g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CodeNamePair b;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 73;
    private static int cancel = 0;
    private static int asBinder = 0;
    private static int INotificationSideChannel = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new ActivityChooserViewCallbacks(this));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: tryOnMeasure
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int d = R.layout.activity_phone_activation_verification;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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
        java.lang.IllegalArgumentException: Illegal Capacity: -1927096867
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object b(int r7, int r8, int r9, java.lang.Object[] r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.b(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 145 - r7
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.$$a
            int r1 = r6 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewPhoneVerificationResetActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {14, 116, 92, -78};
        private static final int $$f = 238;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {6, 51, 46, 31, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        private static final int $$e = 5;
        private static final byte[] $$a = {17, 104, 102, -28, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
        private static final int $$b = 208;
        private static int b = 0;
        private static int g = 1;
        private static int TuitionPaymentFragmentbindingInflater1 = -83722277;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24766;

        private static void d(short s, short s2, short s3, Object[] objArr) {
            byte[] bArr = $$a;
            int i = 115 - (s3 * 3);
            int i2 = s2 + 4;
            byte[] bArr2 = new byte[s + 4];
            int i3 = s + 3;
            int i4 = -1;
            if (bArr == null) {
                i4 = -1;
                i = (i3 + i2) - 2;
                i2++;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i;
                if (i5 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i6 = i;
                int i7 = i2 + 1;
                i4 = i5;
                i = (i6 + bArr[i2]) - 2;
                i2 = i7;
            }
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
        private static void e(int r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 52
                int r0 = r5 + 1
                int r7 = 103 - r7
                byte[] r1 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.Companion.$$d
                int r6 = r6 * 52
                int r6 = 56 - r6
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r7
                r3 = r2
                r7 = r5
                goto L27
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L23:
                int r3 = r3 + 1
                r4 = r1[r6]
            L27:
                int r7 = r7 + r4
                int r6 = r6 + 1
                int r7 = r7 + (-10)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.Companion.e(int, short, short, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegisteredMemberRegistration p1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewPhoneVerificationResetActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivity(intent);
            int i2 = b + 119;
            g = i2 % 128;
            int i3 = i2 % 2;
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegistrationForUnregistered p1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewPhoneVerificationResetActivity.class);
            intent.putExtra("unregistered_data", p1);
            p0.startActivity(intent);
            int i2 = g + 45;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
            }
        }

        private static void c(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i3 = $10 + 81;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 8329), 1234 - ImageFormat.getBitsPerPixel(0), 35 - View.resolveSize(0, 0), -653973969, false, $$g(b2, (byte) (b2 | 18), b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 2764, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, 1504416861, false, $$g(b3, (byte) (b3 | 16), b3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43324), 253 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2890, Color.alpha(0) + 17, 2012627446, false, $$g(b4, (byte) (b4 | 17), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i5 = $10 + 93;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
        }

        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i5 = $10 + 117;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 3291, 30 - ExpandableListView.getPackedPositionChild(0L), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 44 - View.MeasureSpec.getSize(0), -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i3 > 0) {
                int i8 = $11 + 53;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (!(!z)) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myPid() >> 22), 651 - (ViewConfiguration.getScrollBarSize() >> 8), 44 - TextUtils.indexOf("", ""), -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                int i10 = $10 + 103;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0e4a A[Catch: IOException -> 0x0f71, all -> 0x1029, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x0e8d A[Catch: IOException -> 0x0f71, all -> 0x1029, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x0ebf A[Catch: IOException -> 0x0f71, all -> 0x1029, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Code duplicated, block: B:110:0x0eff A[Catch: IOException -> 0x0f71, all -> 0x1029, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Code duplicated, block: B:112:0x0f40 A[Catch: IOException -> 0x0f71, all -> 0x1029, TRY_LEAVE, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Code duplicated, block: B:116:0x0f5d  */
        /* JADX WARN: Code duplicated, block: B:117:0x0f60  */
        /* JADX WARN: Code duplicated, block: B:181:0x1038  */
        /* JADX WARN: Code duplicated, block: B:214:0x157a A[EDGE_INSN: B:214:0x157a->B:215:0x157d BREAK  A[LOOP:5: B:194:0x12b0->B:213:0x1572], PHI: r2
  0x157a: PHI (r2v176 java.lang.String[]) = (r2v174 java.lang.String[]), (r2v174 java.lang.String[]), (r2v180 java.lang.String[]) binds: [B:190:0x11c2, B:192:0x12aa, B:319:0x157a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x04c9  */
        /* JADX WARN: Code duplicated, block: B:27:0x04cc  */
        /* JADX WARN: Code duplicated, block: B:309:0x0635 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x052b A[Catch: all -> 0x1d1d, TryCatch #28 {all -> 0x1d1d, blocks: (B:13:0x02f1, B:15:0x0308, B:17:0x0366, B:28:0x0514, B:30:0x052b, B:32:0x0585, B:204:0x1459, B:206:0x1471, B:208:0x14c2, B:229:0x162c, B:231:0x1639, B:232:0x1676, B:234:0x1780, B:236:0x178d, B:237:0x17cd, B:239:0x18ca, B:241:0x18d7, B:242:0x191b, B:244:0x1a5c, B:246:0x1a69, B:247:0x1aab, B:249:0x1b9d, B:251:0x1baa, B:252:0x1bf2), top: B:303:0x02f1 }] */
        /* JADX WARN: Code duplicated, block: B:310:0x0650 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:315:0x0f71 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:316:0x0f4a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x057f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0637 A[LOOP:1: B:26:0x04ca->B:36:0x0637, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x0650 A[EDGE_INSN: B:37:0x0650->B:38:0x065c BREAK  A[LOOP:1: B:26:0x04ca->B:36:0x0637], PHI: r1 r2 r3 r5 r7 r13
  0x0650: PHI (r1v104 int) = (r1v103 int), (r1v175 int) binds: [B:24:0x04c7, B:310:0x0650] A[DONT_GENERATE, DONT_INLINE]
  0x0650: PHI (r2v214 int) = (r2v0 int), (r2v335 int) binds: [B:24:0x04c7, B:310:0x0650] A[DONT_GENERATE, DONT_INLINE]
  0x0650: PHI (r3v114 int) = (r3v113 int), (r3v168 int) binds: [B:24:0x04c7, B:310:0x0650] A[DONT_GENERATE, DONT_INLINE]
  0x0650: PHI (r5v70 byte) = (r5v67 byte), (r5v73 byte) binds: [B:24:0x04c7, B:310:0x0650] A[DONT_GENERATE, DONT_INLINE]
  0x0650: PHI (r7v117 java.lang.Object) = (r7v116 java.lang.Object), (r7v257 java.lang.Object) binds: [B:24:0x04c7, B:310:0x0650] A[DONT_GENERATE, DONT_INLINE]
  0x0650: PHI (r13v87 byte) = (r13v30 byte), (r13v203 byte) binds: [B:24:0x04c7, B:310:0x0650] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x070b  */
        /* JADX WARN: Code duplicated, block: B:42:0x0812  */
        /* JADX WARN: Code duplicated, block: B:44:0x082c  */
        /* JADX WARN: Code duplicated, block: B:51:0x0916 A[Catch: all -> 0x0fcf, TryCatch #24 {all -> 0x0fcf, blocks: (B:49:0x0909, B:51:0x0916, B:52:0x094e), top: B:299:0x0909 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0965 A[Catch: all -> 0x0fc2, TryCatch #18 {all -> 0x0fc2, blocks: (B:54:0x0958, B:56:0x0965, B:57:0x099a), top: B:291:0x0958 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0d17 A[Catch: IOException -> 0x0f71, Exception -> 0x0f9f, all -> 0x1029, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x0d66 A[Catch: IOException -> 0x0f71, Exception -> 0x0f9f, all -> 0x1029, TryCatch #2 {IOException -> 0x0f71, blocks: (B:66:0x0a34, B:93:0x0d06, B:94:0x0d09, B:96:0x0d17, B:97:0x0d50, B:99:0x0d66, B:100:0x0da0, B:102:0x0db2, B:104:0x0e4a, B:106:0x0e8d, B:108:0x0ebf, B:110:0x0eff, B:112:0x0f40), top: B:269:0x0a34 }] */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            String[] strArr;
            Object obj;
            byte b2;
            int i6;
            byte b3;
            int i7;
            int i8;
            int i9;
            int length;
            Object obj2;
            int i10;
            int i11;
            Object obj3;
            String str;
            int i12;
            int i13;
            byte b4;
            Object obj4;
            byte b5;
            int i14;
            int i15;
            byte b6;
            byte b7;
            Object obj5;
            String[] strArrSplit;
            int length2;
            int i16;
            String str2;
            Object[] objArr;
            int i17;
            int i18;
            int i19;
            byte b8;
            Process processExec;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i20;
            String str3;
            Throwable th;
            long nanos;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String[] strArrSplit2;
            int length3;
            int i21;
            String str4;
            Object[] objArr2;
            String str5;
            Object[] objArr3;
            Object[] objArr4;
            String[] strArrSplit3;
            int i22;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i23;
            int i24;
            int i25;
            int i26 = i;
            int i27 = 1;
            if (context != null) {
                try {
                    int i28 = -Color.green(0);
                    int i29 = i28 * (-589);
                    int i30 = ((i29 | 169026) << 1) - (i29 ^ 169026);
                    int i31 = ~i26;
                    int i32 = ((-287) ^ i31) | ((-287) & i31);
                    int i33 = ~i32;
                    int i34 = ~(((-287) ^ i28) | ((-287) & i28));
                    int i35 = (i34 & i33) | (i33 ^ i34);
                    int i36 = ~i26;
                    int i37 = ~(i36 | i28);
                    int i38 = (i35 ^ i37) | (i35 & i37);
                    int i39 = ~i28;
                    int i40 = (i39 ^ 286) | (i39 & 286);
                    int i41 = ~((i40 & i26) | (i40 ^ i26));
                    int i42 = ((i41 & i38) | (i38 ^ i41)) * 590;
                    int i43 = (i30 ^ i42) + ((i30 & i42) << 1);
                    int i44 = ~i32;
                    int i45 = ~((-287) | i28);
                    int i46 = (i43 - (~(-(-(((~((i28 & i31) | (i31 ^ i28))) | ((i44 ^ i45) | (i44 & i45))) * (-1180)))))) - 1;
                    int i47 = ((~((i39 ^ i31) | (i39 & i31))) | (~((i36 ^ 286) | (i36 & 286)))) * 590;
                    int i48 = (i46 & i47) + (i47 | i46);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                    int i49 = longPressTimeout * 483;
                    int i50 = ((i49 | 1936) << 1) - (i49 ^ 1936);
                    int i51 = ~longPressTimeout;
                    int i52 = ~(i51 | (-9));
                    int i53 = ~(i51 | i31);
                    int i54 = -(-(((i52 ^ i53) | (i52 & i53)) * (-241)));
                    int i55 = ((i50 | i54) << 1) - (i50 ^ i54);
                    int i56 = -(-(((longPressTimeout ^ 8) | (longPressTimeout & 8)) * (-482)));
                    int i57 = (i55 & i56) + (i56 | i55);
                    int i58 = ~((longPressTimeout & (-9)) | ((-9) ^ longPressTimeout));
                    int i59 = (i51 & i36) | (i51 ^ i36);
                    int i60 = ~((i59 & 8) | (i59 ^ 8));
                    int i61 = i58 ^ i60;
                    Object[] objArr5 = new Object[1];
                    a(true, i48, iIndexOf, i57 + (((i58 & i60) | i61) * 241), new char[]{65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534}, objArr5);
                    Class<?> cls = Class.forName((String) objArr5[0]);
                    int size = View.MeasureSpec.getSize(0);
                    int i62 = i36 | size;
                    int i63 = (size * (-51)) + 3267556 + ((~((i62 ^ 61652) | (i62 & 61652))) * 52);
                    int i64 = (~((-61653) | i31)) | (~(((-61653) ^ size) | ((-61653) & size)));
                    int i65 = ~((i36 ^ size) | (i36 & size));
                    int i66 = (i63 - (~(((i64 ^ i65) | (i64 & i65)) * (-52)))) - 1;
                    int i67 = ~size;
                    int i68 = ~(i67 | i36);
                    int i69 = ~((i67 & 61652) | (i67 ^ 61652));
                    int i70 = i68 ^ i69;
                    Object[] objArr6 = new Object[1];
                    c(new char[]{27582, 21948, 36365, 9973, 46293, 33541, 32416, 58624, 7845, 50976, 57498, 53278, 41859, 4529}, new char[]{0, 0, 0, 0}, (char) ((i66 - (~(((i69 & i68) | i70) * 52))) - 1), new char[]{531, 37383, 54350, 55792}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr6);
                    String str6 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                    int i71 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                    int i72 = ((i71 | 286) << 1) - (i71 ^ 286);
                    int i73 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i74 = ((i73 | 24) << 1) - (i73 ^ 24);
                    int i75 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr7 = new Object[1];
                    a(true, i72, i74, (i75 & 8) + (i75 | 8), new char[]{65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534}, objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    int i76 = -MotionEvent.axisFromString("");
                    int i77 = ~i76;
                    int i78 = ((((i76 * (-159)) + 159) - (~(-(-(((i77 ^ (-1)) | i77) * 160))))) - 1) + ((~((i36 ^ i76) | (i36 & i76))) * (-160));
                    int i79 = ~i36;
                    int i80 = ((i76 ^ i79) | (i76 & i79)) * 160;
                    int i81 = (i78 & i80) + (i78 | i80);
                    Object[] objArr8 = new Object[1];
                    c(new char[]{18761, 22053, 27221, 25674, 58632, 26641, 43845, 29214, 10980, 11964, 434, 64246, 7867, 9971, 34338, 45646, 45704, 51507}, new char[]{0, 0, 0, 0}, (char) (Color.alpha(0) + 63883), new char[]{63254, 50651, 35703, 60409}, i81, objArr8);
                    Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                    byte b9 = (byte) 30;
                    byte[] bArr = $$a;
                    Object[] objArr9 = new Object[1];
                    d(b9, bArr[28], (byte) (-bArr[35]), objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    byte b10 = (byte) 33;
                    Object[] objArr10 = new Object[1];
                    d(bArr[58], b10, bArr[57], objArr10);
                    int iIndexOf2 = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str6);
                    if (iIndexOf2 > 0) {
                        Object[] objArr11 = new Object[1];
                        d(b9, bArr[28], (byte) (-bArr[35]), objArr11);
                        Class<?> cls4 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        d(bArr[58], b10, bArr[57], objArr12);
                        String str7 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                        int length4 = str7.length();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i82 = length4 * 367;
                        int i83 = ((-5872) & i82) + ((-5872) | i82);
                        int i84 = ((-16) | length4) * (-366);
                        int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                        int i86 = ~length4;
                        int i87 = ~((i86 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i86 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i88 = (i85 - (~(-(-((((-16) ^ i87) | (i87 & (-16))) * (-366)))))) - 1;
                        int i89 = ~(15 | length4);
                        int i90 = (~length4) | (-16);
                        int i91 = ~((i90 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i90 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i92 = -(-(((i91 & i89) | (i89 ^ i91)) * 366));
                        int i93 = (i88 ^ i92) + ((i88 & i92) << 1);
                        if (i93 >= 0) {
                            int i94 = 0;
                            while (true) {
                                if (i94 > i93) {
                                    iIndexOf2 = iIndexOf2;
                                    obj2 = objInvoke;
                                    i6 = i31;
                                    i10 = 0;
                                    break;
                                }
                                String strSubstring = str7.substring(i94, ((i94 | 16) << i27) - (i94 ^ 16));
                                try {
                                    Object[] objArr13 = new Object[2];
                                    objArr13[i27] = 931995;
                                    objArr13[0] = strSubstring;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                        int maximumFlingVelocity = 3393 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 9;
                                        int i95 = $$e;
                                        Object[] objArr14 = new Object[1];
                                        e((byte) (i95 - 5), $$d[37], (byte) i95, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, maximumFlingVelocity, iIndexOf3, 1203525406, false, (String) objArr14[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                    long j = 13173894;
                                    long j2 = -743;
                                    long j3 = j | jLongValue;
                                    obj2 = objInvoke;
                                    long j4 = -1;
                                    i6 = i31;
                                    int i96 = i94;
                                    long j5 = i26;
                                    long j6 = (j2 * j) + (j2 * jLongValue) + (((long) (-744)) * ((j3 ^ j4) | ((j | j5) ^ j4) | ((jLongValue | j5) ^ j4)));
                                    long j7 = 744;
                                    long j8 = j6 + (((j5 ^ j4) | (j4 ^ ((jLongValue ^ j4) | (j ^ j4)))) * j7) + (j7 * (j3 | j5)) + ((long) (-15243771));
                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int i97 = ~iElapsedRealtime;
                                    int i98 = ((int) (j8 >> 32)) & ((-1112848682) + (((~(374374693 | i97)) | (~((-1811601105) | iElapsedRealtime))) * 210) + (((~(iElapsedRealtime | 2147145717)) | (~(i97 | (-38830081)))) * 210));
                                    int i99 = ((int) j8) & (458191745 + (((~(1004070529 | i36)) | 1853670356) * (-328)) + ((1853670356 | i26) * 164) + (((~((-1004070530) | i26)) | 710460032 | (~(2147280853 | i36))) * 164));
                                    if (((i99 & i98) | (i98 ^ i99)) == -725904754) {
                                        i10 = 1;
                                        break;
                                    }
                                    i94 = ((i96 | 1) << 1) - (i96 ^ 1);
                                    i31 = i6;
                                    str7 = str7;
                                    objInvoke = obj2;
                                    i93 = i93;
                                    iIndexOf2 = iIndexOf2;
                                    i27 = 1;
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            }
                            int i100 = -i10;
                            int i101 = ((i10 & i100) | (i10 ^ i100)) >> 31;
                            i11 = (i101 & ((i26 & (-21)) | (i36 & 20))) | ((~i101) & i26);
                            byte[] bArr2 = $$a;
                            Object[] objArr15 = new Object[1];
                            d(b9, bArr2[28], (byte) (-bArr2[35]), objArr15);
                            Class<?> cls5 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            d(bArr2[58], b10, bArr2[57], objArr16);
                            obj3 = obj2;
                            str = (String) cls5.getField((String) objArr16[0]).get(obj3);
                            int length5 = str.length();
                            int i102 = (-3019) - (~(-(-(length5 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))));
                            int i103 = ((-6) | length5) * (-502);
                            int i104 = (i102 ^ i103) + ((i102 & i103) << 1);
                            int i105 = ~length5;
                            int i106 = ~((i105 & 5) | (5 ^ i105));
                            int i107 = ~((5 ^ i36) | (5 & i36));
                            int i108 = ((-6) & length5) | ((-6) ^ length5);
                            int i109 = (i108 & i26) | (i108 ^ i26);
                            int i110 = i104 + (((i106 & i107) | (i106 ^ i107) | (~i109)) * (-502));
                            int i111 = (5 ^ i6) | (5 & i6);
                            int i112 = ~((length5 & i111) | (i111 ^ length5));
                            int i113 = ~i109;
                            i12 = i110 + (((i112 & i113) | (i112 ^ i113)) * TypedValues.PositionType.TYPE_DRAWPATH);
                            if (i12 >= 0) {
                                i6 = i6;
                                i13 = i11;
                                b4 = b9;
                                obj4 = obj3;
                                b5 = b10;
                                i4 = i26;
                                i14 = 0;
                                break;
                            }
                            i22 = 0;
                            while (true) {
                                if (i22 <= i12) {
                                    i6 = i6;
                                    i13 = i11;
                                    b4 = b9;
                                    obj4 = obj3;
                                    b5 = b10;
                                    i4 = i26;
                                    i14 = 0;
                                    break;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i114 = -(-(i22 * 471));
                                int i115 = (1416 ^ i114) + ((i114 & 1416) << 1);
                                int i116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i117 = ~((i116 & (-7)) | ((-7) ^ i116));
                                int i118 = -(-(((i117 & i22) | (i22 ^ i117)) * (-235)));
                                int i119 = (i115 & i118) + (i118 | i115) + (((~(((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | i22) * (-470));
                                int i120 = ~((~i22) | 6);
                                int i121 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | ((-7) & i22) | ((-7) ^ i22));
                                int i122 = ((i121 & i120) | (i120 ^ i121)) * 235;
                                Object[] objArr17 = {str.substring(i22, ((i119 | i122) << 1) - (i122 ^ i119)), 931995};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                    int i123 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                    int iBlue = 9 - Color.blue(0);
                                    int i124 = $$e;
                                    Object[] objArr18 = new Object[1];
                                    e((byte) (i124 - 5), $$d[37], (byte) i124, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, i123, iBlue, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                long j9 = 2023654615;
                                b4 = b9;
                                long j10 = 886;
                                obj4 = obj3;
                                i23 = i22;
                                long j11 = -1;
                                long j12 = jLongValue2 ^ j11;
                                long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                long j13 = (((j9 ^ j11) | j12) ^ j11) | ((j12 | jElapsedRealtime) ^ j11);
                                long j14 = jElapsedRealtime ^ j11;
                                long j15 = j14 | j9;
                                long j16 = (((long) 1773) * j9) + (((long) (-885)) * jLongValue2) + ((j13 | ((j15 | jLongValue2) ^ j11)) * j10);
                                b5 = b10;
                                i13 = i11;
                                long j17 = j16 + (((long) (-1772)) * (((j14 | jLongValue2) ^ j11) | j9)) + (j10 * (j15 ^ j11)) + ((long) (-2025724492));
                                int i125 = 1409112738 + (((~((-1458705446) | i36)) | 76546048) * (-1188));
                                i4 = i;
                                int i126 = 76546048 | (~(1458705445 | i4));
                                int i127 = ~((-1399035440) | i36);
                                i24 = ((int) (j17 >> 32)) & (i125 + ((i126 | i127) * 594) + (((~(1458705445 | i36)) | 16876042 | i127) * 594));
                                i25 = ((int) j17) & ((((~((-4202561) | i4)) * 521) - 633751428) + (((~((-4202561) | i36)) | 84935953) * 521));
                                if (((i24 & i25) | (i24 ^ i25)) == -2096167706) {
                                    i14 = 1;
                                    break;
                                }
                                i22 = (i23 ^ 1) + ((i23 & 1) << 1);
                                i26 = i4;
                                i12 = i12;
                                b9 = b4;
                                b10 = b5;
                                i11 = i13;
                                obj3 = obj4;
                                str = str;
                                i6 = i6;
                            }
                            i15 = i4 ^ 20;
                            int i128 = -i14;
                            int i129 = ((i14 & i128) | (i14 ^ i128)) >> 31;
                            int i130 = (~i129) & i4;
                            int i131 = i129 & i15;
                            int i132 = (i131 & i130) | (i130 ^ i131);
                            int i133 = i13;
                            int i134 = ((~i133) & i4) | (i133 & i36);
                            int i135 = -i134;
                            int i136 = ((i134 & i135) | (i134 ^ i135)) >> 31;
                            int i137 = i132 & (~i136);
                            int i138 = i133 & i136;
                            i8 = (i137 & i138) | (i137 ^ i138);
                            byte[] bArr3 = $$a;
                            Object[] objArr19 = new Object[1];
                            b6 = b4;
                            d(b6, bArr3[28], (byte) (-bArr3[35]), objArr19);
                            Class<?> cls6 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            b7 = b5;
                            d(bArr3[58], b7, bArr3[57], objArr20);
                            obj5 = obj4;
                            String str8 = (String) cls6.getField((String) objArr20[0]).get(obj5);
                            int i139 = iIndexOf2 ^ (-1);
                            int i140 = -i139;
                            String strSubstring2 = str8.substring(0, iIndexOf2 & (((i139 & i140) | (i139 ^ i140)) >> 31));
                            int i141 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr21 = new Object[1];
                            a(true, ((i141 | 233) << 1) - (i141 ^ 233), View.combineMeasuredStates(0, 0) + 1, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{0}, objArr21);
                            strArrSplit = strSubstring2.split((String) objArr21[0]);
                            length2 = strArrSplit.length;
                            i16 = 0;
                            while (i16 < length2) {
                                str2 = strArrSplit[i16];
                                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                int i142 = tapTimeout * 755;
                                int i143 = (i142 ^ (-34972332)) + ((i142 & (-34972332)) << 1);
                                int i144 = ~tapTimeout;
                                String[] strArr2 = strArrSplit;
                                int i145 = length2;
                                int i146 = -(-(((~((i144 ^ 46444) | (i144 & 46444))) | (~((i144 ^ i4) | (i144 & i4))) | (~(i4 | 46444))) * (-754)));
                                int i147 = (i143 & i146) + (i143 | i146);
                                int i148 = ~tapTimeout;
                                int i149 = (i148 ^ 46444) | (i148 & 46444);
                                int i150 = -(-(((~((i149 ^ i4) | (i149 & i4))) | (~((i36 ^ tapTimeout) | (tapTimeout & i36) | 46444))) * (-754)));
                                int i151 = (i147 ^ i150) + ((i150 & i147) << 1);
                                int i152 = -(-(((i144 ^ i36) | (i144 & i36)) * 754));
                                int i153 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i154 = i153 * 303;
                                int i155 = (i154 ^ 216941326) + ((i154 & 216941326) << 1);
                                int i156 = ~i153;
                                int i157 = (i156 ^ i6) | (i156 & i6);
                                Object obj6 = obj5;
                                int i158 = ~((i157 ^ (-1798614022)) | (i157 & (-1798614022)));
                                int i159 = (i153 ^ (-1798614022)) | (i153 & (-1798614022));
                                byte b11 = b7;
                                int i160 = ~((i159 ^ i4) | (i159 & i4));
                                int i161 = -(-(((i158 ^ i160) | (i158 & i160)) * (-302)));
                                int i162 = ((i155 | i161) << 1) - (i155 ^ i161);
                                int i163 = (~((i156 ^ (-1798614022)) | (i156 & (-1798614022)) | i4)) * (-604);
                                objArr = new Object[1];
                                c(new char[]{39050, 35246, 52533}, new char[]{0, 0, 0, 0}, (char) ((i151 ^ i152) + ((i152 & i151) << 1)), new char[]{64063, 52051, 27796, 31157}, (((i162 ^ i163) + ((i163 & i162) << 1)) - (~(-(-(((~(1798614021 | i153)) | (~((i4 ^ (-1798614022)) | (i4 & (-1798614022))))) * 302))))) - 1, objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 2267, 33 - KeyEvent.keyCodeFromString("")))) {
                                        try {
                                            char[] cArr = {21472, 50900, 8945, 32138, 17224, 11236, 64722, 52588, 38836, 4138, 57540, 38685, 27437, 56378, 23196, 574};
                                            char[] cArr2 = {0, 0, 0, 0};
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i164 = iLastIndexOf * 253;
                                            int i165 = (i164 ^ 1873212) + ((i164 & 1873212) << 1);
                                            int i166 = ~iLastIndexOf;
                                            b8 = b6;
                                            int i167 = ~((i166 & (-7405)) | (i166 ^ (-7405)));
                                            int i168 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i169 = ~(((-7405) ^ i168) | ((-7405) & i168));
                                            i18 = i167 ^ i169;
                                            int i170 = i18 | (i169 & i167);
                                            i19 = i16;
                                            int i171 = ~((iLastIndexOf & 7404) | (iLastIndexOf ^ 7404) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            int i172 = -(-(((i170 & i171) | (i170 ^ i171)) * (-252)));
                                            i17 = 1;
                                            int i173 = ((i165 | i172) << 1) - (i172 ^ i165);
                                            int i174 = -(-((iLastIndexOf | 7404) * (-252)));
                                            int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                                            int i176 = ((-7405) & i168) | ((-7405) ^ i168);
                                            int i177 = ~((iLastIndexOf & i176) | (i176 ^ iLastIndexOf));
                                            int i178 = -(-(((i177 & i171) | (i177 ^ i171)) * 252));
                                            try {
                                                try {
                                                    Object[] objArr22 = new Object[1];
                                                    c(cArr, cArr2, (char) ((i175 & i178) + (i178 | i175)), new char[]{44479, 40787, 60328, 58396}, Color.green(0), objArr22);
                                                    String str9 = (String) objArr22[0];
                                                    try {
                                                        try {
                                                            Runtime runtime = Runtime.getRuntime();
                                                            Object[] objArr23 = new Object[1];
                                                            c(new char[]{63583, 13291}, new char[]{0, 0, 0, 0}, (char) (Color.alpha(0) + 54984), new char[]{16104, 57590, 51447, 43990}, 0 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr23);
                                                            processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                            try {
                                                                Object[] objArr24 = {processExec.getInputStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0) + 2143, 46 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1020714777, false, null, new Class[]{InputStream.class});
                                                                }
                                                                Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                                try {
                                                                    Object[] objArr25 = {processExec.getErrorStream()};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 2141 - TextUtils.lastIndexOf("", '0'), 46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1020714777, false, null, new Class[]{InputStream.class});
                                                                    }
                                                                    Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                    DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                    try {
                                                                        byte[] bArr4 = $$a;
                                                                        i18 = i15;
                                                                        try {
                                                                            i20 = i8;
                                                                            try {
                                                                                Object[] objArr26 = new Object[1];
                                                                                d(bArr4[54], bArr4[34], bArr4[58], objArr26);
                                                                                Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                                str3 = str2;
                                                                                Object[] objArr27 = new Object[1];
                                                                                d(bArr4[13], (byte) (bArr4[11] - 1), bArr4[28], objArr27);
                                                                                cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                try {
                                                                                    Object[] objArr28 = new Object[1];
                                                                                    d(bArr4[54], bArr4[34], bArr4[58], objArr28);
                                                                                    Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                    Object[] objArr29 = new Object[1];
                                                                                    d(bArr4[13], (byte) (bArr4[11] - 1), bArr4[28], objArr29);
                                                                                    cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                sb.append(str9);
                                                                                                int i179 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                                                                int i180 = ((i179 | 839698124) << 1) - (i179 ^ 839698124);
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                c(new char[]{7932}, new char[]{0, 0, 0, 0}, (char) (5697 - (~(-(-(ViewConfiguration.getLongPressTimeout() >> 16))))), new char[]{52473, 3270, 16946, 46358}, i180, objArr30);
                                                                                                sb.append((String) objArr30[0]);
                                                                                                String string = sb.toString();
                                                                                                int i181 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 252;
                                                                                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                                                                int i182 = iNormalizeMetaState * 980;
                                                                                                int i183 = (((i182 & (-4890)) + (i182 | (-4890))) - (~(-(-((~(((-6) & i36) | ((-6) ^ i36))) * 979))))) - 1;
                                                                                                int i184 = ((iNormalizeMetaState ^ i4) | (iNormalizeMetaState & i4)) * (-979);
                                                                                                int i185 = (i183 ^ i184) + ((i183 & i184) << 1);
                                                                                                int i186 = ~((-6) | i4);
                                                                                                int i187 = ~(iNormalizeMetaState | i36);
                                                                                                int i188 = -(-(((i186 & i187) | (i186 ^ i187)) * 979));
                                                                                                Object[] objArr31 = new Object[1];
                                                                                                a(false, i181, (i185 & i188) + (i188 | i185), 3 - TextUtils.indexOf("", "", 0, 0), new char[]{2, 65513, 65524, 17, 16}, objArr31);
                                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                dataOutputStream.flush();
                                                                                                int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                                                                int i189 = (maximumFlingVelocity2 ^ (-637701900)) + ((maximumFlingVelocity2 & (-637701900)) << 1);
                                                                                                Object[] objArr32 = new Object[1];
                                                                                                c(new char[]{7863, 59015, '\n', 34336, 25782}, new char[]{0, 0, 0, 0}, (char) (View.resolveSizeAndState(0, 0, 0) + 38486), new char[]{62555, 64880, 22233, 2454}, i189, objArr32);
                                                                                                String str10 = (String) objArr32[0];
                                                                                                int i190 = 252 - (~View.getDefaultSize(0, 0));
                                                                                                int iIndexOf4 = 5 - TextUtils.indexOf("", "");
                                                                                                int i191 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                                int i192 = i191 * (-575);
                                                                                                int i193 = (i192 & (-1725)) + (i192 | (-1725));
                                                                                                int i194 = ~i191;
                                                                                                int i195 = ~((i194 & (-4)) | (i194 ^ (-4)));
                                                                                                int i196 = ~(((-4) ^ i4) | ((-4) & i4));
                                                                                                int i197 = -(-(((i195 & i196) | (i195 ^ i196)) * 576));
                                                                                                int i198 = ((i193 | i197) << 1) - (i197 ^ i193);
                                                                                                int i199 = ~i191;
                                                                                                int i200 = ~(i199 | 3);
                                                                                                int i201 = ((-4) & i36) | ((-4) ^ i36);
                                                                                                int i202 = ~((i191 & i201) | (i201 ^ i191));
                                                                                                int i203 = ((i202 & i200) | (i200 ^ i202)) * 576;
                                                                                                Object[] objArr33 = new Object[1];
                                                                                                a(false, i190, iIndexOf4, (((i198 & i203) + (i203 | i198)) - (~(-(-((~((i199 ^ (-4)) | (i199 & (-4)))) * 576))))) - 1, new char[]{2, 65513, 65524, 17, 16}, objArr33);
                                                                                                dataOutputStream.write(str10.getBytes((String) objArr33[0]));
                                                                                                dataOutputStream.flush();
                                                                                                try {
                                                                                                    long jNanoTime = System.nanoTime();
                                                                                                    nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                    do {
                                                                                                        try {
                                                                                                            try {
                                                                                                                processExec.exitValue();
                                                                                                                break;
                                                                                                            } catch (IllegalThreadStateException unused) {
                                                                                                                if (nanos > 0) {
                                                                                                                    try {
                                                                                                                        Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                        byte[] bArr5 = $$a;
                                                                                                                        Object[] objArr35 = new Object[1];
                                                                                                                        d(bArr5[54], bArr5[34], bArr5[58], objArr35);
                                                                                                                        Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                                        d(bArr5[13], (byte) 58, bArr5[28], objArr36);
                                                                                                                        cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                    } catch (Throwable th3) {
                                                                                                                        Throwable cause2 = th3.getCause();
                                                                                                                        if (cause2 != null) {
                                                                                                                            throw cause2;
                                                                                                                        }
                                                                                                                        throw th3;
                                                                                                                    }
                                                                                                                }
                                                                                                                nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                            }
                                                                                                        } catch (InterruptedException e2) {
                                                                                                            throw e2;
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            try {
                                                                                                                processExec.destroy();
                                                                                                                throw th;
                                                                                                            } catch (Exception unused2) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                    } while (nanos > 0);
                                                                                                    try {
                                                                                                        dataOutputStream.close();
                                                                                                    } catch (IOException unused3) {
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            byte[] bArr6 = $$a;
                                                                                                            Object[] objArr37 = new Object[1];
                                                                                                            d(bArr6[54], bArr6[34], bArr6[58], objArr37);
                                                                                                            Class<?> cls10 = Class.forName((String) objArr37[0]);
                                                                                                            byte b12 = bArr6[28];
                                                                                                            Object[] objArr38 = new Object[1];
                                                                                                            d(b12, (byte) (b12 | 62), bArr6[58], objArr38);
                                                                                                            cls10.getMethod((String) objArr38[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                            try {
                                                                                                                Object[] objArr39 = new Object[1];
                                                                                                                d(bArr6[54], bArr6[34], bArr6[58], objArr39);
                                                                                                                Class<?> cls11 = Class.forName((String) objArr39[0]);
                                                                                                                byte b13 = bArr6[28];
                                                                                                                Object[] objArr40 = new Object[1];
                                                                                                                d(b13, (byte) (b13 | 62), bArr6[58], objArr40);
                                                                                                                cls11.getMethod((String) objArr40[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                                try {
                                                                                                                    processExec.destroy();
                                                                                                                    while (true) {
                                                                                                                        if (i21 < length3) {
                                                                                                                            str4 = strArrSplit2[i21];
                                                                                                                            int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                                                                                            int i204 = -(-ExpandableListView.getPackedPositionChild(0L));
                                                                                                                            int i205 = -View.resolveSizeAndState(0, 0, 0);
                                                                                                                            objArr2 = new Object[1];
                                                                                                                            a(false, (touchSlop | 280) + (touchSlop & 280), ((i204 & 20) << 1) + (i204 ^ 20), (i205 | 18) + (i205 & 18), new char[]{2, 4, '\f', 2, '\b', 6, 65499, 4, 16, 14, 65487, '\b', 16, 16, '\b', '\r', 6, 65487, 17}, objArr2);
                                                                                                                            if (str4.startsWith((String) objArr2[0])) {
                                                                                                                                str5 = str3;
                                                                                                                            } else {
                                                                                                                                objArr3 = new Object[1];
                                                                                                                                c(new char[]{26342, 6668, 38027, 28226, 17719, 13850, 39649, 31548, 44968, 55924, 42966, 1689, 58898, 45593, 54742, 48687, 35595, 52174, 36694, 49198}, new char[]{0, 0, 0, 0}, (char) TextUtils.getOffsetBefore("", 0), new char[]{64857, 51832, 13969, 19610}, Drawable.resolveOpacity(0, 0), objArr3);
                                                                                                                                if (str4.startsWith((String) objArr3[0])) {
                                                                                                                                    str5 = str3;
                                                                                                                                } else {
                                                                                                                                    int i206 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                                                                                                    objArr4 = new Object[1];
                                                                                                                                    c(new char[]{60857, 4016, 46561, 16684, 158, 60518, 32223, 12055}, new char[]{0, 0, 0, 0}, (char) ((i206 ^ 1) + ((i206 & 1) << 1)), new char[]{4591, 31960, 28097, 7299}, (Process.getThreadPriority(0) + 20) >> 6, objArr4);
                                                                                                                                    if (str4.startsWith((String) objArr4[0])) {
                                                                                                                                        int i207 = -(-(Process.myTid() >> 22));
                                                                                                                                        int i208 = ((i207 | 243) << 1) - (i207 ^ 243);
                                                                                                                                        int i209 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                                                                                        Object[] objArr41 = new Object[1];
                                                                                                                                        a(false, i208, ((i209 | 1) << 1) - (i209 ^ 1), '1' - AndroidCharacter.getMirror('0'), new char[]{0}, objArr41);
                                                                                                                                        strArrSplit3 = str4.split((String) objArr41[0]);
                                                                                                                                        if (strArrSplit3.length > 1) {
                                                                                                                                            str5 = str3;
                                                                                                                                            if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                                                                                                int i210 = i20;
                                                                                                                                                int i211 = ((~i210) & i4) | (i210 & i36);
                                                                                                                                                int i212 = (i211 | (-i211)) >> 31;
                                                                                                                                                i8 = (i212 & i210) | (i18 & (~i212));
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            str5 = str3;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        str5 = str3;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i21 = ((i21 & 1) << 1) + (i21 ^ 1);
                                                                                                                            str3 = str5;
                                                                                                                            i20 = i20;
                                                                                                                        } else {
                                                                                                                            i17 = i20;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (Exception unused4) {
                                                                                                                }
                                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                                                                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 2142;
                                                                                                                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 45;
                                                                                                                    byte[] bArr7 = $$d;
                                                                                                                    byte b14 = bArr7[37];
                                                                                                                    Object[] objArr42 = new Object[1];
                                                                                                                    e(b14, b14, bArr7[15], objArr42);
                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, edgeSlop2, maxKeyCode, 399405187, false, (String) objArr42[0], null);
                                                                                                                }
                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                                                                                                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0') + 2143;
                                                                                                                    int trimmedLength2 = 45 - TextUtils.getTrimmedLength("");
                                                                                                                    byte[] bArr8 = $$d;
                                                                                                                    byte b15 = bArr8[37];
                                                                                                                    Object[] objArr43 = new Object[1];
                                                                                                                    e(b15, b15, bArr8[15], objArr43);
                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, iIndexOf5, trimmedLength2, 399405187, false, (String) objArr43[0], null);
                                                                                                                }
                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                String string2 = sb2.toString();
                                                                                                                int i213 = -TextUtils.lastIndexOf("", '0');
                                                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                                                int i214 = i213 * 399;
                                                                                                                int i215 = (i214 ^ 2273103) + ((i214 & 2273103) << 1);
                                                                                                                int i216 = ~i213;
                                                                                                                int i217 = ~((i216 & 5697) | (i216 ^ 5697));
                                                                                                                int i218 = ~(((-5698) ^ i213) | ((-5698) & i213));
                                                                                                                int i219 = (i217 & i218) | (i217 ^ i218);
                                                                                                                int i220 = ~(((-5698) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-5698) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                                                                int i221 = -(-(((i219 & i220) | (i219 ^ i220)) * 398));
                                                                                                                int i222 = ((((i215 | i221) << 1) - (i221 ^ i215)) - (~(-(-(((i213 ^ 5697) | (i213 & 5697)) * (-1194)))))) - 1;
                                                                                                                int i223 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                                                                int i224 = ~((i223 & (-5698)) | ((-5698) ^ i223));
                                                                                                                int i225 = ~((~i213) | 5697);
                                                                                                                int i226 = (i225 & i224) | (i224 ^ i225);
                                                                                                                int i227 = i226 ^ i218;
                                                                                                                int i228 = -(-View.resolveSize(0, 0));
                                                                                                                Object[] objArr44 = new Object[1];
                                                                                                                c(new char[]{7932}, new char[]{0, 0, 0, 0}, (char) (i222 + (((i226 & i218) | i227) * 398)), new char[]{52473, 3270, 16946, 46358}, (i228 & 839698124) + (i228 | 839698124), objArr44);
                                                                                                                strArrSplit2 = string2.split((String) objArr44[0]);
                                                                                                                length3 = strArrSplit2.length;
                                                                                                                i21 = 0;
                                                                                                            } catch (Throwable th5) {
                                                                                                                Throwable cause3 = th5.getCause();
                                                                                                                if (cause3 != null) {
                                                                                                                    throw cause3;
                                                                                                                }
                                                                                                                throw th5;
                                                                                                            }
                                                                                                        } catch (InterruptedException e3) {
                                                                                                            e = e3;
                                                                                                            throw e;
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
                                                                                                        Throwable cause4 = th6.getCause();
                                                                                                        if (cause4 != null) {
                                                                                                            throw cause4;
                                                                                                        }
                                                                                                        throw th6;
                                                                                                    }
                                                                                                } catch (InterruptedException e4) {
                                                                                                    e = e4;
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    th = th;
                                                                                                    processExec.destroy();
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (IOException unused5) {
                                                                                            }
                                                                                        } catch (Exception unused6) {
                                                                                            int i229 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                                            int i230 = (i229 & 276) + (i229 | 276);
                                                                                            int i231 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                            int i232 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                                            Object[] objArr45 = new Object[1];
                                                                                            a(true, i230, ((i231 & 28) << 1) + (i231 ^ 28), ((i232 | 22) << 1) - (i232 ^ 22), new char[]{20, 23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515, 65491, 24, 24, '\n', '\b'}, objArr45);
                                                                                            throw new IOException((String) objArr45[0]);
                                                                                        }
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                    }
                                                                                } catch (Throwable th9) {
                                                                                    Throwable cause5 = th9.getCause();
                                                                                    if (cause5 != null) {
                                                                                        throw cause5;
                                                                                    }
                                                                                    throw th9;
                                                                                }
                                                                            } catch (Throwable th10) {
                                                                                th = th10;
                                                                                Throwable th11 = th;
                                                                                Throwable cause6 = th11.getCause();
                                                                                if (cause6 != null) {
                                                                                    throw cause6;
                                                                                }
                                                                                throw th11;
                                                                            }
                                                                        } catch (Throwable th12) {
                                                                            th = th12;
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                    }
                                                                } catch (Throwable th14) {
                                                                    Throwable cause7 = th14.getCause();
                                                                    if (cause7 != null) {
                                                                        throw cause7;
                                                                    }
                                                                    throw th14;
                                                                }
                                                            } catch (Throwable th15) {
                                                                Throwable cause8 = th15.getCause();
                                                                if (cause8 != null) {
                                                                    throw cause8;
                                                                }
                                                                throw th15;
                                                            }
                                                        } catch (Exception unused7) {
                                                        }
                                                    } catch (Exception unused8) {
                                                    }
                                                } catch (IOException unused9) {
                                                }
                                            } catch (IOException unused10) {
                                                i17 = i8;
                                                i18 = i15;
                                            }
                                        } catch (IOException unused11) {
                                            i17 = i8;
                                            i18 = i15;
                                            i19 = i16;
                                            b8 = b6;
                                        }
                                    }
                                    i16 = (i19 ^ (-115)) + ((i19 & (-115)) << 1) + 116;
                                    b6 = b8;
                                    i15 = i18;
                                    strArrSplit = strArr2;
                                    length2 = i145;
                                    obj5 = obj6;
                                    b7 = b11;
                                } else {
                                    i17 = i8;
                                    i18 = i15;
                                    i19 = i16;
                                    b8 = b6;
                                }
                                i8 = i17;
                                i16 = (i19 ^ (-115)) + ((i19 & (-115)) << 1) + 116;
                                b6 = b8;
                                i15 = i18;
                                strArrSplit = strArr2;
                                length2 = i145;
                                obj5 = obj6;
                                b7 = b11;
                            }
                            obj = obj5;
                            b3 = b7;
                            b2 = b6;
                            i7 = 1;
                        } else {
                            iIndexOf2 = iIndexOf2;
                            obj2 = objInvoke;
                            i6 = i31;
                            i10 = 0;
                            int i1010 = -i10;
                            int i1011 = ((i10 & i1010) | (i10 ^ i1010)) >> 31;
                            i11 = (i1011 & ((i26 & (-21)) | (i36 & 20))) | ((~i1011) & i26);
                            byte[] bArr9 = $$a;
                            Object[] objArr110 = new Object[1];
                            d(b9, bArr9[28], (byte) (-bArr9[35]), objArr110);
                            Class<?> cls12 = Class.forName((String) objArr110[0]);
                            Object[] objArr111 = new Object[1];
                            d(bArr9[58], b10, bArr9[57], objArr111);
                            obj3 = obj2;
                            str = (String) cls12.getField((String) objArr111[0]).get(obj3);
                            int length6 = str.length();
                            int i1012 = (-3019) - (~(-(-(length6 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))));
                            int i1013 = ((-6) | length6) * (-502);
                            int i1014 = (i1012 ^ i1013) + ((i1012 & i1013) << 1);
                            int i1015 = ~length6;
                            int i1016 = ~((i1015 & 5) | (5 ^ i1015));
                            int i1017 = ~((5 ^ i36) | (5 & i36));
                            int i1018 = ((-6) & length6) | ((-6) ^ length6);
                            int i1019 = (i1018 & i26) | (i1018 ^ i26);
                            int i1110 = i1014 + (((i1016 & i1017) | (i1016 ^ i1017) | (~i1019)) * (-502));
                            int i1111 = (5 ^ i6) | (5 & i6);
                            int i1112 = ~((length6 & i1111) | (i1111 ^ length6));
                            int i1113 = ~i1019;
                            i12 = i1110 + (((i1112 & i1113) | (i1112 ^ i1113)) * TypedValues.PositionType.TYPE_DRAWPATH);
                            if (i12 >= 0) {
                                i6 = i6;
                                i13 = i11;
                                b4 = b9;
                                obj4 = obj3;
                                b5 = b10;
                                i4 = i26;
                                i14 = 0;
                                break;
                            }
                            i22 = 0;
                            while (true) {
                                if (i22 <= i12) {
                                    i6 = i6;
                                    i13 = i11;
                                    b4 = b9;
                                    obj4 = obj3;
                                    b5 = b10;
                                    i4 = i26;
                                    i14 = 0;
                                    break;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i1114 = -(-(i22 * 471));
                                int i1115 = (1416 ^ i1114) + ((i1114 & 1416) << 1);
                                int i1116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i1117 = ~((i1116 & (-7)) | ((-7) ^ i1116));
                                int i1118 = -(-(((i1117 & i22) | (i22 ^ i1117)) * (-235)));
                                int i1119 = (i1115 & i1118) + (i1118 | i1115) + (((~(((-7) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-7) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | i22) * (-470));
                                int i1210 = ~((~i22) | 6);
                                int i1211 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault5 | ((-7) & i22) | ((-7) ^ i22));
                                int i1212 = ((i1211 & i1210) | (i1210 ^ i1211)) * 235;
                                Object[] objArr112 = {str.substring(i22, ((i1119 | i1212) << 1) - (i1212 ^ i1119)), 931995};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                    int i1213 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                    int iBlue2 = 9 - Color.blue(0);
                                    int i1214 = $$e;
                                    Object[] objArr113 = new Object[1];
                                    e((byte) (i1214 - 5), $$d[37], (byte) i1214, objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop3, i1213, iBlue2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                long j18 = 2023654615;
                                b4 = b9;
                                long j19 = 886;
                                obj4 = obj3;
                                i23 = i22;
                                long j110 = -1;
                                long j111 = jLongValue3 ^ j110;
                                long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                long j112 = (((j18 ^ j110) | j111) ^ j110) | ((j111 | jElapsedRealtime2) ^ j110);
                                long j113 = jElapsedRealtime2 ^ j110;
                                long j114 = j113 | j18;
                                long j115 = (((long) 1773) * j18) + (((long) (-885)) * jLongValue3) + ((j112 | ((j114 | jLongValue3) ^ j110)) * j19);
                                b5 = b10;
                                i13 = i11;
                                long j116 = j115 + (((long) (-1772)) * (((j113 | jLongValue3) ^ j110) | j18)) + (j19 * (j114 ^ j110)) + ((long) (-2025724492));
                                int i1215 = 1409112738 + (((~((-1458705446) | i36)) | 76546048) * (-1188));
                                i4 = i;
                                int i1216 = 76546048 | (~(1458705445 | i4));
                                int i1217 = ~((-1399035440) | i36);
                                i24 = ((int) (j116 >> 32)) & (i1215 + ((i1216 | i1217) * 594) + (((~(1458705445 | i36)) | 16876042 | i1217) * 594));
                                i25 = ((int) j116) & ((((~((-4202561) | i4)) * 521) - 633751428) + (((~((-4202561) | i36)) | 84935953) * 521));
                                if (((i24 & i25) | (i24 ^ i25)) == -2096167706) {
                                    i14 = 1;
                                    break;
                                }
                                i22 = (i23 ^ 1) + ((i23 & 1) << 1);
                                i26 = i4;
                                i12 = i12;
                                b9 = b4;
                                b10 = b5;
                                i11 = i13;
                                obj3 = obj4;
                                str = str;
                                i6 = i6;
                            }
                            i15 = i4 ^ 20;
                            int i1218 = -i14;
                            int i1219 = ((i14 & i1218) | (i14 ^ i1218)) >> 31;
                            int i1310 = (~i1219) & i4;
                            int i1311 = i1219 & i15;
                            int i1312 = (i1311 & i1310) | (i1310 ^ i1311);
                            int i1313 = i13;
                            int i1314 = ((~i1313) & i4) | (i1313 & i36);
                            int i1315 = -i1314;
                            int i1316 = ((i1314 & i1315) | (i1314 ^ i1315)) >> 31;
                            int i1317 = i1312 & (~i1316);
                            int i1318 = i1313 & i1316;
                            i8 = (i1317 & i1318) | (i1317 ^ i1318);
                            byte[] bArr10 = $$a;
                            Object[] objArr114 = new Object[1];
                            b6 = b4;
                            d(b6, bArr10[28], (byte) (-bArr10[35]), objArr114);
                            Class<?> cls13 = Class.forName((String) objArr114[0]);
                            Object[] objArr210 = new Object[1];
                            b7 = b5;
                            d(bArr10[58], b7, bArr10[57], objArr210);
                            obj5 = obj4;
                            String str11 = (String) cls13.getField((String) objArr210[0]).get(obj5);
                            int i1319 = iIndexOf2 ^ (-1);
                            int i1410 = -i1319;
                            String strSubstring3 = str11.substring(0, iIndexOf2 & (((i1319 & i1410) | (i1319 ^ i1410)) >> 31));
                            int i1411 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr211 = new Object[1];
                            a(true, ((i1411 | 233) << 1) - (i1411 ^ 233), View.combineMeasuredStates(0, 0) + 1, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{0}, objArr211);
                            strArrSplit = strSubstring3.split((String) objArr211[0]);
                            length2 = strArrSplit.length;
                            i16 = 0;
                            while (i16 < length2) {
                                str2 = strArrSplit[i16];
                                int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                                int i1412 = tapTimeout2 * 755;
                                int i1413 = (i1412 ^ (-34972332)) + ((i1412 & (-34972332)) << 1);
                                int i1414 = ~tapTimeout2;
                                String[] strArr3 = strArrSplit;
                                int i1415 = length2;
                                int i1416 = -(-(((~((i1414 ^ 46444) | (i1414 & 46444))) | (~((i1414 ^ i4) | (i1414 & i4))) | (~(i4 | 46444))) * (-754)));
                                int i1417 = (i1413 & i1416) + (i1413 | i1416);
                                int i1418 = ~tapTimeout2;
                                int i1419 = (i1418 ^ 46444) | (i1418 & 46444);
                                int i1510 = -(-(((~((i1419 ^ i4) | (i1419 & i4))) | (~((i36 ^ tapTimeout2) | (tapTimeout2 & i36) | 46444))) * (-754)));
                                int i1511 = (i1417 ^ i1510) + ((i1510 & i1417) << 1);
                                int i1512 = -(-(((i1414 ^ i36) | (i1414 & i36)) * 754));
                                int i1513 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i1514 = i1513 * 303;
                                int i1515 = (i1514 ^ 216941326) + ((i1514 & 216941326) << 1);
                                int i1516 = ~i1513;
                                int i1517 = (i1516 ^ i6) | (i1516 & i6);
                                Object obj7 = obj5;
                                int i1518 = ~((i1517 ^ (-1798614022)) | (i1517 & (-1798614022)));
                                int i1519 = (i1513 ^ (-1798614022)) | (i1513 & (-1798614022));
                                byte b16 = b7;
                                int i1610 = ~((i1519 ^ i4) | (i1519 & i4));
                                int i1611 = -(-(((i1518 ^ i1610) | (i1518 & i1610)) * (-302)));
                                int i1612 = ((i1515 | i1611) << 1) - (i1515 ^ i1611);
                                int i1613 = (~((i1516 ^ (-1798614022)) | (i1516 & (-1798614022)) | i4)) * (-604);
                                objArr = new Object[1];
                                c(new char[]{39050, 35246, 52533}, new char[]{0, 0, 0, 0}, (char) ((i1511 ^ i1512) + ((i1512 & i1511) << 1)), new char[]{64063, 52051, 27796, 31157}, (((i1612 ^ i1613) + ((i1613 & i1612) << 1)) - (~(-(-(((~(1798614021 | i1513)) | (~((i4 ^ (-1798614022)) | (i4 & (-1798614022))))) * 302))))) - 1, objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 2267, 33 - KeyEvent.keyCodeFromString("")))) {
                                        char[] cArr3 = {21472, 50900, 8945, 32138, 17224, 11236, 64722, 52588, 38836, 4138, 57540, 38685, 27437, 56378, 23196, 574};
                                        char[] cArr4 = {0, 0, 0, 0};
                                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i1614 = iLastIndexOf2 * 253;
                                        int i1615 = (i1614 ^ 1873212) + ((i1614 & 1873212) << 1);
                                        int i1616 = ~iLastIndexOf2;
                                        b8 = b6;
                                        int i1617 = ~((i1616 & (-7405)) | (i1616 ^ (-7405)));
                                        int i1618 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                        int i1619 = ~(((-7405) ^ i1618) | ((-7405) & i1618));
                                        i18 = i1617 ^ i1619;
                                        int i1710 = i18 | (i1619 & i1617);
                                        i19 = i16;
                                        int i1711 = ~((iLastIndexOf2 & 7404) | (iLastIndexOf2 ^ 7404) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                        int i1712 = -(-(((i1710 & i1711) | (i1710 ^ i1711)) * (-252)));
                                        i17 = 1;
                                        int i1713 = ((i1615 | i1712) << 1) - (i1712 ^ i1615);
                                        int i1714 = -(-((iLastIndexOf2 | 7404) * (-252)));
                                        int i1715 = ((i1713 | i1714) << 1) - (i1714 ^ i1713);
                                        int i1716 = ((-7405) & i1618) | ((-7405) ^ i1618);
                                        int i1717 = ~((iLastIndexOf2 & i1716) | (i1716 ^ iLastIndexOf2));
                                        int i1718 = -(-(((i1717 & i1711) | (i1717 ^ i1711)) * 252));
                                        Object[] objArr212 = new Object[1];
                                        c(cArr3, cArr4, (char) ((i1715 & i1718) + (i1718 | i1715)), new char[]{44479, 40787, 60328, 58396}, Color.green(0), objArr212);
                                        String str12 = (String) objArr212[0];
                                        Runtime runtime2 = Runtime.getRuntime();
                                        Object[] objArr213 = new Object[1];
                                        c(new char[]{63583, 13291}, new char[]{0, 0, 0, 0}, (char) (Color.alpha(0) + 54984), new char[]{16104, 57590, 51447, 43990}, 0 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr213);
                                        processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                        Object[] objArr214 = {processExec.getInputStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0) + 2143, 46 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                        Object[] objArr215 = {processExec.getErrorStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 2141 - TextUtils.lastIndexOf("", '0'), 46 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                        byte[] bArr11 = $$a;
                                        i18 = i15;
                                        i20 = i8;
                                        Object[] objArr216 = new Object[1];
                                        d(bArr11[54], bArr11[34], bArr11[58], objArr216);
                                        Class<?> cls14 = Class.forName((String) objArr216[0]);
                                        str3 = str2;
                                        Object[] objArr217 = new Object[1];
                                        d(bArr11[13], (byte) (bArr11[11] - 1), bArr11[28], objArr217);
                                        cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                        Object[] objArr218 = new Object[1];
                                        d(bArr11[54], bArr11[34], bArr11[58], objArr218);
                                        Class<?> cls15 = Class.forName((String) objArr218[0]);
                                        Object[] objArr219 = new Object[1];
                                        d(bArr11[13], (byte) (bArr11[11] - 1), bArr11[28], objArr219);
                                        cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str12);
                                        int i1719 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                        int i1810 = ((i1719 | 839698124) << 1) - (i1719 ^ 839698124);
                                        Object[] objArr310 = new Object[1];
                                        c(new char[]{7932}, new char[]{0, 0, 0, 0}, (char) (5697 - (~(-(-(ViewConfiguration.getLongPressTimeout() >> 16))))), new char[]{52473, 3270, 16946, 46358}, i1810, objArr310);
                                        sb3.append((String) objArr310[0]);
                                        String string3 = sb3.toString();
                                        int i1811 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 252;
                                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                                        int i1812 = iNormalizeMetaState2 * 980;
                                        int i1813 = (((i1812 & (-4890)) + (i1812 | (-4890))) - (~(-(-((~(((-6) & i36) | ((-6) ^ i36))) * 979))))) - 1;
                                        int i1814 = ((iNormalizeMetaState2 ^ i4) | (iNormalizeMetaState2 & i4)) * (-979);
                                        int i1815 = (i1813 ^ i1814) + ((i1813 & i1814) << 1);
                                        int i1816 = ~((-6) | i4);
                                        int i1817 = ~(iNormalizeMetaState2 | i36);
                                        int i1818 = -(-(((i1816 & i1817) | (i1816 ^ i1817)) * 979));
                                        Object[] objArr311 = new Object[1];
                                        a(false, i1811, (i1815 & i1818) + (i1818 | i1815), 3 - TextUtils.indexOf("", "", 0, 0), new char[]{2, 65513, 65524, 17, 16}, objArr311);
                                        dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                        dataOutputStream2.flush();
                                        int maximumFlingVelocity3 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                        int i1819 = (maximumFlingVelocity3 ^ (-637701900)) + ((maximumFlingVelocity3 & (-637701900)) << 1);
                                        Object[] objArr312 = new Object[1];
                                        c(new char[]{7863, 59015, '\n', 34336, 25782}, new char[]{0, 0, 0, 0}, (char) (View.resolveSizeAndState(0, 0, 0) + 38486), new char[]{62555, 64880, 22233, 2454}, i1819, objArr312);
                                        String str13 = (String) objArr312[0];
                                        int i1910 = 252 - (~View.getDefaultSize(0, 0));
                                        int iIndexOf6 = 5 - TextUtils.indexOf("", "");
                                        int i1911 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i1912 = i1911 * (-575);
                                        int i1913 = (i1912 & (-1725)) + (i1912 | (-1725));
                                        int i1914 = ~i1911;
                                        int i1915 = ~((i1914 & (-4)) | (i1914 ^ (-4)));
                                        int i1916 = ~(((-4) ^ i4) | ((-4) & i4));
                                        int i1917 = -(-(((i1915 & i1916) | (i1915 ^ i1916)) * 576));
                                        int i1918 = ((i1913 | i1917) << 1) - (i1917 ^ i1913);
                                        int i1919 = ~i1911;
                                        int i2010 = ~(i1919 | 3);
                                        int i2011 = ((-4) & i36) | ((-4) ^ i36);
                                        int i2012 = ~((i1911 & i2011) | (i2011 ^ i1911));
                                        int i2013 = ((i2012 & i2010) | (i2010 ^ i2012)) * 576;
                                        Object[] objArr313 = new Object[1];
                                        a(false, i1910, iIndexOf6, (((i1918 & i2013) + (i2013 | i1918)) - (~(-(-((~((i1919 ^ (-4)) | (i1919 & (-4)))) * 576))))) - 1, new char[]{2, 65513, 65524, 17, 16}, objArr313);
                                        dataOutputStream2.write(str13.getBytes((String) objArr313[0]));
                                        dataOutputStream2.flush();
                                        long jNanoTime2 = System.nanoTime();
                                        nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                        do {
                                            processExec.exitValue();
                                            break;
                                        } while (nanos > 0);
                                        dataOutputStream2.close();
                                        byte[] bArr12 = $$a;
                                        Object[] objArr314 = new Object[1];
                                        d(bArr12[54], bArr12[34], bArr12[58], objArr314);
                                        Class<?> cls16 = Class.forName((String) objArr314[0]);
                                        byte b17 = bArr12[28];
                                        Object[] objArr315 = new Object[1];
                                        d(b17, (byte) (b17 | 62), bArr12[58], objArr315);
                                        cls16.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                        Object[] objArr316 = new Object[1];
                                        d(bArr12[54], bArr12[34], bArr12[58], objArr316);
                                        Class<?> cls17 = Class.forName((String) objArr316[0]);
                                        byte b18 = bArr12[28];
                                        Object[] objArr46 = new Object[1];
                                        d(b18, (byte) (b18 | 62), bArr12[58], objArr46);
                                        cls17.getMethod((String) objArr46[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                        processExec.destroy();
                                        StringBuilder sb4 = new StringBuilder();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 2142;
                                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 45;
                                            byte[] bArr13 = $$d;
                                            byte b19 = bArr13[37];
                                            Object[] objArr47 = new Object[1];
                                            e(b19, b19, bArr13[15], objArr47);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity2, edgeSlop4, maxKeyCode2, 399405187, false, (String) objArr47[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                            int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0') + 2143;
                                            int trimmedLength3 = 45 - TextUtils.getTrimmedLength("");
                                            byte[] bArr14 = $$d;
                                            byte b110 = bArr14[37];
                                            Object[] objArr48 = new Object[1];
                                            e(b110, b110, bArr14[15], objArr48);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity2, iIndexOf7, trimmedLength3, 399405187, false, (String) objArr48[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                        String string4 = sb4.toString();
                                        int i2110 = -TextUtils.lastIndexOf("", '0');
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i2111 = i2110 * 399;
                                        int i2112 = (i2111 ^ 2273103) + ((i2111 & 2273103) << 1);
                                        int i2113 = ~i2110;
                                        int i2114 = ~((i2113 & 5697) | (i2113 ^ 5697));
                                        int i2115 = ~(((-5698) ^ i2110) | ((-5698) & i2110));
                                        int i2116 = (i2114 & i2115) | (i2114 ^ i2115);
                                        int i2210 = ~(((-5698) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-5698) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                        int i2211 = -(-(((i2116 & i2210) | (i2116 ^ i2210)) * 398));
                                        int i2212 = ((((i2112 | i2211) << 1) - (i2211 ^ i2112)) - (~(-(-(((i2110 ^ 5697) | (i2110 & 5697)) * (-1194)))))) - 1;
                                        int i2213 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                        int i2214 = ~((i2213 & (-5698)) | ((-5698) ^ i2213));
                                        int i2215 = ~((~i2110) | 5697);
                                        int i2216 = (i2215 & i2214) | (i2214 ^ i2215);
                                        int i2217 = i2216 ^ i2115;
                                        int i2218 = -(-View.resolveSize(0, 0));
                                        Object[] objArr49 = new Object[1];
                                        c(new char[]{7932}, new char[]{0, 0, 0, 0}, (char) (i2212 + (((i2216 & i2115) | i2217) * 398)), new char[]{52473, 3270, 16946, 46358}, (i2218 & 839698124) + (i2218 | 839698124), objArr49);
                                        strArrSplit2 = string4.split((String) objArr49[0]);
                                        length3 = strArrSplit2.length;
                                        i21 = 0;
                                        while (true) {
                                            if (i21 < length3) {
                                                str4 = strArrSplit2[i21];
                                                int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                                int i2014 = -(-ExpandableListView.getPackedPositionChild(0L));
                                                int i2015 = -View.resolveSizeAndState(0, 0, 0);
                                                objArr2 = new Object[1];
                                                a(false, (touchSlop2 | 280) + (touchSlop2 & 280), ((i2014 & 20) << 1) + (i2014 ^ 20), (i2015 | 18) + (i2015 & 18), new char[]{2, 4, '\f', 2, '\b', 6, 65499, 4, 16, 14, 65487, '\b', 16, 16, '\b', '\r', 6, 65487, 17}, objArr2);
                                                if (str4.startsWith((String) objArr2[0])) {
                                                    objArr3 = new Object[1];
                                                    c(new char[]{26342, 6668, 38027, 28226, 17719, 13850, 39649, 31548, 44968, 55924, 42966, 1689, 58898, 45593, 54742, 48687, 35595, 52174, 36694, 49198}, new char[]{0, 0, 0, 0}, (char) TextUtils.getOffsetBefore("", 0), new char[]{64857, 51832, 13969, 19610}, Drawable.resolveOpacity(0, 0), objArr3);
                                                    if (str4.startsWith((String) objArr3[0])) {
                                                        int i2016 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                        objArr4 = new Object[1];
                                                        c(new char[]{60857, 4016, 46561, 16684, 158, 60518, 32223, 12055}, new char[]{0, 0, 0, 0}, (char) ((i2016 ^ 1) + ((i2016 & 1) << 1)), new char[]{4591, 31960, 28097, 7299}, (Process.getThreadPriority(0) + 20) >> 6, objArr4);
                                                        if (str4.startsWith((String) objArr4[0])) {
                                                            int i2017 = -(-(Process.myTid() >> 22));
                                                            int i2018 = ((i2017 | 243) << 1) - (i2017 ^ 243);
                                                            int i2019 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                            Object[] objArr410 = new Object[1];
                                                            a(false, i2018, ((i2019 | 1) << 1) - (i2019 ^ 1), '1' - AndroidCharacter.getMirror('0'), new char[]{0}, objArr410);
                                                            strArrSplit3 = str4.split((String) objArr410[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                str5 = str3;
                                                                if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                    int i2117 = i20;
                                                                    int i2118 = ((~i2117) & i4) | (i2117 & i36);
                                                                    int i2119 = (i2118 | (-i2118)) >> 31;
                                                                    i8 = (i2119 & i2117) | (i18 & (~i2119));
                                                                }
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                        } else {
                                                            str5 = str3;
                                                        }
                                                    } else {
                                                        str5 = str3;
                                                    }
                                                } else {
                                                    str5 = str3;
                                                }
                                                i21 = ((i21 & 1) << 1) + (i21 ^ 1);
                                                str3 = str5;
                                                i20 = i20;
                                            } else {
                                                i17 = i20;
                                            }
                                            i16 = (i19 ^ (-115)) + ((i19 & (-115)) << 1) + 116;
                                            b6 = b8;
                                            i15 = i18;
                                            strArrSplit = strArr3;
                                            length2 = i1415;
                                            obj5 = obj7;
                                            b7 = b16;
                                        }
                                    }
                                } else {
                                    i17 = i8;
                                    i18 = i15;
                                    i19 = i16;
                                    b8 = b6;
                                }
                                i8 = i17;
                                i16 = (i19 ^ (-115)) + ((i19 & (-115)) << 1) + 116;
                                b6 = b8;
                                i15 = i18;
                                strArrSplit = strArr3;
                                length2 = i1415;
                                obj5 = obj7;
                                b7 = b16;
                            }
                            obj = obj5;
                            b3 = b7;
                            b2 = b6;
                            i7 = 1;
                        }
                    } else {
                        obj = objInvoke;
                        b2 = b9;
                        i6 = i31;
                        b3 = b10;
                        i7 = 1;
                        i4 = i26;
                        i8 = i4;
                    }
                    Object[] objArr50 = new Object[2];
                    objArr50[0] = new int[i7];
                    String[] strArr4 = new String[i7];
                    byte[] bArr15 = $$a;
                    Object[] objArr51 = new Object[i7];
                    d(b2, bArr15[28], (byte) (-bArr15[35]), objArr51);
                    Class<?> cls18 = Class.forName((String) objArr51[0]);
                    Object[] objArr52 = new Object[i7];
                    d(bArr15[58], b3, bArr15[57], objArr52);
                    strArr4[0] = cls18.getField((String) objArr52[0]).get(obj);
                    Object obj8 = objArr50[0];
                    ((int[]) obj8)[0] = i8;
                    objArr50[i7] = strArr4;
                    i5 = ((int[]) obj8)[0];
                    String[] strArr5 = strArr4;
                    if ((i2 & 1) == 0) {
                        int i233 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i234 = -View.resolveSizeAndState(0, 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i235 = (i234 * 860) + 1154009688;
                        int i236 = -(-(((i234 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i234 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8)) * (-859)));
                        int i237 = ((i235 | i236) << 1) - (i235 ^ i236);
                        int i238 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i239 = ~((i238 ^ i234) | (i238 & i234));
                        int i240 = ~i234;
                        int i241 = (i240 ^ 391796571) | (i240 & 391796571);
                        int i242 = -(-(((~((i241 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i241))) | i239) * 859));
                        int i243 = (i237 & i242) + (i242 | i237);
                        int i244 = ~((391796571 ^ i238) | (i238 & 391796571));
                        int i245 = ~((i234 & 391796571) | (391796571 ^ i234));
                        int i246 = (i243 - (~(((i245 & i244) | (i244 ^ i245)) * 859))) - 1;
                        Object[] objArr53 = new Object[1];
                        c(new char[]{39185, 45914, 27027, 52643, 44729, 61984, 1079, 53475, 40806, 4774, 8973, 23082, 12170}, new char[]{0, 0, 0, 0}, (char) (((i233 | 57883) << i7) - (i233 ^ 57883)), new char[]{42159, 42408, 7400, 48610}, i246, objArr53);
                        try {
                            Object[] objArr54 = {(String) objArr53[0]};
                            Object[] objArr55 = new Object[1];
                            a(true, 287 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 23 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), 7 - ImageFormat.getBitsPerPixel(0), new char[]{65481, 65535, 4, '\n', '\r', 65535, '\t', 65532, 15, 19, 0, 15, '\t', '\n', 65502, 65481, 15, '\t', 0, 15, '\t', '\n', 65534}, objArr55);
                            Class<?> cls19 = Class.forName((String) objArr55[0]);
                            Object[] objArr56 = new Object[1];
                            c(new char[]{25227, 34793, 33074, 30858, 7802, 41818, 8533, 27492, 16519, 36886, 30558, 756, 25980, 4417, 60296, 2694}, new char[]{0, 0, 0, 0}, (char) (18654 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), new char[]{42337, 38500, 57022, 60744}, Process.myTid() >> 22, objArr56);
                            Object objInvoke2 = cls19.getMethod((String) objArr56[0], String.class).invoke(context, objArr54);
                            if (objInvoke2 == null) {
                                strArr = strArr5;
                                i9 = i4;
                                break;
                            }
                            Object[] objArr57 = new Object[1];
                            c(new char[]{38113, 41402, 47063, 7870, 27190, 46113, 59792, 48304, 51337, 48123, 35335, 23398, 7024, 38347, 11949, 6593, 21785, 19089, 5109, 51328, 30720, 24267, 27266, 35521, 32907, 30493, 47983, 18991, 44692, 3975, 11808, 29343, 26458, 23740, 18812, 31586, 37857}, new char[]{0, 0, 0, 0}, (char) View.getDefaultSize(0, 0), new char[]{1091, 44996, 36656, 33272}, 816825349 + MotionEvent.axisFromString(""), objArr57);
                            Class<?> cls20 = Class.forName((String) objArr57[0]);
                            int i247 = 284 - (~(-MotionEvent.axisFromString("")));
                            int iIndexOf8 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iRed = Color.red(0);
                            int i248 = iRed * 569;
                            int i249 = (i248 & 8535) + (i248 | 8535);
                            int i250 = ~iRed;
                            int i251 = ~((i250 ^ (-16)) | (i250 & (-16)));
                            int i252 = ~iRed;
                            int i253 = ~((i252 & i36) | (i252 ^ i36));
                            int i254 = (i251 & i253) | (i251 ^ i253);
                            int i255 = ~(((-16) ^ i36) | ((-16) & i36));
                            int i256 = -(-(((i254 ^ i255) | (i254 & i255)) * (-1136)));
                            int i257 = (i249 & i256) + (i249 | i256);
                            int i258 = ~((i250 ^ i4) | (i250 & i4));
                            int i259 = ~(((-16) ^ i4) | ((-16) & i4));
                            int i260 = (i258 ^ i259) | (i258 & i259);
                            int i261 = (i36 ^ iRed) | (i36 & iRed);
                            int i262 = ~((i261 ^ 15) | (i261 & 15));
                            int i263 = i257 + (((i260 ^ i262) | (i260 & i262)) * (-568));
                            int i264 = (~((i6 & iRed) | (i6 ^ iRed))) | (~((i36 ^ 15) | (i36 & 15)));
                            int i265 = (i250 & (-16)) | (i250 ^ (-16));
                            int i266 = ~((i265 & i4) | (i265 ^ i4));
                            int i267 = -(-(((i264 & i266) | (i264 ^ i266)) * 568));
                            Object[] objArr58 = new Object[1];
                            a(true, i247, iIndexOf8, (i267 | i263) + (i263 & i267), new char[]{14, '\t', 4, '\b', 65535, 65500, 0, 17, 4, 15, 65534, 65500, 15, 0, 2}, objArr58);
                            List list = (List) cls20.getMethod((String) objArr58[0], null).invoke(objInvoke2, null);
                            if (list == null) {
                                strArr = strArr5;
                                i9 = i4;
                                break;
                            }
                            Iterator it = list.iterator();
                            loop5: while (true) {
                                if (!it.hasNext()) {
                                    strArr = strArr5;
                                    i9 = i4;
                                    break;
                                }
                                Object next = it.next();
                                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                int i268 = ~(((-287) ^ i36) | ((-287) & i36));
                                int i269 = ~((iIndexOf9 ^ i4) | (iIndexOf9 & i4));
                                int i270 = ((iIndexOf9 * 960) - 548262) + (((i268 & i269) | (i268 ^ i269)) * 959) + 275233;
                                int i271 = ~((-287) | i4);
                                int i272 = ~((i6 & iIndexOf9) | (i6 ^ iIndexOf9));
                                int i273 = ((i272 & i271) | (i271 ^ i272)) * 959;
                                int i274 = ((i270 | i273) << 1) - (i273 ^ i270);
                                int i275 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                int iIndexOf10 = TextUtils.indexOf("", "", 0, 0);
                                Object[] objArr59 = new Object[1];
                                a(false, i274, (i275 | 30) + (i275 & 30), (iIndexOf10 | 14) + (iIndexOf10 & 14), new char[]{65482, 65503, 11, '\t', '\f', 11, '\n', 1, '\n', 16, 65514, 65533, '\t', 1, 65533, '\n', 0, 14, 11, 5, 0, 65482, 65535, 11, '\n', 16, 1, '\n', 16}, objArr59);
                                Class<?> cls21 = Class.forName((String) objArr59[0]);
                                int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                Object[] objArr60 = new Object[1];
                                c(new char[]{27582, 21948, 36365, 9973, 46293, 33541, 32416, 58624, 7845, 50976, 57498, 53278, 41859, 4529}, new char[]{0, 0, 0, 0}, (char) ((fadingEdgeLength ^ 61652) + ((fadingEdgeLength & 61652) << 1)), new char[]{531, 37383, 54350, 55792}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr60);
                                String str14 = (String) cls21.getMethod((String) objArr60[0], null).invoke(next, null);
                                Object[] objArr61 = new Object[1];
                                c(new char[]{38113, 41402, 47063, 7870, 27190, 46113, 59792, 48304, 51337, 48123, 35335, 23398, 7024, 38347, 11949, 6593, 21785, 19089, 5109, 51328, 30720, 24267, 27266, 35521, 32907, 30493, 47983, 18991, 44692, 3975, 11808, 29343, 26458, 23740, 18812, 31586, 37857}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getTapTimeout() >> 16), new char[]{1091, 44996, 36656, 33272}, 816825348 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr61);
                                Class<?> cls22 = Class.forName((String) objArr61[0]);
                                int i276 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                int i277 = -Color.red(0);
                                strArr = strArr5;
                                Object[] objArr62 = new Object[1];
                                a(true, ((i276 | 288) << 1) - (i276 ^ 288), ((i277 | 17) << 1) - (i277 ^ 17), Drawable.resolveOpacity(0, 0) + 9, new char[]{65534, 5, 2, 65535, '\b', 11, 65513, '\f', 2, '\t', '\t', 65498, 11, 65534, 7, 16, 65512}, objArr62);
                                if (((Boolean) cls22.getMethod((String) objArr62[0], String.class).invoke(objInvoke2, str14)).booleanValue() && (length = str14.length() - 20) >= 0) {
                                    int i278 = 0;
                                    while (i278 <= length) {
                                        int i279 = i278 * 628;
                                        int i280 = (12560 & i279) + (i279 | 12560);
                                        int i281 = (i278 ^ i4) | (i278 & i4);
                                        int i282 = -(-(((i281 & (-21)) | (i281 ^ (-21))) * (-627)));
                                        int i283 = (i280 ^ i282) + ((i282 & i280) << 1);
                                        int i284 = ~i278;
                                        int i285 = ~((i284 & i4) | (i284 ^ i4));
                                        int i286 = ((i285 & 20) | (i285 ^ 20)) * (-627);
                                        int i287 = (i283 & i286) + (i286 | i283);
                                        int i288 = ~((i36 ^ i278) | (i36 & i278));
                                        int i289 = ~((i4 ^ 20) | (i4 & 20));
                                        Object[] objArr63 = {str14.substring(i278, i287 + (((i288 & i289) | (i288 ^ i289)) * 627)), 931995};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                                            int edgeSlop5 = 3393 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            int iGreen = Color.green(0) + 9;
                                            int i290 = $$e;
                                            Object[] objArr64 = new Object[1];
                                            e((byte) (i290 - 5), $$d[37], (byte) i290, objArr64);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, edgeSlop5, iGreen, 1203525406, false, (String) objArr64[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr63)).longValue();
                                        long j20 = 1426753010;
                                        long j21 = -496;
                                        long j22 = (j21 * j20) + (j21 * jLongValue4);
                                        long j23 = 497;
                                        Object obj9 = objInvoke2;
                                        long j24 = -1;
                                        long j25 = j20 ^ j24;
                                        long j26 = jLongValue4 ^ j24;
                                        long j27 = j25 | j26;
                                        String str15 = str14;
                                        int i291 = i278;
                                        long j28 = i4;
                                        long j29 = j28 ^ j24;
                                        long j30 = j22 + ((j27 ^ j24) * j23) + ((((j27 | j28) ^ j24) | (((j26 | j29) | j20) ^ j24)) * j23) + (j23 * ((j24 ^ (j28 | (j26 | j20))) | ((j25 | j29) ^ j24) | ((j25 | jLongValue4) ^ j24))) + ((long) (-1428822887));
                                        int i292 = ~((int) SystemClock.elapsedRealtime());
                                        int i293 = ((int) (j30 >> 32)) & ((((~((-1906059987) | i292)) | 1611410128) * (-241)) + 2067569650 + (((~(i292 | (-294649859))) | (-2080243704)) * 241));
                                        int i294 = ((int) j30) & ((((~(278936472 | i4)) | 1437213065) * 398) + 2080247237 + (((~(278936472 | i36)) | 1437213065) * 398));
                                        if (((i294 & i293) | (i293 ^ i294)) == 1245577864) {
                                            i9 = i4 ^ 70;
                                            break loop5;
                                        }
                                        i278 = i291 + 1;
                                        length = length;
                                        objInvoke2 = obj9;
                                        str14 = str15;
                                    }
                                }
                                objInvoke2 = objInvoke2;
                                strArr5 = strArr;
                            }
                            int i295 = ((~i5) & i4) | (i5 & i36);
                            int i296 = (i295 | (-i295)) >> 31;
                            int i297 = i9 & (~i296);
                            int i298 = i5 & i296;
                            i5 = (i298 & i297) | (i297 ^ i298);
                        } catch (Throwable th16) {
                            Throwable cause9 = th16.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th16;
                        }
                    } else {
                        strArr = strArr5;
                    }
                } catch (Throwable th17) {
                    Throwable cause10 = th17.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th17;
                }
            } else {
                i4 = i26;
                i5 = i4;
                strArr = null;
            }
            int i299 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i300 = (i299 * (-1529)) + 764;
            int i301 = ~i299;
            int i302 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
            int i303 = ~((i301 ^ i302) | (i301 & i302));
            int i304 = (~i301) | i301;
            int i305 = ~((i304 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i304 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
            int i306 = ((i303 & i305) | (i303 ^ i305) | (~((i299 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i299 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9)))) * 765;
            int i307 = ((i300 | i306) << 1) - (i300 ^ i306);
            int i308 = ~i301;
            int i309 = ~i299;
            int i310 = ~((i302 & i309) | (i309 ^ i302));
            int i311 = -(-(((i308 & i310) | (i308 ^ i310)) * 1530));
            int i312 = (i307 ^ i311) + ((i311 & i307) << 1);
            int i313 = ~((i309 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i309 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
            int i314 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
            int i315 = (i312 - (~(-(-(((~((i299 & i314) | (i314 ^ i299))) | i313) * 765))))) - 1;
            Object[] objArr65 = new Object[1];
            c(new char[]{58960, 51216, 46708, 30353, 29545, 15370, 63310, 28181, 16539, 20821, 188, 27207}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{13881, 44299, 62595, 18320}, i315, objArr65);
            Object[] objArr66 = {(String) objArr65[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 993;
                int i316 = 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b20 = (byte) ($$e - 5);
                byte b21 = b20;
                Object[] objArr67 = new Object[1];
                e(b20, b21, b21, objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb2, fadingEdgeLength2, i316, -545305915, false, (String) objArr67[0], new Class[]{String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr66)).longValue();
            long j31 = -200123021;
            long j32 = 765;
            long j33 = -1;
            long j34 = j31 ^ j33;
            long j35 = jLongValue5 ^ j33;
            long j36 = j34 | j35;
            long j37 = i4;
            long j38 = j37 ^ j33;
            long j39 = (((long) (-1529)) * j31) + (((long) (-764)) * jLongValue5) + ((((j36 | j38) ^ j33) | (((jLongValue5 | j34) | j37) ^ j33) | (((j35 | j31) | j37) ^ j33)) * j32) + (((long) 1530) * ((j36 ^ j33) | ((j34 | j38) ^ j33))) + (j32 * (((j34 | j37) ^ j33) | ((j31 | (j35 | j38)) ^ j33))) + ((long) 820582305);
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i317 = ((int) (j39 >> 32)) & ((((-1320242614) + (((~((-266519985) | iElapsedRealtime2)) | 96634288) * 1504)) + ((~(iElapsedRealtime2 | (-169885697))) * (-1504))) - 846579360);
            int i318 = ~((~new Random().nextInt()) | 333315659);
            int i319 = (((int) j39) & (((25711169 | i318) * (-374)) + 508853935 + ((i318 | 307604490) * 374))) | i317;
            int i320 = ~i;
            int i321 = (i319 | (-i319)) >> 31;
            int i322 = (~i321) & i;
            int i323 = i321 & ((i & (-51)) | (i320 & 50));
            int i324 = (i323 & i322) | (i322 ^ i323);
            int i325 = ((~i5) & i) | (i5 & i320);
            int i326 = -i325;
            int i327 = ((i325 & i326) | (i325 ^ i326)) >> 31;
            int i328 = (i5 & i327) | (i324 & (~i327));
            int iIndexOf11 = 286 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i329 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i330 = (i329 & 20) + (i329 | 20);
            int i331 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr68 = new Object[1];
            a(false, iIndexOf11, i330, ((i331 | 13) << 1) - (i331 ^ 13), new char[]{7, 65481, 16, '\n', 2, '\t', '\b', 65535, 65529, '\r', '\n', 65531, 65533, 65535, 65481, '\r', 19, '\r', 14, 65535}, objArr68);
            Object[] objArr69 = {(String) objArr68[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 993;
                int iGreen2 = 8 - Color.green(0);
                byte b22 = (byte) ($$e - 5);
                byte b23 = b22;
                Object[] objArr70 = new Object[1];
                e(b22, b23, b23, objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(jumpTapTimeout, iResolveOpacity, iGreen2, -545305915, false, (String) objArr70[0], new Class[]{String.class});
            }
            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr69)).longValue();
            long j40 = 580972509;
            long j41 = j40 ^ j33;
            long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
            long j42 = (((long) 303) * j40) + (((long) (-301)) * jLongValue6) + (((long) (-302)) * ((((j41 | (jMaxMemory ^ j33)) | jLongValue6) ^ j33) | (((j40 | jLongValue6) | jMaxMemory) ^ j33))) + (((long) (-604)) * (((j41 | jLongValue6) | jMaxMemory) ^ j33)) + (((long) 302) * (((jMaxMemory | jLongValue6) ^ j33) | (((jLongValue6 ^ j33) | j40) ^ j33))) + ((long) 39486775);
            int i332 = (int) Runtime.getRuntime().totalMemory();
            int i333 = ((int) (j42 >> 32)) & ((-584911214) + (((~(2064214841 | i332)) | 793526043) * (-948)) + ((~((~i332) | 2135785275)) * (-948)) + 870704356);
            int i334 = (~((-1212482533) | i320)) | 1073742432;
            int i335 = ~(1783998453 | i);
            int i336 = ((int) j42) & ((((i334 | i335) * (-252)) - 1437073195) + ((i335 | (~((-138740101) | i320))) * 252));
            int i337 = (i333 & i336) | (i333 ^ i336);
            int i338 = (~(i & 60)) & (i | 60);
            int i339 = -i337;
            int i340 = ((i337 & i339) | (i337 ^ i339)) >> 31;
            int i341 = (~i340) & i;
            int i342 = i340 & i338;
            int i343 = (i342 & i341) | (i341 ^ i342);
            int i344 = i ^ i328;
            int i345 = -i344;
            int i346 = ((i344 & i345) | (i344 ^ i345)) >> 31;
            int i347 = i343 & (~i346);
            int i348 = i328 & i346;
            int i349 = (i347 & i348) | (i347 ^ i348);
            Object[] objArr71 = new Object[1];
            c(new char[]{55442, 46456, 50620, 31030, 63896, 15115, 45971, 27301, 9719, 45086, 57262, 60760, 19568, 50115, 39350, 46698, 49410, 13308, 2210, 31764, 9971, 19379, 55212, 55745, 29216, 52547, 21642, 9468, 10203, 39607, 21798, 11013, 23081, 52044, 9413, 41421}, new char[]{0, 0, 0, 0}, (char) View.resolveSize(0, 0), new char[]{10937, 58466, 25098, 62404}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr71);
            Object[] objArr72 = {(String) objArr71[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iNormalizeMetaState3 = 993 - KeyEvent.normalizeMetaState(0);
                int iIndexOf12 = TextUtils.indexOf("", "", 0, 0) + 8;
                byte b24 = (byte) ($$e - 5);
                Object[] objArr73 = new Object[1];
                e(b24, b24, $$d[0], objArr73);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cCombineMeasuredStates, iNormalizeMetaState3, iIndexOf12, 349342683, false, (String) objArr73[0], new Class[]{String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr72)).longValue();
            long j43 = 602899069;
            long j44 = -575;
            long j45 = (j44 * j43) + (j44 * jLongValue7);
            long j46 = 576;
            long j47 = j43 ^ j33;
            long j48 = jLongValue7 ^ j33;
            long j49 = (j47 | j48) ^ j33;
            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            long j50 = j45 + ((j49 | ((j48 | startElapsedRealtime) ^ j33)) * j46) + (((((j48 | (startElapsedRealtime ^ j33)) | j43) ^ j33) | ((j47 | jLongValue7) ^ j33)) * j46) + (j46 * j49) + ((long) (-1449977674));
            int i350 = ((int) (j50 >> 32)) & ((-1788177110) + ((1140850730 | i320) * (-192)) + (((~(1864892543 | i320)) | (-2133699072)) * (-384)) + (((~(2133699071 | i)) | (~((-268806529) | i320)) | (~((-724041814) | i))) * DerHeader.TAG_CLASS_PRIVATE));
            int i351 = ((int) j50) & ((((~((-1573251292) | i320)) | (~((-1284489595) | i)) | (~(i320 | 1284489594))) * 959) + 21634286 + (((~((-1573251292) | i)) | (~((-1284489595) | i320)) | (~(1284489594 | i))) * 959));
            int i352 = (i350 & i351) | (i350 ^ i351);
            int i353 = -i352;
            int i354 = ((i352 & i353) | (i352 ^ i353)) >> 31;
            int i355 = (~i354) & i;
            int i356 = i354 & ((i & (-81)) | (i320 & 80));
            int i357 = (i356 & i355) | (i355 ^ i356);
            int i358 = (~(i & i349)) & (i | i349);
            int i359 = -i358;
            int i360 = ((i358 & i359) | (i358 ^ i359)) >> 31;
            int i361 = i357 & (~i360);
            int i362 = i349 & i360;
            int i363 = (i361 & i362) | (i361 ^ i362);
            int i364 = -ImageFormat.getBitsPerPixel(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = CameraManagerCompatBaseImplCameraManagerCompatParamsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i365 = i364 * 477;
            int i366 = ((i365 | (-8344800)) << 1) - (i365 ^ (-8344800));
            int i367 = ~((~i364) | 17568);
            int i368 = ((-17569) ^ i364) | ((-17569) & i364);
            int i369 = ~((i368 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i368 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
            int i370 = (i366 - (~(-(-(((i367 & i369) | (i367 ^ i369)) * (-476)))))) - 1;
            int i371 = (-17569) | i364;
            int i372 = -(-((~((i371 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i371 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10))) * 952));
            int i373 = ((i370 | i372) << 1) - (i372 ^ i370);
            int i374 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (-17569);
            int i375 = i374 ^ i364;
            Object[] objArr74 = new Object[1];
            c(new char[]{41850, 23273, 20480, 19634, 33918, 4118, 50805, 39047, 13400, 43087, 24421, 60791, 24075, 11919, 6503, 25285, 52082, 39095, 9958, 6389, 25262, 1232, 10498, 9782, 5448, 49281, 62708, 48887, 16929, 52933, 37207, 16586, 12781, 41396, 49924, 56477, 19899, 1294, 60565, 58180, 17727, 6171}, new char[]{0, 0, 0, 0}, (char) (i373 + ((~((i364 & i374) | i375)) * 476)), new char[]{40700, 47427, 41327, 9028}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr74);
            Object[] objArr75 = {(String) objArr74[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 993;
                int i376 = 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b25 = (byte) ($$e - 5);
                Object[] objArr76 = new Object[1];
                e(b25, b25, $$d[0], objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(deadChar, deadChar2, i376, 349342683, false, (String) objArr76[0], new Class[]{String.class});
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr75)).longValue();
            long j51 = -122602986;
            long j52 = ((j51 ^ j33) | jLongValue8) ^ j33;
            long j53 = 70;
            long j54 = (((long) 71) * j51) + (((long) (-69)) * jLongValue8) + (((long) (-140)) * (j52 | ((jLongValue8 | j37) ^ j33))) + ((((j51 | jLongValue8) | j37) ^ j33) * j53) + (j53 * (j52 | (((jLongValue8 ^ j33) | j51) ^ j33) | ((j51 | j37) ^ j33))) + ((long) (-724475619));
            int i377 = ((int) (j54 >> 32)) & (635053406 + (((~((-1126275447) | i320)) | (~((-310950965) | i))) * (-370)) + (((~((-1126275447) | i)) | (~((-310950965) | i320)) | (-1403633015)) * (-370)) + 346827266);
            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
            int i378 = ((int) j54) & (((((~(1563786695 | iElapsedRealtime3)) | (-1522423259)) * 398) - 543393287) + (((~((~iElapsedRealtime3) | 1563786695)) | (-1522423259)) * 398));
            int i379 = (i377 & i378) | (i377 ^ i378);
            int i380 = -i379;
            int i381 = ((i379 & i380) | (i379 ^ i380)) >> 31;
            int i382 = (~i381) & i;
            int i383 = i381 & ((i & (-91)) | (i320 & 90));
            int i384 = (i383 & i382) | (i382 ^ i383);
            int i385 = ((~i363) & i) | (i363 & i320);
            int i386 = -i385;
            int i387 = ((i385 & i386) | (i385 ^ i386)) >> 31;
            int i388 = i384 & (~i387);
            int i389 = i363 & i387;
            int i390 = (i389 & i388) | (i388 ^ i389);
            int i391 = -(ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr77 = new Object[1];
            c(new char[]{23324, 795, 12377, 40301, 52150, 62939, 17314, 25784, 32161, 38220, 57774, 14490, 3927, 4208, 33114, 17432, 5546, 40714}, new char[]{0, 0, 0, 0}, (char) (((i391 | 54187) << 1) - (i391 ^ 54187)), new char[]{65260, 46151, 44026, 34259}, KeyEvent.getDeadChar(0, 0), objArr77);
            Object[] objArr78 = {(String) objArr77[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb3 = (char) (Color.rgb(0, 0, 0) + 16777216);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 993;
                int scrollBarFadeDuration = 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b26 = (byte) ($$e - 5);
                Object[] objArr79 = new Object[1];
                e(b26, b26, $$d[0], objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb3, packedPositionGroup, scrollBarFadeDuration, 349342683, false, (String) objArr79[0], new Class[]{String.class});
            }
            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr78)).longValue();
            long j55 = 732281866;
            long j56 = (((long) 465) * j55) + (((long) (-463)) * jLongValue9);
            long j57 = 464;
            long j58 = jLongValue9 ^ j33;
            long j59 = (j58 | j55) ^ j33;
            long j60 = j56 + ((((j58 | j38) ^ j33) | j59 | ((j38 | j55) ^ j33)) * j57) + (((long) (-464)) * (j37 | (j55 ^ j33) | j58)) + (j57 * (j59 | ((j55 | j37) ^ j33))) + ((long) (-1579360471));
            int i392 = ~(1985523335 | i);
            int i393 = (~(28928370 | i)) | (-1408888184);
            int i394 = ~((-28338227) | i320);
            int i395 = (((int) (j60 >> 32)) & (((((-1459025500) | i392) * (-658)) - 1437583118) + ((i392 | (-1996422880)) * 658))) | (((int) j60) & (2105257989 + ((i393 | i394) * (-470)) + (((~((-1379959814) | i)) | i394) * 470)));
            int i396 = -i395;
            int i397 = ((i395 & i396) | (i395 ^ i396)) >> 31;
            int i398 = (i397 & (~(i & 100)) & (i | 100)) | ((~i397) & i);
            int i399 = ((~i390) & i) | (i320 & i390);
            int i400 = (i399 | (-i399)) >> 31;
            int i401 = i398 & (~i400);
            int i402 = i390 & i400;
            int i403 = (i401 & i402) | (i401 ^ i402);
            Object[] objArr80 = {new int[]{i}, strArr, new int[1], new int[]{i403}};
            int i404 = (~(i & i403)) & (i | i403);
            int i405 = -i404;
            int i406 = (int) Runtime.getRuntime().totalMemory();
            int i407 = i3 + ((((((-385318751) + (((~(228815431 | i406)) | 571508760) * (-140))) + ((~(800324191 | i406)) * 70)) + (((~(i406 | 579897884)) | 791935067) * 70)) - (~(-(-((((i404 & i405) | (i404 ^ i405)) >> 31) & 16))))) - 1);
            int i408 = i407 << 13;
            int i409 = ((~i407) & i408) | ((~i408) & i407);
            int i410 = i409 >>> 17;
            int i411 = ((~i409) & i410) | ((~i410) & i409);
            int i412 = i411 << 5;
            ((int[]) objArr80[2])[0] = (i411 | i412) & (~(i411 & i412));
            return objArr80;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, int r7, byte r8) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 4
                int r6 = r6 * 2
                int r6 = 1 - r6
                int r7 = 120 - r7
                byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.Companion.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r8]
            L25:
                int r8 = r8 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.Companion.$$g(short, int, byte):java.lang.String");
        }
    }

    public NewPhoneVerificationResetActivity() {
        final NewPhoneVerificationResetActivity newPhoneVerificationResetActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = newPhoneVerificationResetActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityPhoneActivationVerificationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        NewPhoneVerificationResetActivity$bindingInflater$1 newPhoneVerificationResetActivity$bindingInflater$1 = NewPhoneVerificationResetActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return newPhoneVerificationResetActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.d;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final NewPhoneVerificationResetActivity newPhoneVerificationResetActivity = (NewPhoneVerificationResetActivity) objArr[0];
        int i = 2 % 2;
        newPhoneVerificationResetActivity.INotificationSideChannelStub().btnNext.setOnClickListener(new View.OnClickListener() { // from class: getSupportCompoundDrawablesTintList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPhoneVerificationResetActivity.TuitionPaymentFragmentbindingInflater1(this.b, view);
            }
        });
        newPhoneVerificationResetActivity.INotificationSideChannelStub().tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: AppCompatAutoCompleteTextView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPhoneVerificationResetActivity.b(this.b, view);
            }
        });
        int i2 = INotificationSideChannel + 21;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        int i4 = asBinder + 93;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        d_();
        int i4 = INotificationSideChannel + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
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
            int i4 = $11 + 27;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (Process.myTid() >> 22)), ImageFormat.getBitsPerPixel(0) + 1236, 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -653973969, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2763;
                    int scrollBarSize = 14 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b3 = (byte) ($$f & 6);
                    byte b4 = (byte) (b3 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i6, scrollBarSize, 1504416861, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 253 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetBefore = (char) (65200 - TextUtils.getOffsetBefore("", 0));
                    int iIndexOf = 2891 - TextUtils.indexOf("", "", 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 18;
                    byte b5 = (byte) ($$f & 5);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iIndexOf, iLastIndexOf, 2012627446, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asInterface ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) d) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i7 = $11 + 55;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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
    public final void a() {
        int i = 2 % 2;
        NewPhoneVerificationResetActivity newPhoneVerificationResetActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getInterfaceDescriptor.observe(newPhoneVerificationResetActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AlertDialogLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewPhoneVerificationResetActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelDefault.observe(newPhoneVerificationResetActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getSupportBackgroundTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).IconCompatParcelizer.observe(newPhoneVerificationResetActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getCustomSelectionActionModeCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asBinder + 13;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        NewPhoneVerificationResetActivity newPhoneVerificationResetActivity = this;
        Intrinsics.checkNotNullParameter(newPhoneVerificationResetActivity, "");
        newPhoneVerificationResetActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        if (((RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
            INotificationSideChannelStub().tvEnterPhoneNumberInstruction.setText(getString(R.string.label_edit_phone_number_instruction));
            int i4 = asBinder + 9;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        NewPhoneVerificationResetActivity newPhoneVerificationResetActivity = (NewPhoneVerificationResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 83;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = newPhoneVerificationResetActivity.INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = asBinder + 105;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(true);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        NewPhoneVerificationResetActivity newPhoneVerificationResetActivity = (NewPhoneVerificationResetActivity) objArr[0];
        int i = 2 % 2;
        EditText editText = newPhoneVerificationResetActivity.INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string = newPhoneVerificationResetActivity.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(editText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = INotificationSideChannel + 7;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final String INotificationSideChannel() {
        int i = 2 % 2;
        String strReplace$default = StringsKt.replace$default(StringsKt.trim((CharSequence) INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+", "", false, 4, (Object) null);
        String string = StringsKt.trim((CharSequence) INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace$default);
        sb.append(string);
        String string2 = sb.toString();
        int i2 = INotificationSideChannel + 111;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return string2;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onClosePageEvent(UseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        d_();
        int i4 = asBinder + 113;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
        } else {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            int i3 = 18 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = asBinder + 93;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
            Object[] objArr3 = new Object[1];
            c((byte) 52, (short) 141, $$a[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, scrollDefaultDelay, iKeyCodeFromString, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{45830, 21553, Typography.nbsp, 62496}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_via_xl_tunai).substring(19, 20).length() - 1), Process.myPid() >> 22, new char[]{25556, 46009, 15253, 11540, 34146, 58811, 11184, 32174, 29151, 37702, 63004, 57920, 56837, 54084, 18851, 44534, 45743, 29414, 8827, 64363, 5049, 30237}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{46558, 28931, 28300, 64585}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_method_empty).substring(5, 7).length() + 18796), Color.alpha(0) - 1938750539, new char[]{9880, 8740, 8160, 37915, 51769, 18260, 5348, 9921, 40486, 55272, 38058, 10159, 45347, 62342, 392}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
            int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
            Object[] objArr6 = new Object[1];
            c((byte) 52, (short) ($$b | 16), $$a[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, i5, i6, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr7 = new Object[1];
                c(b, (short) (b | 37), bArr[3], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i7, offsetBefore, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr8[3])[0];
            int i9 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1966998587;
            int i11 = (-572666013) + (((~((-121598344) | i10)) | 3145733 | (~(122681826 | i10))) * (-754));
            int i12 = ~((-3145734) | i10);
            int i13 = ~i10;
            int i14 = i11 + ((i12 | (~(125827559 | i13))) * (-754)) + ((i13 | (-121598344)) * 754) + 362491203;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr[2])[0] = i16 ^ (i16 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{29371, 199, 34908, 1327}, (char) (Color.alpha(0) + 12168), KeyEvent.normalizeMetaState(0), new char[]{31610, 24059, 53589, 52385, 62823, 58456, 64545, 4770, 31275, 59549, 13973, 3980, 62392, 3196, 43295, 17399}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{10734, 9491, 16692, 9203}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_mandiri_debit_card_no).substring(22, 23).length() + 62272), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{14103, 26459, 53366, 61895, 17225, 38008, 49813, 32961, 36281, 23547, 53246, 14382, 22011, 28493, 33043, 39980}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {630211890};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46038), 1133 - TextUtils.lastIndexOf("", '0', 0, 0), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 362491203, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int windowTouchSlop2 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i17 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Object[] objArr13 = new Object[1];
                    c((byte) 52, (short) 141, $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, windowTouchSlop2, i17, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45992), 1117 - TextUtils.getCapsMode("", 0, 0), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Boolean.TYPE});
                }
                Object[] objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iMyPid = 1031 - (Process.myPid() >> 22);
                    int i18 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    Object[] objArr15 = new Object[1];
                    c(b2, (short) (b2 | 37), bArr2[3], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, iMyPid, i18, 632103528, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{45830, 21553, Typography.nbsp, 62496}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, new char[]{25556, 46009, 15253, 11540, 34146, 58811, 11184, 32174, 29151, 37702, 63004, 57920, 56837, 54084, 18851, 44534, 45743, 29414, 8827, 64363, 5049, 30237}, objArr16);
                    Class<?> cls3 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{46558, 28931, 28300, 64585}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_atm_bersama).substring(1, 2).codePointAt(0) + 18693), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_failed).substring(53, 55).length() - 1938750541, new char[]{9880, 8740, 8160, 37915, 51769, 18260, 5348, 9921, 40486, 55272, 38058, 10159, 45347, 62342, 392}, objArr17);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, (short) ($$b | 16), $$a[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, maximumDrawingCacheSize, iResolveSize, 1344079056, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
                        int scrollDefaultDelay2 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, (short) 141, $$a[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize2, iNormalizeMetaState, scrollDefaultDelay2, 1357589585, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr14;
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt();
            int i22 = i19 + (((~((-430199522) | iNextInt)) | 151274081) * (-283)) + 105172132 + ((~(iNextInt | (-278925441))) * 283);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[2])[0] = i24 ^ (i24 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char pressedStateDuration2 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                byte b3 = (byte) 37;
                Object[] objArr21 = new Object[1];
                c(b3, b3, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(pressedStateDuration2, iArgb, iCombineMeasuredStates, 986134021, false, (String) objArr21[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i25 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i26 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                    Object[] objArr22 = new Object[1];
                    c((byte) 52, (short) ($$b | 16), $$a[7], objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(modifierMetaStateMask, i25, i26, 1599039318, false, (String) objArr22[0], null);
                }
                Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i27 = ~elapsedCpuTime;
                int i28 = ((((-144688828) + (((~((-525241728) | i27)) | (~(312639301 | i27))) * (-867))) + ((((~((-525241728) | elapsedCpuTime)) | 223117370) | (~(312639301 | elapsedCpuTime))) * (-1734))) + (((~(elapsedCpuTime | 535756671)) | ((~(i27 | (-223117371))) | (~((-302124358) | elapsedCpuTime)))) * 867)) - 614810037;
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr2[3])[0] = i30 ^ (i30 << 5);
                int i31 = INotificationSideChannel + 77;
                asBinder = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 3 % 2;
                }
            } else {
                Object[] objArr24 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{29371, 199, 34908, 1327}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_1).substring(5, 6).codePointAt(0) + 12136), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_100_point).substring(0, 13).length() - 13, new char[]{31610, 24059, 53589, 52385, 62823, 58456, 64545, 4770, 31275, 59549, 13973, 3980, 62392, 3196, 43295, 17399}, objArr24);
                Class<?> cls4 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{10734, 9491, 16692, 9203}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step1).substring(3, 4).length() + 62272), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{14103, 26459, 53366, 61895, 17225, 38008, 49813, 32961, 36281, 23547, 53246, 14382, 22011, 28493, 33043, 39980}, objArr25);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr26 = {630211890};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42049), 1725 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -614810037);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char pressedStateDuration3 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                    int size2 = View.MeasureSpec.getSize(0) + 23;
                    Object[] objArr27 = new Object[1];
                    c((byte) 52, (short) ($$b | 16), $$a[7], objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(pressedStateDuration3, packedPositionType, size2, 1599039318, false, (String) objArr27[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    Object[] objArr28 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{45830, 21553, Typography.nbsp, 62496}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.installment_required).substring(16, 18).length() - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{25556, 46009, 15253, 11540, 34146, 58811, 11184, 32174, 29151, 37702, 63004, 57920, 56837, 54084, 18851, 44534, 45743, 29414, 8827, 64363, 5049, 30237}, objArr28);
                    Class<?> cls5 = Class.forName((String) objArr28[0]);
                    Object[] objArr29 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{46558, 28931, 28300, 64585}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_start_failed).substring(0, 30).codePointAt(13) + 18686), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step2).substring(227, 231).length() - 1938750543, new char[]{9880, 8740, 8160, 37915, 51769, 18260, 5348, 9921, 40486, 55272, 38058, 10159, 45347, 62342, 392}, objArr29);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i33 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                        short s = $$a[7];
                        Object[] objArr30 = new Object[1];
                        c((byte) 52, s, (byte) s, objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, i33, windowTouchSlop3, 1596667560, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                        int touchSlop = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b4 = (byte) 37;
                        Object[] objArr31 = new Object[1];
                        c(b4, b4, $$a[7], objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionGroup, iIndexOf, touchSlop, 986134021, false, (String) objArr31[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                    objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr2[4];
                if (strArr3 == null) {
                    throw null;
                }
                int i34 = INotificationSideChannel + 83;
                asBinder = i34 % 128;
                for (int i35 = i34 % 2 == 0 ? 0 : 1; i35 < strArr3.length; i35++) {
                    int i36 = INotificationSideChannel + 77;
                    asBinder = i36 % 128;
                    int i37 = i36 % 2;
                    arrayList.add(strArr3[i35]);
                }
                throw null;
            }
            int i38 = INotificationSideChannel + 73;
            asBinder = i38 % 128;
            int i39 = i38 % 2;
            int i40 = ((int[]) objArr2[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
            int iMyPid2 = Process.myPid();
            int i41 = ~iMyPid2;
            int i42 = i40 + 1976095397 + ((iMyPid2 | 704783888) * 988) + (((~(986068500 | i41)) | (-1054750687)) * (-1976)) + (((~(iMyPid2 | 773466074)) | 704783888 | (~((-773466075) | i41))) * 988);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr32[3])[0] = i44 ^ (i44 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i45 = asBinder + 123;
        while (true) {
            INotificationSideChannel = i45 % 128;
            int i46 = i45 % 2;
            if (i4 >= strArr4.length) {
                throw null;
            }
            arrayList2.add(strArr4[i4]);
            i4++;
            i45 = asBinder + 109;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00b3  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = ~i4;
            if (i3 != (-2068324743) + (((~((-388073522) | i5)) | (~((-195) | i4)) | (~(1606134779 | i4))) * 765) + (((~((-388073716) | i5)) | 388073521) * 1530) + (((~(i4 | (-388073716))) | (~(i5 | 1606134779))) * 765)) {
                int i6 = asBinder + 113;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                int[] iArr = new int[1445987543];
                iArr[1445987542] = 1;
                int i8 = (-293115974) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i9 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i11 = ~i10;
            int i12 = (-1829464504) + (((~((-612955852) | i11)) | 545809993 | (~(1442943394 | i11)) | (~((-1375797537) | i10))) * (-84));
            int i13 = (~(i10 | 1442943394)) | 612955851;
            int i14 = ~(i11 | (-1442943395));
            if (i9 != i12 + ((i13 | i14) * (-84)) + ((1375797536 | i14) * 84)) {
                int i15 = asBinder + 113;
                INotificationSideChannel = i15 % 128;
                int i16 = i15 % 2;
                int[] iArr2 = new int[1445987543];
                iArr2[1445987542] = 1;
                int i17 = (-293115974) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i18 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i20 = ~i19;
        int i21 = (~((-1763486439) | i20)) | 538741350;
        int i22 = ~(i19 | 2040314614);
        if (i18 != ((i21 | i22) * (-252)) + 902922692 + ((i22 | (~(i20 | (-1224745089)))) * 252)) {
            int i23 = (-353168058) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i24 = INotificationSideChannel + 29;
        asBinder = i24 % 128;
        int i25 = i24 % 2;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationResetActivity.getIntent().getParcelableExtra("unregistered_data");
        int i4 = INotificationSideChannel + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return registrationForUnregistered;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity, CodeNamePair codeNamePair) {
        int i;
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        newPhoneVerificationResetActivity.b = codeNamePair;
        TextView textView = newPhoneVerificationResetActivity.INotificationSideChannelStub().tvPhoneExample;
        if (Intrinsics.areEqual(codeNamePair.b, "+62")) {
            int i5 = INotificationSideChannel;
            int i6 = i5 + 101;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 81;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        newPhoneVerificationResetActivity.INotificationSideChannelStub().tvPrefix.setText(codeNamePair.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact() {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 19;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 24 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 17;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                newPhoneVerificationResetActivity.IconCompatParcelizer();
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (registrationForUnregistered != null) {
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationResetActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                    NewRegistrationActivationVerifyPhoneOtpActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewRegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
                    NewRegistrationActivationVerifyPhoneOtpActivity.Companion.b(newPhoneVerificationResetActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    newPhoneVerificationResetActivity.d_();
                    i = INotificationSideChannel + 61;
                    asBinder = i % 128;
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newPhoneVerificationResetActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string2 = newPhoneVerificationResetActivity.getString(R.string.error_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string3 = newPhoneVerificationResetActivity.getString(R.string.title_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = newPhoneVerificationResetActivity.getString(R.string.message_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = newPhoneVerificationResetActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: forceUniformWidth
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewPhoneVerificationResetActivity.onTransact();
                        }
                    }, 96);
                    FragmentManager supportFragmentManager = newPhoneVerificationResetActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationResetActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                }
            }
            return Unit.INSTANCE;
        }
        newPhoneVerificationResetActivity.MediaBrowserCompat();
        i = asBinder + 81;
        INotificationSideChannel = i % 128;
        int i3 = i % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    /* JADX WARN: Code duplicated, block: B:8:0x0059 A[Catch: all -> 0x015f, TryCatch #0 {all -> 0x015f, blocks: (B:3:0x0008, B:6:0x0046, B:39:0x0146, B:40:0x015b, B:8:0x0059, B:12:0x0064, B:14:0x0073, B:20:0x0084, B:22:0x0093, B:24:0x00a8, B:25:0x00cf, B:28:0x00e5, B:30:0x00ef, B:31:0x00f1, B:33:0x00f5, B:35:0x0100, B:36:0x0133), top: B:45:0x0008 }] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity, View view) {
        int length;
        String str;
        int i;
        int i2 = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String string = StringsKt.trim((CharSequence) newPhoneVerificationResetActivity.INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
            if (Intrinsics.areEqual(StringsKt.trim((CharSequence) newPhoneVerificationResetActivity.INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+62")) {
                Intrinsics.checkNotNullParameter(string, "");
                if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                    length = string.length();
                    if (4 <= length || length >= 16) {
                        String string2 = newPhoneVerificationResetActivity.getString(R.string.error_format_phone_number);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                    } else {
                        String strINotificationSideChannel = newPhoneVerificationResetActivity.INotificationSideChannel();
                        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        if (registeredMemberRegistration != null) {
                            str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                            int i3 = INotificationSideChannel + 15;
                            asBinder = i3 % 128;
                            int i4 = i3 % 2;
                        } else {
                            str = null;
                        }
                        PhoneVerificationRequest phoneVerificationRequest = new PhoneVerificationRequest(strINotificationSideChannel, str != null ? str : "");
                        if (((RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                            Intrinsics.checkNotNull(registrationForUnregistered);
                            if (Intrinsics.areEqual(registrationForUnregistered.IconCompatParcelizer, "cross_selling")) {
                                String strINotificationSideChannel2 = newPhoneVerificationResetActivity.INotificationSideChannel();
                                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                                Intrinsics.checkNotNull(registrationForUnregistered2);
                                ((setSplitTrack) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PhoneVerificationRequestAuth(strINotificationSideChannel2, String.valueOf(registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                            } else {
                                ((setSplitTrack) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(phoneVerificationRequest);
                                i = INotificationSideChannel + 109;
                                asBinder = i % 128;
                                int i5 = i % 2;
                            }
                        } else {
                            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            if ((registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.PMI) {
                                RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                                if (registeredMemberRegistration3 != null) {
                                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, newPhoneVerificationResetActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388351);
                                    RegistrationPasswordActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationPasswordActivity.INSTANCE;
                                    RegistrationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationResetActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                            } else {
                                ((setSplitTrack) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(phoneVerificationRequest);
                                i = INotificationSideChannel + 105;
                                asBinder = i % 128;
                                int i6 = i % 2;
                            }
                        }
                    }
                } else {
                    String string3 = newPhoneVerificationResetActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
                }
            } else {
                length = string.length();
                if (4 <= length) {
                    String string4 = newPhoneVerificationResetActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
                } else {
                    String string5 = newPhoneVerificationResetActivity.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration b(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationResetActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = asBinder + 11;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ void b(final NewPhoneVerificationResetActivity newPhoneVerificationResetActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newPhoneVerificationResetActivity.b, new Function1() { // from class: setChildFrame
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewPhoneVerificationResetActivity.TuitionPaymentFragmentbindingInflater1(this.b, (CodeNamePair) obj);
                }
            });
            FragmentManager supportFragmentManager = newPhoneVerificationResetActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = asBinder + 97;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 == 0) {
                    getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(supportFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i3 = asBinder + 41;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asBinder + 71;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 == 0) {
                newPhoneVerificationResetActivity.MediaBrowserCompat();
                throw null;
            }
            newPhoneVerificationResetActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = asBinder + 27;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 == 0) {
                newPhoneVerificationResetActivity.IconCompatParcelizer();
                throw null;
            }
            newPhoneVerificationResetActivity.IconCompatParcelizer();
            if (((RegisteredMemberRegistration) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, newPhoneVerificationResetActivity.INotificationSideChannel(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159);
                NewRegistrationActivationVerifyPhoneOtpActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewRegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
                NewRegistrationActivationVerifyPhoneOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationResetActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            if (((RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                int i4 = asBinder + 13;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (registrationForUnregistered != null) {
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationResetActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                    NewRegistrationActivationVerifyPhoneOtpActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewRegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
                    NewRegistrationActivationVerifyPhoneOtpActivity.Companion.b(newPhoneVerificationResetActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newPhoneVerificationResetActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string2 = newPhoneVerificationResetActivity.getString(R.string.error_phone_number_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string3 = newPhoneVerificationResetActivity.getString(R.string.title_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = newPhoneVerificationResetActivity.getString(R.string.message_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = newPhoneVerificationResetActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: resolveMinimumHeight
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewPhoneVerificationResetActivity.g();
                    }
                }, 96);
                FragmentManager supportFragmentManager = newPhoneVerificationResetActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newPhoneVerificationResetActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i6 = INotificationSideChannel + 23;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = INotificationSideChannel + 123;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewPhoneVerificationResetActivity newPhoneVerificationResetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newPhoneVerificationResetActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = INotificationSideChannel + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            newPhoneVerificationResetActivity.IconCompatParcelizer();
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newPhoneVerificationResetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (registrationForUnregistered != null) {
                RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, newPhoneVerificationResetActivity.INotificationSideChannel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, false, false, 15728637);
                NewRegistrationActivationVerifyPhoneOtpActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewRegistrationActivationVerifyPhoneOtpActivity.INSTANCE;
                NewRegistrationActivationVerifyPhoneOtpActivity.Companion.b(newPhoneVerificationResetActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                newPhoneVerificationResetActivity.d_();
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i4 = INotificationSideChannel + 35;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                newPhoneVerificationResetActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            } else {
                newPhoneVerificationResetActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    static {
        notify = 1;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = cancel + 125;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 499836870, -2056225836, 2056225838, new Object[]{this}, zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() throws IllegalAccessException {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_copy).substring(17, 27).codePointAt(9) - 47226663;
        b(zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2055658950, 2055658954, new Object[]{this}, zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iCodePointAt, zzbpk.b());
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1255405801, 1255405804, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iCodePointAt = (-1029322208) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8);
        b((-72393257) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step2).substring(0, 5).length(), 1957716061, -1957716060, new Object[]{this, bundle}, zzbpk.b(), iCodePointAt, zzbpk.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iB = zzbpk.b();
        int iB2 = zzbpk.b();
        int iB3 = zzbpk.b();
        b(zag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 659370240, -659370240, new Object[]{this}, iB2, iB, iB3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    static void cancelAll() {
        asInterface = -6377398940819159759L;
        g = -981105359;
        d = (char) 33968;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.$$c
            int r6 = r6 + 102
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewPhoneVerificationResetActivity.$$i(byte, byte, short):java.lang.String");
    }
}
