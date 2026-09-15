package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fromConfig<DataT> implements getSchedulerHandler<Uri, DataT> {
    private final getSchedulerHandler<Integer, DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.getSchedulerHandler
    public final /* bridge */ /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(uri2, i, i2, gettargetrotation);
        }
        if (pathSegments.size() != 2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri2);
            }
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        String str = pathSegments2.get(0);
        int identifier = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getResources().getIdentifier(pathSegments2.get(1), str, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPackageName());
        if (identifier == 0) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri2);
            }
            return null;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(identifier), i, i2, gettargetrotation);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPackageName().equals(uri2.getAuthority());
    }

    fromConfig(Context context, getSchedulerHandler<Integer, DataT> getschedulerhandler) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getschedulerhandler;
    }

    private getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 == 0) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Objects.toString(uri);
                }
                return null;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(i3), i, i2, gettargetrotation);
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri);
            }
            return null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getDeviceSurfaceManagerProvider<Uri, InputStream> {
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new fromConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer.class, InputStream.class));
        }
    }

    public static final class b implements getDeviceSurfaceManagerProvider<Uri, AssetFileDescriptor> {
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new fromConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer.class, AssetFileDescriptor.class));
        }
    }
}
