package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import defpackage.AutoValue_Bitmap2JpegBytes_In;
import defpackage.RotationProvider1;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final Context mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    /* JADX INFO: loaded from: classes5.dex */
    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(Bitmap bitmap, ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }

    public BitmapLoadTask(Context context, Uri uri, Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = context;
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i;
        this.mRequiredHeight = i2;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public BitmapWorkerResult doInBackground(Void... voidArr) {
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z) {
                try {
                    InputStream inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Bounds for bitmap could not be retrieved from the Uri: [");
                            sb.append(this.mInputUri);
                            sb.append("]");
                            BitmapWorkerResult bitmapWorkerResult = new BitmapWorkerResult(new IllegalArgumentException(sb.toString()));
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            return bitmapWorkerResult;
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        z = true;
                    } catch (Throwable th) {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    StringBuilder sb2 = new StringBuilder("Bitmap could not be decoded from the Uri: [");
                    sb2.append(this.mInputUri);
                    sb2.append("]");
                    return new BitmapWorkerResult(new IllegalArgumentException(sb2.toString(), e2));
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeStream == null) {
                StringBuilder sb3 = new StringBuilder("Bitmap could not be decoded from the Uri: [");
                sb3.append(this.mInputUri);
                sb3.append("]");
                return new BitmapWorkerResult(new IllegalArgumentException(sb3.toString()));
            }
            int exifOrientation = BitmapLoadUtils.getExifOrientation(this.mContext, this.mInputUri);
            int iExifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
            int iExifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
            ExifInfo exifInfo = new ExifInfo(exifOrientation, iExifToDegrees, iExifToTranslation);
            Matrix matrix = new Matrix();
            if (iExifToDegrees != 0) {
                matrix.preRotate(iExifToDegrees);
            }
            if (iExifToTranslation != 1) {
                matrix.postScale(iExifToTranslation, 1.0f);
            }
            if (!matrix.isIdentity()) {
                return new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmapDecodeStream, matrix), exifInfo);
            }
            return new BitmapWorkerResult(bitmapDecodeStream, exifInfo);
        } catch (IOException | NullPointerException e3) {
            return new BitmapWorkerResult(e3);
        }
    }

    private void processInputUri() throws Throwable {
        String scheme = this.mInputUri.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            downloadFile(this.mInputUri, this.mOutputUri);
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            copyFile(this.mInputUri, this.mOutputUri);
        } else if (!"file".equals(scheme)) {
            throw new IllegalArgumentException("Invalid Uri scheme".concat(String.valueOf(scheme)));
        }
    }

    private void copyFile(Uri uri, Uri uri2) throws Throwable {
        Throwable th;
        InputStream inputStreamOpenInputStream;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i > 0) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            BitmapLoadUtils.close(fileOutputStream2);
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            this.mInputUri = this.mOutputUri;
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    BitmapLoadUtils.close(fileOutputStream);
                    BitmapLoadUtils.close(inputStreamOpenInputStream);
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = null;
        }
    }

    private void downloadFile(Uri uri, Uri uri2) throws Throwable {
        Throwable th;
        Response responseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Throwable th2;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        RotationProvider1 rotationProvider1 = null;
        try {
            responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(okHttpClient.newCall(new Request.Builder().url(uri.toString()).build()));
            try {
                RotationProvider1 rotationProvider1Source = responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.body().getBodySource();
                try {
                    OutputStream outputStreamOpenOutputStream = this.mContext.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream != null) {
                        surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(outputStreamOpenOutputStream);
                        try {
                            rotationProvider1Source.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            BitmapLoadUtils.close(rotationProvider1Source);
                            BitmapLoadUtils.close(surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            if (responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                BitmapLoadUtils.close(responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.body());
                            }
                            okHttpClient.dispatcher().cancelAll();
                            this.mInputUri = this.mOutputUri;
                            return;
                        } catch (Throwable th3) {
                            th2 = th3;
                            th = th2;
                            rotationProvider1 = rotationProvider1Source;
                            BitmapLoadUtils.close(rotationProvider1);
                            BitmapLoadUtils.close(surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            if (responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                BitmapLoadUtils.close(responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.body());
                            }
                            okHttpClient.dispatcher().cancelAll();
                            this.mInputUri = this.mOutputUri;
                            throw th;
                        }
                    }
                    throw new NullPointerException("OutputStream for given output Uri is null");
                } catch (Throwable th4) {
                    th2 = th4;
                    surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            surfaceViewImplementationApi24ImplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(BitmapWorkerResult bitmapWorkerResult) {
        if (bitmapWorkerResult.mBitmapWorkerException == null) {
            BitmapLoadCallback bitmapLoadCallback = this.mBitmapLoadCallback;
            Bitmap bitmap = bitmapWorkerResult.mBitmapResult;
            ExifInfo exifInfo = bitmapWorkerResult.mExifInfo;
            String path = this.mInputUri.getPath();
            Uri uri = this.mOutputUri;
            bitmapLoadCallback.onBitmapLoaded(bitmap, exifInfo, path, uri == null ? null : uri.getPath());
            return;
        }
        this.mBitmapLoadCallback.onFailure(bitmapWorkerResult.mBitmapWorkerException);
    }
}
