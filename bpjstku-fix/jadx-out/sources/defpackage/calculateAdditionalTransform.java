package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class calculateAdditionalTransform<T> extends WeakReference<T> implements lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl {
    public calculateAdditionalTransform(T t) {
        super(t);
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T extends Context> extends calculateAdditionalTransform<T> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
            super(t);
        }

        @Override // defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public Context TuitionPaymentFragmentbindingInflater1() {
            return get();
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault2<Service> {
        @Override // calculateAdditionalTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public final /* bridge */ /* synthetic */ Context TuitionPaymentFragmentbindingInflater1() {
            return super.TuitionPaymentFragmentbindingInflater1();
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Service service) {
            super(service);
        }

        static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Service service) {
            if (service == null) {
                return "Service reference null";
            }
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) service.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
            if (runningServices == null) {
                return "Could not retrieve services from service manager";
            }
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (it.hasNext()) {
                if (service.getClass().getName().equals(it.next().service.getClassName())) {
                    return null;
                }
            }
            return "Service stopped";
        }

        @Override // defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public final String b() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2((Service) get());
        }
    }

    public static class b extends TuitionPaymentFragmentspecialinlinedviewModeldefault2<Activity> {
        @Override // calculateAdditionalTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public final /* bridge */ /* synthetic */ Context TuitionPaymentFragmentbindingInflater1() {
            return super.TuitionPaymentFragmentbindingInflater1();
        }

        public b(Activity activity) {
            super(activity);
        }

        @Override // defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public final String b() {
            Activity activity = (Activity) get();
            if (activity == null) {
                return "Activity reference null";
            }
            if (activity.isFinishing()) {
                return "Activity finished";
            }
            return null;
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 extends calculateAdditionalTransform<ImageView> {
        public TuitionPaymentFragmentbindingInflater1(ImageView imageView) {
            super(imageView);
        }

        @Override // defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public final String b() {
            ImageView imageView = get();
            if (imageView == null) {
                return "ImageView reference null";
            }
            Context context = imageView.getContext();
            if (context instanceof Service) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Service) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity == null) {
                    return "Activity reference null";
                }
                if (activity.isFinishing()) {
                    return "Activity finished";
                }
            }
            return null;
        }

        @Override // defpackage.lambdarequestClose1androidxcameracoreprocessingSurfaceOutputImpl
        public final Context TuitionPaymentFragmentbindingInflater1() {
            ImageView imageView = get();
            if (imageView == null) {
                return null;
            }
            return imageView.getContext();
        }
    }
}
