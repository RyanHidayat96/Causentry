package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdacreateExecutor0 implements isUseCasesCombinationSupportedByFramework<InputStream> {
    private InputStream TuitionPaymentFragmentbindingInflater1;
    private final Uri TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final createExecutor b;

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
    }

    public static lambdacreateExecutor0 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, Uri uri, deinit deinitVar) {
        CameraUnavailableException cameraUnavailableException = Glide.b(context).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List<ImageHeaderParser> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Glide.b(context).TuitionPaymentFragmentspecialinlinedviewModeldefault1.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (!listTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
            return new lambdacreateExecutor0(uri, new createExecutor(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, deinitVar, cameraUnavailableException, context.getContentResolver()));
        }
        throw new Registry.NoImageHeaderParserException();
    }

    private lambdacreateExecutor0(Uri uri, createExecutor createexecutor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = uri;
        this.b = createexecutor;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void b() {
        InputStream inputStream = this.TuitionPaymentFragmentbindingInflater1;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return InputStream.class;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final DataSource TuitionPaymentFragmentbindingInflater1() {
        return DataSource.LOCAL;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements deinit {
        private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {"_data"};
        private final ContentResolver TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(ContentResolver contentResolver) {
            this.TuitionPaymentFragmentbindingInflater1 = contentResolver;
        }

        @Override // defpackage.deinit
        public final Cursor b(Uri uri) {
            return this.TuitionPaymentFragmentbindingInflater1.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, TuitionPaymentFragmentspecialinlinedviewModeldefault1, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements deinit {
        private static final String[] TuitionPaymentFragmentbindingInflater1 = {"_data"};
        private final ContentResolver TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(ContentResolver contentResolver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = contentResolver;
        }

        @Override // defpackage.deinit
        public final Cursor b(Uri uri) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, TuitionPaymentFragmentbindingInflater1, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super InputStream> tuitionPaymentFragmentspecialinlinedviewModeldefault1) throws Throwable {
        try {
            InputStream inputStreamB = this.b.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = inputStreamB != null ? this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : -1;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
                inputStreamB = new getErrorListener(inputStreamB, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            this.TuitionPaymentFragmentbindingInflater1 = inputStreamB;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(inputStreamB);
        } catch (FileNotFoundException e2) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }
}
