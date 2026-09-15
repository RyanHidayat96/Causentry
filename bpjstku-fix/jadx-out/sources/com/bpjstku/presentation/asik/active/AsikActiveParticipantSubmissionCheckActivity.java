package com.bpjstku.presentation.asik.active;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.ActivityAsikActiveParticipantSubmissionCheckBinding;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.IntegerRes;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.AbstractMap$values$1$iterator$1;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0011R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0016\u0010\b\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/asik/active/AsikActiveParticipantSubmissionCheckActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikActiveParticipantSubmissionCheckBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lselect;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/lang/String;", "LIntegerRes;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "d", "", "()I", "LgetStringOrNull;", "LgetStringOrNull;", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikActiveParticipantSubmissionCheckActivity extends BindingBaseActivity<ActivityAsikActiveParticipantSubmissionCheckBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static long cancelAll;
    private static char[] g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private getStringOrNull asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl g;
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, -44, 103, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 79;
    private static int notify = 0;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: onCreateActionMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AsikActiveParticipantSubmissionCheckActivity.b(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String a = "";

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i6);
        int i11 = (~i6) | i7;
        int i12 = i10 | (~(i11 | i2));
        int i13 = (~(i6 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i5));
        int i15 = i5 + i2 + i + (783392123 * i3) + ((-786872706) * i4);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i5) + 1729888256 + (218870266 * i2) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i) + ((-1731985408) * i3) + ((-471334912) * i4) + ((-600899584) * i16);
        int i18 = (i5 * 375823119) + 1642083618 + (i2 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i * 375824245) + (i3 * (-117547465)) + (i4 * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        if (i19 != 1) {
            return i19 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity.$$a
            int r6 = r6 + 4
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity.c(int, short, int, java.lang.Object[]):void");
    }

    public AsikActiveParticipantSubmissionCheckActivity() {
        final AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = asikActiveParticipantSubmissionCheckActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = asikActiveParticipantSubmissionCheckActivity;
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
        final AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = asikActiveParticipantSubmissionCheckActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/asik/active/AsikActiveParticipantSubmissionCheckActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) AsikActiveParticipantSubmissionCheckActivity.class);
            intent.putExtra("key_id_pointer", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikActiveParticipantSubmissionCheckBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        AsikActiveParticipantSubmissionCheckActivity$bindingInflater$1 asikActiveParticipantSubmissionCheckActivity$bindingInflater$1 = AsikActiveParticipantSubmissionCheckActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = INotificationSideChannel + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return asikActiveParticipantSubmissionCheckActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        String stringExtra;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            int i4 = INotificationSideChannel + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = intent.getStringExtra("key_id_pointer");
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        this.a = stringExtra;
        int i6 = onTransact + 7;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x036a  */
    /* JADX WARN: Code duplicated, block: B:73:0x036b  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 123;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(g[i << i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2187;
                        int scrollDefaultDelay = 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b2 = (byte) ($$f & 14);
                        byte b3 = (byte) (b2 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, i6, scrollDefaultDelay, 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(cancelAll), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 3011 - View.resolveSize(0, 0), 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 36505);
                        int iAlpha = Color.alpha(0) + 3376;
                        int iIndexOf = 17 - TextUtils.indexOf("", "");
                        byte b6 = (byte) ($$f & 5);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iAlpha, iIndexOf, -968507904, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(g[i + i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2187;
                        int iAlpha2 = 40 - Color.alpha(0);
                        byte b8 = (byte) ($$f & 14);
                        byte b9 = (byte) (b8 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i8, iAlpha2, 841711447, false, $$i(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(cancelAll), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33017), 3011 - Color.blue(0), AndroidCharacter.getMirror('0') - 22, 321985076, false, $$i(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36505);
                            int scrollBarSize = 3376 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int iIndexOf2 = 17 - TextUtils.indexOf("", "", 0);
                            byte b12 = (byte) ($$f & 5);
                            byte b13 = (byte) (b12 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, scrollBarSize, iIndexOf2, -968507904, false, $$i(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $11 + 101;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char c4 = (char) (36506 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iRgb = Color.rgb(0, 0, 0) + 16780592;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 17;
                    byte b14 = (byte) ($$f & 5);
                    byte b15 = (byte) (b14 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c4, iRgb, jumpTapTimeout, -968507904, false, $$i(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char maximumDrawingCacheSize = (char) (36505 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i10 = 3377 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iIndexOf3 = 16 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte b16 = (byte) ($$f & 5);
                byte b17 = (byte) (b16 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, i10, iIndexOf3, -968507904, false, $$i(b16, b17, b17), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class b implements lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b {
        b() {
        }

        @Override // lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity = this;
        ((select) this.TuitionPaymentFragmentbindingInflater1.getValue()).onTransact.observe(asikActiveParticipantSubmissionCheckActivity, new Observer() { // from class: onPrepareActionMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AsikActiveParticipantSubmissionCheckActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(asikActiveParticipantSubmissionCheckActivity, new Observer() { // from class: onDestroyActionMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj};
                AsikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 1249486169, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1249486168, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), objArr);
            }
        });
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).read.observe(asikActiveParticipantSubmissionCheckActivity, new Observer() { // from class: AppCompatDelegateImplApi24Impl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.b, (VirtualCameraAdapter1) obj};
                AsikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 2101950799, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -2101950797, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), objArr);
            }
        });
        int i2 = onTransact + 77;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 99;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b();
            throw null;
        }
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b();
        int i3 = INotificationSideChannel + 19;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity = this;
        Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity, "");
        asikActiveParticipantSubmissionCheckActivity.getWindow().addFlags(8192);
        ((ActivityAsikActiveParticipantSubmissionCheckBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_asik_program));
        int i4 = INotificationSideChannel + 11;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikActiveParticipantActivity.INSTANCE;
            AsikActiveParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikActiveParticipantSubmissionCheckActivity.this);
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class asInterface implements getStringOrNull.b {
        asInterface() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class a implements getStringOrNull.b {
        a() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class asBinder implements getStringOrNull.b {
        asBinder() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class INotificationSideChannel implements getStringOrNull.b {
        INotificationSideChannel() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class cancel implements getStringOrNull.b {
        cancel() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class cancelAll implements getStringOrNull.b {
        cancelAll() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class onTransact implements getStringOrNull.b {
        onTransact() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class notify implements getStringOrNull.b {
        notify() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class d implements getStringOrNull.b {
        d() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    public static final class g implements getStringOrNull.b {
        g() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AsikActiveParticipantSubmissionCheckActivity.this.d_();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        INotificationSideChannel = i2 % 128;
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
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = INotificationSideChannel + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iIndexOf = 15 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            short s = bArr[5];
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s & 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, maximumDrawingCacheSize, iIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_6).substring(7, 8).codePointAt(0) - 10, (char) (28129 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 77, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step4).substring(26, 27).length() + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_installment).substring(12, 13).codePointAt(0) + 46840), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int i3 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i4 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            short s2 = (short) 51;
            Object[] objArr5 = new Object[1];
            c(s2, (byte) (s2 + 1), $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, i3, i4, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iArgb = 15 - Color.argb(0, 0, 0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[2], bArr2[7], bArr2[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, scrollDefaultDelay, iArgb, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyPid = Process.myPid();
            int i7 = ((513692534 + (((~((-580947969) | iMyPid)) | (~((-336667799) | iMyPid))) * 69)) + (((~(iMyPid | (-471148256))) | ((~((-715428426) | iMyPid)) | 134480457)) * (-69))) - 385494768;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            int i10 = onTransact + 31;
            INotificationSideChannel = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 4;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e((Process.myPid() >> 22) + 37, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).codePointAt(3) - 95, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_delete).substring(1, 2).length() - 1), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {845474679};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getTouchSlop() >> 8)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1133, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -805299344, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr3 = $$a;
                    short s3 = bArr3[5];
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 & 52), bArr3[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, iIndexOf2, i12, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45994), (ViewConfiguration.getTapTimeout() >> 16) + 1117, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr4[2], bArr4[7], bArr4[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, modifierMetaStateMask, maximumFlingVelocity, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 28119), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, MotionEvent.axisFromString("") + 16, (char) (46949 - TextUtils.lastIndexOf("", '0', 0)), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                        int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                        short s4 = (short) 51;
                        Object[] objArr16 = new Object[1];
                        c(s4, (byte) (s4 + 1), $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i13, i14, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cBlue = (char) Color.blue(0);
                        int keyRepeatDelay2 = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                        byte[] bArr5 = $$a;
                        short s5 = bArr5[5];
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 & 52), bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, keyRepeatDelay2, iLastIndexOf, 1357589585, false, (String) objArr17[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i17 = onTransact + 113;
        INotificationSideChannel = i17 % 128;
        int i18 = i17 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i23 = i19 + (-1111539135) + (((~(916159457 | i22)) | 134479894 | (~((-671879288) | i22))) * (-744)) + (((~i22) | 378760064) * 744) + ((i22 | (-134479895)) * 744);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        int i26 = INotificationSideChannel + 47;
        onTransact = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int defaultSize = 1755 - View.getDefaultSize(0, 0);
            int i28 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            byte[] bArr6 = $$a;
            short s6 = bArr6[2];
            Object[] objArr19 = new Object[1];
            c(s6, (byte) (s6 & 189), bArr6[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, defaultSize, i28, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                int i29 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                short s7 = (short) 51;
                Object[] objArr20 = new Object[1];
                c(s7, (byte) (s7 + 1), $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iResolveSizeAndState, i29, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i30 = ((int[]) objArr21[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i30}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode;
            int i32 = 1564589538 + ((206483407 | i31) * (-757)) + ((~((-1134625) | iIdentityHashCode)) * 1514) + (((~(iIdentityHashCode | 207618031)) | (~(i31 | (-6119019))) | 4984394) * 757) + 1176254959;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52, 16 - TextUtils.getOffsetAfter("", 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_license_key_not_found).substring(0, 21).length() - 21), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {845474679};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16778942, 28 - TextUtils.lastIndexOf("", '0', 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1176254959, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAlpha2 = (char) (Color.alpha(0) + 29944);
                int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                short s8 = (short) 51;
                Object[] objArr25 = new Object[1];
                c(s8, (byte) (s8 + 1), $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAlpha2, packedPositionChild, iIndexOf3, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step1).substring(28, 30).length() - 2, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step5).substring(1, 7).length() + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.saved_card).substring(7, 9).codePointAt(0) + 28033), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, 15 - View.MeasureSpec.getSize(0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 46914), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                    int fadingEdgeLength2 = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i35 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr28 = new Object[1];
                    c((short) 140, (byte) 52, $$a[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, fadingEdgeLength2, i35, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatDelay3 = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int iRed = 1755 - Color.red(0);
                    int i36 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                    byte[] bArr7 = $$a;
                    short s9 = bArr7[2];
                    Object[] objArr29 = new Object[1];
                    c(s9, (byte) (s9 & 189), bArr7[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatDelay3, iRed, i36, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$7879113[0])[0] != ((int[]) objArrB$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                arrayList2.add(strArr4[i2]);
                i2++;
            }
            throw null;
        }
        int i37 = onTransact + 21;
        INotificationSideChannel = i37 % 128;
        int i38 = i37 % 2;
        int i39 = ((int[]) objArrB$7879113[3])[0];
        int i40 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr30 = {new int[]{i40}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i41 = ~iIdentityHashCode2;
        int i42 = 1297633081 + (((~(166666387 | i41)) | 34655524) * (-1188));
        int i43 = (~(iIdentityHashCode2 | (-166666388))) | 34655524;
        int i44 = ~(45936038 | i41);
        int i45 = i39 + i42 + ((i43 | i44) * 594) + (((~((-166666388) | i41)) | 155385873 | i44) * 594);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr30[3])[0] = i47 ^ (i47 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iNextInt = new Random().nextInt(1590941946);
        if (i4 != (-410628888) + (((~(1846870188 | iNextInt)) | 277374289) * 104) + ((~((~iNextInt) | (-1107361833))) * (-104)) + ((iNextInt | 1016882645) * 104)) {
            throw null;
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        if (i5 != (-1650753365) + (((~(i6 | 1780426629)) | (-798629336)) * (-465)) + ((1780426629 | (~((-798629336) | i6))) * 930) + ((i6 | (-92280915)) * 465)) {
            throw new RuntimeException("1076744173");
        }
        super.onResume();
        int i7 = INotificationSideChannel + 55;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity = (AsikActiveParticipantSubmissionCheckActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 17;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~startElapsedRealtime;
        if (i4 != 758804828 + (((~((-1058130159) | i5)) | 1888117701) * (-865)) + ((~(startElapsedRealtime | 1058130158)) * 865) + (((~(1888117701 | i5)) | (~(i5 | 1058130158))) * 865)) {
            int[] iArr = new int[2139677837];
            iArr[2139677836] = 1;
            int i6 = 139628828 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i8 = ~iNextInt;
        if (i7 != 1794824956 + ((~(799374783 | i8)) * (-560)) + ((~(iNextInt | (-1074954753))) * (-560)) + (((~(1779681181 | i8)) | 94648354) * 560)) {
            throw null;
        }
        super.onStart();
        int i9 = onTransact + 93;
        INotificationSideChannel = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i6 = ~i5;
        if (i4 != (-2044012507) + (((~((-427331392) | i6)) | (-1257318935)) * (-602)) + (((~(i5 | (-427331392))) | 285771049 | (~((-1115758593) | i6))) * (-301)) + ((~(i6 | (-1257318935))) * 301)) {
            throw null;
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_payment).substring(1, 7).length() - 360012773;
        if (i7 != (-410867496) + (((~((-2063732583) | length)) | 268567618) * (-140)) + ((~((-1795164965) | length)) * 70) + (((~(length | 347821251)) | (-1874418598)) * 70)) {
            throw new RuntimeException("-477642395");
        }
        super.onCreate(bundle);
        int i8 = INotificationSideChannel + 121;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 119;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            asikActiveParticipantSubmissionCheckActivity.d_();
            unit = Unit.INSTANCE;
            int i3 = 23 / 0;
        } else {
            asikActiveParticipantSubmissionCheckActivity.d_();
            unit = Unit.INSTANCE;
        }
        int i4 = INotificationSideChannel + 107;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ User b(AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) asikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = onTransact + 113;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return userAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ void b(final AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_eligible_result", "loading_check_eligible_result"));
            Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity, "");
            Intrinsics.checkNotNullParameter("loading_check_eligible_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("loading_check_eligible_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_check_eligible_result", mapMutableMapOf);
            asikActiveParticipantSubmissionCheckActivity.MediaBrowserCompat();
            return;
        }
        Object obj = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                return;
            }
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_check_eligible_result", "failure_check_eligible_result"));
            Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity, "");
            Intrinsics.checkNotNullParameter("failure_check_eligible_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("failure_check_eligible_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_check_eligible_result", mapMutableMapOf2);
            asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "layanan ini tersedia pada pukul", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "fitur ini sedang dalam peningkatan kapasitas", false, 2, (Object) null)) {
                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion companion = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
                String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string, "");
                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentbindingInflater1(strValueOf, string);
                asikActiveParticipantSubmissionCheckActivity.g = lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1;
                FragmentManager supportFragmentManager = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl = asikActiveParticipantSubmissionCheckActivity.g;
                if (lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl != null) {
                    lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.a = asikActiveParticipantSubmissionCheckActivity.new b();
                    return;
                }
                return;
            }
            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
            String string2 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.label_asik_program);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string3 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string2, strValueOf2, string3, null, 112);
            asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB;
            if (getstringornullB != null) {
                int i2 = onTransact + 77;
                INotificationSideChannel = i2 % 128;
                int i3 = i2 % 2;
                FragmentManager supportFragmentManager2 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                if (supportFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            getStringOrNull getstringornull = asikActiveParticipantSubmissionCheckActivity.asBinder;
            if (getstringornull != null) {
                getstringornull.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new TuitionPaymentFragmentbindingInflater1();
                return;
            }
            return;
        }
        AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity2 = asikActiveParticipantSubmissionCheckActivity;
        Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_check_eligible_result", "success_check_eligible_result"));
        Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
        Intrinsics.checkNotNullParameter("success_check_eligible_result", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("success_check_eligible_result", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_check_eligible_result", mapMutableMapOf3);
        asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        List listSplit$default = StringsKt.split$default((CharSequence) ((SubmissionCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g, new String[]{"#"}, false, 0, 6, (Object) null);
        if (Intrinsics.areEqual(listSplit$default.get(0), ((SubmissionCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            String str = (String) listSplit$default.get(1);
            String str2 = asikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            if (str.equals(str2)) {
                String str3 = (String) listSplit$default.get(0);
                SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                asikActiveParticipantSubmissionCheckActivity.MediaBrowserCompat();
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                final String strRun = getMaxImages.run();
                if (str3.equals("JHTA000")) {
                    Map<String, Object> mapMutableMapOf4 = MapsKt.mutableMapOf(new Pair("params_asik_eligible_participant", "asik_eligible_participant"));
                    Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                    Intrinsics.checkNotNullParameter("asik_eligible_participant", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
                    TargetAspectRatio targetAspectRatio4 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("asik_eligible_participant", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_eligible_participant", mapMutableMapOf4);
                    asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                    getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                    String string4 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.label_asik_program);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.title_asik_eligible);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    String string6 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_ok_continue);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_document_success, string4, string5, string6, null, 112);
                    asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB2;
                    if (getstringornullB2 != null) {
                        FragmentManager supportFragmentManager3 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
                        if (supportFragmentManager3.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB2.show(supportFragmentManager3, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    getStringOrNull getstringornull2 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                    if (getstringornull2 != null) {
                        getstringornull2.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return;
                    }
                    return;
                }
                Map<String, Object> mapMutableMapOf5 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_participant", "asik_ineligible_participant"));
                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                Intrinsics.checkNotNullParameter("asik_ineligible_participant", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf5, "");
                TargetAspectRatio targetAspectRatio5 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("asik_ineligible_participant", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf5, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_participant", mapMutableMapOf5);
                if (!str3.equals("JHTA009")) {
                    int i4 = onTransact + 25;
                    INotificationSideChannel = i4 % 128;
                    int i5 = i4 % 2;
                    if (!str3.equals("JHTA010") && !str3.equals("JHTA011") && !str3.equals("JHTA012")) {
                        int i6 = onTransact + 29;
                        INotificationSideChannel = i6 % 128;
                        int i7 = i6 % 2;
                        if (!str3.equals("JHTA015")) {
                            if (str3.equals("JHTA004")) {
                                Map<String, Object> mapMutableMapOf6 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_claimed_on_process", "asik_ineligible_caused_claimed_on_process"));
                                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_claimed_on_process", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf6, "");
                                TargetAspectRatio targetAspectRatio6 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_claimed_on_process", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf6, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_claimed_on_process", mapMutableMapOf6);
                                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                getStringOrNull.Companion companion4 = getStringOrNull.INSTANCE;
                                String string7 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string7, "");
                                String strConcat = "Pengkinian data tidak dapat dilanjutkan pada aplikasi JMO, dikarenakan masih dalam proses klaim JHT di ".concat(String.valueOf(submissionCheckItem.b));
                                String string8 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string8, "");
                                getStringOrNull getstringornullB3 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string7, strConcat, string8, null, 112);
                                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB3;
                                if (getstringornullB3 != null) {
                                    FragmentManager supportFragmentManager4 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                                    Intrinsics.checkNotNullParameter(supportFragmentManager4, "");
                                    if (supportFragmentManager4.findFragmentByTag(getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        getstringornullB3.show(supportFragmentManager4, getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                getStringOrNull getstringornull3 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                if (getstringornull3 != null) {
                                    getstringornull3.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new a();
                                    return;
                                }
                                return;
                            }
                            if (str3.equals("JHTA006")) {
                                Map<String, Object> mapMutableMapOf7 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_kpj_not_found", "asik_ineligible_caused_kpj_not_found"));
                                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_kpj_not_found", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf7, "");
                                TargetAspectRatio targetAspectRatio7 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_kpj_not_found", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf7, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_kpj_not_found", mapMutableMapOf7);
                                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                getStringOrNull.Companion companion5 = getStringOrNull.INSTANCE;
                                String string9 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string9, "");
                                String string10 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string10, "");
                                getStringOrNull getstringornullB4 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string9, "Data KPJ tidak ditemukan", string10, null, 112);
                                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB4;
                                if (getstringornullB4 != null) {
                                    FragmentManager supportFragmentManager5 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "");
                                    Intrinsics.checkNotNullParameter(supportFragmentManager5, "");
                                    if (supportFragmentManager5.findFragmentByTag(getstringornullB4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        int i8 = onTransact + 103;
                                        INotificationSideChannel = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            getstringornullB4.show(supportFragmentManager5, getstringornullB4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        getstringornullB4.show(supportFragmentManager5, getstringornullB4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                getStringOrNull getstringornull4 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                if (getstringornull4 != null) {
                                    getstringornull4.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new asBinder();
                                    return;
                                }
                                return;
                            }
                            if (str3.equals("JHTA014")) {
                                Map<String, Object> mapMutableMapOf8 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_has_done_asik_before", "asik_ineligible_caused_has_done_asik_before"));
                                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_has_done_asik_before", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf8, "");
                                TargetAspectRatio targetAspectRatio8 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_has_done_asik_before", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf8, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_has_done_asik_before", mapMutableMapOf8);
                                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                getStringOrNull.Companion companion6 = getStringOrNull.INSTANCE;
                                String string11 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.title_asik_submission);
                                Intrinsics.checkNotNullExpressionValue(string11, "");
                                String string12 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.title_already_asik_eligible);
                                Intrinsics.checkNotNullExpressionValue(string12, "");
                                String string13 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string13, "");
                                getStringOrNull getstringornullB5 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string11, string12, string13, null, 112);
                                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB5;
                                if (getstringornullB5 != null) {
                                    FragmentManager supportFragmentManager6 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager6, "");
                                    Intrinsics.checkNotNullParameter(supportFragmentManager6, "");
                                    if (supportFragmentManager6.findFragmentByTag(getstringornullB5.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        getstringornullB5.show(supportFragmentManager6, getstringornullB5.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                getStringOrNull getstringornull5 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                if (getstringornull5 != null) {
                                    getstringornull5.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new INotificationSideChannel();
                                    int i9 = onTransact + 69;
                                    INotificationSideChannel = i9 % 128;
                                    int i10 = i9 % 2;
                                    return;
                                }
                                return;
                            }
                            if (str3.equals("JHTA013")) {
                                Map<String, Object> mapMutableMapOf9 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_already_posting_waiting_payment_tuition", "asik_ineligible_caused_already_posting_waiting_payment_tuition"));
                                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_already_posting_waiting_payment_tuition", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf9, "");
                                TargetAspectRatio targetAspectRatio9 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_already_posting_waiting_payment_tuition", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf9, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_already_posting_waiting_payment_tuition", mapMutableMapOf9);
                                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                getStringOrNull.Companion companion7 = getStringOrNull.INSTANCE;
                                String string14 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string14, "");
                                String string15 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.message_already_posting_asik);
                                Intrinsics.checkNotNullExpressionValue(string15, "");
                                String string16 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string16, "");
                                getStringOrNull getstringornullB6 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string14, string15, string16, null, 112);
                                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB6;
                                if (getstringornullB6 != null) {
                                    FragmentManager supportFragmentManager7 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager7, "");
                                    Intrinsics.checkNotNullParameter(supportFragmentManager7, "");
                                    if (supportFragmentManager7.findFragmentByTag(getstringornullB6.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        int i11 = onTransact + 25;
                                        INotificationSideChannel = i11 % 128;
                                        int i12 = i11 % 2;
                                        getstringornullB6.show(supportFragmentManager7, getstringornullB6.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                getStringOrNull getstringornull6 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                if (getstringornull6 != null) {
                                    getstringornull6.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new cancel();
                                    return;
                                }
                                return;
                            }
                            if (str3.equals("JHTA016")) {
                                Map<String, Object> mapMutableMapOf10 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_reached_maximal_tried_asik", "asik_ineligible_caused_reached_maximal_tried_asik"));
                                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_reached_maximal_tried_asik", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf10, "");
                                TargetAspectRatio targetAspectRatio10 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_reached_maximal_tried_asik", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf10, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_reached_maximal_tried_asik", mapMutableMapOf10);
                                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                getStringOrNull.Companion companion8 = getStringOrNull.INSTANCE;
                                String string17 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string17, "");
                                String string18 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.message_maximal_tried_asik);
                                Intrinsics.checkNotNullExpressionValue(string18, "");
                                String string19 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string19, "");
                                getStringOrNull getstringornullB7 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string17, string18, string19, null, 112);
                                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB7;
                                if (getstringornullB7 != null) {
                                    FragmentManager supportFragmentManager8 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager8, "");
                                    Intrinsics.checkNotNullParameter(supportFragmentManager8, "");
                                    if (supportFragmentManager8.findFragmentByTag(getstringornullB7.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        getstringornullB7.show(supportFragmentManager8, getstringornullB7.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                getStringOrNull getstringornull7 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                if (getstringornull7 != null) {
                                    getstringornull7.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new cancelAll();
                                    return;
                                }
                                return;
                            }
                            if (str3.equals("JHTA020")) {
                                Map<String, Object> mapMutableMapOf11 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_status_ask1", "asik_ineligible_caused_status_ask1"));
                                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_status_ask1", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf11, "");
                                TargetAspectRatio targetAspectRatio11 = TargetAspectRatio.INSTANCE;
                                Intrinsics.checkNotNullParameter("asik_ineligible_caused_status_ask1", "");
                                Intrinsics.checkNotNullParameter(mapMutableMapOf11, "");
                                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_status_ask1", mapMutableMapOf11);
                                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                getStringOrNull.Companion companion9 = getStringOrNull.INSTANCE;
                                String string20 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                Intrinsics.checkNotNullExpressionValue(string20, "");
                                String string21 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.message_asik_ask1);
                                Intrinsics.checkNotNullExpressionValue(string21, "");
                                String string22 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                Intrinsics.checkNotNullExpressionValue(string22, "");
                                getStringOrNull getstringornullB8 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string20, string21, string22, null, 112);
                                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB8;
                                if (getstringornullB8 != null) {
                                    FragmentManager supportFragmentManager9 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager9, "");
                                    Intrinsics.checkNotNullParameter(supportFragmentManager9, "");
                                    if (supportFragmentManager9.findFragmentByTag(getstringornullB8.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        getstringornullB8.show(supportFragmentManager9, getstringornullB8.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                getStringOrNull getstringornull8 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                if (getstringornull8 != null) {
                                    getstringornull8.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new onTransact();
                                    return;
                                }
                                return;
                            }
                            if (!str3.equals("JHTA022")) {
                                int i13 = INotificationSideChannel + 3;
                                onTransact = i13 % 128;
                                if (i13 % 2 == 0) {
                                    str3.equals("JHTA033");
                                    throw null;
                                }
                                if (!str3.equals("JHTA033")) {
                                    if (str3.equals("JHTA014")) {
                                        Map<String, Object> mapMutableMapOf12 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_has_been_succeed_asik_before", "asik_ineligible_caused_has_been_succeed_asik_before"));
                                        Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                        Intrinsics.checkNotNullParameter("asik_ineligible_caused_has_been_succeed_asik_before", "");
                                        Intrinsics.checkNotNullParameter(mapMutableMapOf12, "");
                                        TargetAspectRatio targetAspectRatio12 = TargetAspectRatio.INSTANCE;
                                        Intrinsics.checkNotNullParameter("asik_ineligible_caused_has_been_succeed_asik_before", "");
                                        Intrinsics.checkNotNullParameter(mapMutableMapOf12, "");
                                        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_has_been_succeed_asik_before", mapMutableMapOf12);
                                        asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                        getStringOrNull.Companion companion10 = getStringOrNull.INSTANCE;
                                        String string23 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.title_asik_submission);
                                        Intrinsics.checkNotNullExpressionValue(string23, "");
                                        String str4 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        String string24 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                        Intrinsics.checkNotNullExpressionValue(string24, "");
                                        getStringOrNull getstringornullB9 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string23, str4, string24, null, 112);
                                        asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB9;
                                        if (getstringornullB9 != null) {
                                            FragmentManager supportFragmentManager10 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager10, "");
                                            Intrinsics.checkNotNullParameter(supportFragmentManager10, "");
                                            if (supportFragmentManager10.findFragmentByTag(getstringornullB9.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                                int i14 = INotificationSideChannel + 39;
                                                onTransact = i14 % 128;
                                                if (i14 % 2 == 0) {
                                                    getstringornullB9.show(supportFragmentManager10, getstringornullB9.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                    int i15 = 37 / 0;
                                                } else {
                                                    getstringornullB9.show(supportFragmentManager10, getstringornullB9.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                }
                                            }
                                        }
                                        getStringOrNull getstringornull9 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                        if (getstringornull9 != null) {
                                            getstringornull9.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new d();
                                            return;
                                        }
                                        return;
                                    }
                                    if (str3.equals("JHTA026")) {
                                        Map<String, Object> mapMutableMapOf13 = MapsKt.mutableMapOf(new Pair("params_jmo_claim_jht_ineligible", "jmo_claim_jht_ineligible"));
                                        Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                        Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                                        Intrinsics.checkNotNullParameter(mapMutableMapOf13, "");
                                        TargetAspectRatio targetAspectRatio13 = TargetAspectRatio.INSTANCE;
                                        Intrinsics.checkNotNullParameter("jmo_claim_jht_ineligible", "");
                                        Intrinsics.checkNotNullParameter(mapMutableMapOf13, "");
                                        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("jmo_claim_jht_ineligible", mapMutableMapOf13);
                                        getStringOrNull.Companion companion11 = getStringOrNull.INSTANCE;
                                        String string25 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                        Intrinsics.checkNotNullExpressionValue(string25, "");
                                        String str5 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        String string26 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.label_Lapak_asik_dialog);
                                        Intrinsics.checkNotNullExpressionValue(string26, "");
                                        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, string25, str5, string26, new Function0() { // from class: isPowerSaveMode
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AsikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentbindingInflater1(this.b, strRun);
                                            }
                                        }, asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back), new Function0() { // from class: generateConfigDelta_locale
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AsikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                            }
                                        });
                                        asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        FragmentManager supportFragmentManager11 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager11, "");
                                        Intrinsics.checkNotNullParameter(supportFragmentManager11, "");
                                        if (supportFragmentManager11.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager11, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            return;
                                        }
                                        return;
                                    }
                                    Map<String, Object> mapMutableMapOf14 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_others", "asik_ineligible_others"));
                                    Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                                    Intrinsics.checkNotNullParameter("asik_ineligible_others", "");
                                    Intrinsics.checkNotNullParameter(mapMutableMapOf14, "");
                                    TargetAspectRatio targetAspectRatio14 = TargetAspectRatio.INSTANCE;
                                    Intrinsics.checkNotNullParameter("asik_ineligible_others", "");
                                    Intrinsics.checkNotNullParameter(mapMutableMapOf14, "");
                                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_others", mapMutableMapOf14);
                                    asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                                    getStringOrNull.Companion companion12 = getStringOrNull.INSTANCE;
                                    String string27 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                                    Intrinsics.checkNotNullExpressionValue(string27, "");
                                    String str6 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    String string28 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                                    Intrinsics.checkNotNullExpressionValue(string28, "");
                                    getStringOrNull getstringornullB10 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string27, str6, string28, null, 112);
                                    asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB10;
                                    if (getstringornullB10 != null) {
                                        int i16 = INotificationSideChannel + 99;
                                        onTransact = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            FragmentManager supportFragmentManager12 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager12, "");
                                            Intrinsics.checkNotNullParameter(supportFragmentManager12, "");
                                            supportFragmentManager12.findFragmentByTag(getstringornullB10.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        FragmentManager supportFragmentManager13 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager13, "");
                                        Intrinsics.checkNotNullParameter(supportFragmentManager13, "");
                                        if (supportFragmentManager13.findFragmentByTag(getstringornullB10.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                            getstringornullB10.show(supportFragmentManager13, getstringornullB10.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        }
                                    }
                                    getStringOrNull getstringornull10 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                                    if (getstringornull10 != null) {
                                        getstringornull10.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new g();
                                        return;
                                    }
                                    return;
                                }
                            }
                            Map<String, Object> mapMutableMapOf15 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_status_ask1", "asik_ineligible_caused_status_ask1"));
                            Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                            Intrinsics.checkNotNullParameter("asik_ineligible_caused_status_ask1", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf15, "");
                            TargetAspectRatio targetAspectRatio15 = TargetAspectRatio.INSTANCE;
                            Intrinsics.checkNotNullParameter("asik_ineligible_caused_status_ask1", "");
                            Intrinsics.checkNotNullParameter(mapMutableMapOf15, "");
                            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_status_ask1", mapMutableMapOf15);
                            asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                            getStringOrNull.Companion companion13 = getStringOrNull.INSTANCE;
                            String string29 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string29, "");
                            String str7 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            String string30 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                            Intrinsics.checkNotNullExpressionValue(string30, "");
                            getStringOrNull getstringornullB11 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string29, str7, string30, null, 112);
                            asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB11;
                            if (getstringornullB11 != null) {
                                FragmentManager supportFragmentManager14 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager14, "");
                                Intrinsics.checkNotNullParameter(supportFragmentManager14, "");
                                if (supportFragmentManager14.findFragmentByTag(getstringornullB11.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                    getstringornullB11.show(supportFragmentManager14, getstringornullB11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                            }
                            getStringOrNull getstringornull11 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                            if (getstringornull11 != null) {
                                getstringornull11.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new notify();
                                return;
                            }
                            return;
                        }
                    }
                }
                Map<String, Object> mapMutableMapOf16 = MapsKt.mutableMapOf(new Pair("params_asik_ineligible_caused_card_on_process", "asik_ineligible_caused_card_on_process"));
                Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
                Intrinsics.checkNotNullParameter("asik_ineligible_caused_card_on_process", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf16, "");
                TargetAspectRatio targetAspectRatio16 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("asik_ineligible_caused_card_on_process", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf16, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_ineligible_caused_card_on_process", mapMutableMapOf16);
                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                getStringOrNull.Companion companion14 = getStringOrNull.INSTANCE;
                String string31 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string31, "");
                String str8 = submissionCheckItem.b;
                StringBuilder sb = new StringBuilder("Pengkinian data tidak dapat dilanjutkan pada aplikasi JMO, karena kartu Anda dalam proses ");
                sb.append(str8);
                sb.append(".  Untuk informasi lebih lanjut  silahkan  menghubungi perusahaan Anda atau Kantor Cabang terdekat di kota Anda");
                String string32 = sb.toString();
                String string33 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string33, "");
                getStringOrNull getstringornullB12 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string31, string32, string33, null, 112);
                asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB12;
                if (getstringornullB12 != null) {
                    FragmentManager supportFragmentManager15 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager15, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager15, "");
                    if (supportFragmentManager15.findFragmentByTag(getstringornullB12.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB12.show(supportFragmentManager15, getstringornullB12.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                getStringOrNull getstringornull12 = asikActiveParticipantSubmissionCheckActivity.asBinder;
                if (getstringornull12 != null) {
                    getstringornull12.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new asInterface();
                    return;
                }
                return;
            }
        }
        getStringOrNull.Companion companion15 = getStringOrNull.INSTANCE;
        String string34 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_information);
        Intrinsics.checkNotNullExpressionValue(string34, "");
        String string35 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.message_integrity_data);
        Intrinsics.checkNotNullExpressionValue(string35, "");
        String string36 = asikActiveParticipantSubmissionCheckActivity.getString(R.string.action_back);
        Intrinsics.checkNotNullExpressionValue(string36, "");
        getStringOrNull getstringornullB13 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string34, string35, string36, null, 112);
        asikActiveParticipantSubmissionCheckActivity.asBinder = getstringornullB13;
        if (getstringornullB13 != null) {
            FragmentManager supportFragmentManager16 = asikActiveParticipantSubmissionCheckActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager16, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager16, "");
            if (supportFragmentManager16.findFragmentByTag(getstringornullB13.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i17 = onTransact + 77;
                INotificationSideChannel = i17 % 128;
                if (i17 % 2 != 0) {
                    getstringornullB13.show(supportFragmentManager16, getstringornullB13.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    obj.hashCode();
                    throw null;
                }
                getstringornullB13.show(supportFragmentManager16, getstringornullB13.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        getStringOrNull getstringornull13 = asikActiveParticipantSubmissionCheckActivity.asBinder;
        if (getstringornull13 != null) {
            getstringornull13.INotificationSideChannel = asikActiveParticipantSubmissionCheckActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str;
        AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity = (AsikActiveParticipantSubmissionCheckActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "loading_time_server_asik"));
            Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity, "");
            Intrinsics.checkNotNullParameter("loading_time_server_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("loading_time_server_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_asik", mapMutableMapOf);
            asikActiveParticipantSubmissionCheckActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                return null;
            }
            AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity2 = asikActiveParticipantSubmissionCheckActivity;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "failure_time_server_asik"));
            Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity2, "");
            Intrinsics.checkNotNullParameter("failure_time_server_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("failure_time_server_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_asik", mapMutableMapOf2);
            asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikActiveParticipantSubmissionCheckActivity2, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return null;
        }
        Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "success_time_server_asik"));
        Intrinsics.checkNotNullParameter(asikActiveParticipantSubmissionCheckActivity, "");
        Intrinsics.checkNotNullParameter("success_time_server_asik", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("success_time_server_asik", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_asik", mapMutableMapOf3);
        asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
        asikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
        User user = (User) asikActiveParticipantSubmissionCheckActivity.b.getValue();
        if ((user != null ? user.b : null) != null) {
            int i2 = onTransact + 11;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            select selectVar = (select) asikActiveParticipantSubmissionCheckActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            User user2 = (User) asikActiveParticipantSubmissionCheckActivity.b.getValue();
            if (user2 != null) {
                int i4 = INotificationSideChannel + 65;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                str = user2.b;
            } else {
                int i6 = onTransact + 115;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                str = null;
            }
            String strValueOf = String.valueOf(str);
            User user3 = (User) asikActiveParticipantSubmissionCheckActivity.b.getValue();
            selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CheckSubmissionRequest(strValueOf, String.valueOf(user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), asikActiveParticipantSubmissionCheckActivity.a));
        }
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity = (AsikActiveParticipantSubmissionCheckActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            asikActiveParticipantSubmissionCheckActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            int i4 = i3 + 77;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikActiveParticipantSubmissionCheckActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return null;
            }
        }
        asikActiveParticipantSubmissionCheckActivity.IconCompatParcelizer();
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikActiveParticipantSubmissionCheckActivity, str, "Klaim JHT", 0, null, true, 111);
            asikActiveParticipantSubmissionCheckActivity.d_();
            unit = Unit.INSTANCE;
        } else {
            WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikActiveParticipantSubmissionCheckActivity, str, "Klaim JHT", 0, null, false, 56);
            asikActiveParticipantSubmissionCheckActivity.d_();
            unit = Unit.INSTANCE;
        }
        int i3 = onTransact + 125;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 1249486169, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1249486168, iTuitionPaymentFragmentbindingInflater1, new Object[]{asikActiveParticipantSubmissionCheckActivity, virtualCameraAdapter1});
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikActiveParticipantSubmissionCheckActivity asikActiveParticipantSubmissionCheckActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 2101950799, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -2101950797, iTuitionPaymentFragmentbindingInflater1, new Object[]{asikActiveParticipantSubmissionCheckActivity, virtualCameraAdapter1});
    }

    static {
        cancel = 1;
        d();
        INSTANCE = new Companion(null);
        int i = notify + 45;
        cancel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_asik_active_participant_submission_check;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iTuitionPaymentFragmentbindingInflater1 = DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), -803550276, 1153332450 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_copy).substring(17, 27).length(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 803550276, iTuitionPaymentFragmentbindingInflater1, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 89;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        g = new char[]{56351, 23283, 53724, 18597, 51101, 32376, 62792, 27749, 60169, 25078, 39054, 6124, 36515, 1418, 48224, 15190, 45603, 10542, 42980, 57032, 21921, 52362, 1695, 32885, 2909, 37411, 7429, 42224, 12236, 46749, 12679, 47968, 16968, 52559, 21559, 57104, 26357, 45558, 14110, 48172, 9556, 43582, 5023, 39087, 455, 34531, 3145, 62737, 31268, 58187, 26735, 53651, 22204, 45557, 14107, 48191, 9563, 43620, 5018, 39098, 464, 34508, 3078, 62769, 31285, 58235, 26740, 53650, 22196};
        cancelAll = -3723559890019731585L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity.$$c
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity.$$i(byte, byte, int):java.lang.String");
    }
}
