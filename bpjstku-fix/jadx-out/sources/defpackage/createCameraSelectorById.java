package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class createCameraSelectorById {
    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        return false;
    }

    public static final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        Gson gson = new Gson();
        String json = gson.toJson(obj, obj.getClass());
        Type type = new TuitionPaymentFragmentbindingInflater1().getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        try {
            return (Map) gson.fromJson(json, type);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends TypeToken<Map<String, Object>> {
        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    public static final MultipartBody.Part TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file, String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        return MultipartBody.Part.INSTANCE.createFormData(str, file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("image/jpeg")));
    }

    public static final SpannableStringBuilder b(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        Intrinsics.checkNotNullParameter(str, "");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new BulletSpan(30), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri uri, Context context) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(context, "");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        Intrinsics.checkNotNull(inputStreamOpenInputStream);
        File fileCreateTempFile = File.createTempFile("upload_".concat(String.valueOf(Calendar.getInstance().getTimeInMillis())), ".jpg", context.getCacheDir());
        Intrinsics.checkNotNull(fileCreateTempFile);
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            ByteStreamsKt.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
            CloseableKt.closeFinally(fileOutputStream, null);
            return fileCreateTempFile;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            Date date = simpleDateFormat.parse(str);
            String str2 = date != null ? simpleDateFormat2.format(date) : str;
            Intrinsics.checkNotNull(str2);
            return str2;
        } catch (Exception unused) {
            return str;
        }
    }
}
