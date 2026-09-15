package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class createExecutor {
    private static final rejectedExecution TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new rejectedExecution();
    private final ContentResolver TuitionPaymentFragmentbindingInflater1;
    private final deinit TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rejectedExecution f884a;
    private final List<ImageHeaderParser> b;

    createExecutor(List<ImageHeaderParser> list, deinit deinitVar, CameraUnavailableException cameraUnavailableException, ContentResolver contentResolver) {
        this(list, TuitionPaymentFragmentspecialinlinedviewModeldefault3, deinitVar, cameraUnavailableException, contentResolver);
    }

    private createExecutor(List<ImageHeaderParser> list, rejectedExecution rejectedexecution, deinit deinitVar, CameraUnavailableException cameraUnavailableException, ContentResolver contentResolver) {
        this.f884a = rejectedexecution;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deinitVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraUnavailableException;
        this.TuitionPaymentFragmentbindingInflater1 = contentResolver;
        this.b = list;
    }

    final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.TuitionPaymentFragmentbindingInflater1.openInputStream(uri);
            return hasCameraTransform.TuitionPaymentFragmentbindingInflater1(this.b, inputStreamOpenInputStream, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (IOException | NullPointerException unused) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Objects.toString(uri);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public final InputStream b(Uri uri) throws Throwable {
        String strTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(uri);
        if (TextUtils.isEmpty(strTuitionPaymentFragmentbindingInflater1)) {
            return null;
        }
        File file = new File(strTuitionPaymentFragmentbindingInflater1);
        if (!file.exists() || 0 >= file.length()) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(file);
        try {
            return this.TuitionPaymentFragmentbindingInflater1.openInputStream(uriFromFile);
        } catch (NullPointerException e2) {
            StringBuilder sb = new StringBuilder("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(uriFromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0039  */
    private String TuitionPaymentFragmentbindingInflater1(Uri uri) throws Throwable {
        Cursor cursorB;
        Cursor cursor = null;
        try {
            cursorB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(uri);
            if (cursorB != null) {
                try {
                    try {
                        if (cursorB.moveToFirst()) {
                            String string = cursorB.getString(0);
                            if (cursorB != null) {
                                cursorB.close();
                            }
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorB;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorB != null) {
                cursorB.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorB = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
