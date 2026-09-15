package id.vida.liveness;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.config.VidaUICustomizationOption;
import id.vida.liveness.constants.FaceStatus;
import id.vida.liveness.dto.FaceHacknessResponseDTO;
import id.vida.liveness.listeners.LivenessDetectionListener;
import id.vida.liveness.listeners.VidaErrorDialogEventListener;
import id.vida.liveness.listeners.VidaTutorialDialogEventListener;
import id.vida.liveness.services.BackendLiveness;
import id.vida.liveness.ui.OverlayView;
import id.vida.liveness.ui.ProgressOverlayView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class H extends Fragment implements LivenessDetectionListener, View.OnClickListener, VidaTutorialDialogEventListener, VidaErrorDialogEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatImageView f1030a;
    public ExecutorService b;
    public C0720a0 c;
    public AppCompatTextView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatTextView f1031e;
    public PreviewView f;
    public ImageCapture g;
    public VidaFaceDetectionOption h;
    public VidaUICustomizationOption i;
    public ProgressOverlayView j;
    public AppCompatImageView k;
    public int l;
    public AtomicBoolean m;
    public ProgressBar n;
    public View o;
    public ProcessCameraProvider p;
    public AtomicBoolean q;
    public AppCompatImageView r;
    public OverlayView s;
    public EnumC0733e1 t;
    public int u;
    public String v;
    public double w;
    public double x;
    public boolean y;
    public boolean z;

    private static native Object[] $liveness$Bf90a7895();

    private static /* synthetic */ Runnable $liveness$C46aeb9af(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C46bd458f(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.j();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C46e62ef5(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C47042f73(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C4712bb53(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.l();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C5643e91b(final H h, final FaceStatus faceStatus) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(faceStatus);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C5c9e7f14(final H h, final int i, final FaceHacknessResponseDTO faceHacknessResponseDTO, final String str) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(i, faceHacknessResponseDTO, str);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C89d811c4(final H h, final ListenableFuture listenableFuture, final int i, final int i2) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(listenableFuture, i, i2);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C934b2eb4(final H h, final boolean z, final int i, final boolean z2) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(z, i, z2);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C9ae4c13b(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C9af34d1b(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C9b00077f(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C9b0e935f(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C9b1e7c5c(final H h) {
        return new Runnable() { // from class: id.vida.liveness.H$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h();
            }
        };
    }

    private static native void $liveness$Ef90a7895(Object obj, Object obj2);

    public H() {
        $liveness$Ef90a7895(this, $liveness$Bf90a7895());
    }

    public static native BackendLiveness getOrCreateBackendLiveness(Context context);

    public final native CameraSelector a();

    public final native ImageAnalysis a(int i, int i2);

    public final native void a(int i, FaceHacknessResponseDTO faceHacknessResponseDTO, String str);

    public final native void a(ListenableFuture listenableFuture, int i, int i2);

    public final native void a(FaceStatus faceStatus);

    public final native void a(String str);

    public final native void a(boolean z);

    public final native void a(boolean z, int i, boolean z2);

    public final native void b();

    public final native void b(int i, FaceHacknessResponseDTO faceHacknessResponseDTO, String str);

    public final native /* synthetic */ void c();

    public final native /* synthetic */ void c(int i, FaceHacknessResponseDTO faceHacknessResponseDTO, String str);

    public final native /* synthetic */ void d();

    public final native /* synthetic */ void e();

    public final native /* synthetic */ void f();

    public final native /* synthetic */ void g();

    public final native void h();

    public final native /* synthetic */ void i();

    public final native /* synthetic */ void j();

    public final native /* synthetic */ void k();

    public final native /* synthetic */ void l();

    public final native synchronized void m();

    public final native void n();

    public final native void o();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.Fragment
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // id.vida.liveness.listeners.VidaTutorialDialogEventListener
    public native void onCtaClick();

    @Override // id.vida.liveness.listeners.LivenessDetectionListener
    public native void onFaceStatusChangedListener(FaceStatus faceStatus);

    @Override // id.vida.liveness.listeners.LivenessDetectionListener
    public native void onFailureListener(int i, String str, byte[] bArr);

    @Override // androidx.fragment.app.Fragment
    public native void onPause();

    @Override // id.vida.liveness.listeners.VidaErrorDialogEventListener
    public native void onPrimaryCTAClick();

    @Override // id.vida.liveness.listeners.LivenessDetectionListener
    public native void onProgressUpdate(int i, boolean z, boolean z2);

    @Override // androidx.fragment.app.Fragment
    public native void onResume();

    @Override // id.vida.liveness.listeners.VidaErrorDialogEventListener
    public native void onSecondaryCTAClick();

    @Override // id.vida.liveness.listeners.LivenessDetectionListener
    public native void onSuccessListener(Bitmap bitmap);

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(View view, Bundle bundle);

    public final native void p();

    public final native void q();

    public final native void r();

    public final native void s();

    static {
        Object[] objArr;
        ClassLoader classLoader = H.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 1559, 24 - View.getDefaultSize(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1630308022, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1630308022};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 43042), View.getDefaultSize(0, 0) + 3111, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 1), 517 - ImageFormat.getBitsPerPixel(0), View.MeasureSpec.getMode(0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i6 = ~iMaxMemory;
                int i7 = i3 + (((~(i6 | 598730612)) | (~((-598730613) | iMaxMemory)) | (~((-1106300847) | i6))) * 959) + 1280752389 + (((~((-598730613) | i6)) | (~((-1106300847) | iMaxMemory)) | (~(iMaxMemory | 598730612))) * 959);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i10 = ((int[]) objArr4[0])[0];
                int i11 = ((int[]) objArr4[2])[0];
                int i12 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr = {i12};
                int i13 = ~((int) SystemClock.uptimeMillis());
                int i14 = i10 + (-1298025966) + ((~(1065334527 | i13)) * 52) + (((~(1046582331 | i13)) | (~((-658449128) | i13)) | 18752196) * (-52)) + (((~(i13 | (-1046582332))) | 406885400) * 52);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(H.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i17 = ((int[]) objArr[0])[0];
                int i18 = i17 * i17;
                int i19 = -(1104111160 * i17);
                int i20 = (((i18 & i19) + (i18 | i19)) - (~(-(i17 * 657302986)))) - 1759441920;
                int i21 = (((i20 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = i20 >> 21;
                int i24 = -(i22 ^ (((((i23 | (-4095)) << 1) - (i23 ^ (-4095))) / 2048) + 1));
                int i25 = (i24 ^ 4) + ((i24 & 4) << 1);
                int i26 = i25 >> 21;
                int i27 = ((i26 ^ (-4095)) + ((i26 & (-4095)) << 1)) / 2048;
                int i28 = ((i27 | 1) << 1) - (i27 ^ 1);
                Loader.l(((-1214643904) / (((-((i28 ^ 1) + ((i28 & 1) << 1))) & i25) * 2)) - 696301480);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } catch (Throwable th) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }
}
