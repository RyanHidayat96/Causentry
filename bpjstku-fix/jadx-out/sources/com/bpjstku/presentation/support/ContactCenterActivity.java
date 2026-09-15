package com.bpjstku.presentation.support;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.support.model.response.CallPmiResponse;
import com.bpjstku.data.support.model.response.DataPmiItem;
import com.bpjstku.databinding.ActivityContactCenterBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.support.ContactCenterActivity;
import com.bpjstku.presentation.support.model.SupportMenu;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.google.gson.Gson;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.TargetAspectRatio;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getInputChannelCountRanges;
import defpackage.getMaxImages;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper;
import defpackage.layoutHorizontal;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0017\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0015\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001b\u0010\u0006\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0015\u0010\u001f\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0015\u0010\u001d\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0017\u0010\t\u001a\u0004\u0018\u00010\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\n\u001a\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010'"}, d2 = {"Lcom/bpjstku/presentation/support/ContactCenterActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityContactCenterBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "Lcom/bpjstku/presentation/support/model/SupportMenu;", "INotificationSideChannel", "()Ljava/util/List;", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "onTransact", "()LacquireBuffer;", "LlambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper;", "d", "LgetStreamUseCaseSupportedCombinationList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;", "g", "Lcom/bpjstku/domain/user/model/User;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactCenterActivity extends BindingBaseActivity<ActivityContactCenterBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f635a;
    private static long asBinder;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {6, 51, 46, 31};
    private static final int $$f = 80;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {51, -99, -8, -59, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 166;
    private static int onTransact = 0;
    private static int cancel = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: CameraCaptureSessionCompat
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ContactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: lambdaonCaptureCompleted2androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ContactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: lambdaonCaptureFailed3androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ContactCenterActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~(i6 | i);
        int i8 = i4 | i7;
        int i9 = (~(i | (~i4))) | i6;
        int i10 = i6 + i4 + i2 + ((-1932811043) * i3) + (1521317780 * i5);
        int i11 = i10 * i10;
        int i12 = ((i6 * (-919556932)) - 154402816) + ((-919556932) * i4) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i2) + ((-2098724864) * i3) + ((-1398800384) * i5) + ((-1444151296) * i11);
        int i13 = (i6 * 1794637580) + 2133191799 + (i4 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i2 * 1794637741) + (i3 * (-1844343719)) + (i5 * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        if (i14 == 1) {
            return b(objArr);
        }
        if (i14 != 2) {
            return i14 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        ContactCenterActivity contactCenterActivity = (ContactCenterActivity) objArr[0];
        int i15 = 2 % 2;
        int i16 = cancel + 85;
        cancelAll = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i18 != (-410628888) + (((~(1723733775 | iMaxMemory)) | 289499184) * 104) + ((~((~iMaxMemory) | (-1119486728))) * (-104)) + ((iMaxMemory | 893746232) * 104)) {
            throw null;
        }
        int i19 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i20 = ~iFreeMemory;
        if (i19 != (-429748142) + (((~((-756503818) | i20)) | (-1822552148)) * (-865)) + ((~(iFreeMemory | 756503817)) * 865) + (((~((-1822552148) | i20)) | (~(i20 | 756503817))) * 865)) {
            throw null;
        }
        super.onStart();
        int i21 = cancel + 125;
        cancelAll = i21 % 128;
        int i22 = i21 % 2;
        return null;
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
    private static void c(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.support.ContactCenterActivity.$$a
            int r7 = r7 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.ContactCenterActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public ContactCenterActivity() {
        final ContactCenterActivity contactCenterActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.support.ContactCenterActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = contactCenterActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.support.ContactCenterActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = contactCenterActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final ContactCenterActivity contactCenterActivity2 = this;
        this.b = LazyKt.lazy(new Function0<lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper>() { // from class: com.bpjstku.presentation.support.ContactCenterActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper invoke() {
                LifecycleOwner lifecycleOwner = contactCenterActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.support.ContactCenterActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = contactCenterActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
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

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ContactCenterActivity contactCenterActivity) {
        int i = 2 % 2;
        String string = ((getStreamUseCaseSupportedCombinationList) contactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
        if (string.length() > 0) {
            int i2 = cancelAll + 49;
            cancel = i2 % 128;
            if (i2 % 2 != 0) {
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contactCenterActivity, string, "Appointment Online", 0, null, true, 53);
                return;
            } else {
                WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contactCenterActivity, string, "Appointment Online", 0, null, false, 56);
                return;
            }
        }
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Sedang memuat appointment online...", 0).show();
        int i3 = cancelAll + 99;
        cancel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a8  */
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
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(f635a[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 2187, 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asBinder), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16744199) - Color.rgb(0, 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3010, AndroidCharacter.getMirror('0') - 22, 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (Process.myTid() >> 22)), 3376 - (ViewConfiguration.getFadingEdgeLength() >> 16), 17 - (KeyEvent.getMaxKeyCode() >> 16), -968507904, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
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
            int i5 = $10 + 37;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 36505), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3376, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, -968507904, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $10 + 53;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
        int i9 = $10 + 99;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.support.ContactCenterActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/support/ContactCenterActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ContactCenterActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends ClickableSpan {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            ContactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ContactCenterActivity.this);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(ContactCenterActivity.this, R.color.white));
        }
    }

    private final acquireBuffer onTransact() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
            int iAxisFromString = 22 - MotionEvent.axisFromString("");
            short s = $$a[7];
            byte b2 = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b2, (byte) (b2 | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iNormalizeMetaState, iAxisFromString, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_uob_app_instruction_5).substring(25, 26).length() - 1, 22 - (Process.myTid() >> 22), (char) (Process.getGidForName("") + 1), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(22 - Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (29944 - (Process.myPid() >> 22));
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
            int i2 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 37, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, fadingEdgeLength, i2, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iNormalizeMetaState2 = 23 - KeyEvent.normalizeMetaState(0);
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((short) 89, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iIndexOf, iNormalizeMetaState2, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_unable_to_parse_information).substring(0, 31).codePointAt(7) + 945525547;
            int i3 = 949874565 + (((~((-56099851) | iCodePointAt)) | 268702276) * (-756)) + (((~iCodePointAt) | (-56099851)) * 756) + 489841993;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, 16 - ExpandableListView.getPackedPositionType(0L), (char) (36459 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(TextUtils.lastIndexOf("", '0') + 54, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.copied_company_code).substring(1, 2).codePointAt(0) - 95, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).codePointAt(18) + 49768), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1548618443};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 42049), (Process.myPid() >> 22) + 1726, 28 - TextUtils.indexOf((CharSequence) "", '0', 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 489841993);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int i6 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b5 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    c((short) 89, b5, b5, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, i6, iMakeMeasureSpec, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 117, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 89, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(21 - TextUtils.lastIndexOf("", '0', 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cGreen = (char) (Color.green(0) + 29944);
                        int iRgb = Color.rgb(0, 0, 0) + 16778971;
                        int fadingEdgeLength2 = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b6 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c((short) 37, b6, b6, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, iRgb, fadingEdgeLength2, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                        int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                        short s2 = $$a[7];
                        byte b7 = (byte) s2;
                        Object[] objArr15 = new Object[1];
                        c(s2, b7, (byte) (b7 | 15), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iIndexOf2, deadChar, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
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
        int i7 = ((int[]) objArr[1])[0];
        int i8 = ((int[]) objArr[0])[0];
        if (i8 == i7) {
            int i9 = cancel + 123;
            cancelAll = i9 % 128;
            int i10 = i9 % 2;
            int i11 = ((int[]) objArr[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = i11 + (((~(iIdentityHashCode | (-467202855))) * TypedValues.CycleType.TYPE_EASING) - 729236767) + (((~((~iIdentityHashCode) | (-467202855))) | 537198656) * TypedValues.CycleType.TYPE_EASING);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr16[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i15 = cancel + 83;
                cancelAll = i15 % 128;
                int i16 = i15 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i8];
            int i17 = i8 - 1;
            iArr[i17] = 1;
            Toast.makeText((Context) null, iArr[((i8 * i17) % 2) - 1], 1).show();
            int i18 = ((int[]) objArr[3])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = i18 + (-750631223) + (((~((-626836351) | iIdentityHashCode2)) | 625754682) * 1504) + ((~(iIdentityHashCode2 | (-1081669))) * (-1504)) + 426029744;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr17[3])[0] = i21 ^ (i21 << 5);
        }
        return (acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityContactCenterBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancelAll + 35;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ContactCenterActivity$bindingInflater$1 contactCenterActivity$bindingInflater$1 = ContactCenterActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 == 0) {
            return contactCenterActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnCallCareContactCenter.setOnClickListener(new View.OnClickListener() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactCenterActivity.$r8$lambda$n8BclRGG8_EWQPIVJFw6OIyzvwc(view);
            }
        });
        int i2 = cancel + 9;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new b(new Function1() { // from class: lambdaonCaptureProgressed1androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = cancelAll + 109;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final List<SupportMenu> INotificationSideChannel() {
        List<SubscribedProgram> list;
        int i = 2 % 2;
        User user = (User) this.asInterface.getValue();
        ArrayList arrayListEmptyList = null;
        if (user != null && (list = user.INotificationSideChannel) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i2 = cancel + 117;
                cancelAll = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(((SubscribedProgram) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PMI");
                    throw null;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((SubscribedProgram) next).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PMI")) {
                    arrayList.add(next);
                }
            }
            arrayListEmptyList = arrayList;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zMediaBrowserCompatMediaBrowserImplApi216 = getMaxImages.MediaBrowserCompatMediaBrowserImplApi216();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayListEmptyList.isEmpty()) {
            int i3 = cancel + 115;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            if (zMediaBrowserCompatMediaBrowserImplApi216) {
                String string = getString(com.bpjstku.R.string.title_click_to_call);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = getString(com.bpjstku.R.string.label_click_to_call_description);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList2.add(new SupportMenu("1", string, string2, com.bpjstku.R.drawable.ic_clicktocall));
            }
        }
        String string3 = getString(com.bpjstku.R.string.title_contact);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(com.bpjstku.R.string.label_contact_description);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList2.add(new SupportMenu(ExifInterface.GPS_MEASUREMENT_2D, string3, string4, com.bpjstku.R.drawable.ic_whatsapp_outline));
        return arrayList2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 89;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = cancel + 65;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0690  */
    /* JADX WARN: Code duplicated, block: B:51:0x0699  */
    /* JADX WARN: Code duplicated, block: B:53:0x073d  */
    /* JADX WARN: Code duplicated, block: B:56:0x07e6 A[Catch: all -> 0x0a96, TryCatch #2 {all -> 0x0a96, blocks: (B:54:0x07d2, B:56:0x07e6, B:57:0x0818, B:15:0x02e0, B:17:0x02f4, B:18:0x0324, B:20:0x0355, B:21:0x03c5), top: B:105:0x02e0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0831  */
    /* JADX WARN: Code duplicated, block: B:65:0x0918  */
    /* JADX WARN: Code duplicated, block: B:68:0x0969  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, doubleTapTimeout, i3, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_camera_screen_instructions_text_image_too_dark).substring(0, 24).length() - 24, 22 - TextUtils.getOffsetBefore("", 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 117), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(22 - (ViewConfiguration.getTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_guideline_text).substring(9, 10).length() + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int i4 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 89, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, i4, offsetAfter, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iBlue = Color.blue(0) + 1031;
                int iMyTid = (Process.myTid() >> 22) + 15;
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 193, bArr[28], (byte) (bArr[0] + 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(fadingEdgeLength, iBlue, iMyTid, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = (((-433638511) + (((~(468137331 | startUptimeMillis)) | 712417501) * (-366))) + (((~(startUptimeMillis | 1006089727)) | 174465105) * 366)) - 676389757;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.processing_card_registration).substring(0, 3).codePointAt(1) - 77, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, (char) (36459 - TextUtils.getCapsMode("", 0, 0)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 49801), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {139897359};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46039 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1134, Color.rgb(0, 0, 0) + 16777234, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -676389757, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 141, b4, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(edgeSlop, packedPositionType, threadPriority, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1116, View.resolveSize(0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int iAlpha = Color.alpha(0) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 193, bArr2[28], (byte) (bArr2[0] + 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c, windowTouchSlop, iAlpha, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int iResolveSize = View.resolveSize(0, 0) + 1031;
                        int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b5 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 89, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(modifierMetaStateMask, iResolveSize, maxKeyCode, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                        int i10 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, scrollBarSize, i10, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf2);
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
            if (strArr2 != null) {
                int i11 = cancel;
                int i12 = i11 + 71;
                cancelAll = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 119;
                cancelAll = i14 % 128;
                int i15 = i14 % 2;
                while (i2 < strArr2.length) {
                    int i16 = cancel + 39;
                    cancelAll = i16 % 128;
                    if (i16 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 55;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = i17 + (-32342713) + (((~iIdentityHashCode) | 831761822) * 1444) + (((~(iIdentityHashCode | (-365310332))) | (~(609590501 | iIdentityHashCode)) | 293740826) * (-1444)) + 763385234;
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        int i23 = cancelAll + 81;
        cancel = i23 % 128;
        if (i23 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                short s = $$a[7];
                byte b7 = (byte) s;
                Object[] objArr19 = new Object[1];
                c(s, b7, (byte) (b7 | 15), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maxKeyCode2, capsMode, offsetBefore, 986134021, false, (String) objArr19[0], null);
            }
            int i24 = 29 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                    int iMyPid = 23 - (Process.myPid() >> 22);
                    byte b8 = $$a[7];
                    Object[] objArr20 = new Object[1];
                    c((short) 89, b8, b8, objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, bitsPerPixel, iMyPid, 1599039318, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i25 = ((int[]) objArr21[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i25}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
                int i26 = ~((int) SystemClock.uptimeMillis());
                int i27 = (((-1876389296) + ((~((-145473593) | i26)) * (-783))) + (((~(i26 | (-503300159))) | (-715902585)) * 783)) - 1449275231;
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i29 ^ (i29 << 5);
            } else {
                Object[] objArr22 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 78, TextUtils.lastIndexOf("", '0', 0, 0) + 17, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36459), objArr22);
                Class<?> cls4 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(KeyEvent.getDeadChar(0, 0) + 53, 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 49726), objArr23);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr24 = {139897359};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - View.resolveSize(0, 0)), 1726 - (Process.myTid() >> 22), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr24), -1449275231, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                    int i30 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                    int i31 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte b9 = $$a[7];
                    Object[] objArr25 = new Object[1];
                    c((short) 89, b9, b9, objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i30, i31, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr26 = new Object[1];
                    e(TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_atm_instruction_7).substring(0, 1).length() + 21, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                        int i32 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iMyTid2 = 23 - (Process.myTid() >> 22);
                        byte b10 = $$a[7];
                        Object[] objArr28 = new Object[1];
                        c((short) 37, b10, b10, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, i32, iMyTid2, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (29944 - Color.alpha(0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                        int iIndexOf = 23 - TextUtils.indexOf("", "");
                        short s2 = $$a[7];
                        byte b11 = (byte) s2;
                        Object[] objArr29 = new Object[1];
                        c(s2, b11, (byte) (b11 | 15), objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, keyRepeatTimeout, iIndexOf, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iMyTid3 = (Process.myTid() >> 22) + 1755;
                int defaultSize = 23 - View.getDefaultSize(0, 0);
                short s3 = $$a[7];
                byte b12 = (byte) s3;
                Object[] objArr30 = new Object[1];
                c(s3, b12, (byte) (b12 | 15), objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(scrollBarFadeDuration, iMyTid3, defaultSize, 986134021, false, (String) objArr30[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMyTid2 = (char) (29944 - (Process.myTid() >> 22));
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 1756;
                    int iMyPid2 = 23 - (Process.myPid() >> 22);
                    byte b13 = $$a[7];
                    Object[] objArr210 = new Object[1];
                    c((short) 89, b13, b13, objArr210);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid2, bitsPerPixel2, iMyPid2, 1599039318, false, (String) objArr210[0], null);
                }
                Object[] objArr211 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i210 = ((int[]) objArr211[0])[0];
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i210}, new int[]{((int[]) objArr211[1])[0]}, (Object[]) objArr211[2], new int[1], (String[]) objArr211[4]};
                int i211 = ~((int) SystemClock.uptimeMillis());
                int i212 = (((-1876389296) + ((~((-145473593) | i211)) * (-783))) + (((~(i211 | (-503300159))) | (-715902585)) * 783)) - 1449275231;
                int i213 = (i212 << 13) ^ i212;
                int i214 = i213 ^ (i213 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i214 ^ (i214 << 5);
            } else {
                Object[] objArr212 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 78, TextUtils.lastIndexOf("", '0', 0, 0) + 17, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36459), objArr212);
                Class<?> cls6 = Class.forName((String) objArr212[0]);
                Object[] objArr213 = new Object[1];
                e(KeyEvent.getDeadChar(0, 0) + 53, 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 49726), objArr213);
                int iIntValue3 = ((Integer) cls6.getMethod((String) objArr213[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr214 = {139897359};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - View.resolveSize(0, 0)), 1726 - (Process.myTid() >> 22), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr214), -1449275231, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                    int i33 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                    int i34 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte b14 = $$a[7];
                    Object[] objArr215 = new Object[1];
                    c((short) 89, b14, b14, objArr215);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, i33, i34, 1599039318, false, (String) objArr215[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                Object[] objArr216 = new Object[1];
                e(TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_atm_instruction_7).substring(0, 1).length() + 21, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr216);
                Class<?> cls7 = Class.forName((String) objArr216[0]);
                Object[] objArr217 = new Object[1];
                e(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr217);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr217[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState2 = (char) (29944 - KeyEvent.normalizeMetaState(0));
                    int i35 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iMyTid4 = 23 - (Process.myTid() >> 22);
                    byte b15 = $$a[7];
                    Object[] objArr218 = new Object[1];
                    c((short) 37, b15, b15, objArr218);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState2, i35, iMyTid4, 1596667560, false, (String) objArr218[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAlpha2 = (char) (29944 - Color.alpha(0));
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int iIndexOf2 = 23 - TextUtils.indexOf("", "");
                    short s4 = $$a[7];
                    byte b16 = (byte) s4;
                    Object[] objArr219 = new Object[1];
                    c(s4, b16, (byte) (b16 | 15), objArr219);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha2, keyRepeatTimeout2, iIndexOf2, 986134021, false, (String) objArr219[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf6);
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr31 = {new int[]{i37}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 684863089;
        int i39 = i36 + 88359503 + (((-355208861) | (~i38)) * (-490)) + (((~(i38 | 713121890)) | (-1068330751)) * 490) + 1661618046;
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr31[3])[0] = i41 ^ (i41 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00a5  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 15;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 151126414;
            int i5 = ~i4;
            if (i3 != 427306719 + (((~((-961342814) | i5)) | (-1791330357)) * (-602)) + (((~(i4 | (-961342814))) | 285762889 | (~((-1115750433) | i5))) * (-301)) + ((~(i5 | (-1791330357))) * 301)) {
                int[] iArr = new int[234370945];
                iArr[234370944] = 1;
                int i6 = (-1577027712) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i7 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~(577275064 | iIdentityHashCode);
            if (i7 != 189281832 + (((-1944690624) | i8) * (-814)) + ((i8 | (~((~iIdentityHashCode) | 1407262607)) | 39847048) * 407) + (((~(iIdentityHashCode | (-1407262608))) | (~((-577275065) | iIdentityHashCode)) | 39847048) * 407)) {
                int[] iArr2 = new int[234370945];
                iArr2[234370944] = 1;
                int i9 = (-1577027712) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i10 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 61097333;
        int i11 = ~(199344058 | length);
        if (i10 != 1401886846 + (((-2078932992) | i11) * (-814)) + ((i11 | (~((~length) | 1915255389)) | 35666456) * 407) + (((~(length | (-1915255390))) | (~((-199344059) | length)) | 35666456) * 407)) {
            throw null;
        }
        super.onResume();
        int i12 = cancel + 5;
        cancelAll = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cc, code lost:
    
        if (r1 != (((853376658 + ((~((~r2) | (-538980355))) * 433)) + (((~((-1570229434) | r2)) | (-1008826532)) * (-433))) + (((~(r2 | (-1008826532))) | (-2109209788)) * 433))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ce, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.support.ContactCenterActivity.cancelAll + 89;
        com.bpjstku.presentation.support.ContactCenterActivity.cancel = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        r11 = 1433152084 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ec, code lost:
    
        throw new java.lang.RuntimeException("1859980393");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (r1 == (((((-1924703536) | r6) * (-658)) + 1175212584) + ((r6 | (-2143152048)) * 658))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0082, code lost:
    
        if (r1 == (((1786179320 + (((~((-1423270913) | r7)) | 5521408) * 184)) + ((r6 | (-2011032874)) * (-184))) + ((~((-593283370) | r7)) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.ContactCenterActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(ContactCenterActivity contactCenterActivity) {
        User userAsBinder;
        int i = 2 % 2;
        int i2 = cancelAll + 63;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) contactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i3 = 56 / 0;
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) contactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i4 = cancel + 17;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return userAsBinder;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i;
        String[] strArr;
        final ContactCenterActivity contactCenterActivity = (ContactCenterActivity) objArr[0];
        SupportMenu supportMenu = (SupportMenu) objArr[1];
        int i2 = 2 % 2;
        int i3 = cancelAll + 81;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(supportMenu, "");
        String str = supportMenu.TuitionPaymentFragmentbindingInflater1;
        if (!Intrinsics.areEqual(str, "1")) {
            if (Intrinsics.areEqual(str, ExifInterface.GPS_MEASUREMENT_2D)) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_call_care_contact_center", "call_care_contact_center"));
                Intrinsics.checkNotNullParameter(contactCenterActivity, "");
                Intrinsics.checkNotNullParameter("call_care_contact_center", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("call_care_contact_center", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("call_care_contact_center", mapMutableMapOf);
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                String strMediaBrowserCompatConnectionCallbackStubApi21 = getMaxImages.MediaBrowserCompatConnectionCallbackStubApi21();
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sb = new StringBuilder("https://wa.me/");
                sb.append(strMediaBrowserCompatConnectionCallbackStubApi21);
                sb.append("?text=Halo BPJamsostek");
                intent.setData(Uri.parse(sb.toString()));
                contactCenterActivity.startActivity(intent);
                i = cancel + 83;
                cancelAll = i % 128;
            }
            return Unit.INSTANCE;
        }
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("menu_name", "view_click_to_call"));
        Intrinsics.checkNotNullParameter(contactCenterActivity, "");
        Intrinsics.checkNotNullParameter("view_click_to_call", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_click_to_call", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_click_to_call", mapMutableMapOf2);
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) contactCenterActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        if (Build.VERSION.SDK_INT >= 33) {
            int i5 = cancel + 87;
            cancelAll = i5 % 128;
            strArr = i5 % 2 == 0 ? new String[]{"android.permission.READ_MEDIA_AUDIO"} : new String[]{"android.permission.READ_MEDIA_AUDIO"};
        } else {
            strArr = new String[]{"android.permission.RECORD_AUDIO"};
            int i6 = cancel + 125;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
        }
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArr, strArr.length)));
        final Function1 function1 = new Function1() { // from class: lambdaonCaptureSequenceAborted5androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactCenterActivity.TuitionPaymentFragmentbindingInflater1(this.b, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: lambdaonCaptureBufferLost6androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                ContactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        contactCenterActivity.onTransact().TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        i = cancelAll + 55;
        cancel = i % 128;
        int i8 = i % 2;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ContactCenterActivity contactCenterActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Object next;
        int i = 2 % 2;
        int i2 = cancel + 125;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 69;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            contactCenterActivity.MediaBrowserCompat();
        } else {
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                contactCenterActivity.IconCompatParcelizer();
                Iterator<T> it = ((CallPmiResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataPmi().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    DataPmiItem dataPmiItem = (DataPmiItem) next;
                    if (Intrinsics.areEqual(dataPmiItem.getKodeSegmen(), "PMI")) {
                        int i7 = cancelAll + 37;
                        cancel = i7 % 128;
                        if (i7 % 2 != 0) {
                            Intrinsics.areEqual(dataPmiItem.getAktif(), "Y");
                            throw null;
                        }
                        if (Intrinsics.areEqual(dataPmiItem.getAktif(), "Y")) {
                            break;
                        }
                    }
                }
                DataPmiItem dataPmiItem2 = (DataPmiItem) next;
                String kpj = dataPmiItem2 != null ? dataPmiItem2.getKpj() : null;
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                String strMediaBrowserCompatMediaBrowserImpl = getMaxImages.MediaBrowserCompatMediaBrowserImpl();
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(strMediaBrowserCompatMediaBrowserImpl);
                sb.append("?kpjNumber=");
                sb.append(kpj);
                sb.append("&kpjSegment=PMI");
                String string = sb.toString();
                String string2 = contactCenterActivity.getString(com.bpjstku.R.string.label_title_community_service);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contactCenterActivity, string, string2, 0, null, false, 56);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i8 = i3 + 65;
                cancel = i8 % 128;
                int i9 = i8 % 2;
                contactCenterActivity.IconCompatParcelizer();
                ContactCenterActivity contactCenterActivity2 = contactCenterActivity;
                String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contactCenterActivity2, str != null ? str : "", null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(ContactCenterActivity contactCenterActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(contactCenterActivity);
        int i2 = cancel + 49;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ContactCenterActivity contactCenterActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = cancel + 43;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            bool.booleanValue();
            throw null;
        }
        if (bool.booleanValue()) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            String strMediaBrowserCompatMediaBrowserImpl = getMaxImages.MediaBrowserCompatMediaBrowserImpl();
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(strMediaBrowserCompatMediaBrowserImpl);
            sb.append("?kpjSegment=PMI");
            String string = sb.toString();
            String string2 = contactCenterActivity.getString(com.bpjstku.R.string.label_title_community_service);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contactCenterActivity, string, string2, 0, null, false, 56);
        } else {
            AutoValue_LifecycleCameraRepository_Key.b(contactCenterActivity, "Akses Tidak Diberikan.");
        }
        Unit unit = Unit.INSTANCE;
        int i3 = cancel + 109;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(final ContactCenterActivity contactCenterActivity) {
        int i = 2 % 2;
        CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 = new CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0(contactCenterActivity, contactCenterActivity.INotificationSideChannel(), new Function1() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactCenterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (SupportMenu) obj);
            }
        });
        int i2 = cancel + 91;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;
    }

    public static /* synthetic */ void $r8$lambda$n8BclRGG8_EWQPIVJFw6OIyzvwc(View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                ViewPortBuilder.b();
                throw null;
            }
            ViewPortBuilder.b();
            int i4 = cancelAll + 17;
            cancel = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = cancel + 47;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            int i3 = 9 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ContactCenterActivity contactCenterActivity = this;
        Intrinsics.checkNotNullParameter(contactCenterActivity, "");
        contactCenterActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(com.bpjstku.R.string.label_title_community_service));
        RecyclerView recyclerView = ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvService;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0) this.d.getValue());
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String strB = getMaxImages.b();
        if (strB.length() > 0) {
            try {
                if (((AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class)).getStatus()) {
                    int i2 = cancel + 5;
                    cancelAll = i2 % 128;
                    int i3 = i2 % 2;
                    ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutAntrianOnlineInfo.setVisibility(8);
                    int i4 = cancelAll + 113;
                    cancel = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "Appointment Online", 0, false, 6, (Object) null);
        spannableString.setSpan(new TuitionPaymentFragmentbindingInflater1(), iIndexOf$default, iIndexOf$default + 18, 33);
        ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAntrianOnlineInfo.setText(spannableString);
        ((ActivityContactCenterBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAntrianOnlineInfo.setMovementMethod(LinkMovementMethod.getInstance());
        int i5 = cancelAll + 27;
        cancel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ContactCenterActivity contactCenterActivity, SupportMenu supportMenu) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{contactCenterActivity, supportMenu}, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1768298724, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1768298725);
    }

    static {
        notify = 1;
        g();
        INSTANCE = new Companion(null);
        int i = onTransact + 45;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 115;
        cancel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 7;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return com.bpjstku.R.layout.activity_contact_center;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancel + 87;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_title_text).substring(0, 16).length() + 657959127, new Object[]{this}, 879334137 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2064048082, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2064048082);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1175262813, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1175262815);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_shopeepay_instruction_tablet_step2).substring(0, 5).length() - 1184876900, 1870481824, layoutHorizontal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1870481821);
    }

    static void g() {
        f635a = new char[]{45565, 40840, 60684, 14976, 2075, 22935, 42788, 62692, 49699, 5029, 24950, 20209, 40029, 60893, 15172, 2271, 22097, 42949, 62820, 49917, 4215, 25077, 45561, 40842, 60681, 14978, 2055, 22939, 42788, 62616, 49705, 5047, 24884, 20182, 40013, 60867, 15189, 16285, 4588, 25461, 46328, 34353, 55289, 10570, 31439, 19520, 40339, 61280, 49328, 4668, 25521, 46398, 34492, 29528, 23855, 12192, 63537, 51885, 39738, 26009, 13854, Typography.copyright, 53530, 41862, 35943, 24266, 12140, 63993, 51826};
        asBinder = 4413467933116833766L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 11;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ContactCenterActivity contactCenterActivity = (ContactCenterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 123;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancel + 25;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, byte r6, short r7) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.bpjstku.presentation.support.ContactCenterActivity.$$c
            int r5 = r5 * 3
            int r5 = r5 + 109
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r3 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.ContactCenterActivity.$$i(byte, byte, short):java.lang.String");
    }
}
