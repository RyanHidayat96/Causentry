package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class getOnePixelShiftEnabled implements Handler.Callback {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface = new TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: getOnePixelShiftEnabled.5
        @Override // getOnePixelShiftEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault2(Glide glide, getImageQueueDepth getimagequeuedepth, getUseCaseConfigBuilder getusecaseconfigbuilder, Context context) {
            return new RequestManager(glide, getimagequeuedepth, getusecaseconfigbuilder, context);
        }
    };
    public final getBackgroundExecutor TuitionPaymentFragmentbindingInflater1;
    private volatile RequestManager asBinder;
    final Handler b;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 d;
    private final getResolutionSelector g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<FragmentManager, getResolutionInfo> f959a = new HashMap();
    Map<androidx.fragment.app.FragmentManager, lambdacreatePipeline2androidxcameracoreImageAnalysis> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();
    public final ArrayMap<View, Fragment> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayMap<>();
    public final ArrayMap<View, android.app.Fragment> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayMap<>();
    private final Bundle cancelAll = new Bundle();

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault2(Glide glide, getImageQueueDepth getimagequeuedepth, getUseCaseConfigBuilder getusecaseconfigbuilder, Context context);
    }

    public getOnePixelShiftEnabled(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, setResolution setresolution) {
        getBackgroundExecutor clearanalyzer;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? asInterface : tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.d = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.b = new Handler(Looper.getMainLooper(), this);
        this.g = new getResolutionSelector(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (!DelegatingImageSavedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || !DelegatingImageSavedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            clearanalyzer = new clearAnalyzer();
        } else if (setresolution.TuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey(AutoValue_SurfaceOutput_CameraInputInfo.TuitionPaymentFragmentbindingInflater1.class)) {
            clearanalyzer = new lambdaonMergeConfig0();
        } else {
            clearanalyzer = new clearPipeline();
        }
        this.TuitionPaymentFragmentbindingInflater1 = clearanalyzer;
    }

    private RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
        if (this.asBinder == null) {
            synchronized (this) {
                if (this.asBinder == null) {
                    this.asBinder = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Glide.b(context.getApplicationContext()), new onImageClose(), new tryUpdateRelativeRotation(), context.getApplicationContext());
                }
            }
        }
        return this.asBinder;
    }

    public final RequestManager b(Context context) {
        while (context != null) {
            if (getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault2((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault1((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        context = contextWrapper.getBaseContext();
                    }
                }
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault2(FragmentActivity fragmentActivity) {
        if (getUpdatedCropRect.b()) {
            return b(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentActivity);
            return this.g.b(fragmentActivity, Glide.b(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault3(Fragment fragment) {
        if (fragment.getContext() != null) {
            if (getUpdatedCropRect.b()) {
                return b(fragment.getContext().getApplicationContext());
            }
            if (fragment.getActivity() != null) {
                fragment.getActivity();
            }
            androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Context context = fragment.getContext();
            return this.g.b(context, Glide.b(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    @Deprecated
    public final RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault1(Activity activity) {
        if (getUpdatedCropRect.b()) {
            return b(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2((FragmentActivity) activity);
        }
        if (!activity.isDestroyed()) {
            return b(activity, activity.getFragmentManager(), null, TuitionPaymentFragmentspecialinlinedviewModeldefault3(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public static void TuitionPaymentFragmentbindingInflater1(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (fragment != null && fragment.getView() != null) {
                    map.put(fragment.getView(), fragment);
                    TuitionPaymentFragmentbindingInflater1(fragment.getChildFragmentManager().getFragments(), map);
                }
            }
        }
    }

    @Deprecated
    public final void b(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentManager, arrayMap);
    }

    @Deprecated
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> arrayMap) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            this.cancelAll.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(this.cancelAll, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), arrayMap);
            }
            i++;
        }
    }

    public static Activity TuitionPaymentFragmentbindingInflater1(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    final getResolutionInfo b(FragmentManager fragmentManager, android.app.Fragment fragment) {
        getResolutionInfo getresolutioninfo = this.f959a.get(fragmentManager);
        if (getresolutioninfo != null) {
            return getresolutioninfo;
        }
        getResolutionInfo getresolutioninfo2 = (getResolutionInfo) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (getresolutioninfo2 == null) {
            getresolutioninfo2 = new getResolutionInfo();
            getresolutioninfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                getresolutioninfo2.b(fragment.getActivity());
            }
            this.f959a.put(fragmentManager, getresolutioninfo2);
            fragmentManager.beginTransaction().add(getresolutioninfo2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.b.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return getresolutioninfo2;
    }

    @Deprecated
    public final RequestManager b(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        getResolutionInfo getresolutioninfoB = b(fragmentManager, fragment);
        RequestManager requestManager = getresolutioninfoB.TuitionPaymentFragmentbindingInflater1;
        if (requestManager != null) {
            return requestManager;
        }
        RequestManager requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Glide.b(context), getresolutioninfoB.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getresolutioninfoB.b, context);
        if (z) {
            requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2.onStart();
        }
        getresolutioninfoB.TuitionPaymentFragmentbindingInflater1 = requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentCallbacks componentCallbacksRemove;
        Object obj;
        Object obj2;
        ComponentCallbacks componentCallbacks;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                z2 = false;
            } else {
                androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) message.obj;
                lambdacreatePipeline2androidxcameracoreImageAnalysis lambdacreatepipeline2androidxcameracoreimageanalysis = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(fragmentManager);
                lambdacreatePipeline2androidxcameracoreImageAnalysis lambdacreatepipeline2androidxcameracoreimageanalysis2 = (lambdacreatePipeline2androidxcameracoreImageAnalysis) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
                if (lambdacreatepipeline2androidxcameracoreimageanalysis2 != lambdacreatepipeline2androidxcameracoreimageanalysis) {
                    if (lambdacreatepipeline2androidxcameracoreimageanalysis2 != null) {
                        RequestManager requestManager = lambdacreatepipeline2androidxcameracoreimageanalysis2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                    if (z3 || fragmentManager.isDestroyed()) {
                        fragmentManager.isDestroyed();
                        lambdacreatepipeline2androidxcameracoreimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                    } else {
                        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(lambdacreatepipeline2androidxcameracoreimageanalysis, "com.bumptech.glide.manager");
                        if (lambdacreatepipeline2androidxcameracoreimageanalysis2 != null) {
                            fragmentTransactionAdd.remove(lambdacreatepipeline2androidxcameracoreimageanalysis2);
                        }
                        fragmentTransactionAdd.commitNowAllowingStateLoss();
                        this.b.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
                    }
                }
                componentCallbacksRemove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(fragmentManager);
                obj = fragmentManager;
                z = true;
                ComponentCallbacks componentCallbacks2 = componentCallbacksRemove;
                obj2 = obj;
                componentCallbacks = componentCallbacks2;
            }
            componentCallbacks = null;
            obj2 = null;
        } else {
            FragmentManager fragmentManager2 = (FragmentManager) message.obj;
            getResolutionInfo getresolutioninfo = this.f959a.get(fragmentManager2);
            getResolutionInfo getresolutioninfo2 = (getResolutionInfo) fragmentManager2.findFragmentByTag("com.bumptech.glide.manager");
            if (getresolutioninfo2 != getresolutioninfo) {
                if (getresolutioninfo2 != null && getresolutioninfo2.TuitionPaymentFragmentbindingInflater1 != null) {
                    StringBuilder sb = new StringBuilder("We've added two fragments with requests! Old: ");
                    sb.append(getresolutioninfo2);
                    sb.append(" New: ");
                    sb.append(getresolutioninfo);
                    throw new IllegalStateException(sb.toString());
                }
                if (z3 || fragmentManager2.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        fragmentManager2.isDestroyed();
                    }
                    getresolutioninfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
                } else {
                    android.app.FragmentTransaction fragmentTransactionAdd2 = fragmentManager2.beginTransaction().add(getresolutioninfo, "com.bumptech.glide.manager");
                    if (getresolutioninfo2 != null) {
                        fragmentTransactionAdd2.remove(getresolutioninfo2);
                    }
                    fragmentTransactionAdd2.commitAllowingStateLoss();
                    this.b.obtainMessage(1, 1, 0, fragmentManager2).sendToTarget();
                    componentCallbacks = null;
                    obj2 = null;
                }
            }
            componentCallbacksRemove = this.f959a.remove(fragmentManager2);
            obj = fragmentManager2;
            z = true;
            ComponentCallbacks componentCallbacks3 = componentCallbacksRemove;
            obj2 = obj;
            componentCallbacks = componentCallbacks3;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && componentCallbacks == null) {
            Objects.toString(obj2);
        }
        return z2;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            while (true) {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        return activity == null || !activity.isFinishing();
    }
}
