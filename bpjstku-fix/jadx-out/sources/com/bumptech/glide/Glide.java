package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.tracing.Trace;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import defpackage.AutoValue_SurfaceOutput_CameraInputInfo;
import defpackage.AutoValue_SurfaceOutput_Event;
import defpackage.CameraUnavailableException;
import defpackage.CameraX;
import defpackage.CameraXExternalSyntheticLambda0;
import defpackage.ForwardingImageProxyOnImageCloseListener;
import defpackage.ImageAnalysisExternalSyntheticLambda2;
import defpackage.getAvailableCameraInfos;
import defpackage.getBackgroundExecutor;
import defpackage.getCameraRepository;
import defpackage.getDefaultConfigFactory;
import defpackage.getOnePixelShiftEnabled;
import defpackage.getTargetCoordinateSystem;
import defpackage.getUpdatedCropRect;
import defpackage.increaseMinLogLevelReference;
import defpackage.lambdacreatePipeline1;
import defpackage.lambdashutdownInternal3androidxcameracoreCameraX;
import defpackage.lambdashutdownInternal4androidxcameracoreCameraX;
import defpackage.onSuggestedStreamSpecUpdated;
import defpackage.setAnalyzer;
import defpackage.setDefaultResolution;
import defpackage.setDefaultSessionConfig;
import defpackage.setResolution;
import defpackage.setRotationDegrees;
import defpackage.setStateToInitialized;
import defpackage.setZslDisabled;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class Glide implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Glide f672a;
    private static volatile boolean asInterface;
    final ForwardingImageProxyOnImageCloseListener TuitionPaymentFragmentbindingInflater1;
    public final setRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getAvailableCameraInfos asBinder;
    private final lambdashutdownInternal4androidxcameracoreCameraX cancel;
    private final TuitionPaymentFragmentbindingInflater1 d;
    public final getOnePixelShiftEnabled g;
    final List<RequestManager> b = new ArrayList();
    private MemoryCategory notify = MemoryCategory.NORMAL;

    public interface TuitionPaymentFragmentbindingInflater1 {
        RequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public static Glide b(Context context) {
        if (f672a == null) {
            GeneratedAppGlideModule generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(context.getApplicationContext());
            synchronized (Glide.class) {
                if (f672a == null) {
                    if (asInterface) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    asInterface = true;
                    try {
                        AutoValue_SurfaceOutput_CameraInputInfo autoValue_SurfaceOutput_CameraInputInfo = new AutoValue_SurfaceOutput_CameraInputInfo();
                        Context applicationContext = context.getApplicationContext();
                        List<ImageAnalysisExternalSyntheticLambda2> listEmptyList = Collections.emptyList();
                        if (generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1 == null || generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                            listEmptyList = new setAnalyzer(applicationContext).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                        List<ImageAnalysisExternalSyntheticLambda2> list = listEmptyList;
                        if (generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1 != null && !generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1().isEmpty()) {
                            Set<Class<?>> setTuitionPaymentFragmentbindingInflater1 = generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
                            Iterator<ImageAnalysisExternalSyntheticLambda2> it = list.iterator();
                            while (it.hasNext()) {
                                ImageAnalysisExternalSyntheticLambda2 next = it.next();
                                if (setTuitionPaymentFragmentbindingInflater1.contains(next.getClass())) {
                                    if (Log.isLoggable("Glide", 3)) {
                                        Objects.toString(next);
                                    }
                                    it.remove();
                                }
                            }
                        }
                        if (Log.isLoggable("Glide", 3)) {
                            Iterator<ImageAnalysisExternalSyntheticLambda2> it2 = list.iterator();
                            while (it2.hasNext()) {
                                Objects.toString(it2.next().getClass());
                            }
                        }
                        autoValue_SurfaceOutput_CameraInputInfo.RemoteActionCompatParcelizer = generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1 != null ? generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
                        for (ImageAnalysisExternalSyntheticLambda2 imageAnalysisExternalSyntheticLambda2 : list) {
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannelStubProxy == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannelStubProxy = lambdashutdownInternal3androidxcameracoreCameraX.b();
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.g == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.g = lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.notify == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.notify = new CameraXExternalSyntheticLambda0(new CameraXExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext));
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentbindingInflater1 == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentbindingInflater1 = new lambdacreatePipeline1();
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                            int i = autoValue_SurfaceOutput_CameraInputInfo.notify.TuitionPaymentFragmentbindingInflater1;
                            if (i > 0) {
                                autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setStateToInitialized(i);
                            } else {
                                autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CameraX();
                            }
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.b == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.b = new increaseMinLogLevelReference(autoValue_SurfaceOutput_CameraInputInfo.notify.b);
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannel == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannel = new getCameraRepository(autoValue_SurfaceOutput_CameraInputInfo.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.asBinder == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.asBinder = new getDefaultConfigFactory(applicationContext);
                        }
                        if (autoValue_SurfaceOutput_CameraInputInfo.d == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.d = new getAvailableCameraInfos(autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannel, autoValue_SurfaceOutput_CameraInputInfo.asBinder, autoValue_SurfaceOutput_CameraInputInfo.g, autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannelStubProxy, lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2, autoValue_SurfaceOutput_CameraInputInfo.cancelAll);
                        }
                        List<getTargetCoordinateSystem<Object>> list2 = autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (list2 == null) {
                            autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Collections.emptyList();
                        } else {
                            autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Collections.unmodifiableList(list2);
                        }
                        setResolution setresolution = new setResolution(autoValue_SurfaceOutput_CameraInputInfo.onTransact);
                        Glide glide = new Glide(applicationContext, autoValue_SurfaceOutput_CameraInputInfo.d, autoValue_SurfaceOutput_CameraInputInfo.INotificationSideChannel, autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1, autoValue_SurfaceOutput_CameraInputInfo.b, new getOnePixelShiftEnabled(autoValue_SurfaceOutput_CameraInputInfo.RemoteActionCompatParcelizer, setresolution), autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentbindingInflater1, autoValue_SurfaceOutput_CameraInputInfo.cancel, autoValue_SurfaceOutput_CameraInputInfo.asInterface, autoValue_SurfaceOutput_CameraInputInfo.f84a, autoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3, list, generatedAppGlideModuleTuitionPaymentFragmentbindingInflater1, setresolution);
                        applicationContext.registerComponentCallbacks(glide);
                        f672a = glide;
                        asInterface = false;
                    } catch (Throwable th) {
                        asInterface = false;
                        throw th;
                    }
                }
            }
        }
        return f672a;
    }

    private static GeneratedAppGlideModule TuitionPaymentFragmentbindingInflater1(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
        }
    }

    private Glide(Context context, getAvailableCameraInfos getavailablecamerainfos, lambdashutdownInternal4androidxcameracoreCameraX lambdashutdowninternal4androidxcameracorecamerax, BitmapPool bitmapPool, CameraUnavailableException cameraUnavailableException, getOnePixelShiftEnabled getonepixelshiftenabled, ForwardingImageProxyOnImageCloseListener forwardingImageProxyOnImageCloseListener, int i, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Map<Class<?>, AutoValue_SurfaceOutput_Event<?, ?>> map, List<getTargetCoordinateSystem<Object>> list, final List<ImageAnalysisExternalSyntheticLambda2> list2, final onSuggestedStreamSpecUpdated onsuggestedstreamspecupdated, setResolution setresolution) {
        this.asBinder = getavailablecamerainfos;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bitmapPool;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraUnavailableException;
        this.cancel = lambdashutdowninternal4androidxcameracorecamerax;
        this.g = getonepixelshiftenabled;
        this.TuitionPaymentFragmentbindingInflater1 = forwardingImageProxyOnImageCloseListener;
        this.d = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setRotationDegrees(context, cameraUnavailableException, new setZslDisabled.b<Registry>() { // from class: AutoValue_ResolutionInfo_ResolutionInfoInternalBuilder.4
            private boolean b;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // setZslDisabled.b
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public Registry TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                if (this.b) {
                    throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
                }
                Trace.beginSection("Glide registry");
                this.b = true;
                try {
                    return AutoValue_ResolutionInfo_ResolutionInfoInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, list2, onsuggestedstreamspecupdated);
                } finally {
                    this.b = false;
                    Trace.endSection();
                }
            }
        }, new setDefaultSessionConfig(), tuitionPaymentFragmentbindingInflater1, map, list, getavailablecamerainfos, setresolution, i);
    }

    public final BitmapPool b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault2(Fragment fragment) {
        Context context = fragment.getContext();
        if (context != null) {
            return b(context).g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragment);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
        Context context = view.getContext();
        if (context == null) {
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        getOnePixelShiftEnabled getonepixelshiftenabled = b(context).g;
        if (getUpdatedCropRect.b()) {
            return getonepixelshiftenabled.b(view.getContext().getApplicationContext());
        }
        if (view != null) {
            if (view.getContext() != null) {
                Activity activityTuitionPaymentFragmentbindingInflater1 = getOnePixelShiftEnabled.TuitionPaymentFragmentbindingInflater1(view.getContext());
                if (activityTuitionPaymentFragmentbindingInflater1 == null) {
                    return getonepixelshiftenabled.b(view.getContext().getApplicationContext());
                }
                android.app.Fragment fragment = null;
                Fragment fragment2 = null;
                if (activityTuitionPaymentFragmentbindingInflater1 instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) activityTuitionPaymentFragmentbindingInflater1;
                    getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
                    getOnePixelShiftEnabled.TuitionPaymentFragmentbindingInflater1(fragmentActivity.getSupportFragmentManager().getFragments(), getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    View viewFindViewById = fragmentActivity.findViewById(R.id.content);
                    while (!view.equals(viewFindViewById) && (fragment2 = getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(view)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
                    return fragment2 != null ? getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragment2) : getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragmentActivity);
                }
                getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
                getonepixelshiftenabled.b(activityTuitionPaymentFragmentbindingInflater1.getFragmentManager(), getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                View viewFindViewById2 = activityTuitionPaymentFragmentbindingInflater1.findViewById(R.id.content);
                while (!view.equals(viewFindViewById2) && (fragment = getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(view)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
                if (fragment == null) {
                    return getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityTuitionPaymentFragmentbindingInflater1);
                }
                if (fragment.getActivity() == null) {
                    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                }
                if (getUpdatedCropRect.b()) {
                    return getonepixelshiftenabled.b(fragment.getActivity().getApplicationContext());
                }
                if (fragment.getActivity() != null) {
                    getBackgroundExecutor getbackgroundexecutor = getonepixelshiftenabled.TuitionPaymentFragmentbindingInflater1;
                    fragment.getActivity();
                }
                return getonepixelshiftenabled.b(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
        }
        throw new NullPointerException("Argument must not be null");
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(setDefaultResolution<?> setdefaultresolution) {
        synchronized (this.b) {
            Iterator<RequestManager> it = this.b.iterator();
            while (it.hasNext()) {
                if (it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3(setdefaultresolution)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        if (context != null) {
            return b(context).g.b(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static RequestManager with(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return b(fragmentActivity).g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragmentActivity);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        synchronized (this.b) {
            Iterator<RequestManager> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i);
            }
        }
        this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
    }
}
