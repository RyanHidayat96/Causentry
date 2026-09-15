package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class getCameraProviderInitRetryPolicy implements getSchedulerHandler<Uri, File> {
    private final Context b;

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<File> TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uri2 = uri;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(new setResolutionSelector(uri2), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, uri2));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        Uri uri2 = uri;
        return uri2 != null && FirebaseAnalytics.Param.CONTENT.equals(uri2.getScheme()) && "media".equals(uri2.getAuthority());
    }

    public getCameraProviderInitRetryPolicy(Context context) {
        this.b = context;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements isUseCasesCombinationSupportedByFramework<File> {
        private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {"_data"};
        private final Context TuitionPaymentFragmentbindingInflater1;
        private final Uri TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, Uri uri) {
            this.TuitionPaymentFragmentbindingInflater1 = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = uri;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super File> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Cursor cursorQuery = this.TuitionPaymentFragmentbindingInflater1.getContentResolver().query(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (TextUtils.isEmpty(string)) {
                StringBuilder sb = new StringBuilder("Failed to find file path for: ");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new FileNotFoundException(sb.toString()));
                return;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new File(string));
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<File> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return File.class;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            return DataSource.LOCAL;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getDeviceSurfaceManagerProvider<Uri, File> {
        private final Context b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
            this.b = context;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, File> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new getCameraProviderInitRetryPolicy(this.b);
        }
    }
}
