package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetClass<DataT> implements getSchedulerHandler<Uri, DataT> {
    private final Class<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final getSchedulerHandler<File, DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getSchedulerHandler<Uri, DataT> b;

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uri2 = uri;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1(new setResolutionSelector(uri2), new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, uri2, i, i2, gettargetrotation, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        Uri uri2 = uri;
        return Build.VERSION.SDK_INT >= 29 && uri2 != null && FirebaseAnalytics.Param.CONTENT.equals(uri2.getScheme()) && "media".equals(uri2.getAuthority());
    }

    setTargetClass(Context context, getSchedulerHandler<File, DataT> getschedulerhandler, getSchedulerHandler<Uri, DataT> getschedulerhandler2, Class<DataT> cls) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getschedulerhandler;
        this.b = getschedulerhandler2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cls;
    }

    static final class TuitionPaymentFragmentbindingInflater1<DataT> implements isUseCasesCombinationSupportedByFramework<DataT> {
        private static final String[] TuitionPaymentFragmentbindingInflater1 = {"_data"};
        private volatile isUseCasesCombinationSupportedByFramework<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final Class<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final getTargetRotation f1394a;
        private final int asBinder;
        private volatile boolean asInterface;
        private final getSchedulerHandler<File, DataT> b;
        private final getSchedulerHandler<Uri, DataT> d;
        private final Uri g;
        private final int onTransact;

        TuitionPaymentFragmentbindingInflater1(Context context, getSchedulerHandler<File, DataT> getschedulerhandler, getSchedulerHandler<Uri, DataT> getschedulerhandler2, Uri uri, int i, int i2, getTargetRotation gettargetrotation, Class<DataT> cls) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context.getApplicationContext();
            this.b = getschedulerhandler;
            this.d = getschedulerhandler2;
            this.g = uri;
            this.onTransact = i;
            this.asBinder = i2;
            this.f1394a = gettargetrotation;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cls;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
            isUseCasesCombinationSupportedByFramework<DataT> isusecasescombinationsupportedbyframework = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (isusecasescombinationsupportedbyframework != null) {
                isusecasescombinationsupportedbyframework.b();
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.asInterface = true;
            isUseCasesCombinationSupportedByFramework<DataT> isusecasescombinationsupportedbyframework = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (isusecasescombinationsupportedbyframework != null) {
                isusecasescombinationsupportedbyframework.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            return DataSource.LOCAL;
        }

        private File TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getContentResolver().query(uri, TuitionPaymentFragmentbindingInflater1, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    StringBuilder sb = new StringBuilder("Failed to media store entry for: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder("File path was empty in media store for: ");
                    sb2.append(uri);
                    throw new FileNotFoundException(sb2.toString());
                }
                File file = new File(string);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return file;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super DataT> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<DataT> TuitionPaymentFragmentbindingInflater2;
            try {
                if (Environment.isExternalStorageLegacy()) {
                    TuitionPaymentFragmentbindingInflater2 = this.b.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.g), this.onTransact, this.asBinder, this.f1394a);
                } else {
                    TuitionPaymentFragmentbindingInflater2 = this.d.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.g) : this.g, this.onTransact, this.asBinder, this.f1394a);
                }
                isUseCasesCombinationSupportedByFramework<DataT> isusecasescombinationsupportedbyframework = TuitionPaymentFragmentbindingInflater2 != null ? TuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                if (isusecasescombinationsupportedbyframework == null) {
                    StringBuilder sb = new StringBuilder("Failed to build fetcher for: ");
                    sb.append(this.g);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isusecasescombinationsupportedbyframework;
                if (!this.asInterface) {
                    isusecasescombinationsupportedbyframework.TuitionPaymentFragmentspecialinlinedviewModeldefault2(priority, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    return;
                }
                this.asInterface = true;
                isUseCasesCombinationSupportedByFramework<DataT> isusecasescombinationsupportedbyframework2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (isusecasescombinationsupportedbyframework2 != null) {
                    isusecasescombinationsupportedbyframework2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            } catch (FileNotFoundException e2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1<InputStream> {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1<ParcelFileDescriptor> {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault1<DataT> implements getDeviceSurfaceManagerProvider<Uri, DataT> {
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Class<DataT> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, Class<DataT> cls) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
            this.b = cls;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setTargetClass(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(File.class, this.b), setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri.class, this.b), this.b);
        }
    }
}
