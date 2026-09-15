package defpackage;

import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class setScaleType {
    private static final String b;
    private long INotificationSideChannel;
    public SurfaceRequestExternalSyntheticLambda2 TuitionPaymentFragmentbindingInflater1;
    isPrimary TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    AutoValue_CaptureNode_In TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mergeConfigs f1384a;
    private String asBinder;
    private long asInterface;
    private long d = -1;
    private long g = -1;
    private isServiced notify;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CbWebReqTracker");
        b = sb.toString();
    }

    public setScaleType(isPrimary isprimary, mergeConfigs mergeconfigs) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isprimary;
        this.f1384a = mergeconfigs;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        sb.append("&&");
        sb.append(String.valueOf(this.INotificationSideChannel));
        sb.append("&&");
        sb.append(String.valueOf(this.asInterface));
        sb.append("&&");
        sb.append(String.valueOf(this.asBinder));
        sb.append("&&");
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2 = this.TuitionPaymentFragmentbindingInflater1;
        if (surfaceRequestExternalSyntheticLambda2 != null) {
            sb.append(surfaceRequestExternalSyntheticLambda2.toString());
            sb.append("&&");
        } else {
            sb.append("NA&&");
        }
        isPrimary isprimary = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (isprimary != null) {
            sb.append(isprimary.b().toString());
            sb.append("&&");
        } else {
            sb.append("NA&&");
        }
        sb.append("NA");
        return sb.toString();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_CaptureNode_In autoValue_CaptureNode_In) {
        if (this.asBinder == null) {
            this.asBinder = autoValue_CaptureNode_In.b();
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            StringBuilder sb = new StringBuilder();
            sb.append(autoValue_CaptureNode_In.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            sb.append("/");
            sb.append(autoValue_CaptureNode_In.notify);
            sb.append("/");
            sb.append(autoValue_CaptureNode_In.onTransact);
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
        }
        int i = AnonymousClass5.b[autoValue_CaptureNode_In.onTransact.ordinal()];
        if (i == 1) {
            if (this.INotificationSideChannel <= 0) {
                this.INotificationSideChannel = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.f1384a.g;
            }
            long j = this.d;
            if (j >= 0) {
                autoValue_CaptureNode_In.asInterface = j;
            } else if (autoValue_CaptureNode_In instanceof ZoomState) {
                ((ZoomState) autoValue_CaptureNode_In).b(autoValue_CaptureNode_In.notify == CbConstants.WrMethod.getOutputStream);
            }
            long j2 = this.g;
            if (j2 >= 0) {
                autoValue_CaptureNode_In.asBinder = j2;
                return;
            }
            return;
        }
        if (i == 2) {
            if (autoValue_CaptureNode_In.asInterface >= 0) {
                this.d = autoValue_CaptureNode_In.asInterface;
            }
            if (autoValue_CaptureNode_In.asBinder >= 0) {
                this.g = autoValue_CaptureNode_In.asBinder;
            }
            if (autoValue_CaptureNode_In.notify == CbConstants.WrMethod.getOutputStream && this.asInterface > 0) {
                this.asInterface = 0L;
                return;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.asInterface = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.f1384a.g;
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                autoValue_CaptureNode_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                if (this.asInterface <= 0) {
                    this.asInterface = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.f1384a.g;
                    return;
                }
                return;
            }
            return;
        }
        if ((autoValue_CaptureNode_In instanceof ZoomState) && autoValue_CaptureNode_In.notify != CbConstants.WrMethod.getOutputStream) {
            ZoomState zoomState = (ZoomState) autoValue_CaptureNode_In;
            zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            zoomState.INotificationSideChannel = new getErrorEdge().TuitionPaymentFragmentspecialinlinedviewModeldefault1(zoomState.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getHeaderFields().get("Server-Timing"));
        }
        if (autoValue_CaptureNode_In.asInterface >= 0) {
            this.d = autoValue_CaptureNode_In.asInterface;
        }
        if (autoValue_CaptureNode_In.asBinder >= 0) {
            this.g = autoValue_CaptureNode_In.asBinder;
        }
        if (autoValue_CaptureNode_In.notify == CbConstants.WrMethod.getOutputStream) {
            this.asInterface = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.f1384a.g;
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_CaptureNode_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (this.asInterface <= 0) {
            this.asInterface = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.f1384a.g;
        }
    }

    /* JADX INFO: renamed from: setScaleType$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CbConstants.WrStates.values().length];
            b = iArr;
            try {
                iArr[CbConstants.WrStates.PRE_EXEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[CbConstants.WrStates.POST_EXEC_ERR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[CbConstants.WrStates.POST_EXEC_OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[CbConstants.WrStates.POST_EXEC_FINALIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2 = this.TuitionPaymentFragmentbindingInflater1;
        if (surfaceRequestExternalSyntheticLambda2 == null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("ManualTag '%s' is used", str));
            }
        } else {
            if (str != null && surfaceRequestExternalSyntheticLambda2.toString().equals(str)) {
                return;
            }
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("AutoTag %s != ManualTag '%s'", this.TuitionPaymentFragmentbindingInflater1.toString(), str));
            }
            isPrimary isprimary = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (isprimary != null) {
                isprimary.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.toString());
            }
            this.TuitionPaymentFragmentbindingInflater1 = null;
        }
    }

    public final void b(AutoValue_CaptureNode_In autoValue_CaptureNode_In) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2;
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda3;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda4 = this.TuitionPaymentFragmentbindingInflater1;
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("WRE: sT=%d eT=%d server=%s tag=%s", Long.valueOf(this.INotificationSideChannel), Long.valueOf(this.asInterface), this.asBinder, surfaceRequestExternalSyntheticLambda4 != null ? surfaceRequestExternalSyntheticLambda4.toString() : "none!"));
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("WRE: desc=%s rc=%d msg=%s", autoValue_CaptureNode_In.TuitionPaymentFragmentbindingInflater1(), Integer.valueOf(autoValue_CaptureNode_In.g), autoValue_CaptureNode_In.f79a));
        }
        String strTuitionPaymentFragmentbindingInflater1 = autoValue_CaptureNode_In.TuitionPaymentFragmentbindingInflater1();
        if (provideSurface.b() && (surfaceRequestExternalSyntheticLambda3 = this.TuitionPaymentFragmentbindingInflater1) != null) {
            SurfaceRequestExternalSyntheticLambda6 surfaceRequestExternalSyntheticLambda6 = new SurfaceRequestExternalSyntheticLambda6(surfaceRequestExternalSyntheticLambda3.b, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.INotificationSideChannel, this.asInterface, autoValue_CaptureNode_In.g, autoValue_CaptureNode_In.f79a, strTuitionPaymentFragmentbindingInflater1, autoValue_CaptureNode_In.asInterface, autoValue_CaptureNode_In.asBinder, this.f1384a, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, autoValue_CaptureNode_In.INotificationSideChannel);
            boolean z = CallbackCore.TuitionPaymentFragmentbindingInflater1;
            getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceRequestExternalSyntheticLambda6);
        }
        isPrimary isprimary = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (isprimary == null || (surfaceRequestExternalSyntheticLambda2 = this.TuitionPaymentFragmentbindingInflater1) == null) {
            return;
        }
        isprimary.TuitionPaymentFragmentbindingInflater1(surfaceRequestExternalSyntheticLambda2.b);
    }
}
