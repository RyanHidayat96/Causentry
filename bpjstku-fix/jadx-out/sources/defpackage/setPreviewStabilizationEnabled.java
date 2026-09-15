package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumMonitor;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001TB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u0006*\u00020\f0\fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\u00152\n\u0010\u0003\u001a\u0006*\u00020\u00180\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u00152\n\u0010\u0003\u001a\u0006*\u00020\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0017J\u001c\u0010 \u001a\u00020\u00152\n\u0010\u0003\u001a\u0006*\u00020\f0\fH\u0096\u0001¢\u0006\u0004\b \u0010\u0017J\u001b\u0010$\u001a\u00020#2\n\u0010\u0003\u001a\u00060!j\u0002`\"H\u0002¢\u0006\u0004\b$\u0010%J\u001c\u0010'\u001a\u00020#2\n\u0010\u0003\u001a\u0006*\u00020&0&H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020#2\n\u0010\u0003\u001a\u0006*\u00020&0&H\u0096\u0001¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b,\u0010+J \u0010/\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u0003\u001a\u00020-H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b4\u0010+J\u001f\u00106\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020-2\u0006\u0010\u0005\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J \u00108\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b8\u00100J \u00109\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b9\u0010:J*\u0010;\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020-2\b\u0010\u0005\u001a\u0004\u0018\u0001012\u0006\u0010\u0006\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u001c\u0010=\u001a\u00020\u00152\n\u0010\u0003\u001a\u0006*\u00020?0?H\u0096\u0001¢\u0006\u0004\b=\u0010@J\u001c\u0010B\u001a\u00020#2\n\u0010\u0003\u001a\u0006*\u00020A0AH\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u001e\u0010G\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u0006*\u00020F0FH\u0097\u0001¢\u0006\u0004\bG\u0010HJ&\u0010G\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u0006*\u00020F0F2\u0006\u0010\u0005\u001a\u00020-H\u0097\u0001¢\u0006\u0004\bG\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010J\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010OR\u0014\u0010$\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010P\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020X8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010U\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010["}, d2 = {"LsetPreviewStabilizationEnabled;", "Landroid/view/Window$Callback;", "Landroid/view/Window;", "p0", "Lcom/datadog/android/api/SdkCore;", "p1", "p2", "LsetSurfaceProvider;", "p3", "LgetUseCaseAspectRatio;", "p4", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "p5", "", "LupdateTransformMatrix;", "p6", "Lcom/datadog/android/api/InternalLogger;", "p7", "<init>", "(Landroid/view/Window;Lcom/datadog/android/api/SdkCore;Landroid/view/Window$Callback;LsetSurfaceProvider;LgetUseCaseAspectRatio;Lkotlin/jvm/functions/Function1;[LupdateTransformMatrix;Lcom/datadog/android/api/InternalLogger;)V", "", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "dispatchTouchEvent", "dispatchTrackballEvent", "Ljava/lang/NullPointerException;", "Lkotlin/g;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/NullPointerException;)V", "Landroid/view/ActionMode;", "onActionModeFinished", "(Landroid/view/ActionMode;)V", "onActionModeStarted", "onAttachedToWindow", "()V", "onContentChanged", "", "Landroid/view/Menu;", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/View;", "onCreatePanelView", "(I)Landroid/view/View;", "onDetachedFromWindow", "Landroid/view/MenuItem;", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onMenuOpened", "onPanelClosed", "(ILandroid/view/Menu;)V", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onSearchRequested", "()Z", "Landroid/view/SearchEvent;", "(Landroid/view/SearchEvent;)Z", "Landroid/view/WindowManager$LayoutParams;", "onWindowAttributesChanged", "(Landroid/view/WindowManager$LayoutParams;)V", "onWindowFocusChanged", "(Z)V", "Landroid/view/ActionMode$Callback;", "onWindowStartingActionMode", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "b", "TuitionPaymentFragmentbindingInflater1", "LsetSurfaceProvider;", "LgetUseCaseAspectRatio;", "a", "Lcom/datadog/android/api/InternalLogger;", "asInterface", "Lcom/datadog/android/api/SdkCore;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "[LupdateTransformMatrix;", "d", "Ljava/lang/ref/WeakReference;", "g", "Ljava/lang/ref/WeakReference;", "Landroid/view/Window$Callback;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setPreviewStabilizationEnabled implements Window.Callback {
    private final setSurfaceProvider TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<MotionEvent, MotionEvent> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final Window.Callback asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final updateTransformMatrix[] d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final SdkCore TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final getUseCaseAspectRatio TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final WeakReference<Window> a;

    /* JADX WARN: Multi-variable type inference failed */
    private setPreviewStabilizationEnabled(Window window, SdkCore sdkCore, Window.Callback callback, setSurfaceProvider setsurfaceprovider, getUseCaseAspectRatio getusecaseaspectratio, Function1<? super MotionEvent, MotionEvent> function1, updateTransformMatrix[] updatetransformmatrixArr, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(window, "");
        Intrinsics.checkNotNullParameter(sdkCore, "");
        Intrinsics.checkNotNullParameter(callback, "");
        Intrinsics.checkNotNullParameter(setsurfaceprovider, "");
        Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(updatetransformmatrixArr, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sdkCore;
        this.asBinder = callback;
        this.TuitionPaymentFragmentbindingInflater1 = setsurfaceprovider;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getusecaseaspectratio;
        this.b = function1;
        this.d = updatetransformmatrixArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
        this.a = new WeakReference<>(window);
    }

    public /* synthetic */ setPreviewStabilizationEnabled(Window window, SdkCore sdkCore, Window.Callback callback, setSurfaceProvider setsurfaceprovider, getUseCaseAspectRatio getusecaseaspectratio, Function1 function1, updateTransformMatrix[] updatetransformmatrixArr, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, sdkCore, callback, setsurfaceprovider, (i & 16) != 0 ? new getDefaultRetryTimeoutInMillis() : getusecaseaspectratio, (i & 32) != 0 ? new Function1<MotionEvent, MotionEvent>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final MotionEvent invoke(MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, "");
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                Intrinsics.checkNotNullExpressionValue(motionEventObtain, "");
                return motionEventObtain;
            }
        } : function1, (i & 64) != 0 ? new updateTransformMatrix[0] : updatetransformmatrixArr, internalLogger);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent p0) {
        View viewB;
        if (p0 != null) {
            MotionEvent motionEventInvoke = this.b.invoke(p0);
            try {
                try {
                    setSurfaceProvider setsurfaceprovider = this.TuitionPaymentFragmentbindingInflater1;
                    Intrinsics.checkNotNullParameter(motionEventInvoke, "");
                    setsurfaceprovider.b.onTouchEvent(motionEventInvoke);
                    if (motionEventInvoke.getActionMasked() == 1) {
                        lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview = setsurfaceprovider.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNullParameter(motionEventInvoke, "");
                        Window window = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.INotificationSideChannel.get();
                        View decorView = window != null ? window.getDecorView() : null;
                        RumActionType rumActionType = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.g;
                        if (rumActionType == null) {
                            if (decorView != null && (viewB = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.b(decorView, lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.a, lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.d)) == lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.b(decorView, motionEventInvoke.getX(), motionEventInvoke.getY()) && viewB != null) {
                                lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.b(viewB);
                            }
                        } else {
                            RumMonitor rumMonitorB = GlobalRumMonitor.b(lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.cancelAll);
                            View view = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.asBinder.get();
                            if (decorView != null && view != null) {
                                Map<String, ? extends Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.TuitionPaymentFragmentbindingInflater1.get(), view.getId()), motionEventInvoke);
                                getUseCaseAspectRatio getusecaseaspectratio = lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
                                Intrinsics.checkNotNullParameter(view, "");
                                getusecaseaspectratio.TuitionPaymentFragmentbindingInflater1(view);
                                rumMonitorB.TuitionPaymentFragmentbindingInflater1(rumActionType, "", mapTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                        lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.asBinder.clear();
                        lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.g = null;
                        lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.b = "";
                        lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.d = 0.0f;
                        lambdaaddcamerasurfaceanderrorlistener1androidxcameracorepreview.a = 0.0f;
                    }
                } catch (Exception e2) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchTouchEvent$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Error processing MotionEvent";
                        }
                    }, e2, false, null);
                }
                motionEventInvoke.recycle();
            } catch (Throwable th) {
                motionEventInvoke.recycle();
                throw th;
            }
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchTouchEvent$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Received null MotionEvent";
                }
            }, null, false, null);
        }
        try {
            return this.asBinder.dispatchTouchEvent(p0);
        } catch (NullPointerException e3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(e3);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int p0, MenuItem p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        Window window = this.a.get();
        Map<String, ? extends Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("action.target.classname", p1.getClass().getCanonicalName()), TuplesKt.to("action.target.resource_id", isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(window != null ? window.getContext() : null, p1.getItemId())), TuplesKt.to("action.target.title", p1.getTitle()));
        RumMonitor rumMonitorB = GlobalRumMonitor.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        RumActionType rumActionType = RumActionType.TAP;
        getUseCaseAspectRatio getusecaseaspectratio = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getusecaseaspectratio.TuitionPaymentFragmentbindingInflater1(p1);
        rumMonitorB.addAction(rumActionType, "", mapMutableMapOf);
        try {
            return this.asBinder.onMenuItemSelected(p0, p1);
        } catch (NullPointerException e2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent p0) {
        Window window;
        View currentFocus;
        if (p0 != null) {
            if (p0.getKeyCode() != 4 || p0.getAction() != 1) {
                if (p0.getKeyCode() == 23 && p0.getAction() == 1 && (window = this.a.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                    Map<String, ? extends Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("action.target.classname", isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(currentFocus)), TuplesKt.to("action.target.resource_id", isPreviewStabilizationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(window.getContext(), currentFocus.getId())));
                    for (updateTransformMatrix updatetransformmatrix : this.d) {
                        updatetransformmatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(currentFocus, mapMutableMapOf);
                    }
                    getUseCaseAspectRatio getusecaseaspectratio = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
                    Intrinsics.checkNotNullParameter(currentFocus, "");
                    getusecaseaspectratio.TuitionPaymentFragmentbindingInflater1(currentFocus);
                    GlobalRumMonitor.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).addAction(RumActionType.CLICK, "", mapMutableMapOf);
                }
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0);
                GlobalRumMonitor.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).addAction(RumActionType.BACK, "back", MapsKt.emptyMap());
            }
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchKeyEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Received null KeyEvent";
                }
            }, null, false, null);
        }
        try {
            return this.asBinder.dispatchKeyEvent(p0);
        } catch (NullPointerException e2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
            return true;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(NullPointerException p0) {
        String message = p0.getMessage();
        if (message == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) "Parameter specified as non-null is null", false, 2, (Object) null)) {
            throw p0;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$logOrRethrowWrappedCallbackException$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Wrapped Window.Callback failed processing event";
            }
        }, p0, false, null);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent p0) {
        return this.asBinder.dispatchGenericMotionEvent(p0);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent p0) {
        return this.asBinder.dispatchKeyShortcutEvent(p0);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0) {
        return this.asBinder.dispatchPopulateAccessibilityEvent(p0);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent p0) {
        return this.asBinder.dispatchTrackballEvent(p0);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode p0) {
        this.asBinder.onActionModeFinished(p0);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode p0) {
        this.asBinder.onActionModeStarted(p0);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.asBinder.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.asBinder.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int p0, Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.asBinder.onCreatePanelMenu(p0, p1);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int p0) {
        return this.asBinder.onCreatePanelView(p0);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.asBinder.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int p0, Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.asBinder.onMenuOpened(p0, p1);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int p0, Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        this.asBinder.onPanelClosed(p0, p1);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int p0, View p1, Menu p2) {
        Intrinsics.checkNotNullParameter(p2, "");
        return this.asBinder.onPreparePanel(p0, p1, p2);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.asBinder.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent p0) {
        return this.asBinder.onSearchRequested(p0);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams p0) {
        this.asBinder.onWindowAttributesChanged(p0);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean p0) {
        this.asBinder.onWindowFocusChanged(p0);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback p0) {
        return this.asBinder.onWindowStartingActionMode(p0);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback p0, int p1) {
        return this.asBinder.onWindowStartingActionMode(p0, p1);
    }
}
