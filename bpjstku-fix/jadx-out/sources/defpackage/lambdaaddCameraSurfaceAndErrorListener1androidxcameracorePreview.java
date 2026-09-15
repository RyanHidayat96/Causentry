package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumMonitor;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import defpackage.lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u000e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0015\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J1\u0010\"\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010#J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!J7\u0010,\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020)2\b\u0010\t\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u001fH\u0002¢\u0006\u0004\b,\u0010.J\u0017\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010,\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0015\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u00107R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010;\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010<R\u0016\u0010?\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010AR\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010DR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010C"}, d2 = {"LlambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview;", "LgetDynamicRange;", "Lcom/datadog/android/api/SdkCore;", "p0", "Ljava/lang/ref/WeakReference;", "Landroid/view/Window;", "p1", "", "LupdateTransformMatrix;", "p2", "LgetUseCaseAspectRatio;", "p3", "Ljava/lang/ref/Reference;", "Landroid/content/Context;", "p4", "Lcom/datadog/android/api/InternalLogger;", "p5", "<init>", "(Lcom/datadog/android/api/SdkCore;Ljava/lang/ref/WeakReference;[LupdateTransformMatrix;LgetUseCaseAspectRatio;Ljava/lang/ref/Reference;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/view/View;", "", "b", "(Landroid/view/View;FF)Landroid/view/View;", "Landroid/view/ViewGroup;", "Ljava/util/LinkedList;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;FFLjava/util/LinkedList;[I)V", "", "(Landroid/view/View;FF[I)Z", "Landroid/view/MotionEvent;", "onDown", "(Landroid/view/MotionEvent;)Z", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onLongPress", "(Landroid/view/MotionEvent;)V", "onScroll", "onShowPress", "onSingleTapUp", "", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/View;Ljava/lang/String;Landroid/view/MotionEvent;)Ljava/util/Map;", "(Landroid/view/MotionEvent;)Ljava/lang/String;", "(Landroid/view/View;)V", "onTransact", "[LupdateTransformMatrix;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/ref/Reference;", "notify", "[I", "Ljava/lang/String;", "LgetUseCaseAspectRatio;", "INotificationSideChannel", "Lcom/datadog/android/api/InternalLogger;", "asInterface", "F", "a", "g", "d", "Lcom/datadog/android/rum/RumActionType;", "Lcom/datadog/android/rum/RumActionType;", "asBinder", "Ljava/lang/ref/WeakReference;", "Lcom/datadog/android/api/SdkCore;", "cancelAll"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview extends getDynamicRange {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String cancel = "We could not find a valid target for the TAP event. The DecorView was empty and either transparent or not clickable for this Activity.";
    private static final String cancelAll = "We could not find a valid target for the SCROLL or SWIPE event. The DecorView was empty and either transparent or not clickable for this Activity.";

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final InternalLogger asInterface;
    final Reference<Context> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    float a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    RumActionType g;
    WeakReference<View> asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    final WeakReference<Window> INotificationSideChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final getUseCaseAspectRatio TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    final SdkCore cancelAll;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    float d;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final updateTransformMatrix[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview(SdkCore sdkCore, WeakReference<Window> weakReference, updateTransformMatrix[] updatetransformmatrixArr, getUseCaseAspectRatio getusecaseaspectratio, Reference<Context> reference, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(sdkCore, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(updatetransformmatrixArr, "");
        Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
        Intrinsics.checkNotNullParameter(reference, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.cancelAll = sdkCore;
        this.INotificationSideChannel = weakReference;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = updatetransformmatrixArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getusecaseaspectratio;
        this.TuitionPaymentFragmentbindingInflater1 = reference;
        this.asInterface = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[2];
        this.b = "";
        this.asBinder = new WeakReference<>(null);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent p0) {
        View viewB;
        Intrinsics.checkNotNullParameter(p0, "");
        Window window = this.INotificationSideChannel.get();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || (viewB = b(decorView, p0.getX(), p0.getY())) == null) {
            return false;
        }
        b(viewB);
        return false;
    }

    @Override // defpackage.getDynamicRange, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent p0, MotionEvent p1, float p2, float p3) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.g = RumActionType.SWIPE;
        return false;
    }

    @Override // defpackage.getDynamicRange, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent p0, MotionEvent p1, float p2, float p3) {
        View decorView;
        View view;
        Intrinsics.checkNotNullParameter(p1, "");
        RumMonitor rumMonitorB = GlobalRumMonitor.b(this.cancelAll);
        Window window = this.INotificationSideChannel.get();
        if (window != null && (decorView = window.getDecorView()) != null && this.g == null) {
            if (p0 == null) {
                view = null;
                break;
            }
            float x = p0.getX();
            float y = p0.getY();
            LinkedList linkedList = new LinkedList();
            linkedList.add(decorView);
            boolean z = true;
            while (true) {
                if (!linkedList.isEmpty()) {
                    view = (View) linkedList.removeFirst();
                    if (linkedList.isEmpty()) {
                        Intrinsics.checkNotNullExpressionValue(view, "");
                        String name = view.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        if (StringsKt.startsWith$default(name, "androidx.compose.ui.platform.ComposeView", false, 2, (Object) null)) {
                            z = false;
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    if (view.getVisibility() == 0 && (ScrollingView.class.isAssignableFrom(view.getClass()) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass()))) {
                        break;
                    }
                    if (view instanceof ViewGroup) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2((ViewGroup) view, x, y, linkedList, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    if (z) {
                        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener$findTargetForScroll$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.Companion companion = lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.INSTANCE;
                                return lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.Companion.b();
                            }
                        }, null, false, null);
                    }
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.asBinder = new WeakReference<>(view);
                Map<String, ? extends Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1.get(), view.getId()), null);
                RumActionType rumActionType = RumActionType.SCROLL;
                getUseCaseAspectRatio getusecaseaspectratio = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
                Intrinsics.checkNotNullParameter(view, "");
                getusecaseaspectratio.TuitionPaymentFragmentbindingInflater1(view);
                rumMonitorB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rumActionType, "", mapTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.g = RumActionType.SCROLL;
            }
        }
        return false;
    }

    final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3(View p0, String p1, MotionEvent p2) {
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("action.target.classname", isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)), TuplesKt.to("action.target.resource_id", p1));
        if (p2 != null) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2);
            this.b = strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            mapMutableMapOf.put("action.gesture.direction", strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        for (updateTransformMatrix updatetransformmatrix : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            updatetransformmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, mapMutableMapOf);
        }
        return mapMutableMapOf;
    }

    final void b(View p0) {
        Map<String, ? extends Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("action.target.classname", isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)), TuplesKt.to("action.target.resource_id", isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1.get(), p0.getId())));
        for (updateTransformMatrix updatetransformmatrix : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            updatetransformmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, mapMutableMapOf);
        }
        RumMonitor rumMonitorB = GlobalRumMonitor.b(this.cancelAll);
        RumActionType rumActionType = RumActionType.TAP;
        getUseCaseAspectRatio getusecaseaspectratio = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
        Intrinsics.checkNotNullParameter(p0, "");
        getusecaseaspectratio.TuitionPaymentFragmentbindingInflater1(p0);
        rumMonitorB.addAction(rumActionType, "", mapMutableMapOf);
    }

    final View b(View p0, float p1, float p2) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(p0);
        boolean z = true;
        View view = null;
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(view2, "");
                String name = view2.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (StringsKt.startsWith$default(name, "androidx.compose.ui.platform.ComposeView", false, 2, (Object) null)) {
                    z = false;
                }
            }
            Intrinsics.checkNotNullExpressionValue(view2, "");
            if (view2.isClickable() && view2.getVisibility() == 0) {
                view = view2;
            }
            if (view2 instanceof ViewGroup) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2((ViewGroup) view2, p1, p2, linkedList, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        if (view == null && z) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener$findTargetForTap$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.Companion companion = lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.INSTANCE;
                    return lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.Companion.TuitionPaymentFragmentbindingInflater1();
                }
            }, null, false, null);
        }
        return view;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup p0, float p1, float p2, LinkedList<View> p3, int[] p4) {
        if (p0.getVisibility() == 0) {
            int childCount = p0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = p0.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                if (b(childAt, p1, p2, p4)) {
                    p3.add(childAt);
                }
            }
        }
    }

    private static boolean b(View p0, float p1, float p2, int[] p3) {
        p0.getLocationInWindow(p3);
        int i = p3[0];
        int i2 = p3[1];
        return p1 >= ((float) i) && p1 <= ((float) (i + p0.getWidth())) && p2 >= ((float) i2) && p2 <= ((float) (i2 + p0.getHeight()));
    }

    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(MotionEvent p0) {
        float x = p0.getX() - this.a;
        float y = p0.getY() - this.d;
        if (Math.abs(x) > Math.abs(y)) {
            if (x > 0.0f) {
                return "right";
            }
            return "left";
        }
        if (y > 0.0f) {
            return EnabledPayment.STATUS_DOWN;
        }
        return EnabledPayment.STATUS_UP;
    }

    /* JADX INFO: renamed from: lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"LlambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "cancelAll", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "cancel", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String TuitionPaymentFragmentbindingInflater1() {
            return lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.cancel;
        }

        public static String b() {
            return lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview.cancelAll;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview(SdkCore sdkCore, WeakReference weakReference, updateTransformMatrix[] updatetransformmatrixArr, getDefaultRetryTimeoutInMillis getdefaultretrytimeoutinmillis, Reference reference, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sdkCore, weakReference, (i & 4) != 0 ? new updateTransformMatrix[0] : updatetransformmatrixArr, (i & 8) != 0 ? new getDefaultRetryTimeoutInMillis() : getdefaultretrytimeoutinmillis, reference, internalLogger);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.asBinder.clear();
        this.g = null;
        this.b = "";
        this.d = 0.0f;
        this.a = 0.0f;
        this.a = p0.getX();
        this.d = p0.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
